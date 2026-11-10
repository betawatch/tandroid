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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class zw extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, pg.b, te.b, le0 {
    public static float B4;
    public static boolean y4;
    public boolean A0;
    public FrameLayout A1;
    public boolean A2;
    public boolean A3;
    public int B0;
    public FrameLayout B1;
    public boolean B2;
    public boolean B3;
    public iw C0;
    public mv C1;
    public boolean C2;
    public Long C3;
    public boolean D;
    public org.telegram.ui.Components.qs0 D0;
    public li.w1 D1;
    public tw D2;
    public Drawable D3;
    public boolean E;
    public sv E0;
    public org.telegram.ui.ActionBar.r0 E1;
    public ArrayList E2;
    public org.telegram.ui.Components.f5 E3;
    public boolean F;
    public org.telegram.ui.Components.mr F0;
    public final TextPaint F1;
    public String F2;
    public org.telegram.ui.Cells.o F3;
    public TLRPC.RequestPeerType G;
    public boolean G0;
    public kv G1;
    public CharSequence G2;
    public vv G3;
    public long H;
    public float H0;
    public FrameLayout H1;
    public org.telegram.ui.Components.po0 H2;
    public final lv H3;
    public ValueAnimator I;
    public float I0;
    public kv I1;
    public org.telegram.ui.Components.h41 I2;
    public final lv I3;
    public ValueAnimator J;
    public float J0;
    public FrameLayout J1;
    public final ArrayList J2;
    public f J3;
    public boolean K;
    public bi.ec K0;
    public org.telegram.ui.Components.or K1;
    public boolean K2;
    public ab.b0 K3;
    public boolean L;
    public org.telegram.ui.Components.k60 L0;
    public org.telegram.ui.Components.nr L1;
    public int L2;
    public Drawable L3;
    public boolean M;
    public xv M0;
    public org.telegram.ui.Cells.m M1;
    public int M2;
    public int M3;
    public float N;
    public boolean N0;
    public org.telegram.ui.Cells.b3 N1;
    public boolean N2;
    public boolean N3;
    public boolean O;
    public boolean O0;
    public org.telegram.ui.Cells.ma O1;
    public int O2;
    public boolean O3;
    public int P;
    public long P0;
    public Long P1;
    public int P2;
    public AnimatorSet P3;
    public boolean Q;
    public long Q0;
    public Long Q1;
    public int Q2;
    public boolean Q3;
    public boolean R;
    public long R0;
    public ji.j R1;
    public int R2;
    public pt R3;
    public org.telegram.ui.Components.bc S;
    public int S0;
    public ArrayList S1;
    public int S2;
    public String S3;
    public float T;
    public int T0;
    public boolean T1;
    public int T2;
    public ArrayList T3;
    public boolean U;
    public int U0;
    public org.telegram.ui.ActionBar.u1 U1;
    public int U2;
    public boolean U3;
    public boolean V;
    public boolean V0;
    public boolean V1;
    public int V2;
    public CharSequence V3;
    public boolean W;
    public org.telegram.ui.Components.nb0 W0;
    public boolean W1;
    public boolean W2;
    public boolean W3;
    public ow X;
    public org.telegram.ui.Cells.t2 X0;
    public long X1;
    public int X2;
    public float X3;
    public bg.p0 Y;
    public org.telegram.ui.Cells.t2 Y0;
    public TLObject Y1;
    public zw Y2;
    public boolean Y3;
    public gz0 Z;
    public boolean Z0;
    public int Z1;
    public long Z2;
    public boolean Z3;
    public final int a;
    public org.telegram.ui.Components.u61 a0;
    public boolean a1;
    public int a2;
    public TLRPC.Chat a3;
    public ValueAnimator a4;
    public final te.a b;
    public jg.q0 b0;
    public final ArrayList b1;
    public boolean b2;
    public TLRPC.ChatFull b3;
    public org.telegram.ui.Components.j30 b4;
    public final te.a c;
    public float c0;
    public boolean c1;
    public boolean c2;
    public org.telegram.ui.Components.k9 c3;
    public TLRPC.FileLocation c4;
    public final te.a d;
    public ValueAnimator d0;
    public boolean d1;
    public boolean d2;
    public org.telegram.ui.Components.v8 d3;
    public TLRPC.FileLocation d4;
    public final te.a e;
    public yw[] e0;
    public boolean e1;
    public int e2;
    public long e3;
    public org.telegram.ui.Components.bc e4;
    public final te.a f;
    public org.telegram.ui.ActionBar.r0 f0;
    public org.telegram.ui.ActionBar.y1 f1;
    public boolean f2;
    public boolean f3;
    public int f4;
    public org.telegram.ui.ActionBar.r0 g0;
    public final Paint g1;
    public String g2;
    public boolean g3;
    public int g4;
    public final te.a h;
    public bx h0;
    public ImageView h1;
    public String h2;
    public AnimatorSet h3;
    public int h4;
    public boolean i0;
    public NumberTextView i1;
    public String i2;
    public boolean i3;
    public int i4;
    public org.telegram.ui.ActionBar.r0 j0;
    public final ArrayList j1;
    public boolean j2;
    public boolean j3;
    public int j4;
    public org.telegram.ui.ActionBar.r0 k0;
    public org.telegram.ui.ActionBar.r0 k1;
    public boolean k2;
    public float k3;
    public final dh.g k4;
    public org.telegram.ui.ActionBar.r0 l0;
    public org.telegram.ui.ActionBar.r0 l1;
    public boolean l2;
    public boolean l3;
    public final ri.f l4;
    public org.telegram.ui.ActionBar.r0 m0;
    public org.telegram.ui.ActionBar.r0 m1;
    public boolean m2;
    public int m3;
    public final ri.f m4;
    public final te.a n;
    public org.telegram.ui.Components.ig0 n0;
    public org.telegram.ui.ActionBar.r0 n1;
    public boolean n2;
    public boolean n3;
    public final ri.c n4;
    public org.telegram.ui.ActionBar.z0 o0;
    public org.telegram.ui.ActionBar.z0 o1;
    public String o2;
    public boolean o3;
    public final dh.c o4;
    public fi.m3 p0;
    public org.telegram.ui.ActionBar.z0 p1;
    public String p2;
    public org.telegram.ui.Components.bc p3;
    public final dh.c p4;
    public fi.m3 q0;
    public org.telegram.ui.ActionBar.z0 q1;
    public final org.telegram.messenger.xr q2;
    public final h2.f q3;
    public final dh.c q4;
    public final te.a r;
    public boolean r0;
    public org.telegram.ui.ActionBar.z0 r1;
    public boolean r2;
    public boolean r3;
    public final dh.c r4;
    public final te.a s;
    public boolean s0;
    public org.telegram.ui.ActionBar.z0 s1;
    public boolean s2;
    public boolean s3;
    public xu s4;
    public org.telegram.ui.Components.p00 t0;
    public org.telegram.ui.ActionBar.z0 t1;
    public boolean t2;
    public boolean t3;
    public final ArrayList t4;
    public org.telegram.ui.Components.p00 u0;
    public org.telegram.ui.ActionBar.z0 u1;
    public boolean u2;
    public boolean u3;
    public final RectF u4;
    public fi.d v0;
    public float v1;
    public boolean v2;
    public float v3;
    public final RectF v4;
    public final rh.h w;
    public lh.f w0;
    public float w1;
    public boolean w2;
    public ValueAnimator w3;
    public int w4;
    public boolean x;
    public int x0;
    public AnimatorSet x1;
    public boolean x2;
    public float x3;
    public int x4;
    public int y;
    public final UndoView[] y0;
    public float y1;
    public boolean y2;
    public float y3;
    public pw z0;
    public jh.f z1;
    public boolean z2;
    public float z3;
    public static final boolean[] z4 = new boolean[4];
    public static final org.telegram.ui.Components.qp0 A4 = new org.telegram.ui.Components.qp0(3);

    public zw(Bundle bundle) {
        super(bundle);
        int i7 = Build.VERSION.SDK_INT;
        this.a = i7 >= 31 ? 48 : 0;
        org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.h;
        this.b = new te.a(1, this, wqVar, 350L, false);
        this.c = new te.a(2, this, wqVar, 350L, false);
        this.d = new te.a(3, this, wqVar, 350L, false);
        this.e = new te.a(4, this, wqVar, 350L, false);
        this.f = new te.a(5, this, wqVar, 350L, false);
        this.h = new te.a(6, this, wqVar, 350L, false);
        this.n = new te.a(7, this, wqVar, 350L, false);
        this.r = new te.a(8, this, wqVar, 350L, false);
        this.s = new te.a(9, this, wqVar, 350L, false);
        this.w = new rh.h(new fu(this, 18));
        this.y = -1;
        this.F = true;
        this.K = false;
        this.L = false;
        this.M = false;
        this.Q = true;
        this.c0 = 1.0f;
        this.y0 = new UndoView[2];
        this.b1 = new ArrayList();
        this.g1 = new Paint();
        this.j1 = new ArrayList();
        new RectF();
        new Paint(1);
        this.F1 = new TextPaint(1);
        this.V1 = true;
        this.d2 = true;
        this.j2 = true;
        this.q2 = new org.telegram.messenger.xr();
        this.J2 = new ArrayList();
        this.K2 = true;
        this.q3 = new h2.f((int[]) null);
        this.H3 = new lv(this, 0);
        this.I3 = new lv(this, 1);
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
        ri.c d = this.glassEngine.d(new iu(this, 12));
        this.n4 = d;
        if (i7 >= 31) {
            dh.g gVar = new dh.g(false);
            this.k4 = gVar;
            ri.f fVar = new ri.f(d);
            this.m4 = fVar;
            fVar.f = d;
            fVar.d = gVar;
            fVar.e = -2;
            ri.f fVar2 = new ri.f(null);
            this.l4 = fVar2;
            fVar2.f = d;
            fVar2.d = gVar;
            fVar2.e = -3;
            dh.c cVar = new dh.c(fVar, fVar, fVar);
            this.q4 = cVar;
            cVar.k = true;
            int L = org.telegram.messenger.sc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
            cVar.d = L;
            cVar.e = L;
            dh.c cVar2 = new dh.c(fVar2, fVar2, fVar2);
            this.o4 = cVar2;
            cVar2.k = true;
            int L2 = org.telegram.messenger.g0.L(48.0f);
            cVar2.d = L2;
            cVar2.e = L2;
            this.p4 = new dh.c(fVar2, fVar2, fVar2);
        } else {
            this.k4 = null;
            this.l4 = null;
            this.m4 = null;
            this.o4 = new dh.c(d, d, d);
            this.q4 = new dh.c(d, d, d);
            this.p4 = new dh.c(d, d, d);
        }
        dh.c cVar3 = new dh.c(d, d, d);
        this.r4 = cVar3;
        dh.c cVar4 = this.q4;
        oi.q qVar = this.glassEngine;
        cVar4.j = qVar;
        this.o4.j = qVar;
        this.p4.j = qVar;
        cVar3.j = qVar;
    }

    public static void A0(zw zwVar) {
        if (zwVar.O3) {
            fi.m3 m3Var = zwVar.p0;
            if (m3Var != null) {
                m3Var.f(true);
            }
            di.t6 o4 = org.telegram.messenger.qp.s1(zwVar.currentAccount).P1().o();
            if (o4 != null && o4.a(zwVar.currentAccount, 1)) {
                zwVar.showDialog(new ug.i0(o4.b(), zwVar.currentAccount, zwVar.getParentActivity(), zwVar, null));
                return;
            } else {
                fi.va D = fi.va.D(zwVar.getParentActivity(), zwVar.currentAccount);
                D.y = new gv(zwVar);
                D.Q(null);
                return;
            }
        }
        fi.m3 m3Var2 = zwVar.q0;
        if (m3Var2 != null) {
            if (m3Var2.V) {
                return;
            } else {
                org.telegram.messenger.g0.E2(m3Var2);
            }
        }
        SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(org.telegram.messenger.id.N0("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.m6.uj, 0, new fu(zwVar, 24), null);
        fi.m3 m3Var3 = new fi.m3(zwVar.getParentActivity(), 2);
        m3Var3.s(8.0f);
        m3Var3.d = 8000L;
        m3Var3.k(true);
        m3Var3.r(true);
        m3Var3.h = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(148.0f);
        m3Var3.u(S2);
        m3Var3.o(1.0f, -40.0f);
        m3Var3.j(zwVar.getThemedColor(org.telegram.ui.ActionBar.m6.tj));
        zwVar.q0 = m3Var3;
        m3Var3.setTranslationY((-zwVar.g4) - zwVar.i4);
        ((ViewGroup) zwVar.fragmentView).addView(zwVar.q0, c8.ha.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
        zwVar.q0.w();
    }

    public static void B0(zw zwVar) {
        org.telegram.messenger.qp.s1(zwVar.currentAccount).k4(0L, "PREMIUM_CHRISTMAS");
        zwVar.g5();
        org.telegram.ui.Components.bc G = org.telegram.ui.Components.gc.a0(zwVar).G(R.raw.gift, 4, org.telegram.messenger.id.M0(2131753330, null));
        G.j = 5000;
        G.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void C0(zw zwVar, int i7) {
        dh.g gVar = zwVar.k4;
        RectF rectF = zwVar.v4;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (c8.zc.a(i7, 4)) {
            int L = org.telegram.messenger.g0.L(48.0f);
            int measuredHeight = (zwVar.fragmentView.getMeasuredHeight() - zwVar.g4) - org.telegram.messenger.g0.L(8.0f);
            int L2 = measuredHeight - org.telegram.messenger.g0.L(56.0f);
            int L3 = org.telegram.messenger.g0.L(zwVar.K ? 81.0f : 0.0f) + org.telegram.messenger.g0.L(48.0f) + zwVar.actionBar.getMeasuredHeight();
            pw pwVar = zwVar.z0;
            boolean z9 = false;
            int measuredHeight2 = L3 + ((pwVar == null || pwVar.getVisibility() != 0) ? 0 : zwVar.z0.getMeasuredHeight());
            org.telegram.ui.Components.or orVar = zwVar.K1;
            int sumHeightOfAllVisibleChild = measuredHeight2 + ((orVar == null || orVar.getVisibility() != 0) ? 0 : zwVar.K1.getSumHeightOfAllVisibleChild()) + ((int) zwVar.N);
            int measuredHeight3 = zwVar.actionBar.getMeasuredHeight();
            zwVar.u4.set(0.0f, -L, zwVar.fragmentView.getMeasuredWidth(), org.telegram.messenger.g0.W1(zwVar.b.e, sumHeightOfAllVisibleChild, org.telegram.messenger.g0.L(30.0f) + measuredHeight3 + (zwVar.Z != null ? r9.getMeasuredHeight() : 0)) + L);
            if (zwVar.W) {
                rectF.set(0.0f, L2, zwVar.fragmentView.getMeasuredWidth(), measuredHeight);
                rectF.inset(0.0f, org.telegram.messenger.sc.e(262144) ? 0.0f : -org.telegram.messenger.g0.L(48.0f));
            } else {
                if (zwVar.C1 != null && zwVar.z1 != null) {
                    rectF.set(0.0f, zwVar.fragmentView.getMeasuredHeight() - zwVar.w3(), zwVar.fragmentView.getMeasuredWidth(), zwVar.fragmentView.getMeasuredHeight());
                    rectF.inset(0.0f, org.telegram.messenger.sc.e(262144) ? 0.0f : -org.telegram.messenger.g0.L(48.0f));
                }
                gVar.g(z9 ? 2 : 1, zwVar.t4);
            }
            z9 = true;
            gVar.g(z9 ? 2 : 1, zwVar.t4);
        }
        gVar.e(zwVar.s4, zwVar.fragmentView.getMeasuredWidth(), zwVar.fragmentView.getMeasuredHeight());
    }

    public static void D0(zw zwVar) {
        org.telegram.messenger.qp.s1(zwVar.currentAccount).k4(0L, "BIRTHDAY_SETUP");
        zwVar.g5();
        org.telegram.ui.Components.bc K = org.telegram.ui.Components.gc.a0(zwVar).K(R.raw.chats_infotip, org.telegram.messenger.id.M0(2131753714, null), org.telegram.messenger.id.M0(2131745495, null), new fu(zwVar, 29));
        K.j = 5000;
        K.j();
    }

    public static void E0(zw zwVar) {
        try {
            ((org.telegram.ui.Components.zg0) ((org.telegram.ui.Components.v8) zwVar.N1.h.getImageReceiver().m0).K).H(true);
        } catch (Exception unused) {
        }
        if (zwVar.b4 == null) {
            org.telegram.ui.Components.j30 j30Var = new org.telegram.ui.Components.j30(0, true, true);
            zwVar.b4 = j30Var;
            j30Var.H = true;
            j30Var.a = zwVar;
            j30Var.b = new mw(zwVar);
            zwVar.getMediaDataController().x();
            zwVar.getMessagesController().d3();
            zwVar.getMessagesController().g3(zwVar.getUserConfig().f(), true, zwVar.classGuid);
        }
        TLRPC.User a22 = org.telegram.messenger.qp.s1(zwVar.currentAccount).a2(Long.valueOf(org.telegram.messenger.p10.i(zwVar.currentAccount).e()));
        if (a22 == null) {
            a22 = org.telegram.messenger.p10.i(zwVar.currentAccount).f();
        }
        if (a22 == null) {
            return;
        }
        org.telegram.ui.Components.ci ciVar = zwVar.b4.c;
        if (ciVar != null) {
            ciVar.P0();
        }
        org.telegram.ui.Components.j30 j30Var2 = zwVar.b4;
        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
        j30Var2.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new fu(zwVar, 28), new ou(zwVar, 3), 0);
    }

    public static /* synthetic */ void G0(zw zwVar, float f10, ValueAnimator valueAnimator) {
        zwVar.e0[0].setTranslationY((1.0f - zwVar.v3) * f10);
        zwVar.v3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i7 = 0; i7 < zwVar.actionBar.getChildCount(); i7++) {
            if (zwVar.actionBar.getChildAt(i7).getVisibility() == 0 && zwVar.actionBar.getChildAt(i7) != zwVar.actionBar.getActionMode() && zwVar.actionBar.getChildAt(i7) != zwVar.actionBar.getBackButton()) {
                zwVar.actionBar.getChildAt(i7).setAlpha(1.0f - zwVar.v3);
            }
        }
        zwVar.Q3();
        zwVar.I3();
        View view = zwVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void H0(zw zwVar) {
        org.telegram.ui.Components.jb jbVar = new org.telegram.ui.Components.jb(zwVar.getParentActivity(), zwVar.resourceProvider);
        jbVar.d(R.raw.email_check_inbox, new String[0]);
        jbVar.b.setText(org.telegram.messenger.id.M0(2131742811, null));
        org.telegram.ui.Components.bc.g(zwVar, jbVar, 2750).j();
        try {
            zwVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void I0(zw zwVar, org.telegram.messenger.t1 t1Var) {
        ArrayList arrayList = t1Var.c;
        if (arrayList.size() != 1) {
            wg.f1.l1(0, t1Var);
            return;
        }
        zh.g1 g1Var = new zh.g1(zwVar.getParentActivity(), zwVar.currentAccount, ((TLRPC.User) arrayList.get(0)).id, null, null);
        g1Var.e1(true);
        zwVar.showDialog(g1Var);
    }

    public static void J0(zw zwVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.bc I = org.telegram.ui.Components.gc.a0(zwVar).I(R.raw.gift, org.telegram.messenger.id.M0(2131746856, null), org.telegram.messenger.id.M0(2131746855, null));
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
            zwVar.getMessagesStorage().j2(userFull, false);
        }
        if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            org.telegram.messenger.k5.o(null, 2131743879, org.telegram.ui.Components.gc.a0(zwVar), R.raw.error, 36);
            return;
        }
        if (zwVar.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zwVar.getParentActivity(), zwVar.resourceProvider);
            String M0 = org.telegram.messenger.id.M0(2131746852, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.M0(2131746853, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
            zwVar.showDialog(u1Var);
        }
    }

    public static /* synthetic */ void K0(zw zwVar) {
        org.telegram.messenger.qp.s1(zwVar.currentAccount).k4(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        zwVar.g5();
    }

    public static void X2(zw zwVar, float f10) {
        float f11;
        float f12;
        float i7 = Utilities.i(zwVar.y1 * 2.0f, 1.0f, 0.0f);
        sv svVar = zwVar.E0;
        float f13 = (1.0f - zwVar.v3) * f10 * zwVar.H0;
        float f14 = 1.0f - i7;
        svVar.setAlpha(f13 * f14);
        if (zwVar.K || zwVar.M) {
            float i10 = Utilities.i((-zwVar.N) / org.telegram.messenger.g0.L(81.0f), 1.0f, 0.0f);
            if (zwVar.v3 == 1.0f) {
                i10 = 1.0f;
            }
            float i11 = Utilities.i(i10 / 0.5f, 1.0f, 0.0f);
            zwVar.E0.setClipTop(0);
            if (zwVar.K || !zwVar.M) {
                zwVar.E0.setTranslationY(((zwVar.T / 2.0f) + (Math.max(zwVar.N, -zwVar.g4()) + zwVar.x3)) - org.telegram.messenger.g0.L(8.0f));
                zwVar.E0.l(!zwVar.G3.c(), i10);
                if (zwVar.M) {
                    f11 = 1.0f - i11;
                    zwVar.actionBar.setTranslationY(0.0f);
                } else {
                    f12 = zwVar.H0;
                }
            } else {
                zwVar.E0.setTranslationY((-org.telegram.messenger.g0.L(81.0f)) - org.telegram.messenger.g0.L(8.0f));
                zwVar.E0.setProgressToCollapse(1.0f);
                f12 = zwVar.H0;
            }
            f11 = 1.0f - f12;
            zwVar.actionBar.setTranslationY(0.0f);
        } else {
            if (zwVar.L) {
                zwVar.E0.setTranslationY((Math.max(zwVar.N, -zwVar.g4()) + (-org.telegram.messenger.g0.L(81.0f))) - org.telegram.messenger.g0.L(8.0f));
                zwVar.E0.setProgressToCollapse(1.0f);
                sv svVar2 = zwVar.E0;
                svVar2.setClipTop((int) (org.telegram.messenger.g0.m - svVar2.getY()));
            }
            f11 = 1.0f - zwVar.H0;
            zwVar.actionBar.setTranslationY(0.0f);
        }
        float f15 = f11 * f14;
        if (f15 == 1.0f) {
            zwVar.actionBar.getTitlesContainer().setScaleY(1.0f);
            zwVar.actionBar.getTitlesContainer().setScaleX(1.0f);
            zwVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
            zwVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
            float f16 = 1.0f - zwVar.v3;
            zwVar.actionBar.getTitlesContainer().setAlpha(f16);
            zwVar.actionBar.getTitlesContainer().setVisibility(f16 > 0.0f ? 0 : 4);
            zwVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f16);
            zwVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f16 <= 0.0f ? 4 : 0);
            return;
        }
        zwVar.actionBar.getTitlesContainer().setPivotY(org.telegram.messenger.g0.m);
        zwVar.actionBar.getTitlesContainer().setPivotX(org.telegram.messenger.g0.L(20.0f));
        float f17 = (0.6f * f15) + 0.4f;
        zwVar.actionBar.getTitlesContainer().setScaleY(f17);
        zwVar.actionBar.getTitlesContainer().setScaleX(f17);
        zwVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
        zwVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-org.telegram.messenger.g0.L(30.0f));
        zwVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f17);
        zwVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f17);
        float f18 = (1.0f - zwVar.v3) * f15;
        zwVar.actionBar.getTitlesContainer().setAlpha(f18);
        zwVar.actionBar.getTitlesContainer().setVisibility(f18 > 0.0f ? 0 : 4);
        zwVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f18);
        zwVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f18 <= 0.0f ? 4 : 0);
    }

    public static void Y2(zw zwVar, Canvas canvas, int i7) {
        org.telegram.ui.ActionBar.r4 r4Var;
        if (zwVar.parentLayout == null || zwVar.actionBar == null) {
            return;
        }
        float max = Math.max(zwVar.e.e, zwVar.h4());
        float f10 = 1.0f;
        float f11 = 1.0f - zwVar.y1;
        float f12 = max * f11 * f11;
        if (f12 == 0.0f) {
            return;
        }
        if (-1 >= i7) {
            f10 = 0.0f;
            i7 = -1;
        }
        if (f10 <= 0.0f || f12 <= 0.0f || i7 <= 0 || (r4Var = zwVar.parentLayout) == null) {
            return;
        }
        ((ActionBarLayout) r4Var).p(canvas, (int) (f10 * 255.0f * f12), i7);
    }

    public static /* synthetic */ void Z(zw zwVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        org.telegram.messenger.qp.s1(zwVar.currentAccount).k4(0L, tL_pendingSuggestion.suggestion);
        zwVar.g5();
    }

    public static /* synthetic */ void a0(zw zwVar, float f10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        zwVar.v3 = floatValue;
        zwVar.e0[0].setTranslationY((-f10) * floatValue);
        for (int i7 = 0; i7 < zwVar.actionBar.getChildCount(); i7++) {
            if (zwVar.actionBar.getChildAt(i7).getVisibility() == 0 && zwVar.actionBar.getChildAt(i7) != zwVar.actionBar.getActionMode() && zwVar.actionBar.getChildAt(i7) != zwVar.actionBar.getBackButton()) {
                zwVar.actionBar.getChildAt(i7).setAlpha(1.0f - zwVar.v3);
            }
        }
        View view = zwVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        zwVar.Q3();
        zwVar.I3();
    }

    public static void b0(zw zwVar) {
        ArrayList arrayList = zwVar.J2;
        org.telegram.ui.ActionBar.r4 r4Var = zwVar.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).y()) {
            zwVar.finishPreviewFragment();
            return;
        }
        if (zwVar.S0 != 10) {
            if (org.telegram.messenger.qp.s1(zwVar.currentAccount).v2()) {
                b.b(zwVar.currentAccount);
                return;
            } else {
                zwVar.presentFragment(new ContactsActivity(a8.p0.k("destroyAfterSelect", true)));
                return;
            }
        }
        if (zwVar.D2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            arrayList2.add(org.telegram.messenger.xr.a(((Long) arrayList.get(i7)).longValue(), 0L));
        }
        zwVar.D2.y(zwVar, arrayList2, null, false, zwVar.K2, zwVar.L2, zwVar.M2, null);
    }

    public static /* synthetic */ void c0(zw zwVar) {
        org.telegram.messenger.qp.s1(zwVar.currentAccount).k4(0L, "USERPIC_SETUP");
        zwVar.g5();
    }

    public static org.telegram.ui.Cells.t2 c4(yw ywVar) {
        vw vwVar = ywVar.a;
        for (int i7 = 0; i7 < vwVar.getChildCount(); i7++) {
            View childAt = vwVar.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.t2) {
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) childAt;
                if (t2Var.V()) {
                    return t2Var;
                }
            }
        }
        return null;
    }

    public static void d0(zw zwVar) {
        PasskeysActivity.f0(zwVar.currentAccount, zwVar.getParentActivity(), zwVar.resourceProvider, true);
    }

    public static /* synthetic */ void e0(zw zwVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", org.telegram.messenger.p10.i(zwVar.currentAccount).e());
        zwVar.presentFragment(new cn(bundle));
    }

    public static /* synthetic */ void f0(zw zwVar, TL_account.TL_birthday tL_birthday) {
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull b22 = zwVar.getMessagesController().b2(zwVar.getUserConfig().e());
        TL_account.TL_birthday tL_birthday2 = b22 != null ? b22.birthday : null;
        if (b22 != null) {
            b22.flags2 |= 32;
            b22.birthday = tL_birthday;
        }
        zwVar.getMessagesController().m2();
        zwVar.getConnectionsManager().sendRequest(updatebirthday, new z9(zwVar, b22, tL_birthday2, 8), 1024);
        org.telegram.messenger.qp.s1(zwVar.currentAccount).k4(0L, "BIRTHDAY_SETUP");
        zwVar.g5();
    }

    public static void g0(zw zwVar, yw ywVar, View view, int i7) {
        int i10;
        if (view instanceof org.telegram.ui.Cells.x3) {
            return;
        }
        boolean z9 = view instanceof org.telegram.ui.Cells.t2;
        if (z9) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
            if (t2Var.n2) {
                zwVar.Z4(t2Var.getDialogId(), view);
                return;
            }
        }
        if (zwVar.U3()) {
            zwVar.A4(view, i7, 0.0f, ywVar.d);
            return;
        }
        int i11 = zwVar.S0;
        if (i11 == 15 && (view instanceof org.telegram.ui.Cells.m8)) {
            ywVar.d.L();
            return;
        }
        int i12 = 0;
        if ((i11 == 11 || i11 == 13) && i7 == 1) {
            Bundle k10 = a8.p0.k("forImport", true);
            k10.putLongArray("result", new long[]{zwVar.getUserConfig().e()});
            k10.putInt("chatType", 4);
            String string = zwVar.arguments.getString("importTitle");
            if (string != null) {
                k10.putString("title", string);
            }
            g50 g50Var = new g50(k10);
            g50Var.Y = new gv(zwVar);
            zwVar.presentFragment(g50Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.b3) && ((i10 = ywVar.s) == 7 || i10 == 8)) {
            jg.l lVar = (jg.l) ywVar.d.M.get(0);
            TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = (lVar == null || lVar.a != 17) ? null : lVar.i;
            if (tL_chatlists_chatlistUpdates != null) {
                org.telegram.messenger.vo voVar = zwVar.getMessagesController().M[ywVar.s - 7];
                if (voVar != null) {
                    int i13 = voVar.a;
                    org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(zwVar, false);
                    vzVar.T1 = -1;
                    vzVar.X1 = "";
                    vzVar.Y1 = new ArrayList();
                    vzVar.a2 = "";
                    vzVar.c2 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    vzVar.d2 = arrayList;
                    vzVar.u2 = -1;
                    vzVar.x2 = -5;
                    vzVar.T1 = i13;
                    vzVar.V1 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    vzVar.b2 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList arrayList2 = zwVar.getMessagesController().P0;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i12 >= arrayList2.size()) {
                                break;
                            }
                            if (((org.telegram.messenger.vo) arrayList2.get(i12)).a == i13) {
                                vzVar.X1 = ((org.telegram.messenger.vo) arrayList2.get(i12)).b;
                                break;
                            }
                            i12++;
                        }
                    }
                    vzVar.f1();
                    zwVar.showDialog(vzVar);
                    return;
                }
                return;
            }
        } else if (z9 && !zwVar.actionBar.x() && !zwVar.G3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.t2) view).Y1;
            org.telegram.messenger.g0.P.set(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), imageReceiver.A());
        }
        zwVar.z4(view, i7, ywVar.d);
    }

    public static /* synthetic */ void h0(zw zwVar) {
        zwVar.presentFragment(new PrivacySettingsActivity());
        org.telegram.messenger.g0.k3(zwVar.parentLayout, "newChatsRow");
    }

    public static /* synthetic */ void i0(zw zwVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.qp.s1(zwVar.currentAccount).o1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(zwVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new z9(zwVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void j0(zw zwVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(launchActivity, zwVar.currentAccount, tL_attachMenuBot, null, true);
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(zwVar.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = b02.b;
        if (tL_attachMenuBots != null) {
            long j3 = b02.a;
            b02.getMessagesStorage().a.c(new org.telegram.messenger.hk(b02.e, 2, j3, b02, tL_attachMenuBots));
        }
    }

    public static void j1(zw zwVar, boolean z9) {
        if (zwVar.e0 == null || zwVar.N3 == z9) {
            return;
        }
        zwVar.N3 = z9;
        int i7 = 0;
        while (true) {
            yw[] ywVarArr = zwVar.e0;
            if (i7 >= ywVarArr.length) {
                return;
            }
            if (z9) {
                ywVarArr[i7].a.setScrollbarFadingEnabled(false);
            }
            zwVar.e0[i7].a.setVerticalScrollBarEnabled(z9);
            if (z9) {
                zwVar.e0[i7].a.setScrollbarFadingEnabled(true);
            }
            i7++;
        }
    }

    public static void k0(zw zwVar) {
        org.telegram.messenger.qp.s1(zwVar.currentAccount).e7.edit().putBoolean("storyhint", false).commit();
    }

    public static /* synthetic */ void l0(zw zwVar) {
        if (zwVar.b4.g()) {
            org.telegram.messenger.qp.s1(zwVar.currentAccount).k4(0L, "USERPIC_SETUP");
            zwVar.g5();
        }
    }

    public static /* synthetic */ void n0(zw zwVar) {
        org.telegram.messenger.qp.s1(zwVar.currentAccount).k4(0L, "PREMIUM_GRACE");
        zwVar.g5();
    }

    public static /* synthetic */ void o0(zw zwVar) {
        org.telegram.messenger.qp.s1(zwVar.currentAccount).k4(0L, "SETUP_PASSKEY");
        zwVar.g5();
    }

    public static void p0(zw zwVar, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        try {
            u1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (tLObject == null) {
            org.telegram.ui.Components.u4.c0(zwVar.currentAccount, tL_error, zwVar, tL_messages_checkHistoryImportPeer, new Object[0]);
            zwVar.getNotificationCenter().k(org.telegram.messenger.qs.v1, Long.valueOf(j3), tL_messages_checkHistoryImportPeer, tL_error);
            return;
        }
        zwVar.arguments.getString("importTitle");
        String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
        bi.r3 r3Var = new bi.r3(zwVar, j3, 25);
        Pattern pattern = org.telegram.ui.Components.u4.a;
        if (zwVar.getParentActivity() != null) {
            if (chat == null && user == null) {
                return;
            }
            int currentAccount = zwVar.getCurrentAccount();
            Activity parentActivity = zwVar.getParentActivity();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            long e11 = org.telegram.messenger.p10.i(currentAccount).e();
            TextView textView = new TextView(parentActivity);
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.j5, null);
            textView.setTextSize(1, 16.0f);
            textView.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            alertDialog$Builder.o(frameLayout);
            org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
            v8Var.u(org.telegram.messenger.g0.L(12.0f));
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(parentActivity);
            k9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
            frameLayout.addView(k9Var, c8.ha.d(40, 40.0f, (org.telegram.messenger.id.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.m6.E8, null, 1, 20.0f);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 16);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(org.telegram.messenger.id.M0(2131749245, null));
            boolean z9 = org.telegram.messenger.id.a0;
            frameLayout.addView(textView2, c8.ha.d(-1, -2.0f, (z9 ? 5 : 3) | 48, z9 ? 21 : 76, 11.0f, z9 ? 76 : 21, 0.0f));
            frameLayout.addView(textView, c8.ha.d(-2, -2.0f, (org.telegram.messenger.id.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (user == null) {
                v8Var.q(chat);
                k9Var.e(chat, v8Var);
            } else if (org.telegram.messenger.t10.z(user)) {
                v8Var.p = 0.8f;
                v8Var.g(12);
                k9Var.j(null, null, v8Var, user);
            } else if (user.id == e11) {
                v8Var.p = 0.8f;
                v8Var.g(1);
                k9Var.j(null, null, v8Var, user);
            } else {
                v8Var.p = 1.0f;
                v8Var.r(user);
                k9Var.e(user, v8Var);
            }
            textView.setText(org.telegram.messenger.g0.X2(str));
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131749265, null), new org.telegram.ui.Components.t(r3Var, 3));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            zwVar.showDialog(alertDialog$Builder.a);
        }
    }

    public static void p4(cn cnVar, org.telegram.messenger.ij ijVar) {
        if (ijVar == null || !ijVar.r2()) {
            return;
        }
        try {
            CharSequence charSequence = !TextUtils.isEmpty(ijVar.z) ? ijVar.z : ijVar.v;
            CharSequence x12 = org.telegram.messenger.g0.x1(charSequence, ijVar.Y1, null);
            if (x12 instanceof SpannableStringBuilder) {
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) x12;
                org.telegram.ui.Components.xz[] xzVarArr = (org.telegram.ui.Components.xz[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.xz.class);
                if (xzVarArr.length > 0) {
                    int spanStart = spannableStringBuilder.getSpanStart(xzVarArr[0]);
                    int spanEnd = spannableStringBuilder.getSpanEnd(xzVarArr[0]);
                    for (int i7 = 1; i7 < xzVarArr.length; i7++) {
                        int spanStart2 = spannableStringBuilder.getSpanStart(xzVarArr[i7]);
                        int spanStart3 = spannableStringBuilder.getSpanStart(xzVarArr[i7]);
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
                    cnVar.Rb(ijVar.L1(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public static void q0(zw zwVar, int i7) {
        Object obj;
        org.telegram.ui.Components.tl0 tl0Var = zwVar.C0.q0;
        if (i7 < tl0Var.Z || i7 >= tl0Var.a0) {
            obj = Boolean.FALSE;
        } else {
            org.telegram.ui.Components.x31 G = tl0Var.G(i7);
            obj = G != null ? G.G : null;
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zwVar.getParentActivity(), zwVar.resourceProvider);
            String M0 = org.telegram.messenger.id.M0(2131754180, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.a0(null, null, 2131754179, "\"" + org.telegram.messenger.t10.p(user) + "\"");
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746321, null), new su(0, zwVar, user));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
        }
    }

    public static void r0(zw zwVar, int i7, ArrayList arrayList, boolean z9, HashSet hashSet) {
        if (i7 != 102) {
            zwVar.D4(arrayList, i7, false, false, null);
            return;
        }
        zwVar.getMessagesController().s0 = true;
        zwVar.D4(arrayList, i7, false, false, z9 ? hashSet : null);
        org.telegram.messenger.qp messagesController = zwVar.getMessagesController();
        messagesController.s0 = false;
        messagesController.getNotificationCenter().k(org.telegram.messenger.qs.s, Boolean.TRUE);
        zwVar.getMessagesController().J(zwVar.X2);
        int i10 = zwVar.X2;
        if (i10 == 0 || zwVar.d4(zwVar.currentAccount, zwVar.e0[0].s, i10, false).size() != 0) {
            return;
        }
        zwVar.e0[0].a.setEmptyView(null);
        zwVar.e0[0].x.setVisibility(4);
        zwVar.finishFragment();
    }

    public static void t0(zw zwVar, int i7, org.telegram.ui.Components.k60 k60Var) {
        if (zwVar.currentAccount == i7) {
            return;
        }
        k60Var.u();
        if (zwVar.getParentActivity() == null) {
            return;
        }
        tw twVar = zwVar.D2;
        LaunchActivity launchActivity = (LaunchActivity) zwVar.getParentActivity();
        ArrayList arrayList = zwVar.E2;
        String str = zwVar.F2;
        CharSequence charSequence = zwVar.G2;
        mv mvVar = zwVar.C1;
        CharSequence fieldText = mvVar != null ? mvVar.getFieldText() : null;
        launchActivity.O0(i7);
        zw zwVar2 = new zw(zwVar.arguments);
        zwVar2.D2 = twVar;
        if (arrayList == null || arrayList.isEmpty()) {
            if (str != null) {
                zwVar2.Q4(fieldText, str);
            } else if (charSequence != null) {
                if (charSequence.length() == 0) {
                    zwVar2.G2 = null;
                } else {
                    zwVar2.G2 = charSequence;
                    zwVar2.F2 = null;
                    zwVar2.E2 = null;
                    if (zwVar2.C1 != null) {
                        zwVar2.v3(fieldText);
                    } else {
                        zwVar2.V3 = fieldText;
                    }
                }
            }
        } else if (arrayList.isEmpty()) {
            zwVar2.E2 = null;
        } else {
            zwVar2.E2 = arrayList;
            zwVar2.F2 = null;
            zwVar2.N2 = false;
            if (zwVar2.C1 != null) {
                zwVar2.v3(fieldText);
            } else {
                zwVar2.V3 = fieldText;
            }
        }
        launchActivity.u0(zwVar2, false, true);
    }

    public static /* synthetic */ void u0(zw zwVar) {
        org.telegram.messenger.qp.s1(zwVar.currentAccount).k4(0L, zwVar.B3 ? "PREMIUM_UPGRADE" : "PREMIUM_ANNUAL");
        zwVar.g5();
    }

    public static void u1(zw zwVar, yw ywVar, float f10) {
        if (zwVar.T == f10) {
            return;
        }
        zwVar.T = f10;
        if (f10 == 0.0f) {
            zwVar.U = false;
        }
        zwVar.E0.setOverscroll(f10);
        ywVar.a.setViewsOffset(f10);
        ywVar.a.setOverScrollMode(f10 != 0.0f ? 2 : 0);
        zwVar.fragmentView.invalidate();
        if (f10 <= org.telegram.messenger.g0.L(90.0f) || zwVar.U) {
            return;
        }
        sv svVar = zwVar.E0;
        ValueAnimator valueAnimator = svVar.H0;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            svVar.i(svVar.p0, true);
            zwVar.U = true;
            zwVar.getOrCreateStoryViewer().x(new fu(zwVar, 4));
        }
    }

    public static void u4(org.telegram.messenger.c cVar) {
        int i7 = cVar.a;
        boolean[] zArr = z4;
        if (zArr[i7]) {
            return;
        }
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        s12.X2();
        s12.U2(0, 0, 100, true, null);
        if (s12.s.isEmpty() && !TextUtils.isEmpty(s12.R3)) {
            TLRPC.TL_help_getRecentMeUrls tL_help_getRecentMeUrls = new TLRPC.TL_help_getRecentMeUrls();
            tL_help_getRecentMeUrls.referer = s12.R3;
            s12.getConnectionsManager().sendRequest(tL_help_getRecentMeUrls, new org.telegram.messenger.rj(s12, 4));
        }
        s12.g3(org.telegram.messenger.p10.i(i7).f(), false, 0);
        org.telegram.messenger.g5.r(i7).f();
        org.telegram.messenger.ui.b0(i7).u(false);
        org.telegram.messenger.g0.i3(new dh(cVar, 18), 200L);
        Iterator it = s12.c4.iterator();
        while (it.hasNext()) {
            org.telegram.messenger.ui.b0(i7).c1((String) it.next(), true, true);
        }
        zArr[i7] = true;
    }

    public static void v0(zw zwVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
            ad1.a(zwVar.getParentActivity(), new y(zwVar, tL_attachMenuBot, launchActivity, 7), null);
        } else {
            LaunchActivity.G0(launchActivity, zwVar.currentAccount, tL_attachMenuBot, null, true);
        }
    }

    public static boolean v1(zw zwVar, yw ywVar) {
        if (zwVar.G3.c()) {
            return false;
        }
        int i7 = (int) (-zwVar.N);
        int f42 = zwVar.f4();
        int g42 = zwVar.g4();
        if (i7 == 0 || i7 == f42 || i7 == g42 || !ywVar.a.canScrollVertically(-1)) {
            return false;
        }
        if (g42 >= i7 || i7 >= f42) {
            if ((zwVar.v3 != 1.0f ? Utilities.i((-zwVar.N) / org.telegram.messenger.g0.L(81.0f), 1.0f, 0.0f) : 1.0f) < zwVar.E0.B0) {
                ywVar.b.x(-i7);
                return true;
            }
            ywVar.b.x(g42 - i7);
            return true;
        }
        int L = org.telegram.messenger.g0.L(48.0f);
        int i10 = i7 - g42;
        if (i10 < L / 2) {
            ywVar.b.x(-i10);
            return true;
        }
        ywVar.b.x(L - i10);
        return true;
    }

    public static void w0(zw zwVar) {
        b.c(zwVar.currentAccount, zwVar.getParentActivity(), zwVar.getResourceProvider());
    }

    public static String w2(zw zwVar) {
        ArrayList arrayList = zwVar.J2;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() >= 3) {
            return org.telegram.messenger.id.G(arrayList.size(), "ShareSendToMany", new Object[0]);
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            long longValue = ((Long) obj).longValue();
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            if (longValue == zwVar.getUserConfig().e()) {
                sb2.append(org.telegram.messenger.id.M0(2131745901, null));
            } else {
                sb2.append(arrayList.size() == 1 ? org.telegram.messenger.m5.l(zwVar.currentAccount, longValue) : org.telegram.messenger.m5.s(zwVar.currentAccount, longValue));
            }
        }
        return org.telegram.messenger.id.a0(null, null, 2131745439, sb2.toString());
    }

    public static void x0(final int i7, final long j3, TLRPC.Chat chat, final zw zwVar, final boolean z9, final boolean z10) {
        final TLRPC.Chat chat2;
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        zwVar.n4(false);
        if (i7 == 103 && org.telegram.messenger.t3.T(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || org.telegram.messenger.t3.t0(chat2)) {
                zwVar.getMessagesController().X(2, j3, z10);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i7 == 102 && (i12 = zwVar.X2) != 0 && zwVar.d4(zwVar.currentAccount, zwVar.e0[0].s, i12, false).size() == 1) {
            zwVar.e0[0].x.setVisibility(4);
        }
        int i13 = -1;
        if (i7 == 102) {
            zwVar.M4(true, true);
            if (zwVar.S1 != null) {
                i11 = 0;
                while (i11 < zwVar.S1.size()) {
                    if (((TLRPC.Dialog) zwVar.S1.get(i11)).id == j3) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            i11 = -1;
            zwVar.z3();
            i10 = i11;
        } else {
            i10 = -1;
        }
        UndoView k42 = zwVar.k4();
        if (k42 != null) {
            k42.j(i7 == 103 ? 0 : z10 ? 1 : 95, j3, new Runnable() { // from class: org.telegram.ui.wu
                @Override // java.lang.Runnable
                public final void run() {
                    zwVar.C4(i7, j3, chat2, z9, z10);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(zwVar.d4(zwVar.currentAccount, zwVar.e0[0].s, zwVar.X2, false));
        int i14 = 0;
        while (true) {
            if (i14 >= arrayList2.size()) {
                break;
            }
            if (((TLRPC.Dialog) arrayList2.get(i14)).id == j3) {
                i13 = i14;
                break;
            }
            i14++;
        }
        if (i7 == 102) {
            if (i10 < 0 || i13 >= 0 || (arrayList = zwVar.S1) == null) {
                zwVar.M4(false, true);
                return;
            }
            arrayList.remove(i10);
            zwVar.e0[0].y.D();
            zwVar.e0[0].q(true);
        }
    }

    public static void y0(zw zwVar) {
        org.telegram.messenger.v1 a10 = org.telegram.messenger.v1.a(zwVar.currentAccount);
        int i7 = a10.a;
        Set<String> set = a10.d;
        org.telegram.messenger.t1 t1Var = a10.c;
        if (t1Var != null && !set.contains(t1Var.a)) {
            set.add(a10.c.a);
            SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(i7).e7.edit();
            edit.putStringSet("bday_hidden", set);
            edit.apply();
            org.telegram.messenger.qs.f(i7).k(org.telegram.messenger.qs.g5, new Object[0]);
        }
        org.telegram.messenger.qp.s1(zwVar.currentAccount).k4(0L, "BIRTHDAY_CONTACTS_TODAY");
        zwVar.g5();
        org.telegram.ui.Components.bc G = org.telegram.ui.Components.gc.a0(zwVar).G(R.raw.gift, 4, org.telegram.messenger.id.M0(2131753330, null));
        G.j = 5000;
        G.j();
    }

    public static /* synthetic */ void z0(zw zwVar) {
        org.telegram.messenger.qp.s1(zwVar.currentAccount).k4(0L, "PREMIUM_RESTORE");
        zwVar.g5();
    }

    public final boolean A3(long j3) {
        int i7;
        int i10 = this.S0;
        if (i10 == 15 || i10 == 16 || this.i2 != null || !this.t2) {
            return true;
        }
        if (!org.telegram.messenger.m5.z(j3)) {
            if (!org.telegram.messenger.m5.C(j3)) {
                return true;
            }
            if (this.U0 == 0 && !this.V0) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = org.telegram.messenger.id.M0(2131745596, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            int i11 = this.U0;
            if (i11 == 3) {
                u1Var.T = org.telegram.messenger.id.M0(2131744090, null);
            } else if (i11 != 0) {
                u1Var.T = org.telegram.messenger.id.M0(2131747176, null);
            } else {
                u1Var.T = org.telegram.messenger.id.M0(2131749104, null);
            }
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131747831, null), null);
            showDialog(u1Var);
            return false;
        }
        long j10 = -j3;
        TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(j10));
        if (!org.telegram.messenger.t3.T(M02) || M02.megagroup) {
            return true;
        }
        if (!this.r2) {
            TLRPC.Chat M03 = org.telegram.messenger.qp.s1(this.currentAccount).M0(Long.valueOf(j10));
            if ((org.telegram.messenger.t3.n(M03) || M03.megagroup) && (i7 = this.U0) != 2 && i7 != 3) {
                return true;
            }
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
        String M04 = org.telegram.messenger.id.M0(2131745596, null);
        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
        u1Var2.R = M04;
        int i12 = this.U0;
        if (i12 == 3) {
            u1Var2.T = org.telegram.messenger.id.M0(2131744091, null);
        } else if (i12 == 2) {
            u1Var2.T = org.telegram.messenger.id.M0(2131746587, null);
        } else {
            u1Var2.T = org.telegram.messenger.id.M0(2131752440, null);
        }
        alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131747831, null), null);
        showDialog(u1Var2);
        return false;
    }

    public final boolean A4(View view, int i7, float f10, org.telegram.ui.Components.oj0 oj0Var) {
        org.telegram.ui.Components.yl0 yl0Var;
        org.telegram.ui.Components.yl0 yl0Var2;
        long F;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.b3) && oj0Var.d(i7) != 21) {
            if (!this.actionBar.x() && !org.telegram.messenger.g0.Q1() && !this.m2 && (view instanceof org.telegram.ui.Cells.t2)) {
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                if (!getMessagesController().t2(t2Var.getDialogId()) && !this.G3.c() && t2Var.Z(f10)) {
                    return T4(t2Var);
                }
            }
            vv vvVar = this.G3;
            if (vvVar == null || !vvVar.c()) {
                iw iwVar = this.C0;
                if (iwVar != null && oj0Var == (yl0Var2 = iwVar.d0)) {
                    Object I = yl0Var2.I(i7);
                    if (!this.C0.d0.N) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String M0 = org.telegram.messenger.id.M0(2131752054, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.R = M0;
                        if (I instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) I;
                            if (chat.monoforum) {
                                u1Var.T = org.telegram.messenger.id.a0("ClearSearchSingleChatAlertText", null, 2131752053, qg.d.i(this.currentAccount, chat, false));
                            } else {
                                u1Var.T = org.telegram.messenger.id.a0("ClearSearchSingleChatAlertText", null, 2131752053, chat.title);
                            }
                            F = -chat.id;
                        } else if (I instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) I;
                            if (user.id == getUserConfig().n) {
                                u1Var.T = org.telegram.messenger.id.a0("ClearSearchSingleChatAlertText", null, 2131752053, org.telegram.messenger.id.M0(2131745901, null));
                            } else {
                                u1Var.T = org.telegram.messenger.id.a0("ClearSearchSingleUserAlertText", null, 2131752051, org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
                            }
                            F = user.id;
                        } else if (I instanceof TLRPC.EncryptedChat) {
                            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(((TLRPC.EncryptedChat) I).user_id));
                            u1Var.T = org.telegram.messenger.id.a0("ClearSearchSingleUserAlertText", null, 2131752051, org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                            F = org.telegram.messenger.m5.F(r14.id);
                        }
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752055, null), new di.c1(this, F, 7));
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        showDialog(u1Var);
                        TextView textView = (TextView) u1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, getResourceProvider());
                        }
                        return true;
                    }
                }
                iw iwVar2 = this.C0;
                if (iwVar2 == null || oj0Var != (yl0Var = iwVar2.d0)) {
                    Object J = ((jg.n) oj0Var).J(i7);
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
                                bundle.putBoolean("quote", this.O0);
                                bundle.putBoolean("reply_to", this.N0);
                                z91 z91Var = new z91(bundle);
                                z91Var.L0 = this;
                                presentFragment(z91Var);
                                return false;
                            }
                        } else {
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                y4(view);
                                return false;
                            }
                            if (!this.actionBar.x() || !s4(dialog)) {
                                Y4(dialog.id, view);
                                return true;
                            }
                        }
                    }
                } else {
                    if (this.m2) {
                        z4(view, i7, oj0Var);
                        return false;
                    }
                    long dialogId = (!(view instanceof org.telegram.ui.Cells.g6) || yl0Var.N(i7)) ? 0L : ((org.telegram.ui.Cells.g6) view).getDialogId();
                    if (dialogId != 0) {
                        Y4(dialogId, view);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.le0
    public final ri.f B() {
        return this.m4;
    }

    public final void B3(boolean z9) {
        ji.j jVar;
        TLRPC.ChatFull chatFull;
        org.telegram.ui.Components.or orVar = this.K1;
        if (orVar == null || (jVar = this.R1) == null || (chatFull = this.b3) == null) {
            return;
        }
        orVar.i(jVar, (this.Z2 == 0 || chatFull.requests_pending <= 0 || this.b.f) ? false : true, z9);
        this.R1.setTitle(org.telegram.messenger.id.G(this.b3.requests_pending, "CommunityPendingRequestsRow", new Object[0]));
    }

    public final void B4(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i7 = 0; i7 < 4; i7++) {
            if (org.telegram.messenger.p10.i(i7).p()) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        Collections.sort(arrayList, new pe(25));
        org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(this, view);
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
                boolean z9 = this.currentAccount == intValue;
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                int i11 = org.telegram.ui.ActionBar.m6.i6;
                Drawable a02 = org.telegram.ui.ActionBar.m6.a0(getThemedColor(i11), 0, 0);
                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
                org.telegram.ui.ActionBar.h6 resourceProvider = getResourceProvider();
                linearLayout.setBackground(a02);
                org.telegram.ui.ActionBar.t6.j(linearLayout, a02, null, M, resourceProvider);
                TLRPC.User f10 = org.telegram.messenger.p10.i(intValue).f();
                org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
                v8Var.r(f10);
                fi.r3 r3Var = new fi.r3(this, getParentActivity(), z9);
                linearLayout.addView(r3Var, c8.ha.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(getParentActivity());
                if (z9) {
                    k9Var.setScaleX(0.833f);
                    k9Var.setScaleY(0.833f);
                }
                k9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
                k9Var.getImageReceiver().d = intValue;
                k9Var.e(f10, v8Var);
                r3Var.addView(k9Var, c8.ha.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.j5, getResourceProvider());
                textView.setText(org.telegram.messenger.t10.p(f10));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, c8.ha.q(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new bi.la(this, intValue, H, 14));
                H.r(linearLayout, c8.ha.o(org.telegram.messenger.qs.G3, 48));
            }
        }
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(24.0f), getThemedColor(org.telegram.ui.ActionBar.m6.d6));
        d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.m6.r1(0.15f, -16777216));
        H.z.set(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
        H.W(d02);
        H.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
        H.V(5);
        H.Z();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e6, code lost:
    
        if (getMessagesController().b2.get(r14.X2) != false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0111 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C3(yw ywVar) {
        final boolean z9;
        final boolean z10;
        final boolean z11;
        final boolean z12;
        int i7;
        int L0 = ywVar.c.L0();
        int N0 = ywVar.c.N0();
        if (this.i3 || this.n3) {
            return;
        }
        pw pwVar = this.z0;
        if (pwVar != null && pwVar.getVisibility() == 0 && this.z0.O) {
            return;
        }
        int abs = Math.abs(N0 - L0) + 1;
        if (N0 != -1) {
            v4.d1 K = ywVar.a.K(N0);
            boolean z13 = K != null && K.f == 11;
            this.c2 = z13;
            if (z13) {
                o4(false);
            }
        } else {
            this.c2 = false;
        }
        int i10 = ywVar.s;
        if (i10 == 7 || i10 == 8) {
            ArrayList T0 = getMessagesController().T0();
            int i11 = ywVar.h;
            if (i11 >= 0 && i11 < T0.size()) {
                int i12 = ((org.telegram.messenger.vo) T0.get(ywVar.h)).g;
                int i13 = org.telegram.messenger.qp.C8;
                if ((i12 & 128) == 0 && ((abs > 0 && N0 >= d4(this.currentAccount, ywVar.s, 1, this.T1).size() - 10) || (abs == 0 && !getMessagesController().b2.get(1)))) {
                    boolean z14 = getMessagesController().b2.get(1);
                    boolean z15 = !z14;
                    z9 = (z14 && getMessagesController().c2.get(1)) ? false : true;
                    z10 = z15;
                    if (abs > 0 || N0 < d4(this.currentAccount, ywVar.s, this.X2, this.T1).size() - 10) {
                        if (abs == 0 && ((i7 = ywVar.s) == 7 || i7 == 8)) {
                        }
                        z11 = false;
                        z12 = false;
                        if (!z11 || z9) {
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.yu
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zw zwVar = zw.this;
                                    if (z11) {
                                        zwVar.getMessagesController().U2(zwVar.X2, -1, 100, z12, null);
                                    }
                                    if (z9) {
                                        zwVar.getMessagesController().U2(1, -1, 100, z10, null);
                                    }
                                }
                            });
                        }
                        return;
                    }
                    boolean z16 = getMessagesController().b2.get(this.X2);
                    boolean z17 = !z16;
                    if (z16) {
                        if (getMessagesController().c2.get(this.X2)) {
                            z12 = z17;
                            z11 = false;
                            if (z11) {
                            }
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.yu
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zw zwVar = zw.this;
                                    if (z11) {
                                        zwVar.getMessagesController().U2(zwVar.X2, -1, 100, z12, null);
                                    }
                                    if (z9) {
                                        zwVar.getMessagesController().U2(1, -1, 100, z10, null);
                                    }
                                }
                            });
                        }
                    }
                    z12 = z17;
                    z11 = true;
                    if (z11) {
                    }
                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.yu
                        @Override // java.lang.Runnable
                        public final void run() {
                            zw zwVar = zw.this;
                            if (z11) {
                                zwVar.getMessagesController().U2(zwVar.X2, -1, 100, z12, null);
                            }
                            if (z9) {
                                zwVar.getMessagesController().U2(1, -1, 100, z10, null);
                            }
                        }
                    });
                }
            }
        }
        z9 = false;
        z10 = false;
        if (abs > 0) {
        }
        if (abs == 0) {
        }
        z11 = false;
        z12 = false;
        if (z11) {
        }
        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.yu
            @Override // java.lang.Runnable
            public final void run() {
                zw zwVar = zw.this;
                if (z11) {
                    zwVar.getMessagesController().U2(zwVar.X2, -1, 100, z12, null);
                }
                if (z9) {
                    zwVar.getMessagesController().U2(1, -1, 100, z10, null);
                }
            }
        });
    }

    public final void C4(int i7, long j3, TLRPC.Chat chat, boolean z9, boolean z10) {
        if (i7 == 103) {
            getMessagesController().X(1, j3, z10);
            return;
        }
        if (chat == null) {
            getMessagesController().X(0, j3, z10);
            if (z9 && z10) {
                getMessagesController().w(j3);
            }
        } else if (org.telegram.messenger.t3.r0(chat)) {
            getMessagesController().X(0, j3, z10);
        } else {
            getMessagesController().g0(-j3, getMessagesController().a2(Long.valueOf(getUserConfig().e())), null, z10, false);
        }
        if (org.telegram.messenger.g0.Q1()) {
            getNotificationCenter().k(org.telegram.messenger.qs.t, Long.valueOf(j3));
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
    public final void D4(java.util.ArrayList r41, int r42, boolean r43, boolean r44, java.util.HashSet r45) {
        /*
            Method dump skipped, instructions count: 2849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zw.D4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
    }

    @Override // pg.b
    public final List E() {
        return Arrays.asList(new pg.a(org.telegram.messenger.id.M0(2131751648, null)), new pg.a(org.telegram.messenger.id.M0(2131752076, null), new fu(this, 14)), new pg.a(org.telegram.messenger.id.M0(2131751649, null), new fu(this, 15)));
    }

    public final void E3() {
        if (this.e0 == null) {
            return;
        }
        int w32 = w3();
        int i7 = 0;
        while (true) {
            yw[] ywVarArr = this.e0;
            if (i7 >= ywVarArr.length) {
                return;
            }
            yw ywVar = ywVarArr[i7];
            if (ywVar != null) {
                vw vwVar = ywVar.a;
                vwVar.setPadding(0, vwVar.f3, 0, w32);
            }
            i7++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E4(long j3, boolean z9, org.telegram.messenger.vo voVar, int i7, boolean z10) {
        boolean z11;
        int i10;
        boolean B3;
        boolean z12;
        int i11 = (this.e0[0].s == 0 && l4() && this.e0[0].w == 2) ? 1 : 0;
        int L0 = this.e0[0].c.L0();
        if (voVar != null) {
            int i12 = voVar.j.get(j3, TLObject.FLAG_31);
            if (!z9 && i12 == Integer.MIN_VALUE) {
                return;
            }
        }
        int i13 = -1;
        if (L0 > i11 || !z10) {
            z11 = true;
        } else {
            M4(true, true);
            z3();
            if (this.S1 != null) {
                for (int i14 = 0; i14 < this.S1.size(); i14++) {
                    if (((TLRPC.Dialog) this.S1.get(i14)).id == j3) {
                        i10 = i14;
                        z11 = false;
                        break;
                    }
                }
            }
            z11 = false;
        }
        i10 = -1;
        if (voVar != null) {
            LongSparseIntArray longSparseIntArray = voVar.j;
            if (z9) {
                longSparseIntArray.put(j3, i7);
            } else {
                longSparseIntArray.delete(j3);
            }
            if (z10) {
                getMessagesController().w3(voVar);
            }
            B3 = true;
        } else {
            B3 = getMessagesController().B3(j3, z9, null, -1L);
        }
        if (B3) {
            if (z11) {
                if (this.S0 != 10) {
                    o4(false);
                }
                J4(true, false);
            } else {
                ArrayList d42 = d4(this.currentAccount, this.e0[0].s, this.X2, false);
                int i15 = 0;
                while (true) {
                    if (i15 >= d42.size()) {
                        break;
                    }
                    if (((TLRPC.Dialog) d42.get(i15)).id == j3) {
                        i13 = i15;
                        break;
                    }
                    i15++;
                }
            }
        }
        if (z11) {
            return;
        }
        if (i10 >= 0) {
            ArrayList arrayList = this.S1;
            if (arrayList != null && i13 >= 0 && i10 != i13) {
                arrayList.add(i13, (TLRPC.Dialog) arrayList.remove(i10));
                this.e0[0].y.D();
                this.e0[0].q(true);
                yw ywVar = this.e0[0];
                ywVar.c.h1((ywVar.s == 0 && l4() && this.e0[0].w == 2) ? 1 : 0, (int) this.N);
            } else if (i13 >= 0 && i10 == i13) {
                org.telegram.messenger.g0.i3(new fu(this, 13), 200L);
            }
            z12 = true;
            if (z12) {
                M4(false, true);
                return;
            }
            return;
        }
        z12 = false;
        if (z12) {
        }
    }

    @Override // te.b
    public final void F(float f10, int i7) {
        org.telegram.ui.ActionBar.r0 r0Var;
        if (i7 != 3 || (r0Var = this.l0) == null) {
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) r0Var.getIconView().getDrawable();
        if (!this.d.f) {
            animatedVectorDrawable.reset();
            return;
        }
        animatedVectorDrawable.start();
        if (org.telegram.messenger.iz.o() != 0) {
            TLRPC.TL_help_premiumPromo tL_help_premiumPromo = org.telegram.messenger.ui.b0(this.currentAccount).D;
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
                    org.telegram.messenger.w7.G(this.currentAccount).W(tL_help_premiumPromo.videos.get(i10), tL_help_premiumPromo, 3, 0);
                }
            }
        }
    }

    public final void F3() {
        jh.f fVar = this.z1;
        if (fVar != null) {
            fVar.setBlurredBottomHeight(this.z1.getInputBubbleHeight() + this.w.d() + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(7.0f));
        }
    }

    public final void F4() {
        if (this.K0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.m6.d6));
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / org.telegram.messenger.qs.K2));
        this.K0.setBackground(new BitmapDrawable(createBitmap));
        this.K0.setAlpha(0.0f);
        this.K0.setVisibility(0);
        N3();
    }

    public final void G3() {
        yw ywVar;
        float e42 = e4(true);
        pw pwVar = this.z0;
        if (pwVar != null) {
            boolean z9 = pwVar.getAlpha() != e42;
            float T1 = org.telegram.messenger.g0.T1(0.98f, 1.0f, e42);
            this.z0.setAlpha(e42);
            this.z0.setScaleX(T1);
            this.z0.setScaleY(T1);
            this.z0.setVisibility(e42 > 0.0f ? 0 : 8);
            if (z9 && (ywVar = this.e0[0]) != null) {
                ywVar.a.requestLayout();
            }
        }
        e5();
    }

    public final void G4(yw ywVar) {
        int i7;
        if (ywVar.getVisibility() != 0) {
            return;
        }
        int i10 = ywVar.d.w;
        if (ywVar.s == 0 && l4() && ywVar.a.getChildCount() == 0 && ywVar.w == 2) {
            ((v4.b0) ywVar.a.getLayoutManager()).h1(1, (int) this.N);
        }
        ywVar.d.getClass();
        ywVar.d.V();
        int b10 = ywVar.d.b();
        if (b10 == 1 && i10 == 1 && ywVar.d.d(0) == 5) {
            ywVar.q(true);
        } else {
            ywVar.q(false);
            if (b10 > i10 && (i7 = this.S0) != 11 && i7 != 12 && i7 != 13) {
                ywVar.D.b(i10);
            }
        }
        try {
            ywVar.a.setEmptyView((this.X2 == 0 && this.Z2 == 0) ? ywVar.x : null);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        C3(ywVar);
    }

    public final void H3() {
        float f10 = this.n.e;
        float T1 = org.telegram.messenger.g0.T1(0.2f, 1.0f, f10);
        li.w1 w1Var = this.D1;
        if (w1Var != null) {
            w1Var.setScaleX(T1);
            this.D1.setScaleY(T1);
            this.D1.setAlpha(f10);
            this.D1.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        jh.f fVar = this.z1;
        if (fVar != null) {
            fVar.setAlpha(f10);
            this.z1.setVisibility(f10 > 0.0f ? 0 : 8);
            this.z1.getFadeView().setAlpha(f10);
            this.z1.getFadeView().setVisibility(f10 > 0.0f ? 0 : 8);
        }
    }

    public final void H4() {
        boolean z9;
        if (this.N == 0.0f || (z9 = this.K)) {
            return;
        }
        float f10 = z9 ? -g4() : 0.0f;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.H3, f10));
        animatorSet.setInterpolator(org.telegram.ui.Components.wq.f);
        animatorSet.setDuration(250L);
        animatorSet.start();
    }

    public final void I3() {
        if (this.actionBar == null) {
            return;
        }
        float f10 = 1.0f - this.b.e;
        float h42 = 1.0f - h4();
        org.telegram.ui.Components.p00.d(this.actionBar.getBackButton(), Math.max(this.v3, f10 * h42 * (1.0f - this.c.e)));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I4(int i7) {
        org.telegram.ui.Components.bz bzVar;
        if (this.z0 == null) {
            i5(true, true);
            if (this.z0 == null) {
                return;
            }
        }
        int tabsCount = this.z0.getTabsCount() - 1;
        ArrayList T0 = getMessagesController().T0();
        int i10 = 0;
        while (true) {
            if (i10 >= T0.size()) {
                break;
            }
            if (((org.telegram.messenger.vo) T0.get(i10)).a == i7) {
                tabsCount = i10;
                break;
            }
            i10++;
        }
        pw pwVar = this.z0;
        if (tabsCount < 0) {
            pwVar.getClass();
        } else if (tabsCount < pwVar.getTabsCount()) {
            bzVar = (org.telegram.ui.Components.bz) pwVar.h.get(tabsCount);
            if (bzVar != null) {
                pw pwVar2 = this.z0;
                ArrayList arrayList = pwVar2.h;
                if (arrayList.isEmpty()) {
                    return;
                }
                pwVar2.f((org.telegram.ui.Components.bz) jg.g.i(1, arrayList), arrayList.size() - 1);
                return;
            }
            yw[] ywVarArr = this.e0;
            if (ywVarArr == null || ywVarArr.length <= 0 || ywVarArr[0].h != bzVar.a) {
                this.z0.f(bzVar, tabsCount);
                return;
            }
            return;
        }
        bzVar = null;
        if (bzVar != null) {
        }
    }

    public final void J3() {
        org.telegram.ui.Components.p00.d(this.g0, com.google.android.recaptcha.internal.a.D(this.i0 ? 1.0f : 0.0f, 1.0f - this.b.e, 1.0f - h4(), 1.0f - this.c.e));
    }

    public final void J4(boolean z9, boolean z10) {
        vv vvVar = this.G3;
        if (vvVar == null || !vvVar.c()) {
            int i7 = (this.e0[0].s == 0 && l4() && this.e0[0].w == 2) ? 1 : 0;
            int i10 = (!this.K || z10 || this.E0.g()) ? 0 : -org.telegram.messenger.g0.L(81.0f);
            if (!z9) {
                this.e0[0].c.h1(i7, i10);
                H4();
            } else {
                org.telegram.ui.Components.ri0 ri0Var = this.e0[0].r;
                ri0Var.b = 1;
                ri0Var.d(i7, i10, false, false);
                H4();
            }
        }
    }

    public final void K3() {
        org.telegram.ui.Components.p00.d(this.f0, com.google.android.recaptcha.internal.a.D(org.telegram.messenger.iz.s.isEmpty() ? 0.0f : 1.0f, 1.0f - this.b.e, 1.0f - h4(), 1.0f - this.c.e));
    }

    public final void K4(String str, boolean z9) {
        a5(true, false, true, false);
        bg.p0 p0Var = this.Y;
        if (p0Var != null) {
            p0Var.b(true);
        }
        ow owVar = this.X;
        if (owVar != null) {
            owVar.r.setText(str);
            this.X.r.setSelection(str.length());
        }
    }

    public final void L3() {
        org.telegram.ui.Components.p00.d(this.j0, com.google.android.recaptcha.internal.a.D(this.S0 != 2 ? 1.0f : 0.0f, this.f.e, 1.0f - h4(), 1.0f - this.c.e));
        sv svVar = this.E0;
        if (svVar != null) {
            svVar.invalidate();
        }
    }

    public final void L4(float f10) {
        this.c0 = f10;
        for (yw ywVar : this.e0) {
            vw vwVar = ywVar.a;
            for (int i7 = 0; i7 < vwVar.getChildCount(); i7++) {
                View childAt = vwVar.getChildAt(i7);
                if (childAt != null && RecyclerView.R(childAt) >= ywVar.d.f + 1) {
                    childAt.setAlpha(f10);
                }
            }
        }
    }

    public final void M3() {
        org.telegram.ui.Components.p00.d(this.l0, com.google.android.recaptcha.internal.a.D(this.b.e, 1.0f - h4(), 1.0f - this.c.e, this.d.e));
    }

    public final void M4(boolean z9, boolean z10) {
        if (this.e0 == null || this.T1 == z9) {
            return;
        }
        if (z9) {
            this.S1 = new ArrayList(d4(this.currentAccount, this.e0[0].s, this.X2, false));
        } else {
            this.S1 = null;
        }
        this.T1 = z9;
        yw ywVar = this.e0[0];
        ywVar.d.G = z9;
        if (z9 || !z10) {
            return;
        }
        if (ywVar.a.c0()) {
            this.e0[0].a.post(new fu(this, 25));
        } else {
            this.e0[0].d.f();
        }
    }

    public final void N3() {
        bi.ec ecVar;
        boolean z9 = !this.k2 && ((ecVar = this.K0) == null || ecVar.getBackground() == null || this.K0.getAlpha() < 0.01f || this.K0.getVisibility() == 8);
        f fVar = this.J3;
        if (fVar != null) {
            ((me0) fVar.b).w.a(z9, true);
        }
    }

    public final void N4(boolean z9) {
        yw ywVar;
        if (org.telegram.messenger.iz.o() <= 1 || !org.telegram.messenger.sc.e(32768)) {
            return;
        }
        if (z9) {
            yw[] ywVarArr = this.e0;
            if (ywVarArr != null && (ywVar = ywVarArr[0]) != null) {
                ywVar.setLayerType(2, null);
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
            int i7 = 0;
            while (true) {
                yw[] ywVarArr2 = this.e0;
                if (i7 >= ywVarArr2.length) {
                    break;
                }
                yw ywVar2 = ywVarArr2[i7];
                if (ywVar2 != null) {
                    ywVar2.setLayerType(0, null);
                    ywVar2.setClipChildren(true);
                    ywVar2.setClipToPadding(true);
                    ywVar2.a.setClipChildren(true);
                }
                i7++;
            }
        }
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        if (lVar2 != null) {
            lVar2.setLayerType(0, null);
        }
        sv svVar = this.E0;
        if (svVar != null) {
            svVar.setLayerType(0, null);
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            ((ViewGroup) view2).setClipChildren(true);
            this.fragmentView.requestLayout();
        }
    }

    public final void O3() {
        I3();
        org.telegram.ui.Components.p00.d(this.k0, (1.0f - this.b.e) * (1.0f - h4()) * (1.0f - this.c.e));
        J3();
        M3();
        K3();
        L3();
    }

    public final void O4(float f10) {
        yw[] ywVarArr = this.e0;
        if (ywVarArr != null) {
            int paddingTop = ywVarArr[0].a.getPaddingTop() + ((int) f10);
            int i7 = 0;
            while (true) {
                yw[] ywVarArr2 = this.e0;
                if (i7 >= ywVarArr2.length) {
                    break;
                }
                ywVarArr2[i7].a.setTopGlowOffset(paddingTop);
                i7++;
            }
        }
        if (this.fragmentView == null || f10 == this.N) {
            return;
        }
        this.N = f10;
        org.telegram.ui.Components.bc bcVar = this.p3;
        if (bcVar != null) {
            bcVar.l();
        }
        if (this.F3 != null) {
            float currentActionBarHeight = 1.0f - ((-f10) / org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
            org.telegram.ui.Cells.o oVar = this.F3;
            float f11 = (int) f10;
            float f12 = oVar.f;
            oVar.h = f11;
            oVar.setTranslationY(f12 + f11);
            this.F3.setAlpha(c8.j9.a(currentActionBarHeight, 0.0f, 1.0f));
            this.F3.setVisibility(currentActionBarHeight <= 0.0f ? 4 : 0);
        }
        Q3();
        this.fragmentView.invalidate();
    }

    public final void P3() {
        String M0 = org.telegram.messenger.id.M0(h4() > 0.5f ? 2131745706 : 2131745813, null);
        this.X.r.setContentDescription(M0);
        this.X.r.setHint(M0);
    }

    public final void P4(float f10) {
        this.y1 = f10;
        n5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (org.telegram.messenger.iz.o() != 0) {
            org.telegram.messenger.sc.e(32768);
        }
        e5();
    }

    public final void Q3() {
        if (this.X == null) {
            return;
        }
        float a10 = 1.0f - c8.j9.a(((-this.N) - g4()) / org.telegram.messenger.g0.L(48.0f), 0.0f, 1.0f);
        float max = (this.S0 != 2 ? 1.0f : 0.0f) * (1.0f - this.c.e) * (1.0f - Math.max(this.v3, this.h.e)) * Math.max(this.b.e, (1.0f - h4()) * a10);
        this.X.setAlpha(max);
        this.X.setVisibility(max > 0.0f ? 0 : 8);
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
        if (this.Z != null) {
            float f10 = (this.a0 != null ? 1.0f : 0.0f) * this.b.e;
            float T1 = org.telegram.messenger.g0.T1(0.98f, 1.0f, f10);
            this.Z.setScaleX(T1);
            this.Z.setScaleY(T1);
            this.Z.setAlpha(f10);
            this.Z.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        org.telegram.ui.Components.u61 u61Var = this.a0;
        te.a aVar = this.s;
        if (u61Var != null) {
            float f11 = 1.0f - aVar.e;
            u61Var.setAlpha(f11);
            this.a0.setVisibility(f11 > 0.0f ? 0 : 8);
        }
        jg.q0 q0Var = this.b0;
        if (q0Var != null) {
            float f12 = aVar.e;
            q0Var.setAlpha(f12);
            this.b0.setVisibility(f12 > 0.0f ? 0 : 8);
        }
    }

    public final void R4(float f10) {
        if (org.telegram.messenger.iz.o() <= 0) {
            boolean z9 = org.telegram.messenger.r2.a;
            return;
        }
        if (this.X3 == f10) {
            return;
        }
        boolean z10 = true;
        if (org.telegram.messenger.iz.o() > 1 && org.telegram.messenger.sc.e(32768)) {
            z10 = false;
        }
        this.Y3 = z10;
        this.X3 = f10;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (this.Y3) {
            float f11 = (1.0f - this.X3) * (-org.telegram.messenger.g0.L(40.0f));
            sv svVar = this.E0;
            if (svVar != null) {
                svVar.setTranslationX(f11);
            }
            ow owVar = this.X;
            if (owVar != null) {
                owVar.setTranslationX(f11);
            }
            vv vvVar = this.G3;
            if (vvVar == null || vvVar.getFragmentView() == null || this.D) {
                return;
            }
            this.G3.getFragmentView().setTranslationX(f11);
            return;
        }
        float f12 = -org.telegram.messenger.g0.L(4.0f);
        float f13 = 1.0f - this.X3;
        float f14 = f12 * f13;
        float f15 = 1.0f - (f13 * 0.05f);
        sv svVar2 = this.E0;
        if (svVar2 != null) {
            svVar2.setScaleX(f15);
            this.E0.setScaleY(f15);
            this.E0.setTranslationX(f14);
            this.E0.setPivotX(0.0f);
            this.E0.setPivotY(0.0f);
        }
        ow owVar2 = this.X;
        if (owVar2 != null) {
            owVar2.setTranslationX(f14);
            this.X.setScaleX(f15);
            this.X.setScaleY(f15);
        }
        vv vvVar2 = this.G3;
        if (vvVar2 == null || vvVar2.getFragmentView() == null) {
            return;
        }
        if (!this.D) {
            this.G3.getFragmentView().setScaleX(f15);
            this.G3.getFragmentView().setScaleY(f15);
            this.G3.getFragmentView().setTranslationX(f14);
        }
        this.G3.getFragmentView().setPivotX(0.0f);
        this.G3.getFragmentView().setPivotY(0.0f);
    }

    public final void S3(boolean z9) {
        if (this.C0 == null || this.actionBar == null) {
            return;
        }
        int i7 = org.telegram.messenger.g0.n;
        int measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(this.a) + (this.a0 != null ? org.telegram.messenger.g0.L(50.0f) : 0);
        org.telegram.ui.Components.or orVar = this.K1;
        int c10 = measuredHeight + (orVar != null ? (int) orVar.c(org.telegram.messenger.g0.L(7.0f)) : 0);
        iw iwVar = this.C0;
        SparseArray sparseArray = iwVar.h;
        iwVar.W0 = c10;
        iwVar.X0 = i7;
        bi.q1 q1Var = iwVar.a0;
        if (z9) {
            q1Var.q1(0, c10, 0, i7);
        } else {
            q1Var.setPadding(0, c10, 0, i7);
        }
        iwVar.O0.j(iwVar.W0, iwVar.X0, z9);
        org.telegram.ui.Components.sl0 sl0Var = iwVar.b0;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sl0Var.getLayoutParams();
        int i10 = marginLayoutParams.topMargin;
        int i11 = iwVar.W0;
        if (i10 != i11 || marginLayoutParams.bottomMargin != iwVar.X0) {
            marginLayoutParams.topMargin = i11;
            marginLayoutParams.bottomMargin = iwVar.X0;
            sl0Var.requestLayout();
        }
        org.telegram.ui.Components.fm0.Q(iwVar.h0, iwVar.k0, iwVar.W0, iwVar.X0, z9);
        org.telegram.ui.Components.fm0.Q(iwVar.m0, iwVar.p0, iwVar.W0, iwVar.X0, z9);
        org.telegram.ui.Components.fm0.Q(iwVar.t0, iwVar.w0, iwVar.W0, iwVar.X0, z9);
        org.telegram.ui.Components.ze0 ze0Var = iwVar.r0;
        int i12 = iwVar.W0;
        int i13 = iwVar.X0;
        ze0Var.setClipToPadding(false);
        org.telegram.ui.Components.r41 r41Var = ze0Var.c;
        ze0Var.J = z9;
        ze0Var.setPadding(0, i12, 0, i13);
        if (z9) {
            r41Var.q1(0, i12, 0, i13);
        } else {
            r41Var.setPadding(0, i12, 0, i13);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) r41Var.getLayoutParams();
        marginLayoutParams2.topMargin = -i12;
        marginLayoutParams2.bottomMargin = -i13;
        ze0Var.J = false;
        org.telegram.ui.Components.dl0 dl0Var = iwVar.I0;
        if (dl0Var != null) {
            dl0Var.b(iwVar.W0, iwVar.X0, z9);
        }
        int size = sparseArray.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) sparseArray.valueAt(i14);
            if (view instanceof b00) {
                ((b00) view).j(iwVar.W0, iwVar.X0, z9);
            }
        }
        for (int i15 = 0; i15 < iwVar.getChildCount(); i15++) {
            if (iwVar.getChildAt(i15) instanceof b00) {
                ((b00) iwVar.getChildAt(i15)).j(iwVar.W0, iwVar.X0, z9);
            }
        }
    }

    public final void S4() {
        getContactsController().B();
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(getParentActivity(), this.currentAccount, getResourceProvider(), new org.telegram.ui.Components.h41(13, this, r1), new dh(r1, 17));
        org.telegram.ui.ActionBar.w2 h = org.telegram.messenger.camera.q.h(getParentActivity(), false, 1, getResourceProvider());
        h.N = o6Var;
        h.U0 = 49;
        h.show();
        org.telegram.ui.ActionBar.w2[] w2VarArr = {h};
        h.P(org.telegram.ui.ActionBar.m6.h5);
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

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0131, code lost:
    
        if ((r3.size() + r9.h.size()) > 100) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean T4(org.telegram.ui.Cells.t2 t2Var) {
        long j3;
        int b10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr;
        boolean z9;
        int i7;
        LinearLayout linearLayout;
        zw zwVar;
        char c10;
        long j10;
        org.telegram.messenger.vo voVar;
        boolean[] zArr;
        ?? r52;
        zw zwVar2;
        long j11;
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
        final long j12;
        int i14;
        int i15;
        boolean z11;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
        LinearLayout linearLayout2;
        org.telegram.ui.ActionBar.z0 z0Var;
        org.telegram.ui.Components.h60 h60Var;
        char c11;
        final zw zwVar3 = this;
        boolean Y = org.telegram.messenger.t3.Y(t2Var.g2);
        int i16 = 1;
        if (!t2Var.U()) {
            long dialogId = t2Var.getDialogId();
            Bundle bundle = new Bundle();
            int messageId = t2Var.getMessageId();
            if (!org.telegram.messenger.m5.C(dialogId)) {
                if (org.telegram.messenger.m5.E(dialogId)) {
                    bundle.putLong("user_id", dialogId);
                } else if (zwVar3.Z2 == 0 || ((b10 = ii.m0.b(zwVar3.currentAccount, dialogId)) != 4 && b10 != 3)) {
                    TLRPC.Chat M0 = zwVar3.getMessagesController().M0(Long.valueOf(-dialogId));
                    if (messageId == 0 || M0 == null || M0.migrated_to == null) {
                        j3 = dialogId;
                    } else {
                        bundle.putLong("migrated_to", dialogId);
                        j3 = -M0.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -j3);
                }
                if (messageId != 0) {
                    bundle.putInt("message_id", messageId);
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(dialogId));
                boolean z12 = zwVar3.Z2 == 0 && zwVar3.getMessagesController().E3 && zwVar3.getMessagesController().U0 && zwVar3.getMessagesController().P0 != null && zwVar3.getMessagesController().P0.size() > 0;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = new ActionBarPopupWindow$ActionBarPopupWindowLayout[1];
                if (z12) {
                    LinearLayout linearLayout3 = new LinearLayout(zwVar3.getParentActivity());
                    linearLayout3.setOrientation(1);
                    org.telegram.ui.Components.h60 h60Var2 = new org.telegram.ui.Components.h60(zwVar3.getParentActivity(), i16);
                    LinearLayout linearLayout4 = new LinearLayout(zwVar3.getParentActivity());
                    linearLayout4.setOrientation(1);
                    h60Var2.addView(linearLayout4);
                    int size = zwVar3.getMessagesController().P0.size();
                    int i17 = 0;
                    org.telegram.ui.ActionBar.z0 z0Var2 = null;
                    while (i17 < size) {
                        final org.telegram.messenger.vo voVar2 = (org.telegram.messenger.vo) zwVar3.getMessagesController().P0.get(i17);
                        if (voVar2.e()) {
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                            j12 = dialogId;
                            c11 = 'd';
                        } else {
                            final boolean b11 = voVar2.b(org.telegram.messenger.c.a(zwVar3.currentAccount), dialogId);
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                            j12 = dialogId;
                            final ArrayList J0 = org.telegram.ui.Components.fz.J0(zwVar3, voVar2, arrayList2, true, false);
                            if (!b11) {
                                c11 = 'd';
                            }
                            org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(2, zwVar3.getParentActivity(), null, false, false);
                            z0Var3.setChecked(b11);
                            i14 = i17;
                            org.telegram.ui.Components.h60 h60Var3 = h60Var2;
                            Spannable B5 = org.telegram.messenger.ij.B5(org.telegram.messenger.i6.m(voVar2.b, z0Var3.getTextView().getPaint().getFontMetricsInt(), false, null, 0), voVar2.c, z0Var3.getTextView().getPaint().getFontMetricsInt(), false);
                            z0Var3.setEmojiCacheType(voVar2.n ? 26 : 0);
                            z0Var3.j(B5, 0, new org.telegram.ui.Components.wz(zwVar3.getParentActivity(), R.drawable.msg_folders, voVar2.m));
                            z0Var3.getTextView().setEmojiColor(zwVar3.getThemedColor(org.telegram.ui.ActionBar.m6.Ci));
                            z0Var3.setMinimumWidth(org.telegram.messenger.qs.q2);
                            i15 = size;
                            z11 = Y;
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                            linearLayout2 = linearLayout4;
                            z0Var = z0Var3;
                            h60Var = h60Var3;
                            dialogId = j12;
                            z0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.pu
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    ArrayList arrayList3;
                                    long j13;
                                    org.telegram.messenger.vo voVar3;
                                    zw zwVar4 = zw.this;
                                    zwVar4.getClass();
                                    boolean z13 = b11;
                                    ArrayList arrayList4 = J0;
                                    org.telegram.messenger.vo voVar4 = voVar2;
                                    long j14 = j12;
                                    if (z13) {
                                        voVar4.h.remove(Long.valueOf(j14));
                                        voVar4.i.add(Long.valueOf(j14));
                                        jz.z0(voVar4, voVar4.g, voVar4.b, voVar4.c, voVar4.n, voVar4.m, voVar4.h, voVar4.i, voVar4.j, false, false, true, true, false, zwVar4, null);
                                        zwVar4.k4().k(j14, 21, Integer.valueOf(arrayList4.size()), voVar4, null, null);
                                    } else {
                                        if (arrayList4.isEmpty()) {
                                            arrayList3 = arrayList4;
                                            j13 = j14;
                                            voVar3 = voVar4;
                                        } else {
                                            for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                                                voVar4.i.remove(arrayList4.get(i18));
                                            }
                                            voVar4.h.addAll(arrayList4);
                                            arrayList3 = arrayList4;
                                            voVar3 = voVar4;
                                            j13 = j14;
                                            jz.z0(voVar3, voVar4.g, voVar4.b, voVar4.c, voVar4.n, voVar4.m, voVar4.h, voVar4.i, voVar4.j, false, false, true, true, false, zwVar4, null);
                                        }
                                        zwVar4.k4().k(j13, 20, Integer.valueOf(arrayList3.size()), voVar3, null, null);
                                    }
                                    zwVar4.n4(true);
                                    zwVar4.finishPreviewFragment();
                                }
                            });
                            linearLayout2.addView(z0Var);
                            i17 = i14 + 1;
                            zwVar3 = this;
                            linearLayout4 = linearLayout2;
                            z0Var2 = z0Var;
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
                            h60Var2 = h60Var;
                            Y = z11;
                            size = i15;
                        }
                        h60Var = h60Var2;
                        linearLayout2 = linearLayout4;
                        z11 = Y;
                        i15 = size;
                        z0Var = z0Var2;
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                        dialogId = j12;
                        i14 = i17;
                        i17 = i14 + 1;
                        zwVar3 = this;
                        linearLayout4 = linearLayout2;
                        z0Var2 = z0Var;
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
                        h60Var2 = h60Var;
                        Y = z11;
                        size = i15;
                    }
                    ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr5 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                    org.telegram.ui.Components.h60 h60Var4 = h60Var2;
                    LinearLayout linearLayout5 = linearLayout4;
                    z9 = Y;
                    org.telegram.ui.ActionBar.z0 z0Var4 = z0Var2;
                    i7 = org.telegram.messenger.qs.q2;
                    if (z0Var4 != null) {
                        z0Var4.m(false, true);
                    }
                    if (linearLayout5.getChildCount() <= 0) {
                        z12 = false;
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr5;
                        linearLayout = linearLayout3;
                    } else {
                        org.telegram.ui.ActionBar.d1 d1Var = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.m6.H8, getParentActivity(), getResourceProvider());
                        d1Var.setTag(R.id.fit_width_tag, 1);
                        org.telegram.ui.ActionBar.z0 z0Var5 = new org.telegram.ui.ActionBar.z0(getParentActivity(), true, false);
                        z0Var5.j(org.telegram.messenger.id.M0(2131753756, null), R.drawable.ic_ab_back, null);
                        z0Var5.setMinimumWidth(org.telegram.messenger.qs.q2);
                        z0Var5.setOnClickListener(new a(actionBarPopupWindow$ActionBarPopupWindowLayoutArr5, 20));
                        linearLayout3.addView(z0Var5);
                        linearLayout3.addView(d1Var, c8.ha.o(-1, 8));
                        linearLayout3.addView(h60Var4);
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr5;
                        linearLayout = linearLayout3;
                    }
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                    z9 = Y;
                    i7 = org.telegram.messenger.qs.q2;
                    linearLayout = null;
                }
                org.telegram.ui.ActionBar.f2[] f2VarArr = new org.telegram.ui.ActionBar.f2[1];
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, z12 ? 3 : 2, getParentActivity(), getResourceProvider());
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0] = actionBarPopupWindow$ActionBarPopupWindowLayout;
                if (z12) {
                    int[] iArr = {actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout)};
                    org.telegram.ui.ActionBar.z0 z0Var6 = new org.telegram.ui.ActionBar.z0(getParentActivity(), true, false);
                    z0Var6.j(org.telegram.messenger.id.M0(2131750812, null), R.drawable.msg_addfolder, null);
                    z0Var6.setMinimumWidth(i7);
                    z0Var6.setOnClickListener(new org.telegram.ui.Components.u41(8, actionBarPopupWindow$ActionBarPopupWindowLayoutArr, iArr));
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(z0Var6);
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().setOnHeightUpdateListener(new zr(f2VarArr, 4));
                }
                if (z9) {
                    zwVar = this;
                    c10 = 0;
                } else {
                    org.telegram.ui.ActionBar.z0 z0Var7 = new org.telegram.ui.ActionBar.z0(getParentActivity(), !z12, false);
                    if (t2Var.getHasUnread()) {
                        z0Var7.j(org.telegram.messenger.id.M0(2131748681, null), R.drawable.msg_markread, null);
                    } else {
                        z0Var7.j(org.telegram.messenger.id.M0(2131748680, null), R.drawable.msg_markunread, null);
                    }
                    z0Var7.setMinimumWidth(i7);
                    zwVar = this;
                    long j13 = dialogId;
                    dialogId = j13;
                    z0Var7.setOnClickListener(new bi.p3(zwVar, t2Var, j13, 5));
                    c10 = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(z0Var7);
                }
                boolean[] zArr2 = new boolean[1];
                zArr2[c10] = true;
                TLRPC.Dialog dialog = (TLRPC.Dialog) zwVar.getMessagesController().Q.f(dialogId);
                int i18 = zwVar.e0[c10].s;
                boolean z13 = (i18 == 7 || i18 == 8) && (!zwVar.actionBar.x() || zwVar.actionBar.y(null));
                if (z13) {
                    j10 = dialogId;
                    voVar = zwVar.getMessagesController().M[zwVar.e0[0].s == 8 ? (char) 1 : (char) 0];
                } else {
                    j10 = dialogId;
                    voVar = null;
                }
                if (zwVar.s4(dialog)) {
                    zArr = zArr2;
                    r52 = 0;
                } else {
                    ArrayList W0 = zwVar.getMessagesController().W0(zwVar.X2);
                    int size2 = W0.size();
                    int i19 = 0;
                    int i20 = 0;
                    int i21 = 0;
                    while (true) {
                        if (i19 >= size2) {
                            zArr = zArr2;
                            z10 = z13;
                            break;
                        }
                        TLRPC.Dialog dialog2 = (TLRPC.Dialog) W0.get(i19);
                        if (dialog2 instanceof TLRPC.TL_dialogFolder) {
                            arrayList = W0;
                            zArr = zArr2;
                        } else if (zwVar.s4(dialog2)) {
                            arrayList = W0;
                            zArr = zArr2;
                            if (org.telegram.messenger.m5.C(dialog2.id)) {
                                i21++;
                            } else {
                                i20++;
                            }
                        } else {
                            arrayList = W0;
                            zArr = zArr2;
                            z10 = z13;
                            if (!zwVar.getMessagesController().C2(dialog2.id, false)) {
                                break;
                            }
                            i19++;
                            W0 = arrayList;
                            zArr2 = zArr;
                            z13 = z10;
                        }
                        z10 = z13;
                        i19++;
                        W0 = arrayList;
                        zArr2 = zArr;
                        z13 = z10;
                    }
                    if (dialog == null || zwVar.s4(dialog)) {
                        i11 = 0;
                        i12 = 0;
                        i13 = 0;
                    } else {
                        boolean C = org.telegram.messenger.m5.C(j10);
                        int i22 = !C ? 1 : 0;
                        if (voVar == null || !voVar.h.contains(Long.valueOf(j10))) {
                            i13 = i22;
                            i12 = C ? 1 : 0;
                            i11 = 0;
                        } else {
                            i13 = i22;
                            i12 = C ? 1 : 0;
                            i11 = 1;
                        }
                    }
                    int size3 = (!z10 || voVar == null) ? (zwVar.X2 == 0 && voVar == null) ? zwVar.getUserConfig().q() ? zwVar.getMessagesController().K4 : zwVar.getMessagesController().J4 : zwVar.getUserConfig().q() ? zwVar.getMessagesController().l3 : zwVar.getMessagesController().k3 : 100 - voVar.h.size();
                    boolean z14 = i12 + i21 <= size3 && (i13 + i20) - i11 <= size3;
                    r52 = 0;
                    zArr[0] = z14;
                }
                if (zArr[r52]) {
                    org.telegram.ui.ActionBar.z0 z0Var8 = new org.telegram.ui.ActionBar.z0(zwVar.getParentActivity(), (z12 || !z9) ? r52 : true, r52);
                    if (zwVar.s4(dialog)) {
                        z0Var8.j(org.telegram.messenger.id.M0(2131743844, null), R.drawable.msg_unpin, null);
                    } else {
                        z0Var8.j(org.telegram.messenger.id.M0(2131747245, null), R.drawable.msg_pin, null);
                    }
                    z0Var8.setMinimumWidth(org.telegram.messenger.qs.q2);
                    long j14 = j10;
                    org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(zwVar, voVar, dialog, j14, 1);
                    zwVar2 = zwVar;
                    j11 = j14;
                    z0Var8.setOnClickListener(qqVar);
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(z0Var8);
                } else {
                    zwVar2 = zwVar;
                    j11 = j10;
                }
                if (org.telegram.messenger.m5.E(j11) && org.telegram.messenger.t10.B(zwVar2.getMessagesController().a2(Long.valueOf(j11)))) {
                    i10 = 0;
                } else {
                    org.telegram.ui.ActionBar.z0 z0Var9 = new org.telegram.ui.ActionBar.z0(zwVar2.getParentActivity(), false, false);
                    if (zwVar2.getMessagesController().r2(j11, 0L, null)) {
                        z0Var9.j(org.telegram.messenger.id.M0(2131743849, null), R.drawable.msg_unmute, null);
                    } else {
                        z0Var9.j(org.telegram.messenger.id.M0(2131748314, null), R.drawable.msg_mute, null);
                    }
                    z0Var9.setMinimumWidth(org.telegram.messenger.qs.q2);
                    z0Var9.setOnClickListener(new di.u1(zwVar2, j11, 2));
                    i10 = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(z0Var9);
                }
                if (!z9) {
                    org.telegram.ui.ActionBar.z0 z0Var10 = new org.telegram.ui.ActionBar.z0(zwVar2.getParentActivity(), i10, true);
                    z0Var10.setIconColor(zwVar2.getThemedColor(org.telegram.ui.ActionBar.m6.p7));
                    int i23 = org.telegram.ui.ActionBar.m6.q7;
                    z0Var10.setTextColor(zwVar2.getThemedColor(i23));
                    z0Var10.h(0.12f, i23);
                    z0Var10.j(org.telegram.messenger.id.M0(2131751598, null), R.drawable.msg_delete, null);
                    z0Var10.setMinimumWidth(org.telegram.messenger.qs.q2);
                    z0Var10.setOnClickListener(new org.telegram.ui.Components.u41(9, zwVar2, arrayList2));
                    i10 = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(z0Var10);
                }
                int i24 = org.telegram.messenger.qs.t;
                if (z9) {
                    if (zwVar2.o2 != null) {
                        zwVar2.getNotificationCenter().k(i24, new Object[i10]);
                    }
                    zwVar2.F4();
                    zwVar2.parentLayout.setHighlightActionButtons(true);
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("community_id", -j11);
                    zw zwVar4 = new zw(bundle2);
                    Point point = org.telegram.messenger.g0.q;
                    if (point.x > point.y) {
                        f2VarArr[0] = zwVar4;
                        zwVar2.presentFragmentAsPreview(zwVar4);
                        return false;
                    }
                    f2VarArr[0] = zwVar4;
                    zwVar2.presentFragmentAsPreviewWithMenu(zwVar4, actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0]);
                    return false;
                }
                if (!zwVar2.getMessagesController().E(bundle, zwVar2, null, null)) {
                    return i10;
                }
                if (zwVar2.o2 != null) {
                    zwVar2.getNotificationCenter().k(i24, new Object[i10]);
                }
                zwVar2.F4();
                zwVar2.parentLayout.setHighlightActionButtons(true);
                cn cnVar = new cn(bundle);
                Point point2 = org.telegram.messenger.g0.q;
                if (point2.x > point2.y) {
                    f2VarArr[0] = cnVar;
                    zwVar2.presentFragmentAsPreview(cnVar);
                    return true;
                }
                f2VarArr[0] = cnVar;
                zwVar2.presentFragmentAsPreviewWithMenu(cnVar, actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0]);
                cnVar.ea = true;
                try {
                    cnVar.o1.getAvatarImageView().performAccessibilityAction(64, null);
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

    public final void U4(boolean z9) {
        int i7 = 1;
        this.c.a(z9, true);
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
        if (z9) {
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
        arrayList.add(ObjectAnimator.ofFloat(this.m0, (Property<org.telegram.ui.ActionBar.r0, Float>) View.ALPHA, z9 ? 1.0f : 0.0f));
        this.P3.playTogether(arrayList);
        this.P3.addListener(new bw(this, z9, i7));
        this.P3.start();
    }

    public final void V3() {
        if (!org.telegram.messenger.g0.Q1()) {
            this.W1 = true;
            return;
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.n(true);
        }
        TLObject tLObject = this.Y1;
        if (tLObject != null) {
            iw iwVar = this.C0;
            if (iwVar != null) {
                iwVar.d0.Q(this.X1, tLObject);
            }
            this.Y1 = null;
        }
    }

    public final void V4() {
        if (this.A0 || !getMessagesController().U0 || !getMessagesController().J3 || this.z0 == null || !getMessagesController().T0().isEmpty() || this.isPaused || !getUserConfig().P || this.inPreviewMode) {
            return;
        }
        SharedPreferences e12 = org.telegram.messenger.qp.e1();
        if (e12.getBoolean("filterhint", false)) {
            return;
        }
        e12.edit().putBoolean("filterhint", true).apply();
        org.telegram.messenger.g0.i3(new fu(this, 26), 1000L);
    }

    @Override // org.telegram.ui.ActionBar.f2, org.telegram.ui.le0
    public final boolean W(MotionEvent motionEvent, boolean z9) {
        vv vvVar;
        bi.ec ecVar;
        pw pwVar;
        if (!this.r3 && (((vvVar = this.G3) == null || !vvVar.c()) && (((ecVar = this.K0) == null || ecVar.getVisibility() != 0) && ((pwVar = this.z0) == null || !pwVar.n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                pw pwVar2 = this.z0;
                boolean z10 = pwVar2 == null || pwVar2.getTabsCount() < 2 || this.z0.getCurrentTabId() == this.z0.getFirstTabId();
                pw pwVar3 = this.z0;
                boolean z11 = pwVar3 == null || pwVar3.getTabsCount() < 2 || this.z0.getCurrentTabId() == this.z0.getLastTabId();
                org.telegram.messenger.iz.m(this.currentAccount);
                if (!z9) {
                    return z10;
                }
                if (!z11 || z10) {
                }
            }
            return true;
        }
        return false;
    }

    public final void W3() {
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar == null || !lVar.n0) {
            return;
        }
        lVar.m();
        this.r3 = false;
        i5(true, true);
    }

    public final void W4() {
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2;
        LaunchActivity launchActivity;
        float f10;
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        gu guVar;
        org.telegram.ui.Components.h41 h41Var;
        int i7;
        org.telegram.ui.ActionBar.z0 z0Var;
        org.telegram.ui.ActionBar.h6 h6Var;
        int i10;
        org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(this, this.k0);
        int i11 = org.telegram.ui.ActionBar.m6.A8;
        H.S(getThemedColor(i11), getThemedColor(i11));
        int i12 = 8;
        H.s = 8;
        Activity parentActivity = getParentActivity();
        LaunchActivity launchActivity2 = parentActivity instanceof LaunchActivity ? (LaunchActivity) parentActivity : null;
        int i13 = 5;
        float f11 = 64.0f;
        int i14 = 0;
        if (this.Z2 != 0) {
            int i15 = 1;
            if (org.telegram.messenger.t3.N(this.a3)) {
                H.c(R.drawable.msg_customize, org.telegram.messenger.id.M0(2131751913, null), new cv(this, i15), false);
                H.k();
            }
            H.i(new cv(this, 4), org.telegram.messenger.id.M0(2131751912, null), this.a3.collapsed_in_dialogs);
            H.i(new cv(this, i13), org.telegram.messenger.id.M0(2131751911, null), !this.a3.collapsed_in_dialogs);
            H.Z();
            H.X(-org.telegram.messenger.g0.L(64.0f));
            return;
        }
        if (q4()) {
            H.c(R.drawable.msg_customize, org.telegram.messenger.id.M0(2131754143, null), new cv(this, 6), false);
            H.c(R.drawable.msg_help, org.telegram.messenger.id.M0(2131749276, null), new cv(this, 7), false);
            H.Z();
            H.X(-org.telegram.messenger.g0.L(64.0f));
            return;
        }
        org.telegram.ui.ActionBar.h6 h6Var2 = this.resourceProvider;
        boolean a10 = h6Var2 != null ? h6Var2.a() : org.telegram.ui.ActionBar.m6.I.q();
        H.c(a10 ? R.drawable.menu_day_mode_24 : R.drawable.menu_night_mode_24, org.telegram.messenger.id.M0(a10 ? 2131744300 : 2131744299, null), new cv(this, i12), false);
        H.k();
        H.c(R.drawable.outline_groups_24, org.telegram.messenger.id.M0(2131748273, null), new cv(this, 9), false);
        H.c(R.drawable.outline_saved_24, org.telegram.messenger.id.M0(2131745901, null), new cv(this, 10), false);
        org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.a;
        if (((org.telegram.messenger.h0) getMessagesController().x7.j0.b).c) {
            H.c(R.drawable.ic_gram, org.telegram.messenger.id.M0(2131743194, null), new fu(this, i14), false);
        } else {
            TLRPC.TL_attachMenuBots tL_attachMenuBots = org.telegram.messenger.ui.b0(org.telegram.messenger.p10.s0).b;
            if (launchActivity2 != null && tL_attachMenuBots != null && (arrayList = tL_attachMenuBots.bots) != null && !arrayList.isEmpty()) {
                ArrayList<TLRPC.TL_attachMenuBot> arrayList3 = tL_attachMenuBots.bots;
                int size = arrayList3.size();
                int i16 = 0;
                while (i16 < size) {
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList3.get(i16);
                    i16++;
                    TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                    if (tL_attachMenuBot2.show_in_side_menu) {
                        gu guVar2 = new gu(this, tL_attachMenuBot2, launchActivity2, i14);
                        org.telegram.ui.Components.h41 h41Var2 = new org.telegram.ui.Components.h41(15, this, tL_attachMenuBot2);
                        org.telegram.ui.ActionBar.h6 h6Var3 = H.d;
                        if (H.e != null) {
                            int i17 = org.telegram.ui.ActionBar.m6.F8;
                            int i18 = org.telegram.ui.ActionBar.m6.E8;
                            f10 = f11;
                            org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(0, H.e, H.d, false, false);
                            z0Var2.setPadding(org.telegram.messenger.g0.L(18.0f), i14, org.telegram.messenger.g0.L(18.0f), i14);
                            CharSequence b10 = tL_attachMenuBot2.side_menu_disclaimer_needed ? org.telegram.ui.Cells.m8.b(tL_attachMenuBot2.short_name) : tL_attachMenuBot2.short_name;
                            Pattern pattern = org.telegram.messenger.ui.R1;
                            ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList4 = tL_attachMenuBot2.icons;
                            int size2 = arrayList4.size();
                            arrayList2 = arrayList3;
                            int i19 = 0;
                            while (true) {
                                if (i19 >= size2) {
                                    launchActivity = launchActivity2;
                                    tL_attachMenuBotIcon = null;
                                    break;
                                }
                                TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = arrayList4.get(i19);
                                int i20 = i19 + 1;
                                TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon3 = tL_attachMenuBotIcon2;
                                launchActivity = launchActivity2;
                                if (tL_attachMenuBotIcon3.name.equals("android_side_menu_static")) {
                                    tL_attachMenuBotIcon = tL_attachMenuBotIcon3;
                                    break;
                                } else {
                                    i19 = i20;
                                    launchActivity2 = launchActivity;
                                }
                            }
                            if (tL_attachMenuBotIcon != null) {
                                i7 = 16;
                                org.telegram.messenger.rz f12 = org.telegram.messenger.t5.f(tL_attachMenuBotIcon.icon, org.telegram.ui.ActionBar.m6.c7, 1.0f, null);
                                if (f12 != null) {
                                    Integer num = H.k0;
                                    new PorterDuffColorFilter(num != null ? num.intValue() : org.telegram.ui.ActionBar.m6.w0(i17, h6Var3), PorterDuff.Mode.SRC_IN);
                                }
                                org.telegram.messenger.hc b11 = org.telegram.messenger.hc.b(tL_attachMenuBotIcon.icon);
                                guVar = guVar2;
                                z0Var = z0Var2;
                                h41Var = h41Var2;
                                CharSequence charSequence = b10;
                                i10 = i17;
                                h6Var = h6Var3;
                                z0Var.k(charSequence, b11, "24_24", f12, tL_attachMenuBot2);
                                org.telegram.ui.Components.k9 k9Var = z0Var.h;
                                if (k9Var != null) {
                                    k9Var.setLayoutParams(c8.ha.e(24, 24, (org.telegram.messenger.id.a0 ? 5 : 3) | 16));
                                }
                            } else {
                                guVar = guVar2;
                                h41Var = h41Var2;
                                i7 = 16;
                                z0Var = z0Var2;
                                CharSequence charSequence2 = b10;
                                h6Var = h6Var3;
                                i10 = i17;
                                z0Var.j(charSequence2, R.drawable.msg_bot, null);
                            }
                            Integer num2 = H.j0;
                            if (num2 == null && H.k0 == null) {
                                z0Var.c(i18, i10);
                            } else {
                                int intValue = num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.m6.w0(i18, h6Var);
                                Integer num3 = H.k0;
                                z0Var.d(intValue, num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
                            }
                            Integer num4 = H.k0;
                            z0Var.setIconColorImage(num4 != null ? num4.intValue() : org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
                            Integer num5 = H.l0;
                            if (num5 != null) {
                                z0Var.setSelectorColor(num5.intValue());
                            } else {
                                z0Var.h(0.12f, i18);
                            }
                            z0Var.setOnClickListener(new org.telegram.ui.Components.kk(i7, H, guVar));
                            z0Var.setOnLongClickListener(new di.f2(3, H, h41Var));
                            int i21 = H.S;
                            if (i21 > 0) {
                                z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i21));
                                H.r(z0Var, c8.ha.o(H.S, -2));
                            } else {
                                H.r(z0Var, c8.ha.o(-1, -2));
                            }
                            arrayList3 = arrayList2;
                            launchActivity2 = launchActivity;
                            f11 = f10;
                            i14 = 0;
                        }
                    }
                    arrayList2 = arrayList3;
                    launchActivity = launchActivity2;
                    f10 = f11;
                    arrayList3 = arrayList2;
                    launchActivity2 = launchActivity;
                    f11 = f10;
                    i14 = 0;
                }
            }
        }
        float f13 = f11;
        if (getUserConfig().W) {
            H.c(R.drawable.msg_settings_old, org.telegram.messenger.id.M0(2131745495, null), new cv(this, 3), false);
        }
        org.telegram.ui.ActionBar.z0 z0Var3 = this.o0;
        if (z0Var3 != null) {
            org.telegram.ui.ActionBar.t6.U(z0Var3.b, org.telegram.ui.ActionBar.m6.Oi, getResourceProvider());
            this.o0.setOnClickListener(new org.telegram.ui.Components.u41(12, this, H));
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0);
            String string = sharedPreferences.getString("proxy_ip", "");
            if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().y3 && !org.telegram.messenger.iz.z1.isEmpty())) {
                H.k();
                H.d(this.o0);
            }
        }
        H.Z();
        H.X(-org.telegram.messenger.g0.L(f13));
    }

    public final void X3(String str) {
        if (this.actionBar.c(str)) {
            return;
        }
        org.telegram.ui.ActionBar.y p10 = this.actionBar.p(str);
        boolean z9 = this.W;
        int i7 = 1;
        ArrayList arrayList = this.j1;
        if (z9) {
            ImageView imageView = new ImageView(getParentActivity());
            this.h1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.h1.setImageDrawable(new org.telegram.ui.ActionBar.y1(true));
            org.telegram.ui.ActionBar.t6.s(this.h1, org.telegram.ui.ActionBar.m6.y8, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.h1;
            int i10 = org.telegram.ui.ActionBar.m6.z8;
            org.telegram.ui.ActionBar.t6.Q(imageView2, org.telegram.ui.ActionBar.m6.h0(getThemedColor(i10), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i10), getResourceProvider());
            this.h1.setOnClickListener(new hu(this, 6));
            p10.addView(this.h1, c8.ha.r(54, 54, 16));
            arrayList.add(this.h1);
        }
        NumberTextView numberTextView = new NumberTextView(p10.getContext());
        this.i1 = numberTextView;
        numberTextView.setTextSize(18);
        this.i1.setTypeface(org.telegram.messenger.g0.o());
        this.i1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.m6.y8));
        p10.addView(this.i1, c8.ha.m(1.0f, 0, -1, this.W ? 18 : 72, 0, 0));
        this.i1.setOnTouchListener(new ei.b(2));
        this.l1 = p10.g(100, R.drawable.msg_pin, org.telegram.messenger.g0.L(48.0f));
        this.m1 = p10.g(org.telegram.messenger.qs.p1, R.drawable.msg_mute, org.telegram.messenger.g0.L(48.0f));
        this.n1 = p10.g(org.telegram.messenger.qs.s1, R.drawable.msg_archive, org.telegram.messenger.g0.L(48.0f));
        this.k1 = p10.h(org.telegram.messenger.qs.n1, R.drawable.msg_delete, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.id.M0(2131751598, null));
        org.telegram.ui.ActionBar.r0 h = p10.h(0, R.drawable.ic_ab_other, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.id.M0(2131754839, null));
        p10.addView(new View(getParentActivity()), c8.ha.o(5, -1));
        this.r1 = h.e(org.telegram.messenger.qs.q1, R.drawable.msg_archive, org.telegram.messenger.id.M0(2131754172, null));
        this.o1 = h.e(org.telegram.messenger.qs.t1, R.drawable.msg_pin, org.telegram.messenger.id.M0(2131751453, null));
        this.p1 = h.e(org.telegram.messenger.qs.u1, R.drawable.msg_addfolder, org.telegram.messenger.id.M0(2131750812, null));
        this.q1 = h.e(org.telegram.messenger.qs.v1, R.drawable.msg_removefolder, org.telegram.messenger.id.M0(2131750712, null));
        this.t1 = h.e(101, R.drawable.msg_markread, org.telegram.messenger.id.M0(2131748681, null));
        this.s1 = h.e(org.telegram.messenger.qs.o1, R.drawable.msg_clear, org.telegram.messenger.id.M0(2131752089, null));
        this.u1 = h.e(org.telegram.messenger.qs.r1, R.drawable.msg_block, org.telegram.messenger.id.M0(2131753692, null));
        this.m1.setOnLongClickListener(new tu(this, i7));
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
        for (String str : getMessagesController().S3) {
            if ("AUTOARCHIVE_POPULAR".equals(str)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = org.telegram.messenger.id.M0(2131749319, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131749320, null));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131749533, null), new iu(this, 6));
                showDialog(u1Var, new ou(this, 0));
                this.S3 = str;
                return;
            }
        }
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 1) {
            O3();
            Q3();
            T3();
            G3();
            R3();
            ow owVar = this.X;
            te.a aVar = this.b;
            owVar.setBlurredBackgroundVisibility(aVar.e);
            float a10 = a8.j7.a(aVar.e);
            org.telegram.ui.Components.k9 k9Var = this.c3;
            if (k9Var != null) {
                k9Var.setScaleX(a10);
                this.c3.setScaleY(a10);
                this.c3.setAlpha(a10);
                this.c3.setVisibility(a10 > 0.0f ? 0 : 8);
            }
            if (this.v0 != null) {
                float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, a10);
                this.v0.setScaleX(T1);
                this.v0.setScaleY(T1);
                this.v0.setAlpha(a10);
                this.v0.setVisibility(a10 > 0.0f ? 0 : 8);
                this.w0.setAlpha(a10);
                this.w0.setVisibility(a10 > 0.0f ? 0 : 8);
                return;
            }
            return;
        }
        if (i7 == 2) {
            O3();
            Q3();
            return;
        }
        if (i7 == 3) {
            M3();
            return;
        }
        if (i7 == 4) {
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
                return;
            }
            return;
        }
        if (i7 == 5) {
            L3();
            return;
        }
        if (i7 == 6) {
            O3();
            Q3();
        } else {
            if (i7 == 7) {
                H3();
                return;
            }
            if (i7 == 8) {
                G3();
                R3();
            } else if (i7 == 9) {
                R3();
            }
        }
    }

    public final void Y3() {
        iw iwVar = this.C0;
        if ((iwVar != null && iwVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        iw iwVar2 = new iw(this, getParentActivity(), this, this.o2 != null ? 2 : !this.m2 ? 1 : 0, this.S0, this.X2, this.Z2, new gv(this));
        this.C0 = iwVar2;
        this.glassEngine.c(iwVar2);
        ((sw) this.fragmentView).addView(this.C0, this.B0);
        iw iwVar3 = this.C0;
        iwVar3.d0.U = new kw(this);
        iwVar3.k0.setOnItemClickListener(new iu(this, 1));
        this.C0.p0.setOnItemClickListener(new iu(this, 2));
        this.C0.w0.setOnItemClickListener(new nu(this, 0));
        this.C0.p0.setOnItemLongClickListener(new iu(this, 3));
        this.C0.a0.setOnItemClickListener(new iu(this, 4));
        this.C0.a0.setOnItemLongClickListener(new gv(this));
        this.C0.setFilteredSearchViewDelegate(new iu(this, 5));
        this.C0.setAlpha(0.0f);
        this.C0.setScaleX(1.05f);
        this.C0.setScaleY(1.05f);
        this.C0.setVisibility(8);
        this.C0.setBlurredBackgroundDrawableFactory(this.p4);
    }

    public final void Y4(long j3, View view) {
        s3(j3, view);
        boolean x10 = this.actionBar.x();
        ArrayList arrayList = this.J2;
        boolean z9 = true;
        char c10 = 1;
        int i7 = 0;
        if (!x10) {
            if (this.r3) {
                X3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.s4)) {
                    this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
                }
            } else {
                X3(null);
            }
            org.telegram.messenger.g0.v1(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.m6.d6));
            this.actionBar.Q(null, null);
            int i10 = this.e0[0].s;
            ArrayList d42 = ((i10 == 7 || i10 == 8) && (!this.actionBar.x() || this.actionBar.y(null))) ? d4(this.currentAccount, this.e0[0].s, this.X2, this.T1) : getMessagesController().W0(this.X2);
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
                if (this.e0 != null) {
                    int i13 = 0;
                    while (true) {
                        yw[] ywVarArr = this.e0;
                        if (i13 >= ywVarArr.length) {
                            break;
                        }
                        ywVarArr[i13].d.H = true;
                        i13++;
                    }
                }
                int i14 = org.telegram.messenger.qp.C8;
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
                    view2.setPivotY(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2);
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
                yw[] ywVarArr2 = this.e0;
                if (i16 >= ywVarArr2.length) {
                    break;
                }
                yw ywVar = ywVarArr2[i16];
                if (ywVar != null) {
                    ywVar.a.I0(true);
                }
                i16++;
            }
            float max = Math.max(0.0f, org.telegram.messenger.g0.L((this.K ? 81 : 0) + 48) + this.N);
            if (max != 0.0f) {
                this.P = (int) max;
                this.fragmentView.requestLayout();
            }
            this.w3.addUpdateListener(new ju(this, max, i7));
            this.w3.addListener(new dw(this, max, c10 == true ? 1 : 0));
            this.w3.setInterpolator(org.telegram.ui.Components.wq.f);
            this.w3.setDuration(200L);
            this.w3.start();
            pw pwVar = this.z0;
            if (pwVar != null) {
                pwVar.b(org.telegram.ui.ActionBar.m6.ui, org.telegram.ui.ActionBar.m6.ti, org.telegram.ui.ActionBar.m6.si, org.telegram.ui.ActionBar.m6.vi, org.telegram.ui.ActionBar.m6.w8);
            }
            org.telegram.ui.ActionBar.y1 y1Var = this.f1;
            if (y1Var != null) {
                y1Var.c(true, 1.0f);
            }
            z9 = false;
        } else if (arrayList.isEmpty()) {
            n4(true);
            return;
        }
        f5(false);
        this.i1.a(arrayList.size(), z9);
    }

    public final void Z3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.y0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i7 = 0; i7 < 2; i7++) {
                undoViewArr[i7] = new ew(this, parentActivity);
                FrameLayout.LayoutParams d = c8.ha.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                d.bottomMargin = this.g4 + this.i4 + d.bottomMargin;
                sw swVar = (sw) this.fragmentView;
                UndoView undoView = undoViewArr[i7];
                int i10 = this.x0 + 1;
                this.x0 = i10;
                swVar.addView(undoView, i10, d);
            }
        }
    }

    public final void Z4(long j3, View view) {
        int i7 = -this.M3;
        this.M3 = i7;
        org.telegram.messenger.g0.G3(i7, view, null);
        org.telegram.messenger.p2.D.a();
        String p10 = j3 >= 0 ? org.telegram.messenger.t10.p(org.telegram.messenger.qp.s1(this.currentAccount).a2(Long.valueOf(j3))) : "";
        (getMessagesController().D3() ? org.telegram.ui.Components.gc.a0(this).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131743760, p10))) : org.telegram.ui.Components.gc.a0(this).K(R.raw.star_premium_2, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131743760, p10)), org.telegram.messenger.id.M0(2131743759, null), new fu(this, 8))).j();
    }

    public final void a4(final long j3, final long j10, boolean z9, final z91 z91Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String M0;
        String b02;
        String M02;
        TLRPC.TL_forumTopic f10;
        if (A3(j3)) {
            int i7 = this.S0;
            if (i7 == 11 || i7 == 12 || i7 == 13) {
                if (org.telegram.messenger.m5.E(j3)) {
                    TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j3));
                    if (!a22.mutual_contact) {
                        UndoView k42 = k4();
                        if (k42 != null) {
                            k42.j(45, j3, null);
                            return;
                        }
                        return;
                    }
                    user = a22;
                    chat = null;
                } else {
                    TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(-j3));
                    if (!org.telegram.messenger.t3.N(M03) || !org.telegram.messenger.t3.w(1, M03)) {
                        UndoView k43 = k4();
                        if (k43 != null) {
                            k43.j(46, j3, null);
                            return;
                        }
                        return;
                    }
                    chat = M03;
                    user = null;
                }
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), null);
                TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
                tL_messages_checkHistoryImportPeer.peer = getMessagesController().j1(j3);
                getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new bi.g4(this, u1Var, user, chat, j3, tL_messages_checkHistoryImportPeer));
                try {
                    u1Var.r(300L);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            if (!z9 || ((this.g2 == null || this.h2 == null) && this.i2 == null)) {
                if (i7 != 15) {
                    if (this.D2 == null) {
                        finishFragment();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(org.telegram.messenger.xr.a(j3, j10));
                    if (this.D2.y(this, arrayList, null, false, this.K2, this.L2, this.M2, z91Var) && this.j2) {
                        this.D2 = null;
                        return;
                    }
                    return;
                }
                Runnable d3Var = new bi.d3(this, j3, new bi.h4(this, j3, j10, z91Var, 6), 26);
                if (j3 < 0) {
                    c5(getMessagesController().M0(Long.valueOf(-j3)), d3Var, null);
                    return;
                }
                TLRPC.User a23 = getMessagesController().a2(Long.valueOf(j3));
                TLRPC.User a24 = getMessagesController().a2(Long.valueOf(this.H));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String a02 = org.telegram.messenger.id.a0(null, null, 2131754074, org.telegram.messenger.t10.j(a23, true), org.telegram.messenger.t10.j(a24, true));
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.a;
                u1Var2.R = a02;
                u1Var2.T = TextUtils.concat(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131754075, org.telegram.messenger.t10.j(a23, true), org.telegram.messenger.t10.j(a24, true))));
                alertDialog$Builder.k(org.telegram.messenger.id.a0("Send", null, 2131745640, new Object[0]), new zr(d3Var, 5));
                alertDialog$Builder.h(org.telegram.messenger.id.a0("Cancel", null, 2131752589, new Object[0]), new org.telegram.ui.Components.il0(16));
                showDialog(u1Var2);
                return;
            }
            if (getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
            if (org.telegram.messenger.m5.C(j3)) {
                TLRPC.User a25 = getMessagesController().a2(Long.valueOf(getMessagesController().a1(Integer.valueOf((int) (4294967295L & j3))).user_id));
                if (a25 == null) {
                    return;
                }
                M0 = org.telegram.messenger.id.M0(2131745596, null);
                b02 = org.telegram.messenger.id.b0(this.g2, org.telegram.messenger.t10.p(a25));
                M02 = org.telegram.messenger.id.M0(2131745640, null);
            } else if (!org.telegram.messenger.m5.E(j3)) {
                TLRPC.Chat M04 = getMessagesController().M0(Long.valueOf(-j3));
                if (M04 == null) {
                    return;
                }
                String str = M04.title;
                if (j10 != 0 && (f10 = getMessagesController().q7.f(M04.id, j10)) != null) {
                    str = ((Object) str) + " " + f10.title;
                }
                if (this.i2 != null) {
                    M0 = org.telegram.messenger.id.M0(2131754366, null);
                    b02 = org.telegram.messenger.id.b0(this.i2, str);
                    M02 = org.telegram.messenger.id.M0(2131754486, null);
                } else {
                    M0 = org.telegram.messenger.id.M0(2131745596, null);
                    b02 = org.telegram.messenger.id.b0(this.h2, str);
                    M02 = org.telegram.messenger.id.M0(2131745640, null);
                }
            } else if (j3 == getUserConfig().e()) {
                M0 = org.telegram.messenger.id.M0(2131745596, null);
                b02 = org.telegram.messenger.id.b0(this.h2, org.telegram.messenger.id.M0(2131745901, null));
                M02 = org.telegram.messenger.id.M0(2131745640, null);
            } else {
                TLRPC.User a26 = getMessagesController().a2(Long.valueOf(j3));
                if (a26 == null || this.g2 == null) {
                    return;
                }
                M0 = org.telegram.messenger.id.M0(2131745596, null);
                b02 = org.telegram.messenger.id.b0(this.g2, org.telegram.messenger.t10.p(a26));
                M02 = org.telegram.messenger.id.M0(2131745640, null);
            }
            org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder2.a;
            u1Var3.R = M0;
            u1Var3.T = org.telegram.messenger.g0.X2(b02);
            alertDialog$Builder2.k(M02, new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.bv
                @Override // org.telegram.ui.ActionBar.r1
                public final void g(org.telegram.ui.ActionBar.u1 u1Var4, int i10) {
                    zw.this.a4(j3, j10, false, z91Var);
                }
            });
            alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
            if (showDialog(u1Var3) == null) {
                u1Var3.show();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a5(boolean z9, boolean z10, boolean z11, boolean z12) {
        iw iwVar;
        iw iwVar2;
        sv svVar;
        iw iwVar3;
        boolean z13;
        iw iwVar4;
        boolean z14;
        org.telegram.ui.Components.u61 u61Var;
        TLRPC.Chat chat;
        vv vvVar;
        boolean z15 = z11;
        this.b.a(z9, z15);
        int i7 = 0;
        if (z9) {
            Y3();
        } else {
            q5(false);
        }
        int i10 = this.S0;
        if (i10 != 0 && i10 != 3) {
            z15 = false;
        }
        AnimatorSet animatorSet = this.x1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.x1 = null;
        }
        this.r3 = z9;
        this.glassEngine.g();
        if (!z9) {
            i5(false, z15);
        }
        if (z9) {
            if (!this.u3 && !z12) {
                ArrayList arrayList = (ArrayList) getMessagesController().w.get(0);
                int size = arrayList != null ? arrayList.size() : 0;
                if (this.m2 || (size <= 10 && !this.K)) {
                    z13 = true;
                    iwVar4 = this.C0;
                    if (iwVar4 != null) {
                        iwVar4.Q0 = z13;
                    }
                    z14 = z13 || this.K;
                    this.t3 = z14;
                    if (z14) {
                        this.u3 = true;
                    }
                    u61Var = this.a0;
                    if (u61Var != null && iwVar4 != null && !z13 && this.Z2 == 0) {
                        org.telegram.ui.Components.u61 n10 = iwVar4.n(-2, false);
                        this.a0 = n10;
                        this.Z.addView(n10, 0, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
                    } else if (this.Z != null && z13 && this.Z2 == 0) {
                        org.telegram.messenger.g0.E2(u61Var);
                        this.a0 = null;
                    }
                    if (this.C0 != null) {
                        S3(false);
                        this.C0.setKeyboardHeight(((sw) this.fragmentView).getKeyboardHeight());
                        iw iwVar5 = this.C0;
                        iwVar5.C0.clear();
                        iwVar5.L();
                    }
                    chat = this.a3;
                    if (chat == null) {
                        jg.o0 o0Var = new jg.o0(R.drawable.search_users_filled, 4, org.telegram.messenger.m5.u(chat));
                        o0Var.f = this.a3;
                        t3(o0Var);
                    } else if (this.X2 != 0 && ((vvVar = this.G3) == null || !vvVar.c())) {
                        t3(new jg.o0(R.drawable.chats_archive, 2131754150, null, 7));
                    }
                }
            }
            z13 = false;
            iwVar4 = this.C0;
            if (iwVar4 != null) {
            }
            if (z13) {
            }
            this.t3 = z14;
            if (z14) {
            }
            u61Var = this.a0;
            if (u61Var != null) {
            }
            if (this.Z != null) {
                org.telegram.messenger.g0.E2(u61Var);
                this.a0 = null;
            }
            if (this.C0 != null) {
            }
            chat = this.a3;
            if (chat == null) {
            }
        }
        if (z15 && (iwVar3 = this.C0) != null && iwVar3.d0.M()) {
            org.telegram.messenger.g0.l3(getParentActivity(), this.classGuid);
        } else {
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        }
        if (!z9 && (svVar = this.E0) != null && this.G0) {
            svVar.setVisibility(0);
        }
        Object[] objArr = org.telegram.messenger.iz.o() == 0 || !org.telegram.messenger.sc.e(32768);
        if (z15) {
            if (z9) {
                iw iwVar6 = this.C0;
                if (iwVar6 != null) {
                    iwVar6.setVisibility(0);
                    iw iwVar7 = this.C0;
                    iwVar7.setPosition(0);
                    if (iwVar7.d0.b() > 0) {
                        iwVar7.e0.h1(0, 0);
                    }
                    v4.b0 b0Var = iwVar7.j0;
                    if (b0Var != null) {
                        b0Var.h1(0, 0);
                    }
                    v4.b0 b0Var2 = iwVar7.o0;
                    if (b0Var2 != null) {
                        b0Var2.h1(0, 0);
                    }
                    v4.b0 b0Var3 = iwVar7.v0;
                    if (b0Var3 != null) {
                        b0Var3.h1(0, 0);
                    }
                    iwVar7.h.clear();
                }
                j5(true, null, null, false, false);
                org.telegram.ui.Components.u61 u61Var2 = this.a0;
                if (u61Var2 != null) {
                    u61Var2.b(false, false);
                }
            } else {
                this.e0[0].a.setVisibility(0);
                this.e0[0].setVisibility(0);
            }
            M4(true, true);
            this.e0[0].a.setVerticalScrollBarEnabled(false);
            iw iwVar8 = this.C0;
            if (iwVar8 != null) {
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, iwVar8, getResourceProvider());
            }
            this.x1 = new AnimatorSet();
            ArrayList arrayList2 = new ArrayList();
            yw ywVar = this.e0[0];
            Property property = View.ALPHA;
            arrayList2.add(ObjectAnimator.ofFloat(ywVar, (Property<yw, Float>) property, z9 ? 0.0f : 1.0f));
            if (objArr == true) {
                this.e0[0].setScaleX(1.0f);
                this.e0[0].setScaleY(1.0f);
            } else {
                arrayList2.add(ObjectAnimator.ofFloat(this.e0[0], (Property<yw, Float>) View.SCALE_X, z9 ? 0.95f : 1.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.e0[0], (Property<yw, Float>) View.SCALE_Y, z9 ? 0.95f : 1.0f));
            }
            vv vvVar2 = this.G3;
            if (vvVar2 != null) {
                vvVar2.setVisibility(0);
                arrayList2.add(ObjectAnimator.ofFloat(this.G3, (Property<vv, Float>) property, z9 ? 0.0f : 1.0f));
            }
            iw iwVar9 = this.C0;
            if (iwVar9 != null) {
                arrayList2.add(ObjectAnimator.ofFloat(iwVar9, (Property<iw, Float>) property, z9 ? 1.0f : 0.0f));
                if (this.K) {
                    float L = org.telegram.messenger.g0.L(81.0f) + this.N + org.telegram.messenger.g0.L(48.0f);
                    iw iwVar10 = this.C0;
                    float f10 = z9 ? L : 0.0f;
                    if (z9) {
                        L = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(iwVar10, this.I3, f10, L));
                }
                if (objArr == true) {
                    this.C0.setScaleX(1.0f);
                    this.C0.setScaleY(1.0f);
                } else {
                    arrayList2.add(ObjectAnimator.ofFloat(this.C0, (Property<iw, Float>) View.SCALE_X, z9 ? 1.0f : 1.05f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.C0, (Property<iw, Float>) View.SCALE_Y, z9 ? 1.0f : 1.05f));
                }
            }
            if (this.g0 != null) {
                m5(false, false);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y1, z9 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new mu(this, i7));
            arrayList2.add(ofFloat);
            this.x1.playTogether(arrayList2);
            this.x1.setDuration(z9 ? 200L : 180L);
            this.x1.setInterpolator(org.telegram.ui.Components.wq.g);
            if (!z9) {
                this.x1.setStartDelay(20L);
            }
            this.x1.addListener(new bw(this, z9, i7));
            this.q3.d();
            this.x1.start();
        } else {
            M4(false, true);
            if (z9) {
                this.e0[0].a.c1();
            } else {
                vw vwVar = this.e0[0].a;
                if (vwVar.g1) {
                    vwVar.g1 = false;
                    vwVar.K0(false);
                }
            }
            this.e0[0].setAlpha(z9 ? 0.0f : 1.0f);
            if (objArr == true) {
                this.e0[0].setScaleX(1.0f);
                this.e0[0].setScaleY(1.0f);
            } else {
                this.e0[0].setScaleX(z9 ? 0.95f : 1.0f);
                this.e0[0].setScaleY(z9 ? 0.95f : 1.0f);
            }
            iw iwVar11 = this.C0;
            if (iwVar11 != null) {
                iwVar11.setAlpha(z9 ? 1.0f : 0.0f);
                if (objArr == true) {
                    this.C0.setScaleX(1.0f);
                    this.C0.setScaleY(1.0f);
                } else {
                    this.C0.setScaleX(z9 ? 1.0f : 1.1f);
                    this.C0.setScaleY(z9 ? 1.0f : 1.1f);
                }
                this.C0.setVisibility(z9 ? 0 : 8);
            }
            ow owVar = this.X;
            if (owVar != null) {
                owVar.setTranslationY(i4() + (z9 ? -org.telegram.messenger.g0.L(36.0f) : 0));
            }
            if (this.E0 != null) {
                if (!this.G0 || isInPreviewMode() || z9) {
                    this.E0.setVisibility(8);
                } else {
                    this.E0.setVisibility(0);
                }
            }
            P4(z9 ? 1.0f : 0.0f);
            this.fragmentView.invalidate();
        }
        int i11 = this.y;
        if (i11 >= 0 && (iwVar2 = this.C0) != null) {
            iwVar2.setPosition(iwVar2.N(i11));
        }
        if (!z9) {
            this.y = -1;
        }
        if (z9 && z10 && (iwVar = this.C0) != null) {
            iwVar.setPosition((iwVar.s0 ? 1 : 0) + 5);
            q5(true);
        }
        R3();
        g5();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Wk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Vk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.al));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Zk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Yk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Xk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Qi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.g8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Gj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.He));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.W8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Wl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.e9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.M7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.N7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.h9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.n9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.l9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.b8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.a8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Z7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Y7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.X7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.W7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.V7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.K7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.nk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Z5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.y9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.x9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.w9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.t9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.r9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.b9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.vi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.I5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.E8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G8));
    }

    public final void b4(long j3, boolean z9) {
        if (this.e0 == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            yw[] ywVarArr = this.e0;
            if (i7 >= ywVarArr.length) {
                return;
            }
            int childCount = ywVarArr[i7].a.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 < childCount) {
                    View childAt = this.e0[i7].a.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.t2) {
                        org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) childAt;
                        if (t2Var.getDialogId() == j3) {
                            t2Var.c0(z9, true);
                            break;
                        }
                    }
                    i10++;
                }
            }
            i7++;
        }
    }

    public final void b5() {
        int i7;
        int i10;
        if (this.M0 != null || org.telegram.messenger.iz.x || (this.K && !this.E0.g())) {
            return;
        }
        k11[] k11VarArr = new k11[1];
        TLRPC.User f10 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).f();
        org.telegram.ui.ActionBar.m5 titleTextView = this.actionBar.getTitleTextView();
        if (titleTextView == null || titleTextView.getRightDrawable() == null) {
            i7 = 0;
            i10 = 0;
        } else {
            this.E3.f();
            Drawable drawable = this.E3.f[0];
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set(titleTextView.getRightDrawable().getBounds());
            rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
            int L = (-(this.actionBar.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
            i7 = org.telegram.messenger.g0.L(4.0f) + (rect.centerX() - org.telegram.messenger.g0.L(16.0f));
            org.telegram.ui.Cells.o oVar = this.F3;
            if (oVar != null) {
                oVar.b(rect.centerX(), rect.centerY());
            }
            i10 = L;
        }
        wv wvVar = new wv(this, this, getParentActivity(), Integer.valueOf(i7), getResourceProvider(), k11VarArr);
        if (f10 != null && org.telegram.messenger.m5.g(f10.emoji_status) > 0) {
            wvVar.setExpireDateHint(org.telegram.messenger.m5.g(f10.emoji_status));
        }
        Long l10 = this.C3;
        if (l10 != null) {
            wvVar.setSelected(l10);
        } else {
            Drawable drawable2 = this.E3.f[0];
            wvVar.setSelected(drawable2 instanceof org.telegram.ui.Components.h5 ? Long.valueOf(((org.telegram.ui.Components.h5) drawable2).h()) : null);
        }
        wvVar.setSaveState(1);
        wvVar.y(this.E3, titleTextView);
        xv xvVar = new xv(this, wvVar);
        this.M0 = xvVar;
        k11VarArr[0] = xvVar;
        xvVar.showAsDropDown(this.actionBar, org.telegram.messenger.g0.L(16.0f), i10, 48);
        k11VarArr[0].b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0069, code lost:
    
        if (r13.G.bot_admin_rights != null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v0, types: [org.telegram.ui.ActionBar.f2, org.telegram.ui.zw] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c5(TLRPC.Chat chat, Runnable runnable, Runnable runnable2) {
        CharSequence charSequence;
        String a02;
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.H));
        boolean V = org.telegram.messenger.t3.V(chat);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        int i7 = 1;
        int i10 = 2;
        String a03 = org.telegram.messenger.id.a0(null, null, 2131754074, chat.title, org.telegram.messenger.t10.j(a22, true));
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = a03;
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131754075, chat.title, org.telegram.messenger.t10.j(a22, true)));
        Boolean bool = this.G.bot_participant;
        ?? r10 = "";
        if (bool == null || !bool.booleanValue() || getMessagesController().x2(chat, a22)) {
            charSequence = r10;
        }
        if (this.G.bot_admin_rights == null) {
            a02 = org.telegram.messenger.id.a0(null, null, 2131754077, org.telegram.messenger.t10.j(a22, true), chat.title);
        } else {
            String j3 = org.telegram.messenger.t10.j(a22, true);
            String str = chat.title;
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.G.bot_admin_rights;
            int i11 = org.telegram.ui.Cells.o6.c;
            ArrayList arrayList = new ArrayList();
            if (tL_chatAdminRights.change_info) {
                org.telegram.ui.Cells.f1.p(1, V ? org.telegram.messenger.id.M0(2131751324, null) : org.telegram.messenger.id.M0(2131751323, null), arrayList);
            }
            if (tL_chatAdminRights.post_messages && V) {
                org.telegram.ui.Cells.f1.p(1, org.telegram.messenger.id.M0(2131751312, null), arrayList);
            }
            if (tL_chatAdminRights.edit_messages && V) {
                org.telegram.ui.Cells.f1.p(1, org.telegram.messenger.id.M0(2131751319, null), arrayList);
            }
            if (tL_chatAdminRights.delete_messages) {
                org.telegram.ui.Cells.f1.p(1, org.telegram.messenger.id.M0(V ? 2131751321 : 2131751316, null), arrayList);
            }
            if (tL_chatAdminRights.ban_users && !V) {
                org.telegram.ui.Cells.f1.p(1, org.telegram.messenger.id.M0(2131751328, null), arrayList);
            }
            if (tL_chatAdminRights.invite_users) {
                org.telegram.ui.Cells.f1.p(1, org.telegram.messenger.id.M0(2131751330, null), arrayList);
            }
            if (tL_chatAdminRights.pin_messages && !V) {
                org.telegram.ui.Cells.f1.p(1, org.telegram.messenger.id.M0(2131751313, null), arrayList);
            }
            if (tL_chatAdminRights.add_admins) {
                org.telegram.ui.Cells.f1.p(1, org.telegram.messenger.id.M0(2131751331, null), arrayList);
            }
            if (tL_chatAdminRights.anonymous && !V) {
                org.telegram.ui.Cells.f1.p(1, org.telegram.messenger.id.M0(2131751303, null), arrayList);
            }
            if (tL_chatAdminRights.manage_call) {
                org.telegram.ui.Cells.f1.p(1, org.telegram.messenger.id.M0(2131744901, null), arrayList);
            }
            if (tL_chatAdminRights.manage_topics && !V) {
                org.telegram.ui.Cells.f1.p(1, org.telegram.messenger.id.M0(2131748692, null), arrayList);
            }
            if (arrayList.size() == 1) {
                r10 = ((org.telegram.ui.Cells.p6) arrayList.get(0)).b.toString().toLowerCase();
            } else if (!arrayList.isEmpty()) {
                r10 = new SpannableStringBuilder();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    if (i12 > 0) {
                        r10.append(", ");
                    }
                    r10.append(((org.telegram.ui.Cells.p6) arrayList.get(i12)).b.toString().toLowerCase());
                }
            }
            a02 = org.telegram.messenger.id.a0(null, null, 2131754076, new Object[]{j3, str, r10});
        }
        charSequence = TextUtils.concat("\n\n", org.telegram.messenger.g0.X2(a02));
        u1Var.T = TextUtils.concat(X2, charSequence);
        alertDialog$Builder.k(org.telegram.messenger.id.a0("Send", null, 2131745640, new Object[0]), new we(i7, runnable));
        alertDialog$Builder.h(org.telegram.messenger.id.a0("Cancel", null, 2131752589, new Object[0]), new we(i10, runnable2));
        showDialog(u1Var);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean canBeginSlide() {
        pw pwVar;
        if (this.G3.c()) {
            return false;
        }
        return this.S0 != 3 || (pwVar = this.z0) == null || pwVar.getVisibility() != 0 || this.z0.K <= 0;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean closeLastFragment() {
        if (!this.G3.c()) {
            return super.closeLastFragment();
        }
        this.G3.a();
        iw iwVar = this.C0;
        if (iwVar == null) {
            return true;
        }
        iwVar.S();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.ActionBar.l createActionBar(Context context) {
        org.telegram.ui.Components.q7 q7Var = new org.telegram.ui.Components.q7(this, context, this.resourceProvider, 3);
        q7Var.setAllowOverlayTitle(true);
        q7Var.G0 = true;
        if (q7Var.F0 == null) {
            di.b4 b4Var = new di.b4(q7Var.getContext(), 5);
            q7Var.F0 = b4Var;
            q7Var.addView(b4Var);
        }
        org.telegram.ui.ActionBar.t6.l(q7Var, 3, org.telegram.ui.ActionBar.m6.t8, getResourceProvider());
        org.telegram.ui.ActionBar.t6.a(q7Var, org.telegram.ui.ActionBar.m6.z8, getResourceProvider(), true);
        org.telegram.ui.ActionBar.t6.l(q7Var, 1, org.telegram.ui.ActionBar.m6.v8, getResourceProvider());
        org.telegram.ui.ActionBar.t6.b(q7Var, org.telegram.ui.ActionBar.m6.y8, getResourceProvider(), true);
        if (q7Var.x1 == null) {
            di.j jVar = new di.j(q7Var, q7Var.getContext(), q7Var.J0, q7Var.O0);
            q7Var.x1 = jVar;
            jVar.setClipChildren(false);
            q7Var.addView(q7Var.x1);
        }
        q7Var.getAdditionalSubTitleOverlayContainer().setTranslationX(org.telegram.messenger.g0.L(4.0f));
        q7Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-org.telegram.messenger.g0.L(3.0f));
        if (!this.inPreviewMode && (!org.telegram.messenger.g0.Q1() || this.X2 == 0 || q4())) {
            return q7Var;
        }
        q7Var.setOccupyStatusBar(false);
        return q7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0c0d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0c4f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0c78  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0cba  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0cd0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0cf7  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0dae  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0e0b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0e44  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0dc8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0c80  */
    /* JADX WARN: Type inference failed for: r10v16, types: [org.telegram.ui.Components.pj0, org.telegram.ui.vw] */
    /* JADX WARN: Type inference failed for: r10v21, types: [org.telegram.ui.Components.pj0, org.telegram.ui.vw] */
    /* JADX WARN: Type inference failed for: r10v22, types: [org.telegram.ui.Components.pj0, org.telegram.ui.vw] */
    /* JADX WARN: Type inference failed for: r10v24, types: [org.telegram.ui.fv, v4.b0] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r15v10, types: [org.telegram.ui.Components.pj0, org.telegram.ui.vw] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r9v46, types: [android.graphics.drawable.BitmapDrawable] */
    @Override // org.telegram.ui.ActionBar.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        float f10;
        float f11;
        float f12;
        cn cnVar;
        pw pwVar;
        ow owVar;
        ow owVar2;
        org.telegram.ui.Components.or orVar;
        xw xwVar;
        v4.y yVar;
        jg.n nVar;
        jg.n nVar2;
        jg.n nVar3;
        jg.n nVar4;
        jg.n nVar5;
        jg.n nVar6;
        tw twVar;
        int i7;
        int i10;
        TLRPC.UserProfilePhoto userProfilePhoto;
        ?? r92;
        int i11;
        Context context2 = context;
        ?? r11 = 0;
        ?? r112 = 0;
        ?? r113 = 0;
        ?? r114 = 0;
        this.k2 = false;
        this.l2 = false;
        this.V = false;
        this.W0 = null;
        this.z0 = null;
        ArrayList arrayList = this.J2;
        arrayList.clear();
        this.m3 = ViewConfiguration.get(context2).getScaledMaximumFlingVelocity();
        org.telegram.messenger.g0.h3(new eu(context2, 0));
        this.O1 = null;
        this.M1 = null;
        this.N1 = null;
        this.R1 = null;
        this.K1 = null;
        org.telegram.ui.ActionBar.y s5 = this.actionBar.s();
        s5.setTranslationX(-org.telegram.messenger.g0.L(5.0f));
        org.telegram.ui.ActionBar.r0 a10 = s5.a(0, R.drawable.outline_header_search);
        a10.N();
        this.j0 = a10;
        int i12 = 3;
        a10.setOnClickListener(new hu(this, i12));
        int i13 = 8;
        int i14 = 2;
        if (this.S0 == 2 || (q4() && d4(this.currentAccount, this.S0, this.X2, false).isEmpty())) {
            this.j0.setVisibility(8);
        }
        this.j0.setVisibility(8);
        ?? r52 = 1;
        ?? r53 = 1;
        if (!this.m2 && this.o2 == null && this.X2 == 0 && this.Z2 == 0) {
            int i15 = org.telegram.ui.ActionBar.m6.t8;
            int themedColor = getThemedColor(i15);
            int i16 = org.telegram.ui.ActionBar.m6.v8;
            org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(context2, themedColor, getThemedColor(i16));
            this.m0 = r0Var;
            r0Var.setText(org.telegram.messenger.id.L0(2131751354).toUpperCase());
            if (this.m0.getTextView() != null) {
                org.telegram.ui.ActionBar.t6.U(this.m0.getTextView(), i16, getResourceProvider());
            }
            org.telegram.ui.ActionBar.r0 r0Var2 = this.m0;
            org.telegram.ui.ActionBar.t6.Q(r0Var2, r0Var2.getBackground(), null, org.telegram.ui.ActionBar.t6.M(i15), getResourceProvider());
            this.actionBar.addView(this.m0, c8.ha.d(-2, -2.0f, 53, 0.0f, 0.0f, 10.0f, 0.0f));
            this.m0.setOnClickListener(new hu(this, i13));
            this.m0.setAlpha(0.0f);
            this.m0.setVisibility(8);
            this.n0 = new org.telegram.ui.Components.ig0(context2);
            org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(context2, this.resourceProvider, false, true);
            this.o0 = z0Var;
            z0Var.setItemHeight(56);
            this.o0.j(org.telegram.messenger.id.L0(2131748605), 0, this.n0);
            this.o0.setContentDescription(org.telegram.messenger.id.L0(2131746601));
            org.telegram.ui.ActionBar.r0 a11 = s5.a(1, R.drawable.outline_header_lock_24);
            this.f0 = a11;
            a11.setContentDescription(org.telegram.messenger.id.L0(2131754813));
            org.telegram.ui.ActionBar.r0 d = s5.d(3, new ColorDrawable(0));
            this.g0 = d;
            bx bxVar = new bx(context2, this.currentAccount);
            this.h0 = bxVar;
            d.addView(bxVar);
            this.g0.setContentDescription(org.telegram.messenger.id.L0(2131751343));
            this.g0.setVisibility(8);
            m5(false, false);
        }
        ow owVar3 = new ow(context2, this.resourceProvider);
        this.X = owVar3;
        owVar3.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        this.X.setPivotX(0.0f);
        this.X.setPivotY(0.0f);
        int i17 = 9;
        if (this.S0 == 0) {
            org.telegram.ui.ActionBar.r0 a12 = s5.a(-47, R.drawable.avd_speed);
            this.l0 = a12;
            org.telegram.messenger.g0.E2(a12);
            this.l0.setOnClickListener(new hu(this, i17));
            this.X.a(this.l0);
            this.X.updateColors();
        }
        this.X.setCloseButtonOnClickListener(new fu(this, 16));
        this.X.r.setOnFocusChangeListener(new fd(this, r53 == true ? 1 : 0));
        ah.i iVar = this.X.r;
        int i18 = 11;
        bg.p0 p0Var = new bg.p0(iVar, new kg.v1(this, i18));
        this.Y = p0Var;
        iVar.addTextChangedListener(p0Var);
        this.X.setSearchFiltersListener(new gv(this));
        this.Y.a();
        int i19 = 10;
        if (this.S0 == 0) {
            org.telegram.ui.ActionBar.r0 a13 = s5.a(4, R.drawable.ic_ab_other);
            this.k0 = a13;
            a13.setContentDescription(org.telegram.messenger.id.L0(2131754839));
            this.k0.setOnClickListener(new hu(this, i19));
            this.k0.setOnLongClickListener(new tu(this, i12));
        }
        this.j0.setSearchFieldHint(org.telegram.messenger.id.L0(2131745836));
        this.j0.setContentDescription(org.telegram.messenger.id.L0(2131745836));
        if (this.m2) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            int i20 = this.S0;
            if (i20 == 16) {
                this.actionBar.setTitle(org.telegram.messenger.id.L0(2131753100));
            } else if (this.N0) {
                this.actionBar.setTitle(org.telegram.messenger.id.L0(2131746252));
            } else if (this.O0) {
                this.actionBar.setTitle(org.telegram.messenger.id.L0(2131746429));
            } else if (i20 == 3 && this.g2 == null) {
                this.actionBar.setTitle(org.telegram.messenger.id.L0(2131750575));
            } else if (i20 == 10) {
                this.actionBar.setTitle(org.telegram.messenger.id.L0(2131745668));
            } else if (i20 == 14) {
                boolean z9 = this.B2;
                if (!z9 || this.A2 || this.w2 || this.z2) {
                    boolean z10 = this.A2;
                    if (!z10 || z9 || this.w2 || this.z2) {
                        boolean z11 = this.w2;
                        if (!z11 || z10 || z9) {
                            i11 = 2131745669;
                        } else {
                            i11 = 2131745669;
                            if (!this.z2) {
                                this.actionBar.setTitle(org.telegram.messenger.id.L0(2131752125));
                            }
                        }
                        if (!this.z2 || z10 || z9 || z11) {
                            this.actionBar.setTitle(org.telegram.messenger.id.L0(i11));
                        } else {
                            this.actionBar.setTitle(org.telegram.messenger.id.L0(2131752135));
                        }
                    } else {
                        this.actionBar.setTitle(org.telegram.messenger.id.L0(2131752110));
                    }
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.id.L0(2131752137));
                }
            } else {
                TLRPC.RequestPeerType requestPeerType = this.G;
                if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                    Boolean bool = ((TLRPC.TL_requestPeerTypeUser) requestPeerType).bot;
                    if (bool == null) {
                        this.actionBar.setTitle(org.telegram.messenger.id.L0(2131752110));
                    } else if (bool.booleanValue()) {
                        this.actionBar.setTitle(org.telegram.messenger.id.L0(2131752137));
                    } else {
                        this.actionBar.setTitle(org.telegram.messenger.id.L0(2131752110));
                    }
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
                    this.actionBar.setTitle(org.telegram.messenger.id.L0(2131752135));
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
                    this.actionBar.setTitle(org.telegram.messenger.id.L0(2131752125));
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.id.L0(2131745669));
                }
            }
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, this.actionBar, getResourceProvider());
        } else {
            if (this.o2 != null || this.X2 != 0 || this.Z2 != 0) {
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
                this.f1 = y1Var;
                lVar.setBackButtonDrawable(y1Var);
            }
            if (this.X2 != 0) {
                this.actionBar.setTitle(org.telegram.messenger.id.L0(2131754136));
            } else if (this.Z2 != 0) {
                this.actionBar.setTitle(org.telegram.messenger.m5.m(this.a3));
                this.actionBar.setAdditionalTextLeft(org.telegram.messenger.g0.L(28.0f));
                this.d3 = new org.telegram.ui.Components.v8(this.a3);
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(getContext());
                this.c3 = k9Var;
                k9Var.setRoundRadius(org.telegram.messenger.g0.L(11.0f));
                this.c3.e(this.a3, this.d3);
                this.actionBar.addView(this.c3, c8.ha.d(32, 32.0f, 83, 58.0f, 0.0f, 0.0f, 12.0f));
            } else {
                org.telegram.ui.Components.f5 f5Var = new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(26.0f), null);
                this.E3 = f5Var;
                f5Var.a = true;
                Drawable h = jg.g.h(context2, R.drawable.telegram_logo_2);
                this.D3 = h;
                h.setBounds(0, org.telegram.messenger.g0.L(2.0f), this.D3.getIntrinsicWidth(), this.D3.getIntrinsicHeight() + org.telegram.messenger.g0.L(2.0f));
                Drawable drawable = this.D3;
                int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.m6.Ul);
                this.w4 = themedColor2;
                drawable.setColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.id.L0(R.string.AppName));
                spannableStringBuilder.setSpan(new ImageSpan(this.D3), 0, spannableStringBuilder.length(), 33);
                this.actionBar.L(spannableStringBuilder, this.E3);
                r5(org.telegram.messenger.p10.i(this.currentAccount).f(), false);
            }
            if (this.X2 == 0) {
                this.actionBar.setSupportsHolidayImage(true);
            }
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        int i21 = 17;
        this.actionBar.setTitleActionRunnable(new fu(this, i21));
        int i22 = this.S0;
        if (((i22 == 0 && !this.m2) || i22 == 3) && this.X2 == 0 && this.Z2 == 0 && TextUtils.isEmpty(this.o2)) {
            pw pwVar2 = new pw(this, context2, this.resourceProvider);
            this.z0 = pwVar2;
            pwVar2.setVisibility(8);
            this.x = false;
            this.r.a(false, false);
            this.z0.setDelegate(new qw(context2, this));
        }
        if (this.s2 && org.telegram.messenger.p10.c() > 1) {
            this.E1 = s5.g(11, 0, org.telegram.messenger.g0.L(56.0f));
            org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8();
            v8Var.u(org.telegram.messenger.g0.L(12.0f));
            org.telegram.ui.Components.k9 k9Var2 = new org.telegram.ui.Components.k9(context2);
            k9Var2.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
            this.E1.addView(k9Var2, c8.ha.e(36, 36, 17));
            this.E1.setOnClickListener(new hu(this, i18));
            this.E1.setOnLongClickListener(new tu(this, i14));
            TLRPC.User f13 = getUserConfig().f();
            v8Var.r(f13);
            ImageReceiver imageReceiver = k9Var2.getImageReceiver();
            int i23 = this.currentAccount;
            imageReceiver.d = i23;
            k9Var2.m(org.telegram.messenger.hc.m(i23, 1, f13), "50_50", org.telegram.messenger.hc.n(f13), "50_50", (f13 == null || (userProfilePhoto = f13.photo) == null || (r92 = userProfilePhoto.strippedBitmap) == null) ? v8Var : r92, f13);
        }
        this.actionBar.setActionBarMenuOnItemClick(new w9(this, 27));
        sw swVar = new sw(context2, this);
        this.fragmentView = swVar;
        this.s4 = new xu(this, swVar, new PointF(), r114 == true ? 1 : 0);
        int i24 = (this.X2 == 0 && this.Z2 == 0 && (((i10 = this.S0) == 0 && !this.m2) || i10 == 3)) ? 2 : 1;
        this.e0 = new yw[i24];
        int i25 = 0;
        while (i25 < i24) {
            yw ywVar = new yw(context2, this);
            swVar.addView(ywVar, c8.ha.c(-1.0f, -1));
            ywVar.s = this.S0;
            this.e0[i25] = ywVar;
            ywVar.x = new org.telegram.ui.Components.lz(context2);
            ywVar.x.setViewType(7);
            ywVar.x.setVisibility(8);
            ywVar.addView(ywVar.x, c8.ha.e(-2, -2, i21));
            vw vwVar = new vw(this, context2, ywVar);
            ywVar.a = vwVar;
            this.glassEngine.b(vwVar);
            ?? r15 = ywVar.a;
            ywVar.b = new a8.wa((org.telegram.ui.Components.pj0) r15);
            r15.setAllowStopHeaveOperations(r52);
            ywVar.a.setAccessibilityEnabled(false);
            ywVar.a.o1(0, r52);
            ywVar.a.setClipToPadding(false);
            ywVar.a.setPivotY(0.0f);
            if (this.S0 == 15) {
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.a7, ywVar.a, getResourceProvider());
            }
            ywVar.y = new dv(ywVar.a, ywVar);
            ywVar.a.setVerticalScrollBarEnabled(r52);
            ywVar.a.setInstantClick(r52);
            ywVar.c = new fv(this, ywVar);
            ywVar.c.j1(r52);
            ywVar.a.setLayoutManager(ywVar.c);
            ywVar.a.setVerticalScrollbarPosition(org.telegram.messenger.id.a0 ? r52 : 2);
            ywVar.addView(ywVar.a, c8.ha.c(-1.0f, -1));
            ywVar.a.setOnItemClickListener(new su(r52, this, ywVar));
            ywVar.a.setOnItemLongClickListener(new m4.d0(this, ywVar, r113 == true ? 1 : 0));
            ywVar.f = new xw(this, ywVar);
            ywVar.D = new org.telegram.ui.Components.si0(ywVar.a, false);
            xwVar = ywVar.f;
            ywVar.e = new v4.y(xwVar);
            yVar = ywVar.e;
            yVar.h(ywVar.a);
            ywVar.a.setOnScrollListener(new hv(this, ywVar, swVar));
            ywVar.w = org.telegram.messenger.iz.q1 ? 2 : 0;
            if (ywVar.n == null && this.X2 == 0 && this.Z2 == 0) {
                ywVar.n = new iv(org.telegram.messenger.id.L0(2131754720), org.telegram.messenger.id.L0(2131754722), ywVar);
                if (l4()) {
                    ywVar.n.h();
                } else {
                    ywVar.n.b();
                }
                iv ivVar = ywVar.n;
                i7 = ywVar.w;
                ivVar.g(i7 != 0);
            }
            sw swVar2 = swVar;
            int i26 = i25;
            int i27 = i24;
            context2 = context;
            ywVar.d = new jv(this, this, context, ywVar.s, this.X2, this.m2, arrayList, this.currentAccount, this.G, ywVar);
            nVar = ywVar.d;
            nVar.S(ywVar.a);
            nVar2 = ywVar.d;
            nVar2.Q(this.u2);
            if (ywVar.s == 3) {
                nVar6 = ywVar.d;
                nVar6.N(getMessagesController().W4() && (twVar = this.D2) != null && twVar.G());
            }
            if (org.telegram.messenger.g0.Q1()) {
                org.telegram.messenger.xr xrVar = this.q2;
                if (xrVar.a != 0) {
                    nVar5 = ywVar.d;
                    nVar5.R(xrVar.a);
                }
            }
            nVar3 = ywVar.d;
            nVar3.O(ywVar.n);
            vw vwVar2 = ywVar.a;
            nVar4 = ywVar.d;
            vwVar2.setAdapter(nVar4);
            ywVar.a.setEmptyView((this.X2 == 0 && this.Z2 == 0) ? ywVar.x : null);
            ywVar.r = new org.telegram.ui.Components.ri0(ywVar.a, ywVar.c);
            org.telegram.ui.Components.ri0 ri0Var = ywVar.r;
            ri0Var.c = true;
            ri0Var.d = true;
            ri0Var.h = new iu(this, 13);
            if (i26 != 0) {
                this.e0[i26].setVisibility(8);
            }
            i25 = i26 + 1;
            r52 = 1;
            swVar = swVar2;
            i24 = i27;
            i21 = 17;
        }
        sw swVar3 = swVar;
        int i28 = r52;
        org.telegram.ui.Components.nr nrVar = new org.telegram.ui.Components.nr(context2);
        this.L1 = nrVar;
        int i29 = org.telegram.ui.ActionBar.m6.d6;
        nrVar.setColor(org.telegram.ui.ActionBar.m6.v0(i29));
        swVar3.addView(this.L1, c8.ha.e(-1, 100, 48));
        this.B0 = swVar3.getChildCount();
        gz0 gz0Var = new gz0((Activity) getContext());
        this.Z = gz0Var;
        swVar3.addView(gz0Var, c8.ha.d(-1, 50.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
        gz0 gz0Var2 = this.Z;
        gh.e n10 = c8.g0.n(this.resourceProvider);
        dh.c cVar = this.q4;
        fh.g b10 = cVar.b(gz0Var2, n10);
        org.telegram.messenger.camera.q.p(b10, org.telegram.messenger.g0.L(18.0f), 6.666f);
        this.Z.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f));
        this.Z.setBlurredBackground(b10);
        jg.q0 q0Var = new jg.q0(getParentActivity(), null);
        this.b0 = q0Var;
        q0Var.setPadding(0, org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f));
        jg.q0 q0Var2 = this.b0;
        q0Var2.h3 = false;
        q0Var2.setOnItemClickListener(new nu(this, i28));
        this.Z.addView(this.b0, c8.ha.e(-1, -1, 48));
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context2, this.resourceProvider, i28);
        this.u0 = p00Var;
        p00Var.setContentDescription(org.telegram.messenger.id.L0(2131744558));
        this.u0.setImageResource(R.drawable.outline_fab_story_24);
        this.u0.setOnClickListener(new hu(this, 27));
        swVar3.addView(this.u0, org.telegram.ui.Components.p00.c());
        org.telegram.ui.Components.p00 p00Var2 = new org.telegram.ui.Components.p00(context2, this.resourceProvider);
        this.t0 = p00Var2;
        swVar3.addView(p00Var2, org.telegram.ui.Components.p00.b());
        this.t0.setOnClickListener(new hu(this, 28));
        if (!q4() && this.S0 == 0 && org.telegram.messenger.qp.s1(this.currentAccount).t1().getBoolean("storyhint", i28)) {
            fi.m3 m3Var = new fi.m3(context2, 2);
            m3Var.s(8.0f);
            m3Var.d = 8000L;
            m3Var.k(i28);
            m3Var.h = org.telegram.messenger.g0.L(165.0f);
            m3Var.r(i28);
            f10 = 8.0f;
            m3Var.u(org.telegram.messenger.g0.K2(org.telegram.messenger.id.L0(2131744712), fi.va.m(context2), "%s"));
            m3Var.o(1.0f, -40.0f);
            m3Var.j(getThemedColor(org.telegram.ui.ActionBar.m6.tj));
            m3Var.q0 = new cv(this, 2);
            this.p0 = m3Var;
            swVar3.addView(m3Var, c8.ha.d(-1, 160.0f, 87, 0.0f, 0.0f, 80.0f, 0.0f));
        } else {
            f10 = 8.0f;
        }
        s5();
        this.a0 = null;
        int i30 = 5;
        if (this.m2 || this.S0 != 0) {
            f11 = 72.0f;
            if (this.S0 == 3 || U3()) {
                jh.f fVar = new jh.f(context2);
                this.z1 = fVar;
                fVar.setClipChildren(false);
                jh.f fVar2 = this.z1;
                rh.h hVar = this.w;
                fVar2.setWindowInsetsProvider(hVar);
                jh.f fVar3 = this.z1;
                fVar3.setInputIslandBubbleDrawable(cVar.b(fVar3, c8.g0.n(this.resourceProvider)));
                jh.f fVar4 = this.z1;
                fVar4.setUnderKeyboardBackgroundDrawable(this.o4.b(fVar4, c8.g0.n(this.resourceProvider)));
                dh.d dVar = new dh.d(this.r4.b(this.z1, null));
                if (!org.telegram.messenger.iz.f() || org.telegram.messenger.sc.e(262144)) {
                    dVar.b(org.telegram.messenger.g0.L(72.0f), i28);
                }
                this.z1.setBackgroundWithFadeDrawable(dVar);
                FrameLayout inputIslandBubbleContainer = this.z1.getInputIslandBubbleContainer();
                this.A1 = inputIslandBubbleContainer;
                inputIslandBubbleContainer.setClipChildren(false);
                this.B1 = this.z1.getInAppKeyboardBubbleContainer();
                mv mvVar = this.C1;
                if (mvVar != null) {
                    mvVar.B0();
                }
                mv mvVar2 = new mv(this, getParentActivity(), swVar3);
                this.C1 = mvVar2;
                mvVar2.setInAppInsetsController(hVar);
                this.C1.y4 = false;
                swVar3.setClipChildren(false);
                swVar3.setClipToPadding(false);
                mv mvVar3 = this.C1;
                mvVar3.x4 = false;
                mvVar3.i2 = (org.telegram.messenger.g0.E || ((cnVar = mvVar3.P2) != null && cnVar.isInBubbleMode())) ? false : i28;
                this.C1.U0(false, false);
                this.C1.g1(i28, false);
                this.C1.z1.setPadding(0, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(20.0f), 0);
                f12 = 0.0f;
                this.C1.getSendButton().setAlpha(0.0f);
                this.C1.setViewParentForEmoji(this.B1);
                this.A1.addView(this.C1, c8.ha.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
                swVar3.addView(this.z1.getFadeView(), c8.ha.c(-1.0f, -1));
                swVar3.addView(this.z1, c8.ha.c(-1.0f, -1));
                if (m4() || this.F2 != null || this.G2 != null) {
                    v3(this.V3);
                    this.V3 = null;
                }
                this.C1.setDelegate(new gv(this));
                li.w1 w1Var = new li.w1(this, context2, this.resourceProvider);
                this.D1 = w1Var;
                int L = org.telegram.messenger.g0.L(52.0f);
                int L2 = org.telegram.messenger.g0.L(38.0f);
                w1Var.I = L;
                w1Var.J = L2;
                li.w1 w1Var2 = this.D1;
                float L3 = org.telegram.messenger.g0.L(7.0f);
                float L4 = org.telegram.messenger.g0.L(f10);
                w1Var2.M = L3;
                w1Var2.N = L4;
                li.w1 w1Var3 = this.D1;
                w1Var3.h0 = i28;
                swVar3.addView(w1Var3, c8.ha.e(org.telegram.messenger.qs.v1, 50, 85));
                this.D1.setScrimViewBackgroundColor(getThemedColor(i29));
                this.D1.setOnClickListener(new hu(this, i30));
                this.D1.setOnLongClickListener(new tu(this, r11 == true ? 1 : 0));
                this.D1.setVisibility(8);
                this.D1.setScaleX(0.2f);
                this.D1.setScaleY(0.2f);
                this.D1.setAlpha(0.0f);
                float L5 = org.telegram.messenger.g0.L(12.0f);
                TextPaint textPaint = this.F1;
                textPaint.setTextSize(L5);
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                pwVar = this.z0;
                if (pwVar != null) {
                    fh.g b11 = cVar.b(pwVar, c8.g0.n(this.resourceProvider));
                    org.telegram.messenger.camera.q.p(b11, org.telegram.messenger.g0.L(18.0f), 6.666f);
                    this.z0.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f));
                    this.z0.setBlurredBackground(b11);
                    swVar3.addView(this.z0, c8.ha.d(-1, 50.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
                }
                owVar = this.X;
                if (owVar != null) {
                    owVar.setupBlurredBackground(cVar.b(owVar, c8.g0.n(this.resourceProvider)));
                }
                sv svVar = new sv(this, context2, this, this.currentAccount, q4() ? 1 : 0);
                this.E0 = svVar;
                svVar.setActionBar(this.actionBar);
                this.E0.setMenuItemsOffset(!q4() ? org.telegram.messenger.g0.L(68.0f) : org.telegram.messenger.g0.N(16.66f));
                sv svVar2 = this.E0;
                svVar2.l0 = false;
                svVar2.setVisibility(8);
                this.M = false;
                this.L = false;
                this.K = false;
                if (this.m2 && this.S0 == 3) {
                    org.telegram.messenger.qp.s1(this.currentAccount).J1();
                }
                swVar3.addView(this.actionBar, c8.ha.c(-2.0f, -1));
                if (!this.m2) {
                    org.telegram.ui.Cells.o oVar = new org.telegram.ui.Cells.o(context2);
                    this.F3 = oVar;
                    swVar3.addView(oVar, c8.ha.e(20, 20, 51));
                }
                owVar2 = this.X;
                if (owVar2 != null) {
                    swVar3.addView(owVar2, c8.ha.d(-1, 48.0f, 48, 7.0f, -2.0f, 7.0f, 0.0f));
                }
                this.x0 = swVar3.getChildCount();
                UndoView[] undoViewArr = this.y0;
                undoViewArr[0] = null;
                undoViewArr[i28] = null;
                if (this.W) {
                    this.actionBar.getTitlesContainer().setTranslationX(org.telegram.messenger.g0.L(4.0f));
                    org.telegram.ui.ActionBar.t6.c(this.actionBar, org.telegram.ui.ActionBar.m6.Ul, getResourceProvider());
                }
                if (this.X2 == 0 || this.Z2 != 0) {
                    this.e0[0].a.setGlowColor(getThemedColor(i29));
                    org.telegram.ui.ActionBar.t6.b(this.actionBar, org.telegram.ui.ActionBar.m6.O8, getResourceProvider(), false);
                    org.telegram.ui.ActionBar.t6.a(this.actionBar, org.telegram.ui.ActionBar.m6.N8, getResourceProvider(), false);
                    this.actionBar.K(getThemedColor(org.telegram.ui.ActionBar.m6.Q8), false);
                    this.actionBar.K(getThemedColor(org.telegram.ui.ActionBar.m6.R8), i28);
                }
                if (!this.m2 && this.S0 == 0) {
                    bi.ec ecVar = new bi.ec(29, context2, this);
                    this.K0 = ecVar;
                    ecVar.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i29), 100)));
                    this.K0.setFocusable(false);
                    this.K0.setImportantForAccessibility(2);
                    this.K0.setOnClickListener(new hu(this, 7));
                    this.K0.setVisibility(8);
                    swVar3.addView(this.K0, c8.ha.c(-1.0f, -1));
                }
                this.g1.setColor(getThemedColor(i29));
                this.r3 = false;
                if (this.o2 == null) {
                    a5(i28, false, false, false);
                    this.X.r.setText(this.o2);
                    this.X.r.setSelection(this.o2.length());
                } else if (this.p2 != null) {
                    a5(i28, false, false, i28);
                    this.Y.b(i28);
                    this.X.r.setText(this.p2);
                    this.X.r.setSelection(this.p2.length());
                    this.p2 = null;
                    ow owVar4 = this.X;
                    if (owVar4 != null) {
                        owVar4.setTranslationY(i4() + (-org.telegram.messenger.g0.L(36.0f)));
                    }
                } else {
                    a5(false, false, false, false);
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    FilesMigrationService.a(this);
                }
                this.actionBar.setDrawBlurBackground(swVar3);
                this.G3 = new vv(this, context2, swVar3, context2);
                i5(i28, false);
                this.G3.setOpenProgress(f12);
                swVar3.addView(this.E0, c8.ha.c(81.0f, -1));
                swVar3.addView(this.G3, c8.ha.c(-1.0f, -1));
                this.F0 = new org.telegram.ui.Components.mr(context2);
                orVar = this.K1;
                if (orVar != null) {
                    swVar3.addView(orVar, c8.ha.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
                }
                if (this.Z2 != 0 && this.S0 != 3 && org.telegram.messenger.t3.c(this.a3)) {
                    org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.filled_add_album);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("+ ");
                    spannableStringBuilder2.append((CharSequence) org.telegram.messenger.id.L0(2131751989));
                    spannableStringBuilder2.setSpan(wpVar, 0, i28, 33);
                    fi.d dVar2 = new fi.d(context2, this.resourceProvider);
                    this.v0 = dVar2;
                    dVar2.f();
                    this.v0.setText(spannableStringBuilder2);
                    this.v0.setOnClickListener(new org.telegram.ui.Components.u41(10, this, new org.telegram.ui.ActionBar.u1[i28]));
                    lh.f fVar5 = new lh.f(getContext());
                    this.w0 = fVar5;
                    fVar5.setupColorKey(org.telegram.ui.ActionBar.m6.a7);
                    this.w0.setFadeZoneBottom(org.telegram.messenger.g0.L(f11) + org.telegram.messenger.g0.n);
                    this.w0.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
                    swVar3.addView(this.w0, c8.ha.g());
                    swVar3.addView(this.v0, c8.ha.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.n));
                }
                t5(false);
                l5(false);
                R3();
                O3();
                Q3();
                P3();
                N3();
                H3();
                this.X.setBlurredBackgroundVisibility(this.b.e);
                oi.q qVar = this.glassEngine;
                qVar.a = new iu(this, 8);
                qVar.d = new qi.b(org.telegram.messenger.g0.L(48.0f));
                r0.i0.l(this.fragmentView, new iu(this, 9));
                return this.fragmentView;
            }
        } else {
            org.telegram.ui.Components.or orVar2 = new org.telegram.ui.Components.or(context2);
            this.K1 = orVar2;
            int i31 = 11;
            orVar2.setOnAnimatedHeightChangedListener(new cv(this, i31));
            fh.g a14 = cVar.a(this.K1);
            a14.p(c8.g0.n(this.resourceProvider));
            a14.q(org.telegram.messenger.g0.L(7.0f));
            f11 = 72.0f;
            this.K1.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f));
            this.K1.setBlurredBackground(a14);
            this.K1.setDefaultRadiusDp(this.Z2 != 0 ? 18 : 24);
            FrameLayout frameLayout = new FrameLayout(context2);
            this.H1 = frameLayout;
            this.K1.addView(frameLayout);
            this.K1.h(5, this.H1);
            this.K1.g(this.H1);
            this.K1.i(this.H1, i28, false);
            FrameLayout frameLayout2 = new FrameLayout(context2);
            this.J1 = frameLayout2;
            this.K1.addView(frameLayout2);
            int i32 = 4;
            this.K1.h(4, this.J1);
            this.K1.g(this.J1);
            this.K1.i(this.J1, i28, false);
            kv kvVar = new kv(this, context2, this, 0);
            this.G1 = kvVar;
            this.H1.addView(kvVar);
            kv kvVar2 = new kv(this, context2, this, i28);
            this.I1 = kvVar2;
            this.J1.addView(kvVar2);
            this.K1.setCallFragmentContextView(this.I1);
            org.telegram.ui.Cells.b3 b3Var = new org.telegram.ui.Cells.b3(context2);
            this.N1 = b3Var;
            b3Var.setBackground(org.telegram.ui.ActionBar.m6.N0(false));
            g5();
            y6.m0(new ku(this, r112 == true ? 1 : 0));
            y6.r0(new a5(this, i31));
            this.K1.addView(this.N1);
            if (this.Z2 != 0) {
                ji.j jVar = new ji.j(context2, this.resourceProvider, i28);
                this.R1 = jVar;
                jVar.a(-14899731, -15497247, R.drawable.filled_requests_24, org.telegram.messenger.id.L0(2131751895), null, false);
                this.R1.setUnreadMode(i28);
                this.R1.setBackground(org.telegram.ui.ActionBar.m6.N0(false));
                this.R1.setOnClickListener(new hu(this, i32));
                this.K1.addView(this.R1);
                B3(false);
            }
        }
        f12 = 0.0f;
        pwVar = this.z0;
        if (pwVar != null) {
        }
        owVar = this.X;
        if (owVar != null) {
        }
        sv svVar3 = new sv(this, context2, this, this.currentAccount, q4() ? 1 : 0);
        this.E0 = svVar3;
        svVar3.setActionBar(this.actionBar);
        this.E0.setMenuItemsOffset(!q4() ? org.telegram.messenger.g0.L(68.0f) : org.telegram.messenger.g0.N(16.66f));
        sv svVar22 = this.E0;
        svVar22.l0 = false;
        svVar22.setVisibility(8);
        this.M = false;
        this.L = false;
        this.K = false;
        if (this.m2) {
            org.telegram.messenger.qp.s1(this.currentAccount).J1();
        }
        swVar3.addView(this.actionBar, c8.ha.c(-2.0f, -1));
        if (!this.m2) {
        }
        owVar2 = this.X;
        if (owVar2 != null) {
        }
        this.x0 = swVar3.getChildCount();
        UndoView[] undoViewArr2 = this.y0;
        undoViewArr2[0] = null;
        undoViewArr2[i28] = null;
        if (this.W) {
        }
        if (this.X2 == 0) {
        }
        this.e0[0].a.setGlowColor(getThemedColor(i29));
        org.telegram.ui.ActionBar.t6.b(this.actionBar, org.telegram.ui.ActionBar.m6.O8, getResourceProvider(), false);
        org.telegram.ui.ActionBar.t6.a(this.actionBar, org.telegram.ui.ActionBar.m6.N8, getResourceProvider(), false);
        this.actionBar.K(getThemedColor(org.telegram.ui.ActionBar.m6.Q8), false);
        this.actionBar.K(getThemedColor(org.telegram.ui.ActionBar.m6.R8), i28);
        if (!this.m2) {
            bi.ec ecVar2 = new bi.ec(29, context2, this);
            this.K0 = ecVar2;
            ecVar2.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i29), 100)));
            this.K0.setFocusable(false);
            this.K0.setImportantForAccessibility(2);
            this.K0.setOnClickListener(new hu(this, 7));
            this.K0.setVisibility(8);
            swVar3.addView(this.K0, c8.ha.c(-1.0f, -1));
        }
        this.g1.setColor(getThemedColor(i29));
        this.r3 = false;
        if (this.o2 == null) {
        }
        if (Build.VERSION.SDK_INT >= 30) {
        }
        this.actionBar.setDrawBlurBackground(swVar3);
        this.G3 = new vv(this, context2, swVar3, context2);
        i5(i28, false);
        this.G3.setOpenProgress(f12);
        swVar3.addView(this.E0, c8.ha.c(81.0f, -1));
        swVar3.addView(this.G3, c8.ha.c(-1.0f, -1));
        this.F0 = new org.telegram.ui.Components.mr(context2);
        orVar = this.K1;
        if (orVar != null) {
        }
        if (this.Z2 != 0) {
            org.telegram.ui.Components.wp wpVar2 = new org.telegram.ui.Components.wp(R.drawable.filled_add_album);
            SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder("+ ");
            spannableStringBuilder22.append((CharSequence) org.telegram.messenger.id.L0(2131751989));
            spannableStringBuilder22.setSpan(wpVar2, 0, i28, 33);
            fi.d dVar22 = new fi.d(context2, this.resourceProvider);
            this.v0 = dVar22;
            dVar22.f();
            this.v0.setText(spannableStringBuilder22);
            this.v0.setOnClickListener(new org.telegram.ui.Components.u41(10, this, new org.telegram.ui.ActionBar.u1[i28]));
            lh.f fVar52 = new lh.f(getContext());
            this.w0 = fVar52;
            fVar52.setupColorKey(org.telegram.ui.ActionBar.m6.a7);
            this.w0.setFadeZoneBottom(org.telegram.messenger.g0.L(f11) + org.telegram.messenger.g0.n);
            this.w0.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
            swVar3.addView(this.w0, c8.ha.g());
            swVar3.addView(this.v0, c8.ha.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.n));
        }
        t5(false);
        l5(false);
        R3();
        O3();
        Q3();
        P3();
        N3();
        H3();
        this.X.setBlurredBackgroundVisibility(this.b.e);
        oi.q qVar2 = this.glassEngine;
        qVar2.a = new iu(this, 8);
        qVar2.d = new qi.b(org.telegram.messenger.g0.L(48.0f));
        r0.i0.l(this.fragmentView, new iu(this, 9));
        return this.fragmentView;
    }

    /* JADX WARN: Removed duplicated region for block: B:283:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0218 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList d4(int i7, int i10, int i11, boolean z9) {
        boolean z10;
        ArrayList arrayList;
        if (z9 && (arrayList = this.S1) != null) {
            return arrayList;
        }
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(org.telegram.messenger.c.a(i7).a);
        a0.h hVar = s12.Q;
        ArrayList arrayList2 = s12.J;
        ArrayList arrayList3 = s12.I;
        ArrayList arrayList4 = s12.H;
        ArrayList arrayList5 = s12.G;
        ArrayList arrayList6 = s12.L;
        ArrayList arrayList7 = s12.F;
        if (i10 == 0) {
            return s12.W0(i11);
        }
        if (i10 == 10 || i10 == 13) {
            return s12.E;
        }
        if (i10 == 2) {
            ArrayList arrayList8 = new ArrayList(arrayList4.size() + arrayList5.size() + arrayList7.size() + 2);
            if (arrayList5.size() > 0 && this.z2) {
                arrayList8.add(new uw(0));
                arrayList8.addAll(arrayList5);
            }
            if (arrayList4.size() > 0 && this.w2) {
                arrayList8.add(new uw(1));
                arrayList8.addAll(arrayList4);
            }
            if (arrayList7.size() > 0) {
                int size = arrayList7.size();
                for (int i12 = 0; i12 < size; i12++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList7.get(i12);
                    if ((this.z2 && org.telegram.messenger.t3.U(i7, -dialog.id)) || (this.w2 && (org.telegram.messenger.t3.m0(i7, -dialog.id) || !org.telegram.messenger.t3.S(i7, -dialog.id)))) {
                        if (r9) {
                            arrayList8.add(new uw(2));
                            r9 = false;
                        }
                        arrayList8.add(dialog);
                    }
                }
            }
            return arrayList8;
        }
        if (i10 == 3) {
            return s12.D;
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
            org.telegram.messenger.vo voVar = s12.M[i10 != 7 ? 1 : 0];
            return voVar == null ? s12.W0(i11) : this.S0 == 3 ? voVar.l : voVar.k;
        }
        if (i10 == 9) {
            return s12.K;
        }
        if (i10 != 1 && i10 != 16 && i10 != 14) {
            if (i10 != 15) {
                return new ArrayList();
            }
            ArrayList arrayList9 = new ArrayList();
            TLRPC.User a22 = s12.a2(Long.valueOf(this.H));
            TLRPC.RequestPeerType requestPeerType = this.G;
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
                        long j3 = user.id;
                        tL_peerUser.user_id = j3;
                        tL_dialog.id = j3;
                        arrayList9.add(tL_dialog);
                    }
                }
            } else {
                boolean z11 = requestPeerType instanceof TLRPC.TL_requestPeerTypeChat;
                if (z11 || (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast)) {
                    ConcurrentHashMap concurrentHashMap2 = s12.b;
                    if (z11) {
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
                if (a23 != null && !org.telegram.messenger.t10.x(a23)) {
                    if (!r9) {
                        if (a23.bot) {
                            if (this.B2) {
                                if (org.telegram.messenger.t10.B(a23)) {
                                }
                            }
                        } else if (this.A2) {
                            if (org.telegram.messenger.t10.B(a23)) {
                            }
                        }
                        this.T3.add(dialog4);
                    } else if (!org.telegram.messenger.t10.A(a23.id) && !org.telegram.messenger.qp.F2(a23)) {
                        this.T3.add(dialog4);
                    }
                }
            }
        }
        if (this.w2 || (((z10 = this.y2) && this.x2) || r9)) {
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
        } else if (z10 || this.x2 || r9) {
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
        org.telegram.messenger.qp messagesController = getMessagesController();
        ArrayList arrayList11 = this.T3;
        if (arrayList11 == null) {
            messagesController.getClass();
        } else {
            Collections.sort(arrayList11, messagesController.E7);
        }
        return this.T3;
    }

    public final void d5(boolean z9) {
        yw[] ywVarArr;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ywVarArr = this.e0;
            if (i10 >= ywVarArr.length) {
                break;
            }
            ywVarArr[i10].a.C0();
            i10++;
        }
        char c10 = (!z9 || ywVarArr.length <= 1) ? (char) 0 : (char) 1;
        int i11 = ywVarArr[c10].h;
        if (i11 < 0 || i11 >= getMessagesController().T0().size()) {
            return;
        }
        org.telegram.messenger.vo voVar = (org.telegram.messenger.vo) getMessagesController().T0().get(this.e0[c10].h);
        if (voVar.e()) {
            yw ywVar = this.e0[c10];
            ywVar.s = this.S0;
            vw vwVar = ywVar.a;
            int i12 = vw.B3;
            vwVar.D1();
        } else {
            yw[] ywVarArr2 = this.e0;
            if (ywVarArr2[c10 ^ 1].s == 7) {
                ywVarArr2[c10].s = 8;
            } else {
                ywVarArr2[c10].s = 7;
            }
            ywVarArr2[c10].a.setScrollEnabled(true);
            org.telegram.messenger.qp messagesController = getMessagesController();
            char c11 = this.e0[c10].s == 8 ? (char) 1 : (char) 0;
            org.telegram.messenger.vo[] voVarArr = messagesController.M;
            org.telegram.messenger.vo voVar2 = voVarArr[c11];
            if (voVar2 != voVar) {
                voVarArr[c11] = voVar;
                int i13 = c11 ^ 1;
                if (voVarArr[i13] == voVar) {
                    voVarArr[i13] = null;
                }
                if (voVarArr[c11] != null) {
                    messagesController.T4(null);
                } else if (voVar2 != null) {
                    voVar2.k.clear();
                    voVar2.l.clear();
                }
            }
        }
        yw[] ywVarArr3 = this.e0;
        if (ywVarArr3.length > 1) {
            ywVarArr3[1].E = voVar.p;
        }
        yw ywVar2 = ywVarArr3[c10];
        jv jvVar = ywVar2.d;
        jvVar.h = ywVar2.s;
        jvVar.f();
        yw ywVar3 = this.e0[c10];
        fv fvVar = ywVar3.c;
        if (ywVar3.s == 0 && l4() && this.e0[c10].w == 2) {
            i7 = 1;
        }
        fvVar.h1(i7, (int) this.N);
        C3(this.e0[c10]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:426:0x05af, code lost:
    
        if (org.telegram.messenger.t3.S(r4.J0, r11) != false) goto L377;
     */
    /* JADX WARN: Removed duplicated region for block: B:364:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:370:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.messenger.ls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        org.telegram.messenger.vo voVar;
        int i12;
        char c10;
        boolean booleanValue;
        boolean z9;
        org.telegram.ui.Components.yl0 yl0Var;
        org.telegram.ui.Components.yl0 yl0Var2;
        int i13;
        boolean z10;
        boolean z11;
        int i14 = 2;
        ArrayList arrayList = null;
        char c11 = 1;
        int i15 = 0;
        if (i7 == org.telegram.messenger.qs.s) {
            if (this.e0 == null || this.T1) {
                return;
            }
            int i16 = 0;
            while (true) {
                yw[] ywVarArr = this.e0;
                if (i16 >= ywVarArr.length) {
                    break;
                }
                yw ywVar = ywVarArr[i16];
                int i17 = ywVarArr[0].s;
                org.telegram.messenger.vo voVar2 = (i17 == 7 || i17 == 8) ? getMessagesController().M[this.e0[0].s == 8 ? (char) 1 : (char) 0] : null;
                if (voVar2 != null) {
                    int i18 = voVar2.g;
                    int i19 = org.telegram.messenger.qp.C8;
                    if ((i18 & 64) != 0) {
                        z11 = true;
                        if (this.A3 || !z11) {
                            G4(ywVar);
                        } else {
                            org.telegram.messenger.g0.i3(new tp(this, ywVar, objArr, i14), 160L);
                        }
                        i16++;
                    }
                }
                z11 = false;
                if (this.A3) {
                }
                G4(ywVar);
                i16++;
            }
            pw pwVar = this.z0;
            if (pwVar != null && pwVar.getVisibility() == 0) {
                this.z0.c();
            }
            this.A3 = false;
            return;
        }
        if (i7 == org.telegram.messenger.qs.q5) {
            u5(0, true);
            return;
        }
        if (i7 == org.telegram.messenger.qs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.Z2 != chatFull.id) {
                return;
            }
            this.b3 = chatFull;
            B3(false);
            if (this.e0 == null || this.T1) {
                return;
            }
            while (true) {
                yw[] ywVarArr2 = this.e0;
                if (i15 >= ywVarArr2.length) {
                    return;
                }
                G4(ywVarArr2[i15]);
                i15++;
            }
        } else {
            if (i7 == org.telegram.messenger.qs.d2) {
                pw pwVar2 = this.z0;
                if (pwVar2 == null || pwVar2.getVisibility() != 0) {
                    return;
                }
                pw pwVar3 = this.z0;
                int defaultTabId = pwVar3.getDefaultTabId();
                bi.q1 q1Var = pwVar3.F;
                ArrayList arrayList2 = pwVar3.h;
                int i20 = pwVar3.l0.get(defaultTabId, -1);
                if (i20 < 0 || i20 >= arrayList2.size()) {
                    return;
                }
                org.telegram.ui.Components.bz bzVar = (org.telegram.ui.Components.bz) arrayList2.get(i20);
                if (bzVar.d == ((qw) pwVar3.J).a(bzVar.a) || ((qw) pwVar3.J).a(bzVar.a) < 0) {
                    return;
                }
                q1Var.g1();
                if (pwVar3.m0.get(i20) != bzVar.a(true) || pwVar3.h0) {
                    pwVar3.h0 = true;
                    pwVar3.requestLayout();
                    q1Var.setItemAnimator(pwVar3.s0);
                    l4 l4Var = pwVar3.I;
                    if (l4Var != null) {
                        l4Var.f();
                    }
                    pwVar3.M = 0;
                    org.telegram.ui.Components.bz d = pwVar3.d();
                    if (d != null) {
                        d.b(org.telegram.messenger.id.M0(2131750807, null));
                    }
                    int size = arrayList2.size();
                    while (i15 < size) {
                        pwVar3.M = org.telegram.messenger.k5.C(24.0f, ((org.telegram.ui.Components.bz) arrayList2.get(i15)).a(true), pwVar3.M);
                        i15++;
                    }
                    return;
                }
                return;
            }
            if (i7 == org.telegram.messenger.qs.Z4) {
                u5(0, true);
                return;
            }
            if (i7 == org.telegram.messenger.qs.Y4) {
                u5(0, true);
                return;
            }
            if (i7 == org.telegram.messenger.qs.i4) {
                if (this.e0 != null) {
                    int i21 = 0;
                    while (true) {
                        yw[] ywVarArr3 = this.e0;
                        if (i21 >= ywVarArr3.length) {
                            break;
                        }
                        vw vwVar = ywVarArr3[i21].a;
                        if (vwVar != null) {
                            for (int i22 = 0; i22 < vwVar.getChildCount(); i22++) {
                                View childAt = vwVar.getChildAt(i22);
                                if (childAt != null) {
                                    childAt.invalidate();
                                }
                            }
                        }
                        i21++;
                    }
                }
                pw pwVar4 = this.z0;
                if (pwVar4 != null) {
                    pwVar4.getTabsContainer().g1();
                    return;
                }
                return;
            }
            if (i7 == org.telegram.messenger.qs.I4) {
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                if (lVar != null) {
                    lVar.n(true);
                    return;
                }
                return;
            }
            if (i7 == org.telegram.messenger.qs.A4) {
                m5(false, false);
                return;
            }
            long j3 = 0;
            if (i7 == org.telegram.messenger.qs.r) {
                Integer num = (Integer) objArr[0];
                u5(num.intValue(), true);
                pw pwVar5 = this.z0;
                if (pwVar5 != null && pwVar5.getVisibility() == 0) {
                    int intValue = num.intValue();
                    int i23 = org.telegram.messenger.qp.C8;
                    if ((intValue & 256) != 0) {
                        this.z0.c();
                    }
                }
                if (this.Z2 != 0) {
                    int intValue2 = num.intValue();
                    int i24 = org.telegram.messenger.qp.C8;
                    if ((intValue2 & TLObject.FLAG_13) != 0 || (num.intValue() & 2) != 0 || (num.intValue() & 8) != 0 || (num.intValue() & 16) != 0) {
                        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.Z2));
                        this.a3 = M0;
                        this.actionBar.setTitle(org.telegram.messenger.m5.m(M0));
                        this.c3.e(this.a3, this.d3);
                    }
                }
                if (this.e0 != null) {
                    while (i15 < this.e0.length) {
                        int intValue3 = num.intValue();
                        int i25 = org.telegram.messenger.qp.C8;
                        if ((intValue3 & 4) != 0) {
                            this.e0[i15].d.U(true);
                        }
                        i15++;
                    }
                }
                r5(org.telegram.messenger.p10.i(i10).f(), true);
                return;
            }
            int i26 = org.telegram.messenger.qs.I2;
            boolean[] zArr = z4;
            if (i7 == i26) {
                zArr[this.currentAccount] = false;
                return;
            }
            if (i7 == org.telegram.messenger.qs.Y) {
                u5(0, true);
                return;
            }
            if (i7 == org.telegram.messenger.qs.O) {
                if (this.e0 == null || this.T1) {
                    return;
                }
                org.telegram.ui.Components.p00 p00Var = this.t0;
                if (p00Var != null) {
                    z10 = p00Var.getProgressVisible();
                    this.t0.f(false, true);
                } else {
                    z10 = false;
                }
                for (yw ywVar2 : this.e0) {
                    ywVar2.d.e = false;
                }
                if (z10) {
                    L4(0.0f);
                    ValueAnimator valueAnimator = this.d0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(this.c0, 1.0f).setDuration(250L);
                    this.d0 = duration;
                    duration.setInterpolator(org.telegram.ui.Components.wq.f);
                    this.d0.addUpdateListener(new mu(this, i14));
                    this.d0.start();
                }
                int i27 = 0;
                boolean z12 = false;
                while (true) {
                    yw[] ywVarArr4 = this.e0;
                    if (i27 >= ywVarArr4.length) {
                        break;
                    }
                    if (!ywVarArr4[i27].p() || getMessagesController().D0() > 10) {
                        z12 = true;
                    } else {
                        this.e0[i27].d.f();
                    }
                    i27++;
                }
                if (z12) {
                    u5(0, true);
                    return;
                }
                return;
            }
            if (i7 == org.telegram.messenger.qs.h0) {
                if (this.e0 == null) {
                    return;
                }
                int i28 = 0;
                while (true) {
                    yw[] ywVarArr5 = this.e0;
                    if (i28 >= ywVarArr5.length) {
                        int i29 = org.telegram.messenger.qp.C8;
                        u5(512, true);
                        return;
                    }
                    if (ywVarArr5[i28].p() && org.telegram.messenger.g0.Q1()) {
                        boolean booleanValue2 = ((Boolean) objArr[2]).booleanValue();
                        long longValue = ((Long) objArr[i15]).longValue();
                        long longValue2 = ((Long) objArr[c11]).longValue();
                        org.telegram.messenger.xr xrVar = this.q2;
                        if (!booleanValue2) {
                            xrVar.a = longValue;
                            xrVar.b = longValue2;
                        } else if (longValue == xrVar.a && longValue2 == xrVar.b) {
                            xrVar.a = 0L;
                            xrVar.b = 0L;
                        }
                        this.e0[i28].d.s = xrVar.a;
                    }
                    i28++;
                    c11 = 1;
                    i15 = 0;
                }
            } else {
                if (i7 == org.telegram.messenger.qs.f0) {
                    u5(0, true);
                    return;
                }
                if (i7 == org.telegram.messenger.qs.J || i7 == org.telegram.messenger.qs.K || i7 == org.telegram.messenger.qs.M) {
                    int i30 = org.telegram.messenger.qp.C8;
                    u5(TLObject.FLAG_12, true);
                    return;
                }
                if (i7 == org.telegram.messenger.qs.n0) {
                    K3();
                    return;
                }
                if (i7 == org.telegram.messenger.qs.P0) {
                    iw iwVar = this.C0;
                    if (iwVar == null || (yl0Var2 = iwVar.d0) == null || (i13 = yl0Var2.h0) == 15) {
                        return;
                    }
                    int i31 = yl0Var2.s0;
                    org.telegram.messenger.yr.a0(i31).a.c(new jg.r(i31, i13, new jg.t(yl0Var2), 0));
                    return;
                }
                if (i7 == org.telegram.messenger.qs.s0) {
                    int i32 = org.telegram.messenger.qp.C8;
                    u5(32768, true);
                    return;
                }
                if (i7 == org.telegram.messenger.qs.S0) {
                    iw iwVar2 = this.C0;
                    if (iwVar2 == null || (yl0Var = iwVar2.d0) == null) {
                        return;
                    }
                    yl0Var.f();
                    return;
                }
                if (i7 == org.telegram.messenger.qs.T1) {
                    int connectionState = ConnectionsManager.getInstance(org.telegram.messenger.c.a(i10).a).getConnectionState();
                    if (this.e2 != connectionState) {
                        this.e2 = connectionState;
                        m5(true, false);
                        return;
                    }
                    return;
                }
                if (i7 == org.telegram.messenger.qs.b5) {
                    m5(true, false);
                    iw iwVar3 = this.C0;
                    if (iwVar3 != null) {
                        int currentPosition = iwVar3.getCurrentPosition();
                        bi.g5 g5Var = iwVar3.V;
                        q5(g5Var != null && g5Var.h(currentPosition) == 2);
                        return;
                    }
                    return;
                }
                if (i7 == org.telegram.messenger.qs.K2) {
                    if (this.fragmentView == null) {
                        return;
                    }
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TLRPC.User user = (TLRPC.User) objArr[1];
                    TLRPC.Chat chat = (TLRPC.Chat) objArr[2];
                    if (user == null || !user.bot) {
                        booleanValue = ((Boolean) objArr[3]).booleanValue();
                        z9 = false;
                    } else {
                        z9 = ((Boolean) objArr[3]).booleanValue();
                        booleanValue = false;
                    }
                    Runnable h9Var = new fi.h9(this, chat, longValue3, booleanValue, user, z9);
                    Z3();
                    if (this.y0[0] == null) {
                        h9Var.run();
                        return;
                    }
                    if (org.telegram.messenger.t3.c0(chat)) {
                        h9Var.run();
                        return;
                    }
                    UndoView k42 = k4();
                    if (k42 != null) {
                        k42.j(booleanValue ? 1 : 95, longValue3, h9Var);
                        return;
                    }
                    return;
                }
                if (i7 == org.telegram.messenger.qs.d0) {
                    int intValue4 = ((Integer) objArr[0]).intValue();
                    int i33 = this.X2;
                    if (i33 != intValue4 || i33 == 0) {
                        return;
                    }
                    finishFragment();
                    return;
                }
                if (i7 == org.telegram.messenger.qs.O2) {
                    i5(true, true);
                    return;
                }
                if (i7 == org.telegram.messenger.qs.P2) {
                    V4();
                    return;
                }
                if (i7 == org.telegram.messenger.qs.s1) {
                    X4();
                    g5();
                    org.telegram.messenger.qp messagesController = getMessagesController();
                    if (!messagesController.u8 && messagesController.M7 + 10 >= messagesController.getConnectionsManager().getCurrentTime()) {
                        boolean contains = messagesController.S3.contains("SETUP_LOGIN_EMAIL");
                        if (messagesController.S3.contains("SETUP_LOGIN_EMAIL_NOSKIP")) {
                            c10 = 2;
                        } else if (contains) {
                            c10 = 1;
                        }
                        if (c10 == 0) {
                            fe0 fe0Var = new fe0();
                            fu fuVar = new fu(this, 22);
                            fu fuVar2 = new fu(this, 23);
                            boolean z13 = c10 == 2;
                            fe0Var.F = 3;
                            fe0Var.a = 12;
                            fe0Var.d0 = fuVar;
                            fe0Var.e0 = fuVar2;
                            fe0Var.g0 = z13;
                            fe0Var.h0 = true;
                            presentFragment(fe0Var);
                            getMessagesController().u8 = true;
                            return;
                        }
                        return;
                    }
                    c10 = 0;
                    if (c10 == 0) {
                    }
                } else {
                    boolean z14 = true;
                    if (i7 == org.telegram.messenger.qs.N) {
                        org.telegram.ui.Components.p00 p00Var2 = this.t0;
                        if (p00Var2 != null) {
                            p00Var2.f(true, true);
                        }
                        yw[] ywVarArr6 = this.e0;
                        if (ywVarArr6 != null) {
                            int length = ywVarArr6.length;
                            int i34 = 0;
                            while (i34 < length) {
                                jv jvVar = ywVarArr6[i34].d;
                                jvVar.Q = false;
                                jvVar.e = z14;
                                jvVar.f();
                                i34++;
                                z14 = true;
                            }
                            return;
                        }
                        return;
                    }
                    if (i7 == org.telegram.messenger.qs.w) {
                        if (!this.r3 || this.C0 == null) {
                            return;
                        }
                        ArrayList arrayList3 = (ArrayList) objArr[0];
                        long longValue4 = ((Long) objArr[1]).longValue();
                        iw iwVar4 = this.C0;
                        HashMap hashMap = iwVar4.B0;
                        SparseArray sparseArray = iwVar4.h;
                        int size2 = sparseArray.size();
                        for (int i35 = 0; i35 < size2; i35++) {
                            View view = (View) sparseArray.valueAt(i35);
                            if (view instanceof b00) {
                                ((b00) view).e(arrayList3, longValue4);
                            }
                        }
                        for (int i36 = 0; i36 < iwVar4.getChildCount(); i36++) {
                            if (iwVar4.getChildAt(i36) instanceof b00) {
                                ((b00) iwVar4.getChildAt(i36)).e(arrayList3, longValue4);
                            }
                        }
                        iwVar4.O0.e(arrayList3, longValue4);
                        if (hashMap.isEmpty()) {
                            return;
                        }
                        ArrayList arrayList4 = new ArrayList(hashMap.keySet());
                        int i37 = 0;
                        while (i37 < arrayList4.size()) {
                            uz uzVar = (uz) arrayList4.get(i37);
                            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) hashMap.get(uzVar);
                            if (ijVar != null) {
                                long B0 = org.telegram.messenger.ij.B0(ijVar.k);
                                if (B0 < j3) {
                                    i12 = (int) (-B0);
                                }
                                i12 = 0;
                                if (i12 == longValue4) {
                                    for (int i38 = 0; i38 < arrayList3.size(); i38++) {
                                        if (ijVar.e1() == ((Integer) arrayList3.get(i38)).intValue()) {
                                            arrayList = new ArrayList();
                                            arrayList.add(uzVar);
                                        }
                                    }
                                }
                            }
                            i37++;
                            j3 = 0;
                        }
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i39 = 0; i39 < size3; i39++) {
                                hashMap.remove(arrayList.get(i39));
                            }
                            iwVar4.z0.a(hashMap.size(), true);
                            org.telegram.ui.ActionBar.r0 r0Var = iwVar4.E0;
                            if (r0Var != null) {
                                r0Var.setVisibility(hashMap.size() == 1 ? 0 : 8);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (i7 == org.telegram.messenger.qs.L4) {
                        if (this.e0 != null) {
                            int i40 = 0;
                            while (true) {
                                yw[] ywVarArr7 = this.e0;
                                if (i40 >= ywVarArr7.length) {
                                    break;
                                }
                                jg.k kVar = ywVarArr7[i40].d.P;
                                if (kVar != null) {
                                    kVar.a.clear();
                                    kVar.b.clear();
                                    kVar.c.clear();
                                    kVar.d.clear();
                                    org.telegram.messenger.g0.r(kVar.e);
                                }
                                i40++;
                            }
                        }
                        int i41 = org.telegram.ui.Components.d10.l1;
                        return;
                    }
                    if (i7 == org.telegram.messenger.qs.T5) {
                        long longValue5 = ((Long) objArr[0]).longValue();
                        boolean booleanValue3 = ((Boolean) objArr[1]).booleanValue();
                        if (this.Z2 != longValue5 || booleanValue3) {
                            return;
                        }
                        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
                        if (r4Var == null || r4Var.getLastFragment() != this) {
                            removeSelfFromStack();
                            return;
                        } else {
                            finishFragment();
                            return;
                        }
                    }
                    if (i7 == org.telegram.messenger.qs.S5) {
                        if (this.Z2 == ((Long) objArr[0]).longValue()) {
                            B3(true);
                            return;
                        }
                        return;
                    }
                    if (i7 == org.telegram.messenger.qs.S4) {
                        boolean booleanValue4 = ((Boolean) objArr[0]).booleanValue();
                        if (this.fragmentView != null) {
                            if (!booleanValue4) {
                                pt ptVar = this.R3;
                                if (ptVar == null || ptVar.getTag() == null) {
                                    return;
                                }
                                pt ptVar2 = this.R3;
                                ptVar2.animate().setListener(null).cancel();
                                ptVar2.animate().setListener(new org.telegram.ui.Components.v50(8, this, ptVar2)).alpha(0.0f).setStartDelay(0L).setDuration(150L).start();
                                this.R3.setTag(null);
                                return;
                            }
                            if (this.R3 == null) {
                                Context context = this.fragmentView.getContext();
                                pt ptVar3 = new pt(context);
                                LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                                org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(context);
                                ch0Var.f(R.raw.db_migration_placeholder, org.telegram.messenger.qs.g2, org.telegram.messenger.qs.g2, null);
                                ch0Var.getAnimatedDrawable().K(1);
                                ch0Var.d();
                                f10.addView(ch0Var, c8.ha.r(org.telegram.messenger.qs.g2, org.telegram.messenger.qs.g2, 1));
                                TextView textView = new TextView(context);
                                jg.g.v(textView, 1, 24.0f, null, 2131747778);
                                int i42 = org.telegram.ui.ActionBar.m6.G6;
                                org.telegram.ui.ActionBar.t6.U(textView, i42, null);
                                textView.setGravity(1);
                                TextView f11 = org.telegram.messenger.camera.q.f(f10, textView, c8.ha.q(-1, -2, 0.0f, 0, 50, 32, 50, 0), context);
                                f11.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                                jg.g.v(f11, 1, 14.0f, null, 2131747777);
                                org.telegram.ui.ActionBar.t6.U(f11, i42, null);
                                f11.setGravity(1);
                                TextView f12 = org.telegram.messenger.camera.q.f(f10, f11, c8.ha.q(-1, -2, 0.0f, 0, 36, 20, 36, 0), context);
                                jg.g.v(f12, 1, 14.0f, null, 2131747776);
                                org.telegram.ui.ActionBar.t6.U(f12, i42, null);
                                f12.setGravity(1);
                                f10.addView(f12, c8.ha.q(-1, -2, 0.0f, 0, 36, 24, 36, 0));
                                ptVar3.addView(f10, c8.ha.e(-1, -2, 16));
                                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, ptVar3, null);
                                ptVar3.setOnTouchListener(new ot());
                                this.R3 = ptVar3;
                                ptVar3.setAlpha(0.0f);
                                ((sw) this.fragmentView).addView(this.R3);
                                this.R3.animate().alpha(1.0f).setDuration(300L).setStartDelay(1000L).start();
                            }
                            this.R3.setTag(1);
                            return;
                        }
                        return;
                    }
                    if (i7 == org.telegram.messenger.qs.a5) {
                        D3();
                        return;
                    }
                    if (i7 == org.telegram.messenger.qs.m5) {
                        r5((TLRPC.User) objArr[0], true);
                        return;
                    }
                    if (i7 == org.telegram.messenger.qs.f5) {
                        r5(org.telegram.messenger.p10.i(i10).f(), true);
                        s5();
                        return;
                    }
                    if (i7 == org.telegram.messenger.qs.t5) {
                        zArr[this.currentAccount] = false;
                        u4(getAccountInstance());
                        getMessagesController().b3(this.X2);
                        return;
                    }
                    if (i7 == org.telegram.messenger.qs.z5) {
                        int intValue5 = ((Integer) objArr[0]).intValue();
                        int i43 = 0;
                        while (true) {
                            yw[] ywVarArr8 = this.e0;
                            if (i43 >= ywVarArr8.length) {
                                return;
                            }
                            yw ywVar3 = ywVarArr8[i43];
                            if (ywVar3 != null && (((i11 = ywVar3.s) == 7 || i11 == 8) && (voVar = getMessagesController().M[ywVar3.s - 7]) != null && intValue5 == voVar.a)) {
                                ywVar3.q(true);
                                return;
                            }
                            i43++;
                        }
                    } else {
                        if (i7 != org.telegram.messenger.qs.P1) {
                            if (i7 == org.telegram.messenger.qs.v5) {
                                t5(this.V);
                                u5(0, true);
                                return;
                            }
                            if (i7 == org.telegram.messenger.qs.Z2) {
                                s5();
                                return;
                            }
                            if (i7 == org.telegram.messenger.qs.d3) {
                                g5();
                                return;
                            }
                            if (i7 == org.telegram.messenger.qs.g5) {
                                g5();
                                return;
                            }
                            if (i7 == org.telegram.messenger.qs.y3 || i7 == org.telegram.messenger.qs.A3) {
                                g5();
                                return;
                            } else if (i7 == org.telegram.messenger.qs.P3) {
                                g5();
                                return;
                            } else {
                                if (i7 == org.telegram.messenger.qs.Q3) {
                                    g5();
                                    return;
                                }
                                return;
                            }
                        }
                        long longValue6 = ((Long) objArr[0]).longValue();
                        int i44 = 0;
                        while (true) {
                            yw[] ywVarArr9 = this.e0;
                            if (i44 >= ywVarArr9.length) {
                                return;
                            }
                            yw ywVar4 = ywVarArr9[i44];
                            if (ywVar4.a != null) {
                                int i45 = 0;
                                while (true) {
                                    if (i45 < ywVar4.a.getChildCount()) {
                                        View childAt2 = ywVar4.a.getChildAt(i45);
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

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return !(dialog instanceof hi.a3) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final float e4(boolean z9) {
        return (z9 ? 1.0f - this.b.e : 1.0f) * (1.0f - h4()) * this.r.e;
    }

    public final void e5() {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        gz0 gz0Var = this.Z;
        float measuredHeight = (gz0Var == null || gz0Var.getVisibility() == 8) ? 0.0f : this.Z.getMeasuredHeight();
        float L = this.K ? org.telegram.messenger.g0.L(81.0f) : 0.0f;
        if (this.K) {
            float f17 = this.N;
            float f18 = this.y1;
            f10 = (measuredHeight * f18) + com.google.android.recaptcha.internal.a.z(1.0f, f18, L, f17);
            f11 = this.y3;
        } else {
            f10 = (measuredHeight * this.y1) + this.N;
            f11 = this.y3;
        }
        float f19 = f10 + f11 + this.T;
        ow owVar = this.X;
        float L2 = org.telegram.messenger.g0.L(4.0f) * ((owVar == null || owVar.getVisibility() != 0) ? 0.0f : this.X.getAlpha());
        pw pwVar = this.z0;
        if (pwVar != null) {
            pwVar.setTranslationY(f19 - L2);
            f13 = this.z0.getAlpha();
            f14 = org.telegram.messenger.g0.L(43.0f) * f13;
            f12 = f19 + f14;
        } else {
            f12 = f19;
            f13 = 0.0f;
            f14 = 0.0f;
        }
        org.telegram.ui.Components.or orVar = this.K1;
        if (orVar != null) {
            orVar.setTranslationY(org.telegram.messenger.g0.T1(f12 - L2, (-org.telegram.messenger.g0.L(3.0f)) - (this.a0 == null ? org.telegram.messenger.g0.L(44.0f) : 0), this.b.e));
            f15 = this.K1.getMetadata().c.a;
            f16 = this.K1.c(0.0f);
        } else {
            f15 = 0.0f;
            f16 = 0.0f;
        }
        org.telegram.ui.Components.nr nrVar = this.L1;
        if (nrVar != null) {
            nrVar.setTranslationY(f19 - L2);
            float W1 = org.telegram.messenger.g0.W1(Math.min(f15, f13), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(50.0f));
            org.telegram.ui.Components.nr nrVar2 = this.L1;
            float min = Math.min(org.telegram.messenger.g0.L(40.0f), (f16 + f14) - W1);
            Matrix matrix = nrVar2.b;
            if (nrVar2.e != W1 || nrVar2.f != min) {
                nrVar2.e = W1;
                nrVar2.f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, W1);
                LinearGradient linearGradient = nrVar2.c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                nrVar2.invalidate();
            }
            this.L1.setAlpha(Math.max(f13, f15));
        }
    }

    public final int f4() {
        if (!this.K) {
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
    public final void f5(boolean z9) {
        boolean z10;
        org.telegram.ui.ActionBar.r0 r0Var;
        ?? r52;
        org.telegram.ui.ActionBar.z0 z0Var;
        org.telegram.ui.ActionBar.r0 r0Var2;
        pw pwVar;
        org.telegram.ui.Components.bz d;
        long j3;
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
        if (z9) {
            return;
        }
        ArrayList arrayList = this.J2;
        int size = arrayList.size();
        long e10 = getUserConfig().e();
        SharedPreferences notificationsSettings = getNotificationsSettings();
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i7 < size) {
            ArrayList arrayList2 = arrayList;
            TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().Q.f(((Long) arrayList.get(i7)).longValue());
            if (dialog == null) {
                j3 = e10;
            } else {
                j3 = e10;
                long j10 = dialog.id;
                boolean s42 = s4(dialog);
                boolean z11 = dialog.unread_count != 0 || dialog.unread_mark;
                if (getMessagesController().t2(j10)) {
                    this.V2++;
                }
                if (getMessagesController().r2(j10, 0L, null)) {
                    this.R2++;
                } else {
                    this.Q2++;
                }
                if (z11) {
                    this.O2++;
                }
                if (this.X2 == 1 || dialog.folder_id == 1) {
                    this.U2++;
                } else if (j10 != j3 && dialog.community_id == 0 && j10 != 777000 && !getMessagesController().C2(j10, false)) {
                    i13++;
                }
                if (dialog.community_id != 0) {
                    i11++;
                }
                if (!org.telegram.messenger.m5.E(j10) || j10 == j3 || j10 == 489000 || org.telegram.messenger.qp.F2(getMessagesController().a2(Long.valueOf(j10)))) {
                    i15++;
                } else if (org.telegram.messenger.k5.w("dialog_bar_report", j10, notificationsSettings, true)) {
                    this.T2++;
                }
                if (org.telegram.messenger.m5.y(dialog)) {
                    TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j10));
                    if (getMessagesController().C2(dialog.id, true)) {
                        this.S2++;
                        int i16 = getMessagesController().A2;
                        int i17 = org.telegram.messenger.qp.C8;
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
                    boolean z12 = org.telegram.messenger.m5.z(dialog.id);
                    if (z12) {
                        getMessagesController().M0(Long.valueOf(-dialog.id));
                    }
                    if (org.telegram.messenger.m5.C(dialog.id)) {
                        TLRPC.EncryptedChat a12 = getMessagesController().a1(Integer.valueOf((int) (dialog.id & 4294967295L)));
                        a22 = a12 != null ? getMessagesController().a2(Long.valueOf(a12.user_id)) : new TLRPC.TL_userEmpty();
                    } else {
                        a22 = (z12 || !org.telegram.messenger.m5.E(dialog.id)) ? null : getMessagesController().a2(Long.valueOf(dialog.id));
                    }
                    if (a22 != null && a22.bot) {
                        org.telegram.messenger.qp.F2(a22);
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
            i7++;
            arrayList = arrayList2;
            e10 = j3;
        }
        ArrayList arrayList3 = arrayList;
        org.telegram.ui.ActionBar.r0 r0Var3 = this.k1;
        if (r0Var3 != null) {
            if (i10 != size || i11 > 0) {
                r0Var3.setVisibility(8);
            } else {
                r0Var3.setVisibility(0);
            }
        }
        org.telegram.ui.ActionBar.z0 z0Var2 = this.s1;
        if (z0Var2 != null) {
            int i18 = this.S2;
            if ((i18 == 0 || i18 == size) && ((i12 == 0 || i12 == size) && i11 <= 0)) {
                z0Var2.setVisibility(0);
                if (this.S2 != 0) {
                    this.s1.setText(org.telegram.messenger.id.M0(2131752088, null));
                } else {
                    this.s1.setText(org.telegram.messenger.id.M0(2131752089, null));
                }
            } else {
                z0Var2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.z0 z0Var3 = this.r1;
        if (z0Var3 != null && this.n1 != null) {
            if (this.U2 != 0 && i11 == 0 && this.Z2 == 0) {
                String M02 = org.telegram.messenger.id.M0(2131743915, null);
                this.r1.j(M02, R.drawable.msg_unarchive, null);
                this.n1.setIcon(R.drawable.msg_unarchive);
                this.n1.setContentDescription(M02);
                pw pwVar2 = this.z0;
                if (pwVar2 == null || pwVar2.getVisibility() != 0) {
                    this.r1.setVisibility(0);
                    this.n1.setVisibility(8);
                } else {
                    this.n1.setVisibility(0);
                    this.r1.setVisibility(8);
                }
            } else if (i13 != 0 && i11 == 0 && this.Z2 == 0) {
                String M03 = org.telegram.messenger.id.M0(2131754172, null);
                this.r1.j(M03, R.drawable.msg_archive, null);
                this.n1.setIcon(R.drawable.msg_archive);
                this.n1.setContentDescription(M03);
                pw pwVar3 = this.z0;
                if (pwVar3 == null || pwVar3.getVisibility() != 0) {
                    this.r1.setVisibility(0);
                    this.n1.setVisibility(8);
                } else {
                    this.n1.setVisibility(0);
                    this.r1.setVisibility(8);
                }
            } else {
                z0Var3.setVisibility(8);
                this.n1.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.r0 r0Var4 = this.l1;
        if (r0Var4 != null && this.o1 != null) {
            if (this.P2 + i14 == size && this.Z2 == 0) {
                pw pwVar4 = this.z0;
                if (pwVar4 == null || pwVar4.getVisibility() != 0) {
                    this.l1.setVisibility(0);
                    this.o1.setVisibility(8);
                } else {
                    this.o1.setVisibility(0);
                    this.l1.setVisibility(8);
                }
            } else {
                r0Var4.setVisibility(8);
                this.o1.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.z0 z0Var4 = this.u1;
        if (z0Var4 != null) {
            if (i15 != 0) {
                z0Var4.setVisibility(8);
            } else {
                z0Var4.setVisibility(0);
            }
        }
        if (this.q1 != null) {
            pw pwVar5 = this.z0;
            boolean z13 = pwVar5 == null || pwVar5.getVisibility() != 0 || ((d = (pwVar = this.z0).d()) != null && d.a == pwVar.L);
            if (!z13) {
                try {
                    z13 = size >= d4(this.currentAccount, this.e0[0].d.h, this.X2, this.T1).size();
                } catch (Exception unused) {
                }
            }
            if (!z13) {
                z10 = false;
                this.q1.setVisibility(0);
                if (this.p1 != null) {
                    if (this.X2 != 1) {
                        if (this.z0 != null && e4(z10) > 0.5f) {
                            pw pwVar6 = this.z0;
                            org.telegram.ui.Components.bz d2 = pwVar6.d();
                            if (d2 != null && d2.a == pwVar6.L) {
                                int i19 = org.telegram.ui.Components.fz.w1;
                                ArrayList arrayList4 = new ArrayList();
                                ArrayList arrayList5 = getMessagesController().P0;
                                int size2 = arrayList5.size();
                                int i20 = 0;
                                while (i20 < size2) {
                                    org.telegram.messenger.vo voVar = (org.telegram.messenger.vo) arrayList5.get(i20);
                                    ArrayList arrayList6 = arrayList3;
                                    if (!org.telegram.ui.Components.fz.J0(this, voVar, arrayList6, true, true).isEmpty() && !voVar.e()) {
                                        arrayList4.add(voVar);
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
                r0Var = this.m1;
                if (r0Var != null) {
                    r52 = 0;
                } else if (this.R2 != 0) {
                    r0Var.setIcon(R.drawable.msg_unmute);
                    r52 = 0;
                    this.m1.setContentDescription(org.telegram.messenger.id.M0(2131752165, null));
                } else {
                    r52 = 0;
                    r0Var.setIcon(R.drawable.msg_mute);
                    this.m1.setContentDescription(org.telegram.messenger.id.M0(2131752175, null));
                }
                z0Var = this.t1;
                if (z0Var != 0) {
                    if (this.O2 != 0) {
                        z0Var.j(org.telegram.messenger.id.M0(2131748681, r52), R.drawable.msg_markread, r52);
                        this.t1.setVisibility(0);
                    } else if (this.V2 == 0 && i11 == 0) {
                        z0Var.j(org.telegram.messenger.id.M0(2131748680, r52), R.drawable.msg_markunread, r52);
                        this.t1.setVisibility(0);
                    } else {
                        z0Var.setVisibility(8);
                    }
                }
                r0Var2 = this.l1;
                if (r0Var2 != null || this.o1 == null) {
                }
                if (this.P2 != 0) {
                    r0Var2.setIcon(R.drawable.msg_pin);
                    this.l1.setContentDescription(org.telegram.messenger.id.M0(2131747237, null));
                    this.o1.setText(org.telegram.messenger.id.M0(2131751453, null));
                    return;
                } else {
                    r0Var2.setIcon(R.drawable.msg_unpin);
                    this.l1.setContentDescription(org.telegram.messenger.id.M0(2131743845, null));
                    this.o1.setText(org.telegram.messenger.id.M0(2131751452, null));
                    return;
                }
            }
            this.q1.setVisibility(8);
        }
        z10 = false;
        if (this.p1 != null) {
        }
        r0Var = this.m1;
        if (r0Var != null) {
        }
        z0Var = this.t1;
        if (z0Var != 0) {
        }
        r0Var2 = this.l1;
        if (r0Var2 != null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.Components.k60 k60Var = this.L0;
        if (k60Var != null) {
            k60Var.u();
        }
    }

    public final int g4() {
        if (this.K) {
            return org.telegram.messenger.g0.L(81.0f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0a79  */
    /* JADX WARN: Removed duplicated region for block: B:346:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.util.LongSparseArray] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Runnable, org.telegram.ui.ActionBar.h6] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g5() {
        boolean z9;
        boolean z10;
        org.telegram.ui.Cells.m mVar;
        vv vvVar;
        org.telegram.messenger.s9 s9Var;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        int i7;
        boolean z11;
        vv vvVar2;
        long j3;
        boolean z12;
        boolean z13;
        org.telegram.messenger.t1 b10;
        ?? r72;
        String G;
        StringBuilder sb2;
        final long j10;
        final long j11;
        if (this.K1 == null || this.N1 == null || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Cells.b3 b3Var = this.N1;
        boolean z14 = false;
        r7 = false;
        boolean z15 = false;
        if (b3Var != null) {
            try {
                ((org.telegram.ui.Components.zg0) ((org.telegram.ui.Components.v8) b3Var.h.getImageReceiver().m0).K).R(null);
            } catch (Exception unused) {
            }
            org.telegram.ui.Cells.b3 b3Var2 = this.N1;
            b3Var2.setCompact(false);
            b3Var2.a(org.telegram.messenger.p10.s0, null);
            org.telegram.ui.Components.k9 k9Var = b3Var2.h;
            k9Var.setVisibility(8);
            k9Var.b();
        }
        long j12 = 0;
        final int i10 = 1;
        if (!isInPreviewMode()) {
            if (getMessagesController().v2()) {
                this.N1.setOnClickListener(new hu(this, 12));
                this.N1.c(org.telegram.messenger.id.M0(2131754701, null), org.telegram.messenger.id.M0(2131754702, null), false, true);
            } else {
                int i11 = 21;
                if (this.X2 == 0 && this.Z2 == 0 && getMessagesController().S3.contains("SETUP_PASSKEY")) {
                    this.N1.setOnClickListener(new hu(this, 19));
                    this.N1.b(org.telegram.messenger.i6.p(org.telegram.messenger.id.M0(2131747630, null), this.N1.c, new fu(this, i11)), org.telegram.messenger.id.M0(2131747631, null));
                    this.N1.setOnCloseListener(new hu(this, 24));
                } else if (this.X2 == 0 && this.Z2 == 0 && getMessagesController().S3.contains("PREMIUM_GRACE")) {
                    this.N1.setOnClickListener(new hu(this, 25));
                    this.N1.b(org.telegram.messenger.i6.p(org.telegram.messenger.id.M0(2131749525, null), this.N1.c, new fu(this, i11)), org.telegram.messenger.id.M0(2131749529, null));
                    this.N1.setOnCloseListener(new hu(this, 26));
                } else if (this.X2 == 0 && this.Z2 == 0 && getMessagesController().U3 != null) {
                    final TLRPC.TL_pendingSuggestion tL_pendingSuggestion = getMessagesController().U3;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_pendingSuggestion.title.text);
                    org.telegram.messenger.ij.b(spannableStringBuilder, tL_pendingSuggestion.title.entities, false, false, true, true, 0);
                    Spannable B5 = org.telegram.messenger.ij.B5(org.telegram.messenger.i6.m(spannableStringBuilder, this.N1.c.getPaint().getFontMetricsInt(), false, null, 0), tL_pendingSuggestion.title.entities, this.N1.c.getPaint().getFontMetricsInt(), false);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_pendingSuggestion.description.text);
                    org.telegram.messenger.ij.b(spannableStringBuilder2, tL_pendingSuggestion.description.entities, false, false, true, true, 0);
                    this.N1.b(B5, org.telegram.messenger.ij.B5(org.telegram.messenger.i6.m(spannableStringBuilder2, this.N1.d.getPaint().getFontMetricsInt(), false, null, 0), tL_pendingSuggestion.description.entities, this.N1.d.getPaint().getFontMetricsInt(), false));
                    org.telegram.ui.Cells.b3 b3Var3 = this.N1;
                    final int i12 = z14 ? 1 : 0;
                    b3Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.zu
                        public final /* synthetic */ zw b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    vf.c.t(this.b.getParentActivity(), tL_pendingSuggestion.url);
                                    break;
                                default:
                                    zw.Z(this.b, tL_pendingSuggestion);
                                    break;
                            }
                        }
                    });
                    this.N1.setOnCloseListener(new View.OnClickListener(this) { // from class: org.telegram.ui.zu
                        public final /* synthetic */ zw b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    vf.c.t(this.b.getParentActivity(), tL_pendingSuggestion.url);
                                    break;
                                default:
                                    zw.Z(this.b, tL_pendingSuggestion);
                                    break;
                            }
                        }
                    });
                } else {
                    if (this.X2 == 0 && this.Z2 == 0 && org.telegram.messenger.qp.s1(this.currentAccount).S3.contains("STARS_SUBSCRIPTION_LOW_BALANCE")) {
                        bi.ea y10 = bi.ea.y(this.currentAccount, false);
                        ArrayList arrayList = y10.z;
                        if (!arrayList.isEmpty()) {
                            long j13 = -y10.f.amount;
                            int i13 = 0;
                            while (i13 < arrayList.size()) {
                                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList.get(i13);
                                long j14 = j12;
                                long o4 = org.telegram.messenger.m5.o(starsSubscription.peer);
                                if (o4 >= j14) {
                                    if (getMessagesController().a2(Long.valueOf(o4)) == null) {
                                        i13++;
                                        j12 = j14;
                                    }
                                    j13 += starsSubscription.pricing.amount;
                                    i13++;
                                    j12 = j14;
                                } else {
                                    if (getMessagesController().M0(Long.valueOf(-o4)) == null) {
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
                                bi.ea y11 = bi.ea.y(this.currentAccount, false);
                                ArrayList arrayList2 = y11.z;
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
                                        TLRPC.Peer peer = starsSubscription2.peer;
                                        boolean z16 = z15 ? 1 : 0;
                                        long o10 = org.telegram.messenger.m5.o(peer);
                                        if (j11 == j3) {
                                            j11 = o10;
                                        }
                                        if (o10 >= j3) {
                                            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(o10));
                                            if (a22 != null) {
                                                if (sb3.length() > 0) {
                                                    sb3.append(", ");
                                                }
                                                sb3.append(org.telegram.messenger.t10.p(a22));
                                                j15 += starsSubscription2.pricing.amount;
                                                i14++;
                                                z15 = z16 ? 1 : 0;
                                            } else {
                                                i14++;
                                                z15 = z16 ? 1 : 0;
                                            }
                                        } else {
                                            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-o10));
                                            if (M0 != null) {
                                                if (sb3.length() > 0) {
                                                    sb3.append(", ");
                                                }
                                                sb3.append(M0.title);
                                                j15 += starsSubscription2.pricing.amount;
                                                i14++;
                                                z15 = z16 ? 1 : 0;
                                            } else {
                                                i14++;
                                                z15 = z16 ? 1 : 0;
                                            }
                                        }
                                    }
                                    sb2 = sb3;
                                    j10 = j15;
                                }
                                boolean z17 = z15;
                                final String sb4 = sb2.toString();
                                this.N1.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.av
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        zw zwVar = zw.this;
                                        new bi.tc(zwVar.getParentActivity(), zwVar.getResourceProvider(), j10, 2, sb4, new fu(zwVar, 2), j11).show();
                                    }
                                });
                                org.telegram.ui.Cells.b3 b3Var4 = this.N1;
                                long j16 = j10 - y11.f.amount;
                                if (j16 > j3) {
                                    j10 = j16;
                                }
                                Object[] objArr = new Object[1];
                                objArr[z17 ? 1 : 0] = sb4;
                                b3Var4.b(bi.dd.a1(z17, org.telegram.messenger.id.K("StarsSubscriptionExpiredHintTitle2", (int) j10, ',', objArr), 0.72f, null), org.telegram.messenger.id.M0(2131744989, null));
                                this.N1.setOnCloseListener(new hu(this, 13));
                            }
                            if (this.X2 == 0 || this.Z2 != j3 || getMessagesController().h7 || (b10 = org.telegram.messenger.v1.a(this.currentAccount).b()) == null || b10.c.isEmpty() || getMessagesController().T3.contains("BIRTHDAY_CONTACTS_TODAY")) {
                                int i15 = 15;
                                if (this.X2 != 0 && this.Z2 == j3 && org.telegram.messenger.qp.s1(this.currentAccount).S3.contains("BIRTHDAY_SETUP") && getMessagesController().b2(getUserConfig().e()) != null && getMessagesController().b2(getUserConfig().e()).birthday == null) {
                                    org.telegram.messenger.g5.r(this.currentAccount).D(false);
                                    this.N1.setOnClickListener(new hu(this, i15));
                                    this.N1.b(org.telegram.messenger.i6.p(org.telegram.messenger.id.M0(2131753712, null), this.N1.c, new fu(this, i11)), org.telegram.messenger.id.a0(null, null, 2131753713, new Object[0]));
                                    this.N1.setOnCloseListener(new hu(this, 16));
                                } else if (!((org.telegram.messenger.qp.s1(this.currentAccount).D3() && this.X2 == 0 && this.Z2 == j3) ? org.telegram.messenger.qp.s1(this.currentAccount).S3.contains("PREMIUM_CHRISTMAS") : false)) {
                                    this.N1.setOnClickListener(new bi.l1(i15));
                                    this.N1.b(org.telegram.messenger.i6.m(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131749673, null), org.telegram.ui.ActionBar.m6.I6, 2, null, null), null, false, null, 0), org.telegram.messenger.id.a0(null, null, 2131753331, new Object[0]));
                                    this.N1.setOnCloseListener(new hu(this, 17));
                                } else if (!org.telegram.messenger.qp.s1(this.currentAccount).D3() && this.X2 == 0 && this.Z2 == j3 && org.telegram.messenger.qp.s1(this.currentAccount).S3.contains("PREMIUM_RESTORE") && !getUserConfig().q() && org.telegram.messenger.ui.b0(this.currentAccount).g0(false) != null) {
                                    this.N1.setOnClickListener(new hu(this, 18));
                                    this.N1.b(org.telegram.messenger.g0.S2(org.telegram.messenger.id.a0(null, null, 2131746064, org.telegram.messenger.ui.b0(this.currentAccount).g0(false)), org.telegram.ui.ActionBar.m6.I6, 2, null, null), org.telegram.messenger.id.M0(2131746065, null));
                                } else {
                                    if (org.telegram.messenger.qp.s1(this.currentAccount).D3() || this.X2 != 0 || this.Z2 != j3 || ((!(org.telegram.messenger.qp.s1(this.currentAccount).S3.contains("PREMIUM_UPGRADE") && getUserConfig().q()) && (!org.telegram.messenger.qp.s1(this.currentAccount).S3.contains("PREMIUM_ANNUAL") || getUserConfig().q())) || (!org.telegram.messenger.p10.i(this.currentAccount).q() ? org.telegram.messenger.ui.b0(this.currentAccount).g0(false) == null : org.telegram.messenger.r2.b() || org.telegram.messenger.ui.b0(this.currentAccount).g0(true) == null))) {
                                        z12 = false;
                                    } else {
                                        this.B3 = org.telegram.messenger.qp.s1(this.currentAccount).S3.contains("PREMIUM_UPGRADE");
                                        z12 = true;
                                    }
                                    if (z12) {
                                        this.N1.setOnClickListener(new hu(this, 20));
                                        this.N1.b(org.telegram.messenger.g0.S2(org.telegram.messenger.id.a0(null, null, this.B3 ? 2131745934 : 2131743806, org.telegram.messenger.ui.b0(this.currentAccount).g0(false)), org.telegram.ui.ActionBar.m6.I6, 2, null, null), org.telegram.messenger.id.M0(this.B3 ? 2131743809 : 2131745935, null));
                                    } else {
                                        if (this.P1 != null && this.Q1 != null) {
                                            if (r0.longValue() / this.Q1.longValue() < 0.3f) {
                                                org.telegram.messenger.qp.e1().edit().remove("cache_hint_showafter").remove("cache_hint_period").apply();
                                            } else if (System.currentTimeMillis() > org.telegram.messenger.qp.e1().getLong("cache_hint_showafter", j3)) {
                                                z13 = true;
                                                if (!z13) {
                                                    this.N1.setOnClickListener(new hu(this, i11));
                                                    this.N1.b(org.telegram.messenger.g0.S2(org.telegram.messenger.id.a0(null, null, 2131752048, org.telegram.messenger.g0.i0(this.P1.longValue(), false, false)), org.telegram.ui.ActionBar.m6.I6, 2, null, null), org.telegram.messenger.id.M0(2131752049, null));
                                                } else if (this.X2 == 0 && this.Z2 == 0 && getUserConfig().f() != null && ((getUserConfig().f().photo == null || (getUserConfig().f().photo instanceof TLRPC.TL_userProfilePhotoEmpty)) && org.telegram.messenger.qp.s1(this.currentAccount).S3.contains("USERPIC_SETUP"))) {
                                                    this.N1.setOnClickListener(new hu(this, 22));
                                                    this.N1.h.setVisibility(0);
                                                    org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
                                                    v8Var.setBounds(0, 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f));
                                                    long e10 = getUserConfig().e();
                                                    v8Var.A = true;
                                                    v8Var.b = true;
                                                    v8Var.c = false;
                                                    int i16 = org.telegram.ui.ActionBar.m6.p8[org.telegram.ui.Components.v8.e(e10)];
                                                    org.telegram.ui.ActionBar.h6 h6Var = v8Var.z;
                                                    v8Var.d = org.telegram.ui.ActionBar.m6.w0(i16, h6Var);
                                                    v8Var.e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.q8[org.telegram.ui.Components.v8.e(e10)], h6Var);
                                                    v8Var.n = 0;
                                                    v8Var.m = false;
                                                    org.telegram.ui.Components.v8.a("", "", "", v8Var.q);
                                                    v8Var.K = getParentActivity().getResources().getDrawable(R.drawable.filled_profile_photo_20);
                                                    this.N1.h.setImageDrawable(v8Var);
                                                    this.N1.b(org.telegram.messenger.i6.p(org.telegram.messenger.id.M0(2131749301, null), this.N1.c, new fu(this, i11)), org.telegram.messenger.id.M0(2131749300, null));
                                                    this.N1.setOnCloseListener(new hu(this, 23));
                                                } else {
                                                    if (this.X2 == 0 && this.Z2 == 0 && org.telegram.messenger.t0.a != null) {
                                                        for (String str : org.telegram.messenger.qp.s1(this.currentAccount).S3) {
                                                            org.telegram.messenger.t0.a.getClass();
                                                        }
                                                    }
                                                    z14 = false;
                                                }
                                            }
                                        }
                                        z13 = false;
                                        if (!z13) {
                                        }
                                    }
                                }
                            } else {
                                org.telegram.messenger.t1 b11 = org.telegram.messenger.v1.a(this.currentAccount).b();
                                ArrayList arrayList3 = b11.c;
                                this.N1.setOnClickListener(new org.telegram.ui.Components.u41(11, this, b11));
                                this.N1.a(this.currentAccount, arrayList3);
                                org.telegram.ui.Cells.b3 b3Var5 = this.N1;
                                if (arrayList3.size() == 1) {
                                    r72 = 0;
                                    G = org.telegram.messenger.id.a0(null, null, 2131753706, org.telegram.messenger.t10.k((TLRPC.User) arrayList3.get(0)));
                                } else {
                                    r72 = 0;
                                    G = org.telegram.messenger.id.G(arrayList3.size(), "BirthdayTodayMultipleTitle", new Object[0]);
                                }
                                b3Var5.b(org.telegram.messenger.i6.p(org.telegram.messenger.g0.S2(G, org.telegram.ui.ActionBar.m6.I6, 2, r72, r72), this.N1.c, new fu(this, i11)), org.telegram.messenger.id.a0(null, null, arrayList3.size() == 1 ? 2131753707 : 2131753710, new Object[0]));
                                this.N1.setOnCloseListener(new hu(this, 14));
                                bi.ea.y(this.currentAccount, false).U();
                            }
                        } else if (!y10.A) {
                            y10.A = true;
                            TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
                            tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
                            tL_getStarsSubscriptions.missing_balance = true;
                            tL_getStarsSubscriptions.offset = "";
                            ConnectionsManager.getInstance(y10.a).sendRequest(tL_getStarsSubscriptions, new bi.x8(y10, z14 ? 1 : 0));
                        }
                    }
                    j3 = 0;
                    if (this.X2 == 0) {
                    }
                    int i152 = 15;
                    if (this.X2 != 0) {
                    }
                    if (!((org.telegram.messenger.qp.s1(this.currentAccount).D3() && this.X2 == 0 && this.Z2 == j3) ? org.telegram.messenger.qp.s1(this.currentAccount).S3.contains("PREMIUM_CHRISTMAS") : false)) {
                    }
                }
            }
            z14 = true;
        }
        vv vvVar3 = this.G3;
        te.a aVar = this.b;
        if ((vvVar3 != null && vvVar3.c()) || aVar.f) {
            z14 = false;
        }
        this.K1.i(this.N1, z14, true);
        B3(true);
        if (this.fragmentView == null || this.K1 == null) {
            z9 = false;
        } else {
            boolean z18 = !isInPreviewMode() && this.X2 == 0 && this.Z2 == 0 && this.S0 == 0 && !getMessagesController().U1().b.isEmpty() && ((vvVar2 = this.G3) == null || !vvVar2.c()) && !aVar.f;
            if (z18) {
                if (this.O1 == null) {
                    org.telegram.ui.Cells.ma maVar = new org.telegram.ui.Cells.ma(getParentActivity());
                    this.O1 = maVar;
                    this.K1.addView(maVar);
                }
                org.telegram.ui.Cells.ma maVar2 = this.O1;
                int i17 = this.currentAccount;
                TextView textView = maVar2.b;
                TextView textView2 = maVar2.c;
                ArrayList arrayList4 = org.telegram.messenger.qp.s1(i17).U1().b;
                org.telegram.ui.Cells.la laVar = maVar2.d;
                laVar.setText(org.telegram.messenger.id.M0(2131743910, null));
                laVar.a(false, false);
                org.telegram.ui.Cells.la laVar2 = maVar2.e;
                laVar2.setText(org.telegram.messenger.id.M0(2131743900, null));
                laVar2.a(false, false);
                if (arrayList4 == null || arrayList4.size() != 1) {
                    if (arrayList4 == null || arrayList4.size() <= 1) {
                        z9 = false;
                    } else {
                        textView.setText(org.telegram.messenger.id.M0(2131743891, null));
                        String str2 = ((org.telegram.messenger.l10) arrayList4.get(0)).f;
                        int i18 = 1;
                        while (true) {
                            if (i18 >= arrayList4.size()) {
                                break;
                            }
                            if (!TextUtils.equals(str2, ((org.telegram.messenger.l10) arrayList4.get(i18)).f)) {
                                str2 = null;
                                break;
                            }
                            i18++;
                        }
                        if (str2 == null) {
                            z9 = false;
                            textView2.setText(org.telegram.messenger.id.G(arrayList4.size(), "UnconfirmedAuthMultiple", new Object[0]));
                        } else {
                            z9 = false;
                            textView2.setText(org.telegram.messenger.id.G(arrayList4.size(), "UnconfirmedAuthMultipleFrom", str2));
                        }
                    }
                    z11 = z9;
                } else {
                    org.telegram.messenger.l10 l10Var = (org.telegram.messenger.l10) arrayList4.get(0);
                    boolean z19 = l10Var.a;
                    String str3 = l10Var.f;
                    boolean z20 = true;
                    textView.setText(org.telegram.messenger.id.M0(z19 ? 2131743890 : 2131743891, null));
                    String str4 = "" + l10Var.e;
                    if (!TextUtils.isEmpty(str3) && !str4.isEmpty()) {
                        str4 = str4.concat(", ");
                    }
                    String r10 = rf.b.r(str4, str3);
                    if (l10Var.a) {
                        textView2.setText(org.telegram.messenger.id.a0(null, null, 2131743892, "@" + org.telegram.messenger.m5.t(l10Var.c), r10));
                    } else {
                        textView2.setText(org.telegram.messenger.id.a0(null, null, 2131743893, r10));
                        z20 = false;
                    }
                    z11 = z20;
                    z9 = false;
                }
                laVar.setOnClickListener(new org.telegram.ui.Cells.ka(this, z11, i17, arrayList4));
                laVar2.setOnClickListener(new bi.la(maVar2, i17, arrayList4, 2));
            } else {
                z9 = false;
            }
            org.telegram.ui.Cells.ma maVar3 = this.O1;
            if (maVar3 != null) {
                this.K1.i(maVar3, z18, true);
            }
        }
        if (this.fragmentView == null || this.K1 == null) {
            return;
        }
        if (!isInPreviewMode() && this.X2 == 0 && this.Z2 == 0 && this.S0 == 0) {
            org.telegram.messenger.w9 giftAuctionsController = getGiftAuctionsController();
            if (!giftAuctionsController.d) {
                SharedPreferences sharedPreferences = giftAuctionsController.getMessagesController().e7;
                if (System.currentTimeMillis() - (sharedPreferences != null ? sharedPreferences.getLong("lastGiftAuctionTimeUpdate", 0L) : 0L) < 86400000) {
                    giftAuctionsController.d = true;
                    TL_payments.TL_getStarGiftActiveAuctions tL_getStarGiftActiveAuctions = new TL_payments.TL_getStarGiftActiveAuctions();
                    ?? arrayList5 = new ArrayList();
                    ?? r52 = giftAuctionsController.b;
                    int size = r52.size();
                    for (?? r92 = z9; r92 < size; r92++) {
                        org.telegram.messenger.t9 t9Var = (org.telegram.messenger.t9) r52.valueAt(r92);
                        org.telegram.messenger.s9 s9Var2 = t9Var.b;
                        if (s9Var2 != null && !s9Var2.f() && (tL_starGiftAuctionState = (s9Var = t9Var.b).f) != null && (i7 = s9Var.e.bid_date) > 0) {
                            arrayList5.add(Long.valueOf(tL_starGiftAuctionState.version | (i7 << 32)));
                        }
                    }
                    Collections.sort(arrayList5);
                    int size2 = arrayList5.size();
                    long j17 = 0;
                    for (?? r62 = z9; r62 < size2; r62++) {
                        Long l10 = (Long) arrayList5.get(r62);
                        j17 = org.telegram.messenger.ui.p(org.telegram.messenger.ui.p(j17, l10.longValue() & 4294967295L), l10.longValue() >> 32);
                    }
                    tL_getStarGiftActiveAuctions.hash = j17;
                    giftAuctionsController.getConnectionsManager().sendRequestTyped(tL_getStarGiftActiveAuctions, new d3.b(1), new org.telegram.messenger.d(giftAuctionsController, 2));
                }
            }
            if (!giftAuctionsController.c.isEmpty() && (((vvVar = this.G3) == null || !vvVar.c()) && !aVar.f)) {
                z10 = true;
                if (z10 && this.M1 == null) {
                    org.telegram.ui.Cells.m mVar2 = new org.telegram.ui.Cells.m(getParentActivity(), this.currentAccount);
                    this.M1 = mVar2;
                    this.K1.addView(mVar2);
                }
                mVar = this.M1;
                if (mVar == null) {
                    this.K1.i(mVar, z10, true);
                    return;
                }
                return;
            }
        }
        z10 = z9;
        if (z10) {
            org.telegram.ui.Cells.m mVar22 = new org.telegram.ui.Cells.m(getParentActivity(), this.currentAccount);
            this.M1 = mVar22;
            this.K1.addView(mVar22);
        }
        mVar = this.M1;
        if (mVar == null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.ActionBar.n4 getBackButtonState() {
        return (q4() || this.G3.f) ? org.telegram.ui.ActionBar.n4.a : org.telegram.ui.ActionBar.n4.b;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final Animator getCustomSlideTransition(boolean z9, boolean z10, float f10) {
        int i7 = 1;
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.X3, 1.0f);
            this.a4 = ofFloat;
            return ofFloat;
        }
        int i10 = (getLayoutContainer() == null || getLayoutContainer().getMeasuredWidth() <= 0) ? org.telegram.messenger.qs.g2 : (int) Utilities.i((200.0f / getLayoutContainer().getMeasuredWidth()) * f10, 200.0f, 80.0f);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.X3, 1.0f);
        this.a4 = ofFloat2;
        ofFloat2.addUpdateListener(new mu(this, i7));
        this.a4.setInterpolator(org.telegram.ui.Components.wq.g);
        this.a4.setDuration(i10);
        this.a4.start();
        return this.a4;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0230 A[SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList getThemeDescriptions() {
        View view;
        View view2;
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.ActionBar.r0 r0Var = this.m0;
        if (r0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.v6(r0Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.t8));
        }
        if (this.X2 == 0) {
            iw iwVar = this.C0;
            if (iwVar != null) {
                arrayList.add(new org.telegram.ui.ActionBar.v6(iwVar.a0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.d6));
            }
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 128, (Class[]) null, (Paint) null, new Drawable[]{org.telegram.ui.ActionBar.m6.s1}, (org.telegram.ui.ActionBar.u6) null, !this.W ? org.telegram.ui.ActionBar.m6.A8 : org.telegram.ui.ActionBar.m6.Ul));
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.C8));
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.D8));
        } else {
            iw iwVar2 = this.C0;
            if (iwVar2 != null) {
                arrayList.add(new org.telegram.ui.ActionBar.v6(iwVar2.a0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.d6));
            }
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 128, (Class[]) null, (Paint) null, new Drawable[]{org.telegram.ui.ActionBar.m6.s1}, (org.telegram.ui.ActionBar.u6) null, !this.W ? org.telegram.ui.ActionBar.m6.P8 : org.telegram.ui.ActionBar.m6.Ul));
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Q8));
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.R8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, TLObject.FLAG_21, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.x8));
        NumberTextView numberTextView = this.i1;
        int i7 = org.telegram.ui.ActionBar.m6.y8;
        arrayList.add(new org.telegram.ui.ActionBar.v6(numberTextView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        if (this.z0 != null) {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar == null || !lVar.x()) {
                arrayList.add(new org.telegram.ui.ActionBar.v6(this.z0, 0, new Class[]{org.telegram.ui.Components.ez.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.K8));
                arrayList.add(new org.telegram.ui.ActionBar.v6(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.cz.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.I8));
                arrayList.add(new org.telegram.ui.ActionBar.v6(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.cz.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.J8));
                arrayList.add(new org.telegram.ui.ActionBar.v6(this.z0.getTabsContainer(), TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.L8));
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.v6(this.z0, 0, new Class[]{org.telegram.ui.Components.ez.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.ui));
                arrayList.add(new org.telegram.ui.ActionBar.v6(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.cz.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.ti));
                arrayList.add(new org.telegram.ui.ActionBar.v6(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.cz.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.si));
            }
        }
        arrayList.addAll(c8.ma.a(new f6(7, this), org.telegram.ui.ActionBar.m6.w8, i7));
        int i10 = 0;
        while (i10 < 3) {
            if (i10 == 2) {
                iw iwVar3 = this.C0;
                if (iwVar3 == null) {
                    i10++;
                } else {
                    view = iwVar3.a0;
                    view2 = view;
                    if (view2 == null) {
                        arrayList.add(new org.telegram.ui.ActionBar.v6(view2, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.i6));
                        arrayList.add(new org.telegram.ui.ActionBar.v6(view2, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.h6));
                        int i11 = org.telegram.ui.Cells.x3.h;
                        arrayList.add(new org.telegram.ui.ActionBar.v6(view2, 4, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.o6));
                    }
                    i10++;
                }
            } else {
                yw[] ywVarArr = this.e0;
                if (ywVarArr == null) {
                    i10++;
                } else {
                    view = i10 < ywVarArr.length ? ywVarArr[i10].a : null;
                    view2 = view;
                    if (view2 == null) {
                    }
                    i10++;
                }
            }
        }
        if (this.e0 != null) {
            int i12 = 0;
            while (true) {
                yw[] ywVarArr2 = this.e0;
                if (i12 >= ywVarArr2.length) {
                    break;
                }
                if (this.X2 == 0) {
                    arrayList.add(new org.telegram.ui.ActionBar.v6(ywVarArr2[i12].a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.d6));
                } else {
                    arrayList.add(new org.telegram.ui.ActionBar.v6(ywVarArr2[i12].a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.d6));
                }
                int i13 = org.telegram.messenger.iz.a;
                int i14 = org.telegram.ui.ActionBar.m6.q6;
                arrayList.add(new org.telegram.ui.ActionBar.v6(this.e0[i12].a, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.v6(this.e0[i12].a, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.v6(this.e0[i12].x, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.h6));
                this.e0[i12].d.getClass();
                arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.d6));
                i12++;
            }
        }
        int i15 = 0;
        while (true) {
            UndoView[] undoViewArr = this.y0;
            if (i15 >= undoViewArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.v6(undoViewArr[i15], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.tj));
            i15++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.i5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.k5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.l5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.m5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.n5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.o5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.q7));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.p5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.q5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.r5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.s5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.J5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.t5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.u5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.v5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.w5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.x5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.y5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.z5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.D5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.E5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.H5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.B5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.C5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.F5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.G5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.K5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.M5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.N5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.O5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Q5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.S5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.U5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.wj));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.xj));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Bj));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Cj));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Dj));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ej));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Fj));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Gj));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Hj));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ij));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Jj));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Kj));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Lj));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Hh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ih));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Jh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Kh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Lh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Mh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ph));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Th));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Wh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Uh));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Vh));
        jg.q0 q0Var = this.b0;
        if (q0Var != null) {
            arrayList.addAll(q0Var.getThemeDescriptions());
            this.b0.updateColors();
        }
        bx bxVar = this.h0;
        if (bxVar != null) {
            bxVar.updateColors();
            this.h0.invalidate();
        }
        iw iwVar4 = this.C0;
        if (iwVar4 != null) {
            org.telegram.ui.Components.sl0 sl0Var = iwVar4.b0;
            SparseArray sparseArray = iwVar4.h;
            bi.q1 q1Var = iwVar4.a0;
            for (int i16 = 0; i16 < q1Var.getChildCount(); i16++) {
                View childAt = q1Var.getChildAt(i16);
                if ((childAt instanceof org.telegram.ui.Cells.g6) || (childAt instanceof org.telegram.ui.Cells.t2) || (childAt instanceof org.telegram.ui.Cells.m4)) {
                    arrayList.add(new org.telegram.ui.ActionBar.v6(childAt, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.d6));
                }
            }
            for (int i17 = 0; i17 < iwVar4.getChildCount(); i17++) {
                if (iwVar4.getChildAt(i17) instanceof b00) {
                    arrayList.addAll(((b00) iwVar4.getChildAt(i17)).getThemeDescriptions());
                }
            }
            int size = sparseArray.size();
            for (int i18 = 0; i18 < size; i18++) {
                View view3 = (View) sparseArray.valueAt(i18);
                if (view3 instanceof b00) {
                    arrayList.addAll(((b00) view3).getThemeDescriptions());
                }
            }
            b00 b00Var = iwVar4.O0;
            if (b00Var != null) {
                arrayList.addAll(b00Var.getThemeDescriptions());
            }
            arrayList.add(new org.telegram.ui.ActionBar.v6(sl0Var.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.v6(sl0Var.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.y6));
            arrayList.addAll(c8.ma.a(new org.telegram.ui.Components.r6(iwVar4, 4), org.telegram.ui.ActionBar.m6.y8));
        }
        org.telegram.ui.Cells.b3 b3Var = this.N1;
        int i19 = 5;
        if (b3Var != null) {
            arrayList.addAll(c8.ma.a(new org.telegram.ui.Components.r6(new dh(b3Var, 19), i19), org.telegram.ui.ActionBar.m6.d6, org.telegram.ui.ActionBar.m6.G6, org.telegram.ui.ActionBar.m6.y6));
        }
        org.telegram.ui.Cells.ma maVar = this.O1;
        if (maVar != null) {
            arrayList.addAll(c8.ma.a(new org.telegram.ui.Components.r6(new dh(maVar, 20), i19), org.telegram.ui.ActionBar.m6.d6, org.telegram.ui.ActionBar.m6.G6, org.telegram.ui.ActionBar.m6.y6, org.telegram.ui.ActionBar.m6.I6, org.telegram.ui.ActionBar.m6.q7));
        }
        org.telegram.ui.Cells.m mVar = this.M1;
        if (mVar != null) {
            arrayList.addAll(c8.ma.a(new org.telegram.ui.Components.r6(new dh(mVar, 21), i19), org.telegram.ui.ActionBar.m6.d6, org.telegram.ui.ActionBar.m6.G6, org.telegram.ui.ActionBar.m6.y6, org.telegram.ui.ActionBar.m6.I6, org.telegram.ui.ActionBar.m6.q7));
        }
        return arrayList;
    }

    public final float h4() {
        vv vvVar = this.G3;
        if (vvVar == null || !vvVar.c()) {
            return 0.0f;
        }
        return this.G3.e;
    }

    public final void h5() {
        bi.q1 q1Var;
        vw vwVar;
        try {
            mv mvVar = this.C1;
            if (mvVar != null && mvVar.getEditField() != null) {
                this.C1.getEditField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.m6.Ke));
            }
            NumberTextView numberTextView = this.i1;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.m6.y8));
            }
            pw pwVar = this.z0;
            int i7 = 0;
            if (pwVar != null && (pwVar.getSelectorDrawable() instanceof GradientDrawable)) {
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                ((GradientDrawable) this.z0.getSelectorDrawable()).setColor(getThemedColor(lVar != null && lVar.x() ? org.telegram.ui.ActionBar.m6.ui : org.telegram.ui.ActionBar.m6.K8));
                this.z0.invalidate();
            }
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            if (lVar2 != null) {
                if (this.X2 != 0 || this.Z2 != 0) {
                    lVar2.K(getThemedColor(org.telegram.ui.ActionBar.m6.Q8), false);
                    this.actionBar.K(getThemedColor(org.telegram.ui.ActionBar.m6.R8), true);
                }
                if (this.actionBar.x()) {
                    this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.m6.d6));
                }
                n5();
            }
            if (this.e0 != null) {
                while (true) {
                    yw[] ywVarArr = this.e0;
                    if (i7 >= ywVarArr.length) {
                        break;
                    }
                    yw ywVar = ywVarArr[i7];
                    if (ywVar != null && (vwVar = ywVar.a) != null) {
                        vwVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.m6.d6));
                    }
                    i7++;
                }
            }
            iw iwVar = this.C0;
            if (iwVar != null && (q1Var = iwVar.a0) != null) {
                q1Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.m6.d6));
            }
            li.w1 w1Var = this.D1;
            if (w1Var != null) {
                w1Var.setScrimViewBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.m6.d6));
            }
            fi.m3 m3Var = this.p0;
            if (m3Var != null) {
                m3Var.j(getThemedColor(org.telegram.ui.ActionBar.m6.tj));
            }
            fi.m3 m3Var2 = this.q0;
            if (m3Var2 != null) {
                m3Var2.j(getThemedColor(org.telegram.ui.ActionBar.m6.tj));
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
    public final void i5(boolean z9, boolean z10) {
        ?? r52;
        int L0;
        org.telegram.messenger.vo voVar;
        Object[] objArr;
        boolean z11;
        boolean z12;
        if (this.z0 == null || this.inPreviewMode || this.r3) {
            return;
        }
        vv vvVar = this.G3;
        if (vvVar == null || !vvVar.c()) {
            org.telegram.ui.Components.k60 k60Var = this.L0;
            String str = null;
            if (k60Var != null) {
                k60Var.u();
                this.L0 = null;
            }
            ArrayList T0 = getMessagesController().T0();
            int size = T0.size();
            te.a aVar = this.r;
            boolean z13 = true;
            boolean z14 = false;
            if (size <= 1) {
                r52 = 0;
                if (this.z0.getVisibility() != 8) {
                    this.z0.setIsEditing(false);
                    U4(false);
                    this.o3 = false;
                    if (this.n3) {
                        this.n3 = false;
                        this.e0[0].setTranslationX(0.0f);
                        this.e0[1].setTranslationX(r2[0].getMeasuredWidth());
                    }
                    if (this.e0[0].h != this.z0.getDefaultTabId()) {
                        this.e0[0].h = this.z0.getDefaultTabId();
                        jv jvVar = this.e0[0].d;
                        jvVar.h = 0;
                        jvVar.f();
                        yw ywVar = this.e0[0];
                        ywVar.s = this.S0;
                        ywVar.d.f();
                    }
                    this.e0[1].setVisibility(8);
                    yw ywVar2 = this.e0[1];
                    ywVar2.h = 0;
                    jv jvVar2 = ywVar2.d;
                    jvVar2.h = 0;
                    jvVar2.f();
                    yw ywVar3 = this.e0[1];
                    ywVar3.s = this.S0;
                    ywVar3.d.f();
                    this.x = false;
                    if (this.fragmentView != null) {
                        boolean z15 = (this.isPaused || this.R3 != null) ? false : z10;
                        if (!this.r3) {
                            aVar.a(false, z15);
                        }
                    }
                    int i7 = 0;
                    while (true) {
                        yw[] ywVarArr = this.e0;
                        if (i7 >= ywVarArr.length) {
                            break;
                        }
                        yw ywVar4 = ywVarArr[i7];
                        if (ywVar4.s == 0 && ywVar4.w == 2 && l4() && ((L0 = this.e0[i7].c.L0()) == 0 || L0 == 1)) {
                            this.e0[i7].c.h1(1, (int) this.N);
                        }
                        this.e0[i7].a.setScrollingTouchSlop(0);
                        this.e0[i7].a.requestLayout();
                        this.e0[i7].requestLayout();
                        i7++;
                    }
                    this.z0.L = -1;
                    r52 = 0;
                }
            } else if (z9 || this.z0.getVisibility() != 0) {
                boolean z16 = this.z0.getVisibility() != 0 ? false : z10;
                this.x = true;
                boolean isEmpty = this.z0.h.isEmpty();
                if (this.fragmentView != null) {
                    boolean z17 = (this.isPaused || this.R3 != null) ? false : z10;
                    if (!this.r3) {
                        aVar.a(this.x, z17);
                    }
                }
                int currentTabId = this.z0.getCurrentTabId();
                int currentTabStableId = this.z0.getCurrentTabStableId();
                if (currentTabId == this.z0.getDefaultTabId() || currentTabId < T0.size()) {
                    objArr = false;
                } else {
                    this.z0.L = -1;
                    objArr = true;
                }
                pw pwVar = this.z0;
                pwVar.h.clear();
                pwVar.j0.clear();
                pwVar.l0.clear();
                pwVar.m0.clear();
                pwVar.n0.clear();
                pwVar.o0.clear();
                pwVar.M = 0;
                int size2 = T0.size();
                int i10 = 0;
                while (i10 < size2) {
                    if (((org.telegram.messenger.vo) T0.get(i10)).e()) {
                        this.z0.a(i10, 0, org.telegram.messenger.id.M0(2131750807, str), null, false, true, ((org.telegram.messenger.vo) T0.get(i10)).p);
                        z12 = z14;
                    } else {
                        org.telegram.messenger.vo voVar2 = (org.telegram.messenger.vo) T0.get(i10);
                        z12 = z14;
                        this.z0.a(i10, voVar2.o, voVar2.b, voVar2.c, voVar2.n, false, ((org.telegram.messenger.vo) T0.get(i10)).p);
                    }
                    i10++;
                    z14 = z12;
                    str = null;
                }
                boolean z18 = z14;
                if (currentTabStableId >= 0) {
                    if (objArr != false && !this.z0.h(currentTabStableId)) {
                        while (currentTabId >= 0) {
                            pw pwVar2 = this.z0;
                            if (pwVar2.h(pwVar2.k0.get(currentTabId, -1))) {
                                break;
                            } else {
                                currentTabId--;
                            }
                        }
                        if (currentTabId < 0) {
                            currentTabId = z18 ? 1 : 0;
                        }
                    }
                    if (this.z0.k0.get(this.e0[z18 ? 1 : 0].h, -1) != currentTabStableId) {
                        this.e0[z18 ? 1 : 0].h = currentTabId;
                        isEmpty = true;
                    }
                }
                int i11 = z18 ? 1 : 0;
                while (true) {
                    yw[] ywVarArr2 = this.e0;
                    if (i11 >= ywVarArr2.length) {
                        break;
                    }
                    if (ywVarArr2[i11].h >= T0.size()) {
                        this.e0[i11].h = T0.size() - 1;
                    }
                    this.e0[i11].a.setScrollingTouchSlop(1);
                    i11++;
                }
                pw pwVar3 = this.z0;
                pwVar3.F.setItemAnimator(z16 ? pwVar3.s0 : null);
                pwVar3.I.f();
                if (isEmpty) {
                    d5(z18);
                }
                pw pwVar4 = this.z0;
                int currentTabId2 = pwVar4.getCurrentTabId();
                ArrayList arrayList = pwVar4.h;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        z11 = false;
                        break;
                    } else {
                        if (((org.telegram.ui.Components.bz) arrayList.get(i12)).a == currentTabId2) {
                            z11 = ((org.telegram.ui.Components.bz) arrayList.get(i12)).f;
                            break;
                        }
                        i12++;
                    }
                }
                if (z11) {
                    pw pwVar5 = this.z0;
                    ArrayList arrayList2 = pwVar5.h;
                    if (!arrayList2.isEmpty()) {
                        r52 = 0;
                        pwVar5.f((org.telegram.ui.Components.bz) arrayList2.get(0), 0);
                    }
                }
                r52 = 0;
            } else {
                r52 = 0;
            }
            f5(r52);
            int i13 = this.e0[r52].s;
            if ((i13 == 7 || i13 == 8) && (voVar = getMessagesController().M[i13 - 7]) != null) {
                int i14 = 0;
                while (true) {
                    if (i14 >= T0.size()) {
                        z13 = false;
                        break;
                    }
                    org.telegram.messenger.vo voVar3 = (org.telegram.messenger.vo) T0.get(i14);
                    if (voVar3 != null && voVar3.a == voVar.a) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (z13) {
                    return;
                }
                d5(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isLightStatusBar() {
        vv vvVar;
        return (this.k2 || (vvVar = this.G3) == null || vvVar.getFragment() == null) ? i0.a.h(getThemedColor(org.telegram.ui.ActionBar.m6.d6)) > 0.699999988079071d : this.G3.getFragment().isLightStatusBar();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final di.z6 j4() {
        return getMessagesController().P1();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j5(boolean z9, ArrayList arrayList, ArrayList arrayList2, boolean z10, boolean z11) {
        iw iwVar;
        boolean z12;
        org.telegram.ui.Components.u61 u61Var;
        if (!this.r3 || this.m2 || (iwVar = this.C0) == null) {
            return;
        }
        ArrayList<jg.o0> currentSearchFilters = iwVar.getCurrentSearchFilters();
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        for (int i7 = 0; i7 < currentSearchFilters.size(); i7++) {
            if (currentSearchFilters.get(i7).a()) {
                z14 = true;
            } else if (currentSearchFilters.get(i7).d == 4) {
                z15 = true;
            } else if (currentSearchFilters.get(i7).d == 6) {
                z16 = true;
            } else if (currentSearchFilters.get(i7).d == 7) {
                z13 = true;
            }
        }
        if (z13) {
            z10 = false;
        }
        boolean z17 = !(arrayList == null || arrayList.isEmpty()) || !(arrayList2 == null || arrayList2.isEmpty()) || z10;
        if ((z14 || z17 || !z9) && z17) {
            if (arrayList == null || arrayList.isEmpty() || z15) {
                arrayList = null;
            }
            if (arrayList2 == null || arrayList2.isEmpty() || z16) {
                arrayList2 = null;
            }
            if (arrayList != null || arrayList2 != null || z10) {
                this.b0.D1(arrayList, arrayList2, z10);
                z12 = true;
                if (!z12) {
                    this.b0.D1(null, null, false);
                }
                if (!z11) {
                    this.b0.getAdapter().f();
                }
                u61Var = this.a0;
                if (u61Var != null) {
                    u61Var.b(z12, true);
                }
                this.b0.setEnabled(z12);
                this.s.a(z12, true);
            }
        }
        z12 = false;
        if (!z12) {
        }
        if (!z11) {
        }
        u61Var = this.a0;
        if (u61Var != null) {
        }
        this.b0.setEnabled(z12);
        this.s.a(z12, true);
    }

    @Override // org.telegram.ui.le0
    public final ri.f k() {
        return this.l4;
    }

    public final UndoView k4() {
        Z3();
        UndoView[] undoViewArr = this.y0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.d(2, true);
            sw swVar = (sw) this.fragmentView;
            swVar.removeView(undoViewArr[0]);
            swVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void k5() {
        float f10 = (((-this.g4) - this.j4) - this.v1) - this.w1;
        org.telegram.ui.Components.p00 p00Var = this.t0;
        if (p00Var != null) {
            p00Var.setTranslationY(f10);
        }
        org.telegram.ui.Components.p00 p00Var2 = this.u0;
        if (p00Var2 != null) {
            p00Var2.setTranslationY(f10 - org.telegram.messenger.g0.L(52.0f));
            fi.m3 m3Var = this.p0;
            if (m3Var != null) {
                m3Var.setTranslationY(f10 - org.telegram.messenger.g0.L(52.0f));
            }
        }
    }

    public final boolean l4() {
        if (this.m2 || this.S0 != 0 || this.Z2 != 0 || this.X2 != 0) {
            return false;
        }
        org.telegram.messenger.qp messagesController = getMessagesController();
        messagesController.getClass();
        return org.telegram.messenger.iz.q1 && messagesController.Q.f(2305843009213693952L | ((long) 1)) != null;
    }

    public final void l5(boolean z9) {
        boolean z10 = this.m2;
        boolean z11 = (!z10 || this.S0 == 10) && this.X2 == 0 && this.Z2 == 0 && !this.inPreviewMode && (!this.k2 || z10) && !this.U3;
        org.telegram.ui.Components.p00 p00Var = this.t0;
        if (p00Var != null) {
            p00Var.e(z11, z9);
        }
        org.telegram.ui.Components.p00 p00Var2 = this.u0;
        if (p00Var2 != null) {
            p00Var2.e(z11, z9);
        }
    }

    public final boolean m4() {
        ArrayList arrayList = this.E2;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public final void m5(boolean z9, boolean z10) {
        boolean z11;
        if (this.n0 != null) {
            org.telegram.ui.ActionBar.r0 r0Var = this.m0;
            if (r0Var == null || r0Var.getVisibility() != 0) {
                int i7 = 0;
                while (true) {
                    if (i7 >= getDownloadController().G.size()) {
                        z11 = false;
                        break;
                    } else {
                        if (getFileLoader().S(((org.telegram.messenger.ij) getDownloadController().G.get(i7)).S0())) {
                            z11 = true;
                            break;
                        }
                        i7++;
                    }
                }
                if (getDownloadController().I.size() > 0 || z11 || (this.g0.getVisibility() == 0 && this.g0.getAlpha() == 1.0f && !z10)) {
                    this.i0 = true;
                } else {
                    this.i0 = false;
                }
                J3();
                boolean z12 = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i10 = this.e2;
                boolean z13 = i10 == 3 || i10 == 5;
                this.o0.setSubtext(org.telegram.messenger.id.M0(z12 ? z13 ? 2131748608 : 2131748607 : 2131748606, null));
                this.n0.b(z12, z13, z9);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n4(boolean z9) {
        boolean z10;
        this.actionBar.w();
        this.J2.clear();
        org.telegram.ui.ActionBar.y1 y1Var = this.f1;
        int i7 = 1;
        if (y1Var != null) {
            y1Var.c(true, 0.0f);
        }
        pw pwVar = this.z0;
        if (pwVar != null) {
            pwVar.b(org.telegram.ui.ActionBar.m6.K8, org.telegram.ui.ActionBar.m6.I8, org.telegram.ui.ActionBar.m6.J8, org.telegram.ui.ActionBar.m6.L8, org.telegram.ui.ActionBar.m6.d6);
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
            yw[] ywVarArr = this.e0;
            if (i11 >= ywVarArr.length) {
                break;
            }
            yw ywVar = ywVarArr[i11];
            if (ywVar != null) {
                ywVar.a.I0(true);
            }
            i11++;
        }
        float max = Math.max(0.0f, org.telegram.messenger.g0.L((this.K ? 81 : 0) + 48) + this.N);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.v3, 0.0f);
        this.w3 = ofFloat;
        ofFloat.addUpdateListener(new ju(this, max, i7));
        this.w3.addListener(new dw(this, max, i10));
        this.w3.setInterpolator(org.telegram.ui.Components.wq.f);
        this.w3.setDuration(200L);
        this.w3.start();
        this.Z0 = false;
        ArrayList arrayList = this.b1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                org.telegram.messenger.vo voVar = (org.telegram.messenger.vo) arrayList.get(i12);
                jz.z0(voVar, voVar.g, voVar.b, voVar.c, voVar.n, voVar.m, voVar.h, voVar.i, voVar.j, false, false, true, true, false, this, null);
                i12++;
                arrayList = arrayList;
                size = size;
                i10 = 0;
                i7 = 1;
                obj = null;
            }
            arrayList.clear();
        }
        if (this.a1) {
            getMessagesController().m4(this.X2, 0L, null);
            z10 = 0;
            this.a1 = false;
        } else {
            z10 = 0;
        }
        f5(true);
        if (this.e0 != null) {
            int i13 = z10;
            while (true) {
                yw[] ywVarArr2 = this.e0;
                if (i13 >= ywVarArr2.length) {
                    break;
                }
                ywVarArr2[i13].d.H = z10;
                i13++;
            }
        }
        int i14 = org.telegram.messenger.qp.C8;
        int i15 = z10;
        if (z9) {
            i15 = TLObject.FLAG_13;
        }
        u5(i15 | 196608, true);
    }

    public final void n5() {
        if (!this.t3 || this.actionBar == null) {
            return;
        }
        int themedColor = getThemedColor((this.X2 == 0 && this.Z2 == 0) ? org.telegram.ui.ActionBar.m6.v8 : org.telegram.ui.ActionBar.m6.O8);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.m6.y8;
        lVar.G(i0.a.f(this.y1, themedColor, getThemedColor(i7)), false);
        this.actionBar.G(i0.a.f(this.y1, getThemedColor(i7), getThemedColor(i7)), true);
        this.actionBar.E(i0.a.f(this.y1, getThemedColor((this.X2 == 0 && this.Z2 == 0) ? org.telegram.ui.ActionBar.m6.t8 : org.telegram.ui.ActionBar.m6.N8), getThemedColor(org.telegram.ui.ActionBar.m6.z8)), false);
    }

    public final void o4(boolean z9) {
        if (this.G3.c()) {
            z9 = true;
        }
        if (z9 && this.c2) {
            return;
        }
        this.U3 = z9;
        l5(true);
        if (z9) {
            fi.m3 m3Var = this.p0;
            if (m3Var != null) {
                m3Var.f(true);
            }
            fi.m3 m3Var2 = this.q0;
            if (m3Var2 != null) {
                m3Var2.f(true);
            }
        }
    }

    public final void o5() {
        org.telegram.ui.Components.po0 po0Var;
        mv mvVar = this.C1;
        ArrayList arrayList = this.J2;
        if (mvVar == null) {
            if (this.S0 == 10) {
                o4(arrayList.isEmpty());
                return;
            }
            return;
        }
        this.n.a(!arrayList.isEmpty(), true);
        p5();
        if (arrayList.isEmpty()) {
            String M0 = org.telegram.messenger.id.M0((this.S0 == 3 && this.g2 == null) ? 2131750575 : 2131745669, null);
            if (this.Q3 == arrayList.isEmpty()) {
                this.actionBar.setTitle(M0);
            } else {
                this.actionBar.M(M0, true, 350L, org.telegram.ui.Components.wq.h);
            }
            if (this.C1.getTag() != null) {
                this.C1.l0(false, false, false);
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
                if (!this.W3 && (po0Var = this.H2) != null) {
                    this.W3 = true;
                    String M02 = org.telegram.messenger.id.M0(2131745429, null);
                    po0Var.j();
                    po0Var.F = M02;
                    fi.i1 i1Var = po0Var.a[0];
                    if (M02 != null) {
                        ((org.telegram.ui.ActionBar.m5) i1Var.f).l(M02, false);
                    }
                    org.telegram.ui.Components.ob0 ob0Var = new org.telegram.ui.Components.ob0(po0Var, 26);
                    po0Var.G = ob0Var;
                    org.telegram.messenger.g0.i3(ob0Var, 1000L);
                }
            }
            this.D1.e(Math.max(1, arrayList.size()), true);
            int i7 = this.T0 + (!TextUtils.isEmpty(this.C1.getFieldText()) ? 1 : 0);
            int size = arrayList.size();
            int i10 = 0;
            long j3 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                long longValue = ((Long) obj).longValue();
                long N1 = getMessagesController().N1(longValue);
                if (N1 <= 0 && longValue > 0) {
                    N1 = org.telegram.messenger.m5.k(getMessagesController().J2(longValue));
                }
                j3 += N1;
            }
            this.D1.i(i7, j3, true);
            this.C1.T1();
            if (this.Q3 == arrayList.isEmpty()) {
                this.actionBar.setTitle(org.telegram.messenger.id.G(arrayList.size(), "Recipient", new Object[0]));
            } else {
                this.actionBar.M(org.telegram.messenger.id.G(arrayList.size(), "Recipient", new Object[0]), false, 350L, org.telegram.ui.Components.wq.h);
            }
        }
        this.Q3 = arrayList.isEmpty();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        if (hasShownSheet()) {
            if (z9) {
                closeSheet();
                return false;
            }
        } else if (!this.G3.c() || !this.G3.getFragment().onBackPressed(z9)) {
            org.telegram.ui.Components.k60 k60Var = this.L0;
            if (k60Var == null) {
                pw pwVar = this.z0;
                if (pwVar == null || !pwVar.n) {
                    org.telegram.ui.ActionBar.l lVar = this.actionBar;
                    if (lVar == null || !lVar.x()) {
                        if (!this.b.f) {
                            pw pwVar2 = this.z0;
                            if (pwVar2 != null && pwVar2.getVisibility() == 0 && !this.i3) {
                                pw pwVar3 = this.z0;
                                if (!pwVar3.O && !this.n3) {
                                    ArrayList arrayList = pwVar3.h;
                                    if (!arrayList.isEmpty() && pwVar3.L != ((org.telegram.ui.Components.bz) arrayList.get(0)).a) {
                                        if (z9) {
                                            pw pwVar4 = this.z0;
                                            ArrayList arrayList2 = pwVar4.h;
                                            if (!arrayList2.isEmpty()) {
                                                pwVar4.f((org.telegram.ui.Components.bz) arrayList2.get(0), 0);
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                            mv mvVar = this.C1;
                            if (mvVar == null || !mvVar.s0()) {
                                sv svVar = this.E0;
                                if (svVar.O != 0 || svVar.S.L0() == 0) {
                                    return super.onBackPressed(z9);
                                }
                                svVar.h.y0(0);
                                return false;
                            }
                            if (z9) {
                                this.C1.k0(true);
                            }
                        } else if (z9) {
                            this.X.r.getText().clear();
                            this.Y.b(false);
                            this.X.r.clearFocus();
                            return false;
                        }
                    } else if (z9) {
                        iw iwVar = this.C0;
                        if (iwVar != null && iwVar.getVisibility() == 0) {
                            this.C0.R(false);
                        }
                        n4(true);
                        return false;
                    }
                } else if (z9) {
                    pwVar.setIsEditing(false);
                    U4(false);
                    return false;
                }
            } else if (z9) {
                k60Var.u();
                this.L0 = null;
                return false;
            }
        } else if (z9) {
            this.G3.a();
            iw iwVar2 = this.C0;
            if (iwVar2 != null) {
                iwVar2.S();
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyHidden() {
        bi.ec ecVar;
        pw pwVar;
        if (this.W1) {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.n(true);
            }
            TLObject tLObject = this.Y1;
            if (tLObject != null) {
                iw iwVar = this.C0;
                if (iwVar != null) {
                    iwVar.d0.Q(this.X1, tLObject);
                }
                this.Y1 = null;
            }
            this.W1 = false;
        }
        if (!this.K && (pwVar = this.z0) != null && pwVar.getVisibility() == 0 && this.r.f) {
            int i7 = (int) (-this.N);
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            if (i7 != 0 && i7 != currentActionBarHeight && i7 >= currentActionBarHeight / 2) {
                this.e0[0].a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        if (!isInPreviewMode() && (ecVar = this.K0) != null && ecVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        N3();
        this.r0 = true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyVisible() {
        fi.m3 m3Var;
        super.onBecomeFullyVisible();
        if (q4()) {
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            boolean z9 = e12.getBoolean("archivehint", true);
            boolean isEmpty = d4(this.currentAccount, this.S0, this.X2, false).isEmpty();
            if (z9 && isEmpty) {
                org.telegram.messenger.qp.e1().edit().putBoolean("archivehint", false).commit();
                z9 = false;
            }
            if (z9) {
                e12.edit().putBoolean("archivehint", false).commit();
                S4();
            }
        }
        if (this.r0 && !this.s0 && (m3Var = this.p0) != null && this.O3) {
            this.s0 = true;
            this.r0 = false;
            m3Var.w();
        }
        org.telegram.messenger.g0.i3(new fu(this, 20), 200L);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.k60 k60Var = this.L0;
        if (k60Var != null) {
            k60Var.u();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.u1 u1Var;
        super.onDialogDismiss(dialog);
        if (this.X2 == 0 && this.Z2 == 0 && (u1Var = this.U1) != null && dialog == u1Var && getParentActivity() != null) {
            u3(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.m2 = bundle.getBoolean("onlySelect", false);
            this.n2 = this.arguments.getBoolean("canSelectTopics", false);
            this.r2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.S0 = this.arguments.getInt("dialogsType", 0);
            this.O0 = this.arguments.getBoolean("quote", false);
            this.N0 = this.arguments.getBoolean("reply_to", false);
            this.P0 = this.arguments.getLong("reply_to_author", 0L);
            this.Q0 = this.arguments.getLong("reply_to_channel_direct", 0L);
            this.R0 = this.arguments.getLong("forward_into_channel", 0L);
            this.g2 = this.arguments.getString("selectAlertString");
            this.h2 = this.arguments.getString("selectAlertStringGroup");
            this.i2 = this.arguments.getString("addToGroupAlertString");
            this.s2 = this.arguments.getBoolean("allowSwitchAccount");
            this.t2 = this.arguments.getBoolean("checkCanWrite", true);
            this.u2 = this.arguments.getBoolean("afterSignup", false);
            this.X2 = this.arguments.getInt("folderId", 0);
            long j3 = this.arguments.getLong("community_id", 0L);
            this.Z2 = j3;
            if (j3 != 0) {
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
        if (this.S0 == 0) {
            this.V1 = org.telegram.messenger.qp.f1().getBoolean("askAboutContacts", true);
            org.telegram.messenger.iz.u();
        }
        org.telegram.messenger.qs notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        this.K3 = new ab.b0(notificationCenter, this);
        if (this.o2 == null) {
            this.e2 = getConnectionsManager().getConnectionState();
            this.K3.e(org.telegram.messenger.qs.i4);
            if (!this.m2) {
                this.K3.e(org.telegram.messenger.qs.I4);
                this.K3.e(org.telegram.messenger.qs.A4);
                this.K3.c(org.telegram.messenger.qs.P2);
                this.K3.c(org.telegram.messenger.qs.d2);
            }
            ab.b0 b0Var = this.K3;
            b0Var.c(org.telegram.messenger.qs.s);
            b0Var.c(org.telegram.messenger.qs.O2);
            b0Var.c(org.telegram.messenger.qs.r);
            b0Var.c(org.telegram.messenger.qs.Y);
            b0Var.c(org.telegram.messenger.qs.O);
            b0Var.c(org.telegram.messenger.qs.I2);
            b0Var.c(org.telegram.messenger.qs.h0);
            b0Var.c(org.telegram.messenger.qs.f0);
            b0Var.c(org.telegram.messenger.qs.J);
            b0Var.c(org.telegram.messenger.qs.K);
            b0Var.c(org.telegram.messenger.qs.M);
            b0Var.c(org.telegram.messenger.qs.P0);
            b0Var.c(org.telegram.messenger.qs.s0);
            b0Var.c(org.telegram.messenger.qs.q5);
            b0Var.c(org.telegram.messenger.qs.S0);
            b0Var.c(org.telegram.messenger.qs.T1);
            b0Var.c(org.telegram.messenger.qs.b5);
            b0Var.c(org.telegram.messenger.qs.K2);
            b0Var.c(org.telegram.messenger.qs.d0);
            b0Var.c(org.telegram.messenger.qs.s1);
            b0Var.c(org.telegram.messenger.qs.Y4);
            b0Var.c(org.telegram.messenger.qs.Z4);
            b0Var.c(org.telegram.messenger.qs.N);
            b0Var.c(org.telegram.messenger.qs.m5);
            b0Var.c(org.telegram.messenger.qs.f5);
            this.K3.e(org.telegram.messenger.qs.n0);
        }
        ab.b0 b0Var2 = this.K3;
        b0Var2.c(org.telegram.messenger.qs.w);
        b0Var2.c(org.telegram.messenger.qs.S4);
        b0Var2.c(org.telegram.messenger.qs.a5);
        b0Var2.c(org.telegram.messenger.qs.T);
        b0Var2.c(org.telegram.messenger.qs.L4);
        b0Var2.c(org.telegram.messenger.qs.t5);
        b0Var2.c(org.telegram.messenger.qs.v5);
        b0Var2.c(org.telegram.messenger.qs.Z2);
        b0Var2.c(org.telegram.messenger.qs.d3);
        b0Var2.c(org.telegram.messenger.qs.g5);
        b0Var2.c(org.telegram.messenger.qs.y3);
        b0Var2.c(org.telegram.messenger.qs.A3);
        b0Var2.c(org.telegram.messenger.qs.S5);
        b0Var2.c(org.telegram.messenger.qs.T5);
        b0Var2.c(org.telegram.messenger.qs.P3);
        b0Var2.c(org.telegram.messenger.qs.Q3);
        if (this.S0 == 0) {
            this.K3.c(org.telegram.messenger.qs.z5);
            this.K3.c(org.telegram.messenger.qs.P1);
        }
        u4(getAccountInstance());
        di.z6 P1 = getMessagesController().P1();
        if (!P1.A) {
            P1.W();
            if (!P1.s) {
                ConnectionsManager.getInstance(P1.a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new di.y5(P1, r3));
            }
        }
        getMessagesController().b3(this.X2);
        if (this.R3 != null && !getMessagesStorage().Q) {
            pt ptVar = this.R3;
            if (ptVar.getParent() != null) {
                ((ViewGroup) ptVar.getParent()).removeView(ptVar);
            }
            this.R3 = null;
        }
        if (q4()) {
            di.z6 P12 = getMessagesController().P1();
            if (P12.z) {
                P12.T(true);
            }
        } else {
            getMessagesController().P1().W();
        }
        getContactsController().B();
        if (getMessagesController().o6) {
            org.telegram.messenger.vv G1 = getMessagesController().G1();
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
            long j10 = a10.b;
            boolean z9 = j10 == 0;
            if (!z9) {
                long j11 = currentTimeMillis - j10;
                boolean z10 = org.telegram.messenger.r2.a;
                z9 = j11 > ((long) 43200000);
            }
            if (!z9) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(a10.b);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(currentTimeMillis);
                z9 = (calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1)) ? false : true;
            }
            if (z9) {
                a10.e = true;
                ConnectionsManager.getInstance(a10.a).sendRequest(new TL_account.getBirthdays(), new org.telegram.messenger.s1(a10, r3));
            }
        }
        this.i4 = this.W ? org.telegram.messenger.g0.L(72.0f) : 0;
        this.j4 = this.W ? org.telegram.messenger.g0.L(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        ab.b0 b0Var = this.K3;
        if (b0Var != null) {
            b0Var.b();
            this.K3 = null;
        }
        mv mvVar = this.C1;
        if (mvVar != null) {
            mvVar.B0();
        }
        org.telegram.ui.Components.po0 po0Var = this.H2;
        if (po0Var != null) {
            po0Var.j();
        }
        org.telegram.ui.Components.h41 h41Var = this.I2;
        if (h41Var != null) {
            org.telegram.messenger.g0.r(h41Var);
            this.I2 = null;
        }
        UndoView undoView = this.y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.q3.e();
        this.D2 = null;
        int i7 = org.telegram.ui.Components.d10.l1;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPanTranslationUpdate(float f10) {
        if (this.e0 == null) {
            return;
        }
        this.J0 = f10;
        mv mvVar = this.C1;
        int i7 = 0;
        if (mvVar == null || !mvVar.s0()) {
            while (true) {
                yw[] ywVarArr = this.e0;
                if (i7 >= ywVarArr.length) {
                    break;
                }
                ywVarArr[i7].setTranslationY(f10);
                i7++;
            }
            if (!this.m2) {
                this.actionBar.setTranslationY(f10);
                org.telegram.ui.Components.bc bcVar = this.p3;
                if (bcVar != null) {
                    bcVar.l();
                }
            }
            iw iwVar = this.C0;
            if (iwVar != null) {
                iwVar.setTranslationY(this.J0 + this.I0);
                return;
            }
            return;
        }
        this.fragmentView.setTranslationY(f10);
        while (true) {
            yw[] ywVarArr2 = this.e0;
            if (i7 >= ywVarArr2.length) {
                break;
            }
            ywVarArr2[i7].setTranslationY(0.0f);
            i7++;
        }
        if (!this.m2) {
            this.actionBar.setTranslationY(0.0f);
            org.telegram.ui.Components.bc bcVar2 = this.p3;
            if (bcVar2 != null) {
                bcVar2.l();
            }
        }
        iw iwVar2 = this.C0;
        if (iwVar2 != null) {
            iwVar2.setTranslationY(this.I0);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.bc bcVar = this.S;
        if (bcVar != null) {
            bcVar.b();
            this.S = null;
        }
        vv vvVar = this.G3;
        if (vvVar != null) {
            vvVar.r = true;
            cw cwVar = vvVar.a;
            if (cwVar != null) {
                cwVar.onPause();
            }
        }
        org.telegram.ui.Components.k60 k60Var = this.L0;
        if (k60Var != null) {
            k60Var.u();
        }
        mv mvVar = this.C1;
        if (mvVar != null) {
            mvVar.D0();
        }
        int i7 = 0;
        UndoView undoView = this.y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        setBulletinDelegate(null);
        if (this.e0 == null) {
            return;
        }
        while (true) {
            yw[] ywVarArr = this.e0;
            if (i7 >= ywVarArr.length) {
                return;
            }
            ywVarArr[i7].d.getClass();
            i7++;
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        org.telegram.messenger.c9 c9Var;
        if (i7 != 1) {
            if (i7 == 4) {
                for (int i10 : iArr) {
                    if (i10 != 0) {
                        return;
                    }
                }
                if (Build.VERSION.SDK_INT < 30 || (c9Var = FilesMigrationService.e) == null) {
                    return;
                }
                c9Var.I0();
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
                            org.telegram.messenger.dt.t(this.currentAccount).Y();
                            break;
                        } else {
                            gh0.I0();
                            break;
                        }
                    case "android.permission.WRITE_EXTERNAL_STORAGE":
                        if (iArr[i11] == 0) {
                            org.telegram.messenger.gc.D().i(null);
                            break;
                        } else {
                            break;
                        }
                    case "android.permission.READ_CONTACTS":
                        if (iArr[i11] == 0) {
                            org.telegram.messenger.g0.h3(new fu(this, 19));
                            getContactsController().l();
                            break;
                        } else {
                            SharedPreferences.Editor edit = org.telegram.messenger.qp.f1().edit();
                            this.V1 = false;
                            edit.putBoolean("askAboutContacts", false).commit();
                            break;
                        }
                }
            }
        }
        if (this.A0) {
            this.A0 = false;
            V4();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        yw ywVar;
        jv jvVar;
        org.telegram.ui.Components.yl0 yl0Var;
        bi.ec ecVar;
        super.onResume();
        sv svVar = this.E0;
        if (svVar != null) {
            ArrayList arrayList = svVar.y;
            di.z6 z6Var = svVar.s;
            z6Var.l(z6Var.g);
            z6Var.l(z6Var.h);
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                TL_stories.PeerStories y10 = z6Var.y(((di.n) arrayList.get(i7)).c);
                if (y10 != null) {
                    z6Var.a0(y10);
                }
            }
        }
        vv vvVar = this.G3;
        if (vvVar != null) {
            vvVar.r = false;
            cw cwVar = vvVar.a;
            if (cwVar != null) {
                cwVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (ecVar = this.K0) != null && ecVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        if (this.e0 != null) {
            int i10 = 0;
            while (true) {
                yw[] ywVarArr = this.e0;
                if (i10 >= ywVarArr.length) {
                    break;
                }
                ywVarArr[i10].d.f();
                i10++;
            }
        }
        mv mvVar = this.C1;
        if (mvVar != null) {
            mvVar.E0();
        }
        int i11 = 4;
        long j3 = 0;
        if (!this.m2 && this.X2 == 0 && this.Z2 == 0) {
            getMediaDataController().B(4);
        }
        iw iwVar = this.C0;
        if (iwVar != null && (yl0Var = iwVar.d0) != null) {
            yl0Var.f();
        }
        boolean z9 = this.u2 || getUserConfig().Z == null;
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z9 && this.X2 == 0 && this.Z2 == 0 && this.d2 && !this.m2) {
            int i12 = Build.VERSION.SDK_INT;
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.d2 = false;
                boolean z10 = parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0;
                boolean z11 = (i12 <= 28 || org.telegram.messenger.r2.b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0;
                boolean z12 = i12 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0;
                org.telegram.messenger.i4 i4Var = new org.telegram.messenger.i4(this, z12, z10, z11, parentActivity);
                if (this.u2 && (z10 || z12)) {
                    j3 = 4000;
                }
                org.telegram.messenger.g0.i3(i4Var, j3);
            }
        } else if (!this.m2 && this.X2 == 0 && this.Z2 == 0 && org.telegram.messenger.as.i() && !org.telegram.messenger.as.g()) {
            if (getParentActivity() == null) {
                return;
            }
            if (!org.telegram.messenger.qp.f1().getBoolean("askedAboutMiuiLockscreen", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                int i13 = org.telegram.ui.ActionBar.m6.L5;
                alertDialog$Builder.m(R.raw.permission_request_apk, 72, getThemedColor(i13), null);
                alertDialog$Builder.n(i13, getResourceProvider());
                String M0 = org.telegram.messenger.id.M0(2131747298, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.T = M0;
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747300, null), new iu(this, 10));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131751772, null), new org.telegram.ui.Components.il0(17));
                showDialog(u1Var);
            }
        } else if (this.X2 == 0 && this.Z2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
            if (getParentActivity() == null) {
                return;
            }
            if (!org.telegram.messenger.qp.f1().getBoolean("askedAboutFSILockscreen", false)) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                int i14 = org.telegram.ui.ActionBar.m6.L5;
                alertDialog$Builder2.m(R.raw.permission_request_apk, 72, getThemedColor(i14), null);
                alertDialog$Builder2.n(i14, getResourceProvider());
                String M02 = org.telegram.messenger.id.M0(2131747314, null);
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                u1Var2.T = M02;
                alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131747300, null), new iu(this, 11));
                alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131751772, null), new org.telegram.ui.Components.il0(18));
                showDialog(u1Var2);
            }
        }
        V4();
        if (this.e0 != null) {
            int i15 = 0;
            while (true) {
                yw[] ywVarArr2 = this.e0;
                if (i15 >= ywVarArr2.length) {
                    break;
                }
                yw ywVar2 = ywVarArr2[i15];
                if (ywVar2.s == 0 && ywVar2.w == 2 && ywVar2.c.L0() == 0 && l4()) {
                    this.e0[i15].c.h1(1, (int) this.N);
                }
                if (i15 == 0) {
                    this.e0[i15].d.getClass();
                } else {
                    this.e0[i15].d.getClass();
                }
                i15++;
            }
        }
        X4();
        setBulletinDelegate(new y8(this, i11));
        if (this.r3) {
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        }
        u5(0, false);
        m5(false, true);
        t5(false);
        D3();
        N3();
        if (this.z0 == null || (ywVar = this.e0[0]) == null || (jvVar = ywVar.d) == null) {
            return;
        }
        int i16 = jvVar.h;
        if (i16 == 7 || i16 == 8) {
            org.telegram.messenger.vo voVar = getMessagesController().M[i16 != 7 ? (char) 1 : (char) 0];
            if (voVar != null) {
                this.z0.h(voVar.o);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onSlideProgress(boolean z9, float f10) {
        if (org.telegram.messenger.iz.o() <= 0) {
            boolean z10 = org.telegram.messenger.r2.a;
        } else if (this.Z3 && this.a4 == null) {
            R4(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.g1.setColor(getThemedColor(org.telegram.ui.ActionBar.m6.d6));
            y3();
            h5();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        bi.ec ecVar;
        zw zwVar;
        vv vvVar = this.G3;
        if (vvVar == null || !vvVar.c()) {
            if (z9 && (ecVar = this.K0) != null && ecVar.getVisibility() == 0) {
                this.K0.setVisibility(8);
                this.K0.setBackground(null);
            }
            if (z9 && this.u2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).v0.c(false);
                }
            }
        } else {
            this.G3.getFragment().onTransitionAnimationEnd(z9, z10);
        }
        if (!z9 && (zwVar = this.Y2) != null) {
            zwVar.removeSelfFromStack();
        }
        N3();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationProgress(boolean z9, float f10) {
        vv vvVar = this.G3;
        if (vvVar == null || !vvVar.c()) {
            bi.ec ecVar = this.K0;
            if (ecVar != null && ecVar.getVisibility() == 0) {
                if (z9) {
                    this.K0.setAlpha(1.0f - f10);
                } else {
                    this.K0.setAlpha(f10);
                }
            }
        } else {
            this.G3.getFragment().onTransitionAnimationProgress(z9, f10);
        }
        N3();
    }

    public final void p5() {
        org.telegram.ui.Components.po0 po0Var = this.H2;
        if (po0Var == null) {
            return;
        }
        int i7 = this.currentAccount;
        po0Var.h(i7);
        po0Var.d = org.telegram.messenger.p10.i(org.telegram.messenger.c.a(i7).a).e();
        ArrayList arrayList = po0Var.f;
        arrayList.clear();
        ArrayList arrayList2 = this.J2;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        fi.i1 i1Var = po0Var.a[0];
        if (po0Var.b == 1) {
            ((org.telegram.ui.ActionBar.m5) i1Var.e).l(po0Var.c(i1Var), false);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void prepareFragmentToSlide(boolean z9, boolean z10) {
        if (!z9 && z10) {
            this.Z3 = true;
            N4(true);
        } else {
            this.a4 = null;
            this.Z3 = false;
            N4(false);
            R4(1.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean presentFragment(org.telegram.ui.ActionBar.f2 f2Var) {
        boolean presentFragment = super.presentFragment(f2Var);
        if (presentFragment && this.e0 != null) {
            int i7 = 0;
            while (true) {
                yw[] ywVarArr = this.e0;
                if (i7 >= ywVarArr.length) {
                    break;
                }
                ywVarArr[i7].d.getClass();
                i7++;
            }
        }
        fi.m3 m3Var = this.p0;
        if (m3Var != null) {
            m3Var.f(true);
        }
        fi.m3 m3Var2 = this.q0;
        if (m3Var2 != null) {
            m3Var2.f(true);
        }
        org.telegram.ui.Components.bc.e();
        return presentFragment;
    }

    public final boolean q4() {
        return this.X2 == 1;
    }

    public final void q5(boolean z9) {
        boolean z10;
        if (this.l0 == null) {
            return;
        }
        ArrayList arrayList = getDownloadController().G;
        int size = arrayList.size();
        boolean z11 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                z10 = false;
                break;
            }
            Object obj = arrayList.get(i7);
            i7++;
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
            if (ijVar.F0() != null && ijVar.F0().size >= 157286400) {
                z10 = true;
                break;
            }
        }
        ArrayList arrayList2 = getDownloadController().H;
        int size2 = arrayList2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i10);
            i10++;
            org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) obj2;
            if (ijVar2.F0() != null && ijVar2.F0().size >= 157286400) {
                z10 = true;
                break;
            }
        }
        if (!getUserConfig().q() && !getMessagesController().D3() && z10 && z9) {
            z11 = true;
        }
        this.d.a(z11, true);
    }

    public final boolean r4(long j3) {
        if (j3 < 0) {
            return false;
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j3));
        if (!org.telegram.messenger.t10.u(a22)) {
            return false;
        }
        ArrayList l10 = org.telegram.messenger.qp.s1(this.currentAccount).q7.l(-a22.id);
        return (l10 == null || l10.isEmpty()) && org.telegram.messenger.qp.s1(this.currentAccount).q7.e(-a22.id);
    }

    public final void r5(TLRPC.User user, boolean z9) {
        org.telegram.ui.Components.f5 f5Var;
        sv svVar = this.E0;
        org.telegram.ui.Components.f5 f5Var2 = null;
        if (svVar != null && (f5Var = svVar.a0) != null && svVar.q0 != null) {
            Long h = org.telegram.messenger.t10.h(user);
            if (h != null) {
                boolean z10 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                f5Var.j(h.longValue(), z9);
                f5Var.m(z10, z9);
            } else {
                if (user != null) {
                    org.telegram.messenger.qp.s1(svVar.f);
                    if (org.telegram.messenger.qp.B2(user)) {
                        if (svVar.N0 == null) {
                            svVar.N0 = svVar.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                            svVar.N0 = new di.h(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), svVar.N0);
                        }
                        Drawable drawable = svVar.N0;
                        int i7 = org.telegram.ui.ActionBar.m6.ni;
                        zw zwVar = svVar.e0;
                        org.telegram.ui.ActionBar.t6.x(svVar, drawable, i7, zwVar != null ? zwVar.getResourceProvider() : null, PorterDuff.Mode.MULTIPLY);
                        f5Var.g(svVar.N0, z9);
                        f5Var.m(false, z9);
                    }
                }
                f5Var.g(null, z9);
                f5Var.m(false, z9);
            }
            f5Var.k(Integer.valueOf(svVar.f(org.telegram.ui.ActionBar.m6.ni)));
            svVar.W.invalidate();
        }
        if (this.E3 == null || this.actionBar == null) {
            return;
        }
        Long h7 = org.telegram.messenger.t10.h(user);
        this.C3 = null;
        if (h7 != null) {
            boolean z11 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
            this.E3.j(h7.longValue(), z9);
            this.E3.m(z11, z9);
            if (z11) {
                this.C3 = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
            }
            this.actionBar.setRightDrawableOnClick(new hu(this, 1));
            t11.t(this.currentAccount);
        } else {
            if (user != null) {
                org.telegram.messenger.qp.s1(this.currentAccount);
                if (org.telegram.messenger.qp.B2(user)) {
                    if (this.L3 == null) {
                        this.L3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                        this.L3 = new gw(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), this.L3);
                    }
                    Drawable drawable2 = this.L3;
                    int themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.ni);
                    this.x4 = themedColor;
                    drawable2.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                    this.E3.g(this.L3, z9);
                    this.E3.m(false, z9);
                    this.actionBar.setRightDrawableOnClick(new hu(this, 2));
                    t11.t(this.currentAccount);
                }
            }
            this.E3.g(null, z9);
            this.E3.m(false, z9);
            this.actionBar.setRightDrawableOnClick(null);
        }
        org.telegram.ui.Components.f5 f5Var3 = this.E3;
        int i10 = org.telegram.ui.ActionBar.m6.ni;
        f5Var3.k(Integer.valueOf(getThemedColor(i10)));
        org.telegram.ui.Cells.o oVar = this.F3;
        if (oVar != null) {
            oVar.setColor(getThemedColor(i10));
        }
        xv xvVar = this.M0;
        if (xvVar == null || !(xvVar.getContentView() instanceof t11)) {
            return;
        }
        org.telegram.ui.ActionBar.m5 titleTextView = this.actionBar.getTitleTextView();
        t11 t11Var = (t11) this.M0.getContentView();
        if (titleTextView != null) {
            Drawable rightDrawable = titleTextView.getRightDrawable();
            org.telegram.ui.Components.f5 f5Var4 = this.E3;
            if (rightDrawable == f5Var4) {
                f5Var2 = f5Var4;
            }
        }
        t11Var.y(f5Var2, titleTextView);
    }

    public final boolean s3(long j3, View view) {
        if (this.m2 && getMessagesController().t2(j3)) {
            return false;
        }
        Long valueOf = Long.valueOf(j3);
        ArrayList arrayList = this.J2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j3));
            if (view instanceof org.telegram.ui.Cells.t2) {
                ((org.telegram.ui.Cells.t2) view).c0(false, true);
            } else if (view instanceof org.telegram.ui.Cells.g6) {
                ((org.telegram.ui.Cells.g6) view).w(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j3));
        if (view instanceof org.telegram.ui.Cells.t2) {
            ((org.telegram.ui.Cells.t2) view).c0(true, true);
        } else if (view instanceof org.telegram.ui.Cells.g6) {
            ((org.telegram.ui.Cells.g6) view).w(true, true);
        }
        return true;
    }

    public final boolean s4(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return false;
        }
        int i7 = this.e0[0].s;
        org.telegram.messenger.vo voVar = null;
        if ((i7 == 7 || i7 == 8) && (!this.actionBar.x() || this.actionBar.y(null))) {
            voVar = getMessagesController().M[this.e0[0].s == 8 ? (char) 1 : (char) 0];
        }
        return voVar != null ? voVar.j.indexOfKey(dialog.id) >= 0 : dialog.pinned;
    }

    public final void s5() {
        fi.m3 m3Var;
        boolean W4 = getMessagesController().W4();
        if (this.O3 != W4) {
            k5();
            if (!this.O3 && W4 && (m3Var = this.p0) != null) {
                m3Var.w();
            }
            this.O3 = W4;
        }
        org.telegram.ui.Components.p00 p00Var = this.t0;
        if (p00Var == null) {
            return;
        }
        if (this.S0 == 10) {
            p00Var.setImageResource(R.drawable.floating_check);
            this.t0.setContentDescription(org.telegram.messenger.id.M0(2131751354, null));
        } else {
            p00Var.setImageResource(R.drawable.filled_fab_compose_32);
            this.t0.setContentDescription(org.telegram.messenger.id.M0(2131748270, null));
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void setInPreviewMode(boolean z9) {
        super.setInPreviewMode(z9);
        sv svVar = this.E0;
        if (svVar != null) {
            if (!this.G0 || z9) {
                svVar.setVisibility(8);
            } else {
                svVar.setVisibility(0);
            }
        }
        l5(true);
        g5();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r2 == r3) goto L14;
     */
    @Override // org.telegram.ui.ActionBar.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTitleOverlayText(String str, int i7, Runnable runnable) {
        xv xvVar;
        org.telegram.ui.Components.f5 f5Var;
        super.setTitleOverlayText(str, i7, runnable);
        if (this.actionBar != null && (xvVar = this.M0) != null && (xvVar.getContentView() instanceof t11)) {
            org.telegram.ui.ActionBar.m5 titleTextView = this.actionBar.getTitleTextView();
            t11 t11Var = (t11) this.M0.getContentView();
            if (titleTextView != null) {
                Drawable rightDrawable = titleTextView.getRightDrawable();
                f5Var = this.E3;
            }
            f5Var = null;
            t11Var.y(f5Var, titleTextView);
        }
        sv svVar = this.E0;
        if (svVar != null) {
            org.telegram.ui.Components.i6 i6Var = svVar.T;
            svVar.U.b(i7 == 2131751805 ? org.telegram.messenger.g0.I2(org.telegram.messenger.id.M0(2131744113, null), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(2.0f)) : null, true);
            if (str != null) {
                svVar.g0 = true;
                if (svVar.h0 != i7) {
                    svVar.h0 = i7;
                    i6Var.c(org.telegram.messenger.id.M0(i7, str), !org.telegram.messenger.id.a0, true);
                }
            } else {
                svVar.g0 = false;
                svVar.h0 = 0;
                i6Var.c(svVar.f0, !org.telegram.messenger.id.a0, true);
            }
            svVar.a.a(svVar.g0, true);
            svVar.L0.x(i6Var);
        }
    }

    public final void t3(jg.o0 o0Var) {
        iw iwVar;
        if (!this.r3 || (iwVar = this.C0) == null) {
            return;
        }
        ArrayList arrayList = iwVar.C0;
        if (!arrayList.isEmpty()) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (o0Var.b((jg.o0) arrayList.get(i7))) {
                    return;
                }
            }
        }
        arrayList.add(o0Var);
        ow owVar = this.X;
        owVar.F.add(o0Var);
        owVar.I = r1.size() - 1;
        owVar.e();
        this.X.r.getText().clear();
        j5(true, null, null, false, true);
    }

    public final boolean t4() {
        return this.D2 == null && this.o2 == null;
    }

    public final void t5(boolean z9) {
        org.telegram.ui.ActionBar.l lVar;
        boolean z10;
        di.z6 j42;
        ArrayList arrayList;
        if (this.E0 == null || this.I != null) {
            return;
        }
        vv vvVar = this.G3;
        if ((vvVar != null && vvVar.c()) || this.r3 || (lVar = this.actionBar) == null || lVar.x() || this.m2) {
            return;
        }
        fi.va vaVar = fi.va.F2;
        int i7 = 0;
        if ((vaVar != null && vaVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().J0)) {
            z9 = false;
        }
        int i10 = 1;
        boolean z11 = !q4() && j4().I();
        if (this.Z2 != 0) {
            z10 = false;
        } else if (q4()) {
            z10 = !j4().h.isEmpty();
        } else {
            z10 = !z11 && (((arrayList = (j42 = j4()).g) != null && arrayList.size() > 0) || j42.J());
            z11 = j4().I();
        }
        this.L = z11;
        boolean z12 = this.G0;
        boolean z13 = z11 || z10;
        this.G0 = z13;
        if (z10 || z13) {
            this.E0.p(z9, z13 != z12);
        }
        boolean z14 = this.G0;
        int i11 = 2;
        int i12 = 8;
        if (z14 != z12) {
            if (z9) {
                ValueAnimator valueAnimator = this.J;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (this.G0 && !isInPreviewMode()) {
                    this.E0.setVisibility(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H0, this.G0 ? 1.0f : 0.0f);
                this.J = ofFloat;
                ofFloat.addUpdateListener(new ki(i10, this));
                this.J.addListener(new va(this, 25));
                this.J.setDuration(200L);
                this.J.setInterpolator(org.telegram.ui.Components.wq.f);
                this.J.start();
            } else {
                this.E0.setVisibility((!z14 || isInPreviewMode()) ? 8 : 0);
                this.H0 = this.G0 ? 1.0f : 0.0f;
                View view = this.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (z10 == this.M) {
            return;
        }
        this.M = z10;
        if (z10) {
            this.E0.l(false, 1.0f);
        }
        if (z9 && !isInPreviewMode()) {
            this.E0.setVisibility(0);
            float f10 = -this.N;
            float f42 = z10 ? 0.0f : f4();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.I = ofFloat2;
            ofFloat2.addUpdateListener(new hw(this, f10, z10, f42));
            this.I.addListener(new bw(this, z10, i11));
            this.I.setDuration(200L);
            this.I.setInterpolator(org.telegram.ui.Components.wq.f);
            this.I.start();
            return;
        }
        this.K = z10;
        sv svVar = this.E0;
        if ((z10 || this.L) && !isInPreviewMode()) {
            i12 = 0;
        }
        svVar.setVisibility(i12);
        if (z10) {
            this.z3 = -org.telegram.messenger.g0.L(81.0f);
            O4(-f4());
        } else {
            O4(0.0f);
        }
        while (true) {
            yw[] ywVarArr = this.e0;
            if (i7 >= ywVarArr.length) {
                break;
            }
            yw ywVar = ywVarArr[i7];
            if (ywVar != null) {
                ywVar.a.requestLayout();
            }
            i7++;
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            view2.requestLayout();
            this.fragmentView.invalidate();
        }
    }

    public final void u3(boolean z9) {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.X2 == 0 && this.Z2 == 0 && Build.VERSION.SDK_INT >= 33 && gh0.J0(parentActivity)) {
            if (z9) {
                showDialog(new gh0(parentActivity, !c8.ia.a(), new uu(parentActivity, 1)));
                return;
            }
            arrayList.add("android.permission.POST_NOTIFICATIONS");
        }
        if (getUserConfig().U && this.V1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z9) {
                org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.u4.v(parentActivity, new lu(this, 1)).a;
                this.U1 = u1Var;
                showDialog(u1Var);
                return;
            } else {
                arrayList.add("android.permission.READ_CONTACTS");
                arrayList.add("android.permission.WRITE_CONTACTS");
                arrayList.add("android.permission.GET_ACCOUNTS");
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                arrayList.add("android.permission.READ_MEDIA_IMAGES");
            }
            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                arrayList.add("android.permission.READ_MEDIA_VIDEO");
            }
            if (parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
            }
        } else if ((i7 <= 28 || org.telegram.messenger.r2.b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
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
            V4();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u5(int i7, boolean z9) {
        RecyclerView recyclerView;
        int i10;
        int childCount;
        int i11;
        int i12 = 131072;
        if (this.T1) {
            int i13 = org.telegram.messenger.qp.C8;
            if ((i7 & 131072) == 0) {
                return;
            }
        }
        if (this.isPaused) {
            return;
        }
        int i14 = 0;
        while (i14 < 3) {
            if (i14 == 2) {
                iw iwVar = this.C0;
                recyclerView = iwVar != null ? iwVar.a0 : null;
            } else {
                yw[] ywVarArr = this.e0;
                if (ywVarArr != null) {
                    vw vwVar = i14 < ywVarArr.length ? ywVarArr[i14].a : null;
                    if (vwVar == null || ywVarArr[i14].getVisibility() == 0) {
                        r6 = vwVar != null ? this.e0[i14] : null;
                        recyclerView = vwVar;
                    }
                }
                i10 = i14;
                i14 = i10 + 1;
                i12 = 131072;
            }
            if (recyclerView != null && recyclerView.getAdapter() != null) {
                int i15 = org.telegram.messenger.qp.C8;
                if (((i7 & 2048) != 0 || i7 == 0) && r6 != null) {
                    r6.q(false);
                } else {
                    int childCount2 = recyclerView.getChildCount();
                    int i16 = 0;
                    while (i16 < childCount2) {
                        View childAt = recyclerView.getChildAt(i16);
                        boolean z10 = childAt instanceof org.telegram.ui.Cells.t2;
                        ArrayList arrayList = this.J2;
                        if (z10 && (this.C0 == null || recyclerView.getAdapter() != this.C0.d0)) {
                            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) childAt;
                            int i17 = org.telegram.messenger.qp.C8;
                            if ((i7 & i12) != 0) {
                                t2Var.a0(this.actionBar.x(), true);
                                if (this.T1) {
                                    i10 = i14;
                                    i16++;
                                    i14 = i10;
                                    i12 = 131072;
                                }
                            }
                            if ((65536 & i7) != 0) {
                                t2Var.c0(false, (i7 & TLObject.FLAG_13) != 0);
                            } else {
                                if ((i7 & 512) == 0) {
                                    i10 = i14;
                                    if (t2Var.j0(i7, z9)) {
                                        r6.q(false);
                                        break;
                                    }
                                } else if (this.e0[i14].p() && org.telegram.messenger.g0.Q1()) {
                                    i10 = i14;
                                    t2Var.setDialogSelected(t2Var.getDialogId() == this.q2.a);
                                } else {
                                    i10 = i14;
                                }
                                if (arrayList != null) {
                                    t2Var.c0(arrayList.contains(Long.valueOf(t2Var.getDialogId())), false);
                                }
                                if (!(childAt instanceof org.telegram.ui.Cells.pa)) {
                                    ((org.telegram.ui.Cells.pa) childAt).i(i7);
                                } else if (childAt instanceof org.telegram.ui.Cells.g6) {
                                    org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) childAt;
                                    g6Var.y(i7);
                                    if (arrayList != null) {
                                        g6Var.w(arrayList.contains(Long.valueOf(g6Var.getDialogId())), false);
                                    }
                                }
                                if (!this.T1 && (childAt instanceof org.telegram.ui.Components.pj0)) {
                                    org.telegram.ui.Components.pj0 pj0Var = (org.telegram.ui.Components.pj0) childAt;
                                    childCount = pj0Var.getChildCount();
                                    for (i11 = 0; i11 < childCount; i11++) {
                                        View childAt2 = pj0Var.getChildAt(i11);
                                        if (childAt2 instanceof org.telegram.ui.Cells.o4) {
                                            ((org.telegram.ui.Cells.o4) childAt2).b(i7);
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
                            org.telegram.ui.Components.pj0 pj0Var2 = (org.telegram.ui.Components.pj0) childAt;
                            childCount = pj0Var2.getChildCount();
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

    @Override // org.telegram.ui.le0
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
        int i7 = 0;
        if (this.H2 == null) {
            org.telegram.ui.Components.po0 po0Var = new org.telegram.ui.Components.po0(getParentActivity(), getResourceProvider());
            this.H2 = po0Var;
            po0Var.setLayoutClickListener(new hu(this, i7));
            this.H2.setOnModeChangeListener(new iu(this, i7));
            mv mvVar = this.C1;
            org.telegram.ui.Components.po0 po0Var2 = this.H2;
            if (po0Var2 == null) {
                mvVar.getClass();
            } else {
                mvVar.G1 = po0Var2;
                mvVar.addView(po0Var2, 0, c8.ha.e(-1, 48, 51));
                mvVar.g3 = false;
                mvVar.I();
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
                org.telegram.ui.Components.po0 po0Var3 = this.H2;
                po0Var3.g(this.currentAccount);
                if (!str.isEmpty()) {
                    po0Var3.e(str, true);
                }
            } else {
                CharSequence charSequence2 = this.G2;
                if (charSequence2 != null) {
                    org.telegram.ui.Components.po0 po0Var4 = this.H2;
                    po0Var4.g(this.currentAccount);
                    if (charSequence2.length() > 0) {
                        po0Var4.e(charSequence2, true);
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.C1.setFieldText(charSequence);
        }
        this.C1.setOverrideHint(org.telegram.messenger.id.M0(m4() ? 2131754454 : 2131745462, null));
        H3();
        if (this.H2.getMode() != 0) {
            this.C1.y1(false, false);
        }
        p5();
    }

    public final void v4(long j3) {
        long j10 = j3;
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().Q.f(j10);
        int i7 = 0;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            ArrayList arrayList = (ArrayList) getMessagesController().x.f(dialog.community_id);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                v4(((TLRPC.Dialog) obj).id);
            }
            return;
        }
        int i10 = this.e0[0].s;
        org.telegram.messenger.vo voVar = null;
        if ((i10 == 7 || i10 == 8) && (!this.actionBar.x() || this.actionBar.y(null))) {
            voVar = getMessagesController().M[this.e0[0].s == 8 ? (char) 1 : (char) 0];
        }
        int i11 = -1;
        if (voVar != null) {
            int i12 = voVar.g;
            int i13 = org.telegram.messenger.qp.C8;
            if ((i12 & 64) != 0 && !voVar.a(this.currentAccount, dialog)) {
                M4(true, true);
                z3();
                if (this.S1 != null) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= this.S1.size()) {
                            break;
                        }
                        if (((TLRPC.Dialog) this.S1.get(i14)).id == j10) {
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
        if (getMessagesController().t2(j10) || getMessagesController().z2(j10)) {
            org.telegram.messenger.qp messagesController = getMessagesController();
            org.telegram.messenger.yr messagesStorage = messagesController.getMessagesStorage();
            org.telegram.messenger.rl rlVar = new org.telegram.messenger.rl(messagesController, j10);
            org.telegram.messenger.p5 p5Var = messagesStorage.a;
            org.telegram.messenger.a4 a4Var = new org.telegram.messenger.a4(messagesStorage, j10, rlVar, 5);
            j10 = j10;
            p5Var.c(a4Var);
        }
        getMessagesController().o3(j10, 0L);
        org.telegram.messenger.qp messagesController2 = getMessagesController();
        int i16 = dialog.top_message;
        messagesController2.j3(j10, i16, i16, dialog.last_message_date, false, 0L, 0, true, 0);
        if (i15 >= 0) {
            this.S1.remove(i15);
            this.e0[0].y.D();
            this.e0[0].q(true);
        }
    }

    public final boolean v5(long j3) {
        TLRPC.Chat M0;
        mv mvVar;
        if ((this.T0 <= 1 && ((mvVar = this.C1) == null || mvVar.getVisibility() != 0 || TextUtils.isEmpty(this.C1.getFieldText()))) || !org.telegram.messenger.m5.z(j3) || (M0 = getMessagesController().M0(Long.valueOf(-j3))) == null || org.telegram.messenger.t3.N(M0) || !M0.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.u4.r0(this, org.telegram.messenger.id.M0(2131745310, null), org.telegram.messenger.id.M0(2131745302, null), null);
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
            TLRPC.RequestPeerType requestPeerType = this.G;
            if (V == (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) && (((bool = requestPeerType.creator) == null || !bool.booleanValue() || chat.creator) && ((bool2 = this.G.bot_participant) == null || !bool2.booleanValue() || getMessagesController().x2(chat, user) || org.telegram.messenger.t3.b(chat)))) {
                Boolean bool3 = this.G.has_username;
                if (bool3 != null) {
                }
                Boolean bool4 = this.G.forum;
                if ((bool4 == null || bool4.booleanValue() == org.telegram.messenger.t3.c0(chat)) && ((this.G.user_admin_rights == null || getMessagesController().u3(chat, getUserConfig().f(), this.G.user_admin_rights)) && (this.G.bot_admin_rights == null || getMessagesController().u3(chat, user, this.G.bot_admin_rights) || org.telegram.messenger.t3.w(4, chat)))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean x3() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.J2;
            if (i7 >= arrayList.size()) {
                return true;
            }
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-((Long) arrayList.get(i7)).longValue()));
            if (M0 != null && !org.telegram.messenger.t3.l(M0)) {
                return false;
            }
            i7++;
        }
    }

    public final boolean x4(TLRPC.User user) {
        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) this.G;
        if (user == null || org.telegram.messenger.t10.z(user) || org.telegram.messenger.t10.x(user)) {
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
        org.telegram.ui.Components.ze0 ze0Var;
        iv ivVar;
        org.telegram.ui.Components.yl0 yl0Var;
        g61 g61Var;
        iw iwVar = this.C0;
        if (iwVar != null && (yl0Var = iwVar.d0) != null && (g61Var = yl0Var.k0) != null) {
            int childCount = g61Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = g61Var.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.o4) {
                    org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) childAt;
                    org.telegram.ui.Components.v8 v8Var = o4Var.c;
                    int i10 = o4Var.h;
                    if (org.telegram.messenger.m5.E(o4Var.f)) {
                        TLRPC.User a22 = org.telegram.messenger.qp.s1(i10).a2(Long.valueOf(o4Var.f));
                        o4Var.e = a22;
                        v8Var.r(a22);
                    } else {
                        v8Var.q(org.telegram.messenger.qp.s1(i10).M0(Long.valueOf(-o4Var.f)));
                        o4Var.e = null;
                    }
                    o4Var.c(true);
                }
            }
        }
        if (this.e0 != null) {
            int i11 = 0;
            while (true) {
                yw[] ywVarArr = this.e0;
                if (i11 >= ywVarArr.length) {
                    break;
                }
                yw ywVar = ywVarArr[i11];
                if (ywVar != null && (ivVar = ywVar.n) != null) {
                    ivVar.i();
                }
                i11++;
            }
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.H(getThemedColor(org.telegram.ui.ActionBar.m6.G8), true);
            this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.m6.E8), false, true);
            this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.m6.F8), true, true);
            this.actionBar.J(getThemedColor(org.telegram.ui.ActionBar.m6.I5), true);
            this.actionBar.updateColors();
        }
        if (this.E3 != null) {
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.m6.ni);
            Drawable drawable = this.L3;
            if (drawable != null && themedColor2 != this.x4) {
                this.x4 = themedColor2;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.Components.f5 f5Var = this.E3;
            if (f5Var != null) {
                f5Var.k(Integer.valueOf(themedColor2));
            }
            org.telegram.ui.Cells.o oVar = this.F3;
            if (oVar != null) {
                oVar.setColor(themedColor2);
            }
        }
        org.telegram.ui.Cells.b3 b3Var = this.N1;
        if (b3Var != null) {
            org.telegram.ui.ActionBar.m6.H1(b3Var.getBackground(), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.i6, false), true);
        }
        org.telegram.ui.ActionBar.r0 r0Var = this.m0;
        if (r0Var != null) {
            r0Var.setIconColor(getThemedColor(org.telegram.ui.ActionBar.m6.v8));
        }
        mv mvVar = this.C1;
        if (mvVar != null) {
            mvVar.updateColors();
        }
        pw pwVar = this.z0;
        if (pwVar != null) {
            fh.g gVar = pwVar.y0;
            if (gVar != null) {
                gVar.updateColors();
            }
            pwVar.invalidate();
        }
        jg.q0 q0Var = this.b0;
        if (q0Var != null) {
            q0Var.updateColors();
        }
        iw iwVar2 = this.C0;
        if (iwVar2 != null && (ze0Var = iwVar2.r0) != null) {
            ze0Var.c();
        }
        org.telegram.ui.Components.u61 u61Var = this.a0;
        if (u61Var != null) {
            u61Var.updateColors();
        }
        gz0 gz0Var = this.Z;
        if (gz0Var != null) {
            gz0Var.updateColors();
        }
        if (this.K0 != null) {
            int o4 = i0.a.o(getThemedColor(org.telegram.ui.ActionBar.m6.d6), 100);
            if (!(this.K0.getForeground() instanceof ColorDrawable)) {
                this.K0.setForeground(new ColorDrawable(o4));
            } else if (((ColorDrawable) this.K0.getForeground()).getColor() != o4) {
                ((ColorDrawable) this.K0.getForeground()).setColor(o4);
            }
        }
        org.telegram.ui.Components.p00 p00Var = this.t0;
        if (p00Var != null) {
            p00Var.updateColors();
        }
        org.telegram.ui.Components.p00 p00Var2 = this.u0;
        if (p00Var2 != null) {
            p00Var2.updateColors();
        }
        int i12 = org.telegram.ui.ActionBar.m6.d6;
        this.n4.a(getThemedColor(i12));
        org.telegram.ui.Components.or orVar = this.K1;
        if (orVar != null) {
            orVar.updateColors();
        }
        org.telegram.ui.Components.nr nrVar = this.L1;
        if (nrVar != null) {
            nrVar.setColor(org.telegram.ui.ActionBar.m6.x0(null, i12, false));
        }
        kv kvVar = this.I1;
        if (kvVar != null) {
            kvVar.updateColors();
        }
        kv kvVar2 = this.G1;
        if (kvVar2 != null) {
            kvVar2.updateColors();
        }
        n5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        sv svVar = this.E0;
        if (svVar != null) {
            svVar.o();
        }
        if (this.D3 != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.Ul)) != this.w4) {
            this.w4 = themedColor;
            this.D3.setColorFilter(themedColor, PorterDuff.Mode.MULTIPLY);
        }
        ow owVar = this.X;
        if (owVar != null) {
            owVar.updateColors();
        }
    }

    public final void y4(View view) {
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        int i7 = 1;
        org.telegram.ui.ActionBar.w2 h = org.telegram.messenger.camera.q.h(getParentActivity(), false, 1, null);
        boolean z9 = getMessagesStorage().L != 0;
        int[] iArr = {z9 ? R.drawable.msg_markread : 0, org.telegram.messenger.iz.q1 ? R.drawable.chats_pin : R.drawable.chats_unpin};
        CharSequence[] charSequenceArr = {z9 ? org.telegram.messenger.id.M0(2131748682, null) : null, org.telegram.messenger.id.M0(org.telegram.messenger.iz.q1 ? 2131747246 : 2131749324, null)};
        k4 k4Var = new k4(this, i7);
        h.L = charSequenceArr;
        h.M = iArr;
        h.K = k4Var;
        showDialog(h);
    }

    public final void z3() {
        org.telegram.messenger.g0.i3(new cv(this, 0), 300L);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z4(View view, int i7, v4.g0 g0Var) {
        v4.g0 g0Var2;
        long j3;
        boolean z9;
        int i10;
        int i11;
        int i12;
        org.telegram.messenger.ij ijVar;
        long j10;
        long j11;
        org.telegram.ui.Components.yl0 yl0Var;
        vv vvVar;
        long j12;
        long j13;
        int i13;
        org.telegram.messenger.ij ijVar2;
        long F;
        long j14;
        long j15;
        TLRPC.Chat M0;
        boolean z10;
        iw iwVar;
        int i14;
        Object J;
        long j16;
        long j17;
        int i15;
        if (getParentActivity() == null) {
            return;
        }
        boolean z11 = g0Var instanceof jg.n;
        if (z11) {
            jg.n nVar = (jg.n) g0Var;
            int i16 = nVar.h;
            if (i16 == 7 || i16 == 8) {
                org.telegram.messenger.vo voVar = getMessagesController().M[i16 == 7 ? (char) 0 : (char) 1];
                if (voVar != null) {
                    i14 = voVar.a;
                    J = nVar.J(i7);
                    if (this.D2 == null && nVar.n && g0Var.d(i7) == 21) {
                        this.D2.N(this);
                        return;
                    }
                    if (J instanceof TLRPC.User) {
                        if (J instanceof TLRPC.Chat) {
                            j17 = ((TLRPC.Chat) J).id;
                        } else if (J instanceof TLRPC.Dialog) {
                            TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                            i15 = dialog.folder_id;
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                if (this.actionBar.y(null)) {
                                    return;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putInt("folderId", ((TLRPC.TL_dialogFolder) dialog).folder.id);
                                presentFragment(new zw(bundle));
                                return;
                            }
                            j16 = dialog.id;
                            if (this.actionBar.y(null)) {
                                Y4(j16, view);
                                return;
                            }
                            g0Var2 = g0Var;
                            i10 = i15;
                            z9 = false;
                            i11 = 0;
                            ijVar = null;
                            i12 = i14;
                            j11 = j16;
                            j10 = 0;
                            j3 = 0;
                        } else if (J instanceof TLRPC.TL_recentMeUrlChat) {
                            j17 = ((TLRPC.TL_recentMeUrlChat) J).chat_id;
                        } else if (J instanceof TLRPC.TL_recentMeUrlUser) {
                            j16 = ((TLRPC.TL_recentMeUrlUser) J).user_id;
                        } else {
                            if (!(J instanceof TLRPC.TL_recentMeUrlChatInvite)) {
                                if (J instanceof TLRPC.TL_recentMeUrlStickerSet) {
                                    TLRPC.StickerSet stickerSet = ((TLRPC.TL_recentMeUrlStickerSet) J).set.set;
                                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                                    tL_inputStickerSetID.id = stickerSet.id;
                                    tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                                    showDialog(new org.telegram.ui.Components.yv0(getParentActivity(), this, tL_inputStickerSetID, null, null, null));
                                    return;
                                }
                                return;
                            }
                            TLRPC.TL_recentMeUrlChatInvite tL_recentMeUrlChatInvite = (TLRPC.TL_recentMeUrlChatInvite) J;
                            g0Var2 = g0Var;
                            TLRPC.ChatInvite chatInvite = tL_recentMeUrlChatInvite.chat_invite;
                            TLRPC.Chat chat = chatInvite.chat;
                            if ((chat == null && (!chatInvite.channel || chatInvite.megagroup)) || (chat != null && (!org.telegram.messenger.t3.T(chat) || chatInvite.chat.megagroup))) {
                                String str = tL_recentMeUrlChatInvite.url;
                                int indexOf = str.indexOf(47);
                                if (indexOf > 0) {
                                    str = str.substring(indexOf + 1);
                                }
                                showDialog(new org.telegram.ui.Components.b70(getParentActivity(), chatInvite, str, this, null));
                                return;
                            }
                            TLRPC.Chat chat2 = chatInvite.chat;
                            if (chat2 == null) {
                                return;
                            }
                            j16 = -chat2.id;
                            i15 = 0;
                            i10 = i15;
                            z9 = false;
                            i11 = 0;
                            ijVar = null;
                            i12 = i14;
                            j11 = j16;
                            j10 = 0;
                            j3 = 0;
                        }
                        j16 = -j17;
                    } else {
                        j16 = ((TLRPC.User) J).id;
                    }
                    g0Var2 = g0Var;
                    i15 = 0;
                    i10 = i15;
                    z9 = false;
                    i11 = 0;
                    ijVar = null;
                    i12 = i14;
                    j11 = j16;
                    j10 = 0;
                    j3 = 0;
                }
            }
            i14 = 0;
            J = nVar.J(i7);
            if (this.D2 == null) {
            }
            if (J instanceof TLRPC.User) {
            }
            g0Var2 = g0Var;
            i15 = 0;
            i10 = i15;
            z9 = false;
            i11 = 0;
            ijVar = null;
            i12 = i14;
            j11 = j16;
            j10 = 0;
            j3 = 0;
        } else {
            g0Var2 = g0Var;
            iw iwVar2 = this.C0;
            if (iwVar2 == null || g0Var2 != (yl0Var = iwVar2.d0)) {
                j3 = 0;
                z9 = false;
                i10 = 0;
                i11 = 0;
                i12 = 0;
                ijVar = null;
                j10 = 0;
                j11 = 0;
            } else {
                Object I = yl0Var.I(i7);
                z9 = this.C0.d0.N(i7);
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
                    if (I instanceof org.telegram.messenger.ij) {
                        ijVar2 = (org.telegram.messenger.ij) I;
                        long B0 = org.telegram.messenger.ij.B0(ijVar2.k);
                        int e12 = ijVar2.e1();
                        j3 = 0;
                        j13 = org.telegram.messenger.t3.c0(getMessagesController().M0(Long.valueOf(-B0))) ? org.telegram.messenger.ij.b2(ijVar2.I1, ijVar2.k, true, false) : 0L;
                        iw iwVar3 = this.C0;
                        if (iwVar3 != null) {
                            org.telegram.ui.Components.yl0 yl0Var2 = iwVar3.d0;
                            yl0Var2.j0.a(yl0Var2.Z);
                        }
                        i13 = e12;
                        j12 = B0;
                    } else {
                        j3 = 0;
                        if (I instanceof String) {
                            String str2 = (String) I;
                            iw iwVar4 = this.C0;
                            if (iwVar4 != null && !iwVar4.d0.J.isEmpty()) {
                                this.X.r.setText(str2);
                                this.X.r.setSelection(str2.length());
                            } else if (!str2.equals("section")) {
                                dh0 dh0Var = new dh0(getParentActivity(), this);
                                dh0Var.N0(str2, true);
                                dh0Var.show();
                            }
                        } else if (I instanceof org.telegram.messenger.d5) {
                            org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) I;
                            org.telegram.ui.Components.u4.u(this, d5Var.i, d5Var.j, (String) d5Var.e.get(0));
                        } else if ((I instanceof TLRPC.TL_forumTopic) && (vvVar = this.G3) != null && (vvVar.getFragment() instanceof z91)) {
                            j12 = -((z91) this.G3.getFragment()).a;
                            j13 = ((TLRPC.TL_forumTopic) I).id;
                            i13 = 0;
                            ijVar2 = null;
                        }
                        i13 = 0;
                        ijVar2 = null;
                        j13 = 0;
                        j12 = 0;
                    }
                    if (j12 == j3 && this.actionBar.x()) {
                        if (this.actionBar.y("search_dialogs_action_mode") && i13 == 0 && !z9) {
                            Y4(j12, view);
                            return;
                        }
                        return;
                    }
                    j11 = j12;
                    j10 = j13;
                    i12 = 0;
                    i11 = i13;
                    ijVar = ijVar2;
                    i10 = 0;
                }
                i13 = 0;
                ijVar2 = null;
                j12 = F;
                j13 = 0;
                j3 = 0;
                if (j12 == j3) {
                }
                j11 = j12;
                j10 = j13;
                i12 = 0;
                i11 = i13;
                ijVar = ijVar2;
                i10 = 0;
            }
        }
        if (j11 == j3) {
            return;
        }
        if (this.m2) {
            if (v5(j11)) {
                if ((!getMessagesController().t2(j11) && !getMessagesController().p2(j11)) || r4(j11)) {
                    ArrayList arrayList = this.J2;
                    if (!arrayList.isEmpty() || (this.S0 == 3 && this.g2 != null)) {
                        if (arrayList.contains(Long.valueOf(j11)) || A3(j11)) {
                            boolean s32 = s3(j11, view);
                            iw iwVar5 = this.C0;
                            if (iwVar5 != null && g0Var2 == iwVar5.d0) {
                                this.actionBar.n(true);
                                b4(j11, s32);
                            }
                            o5();
                            return;
                        }
                        return;
                    }
                }
                if (this.n2 && getMessagesController().p2(j11)) {
                    Bundle bundle2 = new Bundle(this.arguments);
                    bundle2.putLong("community_id", -j11);
                    zw zwVar = new zw(bundle2);
                    zwVar.Y2 = this;
                    zwVar.D2 = this.D2;
                    presentFragment(zwVar);
                    return;
                }
                if (!this.n2 || ((!getMessagesController().t2(j11) || r4(j11)) && !getMessagesController().z2(j11))) {
                    a4(j11, 0L, true, null);
                    return;
                }
                Bundle bundle3 = new Bundle();
                bundle3.putLong("chat_id", -j11);
                bundle3.putBoolean("for_select", true);
                bundle3.putBoolean("forward_to", true);
                bundle3.putBoolean("bot_share_to", this.S0 == 1);
                bundle3.putBoolean("quote", this.O0);
                bundle3.putBoolean("reply_to", this.N0);
                z91 z91Var = new z91(bundle3);
                z91Var.L0 = this;
                presentFragment(z91Var);
                return;
            }
            return;
        }
        Bundle bundle4 = new Bundle();
        if (org.telegram.messenger.m5.C(j11)) {
            j14 = j10;
            bundle4.putInt("enc_id", (int) (j11 & 4294967295L));
        } else {
            j14 = j10;
            if (org.telegram.messenger.m5.E(j11)) {
                bundle4.putLong("user_id", j11);
            } else {
                if (i11 == 0 || (M0 = getMessagesController().M0(Long.valueOf(-j11))) == null || M0.migrated_to == null) {
                    j15 = j11;
                } else {
                    bundle4.putLong("migrated_to", j11);
                    j15 = -M0.migrated_to.channel_id;
                }
                bundle4.putLong("chat_id", -j15);
            }
        }
        if (i11 != 0) {
            bundle4.putInt("message_id", i11);
        } else if (z9) {
            TLObject tLObject = this.Y1;
            if (tLObject != null) {
                iw iwVar6 = this.C0;
                if (iwVar6 != null) {
                    iwVar6.d0.Q(this.X1, tLObject);
                }
                this.Y1 = null;
            }
        } else {
            V3();
        }
        boolean z12 = (org.telegram.messenger.id.a0 || this.k2 || (org.telegram.messenger.g0.Q1() && i10 != 0) || !org.telegram.messenger.sc.e(64) || this.Z2 != j3) ? false : true;
        bundle4.putInt("dialog_folder_id", i10);
        bundle4.putInt("dialog_filter_id", i12);
        if (org.telegram.messenger.g0.Q1() && ((!getMessagesController().t2(j11) || !z12) && this.q2.a == j11 && ((iwVar = this.C0) == null || g0Var2 != iwVar.d0))) {
            if (getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) getParentActivity();
                List fragmentStack = launchActivity.q0.getFragmentStack();
                if (fragmentStack.isEmpty()) {
                    return;
                }
                if (fragmentStack.size() == 1 && (rf.b.g(1, fragmentStack) instanceof cn)) {
                    ((cn) rf.b.g(1, fragmentStack)).wa();
                    return;
                }
                if (fragmentStack.size() == 2) {
                    launchActivity.q0.l(true, false);
                    return;
                } else {
                    if (getParentActivity() instanceof LaunchActivity) {
                        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) fragmentStack.get(0);
                        fragmentStack.clear();
                        fragmentStack.add(f2Var);
                        launchActivity.q0.X(true, true);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        iw iwVar7 = this.C0;
        if (iwVar7 != null && iwVar7.A0) {
            iwVar7.R(false);
        }
        if (j11 == getUserConfig().e() && getMessagesController().o6) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("dialog_id", org.telegram.messenger.p10.i(this.currentAccount).e());
            bundle5.putInt(TeXSymbolParser.TYPE_ATTR, 0);
            bundle5.putInt("start_from", 11);
            if (this.D0 == null) {
                this.D0 = new org.telegram.ui.Components.qs0(this);
            }
            presentFragment(new org.telegram.ui.Components.v80(bundle5, this.D0));
            return;
        }
        if (this.o2 != null) {
            if (getMessagesController().E(bundle4, this, null, null)) {
                getNotificationCenter().k(org.telegram.messenger.qs.t, new Object[0]);
                cn cnVar = new cn(bundle4);
                p4(cnVar, ijVar);
                presentFragment(cnVar);
                return;
            }
            return;
        }
        this.A3 = true;
        if (getMessagesController().E(bundle4, this, null, null)) {
            TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(-j11));
            TLRPC.Dialog S0 = getMessagesController().S0(j11);
            boolean V = org.telegram.messenger.t3.V(M02);
            boolean z13 = S0 != null && S0.view_forum_as_messages;
            int b10 = (this.Z2 == j3 || M02 == null) ? 0 : ii.m0.b(this.currentAccount, -M02.id);
            if (b10 == 3) {
                showDialog(new org.telegram.ui.Components.b70(getParentActivity(), M02, null, this, this.resourceProvider));
                return;
            }
            int i17 = 4;
            if (b10 == 4) {
                org.telegram.messenger.k5.o(null, V ? 2131751930 : 2131751927, org.telegram.ui.Components.gc.a0(this), R.raw.e_hand_2, 36);
                return;
            }
            if (M02 == null || !(((z10 = M02.monoforum) || M02.forum) && j14 == j3)) {
                if (org.telegram.messenger.t3.Y(M02)) {
                    Bundle bundle6 = new Bundle();
                    bundle6.putLong("community_id", M02.id);
                    presentFragment(new zw(bundle6));
                    return;
                }
                cn cnVar2 = new cn(bundle4);
                if (j14 != j3) {
                    qg.d.a(cnVar2, org.telegram.messenger.xr.a(j11, j14));
                }
                if (z11 && org.telegram.messenger.m5.E(j11) && getMessagesController().Q.f(j11) == null) {
                    org.telegram.messenger.ui mediaDataController = getMediaDataController();
                    TLRPC.Document document = mediaDataController.y0;
                    mediaDataController.n1();
                    if (document != null) {
                        cnVar2.W9 = document;
                        cnVar2.X9 = true;
                    }
                }
                if (org.telegram.messenger.g0.Q1()) {
                    vv vvVar2 = this.G3;
                    if (vvVar2.a != null) {
                        vvVar2.a();
                    }
                }
                p4(cnVar2, ijVar);
                presentFragment(cnVar2);
                return;
            }
            if (z10) {
                bundle4.putInt("chatMode", 8);
                bundle4.putBoolean("isSubscriberSuggestions", !org.telegram.messenger.t3.A(this.currentAccount, M02, 24));
                cn cnVar3 = new cn(bundle4);
                p4(cnVar3, ijVar);
                presentFragment(cnVar3);
                return;
            }
            if (org.telegram.messenger.t3.a(M02)) {
                cn cnVar4 = new cn(bundle4);
                qg.d.a(cnVar4, org.telegram.messenger.xr.a(-M02.id, getMessagesController().e7.getLong(a8.p0.o(M02.id, "forumlasttopic"), 1L)));
                presentFragment(cnVar4);
                return;
            }
            if (!org.telegram.messenger.sc.e(64) || this.Z2 != j3) {
                if (!z13) {
                    presentFragment(new z91(bundle4));
                    return;
                }
                cn cnVar5 = new cn(bundle4);
                p4(cnVar5, ijVar);
                presentFragment(cnVar5);
                return;
            }
            if (!z12) {
                if (!z13) {
                    presentFragment(new z91(bundle4));
                    return;
                }
                cn cnVar6 = new cn(bundle4);
                p4(cnVar6, ijVar);
                presentFragment(cnVar6);
                return;
            }
            if (this.k2) {
                return;
            }
            if (z13) {
                cn cnVar7 = new cn(bundle4);
                p4(cnVar7, ijVar);
                presentFragment(cnVar7);
                return;
            }
            vv vvVar3 = this.G3;
            cw cwVar = vvVar3.a;
            if (cwVar == null || (-cwVar.a) != j11) {
                vw vwVar = this.e0[0].a;
                vwVar.v3 = 0.0f;
                vwVar.w3 = vwVar.u3;
                vwVar.x3 = vwVar.o3 != 0.0f;
                cw cwVar2 = new cw(bundle4);
                cwVar2.M0 = this;
                final vv vvVar4 = this.G3;
                org.telegram.ui.ActionBar.r4 parentLayout = getParentLayout();
                h2.f fVar = vvVar4.n;
                if (!vvVar4.r) {
                    vvVar4.x = parentLayout;
                    cwVar2.onFragmentCreate();
                    cwVar2.setInPreviewMode(true);
                    cwVar2.setParentLayout(parentLayout);
                    View performCreateView = cwVar2.performCreateView(vvVar4.getContext());
                    cwVar2.onResume();
                    vvVar4.b = performCreateView;
                    vvVar4.addView(performCreateView);
                    final cw cwVar3 = vvVar4.a;
                    k0 k0Var = cwVar2.e;
                    vvVar4.c = k0Var;
                    vvVar4.addView(k0Var);
                    vvVar4.a = cwVar2;
                    az0.Q = j3;
                    az0.Q = -cwVar2.a;
                    if (cwVar2.getActionBar() != null) {
                        org.telegram.ui.ActionBar.l actionBar = cwVar2.getActionBar();
                        vvVar4.d = actionBar;
                        vvVar4.addView(actionBar);
                        vvVar4.d.e1 = new uu0(vvVar4, 10);
                    }
                    if (cwVar3 != null) {
                        final cw cwVar4 = vvVar4.a;
                        if (org.telegram.messenger.iz.c()) {
                            r1.g gVar = vvVar4.y;
                            if (gVar != null) {
                                gVar.d();
                            }
                            cwVar4.onTransitionAnimationStart(true, false);
                            vvVar4.E = cwVar3;
                            vvVar4.w = true;
                            fVar.d();
                            r1.g gVar2 = new r1.g(new r1.f(0.0f));
                            vvVar4.y = gVar2;
                            gVar2.m = org.telegram.ui.Cells.f1.o(1000.0f, 400.0f, 1.0f);
                            az0.f(cwVar3, cwVar4, 0.0f);
                            vvVar4.y.b(new db0(vvVar4, i17));
                            vvVar4.y.a(new r1.c() { // from class: org.telegram.ui.yy0
                                @Override // r1.c
                                public final void a(r1.g gVar3, boolean z14, float f10, float f11) {
                                    az0 az0Var = vvVar4;
                                    if (az0Var.y == null) {
                                        return;
                                    }
                                    az0Var.y = null;
                                    org.telegram.ui.ActionBar.f2 f2Var2 = cwVar4;
                                    f2Var2.onTransitionAnimationEnd(true, false);
                                    org.telegram.ui.ActionBar.f2 f2Var3 = cwVar3;
                                    az0.f(f2Var3, f2Var2, 1.0f);
                                    az0Var.w = false;
                                    az0Var.E = null;
                                    f2Var3.onPause();
                                    f2Var3.onFragmentDestroy();
                                    az0Var.removeView(f2Var3.getFragmentView());
                                    az0Var.removeView(f2Var3.getActionBar());
                                    az0Var.n.e();
                                }
                            });
                            vvVar4.y.h();
                        } else {
                            cwVar4.onTransitionAnimationStart(true, false);
                            cwVar4.onTransitionAnimationEnd(true, false);
                            az0.f(cwVar3, cwVar4, 1.0f);
                            vvVar4.w = false;
                            vvVar4.E = null;
                            cwVar3.onPause();
                            cwVar3.onFragmentDestroy();
                            vvVar4.removeView(cwVar3.getFragmentView());
                            vvVar4.removeView(cwVar3.getActionBar());
                            fVar.e();
                        }
                    } else if (!vvVar4.f) {
                        int i18 = 1;
                        vvVar4.f = true;
                        if (org.telegram.messenger.iz.c()) {
                            fVar.d();
                            vvVar4.h = ValueAnimator.ofFloat(0.0f, 1.0f);
                            vvVar4.e = 0.0f;
                            vvVar4.e(true);
                            vvVar4.g();
                            cwVar2.onTransitionAnimationStart(true, false);
                            vvVar4.h.addUpdateListener(new xy0(vvVar4, i18));
                            vvVar4.h.addListener(new org.telegram.ui.Components.v50(13, vvVar4, cwVar2));
                            vvVar4.h.setDuration(250L);
                            vvVar4.h.setInterpolator(org.telegram.ui.Components.wq.f);
                            vvVar4.h.setStartDelay(org.telegram.messenger.iz.o() >= 2 ? 50L : 150L);
                            vvVar4.h.start();
                        } else {
                            vvVar4.e(true);
                            cwVar2.onTransitionAnimationStart(true, false);
                            cwVar2.onTransitionAnimationEnd(true, false);
                            vvVar4.e = 1.0f;
                            vvVar4.g();
                            vvVar4.d(false);
                        }
                    }
                    cwVar2.setPreviewDelegate(new oi0(vvVar4, 15));
                    WeakHashMap weakHashMap = r0.i0.a;
                    r0.y.c(vvVar4);
                }
            } else {
                vvVar3.a();
            }
            iw iwVar8 = this.C0;
            if (iwVar8 != null) {
                iwVar8.S();
            }
        }
    }
}
