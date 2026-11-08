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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public class ww extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, pg.b, te.b, ie0 {
    public static float A4;
    public static boolean x4;
    public static final boolean[] y4 = new boolean[4];
    public static final org.telegram.ui.Components.qp0 z4 = new org.telegram.ui.Components.qp0(3);
    public boolean A0;
    public FrameLayout A1;
    public boolean A2;
    public boolean A3;
    public int B0;
    public jv B1;
    public boolean B2;
    public Long B3;
    public fw C0;
    public li.w1 C1;
    public qw C2;
    public Drawable C3;
    public boolean D;
    public org.telegram.ui.Components.ps0 D0;
    public org.telegram.ui.ActionBar.r0 D1;
    public ArrayList D2;
    public org.telegram.ui.Components.g5 D3;
    public boolean E;
    public pv E0;
    public final TextPaint E1;
    public String E2;
    public org.telegram.ui.Cells.o E3;
    public boolean F;
    public org.telegram.ui.Components.nr F0;
    public hv F1;
    public CharSequence F2;
    public sv F3;
    public TLRPC.RequestPeerType G;
    public boolean G0;
    public FrameLayout G1;
    public org.telegram.ui.Components.po0 G2;
    public final iv G3;
    public long H;
    public float H0;
    public hv H1;
    public org.telegram.ui.Components.l51 H2;
    public final iv H3;
    public ValueAnimator I;
    public float I0;
    public FrameLayout I1;
    public final ArrayList I2;
    public f I3;
    public ValueAnimator J;
    public float J0;
    public org.telegram.ui.Components.pr J1;
    public boolean J2;
    public ab.b0 J3;
    public boolean K;
    public bi.ec K0;
    public org.telegram.ui.Components.or K1;
    public int K2;
    public Drawable K3;
    public boolean L;
    public org.telegram.ui.Components.k60 L0;
    public org.telegram.ui.Cells.m L1;
    public int L2;
    public int L3;
    public boolean M;
    public uv M0;
    public org.telegram.ui.Cells.b3 M1;
    public boolean M2;
    public boolean M3;
    public float N;
    public boolean N0;
    public org.telegram.ui.Cells.ma N1;
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
    public ji.j Q1;
    public int Q2;
    public mt Q3;
    public boolean R;
    public int R0;
    public ArrayList R1;
    public int R2;
    public String R3;
    public org.telegram.ui.Components.cc S;
    public int S0;
    public boolean S1;
    public int S2;
    public ArrayList S3;
    public float T;
    public int T0;
    public org.telegram.ui.ActionBar.u1 T1;
    public int T2;
    public boolean T3;
    public boolean U;
    public boolean U0;
    public boolean U1;
    public int U2;
    public CharSequence U3;
    public boolean V;
    public org.telegram.ui.Components.nb0 V0;
    public boolean V1;
    public boolean V2;
    public boolean V3;
    public boolean W;
    public org.telegram.ui.Cells.t2 W0;
    public long W1;
    public int W2;
    public float W3;
    public lw X;
    public org.telegram.ui.Cells.t2 X0;
    public TLObject X1;
    public ww X2;
    public boolean X3;
    public bg.p0 Y;
    public boolean Y0;
    public int Y1;
    public long Y2;
    public boolean Y3;
    public cz0 Z;
    public boolean Z0;
    public int Z1;
    public TLRPC.Chat Z2;
    public ValueAnimator Z3;
    public final int a;
    public org.telegram.ui.Components.u61 a0;
    public final ArrayList a1;
    public boolean a2;
    public TLRPC.ChatFull a3;
    public org.telegram.ui.Components.j30 a4;
    public final te.a b;
    public jg.q0 b0;
    public boolean b1;
    public boolean b2;
    public org.telegram.ui.Components.l9 b3;
    public TLRPC.FileLocation b4;
    public final te.a c;
    public float c0;
    public boolean c1;
    public boolean c2;
    public org.telegram.ui.Components.w8 c3;
    public TLRPC.FileLocation c4;
    public final te.a d;
    public ValueAnimator d0;
    public boolean d1;
    public int d2;
    public long d3;
    public org.telegram.ui.Components.cc d4;
    public final te.a e;
    public vw[] e0;
    public org.telegram.ui.ActionBar.y1 e1;
    public boolean e2;
    public boolean e3;
    public int e4;
    public final te.a f;
    public org.telegram.ui.ActionBar.r0 f0;
    public final Paint f1;
    public String f2;
    public boolean f3;
    public int f4;
    public org.telegram.ui.ActionBar.r0 g0;
    public ImageView g1;
    public String g2;
    public AnimatorSet g3;
    public int g4;
    public final te.a h;
    public yw h0;
    public NumberTextView h1;
    public String h2;
    public boolean h3;
    public int h4;
    public boolean i0;
    public final ArrayList i1;
    public boolean i2;
    public boolean i3;
    public int i4;
    public org.telegram.ui.ActionBar.r0 j0;
    public org.telegram.ui.ActionBar.r0 j1;
    public boolean j2;
    public float j3;
    public final dh.g j4;
    public org.telegram.ui.ActionBar.r0 k0;
    public org.telegram.ui.ActionBar.r0 k1;
    public boolean k2;
    public boolean k3;
    public final ri.f k4;
    public org.telegram.ui.ActionBar.r0 l0;
    public org.telegram.ui.ActionBar.r0 l1;
    public boolean l2;
    public int l3;
    public final ri.f l4;
    public org.telegram.ui.ActionBar.r0 m0;
    public org.telegram.ui.ActionBar.r0 m1;
    public boolean m2;
    public boolean m3;
    public final ri.c m4;
    public final te.a n;
    public org.telegram.ui.Components.ig0 n0;
    public org.telegram.ui.ActionBar.z0 n1;
    public String n2;
    public boolean n3;
    public final dh.c n4;
    public org.telegram.ui.ActionBar.z0 o0;
    public org.telegram.ui.ActionBar.z0 o1;
    public String o2;
    public org.telegram.ui.Components.cc o3;
    public final dh.c o4;
    public fi.m3 p0;
    public org.telegram.ui.ActionBar.z0 p1;
    public final org.telegram.messenger.xr p2;
    public final h2.f p3;
    public final dh.c p4;
    public fi.m3 q0;
    public org.telegram.ui.ActionBar.z0 q1;
    public boolean q2;
    public boolean q3;
    public final dh.c q4;
    public final te.a r;
    public boolean r0;
    public org.telegram.ui.ActionBar.z0 r1;
    public boolean r2;
    public boolean r3;
    public uu r4;
    public final te.a s;
    public boolean s0;
    public org.telegram.ui.ActionBar.z0 s1;
    public boolean s2;
    public boolean s3;
    public final ArrayList s4;
    public org.telegram.ui.Components.q00 t0;
    public org.telegram.ui.ActionBar.z0 t1;
    public boolean t2;
    public boolean t3;
    public final RectF t4;
    public org.telegram.ui.Components.q00 u0;
    public float u1;
    public boolean u2;
    public float u3;
    public final RectF u4;
    public fi.d v0;
    public float v1;
    public boolean v2;
    public ValueAnimator v3;
    public int v4;
    public final rh.h w;
    public lh.f w0;
    public AnimatorSet w1;
    public boolean w2;
    public float w3;
    public int w4;
    public boolean x;
    public int x0;
    public float x1;
    public boolean x2;
    public float x3;
    public int y;
    public final UndoView[] y0;
    public jh.f y1;
    public boolean y2;
    public float y3;
    public mw z0;
    public FrameLayout z1;
    public boolean z2;
    public boolean z3;

    public ww(Bundle bundle) {
        super(bundle);
        int i7 = Build.VERSION.SDK_INT;
        this.a = i7 >= 31 ? 48 : 0;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.b = new te.a(1, this, xqVar, 350L, false);
        this.c = new te.a(2, this, xqVar, 350L, false);
        this.d = new te.a(3, this, xqVar, 350L, false);
        this.e = new te.a(4, this, xqVar, 350L, false);
        this.f = new te.a(5, this, xqVar, 350L, false);
        this.h = new te.a(6, this, xqVar, 350L, false);
        this.n = new te.a(7, this, xqVar, 350L, false);
        this.r = new te.a(8, this, xqVar, 350L, false);
        this.s = new te.a(9, this, xqVar, 350L, false);
        this.w = new rh.h(new cu(this, 18));
        this.y = -1;
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
        this.p2 = new org.telegram.messenger.xr();
        this.I2 = new ArrayList();
        this.J2 = true;
        this.p3 = new h2.f((int[]) null);
        this.G3 = new iv(this, 0);
        this.H3 = new iv(this, 1);
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
        ri.c d = this.glassEngine.d(new fu(this, 12));
        this.m4 = d;
        if (i7 >= 31) {
            dh.g gVar = new dh.g(false);
            this.j4 = gVar;
            ri.f fVar = new ri.f(d);
            this.l4 = fVar;
            fVar.f = d;
            fVar.d = gVar;
            fVar.e = -2;
            ri.f fVar2 = new ri.f(null);
            this.k4 = fVar2;
            fVar2.f = d;
            fVar2.d = gVar;
            fVar2.e = -3;
            dh.c cVar = new dh.c(fVar, fVar, fVar);
            this.p4 = cVar;
            cVar.k = true;
            int L = org.telegram.messenger.sc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
            cVar.d = L;
            cVar.e = L;
            dh.c cVar2 = new dh.c(fVar2, fVar2, fVar2);
            this.n4 = cVar2;
            cVar2.k = true;
            int L2 = org.telegram.messenger.g0.L(48.0f);
            cVar2.d = L2;
            cVar2.e = L2;
            this.o4 = new dh.c(fVar2, fVar2, fVar2);
        } else {
            this.j4 = null;
            this.k4 = null;
            this.l4 = null;
            this.n4 = new dh.c(d, d, d);
            this.p4 = new dh.c(d, d, d);
            this.o4 = new dh.c(d, d, d);
        }
        dh.c cVar3 = new dh.c(d, d, d);
        this.q4 = cVar3;
        dh.c cVar4 = this.p4;
        oi.q qVar = this.glassEngine;
        cVar4.j = qVar;
        this.n4.j = qVar;
        this.o4.j = qVar;
        cVar3.j = qVar;
    }

    public static void A0(ww wwVar) {
        if (wwVar.N3) {
            fi.m3 m3Var = wwVar.p0;
            if (m3Var != null) {
                m3Var.f(true);
            }
            di.s6 o4 = org.telegram.messenger.qp.s1(wwVar.currentAccount).P1().o();
            if (o4 != null && o4.a(wwVar.currentAccount, 1)) {
                wwVar.showDialog(new ug.i0(o4.b(), wwVar.currentAccount, wwVar.getParentActivity(), wwVar, null));
                return;
            } else {
                fi.va D = fi.va.D(wwVar.getParentActivity(), wwVar.currentAccount);
                D.y = new dv(wwVar);
                D.Q(null);
                return;
            }
        }
        fi.m3 m3Var2 = wwVar.q0;
        if (m3Var2 != null) {
            if (m3Var2.V) {
                return;
            } else {
                org.telegram.messenger.g0.E2(m3Var2);
            }
        }
        SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(org.telegram.messenger.id.N0("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.k6.uj, 0, new cu(wwVar, 24), null);
        fi.m3 m3Var3 = new fi.m3(wwVar.getParentActivity(), 2);
        m3Var3.s(8.0f);
        m3Var3.d = 8000L;
        m3Var3.k(true);
        m3Var3.r(true);
        m3Var3.h = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(148.0f);
        m3Var3.u(S2);
        m3Var3.o(1.0f, -40.0f);
        m3Var3.j(wwVar.getThemedColor(org.telegram.ui.ActionBar.k6.tj));
        wwVar.q0 = m3Var3;
        m3Var3.setTranslationY((-wwVar.f4) - wwVar.h4);
        ((ViewGroup) wwVar.fragmentView).addView(wwVar.q0, c8.ha.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
        wwVar.q0.w();
    }

    public static void B0(ww wwVar) {
        org.telegram.messenger.qp.s1(wwVar.currentAccount).k4(0L, "PREMIUM_CHRISTMAS");
        wwVar.g5();
        org.telegram.ui.Components.cc G = org.telegram.ui.Components.hc.a0(wwVar).G(R.raw.gift, 4, org.telegram.messenger.id.M0(2131753330, null));
        G.j = 5000;
        G.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void C0(ww wwVar, int i7) {
        dh.g gVar = wwVar.j4;
        RectF rectF = wwVar.u4;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (c8.zc.a(i7, 4)) {
            int L = org.telegram.messenger.g0.L(48.0f);
            int measuredHeight = (wwVar.fragmentView.getMeasuredHeight() - wwVar.f4) - org.telegram.messenger.g0.L(8.0f);
            int L2 = measuredHeight - org.telegram.messenger.g0.L(56.0f);
            int L3 = org.telegram.messenger.g0.L(wwVar.K ? 81.0f : 0.0f) + org.telegram.messenger.g0.L(48.0f) + wwVar.actionBar.getMeasuredHeight();
            mw mwVar = wwVar.z0;
            boolean z9 = false;
            int measuredHeight2 = L3 + ((mwVar == null || mwVar.getVisibility() != 0) ? 0 : wwVar.z0.getMeasuredHeight());
            org.telegram.ui.Components.pr prVar = wwVar.J1;
            int sumHeightOfAllVisibleChild = measuredHeight2 + ((prVar == null || prVar.getVisibility() != 0) ? 0 : wwVar.J1.getSumHeightOfAllVisibleChild()) + ((int) wwVar.N);
            int measuredHeight3 = wwVar.actionBar.getMeasuredHeight();
            wwVar.t4.set(0.0f, -L, wwVar.fragmentView.getMeasuredWidth(), org.telegram.messenger.g0.W1(wwVar.b.e, sumHeightOfAllVisibleChild, org.telegram.messenger.g0.L(30.0f) + measuredHeight3 + (wwVar.Z != null ? r9.getMeasuredHeight() : 0)) + L);
            if (wwVar.W) {
                rectF.set(0.0f, L2, wwVar.fragmentView.getMeasuredWidth(), measuredHeight);
                rectF.inset(0.0f, org.telegram.messenger.sc.e(262144) ? 0.0f : -org.telegram.messenger.g0.L(48.0f));
            } else {
                if (wwVar.B1 != null && wwVar.y1 != null) {
                    rectF.set(0.0f, wwVar.fragmentView.getMeasuredHeight() - wwVar.w3(), wwVar.fragmentView.getMeasuredWidth(), wwVar.fragmentView.getMeasuredHeight());
                    rectF.inset(0.0f, org.telegram.messenger.sc.e(262144) ? 0.0f : -org.telegram.messenger.g0.L(48.0f));
                }
                gVar.g(z9 ? 2 : 1, wwVar.s4);
            }
            z9 = true;
            gVar.g(z9 ? 2 : 1, wwVar.s4);
        }
        gVar.e(wwVar.r4, wwVar.fragmentView.getMeasuredWidth(), wwVar.fragmentView.getMeasuredHeight());
    }

    public static void D0(ww wwVar) {
        org.telegram.messenger.qp.s1(wwVar.currentAccount).k4(0L, "BIRTHDAY_SETUP");
        wwVar.g5();
        org.telegram.ui.Components.cc K = org.telegram.ui.Components.hc.a0(wwVar).K(R.raw.chats_infotip, org.telegram.messenger.id.M0(2131753714, null), org.telegram.messenger.id.M0(2131745498, null), new cu(wwVar, 29));
        K.j = 5000;
        K.j();
    }

    public static void E0(ww wwVar) {
        try {
            ((org.telegram.ui.Components.zg0) ((org.telegram.ui.Components.w8) wwVar.M1.h.getImageReceiver().m0).K).H(true);
        } catch (Exception unused) {
        }
        if (wwVar.a4 == null) {
            org.telegram.ui.Components.j30 j30Var = new org.telegram.ui.Components.j30(0, true, true);
            wwVar.a4 = j30Var;
            j30Var.H = true;
            j30Var.a = wwVar;
            j30Var.b = new jw(wwVar);
            wwVar.getMediaDataController().x();
            wwVar.getMessagesController().d3();
            wwVar.getMessagesController().g3(wwVar.getUserConfig().f(), true, wwVar.classGuid);
        }
        TLRPC.User a22 = org.telegram.messenger.qp.s1(wwVar.currentAccount).a2(Long.valueOf(org.telegram.messenger.p10.i(wwVar.currentAccount).e()));
        if (a22 == null) {
            a22 = org.telegram.messenger.p10.i(wwVar.currentAccount).f();
        }
        if (a22 == null) {
            return;
        }
        org.telegram.ui.Components.di diVar = wwVar.a4.c;
        if (diVar != null) {
            diVar.P0();
        }
        org.telegram.ui.Components.j30 j30Var2 = wwVar.a4;
        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
        j30Var2.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new cu(wwVar, 28), new lu(wwVar, 3), 0);
    }

    public static /* synthetic */ void G0(ww wwVar, float f10, ValueAnimator valueAnimator) {
        wwVar.e0[0].setTranslationY((1.0f - wwVar.u3) * f10);
        wwVar.u3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i7 = 0; i7 < wwVar.actionBar.getChildCount(); i7++) {
            if (wwVar.actionBar.getChildAt(i7).getVisibility() == 0 && wwVar.actionBar.getChildAt(i7) != wwVar.actionBar.getActionMode() && wwVar.actionBar.getChildAt(i7) != wwVar.actionBar.getBackButton()) {
                wwVar.actionBar.getChildAt(i7).setAlpha(1.0f - wwVar.u3);
            }
        }
        wwVar.Q3();
        wwVar.I3();
        View view = wwVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void H0(ww wwVar) {
        org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.kb(wwVar.getParentActivity(), wwVar.resourceProvider);
        kbVar.d(R.raw.email_check_inbox, new String[0]);
        kbVar.b.setText(org.telegram.messenger.id.M0(2131742814, null));
        org.telegram.ui.Components.cc.g(wwVar, kbVar, 2750).j();
        try {
            wwVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void I0(ww wwVar, org.telegram.messenger.t1 t1Var) {
        ArrayList arrayList = t1Var.c;
        if (arrayList.size() != 1) {
            wg.f1.l1(0, t1Var);
            return;
        }
        zh.g1 g1Var = new zh.g1(wwVar.getParentActivity(), wwVar.currentAccount, ((TLRPC.User) arrayList.get(0)).id, null, null);
        g1Var.e1(true);
        wwVar.showDialog(g1Var);
    }

    public static void J0(ww wwVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.cc I = org.telegram.ui.Components.hc.a0(wwVar).I(R.raw.gift, org.telegram.messenger.id.M0(2131746857, null), org.telegram.messenger.id.M0(2131746856, null));
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
            wwVar.getMessagesStorage().j2(userFull, false);
        }
        if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            org.telegram.messenger.k5.o(null, 2131743882, org.telegram.ui.Components.hc.a0(wwVar), R.raw.error, 36);
            return;
        }
        if (wwVar.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wwVar.getParentActivity(), wwVar.resourceProvider);
            String M0 = org.telegram.messenger.id.M0(2131746853, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.M0(2131746854, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), null);
            wwVar.showDialog(u1Var);
        }
    }

    public static /* synthetic */ void K0(ww wwVar) {
        org.telegram.messenger.qp.s1(wwVar.currentAccount).k4(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        wwVar.g5();
    }

    public static void X2(ww wwVar, float f10) {
        float f11;
        float f12;
        float i7 = Utilities.i(wwVar.x1 * 2.0f, 1.0f, 0.0f);
        pv pvVar = wwVar.E0;
        float f13 = (1.0f - wwVar.u3) * f10 * wwVar.H0;
        float f14 = 1.0f - i7;
        pvVar.setAlpha(f13 * f14);
        if (wwVar.K || wwVar.M) {
            float i10 = Utilities.i((-wwVar.N) / org.telegram.messenger.g0.L(81.0f), 1.0f, 0.0f);
            if (wwVar.u3 == 1.0f) {
                i10 = 1.0f;
            }
            float i11 = Utilities.i(i10 / 0.5f, 1.0f, 0.0f);
            wwVar.E0.setClipTop(0);
            if (wwVar.K || !wwVar.M) {
                wwVar.E0.setTranslationY(((wwVar.T / 2.0f) + (Math.max(wwVar.N, -wwVar.g4()) + wwVar.w3)) - org.telegram.messenger.g0.L(8.0f));
                wwVar.E0.l(!wwVar.F3.c(), i10);
                if (wwVar.M) {
                    f11 = 1.0f - i11;
                    wwVar.actionBar.setTranslationY(0.0f);
                } else {
                    f12 = wwVar.H0;
                }
            } else {
                wwVar.E0.setTranslationY((-org.telegram.messenger.g0.L(81.0f)) - org.telegram.messenger.g0.L(8.0f));
                wwVar.E0.setProgressToCollapse(1.0f);
                f12 = wwVar.H0;
            }
            f11 = 1.0f - f12;
            wwVar.actionBar.setTranslationY(0.0f);
        } else {
            if (wwVar.L) {
                wwVar.E0.setTranslationY((Math.max(wwVar.N, -wwVar.g4()) + (-org.telegram.messenger.g0.L(81.0f))) - org.telegram.messenger.g0.L(8.0f));
                wwVar.E0.setProgressToCollapse(1.0f);
                pv pvVar2 = wwVar.E0;
                pvVar2.setClipTop((int) (org.telegram.messenger.g0.m - pvVar2.getY()));
            }
            f11 = 1.0f - wwVar.H0;
            wwVar.actionBar.setTranslationY(0.0f);
        }
        float f15 = f11 * f14;
        if (f15 == 1.0f) {
            wwVar.actionBar.getTitlesContainer().setScaleY(1.0f);
            wwVar.actionBar.getTitlesContainer().setScaleX(1.0f);
            wwVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
            wwVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
            float f16 = 1.0f - wwVar.u3;
            wwVar.actionBar.getTitlesContainer().setAlpha(f16);
            wwVar.actionBar.getTitlesContainer().setVisibility(f16 > 0.0f ? 0 : 4);
            wwVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f16);
            wwVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f16 <= 0.0f ? 4 : 0);
            return;
        }
        wwVar.actionBar.getTitlesContainer().setPivotY(org.telegram.messenger.g0.m);
        wwVar.actionBar.getTitlesContainer().setPivotX(org.telegram.messenger.g0.L(20.0f));
        float f17 = (0.6f * f15) + 0.4f;
        wwVar.actionBar.getTitlesContainer().setScaleY(f17);
        wwVar.actionBar.getTitlesContainer().setScaleX(f17);
        wwVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
        wwVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-org.telegram.messenger.g0.L(30.0f));
        wwVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f17);
        wwVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f17);
        float f18 = (1.0f - wwVar.u3) * f15;
        wwVar.actionBar.getTitlesContainer().setAlpha(f18);
        wwVar.actionBar.getTitlesContainer().setVisibility(f18 > 0.0f ? 0 : 4);
        wwVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f18);
        wwVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f18 <= 0.0f ? 4 : 0);
    }

    public static void Y2(ww wwVar, Canvas canvas, int i7) {
        org.telegram.ui.ActionBar.q4 q4Var;
        if (wwVar.parentLayout == null || wwVar.actionBar == null) {
            return;
        }
        float max = Math.max(wwVar.e.e, wwVar.h4());
        float f10 = 1.0f;
        float f11 = 1.0f - wwVar.x1;
        float f12 = max * f11 * f11;
        if (f12 == 0.0f) {
            return;
        }
        if (-1 >= i7) {
            f10 = 0.0f;
            i7 = -1;
        }
        if (f10 <= 0.0f || f12 <= 0.0f || i7 <= 0 || (q4Var = wwVar.parentLayout) == null) {
            return;
        }
        ((ActionBarLayout) q4Var).p(canvas, (int) (f10 * 255.0f * f12), i7);
    }

    public static /* synthetic */ void Z(ww wwVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        org.telegram.messenger.qp.s1(wwVar.currentAccount).k4(0L, tL_pendingSuggestion.suggestion);
        wwVar.g5();
    }

    public static /* synthetic */ void a0(ww wwVar, float f10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        wwVar.u3 = floatValue;
        wwVar.e0[0].setTranslationY((-f10) * floatValue);
        for (int i7 = 0; i7 < wwVar.actionBar.getChildCount(); i7++) {
            if (wwVar.actionBar.getChildAt(i7).getVisibility() == 0 && wwVar.actionBar.getChildAt(i7) != wwVar.actionBar.getActionMode() && wwVar.actionBar.getChildAt(i7) != wwVar.actionBar.getBackButton()) {
                wwVar.actionBar.getChildAt(i7).setAlpha(1.0f - wwVar.u3);
            }
        }
        View view = wwVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        wwVar.Q3();
        wwVar.I3();
    }

    public static void b0(ww wwVar) {
        ArrayList arrayList = wwVar.I2;
        org.telegram.ui.ActionBar.q4 q4Var = wwVar.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).y()) {
            wwVar.finishPreviewFragment();
            return;
        }
        if (wwVar.R0 != 10) {
            if (org.telegram.messenger.qp.s1(wwVar.currentAccount).v2()) {
                b.b(wwVar.currentAccount);
                return;
            } else {
                wwVar.presentFragment(new ContactsActivity(a8.p0.k("destroyAfterSelect", true)));
                return;
            }
        }
        if (wwVar.C2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            arrayList2.add(org.telegram.messenger.xr.a(((Long) arrayList.get(i7)).longValue(), 0L));
        }
        wwVar.C2.y(wwVar, arrayList2, null, false, wwVar.J2, wwVar.K2, wwVar.L2, null);
    }

    public static /* synthetic */ void c0(ww wwVar) {
        org.telegram.messenger.qp.s1(wwVar.currentAccount).k4(0L, "USERPIC_SETUP");
        wwVar.g5();
    }

    public static org.telegram.ui.Cells.t2 c4(vw vwVar) {
        sw swVar = vwVar.a;
        for (int i7 = 0; i7 < swVar.getChildCount(); i7++) {
            View childAt = swVar.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.t2) {
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) childAt;
                if (t2Var.V()) {
                    return t2Var;
                }
            }
        }
        return null;
    }

    public static void d0(ww wwVar) {
        PasskeysActivity.f0(wwVar.currentAccount, wwVar.getParentActivity(), wwVar.resourceProvider, true);
    }

    public static /* synthetic */ void e0(ww wwVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", org.telegram.messenger.p10.i(wwVar.currentAccount).e());
        wwVar.presentFragment(new an(bundle));
    }

    public static /* synthetic */ void f0(ww wwVar, TL_account.TL_birthday tL_birthday) {
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull b22 = wwVar.getMessagesController().b2(wwVar.getUserConfig().e());
        TL_account.TL_birthday tL_birthday2 = b22 != null ? b22.birthday : null;
        if (b22 != null) {
            b22.flags2 |= 32;
            b22.birthday = tL_birthday;
        }
        wwVar.getMessagesController().m2();
        wwVar.getConnectionsManager().sendRequest(updatebirthday, new z9(wwVar, b22, tL_birthday2, 8), 1024);
        org.telegram.messenger.qp.s1(wwVar.currentAccount).k4(0L, "BIRTHDAY_SETUP");
        wwVar.g5();
    }

    public static void g0(ww wwVar, vw vwVar, View view, int i7) {
        int i10;
        if (view instanceof org.telegram.ui.Cells.x3) {
            return;
        }
        boolean z9 = view instanceof org.telegram.ui.Cells.t2;
        if (z9) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
            if (t2Var.n2) {
                wwVar.Z4(t2Var.getDialogId(), view);
                return;
            }
        }
        if (wwVar.U3()) {
            wwVar.A4(view, i7, 0.0f, vwVar.d);
            return;
        }
        int i11 = wwVar.R0;
        if (i11 == 15 && (view instanceof org.telegram.ui.Cells.m8)) {
            vwVar.d.L();
            return;
        }
        int i12 = 0;
        if ((i11 == 11 || i11 == 13) && i7 == 1) {
            Bundle k10 = a8.p0.k("forImport", true);
            k10.putLongArray("result", new long[]{wwVar.getUserConfig().e()});
            k10.putInt("chatType", 4);
            String string = wwVar.arguments.getString("importTitle");
            if (string != null) {
                k10.putString("title", string);
            }
            d50 d50Var = new d50(k10);
            d50Var.Y = new dv(wwVar);
            wwVar.presentFragment(d50Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.b3) && ((i10 = vwVar.s) == 7 || i10 == 8)) {
            jg.l lVar = (jg.l) vwVar.d.M.get(0);
            TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = (lVar == null || lVar.a != 17) ? null : lVar.i;
            if (tL_chatlists_chatlistUpdates != null) {
                org.telegram.messenger.vo voVar = wwVar.getMessagesController().M[vwVar.s - 7];
                if (voVar != null) {
                    int i13 = voVar.a;
                    org.telegram.ui.Components.wz wzVar = new org.telegram.ui.Components.wz(wwVar, false);
                    wzVar.Q1 = -1;
                    wzVar.U1 = "";
                    wzVar.V1 = new ArrayList();
                    wzVar.X1 = "";
                    wzVar.Z1 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    wzVar.a2 = arrayList;
                    wzVar.r2 = -1;
                    wzVar.u2 = -5;
                    wzVar.Q1 = i13;
                    wzVar.S1 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    wzVar.Y1 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList arrayList2 = wwVar.getMessagesController().P0;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i12 >= arrayList2.size()) {
                                break;
                            }
                            if (((org.telegram.messenger.vo) arrayList2.get(i12)).a == i13) {
                                wzVar.U1 = ((org.telegram.messenger.vo) arrayList2.get(i12)).b;
                                break;
                            }
                            i12++;
                        }
                    }
                    wzVar.f1();
                    wwVar.showDialog(wzVar);
                    return;
                }
                return;
            }
        } else if (z9 && !wwVar.actionBar.v() && !wwVar.F3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.t2) view).Y1;
            org.telegram.messenger.g0.P.set(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), imageReceiver.A());
        }
        wwVar.z4(view, i7, vwVar.d);
    }

    public static /* synthetic */ void h0(ww wwVar) {
        wwVar.presentFragment(new PrivacySettingsActivity());
        org.telegram.messenger.g0.k3(wwVar.parentLayout, "newChatsRow");
    }

    public static /* synthetic */ void i0(ww wwVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.qp.s1(wwVar.currentAccount).o1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(wwVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new z9(wwVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void j0(ww wwVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(launchActivity, wwVar.currentAccount, tL_attachMenuBot, null, true);
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(wwVar.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = b02.b;
        if (tL_attachMenuBots != null) {
            long j3 = b02.a;
            b02.getMessagesStorage().a.c(new org.telegram.messenger.hk(b02.e, 2, j3, b02, tL_attachMenuBots));
        }
    }

    public static void j1(ww wwVar, boolean z9) {
        if (wwVar.e0 == null || wwVar.M3 == z9) {
            return;
        }
        wwVar.M3 = z9;
        int i7 = 0;
        while (true) {
            vw[] vwVarArr = wwVar.e0;
            if (i7 >= vwVarArr.length) {
                return;
            }
            if (z9) {
                vwVarArr[i7].a.setScrollbarFadingEnabled(false);
            }
            wwVar.e0[i7].a.setVerticalScrollBarEnabled(z9);
            if (z9) {
                wwVar.e0[i7].a.setScrollbarFadingEnabled(true);
            }
            i7++;
        }
    }

    public static void k0(ww wwVar) {
        org.telegram.messenger.qp.s1(wwVar.currentAccount).e7.edit().putBoolean("storyhint", false).commit();
    }

    public static /* synthetic */ void l0(ww wwVar) {
        if (wwVar.a4.g()) {
            org.telegram.messenger.qp.s1(wwVar.currentAccount).k4(0L, "USERPIC_SETUP");
            wwVar.g5();
        }
    }

    public static /* synthetic */ void n0(ww wwVar) {
        org.telegram.messenger.qp.s1(wwVar.currentAccount).k4(0L, "PREMIUM_GRACE");
        wwVar.g5();
    }

    public static /* synthetic */ void o0(ww wwVar) {
        org.telegram.messenger.qp.s1(wwVar.currentAccount).k4(0L, "SETUP_PASSKEY");
        wwVar.g5();
    }

    public static void p0(ww wwVar, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        try {
            u1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (tLObject == null) {
            org.telegram.ui.Components.v4.c0(wwVar.currentAccount, tL_error, wwVar, tL_messages_checkHistoryImportPeer, new Object[0]);
            wwVar.getNotificationCenter().k(org.telegram.messenger.qs.v1, Long.valueOf(j3), tL_messages_checkHistoryImportPeer, tL_error);
            return;
        }
        wwVar.arguments.getString("importTitle");
        String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
        bi.r3 r3Var = new bi.r3(wwVar, j3, 25);
        Pattern pattern = org.telegram.ui.Components.v4.a;
        if (wwVar.getParentActivity() != null) {
            if (chat == null && user == null) {
                return;
            }
            int currentAccount = wwVar.getCurrentAccount();
            Activity parentActivity = wwVar.getParentActivity();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            long e11 = org.telegram.messenger.p10.i(currentAccount).e();
            TextView textView = new TextView(parentActivity);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, null);
            textView.setTextSize(1, 16.0f);
            textView.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            alertDialog$Builder.o(frameLayout);
            org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
            w8Var.u(org.telegram.messenger.g0.L(12.0f));
            org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(parentActivity);
            l9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
            frameLayout.addView(l9Var, c8.ha.d(40, 40.0f, (org.telegram.messenger.id.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.k6.E8, null, 1, 20.0f);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 16);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(org.telegram.messenger.id.M0(2131749246, null));
            boolean z9 = org.telegram.messenger.id.a0;
            frameLayout.addView(textView2, c8.ha.d(-1, -2.0f, (z9 ? 5 : 3) | 48, z9 ? 21 : 76, 11.0f, z9 ? 76 : 21, 0.0f));
            frameLayout.addView(textView, c8.ha.d(-2, -2.0f, (org.telegram.messenger.id.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (user == null) {
                w8Var.q(chat);
                l9Var.e(chat, w8Var);
            } else if (org.telegram.messenger.t10.z(user)) {
                w8Var.p = 0.8f;
                w8Var.g(12);
                l9Var.j(null, null, w8Var, user);
            } else if (user.id == e11) {
                w8Var.p = 0.8f;
                w8Var.g(1);
                l9Var.j(null, null, w8Var, user);
            } else {
                w8Var.p = 1.0f;
                w8Var.r(user);
                l9Var.e(user, w8Var);
            }
            textView.setText(org.telegram.messenger.g0.X2(str));
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131749266, null), new org.telegram.ui.Components.u(r3Var, 3));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            wwVar.showDialog(alertDialog$Builder.a);
        }
    }

    public static void p4(an anVar, org.telegram.messenger.ij ijVar) {
        if (ijVar == null || !ijVar.s2()) {
            return;
        }
        try {
            CharSequence charSequence = !TextUtils.isEmpty(ijVar.z) ? ijVar.z : ijVar.v;
            CharSequence x12 = org.telegram.messenger.g0.x1(charSequence, ijVar.Y1, null);
            if (x12 instanceof SpannableStringBuilder) {
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) x12;
                org.telegram.ui.Components.yz[] yzVarArr = (org.telegram.ui.Components.yz[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.yz.class);
                if (yzVarArr.length > 0) {
                    int spanStart = spannableStringBuilder.getSpanStart(yzVarArr[0]);
                    int spanEnd = spannableStringBuilder.getSpanEnd(yzVarArr[0]);
                    for (int i7 = 1; i7 < yzVarArr.length; i7++) {
                        int spanStart2 = spannableStringBuilder.getSpanStart(yzVarArr[i7]);
                        int spanStart3 = spannableStringBuilder.getSpanStart(yzVarArr[i7]);
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
                    anVar.Ob(ijVar.M1(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public static void q0(ww wwVar, int i7) {
        Object obj;
        org.telegram.ui.Components.tl0 tl0Var = wwVar.C0.q0;
        if (i7 < tl0Var.Z || i7 >= tl0Var.a0) {
            obj = Boolean.FALSE;
        } else {
            org.telegram.ui.Components.x31 G = tl0Var.G(i7);
            obj = G != null ? G.G : null;
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wwVar.getParentActivity(), wwVar.resourceProvider);
            String M0 = org.telegram.messenger.id.M0(2131754180, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.a0(null, null, 2131754179, "\"" + org.telegram.messenger.t10.p(user) + "\"");
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746322, null), new pu(0, wwVar, user));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
        }
    }

    public static void r0(ww wwVar, int i7, ArrayList arrayList, boolean z9, HashSet hashSet) {
        if (i7 != 102) {
            wwVar.D4(arrayList, i7, false, false, null);
            return;
        }
        wwVar.getMessagesController().s0 = true;
        wwVar.D4(arrayList, i7, false, false, z9 ? hashSet : null);
        org.telegram.messenger.qp messagesController = wwVar.getMessagesController();
        messagesController.s0 = false;
        messagesController.getNotificationCenter().k(org.telegram.messenger.qs.s, Boolean.TRUE);
        wwVar.getMessagesController().J(wwVar.W2);
        int i10 = wwVar.W2;
        if (i10 == 0 || wwVar.d4(wwVar.currentAccount, wwVar.e0[0].s, i10, false).size() != 0) {
            return;
        }
        wwVar.e0[0].a.setEmptyView(null);
        wwVar.e0[0].x.setVisibility(4);
        wwVar.finishFragment();
    }

    public static void t0(ww wwVar, int i7, org.telegram.ui.Components.k60 k60Var) {
        if (wwVar.currentAccount == i7) {
            return;
        }
        k60Var.u();
        if (wwVar.getParentActivity() == null) {
            return;
        }
        qw qwVar = wwVar.C2;
        LaunchActivity launchActivity = (LaunchActivity) wwVar.getParentActivity();
        ArrayList arrayList = wwVar.D2;
        String str = wwVar.E2;
        CharSequence charSequence = wwVar.F2;
        jv jvVar = wwVar.B1;
        CharSequence fieldText = jvVar != null ? jvVar.getFieldText() : null;
        launchActivity.O0(i7);
        ww wwVar2 = new ww(wwVar.arguments);
        wwVar2.C2 = qwVar;
        if (arrayList == null || arrayList.isEmpty()) {
            if (str != null) {
                wwVar2.Q4(fieldText, str);
            } else if (charSequence != null) {
                if (charSequence.length() == 0) {
                    wwVar2.F2 = null;
                } else {
                    wwVar2.F2 = charSequence;
                    wwVar2.E2 = null;
                    wwVar2.D2 = null;
                    if (wwVar2.B1 != null) {
                        wwVar2.v3(fieldText);
                    } else {
                        wwVar2.U3 = fieldText;
                    }
                }
            }
        } else if (arrayList.isEmpty()) {
            wwVar2.D2 = null;
        } else {
            wwVar2.D2 = arrayList;
            wwVar2.E2 = null;
            wwVar2.M2 = false;
            if (wwVar2.B1 != null) {
                wwVar2.v3(fieldText);
            } else {
                wwVar2.U3 = fieldText;
            }
        }
        launchActivity.u0(wwVar2, false, true);
    }

    public static /* synthetic */ void u0(ww wwVar) {
        org.telegram.messenger.qp.s1(wwVar.currentAccount).k4(0L, wwVar.A3 ? "PREMIUM_UPGRADE" : "PREMIUM_ANNUAL");
        wwVar.g5();
    }

    public static void u1(ww wwVar, vw vwVar, float f10) {
        if (wwVar.T == f10) {
            return;
        }
        wwVar.T = f10;
        if (f10 == 0.0f) {
            wwVar.U = false;
        }
        wwVar.E0.setOverscroll(f10);
        vwVar.a.setViewsOffset(f10);
        vwVar.a.setOverScrollMode(f10 != 0.0f ? 2 : 0);
        wwVar.fragmentView.invalidate();
        if (f10 <= org.telegram.messenger.g0.L(90.0f) || wwVar.U) {
            return;
        }
        pv pvVar = wwVar.E0;
        ValueAnimator valueAnimator = pvVar.H0;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            pvVar.i(pvVar.p0, true);
            wwVar.U = true;
            wwVar.getOrCreateStoryViewer().x(new cu(wwVar, 4));
        }
    }

    public static void u4(org.telegram.messenger.c cVar) {
        int i7 = cVar.a;
        boolean[] zArr = y4;
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
        org.telegram.messenger.g0.i3(new bh(cVar, 18), 200L);
        Iterator it = s12.c4.iterator();
        while (it.hasNext()) {
            org.telegram.messenger.ui.b0(i7).c1((String) it.next(), true, true);
        }
        zArr[i7] = true;
    }

    public static void v0(ww wwVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
            wc1.a(wwVar.getParentActivity(), new y(wwVar, tL_attachMenuBot, launchActivity, 7), null);
        } else {
            LaunchActivity.G0(launchActivity, wwVar.currentAccount, tL_attachMenuBot, null, true);
        }
    }

    public static boolean v1(ww wwVar, vw vwVar) {
        if (wwVar.F3.c()) {
            return false;
        }
        int i7 = (int) (-wwVar.N);
        int f42 = wwVar.f4();
        int g42 = wwVar.g4();
        if (i7 == 0 || i7 == f42 || i7 == g42 || !vwVar.a.canScrollVertically(-1)) {
            return false;
        }
        if (g42 >= i7 || i7 >= f42) {
            if ((wwVar.u3 != 1.0f ? Utilities.i((-wwVar.N) / org.telegram.messenger.g0.L(81.0f), 1.0f, 0.0f) : 1.0f) < wwVar.E0.B0) {
                vwVar.b.x(-i7);
                return true;
            }
            vwVar.b.x(g42 - i7);
            return true;
        }
        int L = org.telegram.messenger.g0.L(48.0f);
        int i10 = i7 - g42;
        if (i10 < L / 2) {
            vwVar.b.x(-i10);
            return true;
        }
        vwVar.b.x(L - i10);
        return true;
    }

    public static void w0(ww wwVar) {
        b.c(wwVar.currentAccount, wwVar.getParentActivity(), wwVar.getResourceProvider());
    }

    public static String w2(ww wwVar) {
        ArrayList arrayList = wwVar.I2;
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
            if (longValue == wwVar.getUserConfig().e()) {
                sb2.append(org.telegram.messenger.id.M0(2131745904, null));
            } else {
                sb2.append(arrayList.size() == 1 ? org.telegram.messenger.m5.l(wwVar.currentAccount, longValue) : org.telegram.messenger.m5.s(wwVar.currentAccount, longValue));
            }
        }
        return org.telegram.messenger.id.a0(null, null, 2131745442, sb2.toString());
    }

    public static void x0(final int i7, final long j3, TLRPC.Chat chat, final ww wwVar, final boolean z9, final boolean z10) {
        final TLRPC.Chat chat2;
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        wwVar.n4(false);
        if (i7 == 103 && org.telegram.messenger.t3.T(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || org.telegram.messenger.t3.t0(chat2)) {
                wwVar.getMessagesController().X(2, j3, z10);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i7 == 102 && (i12 = wwVar.W2) != 0 && wwVar.d4(wwVar.currentAccount, wwVar.e0[0].s, i12, false).size() == 1) {
            wwVar.e0[0].x.setVisibility(4);
        }
        int i13 = -1;
        if (i7 == 102) {
            wwVar.M4(true, true);
            if (wwVar.R1 != null) {
                i11 = 0;
                while (i11 < wwVar.R1.size()) {
                    if (((TLRPC.Dialog) wwVar.R1.get(i11)).id == j3) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            i11 = -1;
            wwVar.z3();
            i10 = i11;
        } else {
            i10 = -1;
        }
        UndoView k42 = wwVar.k4();
        if (k42 != null) {
            k42.j(i7 == 103 ? 0 : z10 ? 1 : 95, j3, new Runnable() { // from class: org.telegram.ui.tu
                @Override // java.lang.Runnable
                public final void run() {
                    wwVar.C4(i7, j3, chat2, z9, z10);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(wwVar.d4(wwVar.currentAccount, wwVar.e0[0].s, wwVar.W2, false));
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
            if (i10 < 0 || i13 >= 0 || (arrayList = wwVar.R1) == null) {
                wwVar.M4(false, true);
                return;
            }
            arrayList.remove(i10);
            wwVar.e0[0].y.D();
            wwVar.e0[0].q(true);
        }
    }

    public static void y0(ww wwVar) {
        org.telegram.messenger.v1 a10 = org.telegram.messenger.v1.a(wwVar.currentAccount);
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
        org.telegram.messenger.qp.s1(wwVar.currentAccount).k4(0L, "BIRTHDAY_CONTACTS_TODAY");
        wwVar.g5();
        org.telegram.ui.Components.cc G = org.telegram.ui.Components.hc.a0(wwVar).G(R.raw.gift, 4, org.telegram.messenger.id.M0(2131753330, null));
        G.j = 5000;
        G.j();
    }

    public static /* synthetic */ void z0(ww wwVar) {
        org.telegram.messenger.qp.s1(wwVar.currentAccount).k4(0L, "PREMIUM_RESTORE");
        wwVar.g5();
    }

    public final boolean A3(long j3) {
        int i7;
        int i10 = this.R0;
        if (i10 == 15 || i10 == 16 || this.h2 != null || !this.s2) {
            return true;
        }
        if (!org.telegram.messenger.m5.z(j3)) {
            if (!org.telegram.messenger.m5.C(j3)) {
                return true;
            }
            if (this.T0 == 0 && !this.U0) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = org.telegram.messenger.id.M0(2131745599, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            int i11 = this.T0;
            if (i11 == 3) {
                u1Var.T = org.telegram.messenger.id.M0(2131744093, null);
            } else if (i11 != 0) {
                u1Var.T = org.telegram.messenger.id.M0(2131747177, null);
            } else {
                u1Var.T = org.telegram.messenger.id.M0(2131749105, null);
            }
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131747832, null), null);
            showDialog(u1Var);
            return false;
        }
        long j10 = -j3;
        TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(j10));
        if (!org.telegram.messenger.t3.T(M02) || M02.megagroup) {
            return true;
        }
        if (!this.q2) {
            TLRPC.Chat M03 = org.telegram.messenger.qp.s1(this.currentAccount).M0(Long.valueOf(j10));
            if ((org.telegram.messenger.t3.n(M03) || M03.megagroup) && (i7 = this.T0) != 2 && i7 != 3) {
                return true;
            }
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
        String M04 = org.telegram.messenger.id.M0(2131745599, null);
        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
        u1Var2.R = M04;
        int i12 = this.T0;
        if (i12 == 3) {
            u1Var2.T = org.telegram.messenger.id.M0(2131744094, null);
        } else if (i12 == 2) {
            u1Var2.T = org.telegram.messenger.id.M0(2131746588, null);
        } else {
            u1Var2.T = org.telegram.messenger.id.M0(2131752440, null);
        }
        alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131747832, null), null);
        showDialog(u1Var2);
        return false;
    }

    public final boolean A4(View view, int i7, float f10, org.telegram.ui.Components.oj0 oj0Var) {
        org.telegram.ui.Components.yl0 yl0Var;
        org.telegram.ui.Components.yl0 yl0Var2;
        long F;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.b3) && oj0Var.d(i7) != 21) {
            if (!this.actionBar.v() && !org.telegram.messenger.g0.Q1() && !this.l2 && (view instanceof org.telegram.ui.Cells.t2)) {
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                if (!getMessagesController().t2(t2Var.getDialogId()) && !this.F3.c() && t2Var.Z(f10)) {
                    return T4(t2Var);
                }
            }
            sv svVar = this.F3;
            if (svVar == null || !svVar.c()) {
                fw fwVar = this.C0;
                if (fwVar != null && oj0Var == (yl0Var2 = fwVar.d0)) {
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
                                u1Var.T = org.telegram.messenger.id.a0("ClearSearchSingleChatAlertText", null, 2131752053, org.telegram.messenger.id.M0(2131745904, null));
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
                            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, getResourceProvider());
                        }
                        return true;
                    }
                }
                fw fwVar2 = this.C0;
                if (fwVar2 == null || oj0Var != (yl0Var = fwVar2.d0)) {
                    Object J = ((jg.n) oj0Var).J(i7);
                    if (J instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                        if (this.l2) {
                            if ((this.R0 == 3 || U3()) && v5(dialog.id)) {
                                if (this.R0 != 1 || !U3() || !this.m2 || !getMessagesController().t2(dialog.id)) {
                                    s3(dialog.id, view);
                                    o5();
                                    return true;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -dialog.id);
                                bundle.putBoolean("for_select", true);
                                bundle.putBoolean("forward_to", true);
                                bundle.putBoolean("bot_share_to", this.R0 == 1);
                                bundle.putBoolean("quote", this.O0);
                                bundle.putBoolean("reply_to", this.N0);
                                w91 w91Var = new w91(bundle);
                                w91Var.L0 = this;
                                presentFragment(w91Var);
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
                    if (this.l2) {
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

    @Override // org.telegram.ui.ie0
    public final ri.f B() {
        return this.l4;
    }

    public final void B3(boolean z9) {
        ji.j jVar;
        TLRPC.ChatFull chatFull;
        org.telegram.ui.Components.pr prVar = this.J1;
        if (prVar == null || (jVar = this.Q1) == null || (chatFull = this.a3) == null) {
            return;
        }
        prVar.i(jVar, (this.Y2 == 0 || chatFull.requests_pending <= 0 || this.b.f) ? false : true, z9);
        this.Q1.setTitle(org.telegram.messenger.id.G(this.a3.requests_pending, "CommunityPendingRequestsRow", new Object[0]));
    }

    public final void B4(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i7 = 0; i7 < 4; i7++) {
            if (org.telegram.messenger.p10.i(i7).p()) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        Collections.sort(arrayList, new oe(25));
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
                int i11 = org.telegram.ui.ActionBar.k6.i6;
                Drawable a02 = org.telegram.ui.ActionBar.k6.a0(getThemedColor(i11), 0, 0);
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
                org.telegram.ui.ActionBar.f6 resourceProvider = getResourceProvider();
                linearLayout.setBackground(a02);
                org.telegram.ui.ActionBar.r6.k(linearLayout, a02, null, N, resourceProvider);
                TLRPC.User f10 = org.telegram.messenger.p10.i(intValue).f();
                org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
                w8Var.r(f10);
                fi.r3 r3Var = new fi.r3(this, getParentActivity(), z9);
                linearLayout.addView(r3Var, c8.ha.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(getParentActivity());
                if (z9) {
                    l9Var.setScaleX(0.833f);
                    l9Var.setScaleY(0.833f);
                }
                l9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
                l9Var.getImageReceiver().d = intValue;
                l9Var.e(f10, w8Var);
                r3Var.addView(l9Var, c8.ha.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, getResourceProvider());
                textView.setText(org.telegram.messenger.t10.p(f10));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, c8.ha.q(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new bi.la(this, intValue, H, 14));
                H.r(linearLayout, c8.ha.o(org.telegram.messenger.qs.G3, 48));
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
    
        if (getMessagesController().b2.get(r14.W2) != false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0111 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C3(vw vwVar) {
        final boolean z9;
        final boolean z10;
        final boolean z11;
        final boolean z12;
        int i7;
        int L0 = vwVar.c.L0();
        int N0 = vwVar.c.N0();
        if (this.h3 || this.m3) {
            return;
        }
        mw mwVar = this.z0;
        if (mwVar != null && mwVar.getVisibility() == 0 && this.z0.O) {
            return;
        }
        int abs = Math.abs(N0 - L0) + 1;
        if (N0 != -1) {
            v4.d1 K = vwVar.a.K(N0);
            boolean z13 = K != null && K.f == 11;
            this.b2 = z13;
            if (z13) {
                o4(false);
            }
        } else {
            this.b2 = false;
        }
        int i10 = vwVar.s;
        if (i10 == 7 || i10 == 8) {
            ArrayList T0 = getMessagesController().T0();
            int i11 = vwVar.h;
            if (i11 >= 0 && i11 < T0.size()) {
                int i12 = ((org.telegram.messenger.vo) T0.get(vwVar.h)).g;
                int i13 = org.telegram.messenger.qp.C8;
                if ((i12 & 128) == 0 && ((abs > 0 && N0 >= d4(this.currentAccount, vwVar.s, 1, this.S1).size() - 10) || (abs == 0 && !getMessagesController().b2.get(1)))) {
                    boolean z14 = getMessagesController().b2.get(1);
                    boolean z15 = !z14;
                    z9 = (z14 && getMessagesController().c2.get(1)) ? false : true;
                    z10 = z15;
                    if (abs > 0 || N0 < d4(this.currentAccount, vwVar.s, this.W2, this.S1).size() - 10) {
                        if (abs == 0 && ((i7 = vwVar.s) == 7 || i7 == 8)) {
                        }
                        z11 = false;
                        z12 = false;
                        if (!z11 || z9) {
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.vu
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ww wwVar = ww.this;
                                    if (z11) {
                                        wwVar.getMessagesController().U2(wwVar.W2, -1, 100, z12, null);
                                    }
                                    if (z9) {
                                        wwVar.getMessagesController().U2(1, -1, 100, z10, null);
                                    }
                                }
                            });
                        }
                        return;
                    }
                    boolean z16 = getMessagesController().b2.get(this.W2);
                    boolean z17 = !z16;
                    if (z16) {
                        if (getMessagesController().c2.get(this.W2)) {
                            z12 = z17;
                            z11 = false;
                            if (z11) {
                            }
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.vu
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ww wwVar = ww.this;
                                    if (z11) {
                                        wwVar.getMessagesController().U2(wwVar.W2, -1, 100, z12, null);
                                    }
                                    if (z9) {
                                        wwVar.getMessagesController().U2(1, -1, 100, z10, null);
                                    }
                                }
                            });
                        }
                    }
                    z12 = z17;
                    z11 = true;
                    if (z11) {
                    }
                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.vu
                        @Override // java.lang.Runnable
                        public final void run() {
                            ww wwVar = ww.this;
                            if (z11) {
                                wwVar.getMessagesController().U2(wwVar.W2, -1, 100, z12, null);
                            }
                            if (z9) {
                                wwVar.getMessagesController().U2(1, -1, 100, z10, null);
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
        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.vu
            @Override // java.lang.Runnable
            public final void run() {
                ww wwVar = ww.this;
                if (z11) {
                    wwVar.getMessagesController().U2(wwVar.W2, -1, 100, z12, null);
                }
                if (z9) {
                    wwVar.getMessagesController().U2(1, -1, 100, z10, null);
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
        getMessagesController().J(this.W2);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ww.D4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
    }

    @Override // pg.b
    public final List E() {
        return Arrays.asList(new pg.a(org.telegram.messenger.id.M0(2131751649, null)), new pg.a(org.telegram.messenger.id.M0(2131752076, null), new cu(this, 14)), new pg.a(org.telegram.messenger.id.M0(2131751650, null), new cu(this, 15)));
    }

    public final void E3() {
        if (this.e0 == null) {
            return;
        }
        int w32 = w3();
        int i7 = 0;
        while (true) {
            vw[] vwVarArr = this.e0;
            if (i7 >= vwVarArr.length) {
                return;
            }
            vw vwVar = vwVarArr[i7];
            if (vwVar != null) {
                sw swVar = vwVar.a;
                swVar.setPadding(0, swVar.f3, 0, w32);
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
            if (this.R1 != null) {
                for (int i14 = 0; i14 < this.R1.size(); i14++) {
                    if (((TLRPC.Dialog) this.R1.get(i14)).id == j3) {
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
                if (this.R0 != 10) {
                    o4(false);
                }
                J4(true, false);
            } else {
                ArrayList d42 = d4(this.currentAccount, this.e0[0].s, this.W2, false);
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
            ArrayList arrayList = this.R1;
            if (arrayList != null && i13 >= 0 && i10 != i13) {
                arrayList.add(i13, (TLRPC.Dialog) arrayList.remove(i10));
                this.e0[0].y.D();
                this.e0[0].q(true);
                vw vwVar = this.e0[0];
                vwVar.c.h1((vwVar.s == 0 && l4() && this.e0[0].w == 2) ? 1 : 0, (int) this.N);
            } else if (i13 >= 0 && i10 == i13) {
                org.telegram.messenger.g0.i3(new cu(this, 13), 200L);
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
        jh.f fVar = this.y1;
        if (fVar != null) {
            fVar.setBlurredBottomHeight(this.y1.getInputBubbleHeight() + this.w.d() + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(7.0f));
        }
    }

    public final void F4() {
        if (this.K0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
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
        vw vwVar;
        float e42 = e4(true);
        mw mwVar = this.z0;
        if (mwVar != null) {
            boolean z9 = mwVar.getAlpha() != e42;
            float T1 = org.telegram.messenger.g0.T1(0.98f, 1.0f, e42);
            this.z0.setAlpha(e42);
            this.z0.setScaleX(T1);
            this.z0.setScaleY(T1);
            this.z0.setVisibility(e42 > 0.0f ? 0 : 8);
            if (z9 && (vwVar = this.e0[0]) != null) {
                vwVar.a.requestLayout();
            }
        }
        e5();
    }

    public final void G4(vw vwVar) {
        int i7;
        if (vwVar.getVisibility() != 0) {
            return;
        }
        int i10 = vwVar.d.w;
        if (vwVar.s == 0 && l4() && vwVar.a.getChildCount() == 0 && vwVar.w == 2) {
            ((v4.b0) vwVar.a.getLayoutManager()).h1(1, (int) this.N);
        }
        vwVar.d.getClass();
        vwVar.d.V();
        int b10 = vwVar.d.b();
        if (b10 == 1 && i10 == 1 && vwVar.d.d(0) == 5) {
            vwVar.q(true);
        } else {
            vwVar.q(false);
            if (b10 > i10 && (i7 = this.R0) != 11 && i7 != 12 && i7 != 13) {
                vwVar.D.b(i10);
            }
        }
        try {
            vwVar.a.setEmptyView((this.W2 == 0 && this.Y2 == 0) ? vwVar.x : null);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        C3(vwVar);
    }

    public final void H3() {
        float f10 = this.n.e;
        float T1 = org.telegram.messenger.g0.T1(0.2f, 1.0f, f10);
        li.w1 w1Var = this.C1;
        if (w1Var != null) {
            w1Var.setScaleX(T1);
            this.C1.setScaleY(T1);
            this.C1.setAlpha(f10);
            this.C1.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        jh.f fVar = this.y1;
        if (fVar != null) {
            fVar.setAlpha(f10);
            this.y1.setVisibility(f10 > 0.0f ? 0 : 8);
            this.y1.getFadeView().setAlpha(f10);
            this.y1.getFadeView().setVisibility(f10 > 0.0f ? 0 : 8);
        }
    }

    public final void H4() {
        boolean z9;
        if (this.N == 0.0f || (z9 = this.K)) {
            return;
        }
        float f10 = z9 ? -g4() : 0.0f;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.G3, f10));
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
        org.telegram.ui.Components.q00.d(this.actionBar.getBackButton(), Math.max(this.u3, f10 * h42 * (1.0f - this.c.e)));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I4(int i7) {
        org.telegram.ui.Components.cz czVar;
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
        mw mwVar = this.z0;
        if (tabsCount < 0) {
            mwVar.getClass();
        } else if (tabsCount < mwVar.getTabsCount()) {
            czVar = (org.telegram.ui.Components.cz) mwVar.h.get(tabsCount);
            if (czVar != null) {
                mw mwVar2 = this.z0;
                ArrayList arrayList = mwVar2.h;
                if (arrayList.isEmpty()) {
                    return;
                }
                mwVar2.f((org.telegram.ui.Components.cz) jg.g.i(1, arrayList), arrayList.size() - 1);
                return;
            }
            vw[] vwVarArr = this.e0;
            if (vwVarArr == null || vwVarArr.length <= 0 || vwVarArr[0].h != czVar.a) {
                this.z0.f(czVar, tabsCount);
                return;
            }
            return;
        }
        czVar = null;
        if (czVar != null) {
        }
    }

    public final void J3() {
        org.telegram.ui.Components.q00.d(this.g0, com.google.android.recaptcha.internal.a.D(this.i0 ? 1.0f : 0.0f, 1.0f - this.b.e, 1.0f - h4(), 1.0f - this.c.e));
    }

    public final void J4(boolean z9, boolean z10) {
        sv svVar = this.F3;
        if (svVar == null || !svVar.c()) {
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
        org.telegram.ui.Components.q00.d(this.f0, com.google.android.recaptcha.internal.a.D(org.telegram.messenger.iz.s.isEmpty() ? 0.0f : 1.0f, 1.0f - this.b.e, 1.0f - h4(), 1.0f - this.c.e));
    }

    public final void K4(String str, boolean z9) {
        a5(true, false, true, false);
        bg.p0 p0Var = this.Y;
        if (p0Var != null) {
            p0Var.b(true);
        }
        lw lwVar = this.X;
        if (lwVar != null) {
            lwVar.r.setText(str);
            this.X.r.setSelection(str.length());
        }
    }

    public final void L3() {
        org.telegram.ui.Components.q00.d(this.j0, com.google.android.recaptcha.internal.a.D(this.R0 != 2 ? 1.0f : 0.0f, this.f.e, 1.0f - h4(), 1.0f - this.c.e));
        pv pvVar = this.E0;
        if (pvVar != null) {
            pvVar.invalidate();
        }
    }

    public final void L4(float f10) {
        this.c0 = f10;
        for (vw vwVar : this.e0) {
            sw swVar = vwVar.a;
            for (int i7 = 0; i7 < swVar.getChildCount(); i7++) {
                View childAt = swVar.getChildAt(i7);
                if (childAt != null && RecyclerView.R(childAt) >= vwVar.d.f + 1) {
                    childAt.setAlpha(f10);
                }
            }
        }
    }

    public final void M3() {
        org.telegram.ui.Components.q00.d(this.l0, com.google.android.recaptcha.internal.a.D(this.b.e, 1.0f - h4(), 1.0f - this.c.e, this.d.e));
    }

    public final void M4(boolean z9, boolean z10) {
        if (this.e0 == null || this.S1 == z9) {
            return;
        }
        if (z9) {
            this.R1 = new ArrayList(d4(this.currentAccount, this.e0[0].s, this.W2, false));
        } else {
            this.R1 = null;
        }
        this.S1 = z9;
        vw vwVar = this.e0[0];
        vwVar.d.G = z9;
        if (z9 || !z10) {
            return;
        }
        if (vwVar.a.c0()) {
            this.e0[0].a.post(new cu(this, 25));
        } else {
            this.e0[0].d.f();
        }
    }

    public final void N3() {
        bi.ec ecVar;
        boolean z9 = !this.j2 && ((ecVar = this.K0) == null || ecVar.getBackground() == null || this.K0.getAlpha() < 0.01f || this.K0.getVisibility() == 8);
        f fVar = this.I3;
        if (fVar != null) {
            ((je0) fVar.b).w.a(z9, true);
        }
    }

    public final void N4(boolean z9) {
        vw vwVar;
        if (org.telegram.messenger.iz.o() <= 1 || !org.telegram.messenger.sc.e(32768)) {
            return;
        }
        if (z9) {
            vw[] vwVarArr = this.e0;
            if (vwVarArr != null && (vwVar = vwVarArr[0]) != null) {
                vwVar.setLayerType(2, null);
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
            int i7 = 0;
            while (true) {
                vw[] vwVarArr2 = this.e0;
                if (i7 >= vwVarArr2.length) {
                    break;
                }
                vw vwVar2 = vwVarArr2[i7];
                if (vwVar2 != null) {
                    vwVar2.setLayerType(0, null);
                    vwVar2.setClipChildren(true);
                    vwVar2.setClipToPadding(true);
                    vwVar2.a.setClipChildren(true);
                }
                i7++;
            }
        }
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (kVar2 != null) {
            kVar2.setLayerType(0, null);
        }
        pv pvVar = this.E0;
        if (pvVar != null) {
            pvVar.setLayerType(0, null);
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            ((ViewGroup) view2).setClipChildren(true);
            this.fragmentView.requestLayout();
        }
    }

    public final void O3() {
        I3();
        org.telegram.ui.Components.q00.d(this.k0, (1.0f - this.b.e) * (1.0f - h4()) * (1.0f - this.c.e));
        J3();
        M3();
        K3();
        L3();
    }

    public final void O4(float f10) {
        vw[] vwVarArr = this.e0;
        if (vwVarArr != null) {
            int paddingTop = vwVarArr[0].a.getPaddingTop() + ((int) f10);
            int i7 = 0;
            while (true) {
                vw[] vwVarArr2 = this.e0;
                if (i7 >= vwVarArr2.length) {
                    break;
                }
                vwVarArr2[i7].a.setTopGlowOffset(paddingTop);
                i7++;
            }
        }
        if (this.fragmentView == null || f10 == this.N) {
            return;
        }
        this.N = f10;
        org.telegram.ui.Components.cc ccVar = this.o3;
        if (ccVar != null) {
            ccVar.l();
        }
        if (this.E3 != null) {
            float currentActionBarHeight = 1.0f - ((-f10) / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
            org.telegram.ui.Cells.o oVar = this.E3;
            float f11 = (int) f10;
            float f12 = oVar.f;
            oVar.h = f11;
            oVar.setTranslationY(f12 + f11);
            this.E3.setAlpha(c8.j9.a(currentActionBarHeight, 0.0f, 1.0f));
            this.E3.setVisibility(currentActionBarHeight <= 0.0f ? 4 : 0);
        }
        Q3();
        this.fragmentView.invalidate();
    }

    public final void P3() {
        String M0 = org.telegram.messenger.id.M0(h4() > 0.5f ? 2131745709 : 2131745816, null);
        this.X.r.setContentDescription(M0);
        this.X.r.setHint(M0);
    }

    public final void P4(float f10) {
        this.x1 = f10;
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
        float max = (this.R0 != 2 ? 1.0f : 0.0f) * (1.0f - this.c.e) * (1.0f - Math.max(this.u3, this.h.e)) * Math.max(this.b.e, (1.0f - h4()) * a10);
        this.X.setAlpha(max);
        this.X.setVisibility(max > 0.0f ? 0 : 8);
        this.f.a(max <= 0.01f, true);
    }

    public final void Q4(CharSequence charSequence, String str) {
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
        if (this.W3 == f10) {
            return;
        }
        boolean z10 = true;
        if (org.telegram.messenger.iz.o() > 1 && org.telegram.messenger.sc.e(32768)) {
            z10 = false;
        }
        this.X3 = z10;
        this.W3 = f10;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (this.X3) {
            float f11 = (1.0f - this.W3) * (-org.telegram.messenger.g0.L(40.0f));
            pv pvVar = this.E0;
            if (pvVar != null) {
                pvVar.setTranslationX(f11);
            }
            lw lwVar = this.X;
            if (lwVar != null) {
                lwVar.setTranslationX(f11);
            }
            sv svVar = this.F3;
            if (svVar == null || svVar.getFragmentView() == null || this.D) {
                return;
            }
            this.F3.getFragmentView().setTranslationX(f11);
            return;
        }
        float f12 = -org.telegram.messenger.g0.L(4.0f);
        float f13 = 1.0f - this.W3;
        float f14 = f12 * f13;
        float f15 = 1.0f - (f13 * 0.05f);
        pv pvVar2 = this.E0;
        if (pvVar2 != null) {
            pvVar2.setScaleX(f15);
            this.E0.setScaleY(f15);
            this.E0.setTranslationX(f14);
            this.E0.setPivotX(0.0f);
            this.E0.setPivotY(0.0f);
        }
        lw lwVar2 = this.X;
        if (lwVar2 != null) {
            lwVar2.setTranslationX(f14);
            this.X.setScaleX(f15);
            this.X.setScaleY(f15);
        }
        sv svVar2 = this.F3;
        if (svVar2 == null || svVar2.getFragmentView() == null) {
            return;
        }
        if (!this.D) {
            this.F3.getFragmentView().setScaleX(f15);
            this.F3.getFragmentView().setScaleY(f15);
            this.F3.getFragmentView().setTranslationX(f14);
        }
        this.F3.getFragmentView().setPivotX(0.0f);
        this.F3.getFragmentView().setPivotY(0.0f);
    }

    public final void S3(boolean z9) {
        if (this.C0 == null || this.actionBar == null) {
            return;
        }
        int i7 = org.telegram.messenger.g0.n;
        int measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(this.a) + (this.a0 != null ? org.telegram.messenger.g0.L(50.0f) : 0);
        org.telegram.ui.Components.pr prVar = this.J1;
        int c10 = measuredHeight + (prVar != null ? (int) prVar.c(org.telegram.messenger.g0.L(7.0f)) : 0);
        fw fwVar = this.C0;
        SparseArray sparseArray = fwVar.h;
        fwVar.W0 = c10;
        fwVar.X0 = i7;
        bi.q1 q1Var = fwVar.a0;
        if (z9) {
            q1Var.q1(0, c10, 0, i7);
        } else {
            q1Var.setPadding(0, c10, 0, i7);
        }
        fwVar.O0.j(fwVar.W0, fwVar.X0, z9);
        org.telegram.ui.Components.sl0 sl0Var = fwVar.b0;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sl0Var.getLayoutParams();
        int i10 = marginLayoutParams.topMargin;
        int i11 = fwVar.W0;
        if (i10 != i11 || marginLayoutParams.bottomMargin != fwVar.X0) {
            marginLayoutParams.topMargin = i11;
            marginLayoutParams.bottomMargin = fwVar.X0;
            sl0Var.requestLayout();
        }
        org.telegram.ui.Components.fm0.Q(fwVar.h0, fwVar.k0, fwVar.W0, fwVar.X0, z9);
        org.telegram.ui.Components.fm0.Q(fwVar.m0, fwVar.p0, fwVar.W0, fwVar.X0, z9);
        org.telegram.ui.Components.fm0.Q(fwVar.t0, fwVar.w0, fwVar.W0, fwVar.X0, z9);
        org.telegram.ui.Components.ze0 ze0Var = fwVar.r0;
        int i12 = fwVar.W0;
        int i13 = fwVar.X0;
        ze0Var.setClipToPadding(false);
        org.telegram.ui.Components.q41 q41Var = ze0Var.c;
        ze0Var.J = z9;
        ze0Var.setPadding(0, i12, 0, i13);
        if (z9) {
            q41Var.q1(0, i12, 0, i13);
        } else {
            q41Var.setPadding(0, i12, 0, i13);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) q41Var.getLayoutParams();
        marginLayoutParams2.topMargin = -i12;
        marginLayoutParams2.bottomMargin = -i13;
        ze0Var.J = false;
        org.telegram.ui.Components.dl0 dl0Var = fwVar.I0;
        if (dl0Var != null) {
            dl0Var.b(fwVar.W0, fwVar.X0, z9);
        }
        int size = sparseArray.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) sparseArray.valueAt(i14);
            if (view instanceof yz) {
                ((yz) view).j(fwVar.W0, fwVar.X0, z9);
            }
        }
        for (int i15 = 0; i15 < fwVar.getChildCount(); i15++) {
            if (fwVar.getChildAt(i15) instanceof yz) {
                ((yz) fwVar.getChildAt(i15)).j(fwVar.W0, fwVar.X0, z9);
            }
        }
    }

    public final void S4() {
        getContactsController().B();
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(getParentActivity(), this.currentAccount, getResourceProvider(), new org.telegram.ui.Components.l51(12, this, r1), new bh(r1, 17));
        org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(getParentActivity(), false, 1, getResourceProvider());
        h.N = p6Var;
        h.U0 = 49;
        h.show();
        org.telegram.ui.ActionBar.v2[] v2VarArr = {h};
        h.P(org.telegram.ui.ActionBar.k6.h5);
    }

    public final void T3() {
        if (this.J1 != null) {
            float T1 = org.telegram.messenger.g0.T1(0.98f, 1.0f, 1.0f);
            this.J1.setAlpha(1.0f);
            this.J1.setScaleX(T1);
            this.J1.setScaleY(T1);
            this.J1.setVisibility(0);
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
        ww wwVar;
        char c10;
        long j10;
        org.telegram.messenger.vo voVar;
        boolean[] zArr;
        ?? r52;
        ww wwVar2;
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
        final ww wwVar3 = this;
        boolean Y = org.telegram.messenger.t3.Y(t2Var.g2);
        int i16 = 1;
        if (!t2Var.U()) {
            long dialogId = t2Var.getDialogId();
            Bundle bundle = new Bundle();
            int messageId = t2Var.getMessageId();
            if (!org.telegram.messenger.m5.C(dialogId)) {
                if (org.telegram.messenger.m5.E(dialogId)) {
                    bundle.putLong("user_id", dialogId);
                } else if (wwVar3.Y2 == 0 || ((b10 = ii.m0.b(wwVar3.currentAccount, dialogId)) != 4 && b10 != 3)) {
                    TLRPC.Chat M0 = wwVar3.getMessagesController().M0(Long.valueOf(-dialogId));
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
                boolean z12 = wwVar3.Y2 == 0 && wwVar3.getMessagesController().E3 && wwVar3.getMessagesController().U0 && wwVar3.getMessagesController().P0 != null && wwVar3.getMessagesController().P0.size() > 0;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = new ActionBarPopupWindow$ActionBarPopupWindowLayout[1];
                if (z12) {
                    LinearLayout linearLayout3 = new LinearLayout(wwVar3.getParentActivity());
                    linearLayout3.setOrientation(1);
                    org.telegram.ui.Components.h60 h60Var2 = new org.telegram.ui.Components.h60(wwVar3.getParentActivity(), i16);
                    LinearLayout linearLayout4 = new LinearLayout(wwVar3.getParentActivity());
                    linearLayout4.setOrientation(1);
                    h60Var2.addView(linearLayout4);
                    int size = wwVar3.getMessagesController().P0.size();
                    int i17 = 0;
                    org.telegram.ui.ActionBar.z0 z0Var2 = null;
                    while (i17 < size) {
                        final org.telegram.messenger.vo voVar2 = (org.telegram.messenger.vo) wwVar3.getMessagesController().P0.get(i17);
                        if (voVar2.e()) {
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                            j12 = dialogId;
                            c11 = 'd';
                        } else {
                            final boolean b11 = voVar2.b(org.telegram.messenger.c.a(wwVar3.currentAccount), dialogId);
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                            j12 = dialogId;
                            final ArrayList J0 = org.telegram.ui.Components.gz.J0(wwVar3, voVar2, arrayList2, true, false);
                            if (!b11) {
                                c11 = 'd';
                            }
                            org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(2, wwVar3.getParentActivity(), null, false, false);
                            z0Var3.setChecked(b11);
                            i14 = i17;
                            org.telegram.ui.Components.h60 h60Var3 = h60Var2;
                            Spannable C5 = org.telegram.messenger.ij.C5(org.telegram.messenger.i6.m(voVar2.b, z0Var3.getTextView().getPaint().getFontMetricsInt(), false, null, 0), voVar2.c, z0Var3.getTextView().getPaint().getFontMetricsInt(), false);
                            z0Var3.setEmojiCacheType(voVar2.n ? 26 : 0);
                            z0Var3.j(C5, 0, new org.telegram.ui.Components.xz(wwVar3.getParentActivity(), R.drawable.msg_folders, voVar2.m));
                            z0Var3.getTextView().setEmojiColor(wwVar3.getThemedColor(org.telegram.ui.ActionBar.k6.Ci));
                            z0Var3.setMinimumWidth(org.telegram.messenger.qs.q2);
                            i15 = size;
                            z11 = Y;
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                            linearLayout2 = linearLayout4;
                            z0Var = z0Var3;
                            h60Var = h60Var3;
                            dialogId = j12;
                            z0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.mu
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    ArrayList arrayList3;
                                    long j13;
                                    org.telegram.messenger.vo voVar3;
                                    ww wwVar4 = ww.this;
                                    wwVar4.getClass();
                                    boolean z13 = b11;
                                    ArrayList arrayList4 = J0;
                                    org.telegram.messenger.vo voVar4 = voVar2;
                                    long j14 = j12;
                                    if (z13) {
                                        voVar4.h.remove(Long.valueOf(j14));
                                        voVar4.i.add(Long.valueOf(j14));
                                        gz.z0(voVar4, voVar4.g, voVar4.b, voVar4.c, voVar4.n, voVar4.m, voVar4.h, voVar4.i, voVar4.j, false, false, true, true, false, wwVar4, null);
                                        wwVar4.k4().k(j14, 21, Integer.valueOf(arrayList4.size()), voVar4, null, null);
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
                                            gz.z0(voVar3, voVar4.g, voVar4.b, voVar4.c, voVar4.n, voVar4.m, voVar4.h, voVar4.i, voVar4.j, false, false, true, true, false, wwVar4, null);
                                        }
                                        wwVar4.k4().k(j13, 20, Integer.valueOf(arrayList3.size()), voVar3, null, null);
                                    }
                                    wwVar4.n4(true);
                                    wwVar4.finishPreviewFragment();
                                }
                            });
                            linearLayout2.addView(z0Var);
                            i17 = i14 + 1;
                            wwVar3 = this;
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
                        wwVar3 = this;
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
                        org.telegram.ui.ActionBar.d1 d1Var = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.k6.H8, getParentActivity(), getResourceProvider());
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
                    z0Var6.j(org.telegram.messenger.id.M0(2131750813, null), R.drawable.msg_addfolder, null);
                    z0Var6.setMinimumWidth(i7);
                    z0Var6.setOnClickListener(new org.telegram.ui.Components.t41(8, actionBarPopupWindow$ActionBarPopupWindowLayoutArr, iArr));
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(z0Var6);
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().setOnHeightUpdateListener(new wr(f2VarArr, 4));
                }
                if (z9) {
                    wwVar = this;
                    c10 = 0;
                } else {
                    org.telegram.ui.ActionBar.z0 z0Var7 = new org.telegram.ui.ActionBar.z0(getParentActivity(), !z12, false);
                    if (t2Var.getHasUnread()) {
                        z0Var7.j(org.telegram.messenger.id.M0(2131748682, null), R.drawable.msg_markread, null);
                    } else {
                        z0Var7.j(org.telegram.messenger.id.M0(2131748681, null), R.drawable.msg_markunread, null);
                    }
                    z0Var7.setMinimumWidth(i7);
                    wwVar = this;
                    long j13 = dialogId;
                    dialogId = j13;
                    z0Var7.setOnClickListener(new bi.p3(wwVar, t2Var, j13, 5));
                    c10 = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(z0Var7);
                }
                boolean[] zArr2 = new boolean[1];
                zArr2[c10] = true;
                TLRPC.Dialog dialog = (TLRPC.Dialog) wwVar.getMessagesController().Q.f(dialogId);
                int i18 = wwVar.e0[c10].s;
                boolean z13 = (i18 == 7 || i18 == 8) && (!wwVar.actionBar.v() || wwVar.actionBar.w(null));
                if (z13) {
                    j10 = dialogId;
                    voVar = wwVar.getMessagesController().M[wwVar.e0[0].s == 8 ? (char) 1 : (char) 0];
                } else {
                    j10 = dialogId;
                    voVar = null;
                }
                if (wwVar.s4(dialog)) {
                    zArr = zArr2;
                    r52 = 0;
                } else {
                    ArrayList W0 = wwVar.getMessagesController().W0(wwVar.W2);
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
                        } else if (wwVar.s4(dialog2)) {
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
                            if (!wwVar.getMessagesController().C2(dialog2.id, false)) {
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
                    if (dialog == null || wwVar.s4(dialog)) {
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
                    int size3 = (!z10 || voVar == null) ? (wwVar.W2 == 0 && voVar == null) ? wwVar.getUserConfig().q() ? wwVar.getMessagesController().K4 : wwVar.getMessagesController().J4 : wwVar.getUserConfig().q() ? wwVar.getMessagesController().l3 : wwVar.getMessagesController().k3 : 100 - voVar.h.size();
                    boolean z14 = i12 + i21 <= size3 && (i13 + i20) - i11 <= size3;
                    r52 = 0;
                    zArr[0] = z14;
                }
                if (zArr[r52]) {
                    org.telegram.ui.ActionBar.z0 z0Var8 = new org.telegram.ui.ActionBar.z0(wwVar.getParentActivity(), (z12 || !z9) ? r52 : true, r52);
                    if (wwVar.s4(dialog)) {
                        z0Var8.j(org.telegram.messenger.id.M0(2131743847, null), R.drawable.msg_unpin, null);
                    } else {
                        z0Var8.j(org.telegram.messenger.id.M0(2131747246, null), R.drawable.msg_pin, null);
                    }
                    z0Var8.setMinimumWidth(org.telegram.messenger.qs.q2);
                    long j14 = j10;
                    org.telegram.ui.Components.rq rqVar = new org.telegram.ui.Components.rq(wwVar, voVar, dialog, j14, 1);
                    wwVar2 = wwVar;
                    j11 = j14;
                    z0Var8.setOnClickListener(rqVar);
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(z0Var8);
                } else {
                    wwVar2 = wwVar;
                    j11 = j10;
                }
                if (org.telegram.messenger.m5.E(j11) && org.telegram.messenger.t10.B(wwVar2.getMessagesController().a2(Long.valueOf(j11)))) {
                    i10 = 0;
                } else {
                    org.telegram.ui.ActionBar.z0 z0Var9 = new org.telegram.ui.ActionBar.z0(wwVar2.getParentActivity(), false, false);
                    if (wwVar2.getMessagesController().r2(j11, 0L, null)) {
                        z0Var9.j(org.telegram.messenger.id.M0(2131743852, null), R.drawable.msg_unmute, null);
                    } else {
                        z0Var9.j(org.telegram.messenger.id.M0(2131748315, null), R.drawable.msg_mute, null);
                    }
                    z0Var9.setMinimumWidth(org.telegram.messenger.qs.q2);
                    z0Var9.setOnClickListener(new di.u1(wwVar2, j11, 2));
                    i10 = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(z0Var9);
                }
                if (!z9) {
                    org.telegram.ui.ActionBar.z0 z0Var10 = new org.telegram.ui.ActionBar.z0(wwVar2.getParentActivity(), i10, true);
                    z0Var10.setIconColor(wwVar2.getThemedColor(org.telegram.ui.ActionBar.k6.p7));
                    int i23 = org.telegram.ui.ActionBar.k6.q7;
                    z0Var10.setTextColor(wwVar2.getThemedColor(i23));
                    z0Var10.h(0.12f, i23);
                    z0Var10.j(org.telegram.messenger.id.M0(2131751599, null), R.drawable.msg_delete, null);
                    z0Var10.setMinimumWidth(org.telegram.messenger.qs.q2);
                    z0Var10.setOnClickListener(new org.telegram.ui.Components.t41(9, wwVar2, arrayList2));
                    i10 = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(z0Var10);
                }
                int i24 = org.telegram.messenger.qs.t;
                if (z9) {
                    if (wwVar2.n2 != null) {
                        wwVar2.getNotificationCenter().k(i24, new Object[i10]);
                    }
                    wwVar2.F4();
                    wwVar2.parentLayout.setHighlightActionButtons(true);
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("community_id", -j11);
                    ww wwVar4 = new ww(bundle2);
                    Point point = org.telegram.messenger.g0.q;
                    if (point.x > point.y) {
                        f2VarArr[0] = wwVar4;
                        wwVar2.presentFragmentAsPreview(wwVar4);
                        return false;
                    }
                    f2VarArr[0] = wwVar4;
                    wwVar2.presentFragmentAsPreviewWithMenu(wwVar4, actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0]);
                    return false;
                }
                if (!wwVar2.getMessagesController().E(bundle, wwVar2, null, null)) {
                    return i10;
                }
                if (wwVar2.n2 != null) {
                    wwVar2.getNotificationCenter().k(i24, new Object[i10]);
                }
                wwVar2.F4();
                wwVar2.parentLayout.setHighlightActionButtons(true);
                an anVar = new an(bundle);
                Point point2 = org.telegram.messenger.g0.q;
                if (point2.x > point2.y) {
                    f2VarArr[0] = anVar;
                    wwVar2.presentFragmentAsPreview(anVar);
                    return true;
                }
                f2VarArr[0] = anVar;
                wwVar2.presentFragmentAsPreviewWithMenu(anVar, actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0]);
                anVar.ca = true;
                try {
                    anVar.o1.getAvatarImageView().performAccessibilityAction(64, null);
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
        return this.R0 == 10;
    }

    public final void U4(boolean z9) {
        int i7 = 1;
        this.c.a(z9, true);
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
        this.O3.playTogether(arrayList);
        this.O3.addListener(new yv(this, z9, i7));
        this.O3.start();
    }

    public final void V3() {
        if (!org.telegram.messenger.g0.Q1()) {
            this.V1 = true;
            return;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.l(true);
        }
        TLObject tLObject = this.X1;
        if (tLObject != null) {
            fw fwVar = this.C0;
            if (fwVar != null) {
                fwVar.d0.Q(this.W1, tLObject);
            }
            this.X1 = null;
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
        org.telegram.messenger.g0.i3(new cu(this, 26), 1000L);
    }

    @Override // org.telegram.ui.ActionBar.f2, org.telegram.ui.ie0
    public final boolean W(MotionEvent motionEvent, boolean z9) {
        sv svVar;
        bi.ec ecVar;
        mw mwVar;
        if (!this.q3 && (((svVar = this.F3) == null || !svVar.c()) && (((ecVar = this.K0) == null || ecVar.getVisibility() != 0) && ((mwVar = this.z0) == null || !mwVar.n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                mw mwVar2 = this.z0;
                boolean z10 = mwVar2 == null || mwVar2.getTabsCount() < 2 || this.z0.getCurrentTabId() == this.z0.getFirstTabId();
                mw mwVar3 = this.z0;
                boolean z11 = mwVar3 == null || mwVar3.getTabsCount() < 2 || this.z0.getCurrentTabId() == this.z0.getLastTabId();
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
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar == null || !kVar.n0) {
            return;
        }
        kVar.k();
        this.q3 = false;
        i5(true, true);
    }

    public final void W4() {
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2;
        LaunchActivity launchActivity;
        float f10;
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        du duVar;
        org.telegram.ui.Components.l51 l51Var;
        int i7;
        org.telegram.ui.ActionBar.z0 z0Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i10;
        org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(this, this.k0);
        int i11 = org.telegram.ui.ActionBar.k6.A8;
        H.S(getThemedColor(i11), getThemedColor(i11));
        int i12 = 8;
        H.s = 8;
        Activity parentActivity = getParentActivity();
        LaunchActivity launchActivity2 = parentActivity instanceof LaunchActivity ? (LaunchActivity) parentActivity : null;
        int i13 = 5;
        float f11 = 64.0f;
        int i14 = 0;
        if (this.Y2 != 0) {
            int i15 = 1;
            if (org.telegram.messenger.t3.N(this.Z2)) {
                H.c(R.drawable.msg_customize, org.telegram.messenger.id.M0(2131751913, null), new zu(this, i15), false);
                H.k();
            }
            H.i(new zu(this, 4), org.telegram.messenger.id.M0(2131751912, null), this.Z2.collapsed_in_dialogs);
            H.i(new zu(this, i13), org.telegram.messenger.id.M0(2131751911, null), !this.Z2.collapsed_in_dialogs);
            H.Z();
            H.X(-org.telegram.messenger.g0.L(64.0f));
            return;
        }
        if (q4()) {
            H.c(R.drawable.msg_customize, org.telegram.messenger.id.M0(2131754143, null), new zu(this, 6), false);
            H.c(R.drawable.msg_help, org.telegram.messenger.id.M0(2131749277, null), new zu(this, 7), false);
            H.Z();
            H.X(-org.telegram.messenger.g0.L(64.0f));
            return;
        }
        org.telegram.ui.ActionBar.f6 f6Var2 = this.resourceProvider;
        boolean a10 = f6Var2 != null ? f6Var2.a() : org.telegram.ui.ActionBar.k6.I.q();
        H.c(a10 ? R.drawable.menu_day_mode_24 : R.drawable.menu_night_mode_24, org.telegram.messenger.id.M0(a10 ? 2131744303 : 2131744302, null), new zu(this, i12), false);
        H.k();
        H.c(R.drawable.outline_groups_24, org.telegram.messenger.id.M0(2131748274, null), new zu(this, 9), false);
        H.c(R.drawable.outline_saved_24, org.telegram.messenger.id.M0(2131745904, null), new zu(this, 10), false);
        org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.a;
        if (((org.telegram.messenger.h0) getMessagesController().x7.j0.b).c) {
            H.c(R.drawable.ic_gram, org.telegram.messenger.id.M0(2131743197, null), new cu(this, i14), false);
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
                        du duVar2 = new du(this, tL_attachMenuBot2, launchActivity2, i14);
                        org.telegram.ui.Components.l51 l51Var2 = new org.telegram.ui.Components.l51(14, this, tL_attachMenuBot2);
                        org.telegram.ui.ActionBar.f6 f6Var3 = H.d;
                        if (H.e != null) {
                            int i17 = org.telegram.ui.ActionBar.k6.F8;
                            int i18 = org.telegram.ui.ActionBar.k6.E8;
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
                                org.telegram.messenger.rz f12 = org.telegram.messenger.t5.f(tL_attachMenuBotIcon.icon, org.telegram.ui.ActionBar.k6.c7, 1.0f, null);
                                if (f12 != null) {
                                    Integer num = H.k0;
                                    new PorterDuffColorFilter(num != null ? num.intValue() : org.telegram.ui.ActionBar.k6.w0(i17, f6Var3), PorterDuff.Mode.SRC_IN);
                                }
                                org.telegram.messenger.hc b11 = org.telegram.messenger.hc.b(tL_attachMenuBotIcon.icon);
                                duVar = duVar2;
                                z0Var = z0Var2;
                                l51Var = l51Var2;
                                CharSequence charSequence = b10;
                                i10 = i17;
                                f6Var = f6Var3;
                                z0Var.k(charSequence, b11, "24_24", f12, tL_attachMenuBot2);
                                org.telegram.ui.Components.l9 l9Var = z0Var.h;
                                if (l9Var != null) {
                                    l9Var.setLayoutParams(c8.ha.e(24, 24, (org.telegram.messenger.id.a0 ? 5 : 3) | 16));
                                }
                            } else {
                                duVar = duVar2;
                                l51Var = l51Var2;
                                i7 = 16;
                                z0Var = z0Var2;
                                CharSequence charSequence2 = b10;
                                f6Var = f6Var3;
                                i10 = i17;
                                z0Var.j(charSequence2, R.drawable.msg_bot, null);
                            }
                            Integer num2 = H.j0;
                            if (num2 == null && H.k0 == null) {
                                z0Var.c(i18, i10);
                            } else {
                                int intValue = num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.k6.w0(i18, f6Var);
                                Integer num3 = H.k0;
                                z0Var.d(intValue, num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
                            }
                            Integer num4 = H.k0;
                            z0Var.setIconColorImage(num4 != null ? num4.intValue() : org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
                            Integer num5 = H.l0;
                            if (num5 != null) {
                                z0Var.setSelectorColor(num5.intValue());
                            } else {
                                z0Var.h(0.12f, i18);
                            }
                            z0Var.setOnClickListener(new org.telegram.ui.Components.lk(i7, H, duVar));
                            z0Var.setOnLongClickListener(new di.f2(3, H, l51Var));
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
            H.c(R.drawable.msg_settings_old, org.telegram.messenger.id.M0(2131745498, null), new zu(this, 3), false);
        }
        org.telegram.ui.ActionBar.z0 z0Var3 = this.o0;
        if (z0Var3 != null) {
            org.telegram.ui.ActionBar.r6.V(z0Var3.b, org.telegram.ui.ActionBar.k6.Oi, getResourceProvider());
            this.o0.setOnClickListener(new org.telegram.ui.Components.t41(12, this, H));
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
        if (this.actionBar.e(str)) {
            return;
        }
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n(str);
        boolean z9 = this.W;
        int i7 = 1;
        ArrayList arrayList = this.i1;
        if (z9) {
            ImageView imageView = new ImageView(getParentActivity());
            this.g1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.g1.setImageDrawable(new org.telegram.ui.ActionBar.y1(true));
            org.telegram.ui.ActionBar.r6.t(this.g1, org.telegram.ui.ActionBar.k6.y8, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.g1;
            int i10 = org.telegram.ui.ActionBar.k6.z8;
            org.telegram.ui.ActionBar.r6.R(imageView2, org.telegram.ui.ActionBar.k6.h0(getThemedColor(i10), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i10), getResourceProvider());
            this.g1.setOnClickListener(new eu(this, 6));
            n10.addView(this.g1, c8.ha.r(54, 54, 16));
            arrayList.add(this.g1);
        }
        NumberTextView numberTextView = new NumberTextView(n10.getContext());
        this.h1 = numberTextView;
        numberTextView.setTextSize(18);
        this.h1.setTypeface(org.telegram.messenger.g0.o());
        this.h1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.y8));
        n10.addView(this.h1, c8.ha.m(1.0f, 0, -1, this.W ? 18 : 72, 0, 0));
        this.h1.setOnTouchListener(new ei.b(2));
        this.k1 = n10.g(100, R.drawable.msg_pin, org.telegram.messenger.g0.L(48.0f));
        this.l1 = n10.g(org.telegram.messenger.qs.p1, R.drawable.msg_mute, org.telegram.messenger.g0.L(48.0f));
        this.m1 = n10.g(org.telegram.messenger.qs.s1, R.drawable.msg_archive, org.telegram.messenger.g0.L(48.0f));
        this.j1 = n10.h(org.telegram.messenger.qs.n1, R.drawable.msg_delete, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.id.M0(2131751599, null));
        org.telegram.ui.ActionBar.r0 h = n10.h(0, R.drawable.ic_ab_other, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.id.M0(2131754839, null));
        n10.addView(new View(getParentActivity()), c8.ha.o(5, -1));
        this.q1 = h.e(org.telegram.messenger.qs.q1, R.drawable.msg_archive, org.telegram.messenger.id.M0(2131754172, null));
        this.n1 = h.e(org.telegram.messenger.qs.t1, R.drawable.msg_pin, org.telegram.messenger.id.M0(2131751454, null));
        this.o1 = h.e(org.telegram.messenger.qs.u1, R.drawable.msg_addfolder, org.telegram.messenger.id.M0(2131750813, null));
        this.p1 = h.e(org.telegram.messenger.qs.v1, R.drawable.msg_removefolder, org.telegram.messenger.id.M0(2131750713, null));
        this.s1 = h.e(101, R.drawable.msg_markread, org.telegram.messenger.id.M0(2131748682, null));
        this.r1 = h.e(org.telegram.messenger.qs.o1, R.drawable.msg_clear, org.telegram.messenger.id.M0(2131752089, null));
        this.t1 = h.e(org.telegram.messenger.qs.r1, R.drawable.msg_block, org.telegram.messenger.id.M0(2131753692, null));
        this.l1.setOnLongClickListener(new qu(this, i7));
        arrayList.add(this.k1);
        arrayList.add(this.m1);
        arrayList.add(this.l1);
        arrayList.add(this.j1);
        arrayList.add(h);
        f5(false);
    }

    public final void X4() {
        if (this.R3 != null) {
            return;
        }
        for (String str : getMessagesController().S3) {
            if ("AUTOARCHIVE_POPULAR".equals(str)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = org.telegram.messenger.id.M0(2131749320, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131749321, null));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131749534, null), new fu(this, 6));
                showDialog(u1Var, new lu(this, 0));
                this.R3 = str;
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
            lw lwVar = this.X;
            te.a aVar = this.b;
            lwVar.setBlurredBackgroundVisibility(aVar.e);
            float a10 = a8.j7.a(aVar.e);
            org.telegram.ui.Components.l9 l9Var = this.b3;
            if (l9Var != null) {
                l9Var.setScaleX(a10);
                this.b3.setScaleY(a10);
                this.b3.setAlpha(a10);
                this.b3.setVisibility(a10 > 0.0f ? 0 : 8);
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
        fw fwVar = this.C0;
        if ((fwVar != null && fwVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        fw fwVar2 = new fw(this, getParentActivity(), this, this.n2 != null ? 2 : !this.l2 ? 1 : 0, this.R0, this.W2, this.Y2, new dv(this));
        this.C0 = fwVar2;
        this.glassEngine.c(fwVar2);
        ((pw) this.fragmentView).addView(this.C0, this.B0);
        fw fwVar3 = this.C0;
        fwVar3.d0.U = new hw(this);
        fwVar3.k0.setOnItemClickListener(new fu(this, 1));
        this.C0.p0.setOnItemClickListener(new fu(this, 2));
        this.C0.w0.setOnItemClickListener(new ku(this, 0));
        this.C0.p0.setOnItemLongClickListener(new fu(this, 3));
        this.C0.a0.setOnItemClickListener(new fu(this, 4));
        this.C0.a0.setOnItemLongClickListener(new dv(this));
        this.C0.setFilteredSearchViewDelegate(new fu(this, 5));
        this.C0.setAlpha(0.0f);
        this.C0.setScaleX(1.05f);
        this.C0.setScaleY(1.05f);
        this.C0.setVisibility(8);
        this.C0.setBlurredBackgroundDrawableFactory(this.o4);
    }

    public final void Y4(long j3, View view) {
        s3(j3, view);
        boolean v = this.actionBar.v();
        ArrayList arrayList = this.I2;
        boolean z9 = true;
        char c10 = 1;
        int i7 = 0;
        if (!v) {
            if (this.q3) {
                X3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.r4)) {
                    this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
                }
            } else {
                X3(null);
            }
            org.telegram.messenger.g0.v1(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            this.actionBar.O(null, null);
            int i10 = this.e0[0].s;
            ArrayList d42 = ((i10 == 7 || i10 == 8) && (!this.actionBar.v() || this.actionBar.w(null))) ? d4(this.currentAccount, this.e0[0].s, this.W2, this.S1) : getMessagesController().W0(this.W2);
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
                        vw[] vwVarArr = this.e0;
                        if (i13 >= vwVarArr.length) {
                            break;
                        }
                        vwVarArr[i13].d.H = true;
                        i13++;
                    }
                }
                int i14 = org.telegram.messenger.qp.C8;
                u5(131072, true);
            }
            if (!this.q3) {
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
                    org.telegram.messenger.g0.y(view2);
                    arrayList2.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                    i15++;
                }
                animatorSet.playTogether(arrayList2);
                animatorSet.setDuration(200L);
                animatorSet.start();
            }
            ValueAnimator valueAnimator = this.v3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.v3 = ValueAnimator.ofFloat(this.u3, 1.0f);
            int i16 = 0;
            while (true) {
                vw[] vwVarArr2 = this.e0;
                if (i16 >= vwVarArr2.length) {
                    break;
                }
                vw vwVar = vwVarArr2[i16];
                if (vwVar != null) {
                    vwVar.a.I0(true);
                }
                i16++;
            }
            float max = Math.max(0.0f, org.telegram.messenger.g0.L((this.K ? 81 : 0) + 48) + this.N);
            if (max != 0.0f) {
                this.P = (int) max;
                this.fragmentView.requestLayout();
            }
            this.v3.addUpdateListener(new gu(this, max, i7));
            this.v3.addListener(new aw(this, max, c10 == true ? 1 : 0));
            this.v3.setInterpolator(org.telegram.ui.Components.xq.f);
            this.v3.setDuration(200L);
            this.v3.start();
            mw mwVar = this.z0;
            if (mwVar != null) {
                mwVar.b(org.telegram.ui.ActionBar.k6.ui, org.telegram.ui.ActionBar.k6.ti, org.telegram.ui.ActionBar.k6.si, org.telegram.ui.ActionBar.k6.vi, org.telegram.ui.ActionBar.k6.w8);
            }
            org.telegram.ui.ActionBar.y1 y1Var = this.e1;
            if (y1Var != null) {
                y1Var.c(true, 1.0f);
            }
            z9 = false;
        } else if (arrayList.isEmpty()) {
            n4(true);
            return;
        }
        f5(false);
        this.h1.a(arrayList.size(), z9);
    }

    public final void Z3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.y0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i7 = 0; i7 < 2; i7++) {
                undoViewArr[i7] = new bw(this, parentActivity);
                FrameLayout.LayoutParams d = c8.ha.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                d.bottomMargin = this.f4 + this.h4 + d.bottomMargin;
                pw pwVar = (pw) this.fragmentView;
                UndoView undoView = undoViewArr[i7];
                int i10 = this.x0 + 1;
                this.x0 = i10;
                pwVar.addView(undoView, i10, d);
            }
        }
    }

    public final void Z4(long j3, View view) {
        int i7 = -this.L3;
        this.L3 = i7;
        org.telegram.messenger.g0.G3(i7, view, null);
        org.telegram.messenger.p2.D.a();
        String p10 = j3 >= 0 ? org.telegram.messenger.t10.p(org.telegram.messenger.qp.s1(this.currentAccount).a2(Long.valueOf(j3))) : "";
        (getMessagesController().D3() ? org.telegram.ui.Components.hc.a0(this).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131743763, p10))) : org.telegram.ui.Components.hc.a0(this).K(R.raw.star_premium_2, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131743763, p10)), org.telegram.messenger.id.M0(2131743762, null), new cu(this, 8))).j();
    }

    public final void a4(final long j3, final long j10, boolean z9, final w91 w91Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String M0;
        String b02;
        String M02;
        TLRPC.TL_forumTopic f10;
        if (A3(j3)) {
            int i7 = this.R0;
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
            if (!z9 || ((this.f2 == null || this.g2 == null) && this.h2 == null)) {
                if (i7 != 15) {
                    if (this.C2 == null) {
                        finishFragment();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(org.telegram.messenger.xr.a(j3, j10));
                    if (this.C2.y(this, arrayList, null, false, this.J2, this.K2, this.L2, w91Var) && this.i2) {
                        this.C2 = null;
                        return;
                    }
                    return;
                }
                Runnable d3Var = new bi.d3(this, j3, new bi.h4(this, j3, j10, w91Var, 6), 26);
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
                alertDialog$Builder.k(org.telegram.messenger.id.a0("Send", null, 2131745643, new Object[0]), new wr(d3Var, 5));
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
                M0 = org.telegram.messenger.id.M0(2131745599, null);
                b02 = org.telegram.messenger.id.b0(this.f2, org.telegram.messenger.t10.p(a25));
                M02 = org.telegram.messenger.id.M0(2131745643, null);
            } else if (!org.telegram.messenger.m5.E(j3)) {
                TLRPC.Chat M04 = getMessagesController().M0(Long.valueOf(-j3));
                if (M04 == null) {
                    return;
                }
                String str = M04.title;
                if (j10 != 0 && (f10 = getMessagesController().q7.f(M04.id, j10)) != null) {
                    str = ((Object) str) + " " + f10.title;
                }
                if (this.h2 != null) {
                    M0 = org.telegram.messenger.id.M0(2131754366, null);
                    b02 = org.telegram.messenger.id.b0(this.h2, str);
                    M02 = org.telegram.messenger.id.M0(2131754486, null);
                } else {
                    M0 = org.telegram.messenger.id.M0(2131745599, null);
                    b02 = org.telegram.messenger.id.b0(this.g2, str);
                    M02 = org.telegram.messenger.id.M0(2131745643, null);
                }
            } else if (j3 == getUserConfig().e()) {
                M0 = org.telegram.messenger.id.M0(2131745599, null);
                b02 = org.telegram.messenger.id.b0(this.g2, org.telegram.messenger.id.M0(2131745904, null));
                M02 = org.telegram.messenger.id.M0(2131745643, null);
            } else {
                TLRPC.User a26 = getMessagesController().a2(Long.valueOf(j3));
                if (a26 == null || this.f2 == null) {
                    return;
                }
                M0 = org.telegram.messenger.id.M0(2131745599, null);
                b02 = org.telegram.messenger.id.b0(this.f2, org.telegram.messenger.t10.p(a26));
                M02 = org.telegram.messenger.id.M0(2131745643, null);
            }
            org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder2.a;
            u1Var3.R = M0;
            u1Var3.T = org.telegram.messenger.g0.X2(b02);
            alertDialog$Builder2.k(M02, new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.yu
                @Override // org.telegram.ui.ActionBar.r1
                public final void g(org.telegram.ui.ActionBar.u1 u1Var4, int i10) {
                    ww.this.a4(j3, j10, false, w91Var);
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
        fw fwVar;
        fw fwVar2;
        pv pvVar;
        fw fwVar3;
        boolean z13;
        fw fwVar4;
        boolean z14;
        org.telegram.ui.Components.u61 u61Var;
        TLRPC.Chat chat;
        sv svVar;
        boolean z15 = z11;
        this.b.a(z9, z15);
        int i7 = 0;
        if (z9) {
            Y3();
        } else {
            q5(false);
        }
        int i10 = this.R0;
        if (i10 != 0 && i10 != 3) {
            z15 = false;
        }
        AnimatorSet animatorSet = this.w1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.w1 = null;
        }
        this.q3 = z9;
        this.glassEngine.g();
        if (!z9) {
            i5(false, z15);
        }
        if (z9) {
            if (!this.t3 && !z12) {
                ArrayList arrayList = (ArrayList) getMessagesController().w.get(0);
                int size = arrayList != null ? arrayList.size() : 0;
                if (this.l2 || (size <= 10 && !this.K)) {
                    z13 = true;
                    fwVar4 = this.C0;
                    if (fwVar4 != null) {
                        fwVar4.Q0 = z13;
                    }
                    z14 = z13 || this.K;
                    this.s3 = z14;
                    if (z14) {
                        this.t3 = true;
                    }
                    u61Var = this.a0;
                    if (u61Var != null && fwVar4 != null && !z13 && this.Y2 == 0) {
                        org.telegram.ui.Components.u61 n10 = fwVar4.n(-2, false);
                        this.a0 = n10;
                        this.Z.addView(n10, 0, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
                    } else if (this.Z != null && z13 && this.Y2 == 0) {
                        org.telegram.messenger.g0.E2(u61Var);
                        this.a0 = null;
                    }
                    if (this.C0 != null) {
                        S3(false);
                        this.C0.setKeyboardHeight(((pw) this.fragmentView).getKeyboardHeight());
                        fw fwVar5 = this.C0;
                        fwVar5.C0.clear();
                        fwVar5.L();
                    }
                    chat = this.Z2;
                    if (chat == null) {
                        jg.o0 o0Var = new jg.o0(R.drawable.search_users_filled, 4, org.telegram.messenger.m5.u(chat));
                        o0Var.f = this.Z2;
                        t3(o0Var);
                    } else if (this.W2 != 0 && ((svVar = this.F3) == null || !svVar.c())) {
                        t3(new jg.o0(R.drawable.chats_archive, 2131754150, null, 7));
                    }
                }
            }
            z13 = false;
            fwVar4 = this.C0;
            if (fwVar4 != null) {
            }
            if (z13) {
            }
            this.s3 = z14;
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
            chat = this.Z2;
            if (chat == null) {
            }
        }
        if (z15 && (fwVar3 = this.C0) != null && fwVar3.d0.M()) {
            org.telegram.messenger.g0.l3(getParentActivity(), this.classGuid);
        } else {
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        }
        if (!z9 && (pvVar = this.E0) != null && this.G0) {
            pvVar.setVisibility(0);
        }
        Object[] objArr = org.telegram.messenger.iz.o() == 0 || !org.telegram.messenger.sc.e(32768);
        if (z15) {
            if (z9) {
                fw fwVar6 = this.C0;
                if (fwVar6 != null) {
                    fwVar6.setVisibility(0);
                    fw fwVar7 = this.C0;
                    fwVar7.setPosition(0);
                    if (fwVar7.d0.b() > 0) {
                        fwVar7.e0.h1(0, 0);
                    }
                    v4.b0 b0Var = fwVar7.j0;
                    if (b0Var != null) {
                        b0Var.h1(0, 0);
                    }
                    v4.b0 b0Var2 = fwVar7.o0;
                    if (b0Var2 != null) {
                        b0Var2.h1(0, 0);
                    }
                    v4.b0 b0Var3 = fwVar7.v0;
                    if (b0Var3 != null) {
                        b0Var3.h1(0, 0);
                    }
                    fwVar7.h.clear();
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
            fw fwVar8 = this.C0;
            if (fwVar8 != null) {
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, fwVar8, getResourceProvider());
            }
            this.w1 = new AnimatorSet();
            ArrayList arrayList2 = new ArrayList();
            vw vwVar = this.e0[0];
            Property property = View.ALPHA;
            arrayList2.add(ObjectAnimator.ofFloat(vwVar, (Property<vw, Float>) property, z9 ? 0.0f : 1.0f));
            if (objArr == true) {
                this.e0[0].setScaleX(1.0f);
                this.e0[0].setScaleY(1.0f);
            } else {
                arrayList2.add(ObjectAnimator.ofFloat(this.e0[0], (Property<vw, Float>) View.SCALE_X, z9 ? 0.95f : 1.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.e0[0], (Property<vw, Float>) View.SCALE_Y, z9 ? 0.95f : 1.0f));
            }
            sv svVar2 = this.F3;
            if (svVar2 != null) {
                svVar2.setVisibility(0);
                arrayList2.add(ObjectAnimator.ofFloat(this.F3, (Property<sv, Float>) property, z9 ? 0.0f : 1.0f));
            }
            fw fwVar9 = this.C0;
            if (fwVar9 != null) {
                arrayList2.add(ObjectAnimator.ofFloat(fwVar9, (Property<fw, Float>) property, z9 ? 1.0f : 0.0f));
                if (this.K) {
                    float L = org.telegram.messenger.g0.L(81.0f) + this.N + org.telegram.messenger.g0.L(48.0f);
                    fw fwVar10 = this.C0;
                    float f10 = z9 ? L : 0.0f;
                    if (z9) {
                        L = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(fwVar10, this.H3, f10, L));
                }
                if (objArr == true) {
                    this.C0.setScaleX(1.0f);
                    this.C0.setScaleY(1.0f);
                } else {
                    arrayList2.add(ObjectAnimator.ofFloat(this.C0, (Property<fw, Float>) View.SCALE_X, z9 ? 1.0f : 1.05f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.C0, (Property<fw, Float>) View.SCALE_Y, z9 ? 1.0f : 1.05f));
                }
            }
            if (this.g0 != null) {
                m5(false, false);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x1, z9 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new ju(this, i7));
            arrayList2.add(ofFloat);
            this.w1.playTogether(arrayList2);
            this.w1.setDuration(z9 ? 200L : 180L);
            this.w1.setInterpolator(org.telegram.ui.Components.xq.g);
            if (!z9) {
                this.w1.setStartDelay(20L);
            }
            this.w1.addListener(new yv(this, z9, i7));
            this.p3.d();
            this.w1.start();
        } else {
            M4(false, true);
            if (z9) {
                this.e0[0].a.c1();
            } else {
                sw swVar = this.e0[0].a;
                if (swVar.g1) {
                    swVar.g1 = false;
                    swVar.K0(false);
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
            fw fwVar11 = this.C0;
            if (fwVar11 != null) {
                fwVar11.setAlpha(z9 ? 1.0f : 0.0f);
                if (objArr == true) {
                    this.C0.setScaleX(1.0f);
                    this.C0.setScaleY(1.0f);
                } else {
                    this.C0.setScaleX(z9 ? 1.0f : 1.1f);
                    this.C0.setScaleY(z9 ? 1.0f : 1.1f);
                }
                this.C0.setVisibility(z9 ? 0 : 8);
            }
            lw lwVar = this.X;
            if (lwVar != null) {
                lwVar.setTranslationY(i4() + (z9 ? -org.telegram.messenger.g0.L(36.0f) : 0));
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
        if (i11 >= 0 && (fwVar2 = this.C0) != null) {
            fwVar2.setPosition(fwVar2.N(i11));
        }
        if (!z9) {
            this.y = -1;
        }
        if (z9 && z10 && (fwVar = this.C0) != null) {
            fwVar.setPosition((fwVar.s0 ? 1 : 0) + 5);
            q5(true);
        }
        R3();
        g5();
    }

    @Override // org.telegram.ui.ActionBar.f2
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

    public final void b4(long j3, boolean z9) {
        if (this.e0 == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            vw[] vwVarArr = this.e0;
            if (i7 >= vwVarArr.length) {
                return;
            }
            int childCount = vwVarArr[i7].a.getChildCount();
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
        h11[] h11VarArr = new h11[1];
        TLRPC.User f10 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).f();
        org.telegram.ui.ActionBar.k5 titleTextView = this.actionBar.getTitleTextView();
        if (titleTextView == null || titleTextView.getRightDrawable() == null) {
            i7 = 0;
            i10 = 0;
        } else {
            this.D3.f();
            Drawable drawable = this.D3.f[0];
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set(titleTextView.getRightDrawable().getBounds());
            rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
            int L = (-(this.actionBar.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
            i7 = org.telegram.messenger.g0.L(4.0f) + (rect.centerX() - org.telegram.messenger.g0.L(16.0f));
            org.telegram.ui.Cells.o oVar = this.E3;
            if (oVar != null) {
                oVar.b(rect.centerX(), rect.centerY());
            }
            i10 = L;
        }
        tv tvVar = new tv(this, this, getParentActivity(), Integer.valueOf(i7), getResourceProvider(), h11VarArr);
        if (f10 != null && org.telegram.messenger.m5.g(f10.emoji_status) > 0) {
            tvVar.setExpireDateHint(org.telegram.messenger.m5.g(f10.emoji_status));
        }
        Long l10 = this.B3;
        if (l10 != null) {
            tvVar.setSelected(l10);
        } else {
            Drawable drawable2 = this.D3.f[0];
            tvVar.setSelected(drawable2 instanceof org.telegram.ui.Components.i5 ? Long.valueOf(((org.telegram.ui.Components.i5) drawable2).h()) : null);
        }
        tvVar.setSaveState(1);
        tvVar.y(this.D3, titleTextView);
        uv uvVar = new uv(this, tvVar);
        this.M0 = uvVar;
        h11VarArr[0] = uvVar;
        uvVar.showAsDropDown(this.actionBar, org.telegram.messenger.g0.L(16.0f), i10, 48);
        h11VarArr[0].b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0069, code lost:
    
        if (r13.G.bot_admin_rights != null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v0, types: [org.telegram.ui.ActionBar.f2, org.telegram.ui.ww] */
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
                org.telegram.ui.Cells.f1.p(1, V ? org.telegram.messenger.id.M0(2131751325, null) : org.telegram.messenger.id.M0(2131751324, null), arrayList);
            }
            if (tL_chatAdminRights.post_messages && V) {
                org.telegram.ui.Cells.f1.p(1, org.telegram.messenger.id.M0(2131751313, null), arrayList);
            }
            if (tL_chatAdminRights.edit_messages && V) {
                org.telegram.ui.Cells.f1.p(1, org.telegram.messenger.id.M0(2131751320, null), arrayList);
            }
            if (tL_chatAdminRights.delete_messages) {
                org.telegram.ui.Cells.f1.p(1, org.telegram.messenger.id.M0(V ? 2131751322 : 2131751317, null), arrayList);
            }
            if (tL_chatAdminRights.ban_users && !V) {
                org.telegram.ui.Cells.f1.p(1, org.telegram.messenger.id.M0(2131751329, null), arrayList);
            }
            if (tL_chatAdminRights.invite_users) {
                org.telegram.ui.Cells.f1.p(1, org.telegram.messenger.id.M0(2131751331, null), arrayList);
            }
            if (tL_chatAdminRights.pin_messages && !V) {
                org.telegram.ui.Cells.f1.p(1, org.telegram.messenger.id.M0(2131751314, null), arrayList);
            }
            if (tL_chatAdminRights.add_admins) {
                org.telegram.ui.Cells.f1.p(1, org.telegram.messenger.id.M0(2131751332, null), arrayList);
            }
            if (tL_chatAdminRights.anonymous && !V) {
                org.telegram.ui.Cells.f1.p(1, org.telegram.messenger.id.M0(2131751304, null), arrayList);
            }
            if (tL_chatAdminRights.manage_call) {
                org.telegram.ui.Cells.f1.p(1, org.telegram.messenger.id.M0(2131744904, null), arrayList);
            }
            if (tL_chatAdminRights.manage_topics && !V) {
                org.telegram.ui.Cells.f1.p(1, org.telegram.messenger.id.M0(2131748693, null), arrayList);
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
        alertDialog$Builder.k(org.telegram.messenger.id.a0("Send", null, 2131745643, new Object[0]), new ve(i7, runnable));
        alertDialog$Builder.h(org.telegram.messenger.id.a0("Cancel", null, 2131752589, new Object[0]), new ve(i10, runnable2));
        showDialog(u1Var);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean canBeginSlide() {
        mw mwVar;
        if (this.F3.c()) {
            return false;
        }
        return this.R0 != 3 || (mwVar = this.z0) == null || mwVar.getVisibility() != 0 || this.z0.K <= 0;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean closeLastFragment() {
        if (!this.F3.c()) {
            return super.closeLastFragment();
        }
        this.F3.a();
        fw fwVar = this.C0;
        if (fwVar == null) {
            return true;
        }
        fwVar.S();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.Components.r7 r7Var = new org.telegram.ui.Components.r7(this, context, this.resourceProvider, 3);
        r7Var.setAllowOverlayTitle(true);
        r7Var.G0 = true;
        if (r7Var.F0 == null) {
            di.a4 a4Var = new di.a4(r7Var.getContext(), 5);
            r7Var.F0 = a4Var;
            r7Var.addView(a4Var);
        }
        org.telegram.ui.ActionBar.r6.m(r7Var, 3, org.telegram.ui.ActionBar.k6.t8, getResourceProvider());
        org.telegram.ui.ActionBar.r6.a(r7Var, org.telegram.ui.ActionBar.k6.z8, getResourceProvider(), true);
        org.telegram.ui.ActionBar.r6.m(r7Var, 1, org.telegram.ui.ActionBar.k6.v8, getResourceProvider());
        org.telegram.ui.ActionBar.r6.b(r7Var, org.telegram.ui.ActionBar.k6.y8, getResourceProvider(), true);
        if (r7Var.x1 == null) {
            di.j jVar = new di.j(r7Var, r7Var.getContext(), r7Var.J0, r7Var.O0);
            r7Var.x1 = jVar;
            jVar.setClipChildren(false);
            r7Var.addView(r7Var.x1);
        }
        r7Var.getAdditionalSubTitleOverlayContainer().setTranslationX(org.telegram.messenger.g0.L(4.0f));
        r7Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-org.telegram.messenger.g0.L(3.0f));
        if (!this.inPreviewMode && (!org.telegram.messenger.g0.Q1() || this.W2 == 0 || q4())) {
            return r7Var;
        }
        r7Var.setOccupyStatusBar(false);
        return r7Var;
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
    /* JADX WARN: Type inference failed for: r10v16, types: [org.telegram.ui.Components.pj0, org.telegram.ui.sw] */
    /* JADX WARN: Type inference failed for: r10v21, types: [org.telegram.ui.Components.pj0, org.telegram.ui.sw] */
    /* JADX WARN: Type inference failed for: r10v22, types: [org.telegram.ui.Components.pj0, org.telegram.ui.sw] */
    /* JADX WARN: Type inference failed for: r10v24, types: [org.telegram.ui.cv, v4.b0] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r15v10, types: [org.telegram.ui.Components.pj0, org.telegram.ui.sw] */
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
        an anVar;
        mw mwVar;
        lw lwVar;
        lw lwVar2;
        org.telegram.ui.Components.pr prVar;
        uw uwVar;
        v4.y yVar;
        jg.n nVar;
        jg.n nVar2;
        jg.n nVar3;
        jg.n nVar4;
        jg.n nVar5;
        jg.n nVar6;
        qw qwVar;
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
        this.j2 = false;
        this.k2 = false;
        this.V = false;
        this.V0 = null;
        this.z0 = null;
        ArrayList arrayList = this.I2;
        arrayList.clear();
        this.l3 = ViewConfiguration.get(context2).getScaledMaximumFlingVelocity();
        org.telegram.messenger.g0.h3(new bu(context2, 0));
        this.N1 = null;
        this.L1 = null;
        this.M1 = null;
        this.Q1 = null;
        this.J1 = null;
        org.telegram.ui.ActionBar.y q10 = this.actionBar.q();
        q10.setTranslationX(-org.telegram.messenger.g0.L(5.0f));
        org.telegram.ui.ActionBar.r0 a10 = q10.a(0, R.drawable.outline_header_search);
        a10.N();
        this.j0 = a10;
        int i12 = 3;
        a10.setOnClickListener(new eu(this, i12));
        int i13 = 8;
        int i14 = 2;
        if (this.R0 == 2 || (q4() && d4(this.currentAccount, this.R0, this.W2, false).isEmpty())) {
            this.j0.setVisibility(8);
        }
        this.j0.setVisibility(8);
        ?? r52 = 1;
        ?? r53 = 1;
        if (!this.l2 && this.n2 == null && this.W2 == 0 && this.Y2 == 0) {
            int i15 = org.telegram.ui.ActionBar.k6.t8;
            int themedColor = getThemedColor(i15);
            int i16 = org.telegram.ui.ActionBar.k6.v8;
            org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(context2, themedColor, getThemedColor(i16));
            this.m0 = r0Var;
            r0Var.setText(org.telegram.messenger.id.L0(2131751355).toUpperCase());
            if (this.m0.getTextView() != null) {
                org.telegram.ui.ActionBar.r6.V(this.m0.getTextView(), i16, getResourceProvider());
            }
            org.telegram.ui.ActionBar.r0 r0Var2 = this.m0;
            org.telegram.ui.ActionBar.r6.R(r0Var2, r0Var2.getBackground(), null, org.telegram.ui.ActionBar.r6.N(i15), getResourceProvider());
            this.actionBar.addView(this.m0, c8.ha.d(-2, -2.0f, 53, 0.0f, 0.0f, 10.0f, 0.0f));
            this.m0.setOnClickListener(new eu(this, i13));
            this.m0.setAlpha(0.0f);
            this.m0.setVisibility(8);
            this.n0 = new org.telegram.ui.Components.ig0(context2);
            org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(context2, this.resourceProvider, false, true);
            this.o0 = z0Var;
            z0Var.setItemHeight(56);
            this.o0.j(org.telegram.messenger.id.L0(2131748606), 0, this.n0);
            this.o0.setContentDescription(org.telegram.messenger.id.L0(2131746602));
            org.telegram.ui.ActionBar.r0 a11 = q10.a(1, R.drawable.outline_header_lock_24);
            this.f0 = a11;
            a11.setContentDescription(org.telegram.messenger.id.L0(2131754813));
            org.telegram.ui.ActionBar.r0 d = q10.d(3, new ColorDrawable(0));
            this.g0 = d;
            yw ywVar = new yw(context2, this.currentAccount);
            this.h0 = ywVar;
            d.addView(ywVar);
            this.g0.setContentDescription(org.telegram.messenger.id.L0(2131751344));
            this.g0.setVisibility(8);
            m5(false, false);
        }
        lw lwVar3 = new lw(context2, this.resourceProvider);
        this.X = lwVar3;
        lwVar3.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        this.X.setPivotX(0.0f);
        this.X.setPivotY(0.0f);
        int i17 = 9;
        if (this.R0 == 0) {
            org.telegram.ui.ActionBar.r0 a12 = q10.a(-47, R.drawable.avd_speed);
            this.l0 = a12;
            org.telegram.messenger.g0.E2(a12);
            this.l0.setOnClickListener(new eu(this, i17));
            this.X.a(this.l0);
            this.X.updateColors();
        }
        this.X.setCloseButtonOnClickListener(new cu(this, 16));
        this.X.r.setOnFocusChangeListener(new fd(this, r53 == true ? 1 : 0));
        ah.i iVar = this.X.r;
        int i18 = 11;
        bg.p0 p0Var = new bg.p0(iVar, new kg.v1(this, i18));
        this.Y = p0Var;
        iVar.addTextChangedListener(p0Var);
        this.X.setSearchFiltersListener(new dv(this));
        this.Y.a();
        int i19 = 10;
        if (this.R0 == 0) {
            org.telegram.ui.ActionBar.r0 a13 = q10.a(4, R.drawable.ic_ab_other);
            this.k0 = a13;
            a13.setContentDescription(org.telegram.messenger.id.L0(2131754839));
            this.k0.setOnClickListener(new eu(this, i19));
            this.k0.setOnLongClickListener(new qu(this, i12));
        }
        this.j0.setSearchFieldHint(org.telegram.messenger.id.L0(2131745839));
        this.j0.setContentDescription(org.telegram.messenger.id.L0(2131745839));
        if (this.l2) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            int i20 = this.R0;
            if (i20 == 16) {
                this.actionBar.setTitle(org.telegram.messenger.id.L0(2131753100));
            } else if (this.N0) {
                this.actionBar.setTitle(org.telegram.messenger.id.L0(2131746255));
            } else if (this.O0) {
                this.actionBar.setTitle(org.telegram.messenger.id.L0(2131746430));
            } else if (i20 == 3 && this.f2 == null) {
                this.actionBar.setTitle(org.telegram.messenger.id.L0(2131750576));
            } else if (i20 == 10) {
                this.actionBar.setTitle(org.telegram.messenger.id.L0(2131745671));
            } else if (i20 == 14) {
                boolean z9 = this.A2;
                if (!z9 || this.z2 || this.v2 || this.y2) {
                    boolean z10 = this.z2;
                    if (!z10 || z9 || this.v2 || this.y2) {
                        boolean z11 = this.v2;
                        if (!z11 || z10 || z9) {
                            i11 = 2131745672;
                        } else {
                            i11 = 2131745672;
                            if (!this.y2) {
                                this.actionBar.setTitle(org.telegram.messenger.id.L0(2131752125));
                            }
                        }
                        if (!this.y2 || z10 || z9 || z11) {
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
                    this.actionBar.setTitle(org.telegram.messenger.id.L0(2131745672));
                }
            }
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.actionBar, getResourceProvider());
        } else {
            if (this.n2 != null || this.W2 != 0 || this.Y2 != 0) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
                this.e1 = y1Var;
                kVar.setBackButtonDrawable(y1Var);
            }
            if (this.W2 != 0) {
                this.actionBar.setTitle(org.telegram.messenger.id.L0(2131754136));
            } else if (this.Y2 != 0) {
                this.actionBar.setTitle(org.telegram.messenger.m5.m(this.Z2));
                this.actionBar.setAdditionalTextLeft(org.telegram.messenger.g0.L(28.0f));
                this.c3 = new org.telegram.ui.Components.w8(this.Z2);
                org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(getContext());
                this.b3 = l9Var;
                l9Var.setRoundRadius(org.telegram.messenger.g0.L(11.0f));
                this.b3.e(this.Z2, this.c3);
                this.actionBar.addView(this.b3, c8.ha.d(32, 32.0f, 83, 58.0f, 0.0f, 0.0f, 12.0f));
            } else {
                org.telegram.ui.Components.g5 g5Var = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(26.0f), null);
                this.D3 = g5Var;
                g5Var.a = true;
                Drawable h = jg.g.h(context2, R.drawable.telegram_logo_2);
                this.C3 = h;
                h.setBounds(0, org.telegram.messenger.g0.L(2.0f), this.C3.getIntrinsicWidth(), this.C3.getIntrinsicHeight() + org.telegram.messenger.g0.L(2.0f));
                Drawable drawable = this.C3;
                int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.Ul);
                this.v4 = themedColor2;
                drawable.setColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.id.L0(R.string.AppName));
                spannableStringBuilder.setSpan(new ImageSpan(this.C3), 0, spannableStringBuilder.length(), 33);
                this.actionBar.J(spannableStringBuilder, this.D3);
                r5(org.telegram.messenger.p10.i(this.currentAccount).f(), false);
            }
            if (this.W2 == 0) {
                this.actionBar.setSupportsHolidayImage(true);
            }
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        int i21 = 17;
        this.actionBar.setTitleActionRunnable(new cu(this, i21));
        int i22 = this.R0;
        if (((i22 == 0 && !this.l2) || i22 == 3) && this.W2 == 0 && this.Y2 == 0 && TextUtils.isEmpty(this.n2)) {
            mw mwVar2 = new mw(this, context2, this.resourceProvider);
            this.z0 = mwVar2;
            mwVar2.setVisibility(8);
            this.x = false;
            this.r.a(false, false);
            this.z0.setDelegate(new nw(context2, this));
        }
        if (this.r2 && org.telegram.messenger.p10.c() > 1) {
            this.D1 = q10.g(11, 0, org.telegram.messenger.g0.L(56.0f));
            org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8();
            w8Var.u(org.telegram.messenger.g0.L(12.0f));
            org.telegram.ui.Components.l9 l9Var2 = new org.telegram.ui.Components.l9(context2);
            l9Var2.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
            this.D1.addView(l9Var2, c8.ha.e(36, 36, 17));
            this.D1.setOnClickListener(new eu(this, i18));
            this.D1.setOnLongClickListener(new qu(this, i14));
            TLRPC.User f13 = getUserConfig().f();
            w8Var.r(f13);
            ImageReceiver imageReceiver = l9Var2.getImageReceiver();
            int i23 = this.currentAccount;
            imageReceiver.d = i23;
            l9Var2.m(org.telegram.messenger.hc.m(i23, 1, f13), "50_50", org.telegram.messenger.hc.n(f13), "50_50", (f13 == null || (userProfilePhoto = f13.photo) == null || (r92 = userProfilePhoto.strippedBitmap) == null) ? w8Var : r92, f13);
        }
        this.actionBar.setActionBarMenuOnItemClick(new w9(this, 27));
        pw pwVar = new pw(context2, this);
        this.fragmentView = pwVar;
        this.r4 = new uu(this, pwVar, new PointF(), r114 == true ? 1 : 0);
        int i24 = (this.W2 == 0 && this.Y2 == 0 && (((i10 = this.R0) == 0 && !this.l2) || i10 == 3)) ? 2 : 1;
        this.e0 = new vw[i24];
        int i25 = 0;
        while (i25 < i24) {
            vw vwVar = new vw(context2, this);
            pwVar.addView(vwVar, c8.ha.c(-1.0f, -1));
            vwVar.s = this.R0;
            this.e0[i25] = vwVar;
            vwVar.x = new org.telegram.ui.Components.mz(context2);
            vwVar.x.setViewType(7);
            vwVar.x.setVisibility(8);
            vwVar.addView(vwVar.x, c8.ha.e(-2, -2, i21));
            sw swVar = new sw(this, context2, vwVar);
            vwVar.a = swVar;
            this.glassEngine.b(swVar);
            ?? r15 = vwVar.a;
            vwVar.b = new a8.wa((org.telegram.ui.Components.pj0) r15);
            r15.setAllowStopHeaveOperations(r52);
            vwVar.a.setAccessibilityEnabled(false);
            vwVar.a.o1(0, r52);
            vwVar.a.setClipToPadding(false);
            vwVar.a.setPivotY(0.0f);
            if (this.R0 == 15) {
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, vwVar.a, getResourceProvider());
            }
            vwVar.y = new av(vwVar.a, vwVar);
            vwVar.a.setVerticalScrollBarEnabled(r52);
            vwVar.a.setInstantClick(r52);
            vwVar.c = new cv(this, vwVar);
            vwVar.c.j1(r52);
            vwVar.a.setLayoutManager(vwVar.c);
            vwVar.a.setVerticalScrollbarPosition(org.telegram.messenger.id.a0 ? r52 : 2);
            vwVar.addView(vwVar.a, c8.ha.c(-1.0f, -1));
            vwVar.a.setOnItemClickListener(new pu(r52, this, vwVar));
            vwVar.a.setOnItemLongClickListener(new m4.d0(this, vwVar, r113 == true ? 1 : 0));
            vwVar.f = new uw(this, vwVar);
            vwVar.D = new org.telegram.ui.Components.si0(vwVar.a, false);
            uwVar = vwVar.f;
            vwVar.e = new v4.y(uwVar);
            yVar = vwVar.e;
            yVar.h(vwVar.a);
            vwVar.a.setOnScrollListener(new ev(this, vwVar, pwVar));
            vwVar.w = org.telegram.messenger.iz.q1 ? 2 : 0;
            if (vwVar.n == null && this.W2 == 0 && this.Y2 == 0) {
                vwVar.n = new fv(org.telegram.messenger.id.L0(2131754720), org.telegram.messenger.id.L0(2131754722), vwVar);
                if (l4()) {
                    vwVar.n.h();
                } else {
                    vwVar.n.b();
                }
                fv fvVar = vwVar.n;
                i7 = vwVar.w;
                fvVar.g(i7 != 0);
            }
            pw pwVar2 = pwVar;
            int i26 = i25;
            int i27 = i24;
            context2 = context;
            vwVar.d = new gv(this, this, context, vwVar.s, this.W2, this.l2, arrayList, this.currentAccount, this.G, vwVar);
            nVar = vwVar.d;
            nVar.S(vwVar.a);
            nVar2 = vwVar.d;
            nVar2.Q(this.t2);
            if (vwVar.s == 3) {
                nVar6 = vwVar.d;
                nVar6.N(getMessagesController().W4() && (qwVar = this.C2) != null && qwVar.G());
            }
            if (org.telegram.messenger.g0.Q1()) {
                org.telegram.messenger.xr xrVar = this.p2;
                if (xrVar.a != 0) {
                    nVar5 = vwVar.d;
                    nVar5.R(xrVar.a);
                }
            }
            nVar3 = vwVar.d;
            nVar3.O(vwVar.n);
            sw swVar2 = vwVar.a;
            nVar4 = vwVar.d;
            swVar2.setAdapter(nVar4);
            vwVar.a.setEmptyView((this.W2 == 0 && this.Y2 == 0) ? vwVar.x : null);
            vwVar.r = new org.telegram.ui.Components.ri0(vwVar.a, vwVar.c);
            org.telegram.ui.Components.ri0 ri0Var = vwVar.r;
            ri0Var.c = true;
            ri0Var.d = true;
            ri0Var.h = new fu(this, 13);
            if (i26 != 0) {
                this.e0[i26].setVisibility(8);
            }
            i25 = i26 + 1;
            r52 = 1;
            pwVar = pwVar2;
            i24 = i27;
            i21 = 17;
        }
        pw pwVar3 = pwVar;
        int i28 = r52;
        org.telegram.ui.Components.or orVar = new org.telegram.ui.Components.or(context2);
        this.K1 = orVar;
        int i29 = org.telegram.ui.ActionBar.k6.d6;
        orVar.setColor(org.telegram.ui.ActionBar.k6.v0(i29));
        pwVar3.addView(this.K1, c8.ha.e(-1, 100, 48));
        this.B0 = pwVar3.getChildCount();
        cz0 cz0Var = new cz0((Activity) getContext());
        this.Z = cz0Var;
        pwVar3.addView(cz0Var, c8.ha.d(-1, 50.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
        cz0 cz0Var2 = this.Z;
        gh.e o4 = c8.g0.o(this.resourceProvider);
        dh.c cVar = this.p4;
        fh.g b10 = cVar.b(cz0Var2, o4);
        org.telegram.messenger.camera.q.p(b10, org.telegram.messenger.g0.L(18.0f), 6.666f);
        this.Z.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f));
        this.Z.setBlurredBackground(b10);
        jg.q0 q0Var = new jg.q0(getParentActivity(), null);
        this.b0 = q0Var;
        q0Var.setPadding(0, org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f));
        jg.q0 q0Var2 = this.b0;
        q0Var2.h3 = false;
        q0Var2.setOnItemClickListener(new ku(this, i28));
        this.Z.addView(this.b0, c8.ha.e(-1, -1, 48));
        org.telegram.ui.Components.q00 q00Var = new org.telegram.ui.Components.q00(context2, this.resourceProvider, i28);
        this.u0 = q00Var;
        q00Var.setContentDescription(org.telegram.messenger.id.L0(2131744561));
        this.u0.setImageResource(R.drawable.outline_fab_story_24);
        this.u0.setOnClickListener(new eu(this, 27));
        pwVar3.addView(this.u0, org.telegram.ui.Components.q00.c());
        org.telegram.ui.Components.q00 q00Var2 = new org.telegram.ui.Components.q00(context2, this.resourceProvider);
        this.t0 = q00Var2;
        pwVar3.addView(q00Var2, org.telegram.ui.Components.q00.b());
        this.t0.setOnClickListener(new eu(this, 28));
        if (!q4() && this.R0 == 0 && org.telegram.messenger.qp.s1(this.currentAccount).t1().getBoolean("storyhint", i28)) {
            fi.m3 m3Var = new fi.m3(context2, 2);
            m3Var.s(8.0f);
            m3Var.d = 8000L;
            m3Var.k(i28);
            m3Var.h = org.telegram.messenger.g0.L(165.0f);
            m3Var.r(i28);
            f10 = 8.0f;
            m3Var.u(org.telegram.messenger.g0.K2(org.telegram.messenger.id.L0(2131744715), fi.va.m(context2), "%s"));
            m3Var.o(1.0f, -40.0f);
            m3Var.j(getThemedColor(org.telegram.ui.ActionBar.k6.tj));
            m3Var.q0 = new zu(this, 2);
            this.p0 = m3Var;
            pwVar3.addView(m3Var, c8.ha.d(-1, 160.0f, 87, 0.0f, 0.0f, 80.0f, 0.0f));
        } else {
            f10 = 8.0f;
        }
        s5();
        this.a0 = null;
        int i30 = 5;
        if (this.l2 || this.R0 != 0) {
            f11 = 72.0f;
            if (this.R0 == 3 || U3()) {
                jh.f fVar = new jh.f(context2);
                this.y1 = fVar;
                fVar.setClipChildren(false);
                jh.f fVar2 = this.y1;
                rh.h hVar = this.w;
                fVar2.setWindowInsetsProvider(hVar);
                jh.f fVar3 = this.y1;
                fVar3.setInputIslandBubbleDrawable(cVar.b(fVar3, c8.g0.o(this.resourceProvider)));
                jh.f fVar4 = this.y1;
                fVar4.setUnderKeyboardBackgroundDrawable(this.n4.b(fVar4, c8.g0.o(this.resourceProvider)));
                dh.d dVar = new dh.d(this.q4.b(this.y1, null));
                if (!org.telegram.messenger.iz.f() || org.telegram.messenger.sc.e(262144)) {
                    dVar.b(org.telegram.messenger.g0.L(72.0f), i28);
                }
                this.y1.setBackgroundWithFadeDrawable(dVar);
                FrameLayout inputIslandBubbleContainer = this.y1.getInputIslandBubbleContainer();
                this.z1 = inputIslandBubbleContainer;
                inputIslandBubbleContainer.setClipChildren(false);
                this.A1 = this.y1.getInAppKeyboardBubbleContainer();
                jv jvVar = this.B1;
                if (jvVar != null) {
                    jvVar.B0();
                }
                jv jvVar2 = new jv(this, getParentActivity(), pwVar3);
                this.B1 = jvVar2;
                jvVar2.setInAppInsetsController(hVar);
                this.B1.y4 = false;
                pwVar3.setClipChildren(false);
                pwVar3.setClipToPadding(false);
                jv jvVar3 = this.B1;
                jvVar3.x4 = false;
                jvVar3.i2 = (org.telegram.messenger.g0.E || ((anVar = jvVar3.P2) != null && anVar.isInBubbleMode())) ? false : i28;
                this.B1.U0(false, false, false);
                this.B1.f1(i28, false);
                this.B1.z1.setPadding(0, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(20.0f), 0);
                f12 = 0.0f;
                this.B1.getSendButton().setAlpha(0.0f);
                this.B1.setViewParentForEmoji(this.A1);
                this.z1.addView(this.B1, c8.ha.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
                pwVar3.addView(this.y1.getFadeView(), c8.ha.c(-1.0f, -1));
                pwVar3.addView(this.y1, c8.ha.c(-1.0f, -1));
                if (m4() || this.E2 != null || this.F2 != null) {
                    v3(this.U3);
                    this.U3 = null;
                }
                this.B1.setDelegate(new dv(this));
                li.w1 w1Var = new li.w1(this, context2, this.resourceProvider);
                this.C1 = w1Var;
                int L = org.telegram.messenger.g0.L(52.0f);
                int L2 = org.telegram.messenger.g0.L(38.0f);
                w1Var.I = L;
                w1Var.J = L2;
                li.w1 w1Var2 = this.C1;
                float L3 = org.telegram.messenger.g0.L(7.0f);
                float L4 = org.telegram.messenger.g0.L(f10);
                w1Var2.M = L3;
                w1Var2.N = L4;
                li.w1 w1Var3 = this.C1;
                w1Var3.h0 = i28;
                pwVar3.addView(w1Var3, c8.ha.e(org.telegram.messenger.qs.v1, 50, 85));
                this.C1.setScrimViewBackgroundColor(getThemedColor(i29));
                this.C1.setOnClickListener(new eu(this, i30));
                this.C1.setOnLongClickListener(new qu(this, r11 == true ? 1 : 0));
                this.C1.setVisibility(8);
                this.C1.setScaleX(0.2f);
                this.C1.setScaleY(0.2f);
                this.C1.setAlpha(0.0f);
                float L5 = org.telegram.messenger.g0.L(12.0f);
                TextPaint textPaint = this.E1;
                textPaint.setTextSize(L5);
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                mwVar = this.z0;
                if (mwVar != null) {
                    fh.g b11 = cVar.b(mwVar, c8.g0.o(this.resourceProvider));
                    org.telegram.messenger.camera.q.p(b11, org.telegram.messenger.g0.L(18.0f), 6.666f);
                    this.z0.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f));
                    this.z0.setBlurredBackground(b11);
                    pwVar3.addView(this.z0, c8.ha.d(-1, 50.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
                }
                lwVar = this.X;
                if (lwVar != null) {
                    lwVar.setupBlurredBackground(cVar.b(lwVar, c8.g0.o(this.resourceProvider)));
                }
                pv pvVar = new pv(this, context2, this, this.currentAccount, q4() ? 1 : 0);
                this.E0 = pvVar;
                pvVar.setActionBar(this.actionBar);
                this.E0.setMenuItemsOffset(!q4() ? org.telegram.messenger.g0.L(68.0f) : org.telegram.messenger.g0.N(16.66f));
                pv pvVar2 = this.E0;
                pvVar2.l0 = false;
                pvVar2.setVisibility(8);
                this.M = false;
                this.L = false;
                this.K = false;
                if (this.l2 && this.R0 == 3) {
                    org.telegram.messenger.qp.s1(this.currentAccount).J1();
                }
                pwVar3.addView(this.actionBar, c8.ha.c(-2.0f, -1));
                if (!this.l2) {
                    org.telegram.ui.Cells.o oVar = new org.telegram.ui.Cells.o(context2);
                    this.E3 = oVar;
                    pwVar3.addView(oVar, c8.ha.e(20, 20, 51));
                }
                lwVar2 = this.X;
                if (lwVar2 != null) {
                    pwVar3.addView(lwVar2, c8.ha.d(-1, 48.0f, 48, 7.0f, -2.0f, 7.0f, 0.0f));
                }
                this.x0 = pwVar3.getChildCount();
                UndoView[] undoViewArr = this.y0;
                undoViewArr[0] = null;
                undoViewArr[i28] = null;
                if (this.W) {
                    this.actionBar.getTitlesContainer().setTranslationX(org.telegram.messenger.g0.L(4.0f));
                    org.telegram.ui.ActionBar.r6.d(this.actionBar, org.telegram.ui.ActionBar.k6.Ul, getResourceProvider());
                }
                if (this.W2 == 0 || this.Y2 != 0) {
                    this.e0[0].a.setGlowColor(getThemedColor(i29));
                    org.telegram.ui.ActionBar.r6.b(this.actionBar, org.telegram.ui.ActionBar.k6.O8, getResourceProvider(), false);
                    org.telegram.ui.ActionBar.r6.a(this.actionBar, org.telegram.ui.ActionBar.k6.N8, getResourceProvider(), false);
                    this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.k6.Q8), false);
                    this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.k6.R8), i28);
                }
                if (!this.l2 && this.R0 == 0) {
                    bi.ec ecVar = new bi.ec(29, context2, this);
                    this.K0 = ecVar;
                    ecVar.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i29), 100)));
                    this.K0.setFocusable(false);
                    this.K0.setImportantForAccessibility(2);
                    this.K0.setOnClickListener(new eu(this, 7));
                    this.K0.setVisibility(8);
                    pwVar3.addView(this.K0, c8.ha.c(-1.0f, -1));
                }
                this.f1.setColor(getThemedColor(i29));
                this.q3 = false;
                if (this.n2 == null) {
                    a5(i28, false, false, false);
                    this.X.r.setText(this.n2);
                    this.X.r.setSelection(this.n2.length());
                } else if (this.o2 != null) {
                    a5(i28, false, false, i28);
                    this.Y.b(i28);
                    this.X.r.setText(this.o2);
                    this.X.r.setSelection(this.o2.length());
                    this.o2 = null;
                    lw lwVar4 = this.X;
                    if (lwVar4 != null) {
                        lwVar4.setTranslationY(i4() + (-org.telegram.messenger.g0.L(36.0f)));
                    }
                } else {
                    a5(false, false, false, false);
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    FilesMigrationService.a(this);
                }
                this.actionBar.setDrawBlurBackground(pwVar3);
                this.F3 = new sv(this, context2, pwVar3, context2);
                i5(i28, false);
                this.F3.setOpenProgress(f12);
                pwVar3.addView(this.E0, c8.ha.c(81.0f, -1));
                pwVar3.addView(this.F3, c8.ha.c(-1.0f, -1));
                this.F0 = new org.telegram.ui.Components.nr(context2);
                prVar = this.J1;
                if (prVar != null) {
                    pwVar3.addView(prVar, c8.ha.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
                }
                if (this.Y2 != 0 && this.R0 != 3 && org.telegram.messenger.t3.c(this.Z2)) {
                    org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.filled_add_album);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("+ ");
                    spannableStringBuilder2.append((CharSequence) org.telegram.messenger.id.L0(2131751989));
                    spannableStringBuilder2.setSpan(wpVar, 0, i28, 33);
                    fi.d dVar2 = new fi.d(context2, this.resourceProvider);
                    this.v0 = dVar2;
                    dVar2.f();
                    this.v0.setText(spannableStringBuilder2);
                    this.v0.setOnClickListener(new org.telegram.ui.Components.t41(10, this, new org.telegram.ui.ActionBar.u1[i28]));
                    lh.f fVar5 = new lh.f(getContext());
                    this.w0 = fVar5;
                    fVar5.setupColorKey(org.telegram.ui.ActionBar.k6.a7);
                    this.w0.setFadeZoneBottom(org.telegram.messenger.g0.L(f11) + org.telegram.messenger.g0.n);
                    this.w0.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
                    pwVar3.addView(this.w0, c8.ha.g());
                    pwVar3.addView(this.v0, c8.ha.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.n));
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
                qVar.a = new fu(this, 8);
                qVar.d = new qi.b(org.telegram.messenger.g0.L(48.0f));
                r0.i0.l(this.fragmentView, new fu(this, 9));
                return this.fragmentView;
            }
        } else {
            org.telegram.ui.Components.pr prVar2 = new org.telegram.ui.Components.pr(context2);
            this.J1 = prVar2;
            int i31 = 11;
            prVar2.setOnAnimatedHeightChangedListener(new zu(this, i31));
            fh.g a14 = cVar.a(this.J1);
            a14.p(c8.g0.o(this.resourceProvider));
            a14.q(org.telegram.messenger.g0.L(7.0f));
            f11 = 72.0f;
            this.J1.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f));
            this.J1.setBlurredBackground(a14);
            this.J1.setDefaultRadiusDp(this.Y2 != 0 ? 18 : 24);
            FrameLayout frameLayout = new FrameLayout(context2);
            this.G1 = frameLayout;
            this.J1.addView(frameLayout);
            this.J1.h(5, this.G1);
            this.J1.g(this.G1);
            this.J1.i(this.G1, i28, false);
            FrameLayout frameLayout2 = new FrameLayout(context2);
            this.I1 = frameLayout2;
            this.J1.addView(frameLayout2);
            int i32 = 4;
            this.J1.h(4, this.I1);
            this.J1.g(this.I1);
            this.J1.i(this.I1, i28, false);
            hv hvVar = new hv(this, context2, this, 0);
            this.F1 = hvVar;
            this.G1.addView(hvVar);
            hv hvVar2 = new hv(this, context2, this, i28);
            this.H1 = hvVar2;
            this.I1.addView(hvVar2);
            this.J1.setCallFragmentContextView(this.H1);
            org.telegram.ui.Cells.b3 b3Var = new org.telegram.ui.Cells.b3(context2);
            this.M1 = b3Var;
            b3Var.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
            g5();
            y6.m0(new hu(this, r112 == true ? 1 : 0));
            y6.r0(new a5(this, i31));
            this.J1.addView(this.M1);
            if (this.Y2 != 0) {
                ji.j jVar = new ji.j(context2, this.resourceProvider, i28);
                this.Q1 = jVar;
                jVar.a(-14899731, -15497247, R.drawable.filled_requests_24, org.telegram.messenger.id.L0(2131751895), null, false);
                this.Q1.setUnreadMode(i28);
                this.Q1.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
                this.Q1.setOnClickListener(new eu(this, i32));
                this.J1.addView(this.Q1);
                B3(false);
            }
        }
        f12 = 0.0f;
        mwVar = this.z0;
        if (mwVar != null) {
        }
        lwVar = this.X;
        if (lwVar != null) {
        }
        pv pvVar3 = new pv(this, context2, this, this.currentAccount, q4() ? 1 : 0);
        this.E0 = pvVar3;
        pvVar3.setActionBar(this.actionBar);
        this.E0.setMenuItemsOffset(!q4() ? org.telegram.messenger.g0.L(68.0f) : org.telegram.messenger.g0.N(16.66f));
        pv pvVar22 = this.E0;
        pvVar22.l0 = false;
        pvVar22.setVisibility(8);
        this.M = false;
        this.L = false;
        this.K = false;
        if (this.l2) {
            org.telegram.messenger.qp.s1(this.currentAccount).J1();
        }
        pwVar3.addView(this.actionBar, c8.ha.c(-2.0f, -1));
        if (!this.l2) {
        }
        lwVar2 = this.X;
        if (lwVar2 != null) {
        }
        this.x0 = pwVar3.getChildCount();
        UndoView[] undoViewArr2 = this.y0;
        undoViewArr2[0] = null;
        undoViewArr2[i28] = null;
        if (this.W) {
        }
        if (this.W2 == 0) {
        }
        this.e0[0].a.setGlowColor(getThemedColor(i29));
        org.telegram.ui.ActionBar.r6.b(this.actionBar, org.telegram.ui.ActionBar.k6.O8, getResourceProvider(), false);
        org.telegram.ui.ActionBar.r6.a(this.actionBar, org.telegram.ui.ActionBar.k6.N8, getResourceProvider(), false);
        this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.k6.Q8), false);
        this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.k6.R8), i28);
        if (!this.l2) {
            bi.ec ecVar2 = new bi.ec(29, context2, this);
            this.K0 = ecVar2;
            ecVar2.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i29), 100)));
            this.K0.setFocusable(false);
            this.K0.setImportantForAccessibility(2);
            this.K0.setOnClickListener(new eu(this, 7));
            this.K0.setVisibility(8);
            pwVar3.addView(this.K0, c8.ha.c(-1.0f, -1));
        }
        this.f1.setColor(getThemedColor(i29));
        this.q3 = false;
        if (this.n2 == null) {
        }
        if (Build.VERSION.SDK_INT >= 30) {
        }
        this.actionBar.setDrawBlurBackground(pwVar3);
        this.F3 = new sv(this, context2, pwVar3, context2);
        i5(i28, false);
        this.F3.setOpenProgress(f12);
        pwVar3.addView(this.E0, c8.ha.c(81.0f, -1));
        pwVar3.addView(this.F3, c8.ha.c(-1.0f, -1));
        this.F0 = new org.telegram.ui.Components.nr(context2);
        prVar = this.J1;
        if (prVar != null) {
        }
        if (this.Y2 != 0) {
            org.telegram.ui.Components.wp wpVar2 = new org.telegram.ui.Components.wp(R.drawable.filled_add_album);
            SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder("+ ");
            spannableStringBuilder22.append((CharSequence) org.telegram.messenger.id.L0(2131751989));
            spannableStringBuilder22.setSpan(wpVar2, 0, i28, 33);
            fi.d dVar22 = new fi.d(context2, this.resourceProvider);
            this.v0 = dVar22;
            dVar22.f();
            this.v0.setText(spannableStringBuilder22);
            this.v0.setOnClickListener(new org.telegram.ui.Components.t41(10, this, new org.telegram.ui.ActionBar.u1[i28]));
            lh.f fVar52 = new lh.f(getContext());
            this.w0 = fVar52;
            fVar52.setupColorKey(org.telegram.ui.ActionBar.k6.a7);
            this.w0.setFadeZoneBottom(org.telegram.messenger.g0.L(f11) + org.telegram.messenger.g0.n);
            this.w0.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
            pwVar3.addView(this.w0, c8.ha.g());
            pwVar3.addView(this.v0, c8.ha.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.n));
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
        qVar2.a = new fu(this, 8);
        qVar2.d = new qi.b(org.telegram.messenger.g0.L(48.0f));
        r0.i0.l(this.fragmentView, new fu(this, 9));
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
        if (z9 && (arrayList = this.R1) != null) {
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
            if (arrayList5.size() > 0 && this.y2) {
                arrayList8.add(new rw(0));
                arrayList8.addAll(arrayList5);
            }
            if (arrayList4.size() > 0 && this.v2) {
                arrayList8.add(new rw(1));
                arrayList8.addAll(arrayList4);
            }
            if (arrayList7.size() > 0) {
                int size = arrayList7.size();
                for (int i12 = 0; i12 < size; i12++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList7.get(i12);
                    if ((this.y2 && org.telegram.messenger.t3.U(i7, -dialog.id)) || (this.v2 && (org.telegram.messenger.t3.m0(i7, -dialog.id) || !org.telegram.messenger.t3.S(i7, -dialog.id)))) {
                        if (r9) {
                            arrayList8.add(new rw(2));
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
            return voVar == null ? s12.W0(i11) : this.R0 == 3 ? voVar.l : voVar.k;
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
        ArrayList arrayList10 = this.S3;
        if (arrayList10 != null) {
            return arrayList10;
        }
        this.S3 = new ArrayList();
        r9 = i10 == 16;
        if (this.z2 || this.A2 || r9) {
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
                            if (this.A2) {
                                if (org.telegram.messenger.t10.B(a23)) {
                                }
                            }
                        } else if (this.z2) {
                            if (org.telegram.messenger.t10.B(a23)) {
                            }
                        }
                        this.S3.add(dialog4);
                    } else if (!org.telegram.messenger.t10.A(a23.id) && !org.telegram.messenger.qp.F2(a23)) {
                        this.S3.add(dialog4);
                    }
                }
            }
        }
        if (this.v2 || (((z10 = this.x2) && this.w2) || r9)) {
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
                            this.S3.add(dialog5);
                        }
                    } else if (s12.y(dialog5)) {
                        this.S3.add(dialog5);
                    }
                }
            }
        } else if (z10 || this.w2 || r9) {
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
                            this.S3.add(dialog6);
                        }
                    } else if (s12.y(dialog6)) {
                        if (this.x2) {
                            if (!org.telegram.messenger.t3.n0(M02)) {
                                this.S3.add(dialog6);
                            }
                        }
                        if (this.w2 && org.telegram.messenger.t3.n0(M02)) {
                            this.S3.add(dialog6);
                        }
                    }
                }
            }
        }
        if (this.y2 || r9) {
            int size7 = arrayList3.size();
            while (r8 < size7) {
                Object obj6 = arrayList3.get(r8);
                r8++;
                TLRPC.Dialog dialog7 = (TLRPC.Dialog) obj6;
                TLRPC.Chat M03 = s12.M0(Long.valueOf(-dialog7.id));
                if (r9) {
                    if (M03 instanceof TLRPC.TL_channel) {
                        this.S3.add(dialog7);
                    }
                } else if (s12.y(dialog7)) {
                    this.S3.add(dialog7);
                }
            }
        }
        org.telegram.messenger.qp messagesController = getMessagesController();
        ArrayList arrayList11 = this.S3;
        if (arrayList11 == null) {
            messagesController.getClass();
        } else {
            Collections.sort(arrayList11, messagesController.E7);
        }
        return this.S3;
    }

    public final void d5(boolean z9) {
        vw[] vwVarArr;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            vwVarArr = this.e0;
            if (i10 >= vwVarArr.length) {
                break;
            }
            vwVarArr[i10].a.C0();
            i10++;
        }
        char c10 = (!z9 || vwVarArr.length <= 1) ? (char) 0 : (char) 1;
        int i11 = vwVarArr[c10].h;
        if (i11 < 0 || i11 >= getMessagesController().T0().size()) {
            return;
        }
        org.telegram.messenger.vo voVar = (org.telegram.messenger.vo) getMessagesController().T0().get(this.e0[c10].h);
        if (voVar.e()) {
            vw vwVar = this.e0[c10];
            vwVar.s = this.R0;
            sw swVar = vwVar.a;
            int i12 = sw.B3;
            swVar.D1();
        } else {
            vw[] vwVarArr2 = this.e0;
            if (vwVarArr2[c10 ^ 1].s == 7) {
                vwVarArr2[c10].s = 8;
            } else {
                vwVarArr2[c10].s = 7;
            }
            vwVarArr2[c10].a.setScrollEnabled(true);
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
        vw[] vwVarArr3 = this.e0;
        if (vwVarArr3.length > 1) {
            vwVarArr3[1].E = voVar.p;
        }
        vw vwVar2 = vwVarArr3[c10];
        gv gvVar = vwVar2.d;
        gvVar.h = vwVar2.s;
        gvVar.f();
        vw vwVar3 = this.e0[c10];
        cv cvVar = vwVar3.c;
        if (vwVar3.s == 0 && l4() && this.e0[c10].w == 2) {
            i7 = 1;
        }
        cvVar.h1(i7, (int) this.N);
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
            if (this.e0 == null || this.S1) {
                return;
            }
            int i16 = 0;
            while (true) {
                vw[] vwVarArr = this.e0;
                if (i16 >= vwVarArr.length) {
                    break;
                }
                vw vwVar = vwVarArr[i16];
                int i17 = vwVarArr[0].s;
                org.telegram.messenger.vo voVar2 = (i17 == 7 || i17 == 8) ? getMessagesController().M[this.e0[0].s == 8 ? (char) 1 : (char) 0] : null;
                if (voVar2 != null) {
                    int i18 = voVar2.g;
                    int i19 = org.telegram.messenger.qp.C8;
                    if ((i18 & 64) != 0) {
                        z11 = true;
                        if (this.z3 || !z11) {
                            G4(vwVar);
                        } else {
                            org.telegram.messenger.g0.i3(new rp(this, vwVar, objArr, i14), 160L);
                        }
                        i16++;
                    }
                }
                z11 = false;
                if (this.z3) {
                }
                G4(vwVar);
                i16++;
            }
            mw mwVar = this.z0;
            if (mwVar != null && mwVar.getVisibility() == 0) {
                this.z0.c();
            }
            this.z3 = false;
            return;
        }
        if (i7 == org.telegram.messenger.qs.q5) {
            u5(0, true);
            return;
        }
        if (i7 == org.telegram.messenger.qs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.Y2 != chatFull.id) {
                return;
            }
            this.a3 = chatFull;
            B3(false);
            if (this.e0 == null || this.S1) {
                return;
            }
            while (true) {
                vw[] vwVarArr2 = this.e0;
                if (i15 >= vwVarArr2.length) {
                    return;
                }
                G4(vwVarArr2[i15]);
                i15++;
            }
        } else {
            if (i7 == org.telegram.messenger.qs.d2) {
                mw mwVar2 = this.z0;
                if (mwVar2 == null || mwVar2.getVisibility() != 0) {
                    return;
                }
                mw mwVar3 = this.z0;
                int defaultTabId = mwVar3.getDefaultTabId();
                bi.q1 q1Var = mwVar3.F;
                ArrayList arrayList2 = mwVar3.h;
                int i20 = mwVar3.l0.get(defaultTabId, -1);
                if (i20 < 0 || i20 >= arrayList2.size()) {
                    return;
                }
                org.telegram.ui.Components.cz czVar = (org.telegram.ui.Components.cz) arrayList2.get(i20);
                if (czVar.d == ((nw) mwVar3.J).a(czVar.a) || ((nw) mwVar3.J).a(czVar.a) < 0) {
                    return;
                }
                q1Var.g1();
                if (mwVar3.m0.get(i20) != czVar.a(true) || mwVar3.h0) {
                    mwVar3.h0 = true;
                    mwVar3.requestLayout();
                    q1Var.setItemAnimator(mwVar3.s0);
                    l4 l4Var = mwVar3.I;
                    if (l4Var != null) {
                        l4Var.f();
                    }
                    mwVar3.M = 0;
                    org.telegram.ui.Components.cz d = mwVar3.d();
                    if (d != null) {
                        d.b(org.telegram.messenger.id.M0(2131750808, null));
                    }
                    int size = arrayList2.size();
                    while (i15 < size) {
                        mwVar3.M = org.telegram.messenger.k5.C(24.0f, ((org.telegram.ui.Components.cz) arrayList2.get(i15)).a(true), mwVar3.M);
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
                        vw[] vwVarArr3 = this.e0;
                        if (i21 >= vwVarArr3.length) {
                            break;
                        }
                        sw swVar = vwVarArr3[i21].a;
                        if (swVar != null) {
                            for (int i22 = 0; i22 < swVar.getChildCount(); i22++) {
                                View childAt = swVar.getChildAt(i22);
                                if (childAt != null) {
                                    childAt.invalidate();
                                }
                            }
                        }
                        i21++;
                    }
                }
                mw mwVar4 = this.z0;
                if (mwVar4 != null) {
                    mwVar4.getTabsContainer().g1();
                    return;
                }
                return;
            }
            if (i7 == org.telegram.messenger.qs.I4) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.l(true);
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
                mw mwVar5 = this.z0;
                if (mwVar5 != null && mwVar5.getVisibility() == 0) {
                    int intValue = num.intValue();
                    int i23 = org.telegram.messenger.qp.C8;
                    if ((intValue & 256) != 0) {
                        this.z0.c();
                    }
                }
                if (this.Y2 != 0) {
                    int intValue2 = num.intValue();
                    int i24 = org.telegram.messenger.qp.C8;
                    if ((intValue2 & TLObject.FLAG_13) != 0 || (num.intValue() & 2) != 0 || (num.intValue() & 8) != 0 || (num.intValue() & 16) != 0) {
                        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.Y2));
                        this.Z2 = M0;
                        this.actionBar.setTitle(org.telegram.messenger.m5.m(M0));
                        this.b3.e(this.Z2, this.c3);
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
            boolean[] zArr = y4;
            if (i7 == i26) {
                zArr[this.currentAccount] = false;
                return;
            }
            if (i7 == org.telegram.messenger.qs.Y) {
                u5(0, true);
                return;
            }
            if (i7 == org.telegram.messenger.qs.O) {
                if (this.e0 == null || this.S1) {
                    return;
                }
                org.telegram.ui.Components.q00 q00Var = this.t0;
                if (q00Var != null) {
                    z10 = q00Var.getProgressVisible();
                    this.t0.f(false, true);
                } else {
                    z10 = false;
                }
                for (vw vwVar2 : this.e0) {
                    vwVar2.d.e = false;
                }
                if (z10) {
                    L4(0.0f);
                    ValueAnimator valueAnimator = this.d0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(this.c0, 1.0f).setDuration(250L);
                    this.d0 = duration;
                    duration.setInterpolator(org.telegram.ui.Components.xq.f);
                    this.d0.addUpdateListener(new ju(this, i14));
                    this.d0.start();
                }
                int i27 = 0;
                boolean z12 = false;
                while (true) {
                    vw[] vwVarArr4 = this.e0;
                    if (i27 >= vwVarArr4.length) {
                        break;
                    }
                    if (!vwVarArr4[i27].p() || getMessagesController().D0() > 10) {
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
                    vw[] vwVarArr5 = this.e0;
                    if (i28 >= vwVarArr5.length) {
                        int i29 = org.telegram.messenger.qp.C8;
                        u5(512, true);
                        return;
                    }
                    if (vwVarArr5[i28].p() && org.telegram.messenger.g0.Q1()) {
                        boolean booleanValue2 = ((Boolean) objArr[2]).booleanValue();
                        long longValue = ((Long) objArr[i15]).longValue();
                        long longValue2 = ((Long) objArr[c11]).longValue();
                        org.telegram.messenger.xr xrVar = this.p2;
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
                    fw fwVar = this.C0;
                    if (fwVar == null || (yl0Var2 = fwVar.d0) == null || (i13 = yl0Var2.h0) == 15) {
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
                    fw fwVar2 = this.C0;
                    if (fwVar2 == null || (yl0Var = fwVar2.d0) == null) {
                        return;
                    }
                    yl0Var.f();
                    return;
                }
                if (i7 == org.telegram.messenger.qs.T1) {
                    int connectionState = ConnectionsManager.getInstance(org.telegram.messenger.c.a(i10).a).getConnectionState();
                    if (this.d2 != connectionState) {
                        this.d2 = connectionState;
                        m5(true, false);
                        return;
                    }
                    return;
                }
                if (i7 == org.telegram.messenger.qs.b5) {
                    m5(true, false);
                    fw fwVar3 = this.C0;
                    if (fwVar3 != null) {
                        int currentPosition = fwVar3.getCurrentPosition();
                        bi.g5 g5Var = fwVar3.V;
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
                    Runnable i9Var = new fi.i9(this, chat, longValue3, booleanValue, user, z9);
                    Z3();
                    if (this.y0[0] == null) {
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
                if (i7 == org.telegram.messenger.qs.d0) {
                    int intValue4 = ((Integer) objArr[0]).intValue();
                    int i33 = this.W2;
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
                            ce0 ce0Var = new ce0();
                            cu cuVar = new cu(this, 22);
                            cu cuVar2 = new cu(this, 23);
                            boolean z13 = c10 == 2;
                            ce0Var.F = 3;
                            ce0Var.a = 12;
                            ce0Var.d0 = cuVar;
                            ce0Var.e0 = cuVar2;
                            ce0Var.g0 = z13;
                            ce0Var.h0 = true;
                            presentFragment(ce0Var);
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
                        org.telegram.ui.Components.q00 q00Var2 = this.t0;
                        if (q00Var2 != null) {
                            q00Var2.f(true, true);
                        }
                        vw[] vwVarArr6 = this.e0;
                        if (vwVarArr6 != null) {
                            int length = vwVarArr6.length;
                            int i34 = 0;
                            while (i34 < length) {
                                gv gvVar = vwVarArr6[i34].d;
                                gvVar.Q = false;
                                gvVar.e = z14;
                                gvVar.f();
                                i34++;
                                z14 = true;
                            }
                            return;
                        }
                        return;
                    }
                    if (i7 == org.telegram.messenger.qs.w) {
                        if (!this.q3 || this.C0 == null) {
                            return;
                        }
                        ArrayList arrayList3 = (ArrayList) objArr[0];
                        long longValue4 = ((Long) objArr[1]).longValue();
                        fw fwVar4 = this.C0;
                        HashMap hashMap = fwVar4.B0;
                        SparseArray sparseArray = fwVar4.h;
                        int size2 = sparseArray.size();
                        for (int i35 = 0; i35 < size2; i35++) {
                            View view = (View) sparseArray.valueAt(i35);
                            if (view instanceof yz) {
                                ((yz) view).e(arrayList3, longValue4);
                            }
                        }
                        for (int i36 = 0; i36 < fwVar4.getChildCount(); i36++) {
                            if (fwVar4.getChildAt(i36) instanceof yz) {
                                ((yz) fwVar4.getChildAt(i36)).e(arrayList3, longValue4);
                            }
                        }
                        fwVar4.O0.e(arrayList3, longValue4);
                        if (hashMap.isEmpty()) {
                            return;
                        }
                        ArrayList arrayList4 = new ArrayList(hashMap.keySet());
                        int i37 = 0;
                        while (i37 < arrayList4.size()) {
                            rz rzVar = (rz) arrayList4.get(i37);
                            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) hashMap.get(rzVar);
                            if (ijVar != null) {
                                long B0 = org.telegram.messenger.ij.B0(ijVar.k);
                                if (B0 < j3) {
                                    i12 = (int) (-B0);
                                }
                                i12 = 0;
                                if (i12 == longValue4) {
                                    for (int i38 = 0; i38 < arrayList3.size(); i38++) {
                                        if (ijVar.f1() == ((Integer) arrayList3.get(i38)).intValue()) {
                                            arrayList = new ArrayList();
                                            arrayList.add(rzVar);
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
                            fwVar4.z0.a(hashMap.size(), true);
                            org.telegram.ui.ActionBar.r0 r0Var = fwVar4.E0;
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
                                vw[] vwVarArr7 = this.e0;
                                if (i40 >= vwVarArr7.length) {
                                    break;
                                }
                                jg.k kVar2 = vwVarArr7[i40].d.P;
                                if (kVar2 != null) {
                                    kVar2.a.clear();
                                    kVar2.b.clear();
                                    kVar2.c.clear();
                                    kVar2.d.clear();
                                    org.telegram.messenger.g0.r(kVar2.e);
                                }
                                i40++;
                            }
                        }
                        int i41 = org.telegram.ui.Components.e10.i1;
                        return;
                    }
                    if (i7 == org.telegram.messenger.qs.T5) {
                        long longValue5 = ((Long) objArr[0]).longValue();
                        boolean booleanValue3 = ((Boolean) objArr[1]).booleanValue();
                        if (this.Y2 != longValue5 || booleanValue3) {
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
                    if (i7 == org.telegram.messenger.qs.S5) {
                        if (this.Y2 == ((Long) objArr[0]).longValue()) {
                            B3(true);
                            return;
                        }
                        return;
                    }
                    if (i7 == org.telegram.messenger.qs.S4) {
                        boolean booleanValue4 = ((Boolean) objArr[0]).booleanValue();
                        if (this.fragmentView != null) {
                            if (!booleanValue4) {
                                mt mtVar = this.Q3;
                                if (mtVar == null || mtVar.getTag() == null) {
                                    return;
                                }
                                mt mtVar2 = this.Q3;
                                mtVar2.animate().setListener(null).cancel();
                                mtVar2.animate().setListener(new org.telegram.ui.Components.v50(8, this, mtVar2)).alpha(0.0f).setStartDelay(0L).setDuration(150L).start();
                                this.Q3.setTag(null);
                                return;
                            }
                            if (this.Q3 == null) {
                                Context context = this.fragmentView.getContext();
                                mt mtVar3 = new mt(context);
                                LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                                org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(context);
                                ch0Var.f(R.raw.db_migration_placeholder, org.telegram.messenger.qs.g2, org.telegram.messenger.qs.g2, null);
                                ch0Var.getAnimatedDrawable().K(1);
                                ch0Var.d();
                                f10.addView(ch0Var, c8.ha.r(org.telegram.messenger.qs.g2, org.telegram.messenger.qs.g2, 1));
                                TextView textView = new TextView(context);
                                jg.g.v(textView, 1, 24.0f, null, 2131747779);
                                int i42 = org.telegram.ui.ActionBar.k6.G6;
                                org.telegram.ui.ActionBar.r6.V(textView, i42, null);
                                textView.setGravity(1);
                                TextView f11 = org.telegram.messenger.camera.q.f(f10, textView, c8.ha.q(-1, -2, 0.0f, 0, 50, 32, 50, 0), context);
                                f11.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                                jg.g.v(f11, 1, 14.0f, null, 2131747778);
                                org.telegram.ui.ActionBar.r6.V(f11, i42, null);
                                f11.setGravity(1);
                                TextView f12 = org.telegram.messenger.camera.q.f(f10, f11, c8.ha.q(-1, -2, 0.0f, 0, 36, 20, 36, 0), context);
                                jg.g.v(f12, 1, 14.0f, null, 2131747777);
                                org.telegram.ui.ActionBar.r6.V(f12, i42, null);
                                f12.setGravity(1);
                                f10.addView(f12, c8.ha.q(-1, -2, 0.0f, 0, 36, 24, 36, 0));
                                mtVar3.addView(f10, c8.ha.e(-1, -2, 16));
                                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, mtVar3, null);
                                mtVar3.setOnTouchListener(new lt());
                                this.Q3 = mtVar3;
                                mtVar3.setAlpha(0.0f);
                                ((pw) this.fragmentView).addView(this.Q3);
                                this.Q3.animate().alpha(1.0f).setDuration(300L).setStartDelay(1000L).start();
                            }
                            this.Q3.setTag(1);
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
                        getMessagesController().b3(this.W2);
                        return;
                    }
                    if (i7 == org.telegram.messenger.qs.z5) {
                        int intValue5 = ((Integer) objArr[0]).intValue();
                        int i43 = 0;
                        while (true) {
                            vw[] vwVarArr8 = this.e0;
                            if (i43 >= vwVarArr8.length) {
                                return;
                            }
                            vw vwVar3 = vwVarArr8[i43];
                            if (vwVar3 != null && (((i11 = vwVar3.s) == 7 || i11 == 8) && (voVar = getMessagesController().M[vwVar3.s - 7]) != null && intValue5 == voVar.a)) {
                                vwVar3.q(true);
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
                            vw[] vwVarArr9 = this.e0;
                            if (i44 >= vwVarArr9.length) {
                                return;
                            }
                            vw vwVar4 = vwVarArr9[i44];
                            if (vwVar4.a != null) {
                                int i45 = 0;
                                while (true) {
                                    if (i45 < vwVar4.a.getChildCount()) {
                                        View childAt2 = vwVar4.a.getChildAt(i45);
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
        cz0 cz0Var = this.Z;
        float measuredHeight = (cz0Var == null || cz0Var.getVisibility() == 8) ? 0.0f : this.Z.getMeasuredHeight();
        float L = this.K ? org.telegram.messenger.g0.L(81.0f) : 0.0f;
        if (this.K) {
            float f17 = this.N;
            float f18 = this.x1;
            f10 = (measuredHeight * f18) + com.google.android.recaptcha.internal.a.z(1.0f, f18, L, f17);
            f11 = this.x3;
        } else {
            f10 = (measuredHeight * this.x1) + this.N;
            f11 = this.x3;
        }
        float f19 = f10 + f11 + this.T;
        lw lwVar = this.X;
        float L2 = org.telegram.messenger.g0.L(4.0f) * ((lwVar == null || lwVar.getVisibility() != 0) ? 0.0f : this.X.getAlpha());
        mw mwVar = this.z0;
        if (mwVar != null) {
            mwVar.setTranslationY(f19 - L2);
            f13 = this.z0.getAlpha();
            f14 = org.telegram.messenger.g0.L(43.0f) * f13;
            f12 = f19 + f14;
        } else {
            f12 = f19;
            f13 = 0.0f;
            f14 = 0.0f;
        }
        org.telegram.ui.Components.pr prVar = this.J1;
        if (prVar != null) {
            prVar.setTranslationY(org.telegram.messenger.g0.T1(f12 - L2, (-org.telegram.messenger.g0.L(3.0f)) - (this.a0 == null ? org.telegram.messenger.g0.L(44.0f) : 0), this.b.e));
            f15 = this.J1.getMetadata().c.a;
            f16 = this.J1.c(0.0f);
        } else {
            f15 = 0.0f;
            f16 = 0.0f;
        }
        org.telegram.ui.Components.or orVar = this.K1;
        if (orVar != null) {
            orVar.setTranslationY(f19 - L2);
            float W1 = org.telegram.messenger.g0.W1(Math.min(f15, f13), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(50.0f));
            org.telegram.ui.Components.or orVar2 = this.K1;
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
            this.K1.setAlpha(Math.max(f13, f15));
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
        mw mwVar;
        org.telegram.ui.Components.cz d;
        long j3;
        TLRPC.User a22;
        this.V2 = false;
        this.T2 = 0;
        this.Q2 = 0;
        this.P2 = 0;
        this.O2 = 0;
        this.N2 = 0;
        this.U2 = 0;
        this.R2 = 0;
        this.S2 = 0;
        if (z9) {
            return;
        }
        ArrayList arrayList = this.I2;
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
                    this.U2++;
                }
                if (getMessagesController().r2(j10, 0L, null)) {
                    this.Q2++;
                } else {
                    this.P2++;
                }
                if (z11) {
                    this.N2++;
                }
                if (this.W2 == 1 || dialog.folder_id == 1) {
                    this.T2++;
                } else if (j10 != j3 && dialog.community_id == 0 && j10 != 777000 && !getMessagesController().C2(j10, false)) {
                    i13++;
                }
                if (dialog.community_id != 0) {
                    i11++;
                }
                if (!org.telegram.messenger.m5.E(j10) || j10 == j3 || j10 == 489000 || org.telegram.messenger.qp.F2(getMessagesController().a2(Long.valueOf(j10)))) {
                    i15++;
                } else if (org.telegram.messenger.k5.w("dialog_bar_report", j10, notificationsSettings, true)) {
                    this.S2++;
                }
                if (org.telegram.messenger.m5.y(dialog)) {
                    TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j10));
                    if (getMessagesController().C2(dialog.id, true)) {
                        this.R2++;
                        int i16 = getMessagesController().A2;
                        int i17 = org.telegram.messenger.qp.C8;
                        if (i16 == 1) {
                            i10++;
                            this.V2 = true;
                        }
                    } else {
                        if (s42) {
                            i14++;
                        } else {
                            this.O2++;
                        }
                        if (M0 == null || !M0.megagroup) {
                            this.R2++;
                        } else if (org.telegram.messenger.t3.t0(M0)) {
                            this.R2++;
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
                        this.O2++;
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
        org.telegram.ui.ActionBar.r0 r0Var3 = this.j1;
        if (r0Var3 != null) {
            if (i10 != size || i11 > 0) {
                r0Var3.setVisibility(8);
            } else {
                r0Var3.setVisibility(0);
            }
        }
        org.telegram.ui.ActionBar.z0 z0Var2 = this.r1;
        if (z0Var2 != null) {
            int i18 = this.R2;
            if ((i18 == 0 || i18 == size) && ((i12 == 0 || i12 == size) && i11 <= 0)) {
                z0Var2.setVisibility(0);
                if (this.R2 != 0) {
                    this.r1.setText(org.telegram.messenger.id.M0(2131752088, null));
                } else {
                    this.r1.setText(org.telegram.messenger.id.M0(2131752089, null));
                }
            } else {
                z0Var2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.z0 z0Var3 = this.q1;
        if (z0Var3 != null && this.m1 != null) {
            if (this.T2 != 0 && i11 == 0 && this.Y2 == 0) {
                String M02 = org.telegram.messenger.id.M0(2131743918, null);
                this.q1.j(M02, R.drawable.msg_unarchive, null);
                this.m1.setIcon(R.drawable.msg_unarchive);
                this.m1.setContentDescription(M02);
                mw mwVar2 = this.z0;
                if (mwVar2 == null || mwVar2.getVisibility() != 0) {
                    this.q1.setVisibility(0);
                    this.m1.setVisibility(8);
                } else {
                    this.m1.setVisibility(0);
                    this.q1.setVisibility(8);
                }
            } else if (i13 != 0 && i11 == 0 && this.Y2 == 0) {
                String M03 = org.telegram.messenger.id.M0(2131754172, null);
                this.q1.j(M03, R.drawable.msg_archive, null);
                this.m1.setIcon(R.drawable.msg_archive);
                this.m1.setContentDescription(M03);
                mw mwVar3 = this.z0;
                if (mwVar3 == null || mwVar3.getVisibility() != 0) {
                    this.q1.setVisibility(0);
                    this.m1.setVisibility(8);
                } else {
                    this.m1.setVisibility(0);
                    this.q1.setVisibility(8);
                }
            } else {
                z0Var3.setVisibility(8);
                this.m1.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.r0 r0Var4 = this.k1;
        if (r0Var4 != null && this.n1 != null) {
            if (this.O2 + i14 == size && this.Y2 == 0) {
                mw mwVar4 = this.z0;
                if (mwVar4 == null || mwVar4.getVisibility() != 0) {
                    this.k1.setVisibility(0);
                    this.n1.setVisibility(8);
                } else {
                    this.n1.setVisibility(0);
                    this.k1.setVisibility(8);
                }
            } else {
                r0Var4.setVisibility(8);
                this.n1.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.z0 z0Var4 = this.t1;
        if (z0Var4 != null) {
            if (i15 != 0) {
                z0Var4.setVisibility(8);
            } else {
                z0Var4.setVisibility(0);
            }
        }
        if (this.p1 != null) {
            mw mwVar5 = this.z0;
            boolean z13 = mwVar5 == null || mwVar5.getVisibility() != 0 || ((d = (mwVar = this.z0).d()) != null && d.a == mwVar.L);
            if (!z13) {
                try {
                    z13 = size >= d4(this.currentAccount, this.e0[0].d.h, this.W2, this.S1).size();
                } catch (Exception unused) {
                }
            }
            if (!z13) {
                z10 = false;
                this.p1.setVisibility(0);
                if (this.o1 != null) {
                    if (this.W2 != 1) {
                        if (this.z0 != null && e4(z10) > 0.5f) {
                            mw mwVar6 = this.z0;
                            org.telegram.ui.Components.cz d2 = mwVar6.d();
                            if (d2 != null && d2.a == mwVar6.L) {
                                int i19 = org.telegram.ui.Components.gz.t1;
                                ArrayList arrayList4 = new ArrayList();
                                ArrayList arrayList5 = getMessagesController().P0;
                                int size2 = arrayList5.size();
                                int i20 = 0;
                                while (i20 < size2) {
                                    org.telegram.messenger.vo voVar = (org.telegram.messenger.vo) arrayList5.get(i20);
                                    ArrayList arrayList6 = arrayList3;
                                    if (!org.telegram.ui.Components.gz.J0(this, voVar, arrayList6, true, true).isEmpty() && !voVar.e()) {
                                        arrayList4.add(voVar);
                                    }
                                    i20++;
                                    arrayList3 = arrayList6;
                                }
                            }
                        }
                        this.o1.setVisibility(8);
                    }
                    this.o1.setVisibility(0);
                }
                r0Var = this.l1;
                if (r0Var != null) {
                    r52 = 0;
                } else if (this.Q2 != 0) {
                    r0Var.setIcon(R.drawable.msg_unmute);
                    r52 = 0;
                    this.l1.setContentDescription(org.telegram.messenger.id.M0(2131752165, null));
                } else {
                    r52 = 0;
                    r0Var.setIcon(R.drawable.msg_mute);
                    this.l1.setContentDescription(org.telegram.messenger.id.M0(2131752175, null));
                }
                z0Var = this.s1;
                if (z0Var != 0) {
                    if (this.N2 != 0) {
                        z0Var.j(org.telegram.messenger.id.M0(2131748682, r52), R.drawable.msg_markread, r52);
                        this.s1.setVisibility(0);
                    } else if (this.U2 == 0 && i11 == 0) {
                        z0Var.j(org.telegram.messenger.id.M0(2131748681, r52), R.drawable.msg_markunread, r52);
                        this.s1.setVisibility(0);
                    } else {
                        z0Var.setVisibility(8);
                    }
                }
                r0Var2 = this.k1;
                if (r0Var2 != null || this.n1 == null) {
                }
                if (this.O2 != 0) {
                    r0Var2.setIcon(R.drawable.msg_pin);
                    this.k1.setContentDescription(org.telegram.messenger.id.M0(2131747238, null));
                    this.n1.setText(org.telegram.messenger.id.M0(2131751454, null));
                    return;
                } else {
                    r0Var2.setIcon(R.drawable.msg_unpin);
                    this.k1.setContentDescription(org.telegram.messenger.id.M0(2131743848, null));
                    this.n1.setText(org.telegram.messenger.id.M0(2131751453, null));
                    return;
                }
            }
            this.p1.setVisibility(8);
        }
        z10 = false;
        if (this.o1 != null) {
        }
        r0Var = this.l1;
        if (r0Var != null) {
        }
        z0Var = this.s1;
        if (z0Var != 0) {
        }
        r0Var2 = this.k1;
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
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Runnable, org.telegram.ui.ActionBar.f6] */
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
        sv svVar;
        org.telegram.messenger.s9 s9Var;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        int i7;
        boolean z11;
        sv svVar2;
        long j3;
        boolean z12;
        boolean z13;
        org.telegram.messenger.t1 b10;
        ?? r72;
        String G;
        StringBuilder sb2;
        final long j10;
        final long j11;
        if (this.J1 == null || this.M1 == null || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Cells.b3 b3Var = this.M1;
        boolean z14 = false;
        r7 = false;
        boolean z15 = false;
        if (b3Var != null) {
            try {
                ((org.telegram.ui.Components.zg0) ((org.telegram.ui.Components.w8) b3Var.h.getImageReceiver().m0).K).R(null);
            } catch (Exception unused) {
            }
            org.telegram.ui.Cells.b3 b3Var2 = this.M1;
            b3Var2.setCompact(false);
            b3Var2.a(org.telegram.messenger.p10.s0, null);
            org.telegram.ui.Components.l9 l9Var = b3Var2.h;
            l9Var.setVisibility(8);
            l9Var.b();
        }
        long j12 = 0;
        final int i10 = 1;
        if (!isInPreviewMode()) {
            if (getMessagesController().v2()) {
                this.M1.setOnClickListener(new eu(this, 12));
                this.M1.c(org.telegram.messenger.id.M0(2131754701, null), org.telegram.messenger.id.M0(2131754702, null), false, true);
            } else {
                int i11 = 21;
                if (this.W2 == 0 && this.Y2 == 0 && getMessagesController().S3.contains("SETUP_PASSKEY")) {
                    this.M1.setOnClickListener(new eu(this, 19));
                    this.M1.b(org.telegram.messenger.i6.p(org.telegram.messenger.id.M0(2131747631, null), this.M1.c, new cu(this, i11)), org.telegram.messenger.id.M0(2131747632, null));
                    this.M1.setOnCloseListener(new eu(this, 24));
                } else if (this.W2 == 0 && this.Y2 == 0 && getMessagesController().S3.contains("PREMIUM_GRACE")) {
                    this.M1.setOnClickListener(new eu(this, 25));
                    this.M1.b(org.telegram.messenger.i6.p(org.telegram.messenger.id.M0(2131749526, null), this.M1.c, new cu(this, i11)), org.telegram.messenger.id.M0(2131749530, null));
                    this.M1.setOnCloseListener(new eu(this, 26));
                } else if (this.W2 == 0 && this.Y2 == 0 && getMessagesController().U3 != null) {
                    final TLRPC.TL_pendingSuggestion tL_pendingSuggestion = getMessagesController().U3;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_pendingSuggestion.title.text);
                    org.telegram.messenger.ij.b(spannableStringBuilder, tL_pendingSuggestion.title.entities, false, false, true, true, 0);
                    Spannable C5 = org.telegram.messenger.ij.C5(org.telegram.messenger.i6.m(spannableStringBuilder, this.M1.c.getPaint().getFontMetricsInt(), false, null, 0), tL_pendingSuggestion.title.entities, this.M1.c.getPaint().getFontMetricsInt(), false);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_pendingSuggestion.description.text);
                    org.telegram.messenger.ij.b(spannableStringBuilder2, tL_pendingSuggestion.description.entities, false, false, true, true, 0);
                    this.M1.b(C5, org.telegram.messenger.ij.C5(org.telegram.messenger.i6.m(spannableStringBuilder2, this.M1.d.getPaint().getFontMetricsInt(), false, null, 0), tL_pendingSuggestion.description.entities, this.M1.d.getPaint().getFontMetricsInt(), false));
                    org.telegram.ui.Cells.b3 b3Var3 = this.M1;
                    final int i12 = z14 ? 1 : 0;
                    b3Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wu
                        public final /* synthetic */ ww b;

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
                                    ww.Z(this.b, tL_pendingSuggestion);
                                    break;
                            }
                        }
                    });
                    this.M1.setOnCloseListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wu
                        public final /* synthetic */ ww b;

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
                                    ww.Z(this.b, tL_pendingSuggestion);
                                    break;
                            }
                        }
                    });
                } else {
                    if (this.W2 == 0 && this.Y2 == 0 && org.telegram.messenger.qp.s1(this.currentAccount).S3.contains("STARS_SUBSCRIPTION_LOW_BALANCE")) {
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
                                this.M1.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.xu
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        ww wwVar = ww.this;
                                        new bi.tc(wwVar.getParentActivity(), wwVar.getResourceProvider(), j10, 2, sb4, new cu(wwVar, 2), j11).show();
                                    }
                                });
                                org.telegram.ui.Cells.b3 b3Var4 = this.M1;
                                long j16 = j10 - y11.f.amount;
                                if (j16 > j3) {
                                    j10 = j16;
                                }
                                Object[] objArr = new Object[1];
                                objArr[z17 ? 1 : 0] = sb4;
                                b3Var4.b(bi.dd.a1(z17, org.telegram.messenger.id.K("StarsSubscriptionExpiredHintTitle2", (int) j10, ',', objArr), 0.72f, null), org.telegram.messenger.id.M0(2131744992, null));
                                this.M1.setOnCloseListener(new eu(this, 13));
                            }
                            if (this.W2 == 0 || this.Y2 != j3 || getMessagesController().h7 || (b10 = org.telegram.messenger.v1.a(this.currentAccount).b()) == null || b10.c.isEmpty() || getMessagesController().T3.contains("BIRTHDAY_CONTACTS_TODAY")) {
                                int i15 = 15;
                                if (this.W2 != 0 && this.Y2 == j3 && org.telegram.messenger.qp.s1(this.currentAccount).S3.contains("BIRTHDAY_SETUP") && getMessagesController().b2(getUserConfig().e()) != null && getMessagesController().b2(getUserConfig().e()).birthday == null) {
                                    org.telegram.messenger.g5.r(this.currentAccount).D(false);
                                    this.M1.setOnClickListener(new eu(this, i15));
                                    this.M1.b(org.telegram.messenger.i6.p(org.telegram.messenger.id.M0(2131753712, null), this.M1.c, new cu(this, i11)), org.telegram.messenger.id.a0(null, null, 2131753713, new Object[0]));
                                    this.M1.setOnCloseListener(new eu(this, 16));
                                } else if (!((org.telegram.messenger.qp.s1(this.currentAccount).D3() && this.W2 == 0 && this.Y2 == j3) ? org.telegram.messenger.qp.s1(this.currentAccount).S3.contains("PREMIUM_CHRISTMAS") : false)) {
                                    this.M1.setOnClickListener(new bi.l1(i15));
                                    this.M1.b(org.telegram.messenger.i6.m(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131749674, null), org.telegram.ui.ActionBar.k6.I6, 2, null, null), null, false, null, 0), org.telegram.messenger.id.a0(null, null, 2131753331, new Object[0]));
                                    this.M1.setOnCloseListener(new eu(this, 17));
                                } else if (!org.telegram.messenger.qp.s1(this.currentAccount).D3() && this.W2 == 0 && this.Y2 == j3 && org.telegram.messenger.qp.s1(this.currentAccount).S3.contains("PREMIUM_RESTORE") && !getUserConfig().q() && org.telegram.messenger.ui.b0(this.currentAccount).g0(false) != null) {
                                    this.M1.setOnClickListener(new eu(this, 18));
                                    this.M1.b(org.telegram.messenger.g0.S2(org.telegram.messenger.id.a0(null, null, 2131746067, org.telegram.messenger.ui.b0(this.currentAccount).g0(false)), org.telegram.ui.ActionBar.k6.I6, 2, null, null), org.telegram.messenger.id.M0(2131746068, null));
                                } else {
                                    if (org.telegram.messenger.qp.s1(this.currentAccount).D3() || this.W2 != 0 || this.Y2 != j3 || ((!(org.telegram.messenger.qp.s1(this.currentAccount).S3.contains("PREMIUM_UPGRADE") && getUserConfig().q()) && (!org.telegram.messenger.qp.s1(this.currentAccount).S3.contains("PREMIUM_ANNUAL") || getUserConfig().q())) || (!org.telegram.messenger.p10.i(this.currentAccount).q() ? org.telegram.messenger.ui.b0(this.currentAccount).g0(false) == null : org.telegram.messenger.r2.b() || org.telegram.messenger.ui.b0(this.currentAccount).g0(true) == null))) {
                                        z12 = false;
                                    } else {
                                        this.A3 = org.telegram.messenger.qp.s1(this.currentAccount).S3.contains("PREMIUM_UPGRADE");
                                        z12 = true;
                                    }
                                    if (z12) {
                                        this.M1.setOnClickListener(new eu(this, 20));
                                        this.M1.b(org.telegram.messenger.g0.S2(org.telegram.messenger.id.a0(null, null, this.A3 ? 2131745937 : 2131743809, org.telegram.messenger.ui.b0(this.currentAccount).g0(false)), org.telegram.ui.ActionBar.k6.I6, 2, null, null), org.telegram.messenger.id.M0(this.A3 ? 2131743812 : 2131745938, null));
                                    } else {
                                        if (this.O1 != null && this.P1 != null) {
                                            if (r0.longValue() / this.P1.longValue() < 0.3f) {
                                                org.telegram.messenger.qp.e1().edit().remove("cache_hint_showafter").remove("cache_hint_period").apply();
                                            } else if (System.currentTimeMillis() > org.telegram.messenger.qp.e1().getLong("cache_hint_showafter", j3)) {
                                                z13 = true;
                                                if (!z13) {
                                                    this.M1.setOnClickListener(new eu(this, i11));
                                                    this.M1.b(org.telegram.messenger.g0.S2(org.telegram.messenger.id.a0(null, null, 2131752048, org.telegram.messenger.g0.i0(this.O1.longValue(), false, false)), org.telegram.ui.ActionBar.k6.I6, 2, null, null), org.telegram.messenger.id.M0(2131752049, null));
                                                } else if (this.W2 == 0 && this.Y2 == 0 && getUserConfig().f() != null && ((getUserConfig().f().photo == null || (getUserConfig().f().photo instanceof TLRPC.TL_userProfilePhotoEmpty)) && org.telegram.messenger.qp.s1(this.currentAccount).S3.contains("USERPIC_SETUP"))) {
                                                    this.M1.setOnClickListener(new eu(this, 22));
                                                    this.M1.h.setVisibility(0);
                                                    org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
                                                    w8Var.setBounds(0, 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f));
                                                    long e10 = getUserConfig().e();
                                                    w8Var.A = true;
                                                    w8Var.b = true;
                                                    w8Var.c = false;
                                                    int i16 = org.telegram.ui.ActionBar.k6.p8[org.telegram.ui.Components.w8.e(e10)];
                                                    org.telegram.ui.ActionBar.f6 f6Var = w8Var.z;
                                                    w8Var.d = org.telegram.ui.ActionBar.k6.w0(i16, f6Var);
                                                    w8Var.e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q8[org.telegram.ui.Components.w8.e(e10)], f6Var);
                                                    w8Var.n = 0;
                                                    w8Var.m = false;
                                                    org.telegram.ui.Components.w8.a("", "", "", w8Var.q);
                                                    w8Var.K = getParentActivity().getResources().getDrawable(R.drawable.filled_profile_photo_20);
                                                    this.M1.h.setImageDrawable(w8Var);
                                                    this.M1.b(org.telegram.messenger.i6.p(org.telegram.messenger.id.M0(2131749302, null), this.M1.c, new cu(this, i11)), org.telegram.messenger.id.M0(2131749301, null));
                                                    this.M1.setOnCloseListener(new eu(this, 23));
                                                } else {
                                                    if (this.W2 == 0 && this.Y2 == 0 && org.telegram.messenger.t0.a != null) {
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
                                this.M1.setOnClickListener(new org.telegram.ui.Components.t41(11, this, b11));
                                this.M1.a(this.currentAccount, arrayList3);
                                org.telegram.ui.Cells.b3 b3Var5 = this.M1;
                                if (arrayList3.size() == 1) {
                                    r72 = 0;
                                    G = org.telegram.messenger.id.a0(null, null, 2131753706, org.telegram.messenger.t10.k((TLRPC.User) arrayList3.get(0)));
                                } else {
                                    r72 = 0;
                                    G = org.telegram.messenger.id.G(arrayList3.size(), "BirthdayTodayMultipleTitle", new Object[0]);
                                }
                                b3Var5.b(org.telegram.messenger.i6.p(org.telegram.messenger.g0.S2(G, org.telegram.ui.ActionBar.k6.I6, 2, r72, r72), this.M1.c, new cu(this, i11)), org.telegram.messenger.id.a0(null, null, arrayList3.size() == 1 ? 2131753707 : 2131753710, new Object[0]));
                                this.M1.setOnCloseListener(new eu(this, 14));
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
                    if (this.W2 == 0) {
                    }
                    int i152 = 15;
                    if (this.W2 != 0) {
                    }
                    if (!((org.telegram.messenger.qp.s1(this.currentAccount).D3() && this.W2 == 0 && this.Y2 == j3) ? org.telegram.messenger.qp.s1(this.currentAccount).S3.contains("PREMIUM_CHRISTMAS") : false)) {
                    }
                }
            }
            z14 = true;
        }
        sv svVar3 = this.F3;
        te.a aVar = this.b;
        if ((svVar3 != null && svVar3.c()) || aVar.f) {
            z14 = false;
        }
        this.J1.i(this.M1, z14, true);
        B3(true);
        if (this.fragmentView == null || this.J1 == null) {
            z9 = false;
        } else {
            boolean z18 = !isInPreviewMode() && this.W2 == 0 && this.Y2 == 0 && this.R0 == 0 && !getMessagesController().U1().b.isEmpty() && ((svVar2 = this.F3) == null || !svVar2.c()) && !aVar.f;
            if (z18) {
                if (this.N1 == null) {
                    org.telegram.ui.Cells.ma maVar = new org.telegram.ui.Cells.ma(getParentActivity());
                    this.N1 = maVar;
                    this.J1.addView(maVar);
                }
                org.telegram.ui.Cells.ma maVar2 = this.N1;
                int i17 = this.currentAccount;
                TextView textView = maVar2.b;
                TextView textView2 = maVar2.c;
                ArrayList arrayList4 = org.telegram.messenger.qp.s1(i17).U1().b;
                org.telegram.ui.Cells.la laVar = maVar2.d;
                laVar.setText(org.telegram.messenger.id.M0(2131743913, null));
                laVar.a(false, false);
                org.telegram.ui.Cells.la laVar2 = maVar2.e;
                laVar2.setText(org.telegram.messenger.id.M0(2131743903, null));
                laVar2.a(false, false);
                if (arrayList4 == null || arrayList4.size() != 1) {
                    if (arrayList4 == null || arrayList4.size() <= 1) {
                        z9 = false;
                    } else {
                        textView.setText(org.telegram.messenger.id.M0(2131743894, null));
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
                    textView.setText(org.telegram.messenger.id.M0(z19 ? 2131743893 : 2131743894, null));
                    String str4 = "" + l10Var.e;
                    if (!TextUtils.isEmpty(str3) && !str4.isEmpty()) {
                        str4 = str4.concat(", ");
                    }
                    String r10 = rf.b.r(str4, str3);
                    if (l10Var.a) {
                        textView2.setText(org.telegram.messenger.id.a0(null, null, 2131743895, "@" + org.telegram.messenger.m5.t(l10Var.c), r10));
                    } else {
                        textView2.setText(org.telegram.messenger.id.a0(null, null, 2131743896, r10));
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
            org.telegram.ui.Cells.ma maVar3 = this.N1;
            if (maVar3 != null) {
                this.J1.i(maVar3, z18, true);
            }
        }
        if (this.fragmentView == null || this.J1 == null) {
            return;
        }
        if (!isInPreviewMode() && this.W2 == 0 && this.Y2 == 0 && this.R0 == 0) {
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
            if (!giftAuctionsController.c.isEmpty() && (((svVar = this.F3) == null || !svVar.c()) && !aVar.f)) {
                z10 = true;
                if (z10 && this.L1 == null) {
                    org.telegram.ui.Cells.m mVar2 = new org.telegram.ui.Cells.m(getParentActivity(), this.currentAccount);
                    this.L1 = mVar2;
                    this.J1.addView(mVar2);
                }
                mVar = this.L1;
                if (mVar == null) {
                    this.J1.i(mVar, z10, true);
                    return;
                }
                return;
            }
        }
        z10 = z9;
        if (z10) {
            org.telegram.ui.Cells.m mVar22 = new org.telegram.ui.Cells.m(getParentActivity(), this.currentAccount);
            this.L1 = mVar22;
            this.J1.addView(mVar22);
        }
        mVar = this.L1;
        if (mVar == null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.ActionBar.m4 getBackButtonState() {
        return (q4() || this.F3.f) ? org.telegram.ui.ActionBar.m4.a : org.telegram.ui.ActionBar.m4.b;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final Animator getCustomSlideTransition(boolean z9, boolean z10, float f10) {
        int i7 = 1;
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.W3, 1.0f);
            this.Z3 = ofFloat;
            return ofFloat;
        }
        int i10 = (getLayoutContainer() == null || getLayoutContainer().getMeasuredWidth() <= 0) ? org.telegram.messenger.qs.g2 : (int) Utilities.i((200.0f / getLayoutContainer().getMeasuredWidth()) * f10, 200.0f, 80.0f);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.W3, 1.0f);
        this.Z3 = ofFloat2;
        ofFloat2.addUpdateListener(new ju(this, i7));
        this.Z3.setInterpolator(org.telegram.ui.Components.xq.g);
        this.Z3.setDuration(i10);
        this.Z3.start();
        return this.Z3;
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
            arrayList.add(new org.telegram.ui.ActionBar.t6(r0Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.t8));
        }
        if (this.W2 == 0) {
            fw fwVar = this.C0;
            if (fwVar != null) {
                arrayList.add(new org.telegram.ui.ActionBar.t6(fwVar.a0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 128, (Class[]) null, (Paint) null, new Drawable[]{org.telegram.ui.ActionBar.k6.s1}, (org.telegram.ui.ActionBar.s6) null, !this.W ? org.telegram.ui.ActionBar.k6.A8 : org.telegram.ui.ActionBar.k6.Ul));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        } else {
            fw fwVar2 = this.C0;
            if (fwVar2 != null) {
                arrayList.add(new org.telegram.ui.ActionBar.t6(fwVar2.a0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 128, (Class[]) null, (Paint) null, new Drawable[]{org.telegram.ui.ActionBar.k6.s1}, (org.telegram.ui.ActionBar.s6) null, !this.W ? org.telegram.ui.ActionBar.k6.P8 : org.telegram.ui.ActionBar.k6.Ul));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Q8));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.R8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_21, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.x8));
        NumberTextView numberTextView = this.h1;
        int i7 = org.telegram.ui.ActionBar.k6.y8;
        arrayList.add(new org.telegram.ui.ActionBar.t6(numberTextView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        if (this.z0 != null) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar == null || !kVar.v()) {
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.z0, 0, new Class[]{org.telegram.ui.Components.fz.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.K8));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.dz.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.I8));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.dz.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.J8));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.z0.getTabsContainer(), TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.L8));
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.z0, 0, new Class[]{org.telegram.ui.Components.fz.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ui));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.dz.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ti));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.dz.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.si));
            }
        }
        arrayList.addAll(c8.ma.a(new f6(7, this), org.telegram.ui.ActionBar.k6.w8, i7));
        int i10 = 0;
        while (i10 < 3) {
            if (i10 == 2) {
                fw fwVar3 = this.C0;
                if (fwVar3 == null) {
                    i10++;
                } else {
                    view = fwVar3.a0;
                    view2 = view;
                    if (view2 == null) {
                        arrayList.add(new org.telegram.ui.ActionBar.t6(view2, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.i6));
                        arrayList.add(new org.telegram.ui.ActionBar.t6(view2, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h6));
                        int i11 = org.telegram.ui.Cells.x3.h;
                        arrayList.add(new org.telegram.ui.ActionBar.t6(view2, 4, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.o6));
                    }
                    i10++;
                }
            } else {
                vw[] vwVarArr = this.e0;
                if (vwVarArr == null) {
                    i10++;
                } else {
                    view = i10 < vwVarArr.length ? vwVarArr[i10].a : null;
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
                vw[] vwVarArr2 = this.e0;
                if (i12 >= vwVarArr2.length) {
                    break;
                }
                if (this.W2 == 0) {
                    arrayList.add(new org.telegram.ui.ActionBar.t6(vwVarArr2[i12].a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
                } else {
                    arrayList.add(new org.telegram.ui.ActionBar.t6(vwVarArr2[i12].a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
                }
                int i13 = org.telegram.messenger.iz.a;
                int i14 = org.telegram.ui.ActionBar.k6.q6;
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.e0[i12].a, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.e0[i12].a, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.e0[i12].x, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h6));
                this.e0[i12].d.getClass();
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
                i12++;
            }
        }
        int i15 = 0;
        while (true) {
            UndoView[] undoViewArr = this.y0;
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
        jg.q0 q0Var = this.b0;
        if (q0Var != null) {
            arrayList.addAll(q0Var.getThemeDescriptions());
            this.b0.updateColors();
        }
        yw ywVar = this.h0;
        if (ywVar != null) {
            ywVar.updateColors();
            this.h0.invalidate();
        }
        fw fwVar4 = this.C0;
        if (fwVar4 != null) {
            org.telegram.ui.Components.sl0 sl0Var = fwVar4.b0;
            SparseArray sparseArray = fwVar4.h;
            bi.q1 q1Var = fwVar4.a0;
            for (int i16 = 0; i16 < q1Var.getChildCount(); i16++) {
                View childAt = q1Var.getChildAt(i16);
                if ((childAt instanceof org.telegram.ui.Cells.g6) || (childAt instanceof org.telegram.ui.Cells.t2) || (childAt instanceof org.telegram.ui.Cells.m4)) {
                    arrayList.add(new org.telegram.ui.ActionBar.t6(childAt, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
                }
            }
            for (int i17 = 0; i17 < fwVar4.getChildCount(); i17++) {
                if (fwVar4.getChildAt(i17) instanceof yz) {
                    arrayList.addAll(((yz) fwVar4.getChildAt(i17)).getThemeDescriptions());
                }
            }
            int size = sparseArray.size();
            for (int i18 = 0; i18 < size; i18++) {
                View view3 = (View) sparseArray.valueAt(i18);
                if (view3 instanceof yz) {
                    arrayList.addAll(((yz) view3).getThemeDescriptions());
                }
            }
            yz yzVar = fwVar4.O0;
            if (yzVar != null) {
                arrayList.addAll(yzVar.getThemeDescriptions());
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6(sl0Var.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.t6(sl0Var.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.y6));
            arrayList.addAll(c8.ma.a(new org.telegram.ui.Components.s6(fwVar4, 4), org.telegram.ui.ActionBar.k6.y8));
        }
        org.telegram.ui.Cells.b3 b3Var = this.M1;
        int i19 = 5;
        if (b3Var != null) {
            arrayList.addAll(c8.ma.a(new org.telegram.ui.Components.s6(new bh(b3Var, 19), i19), org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.y6));
        }
        org.telegram.ui.Cells.ma maVar = this.N1;
        if (maVar != null) {
            arrayList.addAll(c8.ma.a(new org.telegram.ui.Components.s6(new bh(maVar, 20), i19), org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.y6, org.telegram.ui.ActionBar.k6.I6, org.telegram.ui.ActionBar.k6.q7));
        }
        org.telegram.ui.Cells.m mVar = this.L1;
        if (mVar != null) {
            arrayList.addAll(c8.ma.a(new org.telegram.ui.Components.s6(new bh(mVar, 21), i19), org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.y6, org.telegram.ui.ActionBar.k6.I6, org.telegram.ui.ActionBar.k6.q7));
        }
        return arrayList;
    }

    public final float h4() {
        sv svVar = this.F3;
        if (svVar == null || !svVar.c()) {
            return 0.0f;
        }
        return this.F3.e;
    }

    public final void h5() {
        bi.q1 q1Var;
        sw swVar;
        try {
            jv jvVar = this.B1;
            if (jvVar != null && jvVar.getEditField() != null) {
                this.B1.getEditField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.k6.Ke));
            }
            NumberTextView numberTextView = this.h1;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.y8));
            }
            mw mwVar = this.z0;
            int i7 = 0;
            if (mwVar != null && (mwVar.getSelectorDrawable() instanceof GradientDrawable)) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                ((GradientDrawable) this.z0.getSelectorDrawable()).setColor(getThemedColor(kVar != null && kVar.v() ? org.telegram.ui.ActionBar.k6.ui : org.telegram.ui.ActionBar.k6.K8));
                this.z0.invalidate();
            }
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                if (this.W2 != 0 || this.Y2 != 0) {
                    kVar2.I(getThemedColor(org.telegram.ui.ActionBar.k6.Q8), false);
                    this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.k6.R8), true);
                }
                if (this.actionBar.v()) {
                    this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                }
                n5();
            }
            if (this.e0 != null) {
                while (true) {
                    vw[] vwVarArr = this.e0;
                    if (i7 >= vwVarArr.length) {
                        break;
                    }
                    vw vwVar = vwVarArr[i7];
                    if (vwVar != null && (swVar = vwVar.a) != null) {
                        swVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                    }
                    i7++;
                }
            }
            fw fwVar = this.C0;
            if (fwVar != null && (q1Var = fwVar.a0) != null) {
                q1Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            }
            li.w1 w1Var = this.C1;
            if (w1Var != null) {
                w1Var.setScrimViewBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            }
            fi.m3 m3Var = this.p0;
            if (m3Var != null) {
                m3Var.j(getThemedColor(org.telegram.ui.ActionBar.k6.tj));
            }
            fi.m3 m3Var2 = this.q0;
            if (m3Var2 != null) {
                m3Var2.j(getThemedColor(org.telegram.ui.ActionBar.k6.tj));
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
        if (this.z0 == null || this.inPreviewMode || this.q3) {
            return;
        }
        sv svVar = this.F3;
        if (svVar == null || !svVar.c()) {
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
                    this.n3 = false;
                    if (this.m3) {
                        this.m3 = false;
                        this.e0[0].setTranslationX(0.0f);
                        this.e0[1].setTranslationX(r2[0].getMeasuredWidth());
                    }
                    if (this.e0[0].h != this.z0.getDefaultTabId()) {
                        this.e0[0].h = this.z0.getDefaultTabId();
                        gv gvVar = this.e0[0].d;
                        gvVar.h = 0;
                        gvVar.f();
                        vw vwVar = this.e0[0];
                        vwVar.s = this.R0;
                        vwVar.d.f();
                    }
                    this.e0[1].setVisibility(8);
                    vw vwVar2 = this.e0[1];
                    vwVar2.h = 0;
                    gv gvVar2 = vwVar2.d;
                    gvVar2.h = 0;
                    gvVar2.f();
                    vw vwVar3 = this.e0[1];
                    vwVar3.s = this.R0;
                    vwVar3.d.f();
                    this.x = false;
                    if (this.fragmentView != null) {
                        boolean z15 = (this.isPaused || this.Q3 != null) ? false : z10;
                        if (!this.q3) {
                            aVar.a(false, z15);
                        }
                    }
                    int i7 = 0;
                    while (true) {
                        vw[] vwVarArr = this.e0;
                        if (i7 >= vwVarArr.length) {
                            break;
                        }
                        vw vwVar4 = vwVarArr[i7];
                        if (vwVar4.s == 0 && vwVar4.w == 2 && l4() && ((L0 = this.e0[i7].c.L0()) == 0 || L0 == 1)) {
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
                    boolean z17 = (this.isPaused || this.Q3 != null) ? false : z10;
                    if (!this.q3) {
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
                mw mwVar = this.z0;
                mwVar.h.clear();
                mwVar.j0.clear();
                mwVar.l0.clear();
                mwVar.m0.clear();
                mwVar.n0.clear();
                mwVar.o0.clear();
                mwVar.M = 0;
                int size2 = T0.size();
                int i10 = 0;
                while (i10 < size2) {
                    if (((org.telegram.messenger.vo) T0.get(i10)).e()) {
                        this.z0.a(i10, 0, org.telegram.messenger.id.M0(2131750808, str), null, false, true, ((org.telegram.messenger.vo) T0.get(i10)).p);
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
                            mw mwVar2 = this.z0;
                            if (mwVar2.h(mwVar2.k0.get(currentTabId, -1))) {
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
                    vw[] vwVarArr2 = this.e0;
                    if (i11 >= vwVarArr2.length) {
                        break;
                    }
                    if (vwVarArr2[i11].h >= T0.size()) {
                        this.e0[i11].h = T0.size() - 1;
                    }
                    this.e0[i11].a.setScrollingTouchSlop(1);
                    i11++;
                }
                mw mwVar3 = this.z0;
                mwVar3.F.setItemAnimator(z16 ? mwVar3.s0 : null);
                mwVar3.I.f();
                if (isEmpty) {
                    d5(z18);
                }
                mw mwVar4 = this.z0;
                int currentTabId2 = mwVar4.getCurrentTabId();
                ArrayList arrayList = mwVar4.h;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        z11 = false;
                        break;
                    } else {
                        if (((org.telegram.ui.Components.cz) arrayList.get(i12)).a == currentTabId2) {
                            z11 = ((org.telegram.ui.Components.cz) arrayList.get(i12)).f;
                            break;
                        }
                        i12++;
                    }
                }
                if (z11) {
                    mw mwVar5 = this.z0;
                    ArrayList arrayList2 = mwVar5.h;
                    if (!arrayList2.isEmpty()) {
                        r52 = 0;
                        mwVar5.f((org.telegram.ui.Components.cz) arrayList2.get(0), 0);
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
        sv svVar;
        return (this.j2 || (svVar = this.F3) == null || svVar.getFragment() == null) ? i0.a.h(getThemedColor(org.telegram.ui.ActionBar.k6.d6)) > 0.699999988079071d : this.F3.getFragment().isLightStatusBar();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final di.y6 j4() {
        return getMessagesController().P1();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j5(boolean z9, ArrayList arrayList, ArrayList arrayList2, boolean z10, boolean z11) {
        fw fwVar;
        boolean z12;
        org.telegram.ui.Components.u61 u61Var;
        if (!this.q3 || this.l2 || (fwVar = this.C0) == null) {
            return;
        }
        ArrayList<jg.o0> currentSearchFilters = fwVar.getCurrentSearchFilters();
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

    @Override // org.telegram.ui.ie0
    public final ri.f k() {
        return this.k4;
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
            pw pwVar = (pw) this.fragmentView;
            pwVar.removeView(undoViewArr[0]);
            pwVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void k5() {
        float f10 = (((-this.f4) - this.i4) - this.u1) - this.v1;
        org.telegram.ui.Components.q00 q00Var = this.t0;
        if (q00Var != null) {
            q00Var.setTranslationY(f10);
        }
        org.telegram.ui.Components.q00 q00Var2 = this.u0;
        if (q00Var2 != null) {
            q00Var2.setTranslationY(f10 - org.telegram.messenger.g0.L(52.0f));
            fi.m3 m3Var = this.p0;
            if (m3Var != null) {
                m3Var.setTranslationY(f10 - org.telegram.messenger.g0.L(52.0f));
            }
        }
    }

    public final boolean l4() {
        if (this.l2 || this.R0 != 0 || this.Y2 != 0 || this.W2 != 0) {
            return false;
        }
        org.telegram.messenger.qp messagesController = getMessagesController();
        messagesController.getClass();
        return org.telegram.messenger.iz.q1 && messagesController.Q.f(2305843009213693952L | ((long) 1)) != null;
    }

    public final void l5(boolean z9) {
        boolean z10 = this.l2;
        boolean z11 = (!z10 || this.R0 == 10) && this.W2 == 0 && this.Y2 == 0 && !this.inPreviewMode && (!this.j2 || z10) && !this.T3;
        org.telegram.ui.Components.q00 q00Var = this.t0;
        if (q00Var != null) {
            q00Var.e(z11, z9);
        }
        org.telegram.ui.Components.q00 q00Var2 = this.u0;
        if (q00Var2 != null) {
            q00Var2.e(z11, z9);
        }
    }

    public final boolean m4() {
        ArrayList arrayList = this.D2;
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
                int i10 = this.d2;
                boolean z13 = i10 == 3 || i10 == 5;
                this.o0.setSubtext(org.telegram.messenger.id.M0(z12 ? z13 ? 2131748609 : 2131748608 : 2131748607, null));
                this.n0.b(z12, z13, z9);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n4(boolean z9) {
        boolean z10;
        this.actionBar.u();
        this.I2.clear();
        org.telegram.ui.ActionBar.y1 y1Var = this.e1;
        int i7 = 1;
        if (y1Var != null) {
            y1Var.c(true, 0.0f);
        }
        mw mwVar = this.z0;
        if (mwVar != null) {
            mwVar.b(org.telegram.ui.ActionBar.k6.K8, org.telegram.ui.ActionBar.k6.I8, org.telegram.ui.ActionBar.k6.J8, org.telegram.ui.ActionBar.k6.L8, org.telegram.ui.ActionBar.k6.d6);
        }
        ValueAnimator valueAnimator = this.v3;
        Object obj = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.v3 = null;
        }
        if (this.u3 == 0.0f) {
            return;
        }
        O4(-f4());
        int i10 = 0;
        int i11 = 0;
        while (true) {
            vw[] vwVarArr = this.e0;
            if (i11 >= vwVarArr.length) {
                break;
            }
            vw vwVar = vwVarArr[i11];
            if (vwVar != null) {
                vwVar.a.I0(true);
            }
            i11++;
        }
        float max = Math.max(0.0f, org.telegram.messenger.g0.L((this.K ? 81 : 0) + 48) + this.N);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.u3, 0.0f);
        this.v3 = ofFloat;
        ofFloat.addUpdateListener(new gu(this, max, i7));
        this.v3.addListener(new aw(this, max, i10));
        this.v3.setInterpolator(org.telegram.ui.Components.xq.f);
        this.v3.setDuration(200L);
        this.v3.start();
        this.Y0 = false;
        ArrayList arrayList = this.a1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                org.telegram.messenger.vo voVar = (org.telegram.messenger.vo) arrayList.get(i12);
                gz.z0(voVar, voVar.g, voVar.b, voVar.c, voVar.n, voVar.m, voVar.h, voVar.i, voVar.j, false, false, true, true, false, this, null);
                i12++;
                arrayList = arrayList;
                size = size;
                i10 = 0;
                i7 = 1;
                obj = null;
            }
            arrayList.clear();
        }
        if (this.Z0) {
            getMessagesController().m4(this.W2, 0L, null);
            z10 = 0;
            this.Z0 = false;
        } else {
            z10 = 0;
        }
        f5(true);
        if (this.e0 != null) {
            int i13 = z10;
            while (true) {
                vw[] vwVarArr2 = this.e0;
                if (i13 >= vwVarArr2.length) {
                    break;
                }
                vwVarArr2[i13].d.H = z10;
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
        if (!this.s3 || this.actionBar == null) {
            return;
        }
        int themedColor = getThemedColor((this.W2 == 0 && this.Y2 == 0) ? org.telegram.ui.ActionBar.k6.v8 : org.telegram.ui.ActionBar.k6.O8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.k6.y8;
        kVar.D(i0.a.f(this.x1, themedColor, getThemedColor(i7)), false);
        this.actionBar.D(i0.a.f(this.x1, getThemedColor(i7), getThemedColor(i7)), true);
        this.actionBar.C(i0.a.f(this.x1, getThemedColor((this.W2 == 0 && this.Y2 == 0) ? org.telegram.ui.ActionBar.k6.t8 : org.telegram.ui.ActionBar.k6.N8), getThemedColor(org.telegram.ui.ActionBar.k6.z8)), false);
    }

    public final void o4(boolean z9) {
        if (this.F3.c()) {
            z9 = true;
        }
        if (z9 && this.b2) {
            return;
        }
        this.T3 = z9;
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
        jv jvVar = this.B1;
        ArrayList arrayList = this.I2;
        if (jvVar == null) {
            if (this.R0 == 10) {
                o4(arrayList.isEmpty());
                return;
            }
            return;
        }
        this.n.a(!arrayList.isEmpty(), true);
        p5();
        if (arrayList.isEmpty()) {
            String M0 = org.telegram.messenger.id.M0((this.R0 == 3 && this.f2 == null) ? 2131750576 : 2131745672, null);
            if (this.P3 == arrayList.isEmpty()) {
                this.actionBar.setTitle(M0);
            } else {
                this.actionBar.K(M0, true, 350L, org.telegram.ui.Components.xq.h);
            }
            if (this.B1.getTag() != null) {
                this.B1.l0(false, false, false);
                this.B1.L();
                this.B1.setTag(null);
                this.fragmentView.requestLayout();
            }
        } else {
            if (this.B1.getTag() == null) {
                if (!m4() && this.E2 == null) {
                    this.B1.setFieldText("");
                }
                this.B1.setTag(1);
                if (!this.V3 && (po0Var = this.G2) != null) {
                    this.V3 = true;
                    String M02 = org.telegram.messenger.id.M0(2131745432, null);
                    po0Var.j();
                    po0Var.F = M02;
                    fi.i1 i1Var = po0Var.a[0];
                    if (M02 != null) {
                        ((org.telegram.ui.ActionBar.k5) i1Var.f).l(M02, false);
                    }
                    org.telegram.ui.Components.ob0 ob0Var = new org.telegram.ui.Components.ob0(po0Var, 26);
                    po0Var.G = ob0Var;
                    org.telegram.messenger.g0.i3(ob0Var, 1000L);
                }
            }
            this.C1.e(Math.max(1, arrayList.size()), true);
            int i7 = this.S0 + (!TextUtils.isEmpty(this.B1.getFieldText()) ? 1 : 0);
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
            this.C1.i(i7, j3, true);
            this.B1.T1();
            if (this.P3 == arrayList.isEmpty()) {
                this.actionBar.setTitle(org.telegram.messenger.id.G(arrayList.size(), "Recipient", new Object[0]));
            } else {
                this.actionBar.K(org.telegram.messenger.id.G(arrayList.size(), "Recipient", new Object[0]), false, 350L, org.telegram.ui.Components.xq.h);
            }
        }
        this.P3 = arrayList.isEmpty();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        if (hasShownSheet()) {
            if (z9) {
                closeSheet();
                return false;
            }
        } else if (!this.F3.c() || !this.F3.getFragment().onBackPressed(z9)) {
            org.telegram.ui.Components.k60 k60Var = this.L0;
            if (k60Var == null) {
                mw mwVar = this.z0;
                if (mwVar == null || !mwVar.n) {
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar == null || !kVar.v()) {
                        if (!this.b.f) {
                            mw mwVar2 = this.z0;
                            if (mwVar2 != null && mwVar2.getVisibility() == 0 && !this.h3) {
                                mw mwVar3 = this.z0;
                                if (!mwVar3.O && !this.m3) {
                                    ArrayList arrayList = mwVar3.h;
                                    if (!arrayList.isEmpty() && mwVar3.L != ((org.telegram.ui.Components.cz) arrayList.get(0)).a) {
                                        if (z9) {
                                            mw mwVar4 = this.z0;
                                            ArrayList arrayList2 = mwVar4.h;
                                            if (!arrayList2.isEmpty()) {
                                                mwVar4.f((org.telegram.ui.Components.cz) arrayList2.get(0), 0);
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                            jv jvVar = this.B1;
                            if (jvVar == null || !jvVar.s0()) {
                                pv pvVar = this.E0;
                                if (pvVar.O != 0 || pvVar.S.L0() == 0) {
                                    return super.onBackPressed(z9);
                                }
                                pvVar.h.y0(0);
                                return false;
                            }
                            if (z9) {
                                this.B1.k0(true);
                            }
                        } else if (z9) {
                            this.X.r.getText().clear();
                            this.Y.b(false);
                            this.X.r.clearFocus();
                            return false;
                        }
                    } else if (z9) {
                        fw fwVar = this.C0;
                        if (fwVar != null && fwVar.getVisibility() == 0) {
                            this.C0.R(false);
                        }
                        n4(true);
                        return false;
                    }
                } else if (z9) {
                    mwVar.setIsEditing(false);
                    U4(false);
                    return false;
                }
            } else if (z9) {
                k60Var.u();
                this.L0 = null;
                return false;
            }
        } else if (z9) {
            this.F3.a();
            fw fwVar2 = this.C0;
            if (fwVar2 != null) {
                fwVar2.S();
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyHidden() {
        bi.ec ecVar;
        mw mwVar;
        if (this.V1) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.l(true);
            }
            TLObject tLObject = this.X1;
            if (tLObject != null) {
                fw fwVar = this.C0;
                if (fwVar != null) {
                    fwVar.d0.Q(this.W1, tLObject);
                }
                this.X1 = null;
            }
            this.V1 = false;
        }
        if (!this.K && (mwVar = this.z0) != null && mwVar.getVisibility() == 0 && this.r.f) {
            int i7 = (int) (-this.N);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
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
            boolean isEmpty = d4(this.currentAccount, this.R0, this.W2, false).isEmpty();
            if (z9 && isEmpty) {
                org.telegram.messenger.qp.e1().edit().putBoolean("archivehint", false).commit();
                z9 = false;
            }
            if (z9) {
                e12.edit().putBoolean("archivehint", false).commit();
                S4();
            }
        }
        if (this.r0 && !this.s0 && (m3Var = this.p0) != null && this.N3) {
            this.s0 = true;
            this.r0 = false;
            m3Var.w();
        }
        org.telegram.messenger.g0.i3(new cu(this, 20), 200L);
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
        if (this.W2 == 0 && this.Y2 == 0 && (u1Var = this.T1) != null && dialog == u1Var && getParentActivity() != null) {
            u3(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
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
            this.W2 = this.arguments.getInt("folderId", 0);
            long j3 = this.arguments.getLong("community_id", 0L);
            this.Y2 = j3;
            if (j3 != 0) {
                this.Z2 = getMessagesController().M0(Long.valueOf(this.Y2));
                this.a3 = getMessagesController().N0(this.Y2);
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
            this.U1 = org.telegram.messenger.qp.f1().getBoolean("askAboutContacts", true);
            org.telegram.messenger.iz.u();
        }
        org.telegram.messenger.qs notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        this.J3 = new ab.b0(notificationCenter, this);
        if (this.n2 == null) {
            this.d2 = getConnectionsManager().getConnectionState();
            this.J3.e(org.telegram.messenger.qs.i4);
            if (!this.l2) {
                this.J3.e(org.telegram.messenger.qs.I4);
                this.J3.e(org.telegram.messenger.qs.A4);
                this.J3.c(org.telegram.messenger.qs.P2);
                this.J3.c(org.telegram.messenger.qs.d2);
            }
            ab.b0 b0Var = this.J3;
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
            this.J3.e(org.telegram.messenger.qs.n0);
        }
        ab.b0 b0Var2 = this.J3;
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
        if (this.R0 == 0) {
            this.J3.c(org.telegram.messenger.qs.z5);
            this.J3.c(org.telegram.messenger.qs.P1);
        }
        u4(getAccountInstance());
        di.y6 P1 = getMessagesController().P1();
        if (!P1.A) {
            P1.W();
            if (!P1.s) {
                ConnectionsManager.getInstance(P1.a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new di.x5(P1, r3));
            }
        }
        getMessagesController().b3(this.W2);
        if (this.Q3 != null && !getMessagesStorage().Q) {
            mt mtVar = this.Q3;
            if (mtVar.getParent() != null) {
                ((ViewGroup) mtVar.getParent()).removeView(mtVar);
            }
            this.Q3 = null;
        }
        if (q4()) {
            di.y6 P12 = getMessagesController().P1();
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
        if (this.Y2 != 0) {
            getMessagesController().V2(0, this.Y2, true);
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
        this.h4 = this.W ? org.telegram.messenger.g0.L(72.0f) : 0;
        this.i4 = this.W ? org.telegram.messenger.g0.L(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        ab.b0 b0Var = this.J3;
        if (b0Var != null) {
            b0Var.b();
            this.J3 = null;
        }
        jv jvVar = this.B1;
        if (jvVar != null) {
            jvVar.B0();
        }
        org.telegram.ui.Components.po0 po0Var = this.G2;
        if (po0Var != null) {
            po0Var.j();
        }
        org.telegram.ui.Components.l51 l51Var = this.H2;
        if (l51Var != null) {
            org.telegram.messenger.g0.r(l51Var);
            this.H2 = null;
        }
        UndoView undoView = this.y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.p3.e();
        this.C2 = null;
        int i7 = org.telegram.ui.Components.e10.i1;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPanTranslationUpdate(float f10) {
        if (this.e0 == null) {
            return;
        }
        this.J0 = f10;
        jv jvVar = this.B1;
        int i7 = 0;
        if (jvVar == null || !jvVar.s0()) {
            while (true) {
                vw[] vwVarArr = this.e0;
                if (i7 >= vwVarArr.length) {
                    break;
                }
                vwVarArr[i7].setTranslationY(f10);
                i7++;
            }
            if (!this.l2) {
                this.actionBar.setTranslationY(f10);
                org.telegram.ui.Components.cc ccVar = this.o3;
                if (ccVar != null) {
                    ccVar.l();
                }
            }
            fw fwVar = this.C0;
            if (fwVar != null) {
                fwVar.setTranslationY(this.J0 + this.I0);
                return;
            }
            return;
        }
        this.fragmentView.setTranslationY(f10);
        while (true) {
            vw[] vwVarArr2 = this.e0;
            if (i7 >= vwVarArr2.length) {
                break;
            }
            vwVarArr2[i7].setTranslationY(0.0f);
            i7++;
        }
        if (!this.l2) {
            this.actionBar.setTranslationY(0.0f);
            org.telegram.ui.Components.cc ccVar2 = this.o3;
            if (ccVar2 != null) {
                ccVar2.l();
            }
        }
        fw fwVar2 = this.C0;
        if (fwVar2 != null) {
            fwVar2.setTranslationY(this.I0);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.cc ccVar = this.S;
        if (ccVar != null) {
            ccVar.b();
            this.S = null;
        }
        sv svVar = this.F3;
        if (svVar != null) {
            svVar.r = true;
            zv zvVar = svVar.a;
            if (zvVar != null) {
                zvVar.onPause();
            }
        }
        org.telegram.ui.Components.k60 k60Var = this.L0;
        if (k60Var != null) {
            k60Var.u();
        }
        jv jvVar = this.B1;
        if (jvVar != null) {
            jvVar.D0();
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
            vw[] vwVarArr = this.e0;
            if (i7 >= vwVarArr.length) {
                return;
            }
            vwVarArr[i7].d.getClass();
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
                            dh0.I0();
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
                            org.telegram.messenger.g0.h3(new cu(this, 19));
                            getContactsController().l();
                            break;
                        } else {
                            SharedPreferences.Editor edit = org.telegram.messenger.qp.f1().edit();
                            this.U1 = false;
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
        vw vwVar;
        gv gvVar;
        org.telegram.ui.Components.yl0 yl0Var;
        bi.ec ecVar;
        super.onResume();
        pv pvVar = this.E0;
        if (pvVar != null) {
            ArrayList arrayList = pvVar.y;
            di.y6 y6Var = pvVar.s;
            y6Var.l(y6Var.g);
            y6Var.l(y6Var.h);
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                TL_stories.PeerStories y10 = y6Var.y(((di.n) arrayList.get(i7)).c);
                if (y10 != null) {
                    y6Var.a0(y10);
                }
            }
        }
        sv svVar = this.F3;
        if (svVar != null) {
            svVar.r = false;
            zv zvVar = svVar.a;
            if (zvVar != null) {
                zvVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (ecVar = this.K0) != null && ecVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        if (this.e0 != null) {
            int i10 = 0;
            while (true) {
                vw[] vwVarArr = this.e0;
                if (i10 >= vwVarArr.length) {
                    break;
                }
                vwVarArr[i10].d.f();
                i10++;
            }
        }
        jv jvVar = this.B1;
        if (jvVar != null) {
            jvVar.E0();
        }
        int i11 = 4;
        long j3 = 0;
        if (!this.l2 && this.W2 == 0 && this.Y2 == 0) {
            getMediaDataController().B(4);
        }
        fw fwVar = this.C0;
        if (fwVar != null && (yl0Var = fwVar.d0) != null) {
            yl0Var.f();
        }
        boolean z9 = this.t2 || getUserConfig().Z == null;
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z9 && this.W2 == 0 && this.Y2 == 0 && this.c2 && !this.l2) {
            int i12 = Build.VERSION.SDK_INT;
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.c2 = false;
                boolean z10 = parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0;
                boolean z11 = (i12 <= 28 || org.telegram.messenger.r2.b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0;
                boolean z12 = i12 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0;
                org.telegram.messenger.i4 i4Var = new org.telegram.messenger.i4(this, z12, z10, z11, parentActivity);
                if (this.t2 && (z10 || z12)) {
                    j3 = 4000;
                }
                org.telegram.messenger.g0.i3(i4Var, j3);
            }
        } else if (!this.l2 && this.W2 == 0 && this.Y2 == 0 && org.telegram.messenger.as.i() && !org.telegram.messenger.as.g()) {
            if (getParentActivity() == null) {
                return;
            }
            if (!org.telegram.messenger.qp.f1().getBoolean("askedAboutMiuiLockscreen", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                int i13 = org.telegram.ui.ActionBar.k6.L5;
                alertDialog$Builder.m(R.raw.permission_request_apk, 72, getThemedColor(i13), null);
                alertDialog$Builder.n(i13, getResourceProvider());
                String M0 = org.telegram.messenger.id.M0(2131747299, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.T = M0;
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747301, null), new fu(this, 10));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131751772, null), new org.telegram.ui.Components.il0(17));
                showDialog(u1Var);
            }
        } else if (this.W2 == 0 && this.Y2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
            if (getParentActivity() == null) {
                return;
            }
            if (!org.telegram.messenger.qp.f1().getBoolean("askedAboutFSILockscreen", false)) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                int i14 = org.telegram.ui.ActionBar.k6.L5;
                alertDialog$Builder2.m(R.raw.permission_request_apk, 72, getThemedColor(i14), null);
                alertDialog$Builder2.n(i14, getResourceProvider());
                String M02 = org.telegram.messenger.id.M0(2131747315, null);
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                u1Var2.T = M02;
                alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131747301, null), new fu(this, 11));
                alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131751772, null), new org.telegram.ui.Components.il0(18));
                showDialog(u1Var2);
            }
        }
        V4();
        if (this.e0 != null) {
            int i15 = 0;
            while (true) {
                vw[] vwVarArr2 = this.e0;
                if (i15 >= vwVarArr2.length) {
                    break;
                }
                vw vwVar2 = vwVarArr2[i15];
                if (vwVar2.s == 0 && vwVar2.w == 2 && vwVar2.c.L0() == 0 && l4()) {
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
        if (this.q3) {
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        }
        u5(0, false);
        m5(false, true);
        t5(false);
        D3();
        N3();
        if (this.z0 == null || (vwVar = this.e0[0]) == null || (gvVar = vwVar.d) == null) {
            return;
        }
        int i16 = gvVar.h;
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
        } else if (this.Y3 && this.Z3 == null) {
            R4(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.f1.setColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            y3();
            h5();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        bi.ec ecVar;
        ww wwVar;
        sv svVar = this.F3;
        if (svVar == null || !svVar.c()) {
            if (z9 && (ecVar = this.K0) != null && ecVar.getVisibility() == 0) {
                this.K0.setVisibility(8);
                this.K0.setBackground(null);
            }
            if (z9 && this.t2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).v0.c(false);
                }
            }
        } else {
            this.F3.getFragment().onTransitionAnimationEnd(z9, z10);
        }
        if (!z9 && (wwVar = this.X2) != null) {
            wwVar.removeSelfFromStack();
        }
        N3();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationProgress(boolean z9, float f10) {
        sv svVar = this.F3;
        if (svVar == null || !svVar.c()) {
            bi.ec ecVar = this.K0;
            if (ecVar != null && ecVar.getVisibility() == 0) {
                if (z9) {
                    this.K0.setAlpha(1.0f - f10);
                } else {
                    this.K0.setAlpha(f10);
                }
            }
        } else {
            this.F3.getFragment().onTransitionAnimationProgress(z9, f10);
        }
        N3();
    }

    public final void p5() {
        org.telegram.ui.Components.po0 po0Var = this.G2;
        if (po0Var == null) {
            return;
        }
        int i7 = this.currentAccount;
        po0Var.h(i7);
        po0Var.d = org.telegram.messenger.p10.i(org.telegram.messenger.c.a(i7).a).e();
        ArrayList arrayList = po0Var.f;
        arrayList.clear();
        ArrayList arrayList2 = this.I2;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        fi.i1 i1Var = po0Var.a[0];
        if (po0Var.b == 1) {
            ((org.telegram.ui.ActionBar.k5) i1Var.e).l(po0Var.c(i1Var), false);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void prepareFragmentToSlide(boolean z9, boolean z10) {
        if (!z9 && z10) {
            this.Y3 = true;
            N4(true);
        } else {
            this.Z3 = null;
            this.Y3 = false;
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
                vw[] vwVarArr = this.e0;
                if (i7 >= vwVarArr.length) {
                    break;
                }
                vwVarArr[i7].d.getClass();
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
        org.telegram.ui.Components.cc.e();
        return presentFragment;
    }

    public final boolean q4() {
        return this.W2 == 1;
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
        org.telegram.ui.Components.g5 g5Var;
        pv pvVar = this.E0;
        org.telegram.ui.Components.g5 g5Var2 = null;
        if (pvVar != null && (g5Var = pvVar.a0) != null && pvVar.q0 != null) {
            Long h = org.telegram.messenger.t10.h(user);
            if (h != null) {
                boolean z10 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                g5Var.j(h.longValue(), z9);
                g5Var.m(z10, z9);
            } else {
                if (user != null) {
                    org.telegram.messenger.qp.s1(pvVar.f);
                    if (org.telegram.messenger.qp.B2(user)) {
                        if (pvVar.N0 == null) {
                            pvVar.N0 = pvVar.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                            pvVar.N0 = new di.h(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), pvVar.N0);
                        }
                        Drawable drawable = pvVar.N0;
                        int i7 = org.telegram.ui.ActionBar.k6.ni;
                        ww wwVar = pvVar.e0;
                        org.telegram.ui.ActionBar.r6.y(pvVar, drawable, i7, wwVar != null ? wwVar.getResourceProvider() : null, PorterDuff.Mode.MULTIPLY);
                        g5Var.g(pvVar.N0, z9);
                        g5Var.m(false, z9);
                    }
                }
                g5Var.g(null, z9);
                g5Var.m(false, z9);
            }
            g5Var.k(Integer.valueOf(pvVar.f(org.telegram.ui.ActionBar.k6.ni)));
            pvVar.W.invalidate();
        }
        if (this.D3 == null || this.actionBar == null) {
            return;
        }
        Long h7 = org.telegram.messenger.t10.h(user);
        this.B3 = null;
        if (h7 != null) {
            boolean z11 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
            this.D3.j(h7.longValue(), z9);
            this.D3.m(z11, z9);
            if (z11) {
                this.B3 = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
            }
            this.actionBar.setRightDrawableOnClick(new eu(this, 1));
            q11.t(this.currentAccount);
        } else {
            if (user != null) {
                org.telegram.messenger.qp.s1(this.currentAccount);
                if (org.telegram.messenger.qp.B2(user)) {
                    if (this.K3 == null) {
                        this.K3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                        this.K3 = new dw(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), this.K3);
                    }
                    Drawable drawable2 = this.K3;
                    int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.ni);
                    this.w4 = themedColor;
                    drawable2.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                    this.D3.g(this.K3, z9);
                    this.D3.m(false, z9);
                    this.actionBar.setRightDrawableOnClick(new eu(this, 2));
                    q11.t(this.currentAccount);
                }
            }
            this.D3.g(null, z9);
            this.D3.m(false, z9);
            this.actionBar.setRightDrawableOnClick(null);
        }
        org.telegram.ui.Components.g5 g5Var3 = this.D3;
        int i10 = org.telegram.ui.ActionBar.k6.ni;
        g5Var3.k(Integer.valueOf(getThemedColor(i10)));
        org.telegram.ui.Cells.o oVar = this.E3;
        if (oVar != null) {
            oVar.setColor(getThemedColor(i10));
        }
        uv uvVar = this.M0;
        if (uvVar == null || !(uvVar.getContentView() instanceof q11)) {
            return;
        }
        org.telegram.ui.ActionBar.k5 titleTextView = this.actionBar.getTitleTextView();
        q11 q11Var = (q11) this.M0.getContentView();
        if (titleTextView != null) {
            Drawable rightDrawable = titleTextView.getRightDrawable();
            org.telegram.ui.Components.g5 g5Var4 = this.D3;
            if (rightDrawable == g5Var4) {
                g5Var2 = g5Var4;
            }
        }
        q11Var.y(g5Var2, titleTextView);
    }

    public final boolean s3(long j3, View view) {
        if (this.l2 && getMessagesController().t2(j3)) {
            return false;
        }
        Long valueOf = Long.valueOf(j3);
        ArrayList arrayList = this.I2;
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
        if ((i7 == 7 || i7 == 8) && (!this.actionBar.v() || this.actionBar.w(null))) {
            voVar = getMessagesController().M[this.e0[0].s == 8 ? (char) 1 : (char) 0];
        }
        return voVar != null ? voVar.j.indexOfKey(dialog.id) >= 0 : dialog.pinned;
    }

    public final void s5() {
        fi.m3 m3Var;
        boolean W4 = getMessagesController().W4();
        if (this.N3 != W4) {
            k5();
            if (!this.N3 && W4 && (m3Var = this.p0) != null) {
                m3Var.w();
            }
            this.N3 = W4;
        }
        org.telegram.ui.Components.q00 q00Var = this.t0;
        if (q00Var == null) {
            return;
        }
        if (this.R0 == 10) {
            q00Var.setImageResource(R.drawable.floating_check);
            this.t0.setContentDescription(org.telegram.messenger.id.M0(2131751355, null));
        } else {
            q00Var.setImageResource(R.drawable.filled_fab_compose_32);
            this.t0.setContentDescription(org.telegram.messenger.id.M0(2131748271, null));
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void setInPreviewMode(boolean z9) {
        super.setInPreviewMode(z9);
        pv pvVar = this.E0;
        if (pvVar != null) {
            if (!this.G0 || z9) {
                pvVar.setVisibility(8);
            } else {
                pvVar.setVisibility(0);
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
        uv uvVar;
        org.telegram.ui.Components.g5 g5Var;
        super.setTitleOverlayText(str, i7, runnable);
        if (this.actionBar != null && (uvVar = this.M0) != null && (uvVar.getContentView() instanceof q11)) {
            org.telegram.ui.ActionBar.k5 titleTextView = this.actionBar.getTitleTextView();
            q11 q11Var = (q11) this.M0.getContentView();
            if (titleTextView != null) {
                Drawable rightDrawable = titleTextView.getRightDrawable();
                g5Var = this.D3;
            }
            g5Var = null;
            q11Var.y(g5Var, titleTextView);
        }
        pv pvVar = this.E0;
        if (pvVar != null) {
            org.telegram.ui.Components.j6 j6Var = pvVar.T;
            pvVar.U.b(i7 == 2131751805 ? org.telegram.messenger.g0.I2(org.telegram.messenger.id.M0(2131744116, null), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(2.0f)) : null, true);
            if (str != null) {
                pvVar.g0 = true;
                if (pvVar.h0 != i7) {
                    pvVar.h0 = i7;
                    j6Var.c(org.telegram.messenger.id.M0(i7, str), !org.telegram.messenger.id.a0, true);
                }
            } else {
                pvVar.g0 = false;
                pvVar.h0 = 0;
                j6Var.c(pvVar.f0, !org.telegram.messenger.id.a0, true);
            }
            pvVar.a.a(pvVar.g0, true);
            pvVar.L0.x(j6Var);
        }
    }

    public final void t3(jg.o0 o0Var) {
        fw fwVar;
        if (!this.q3 || (fwVar = this.C0) == null) {
            return;
        }
        ArrayList arrayList = fwVar.C0;
        if (!arrayList.isEmpty()) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (o0Var.b((jg.o0) arrayList.get(i7))) {
                    return;
                }
            }
        }
        arrayList.add(o0Var);
        lw lwVar = this.X;
        lwVar.F.add(o0Var);
        lwVar.I = r1.size() - 1;
        lwVar.e();
        this.X.r.getText().clear();
        j5(true, null, null, false, true);
    }

    public final boolean t4() {
        return this.C2 == null && this.n2 == null;
    }

    public final void t5(boolean z9) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        di.y6 j42;
        ArrayList arrayList;
        if (this.E0 == null || this.I != null) {
            return;
        }
        sv svVar = this.F3;
        if ((svVar != null && svVar.c()) || this.q3 || (kVar = this.actionBar) == null || kVar.v() || this.l2) {
            return;
        }
        fi.va vaVar = fi.va.F2;
        int i7 = 0;
        if ((vaVar != null && vaVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().J0)) {
            z9 = false;
        }
        int i10 = 1;
        boolean z11 = !q4() && j4().I();
        if (this.Y2 != 0) {
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
                ofFloat.addUpdateListener(new ii(i10, this));
                this.J.addListener(new va(this, 25));
                this.J.setDuration(200L);
                this.J.setInterpolator(org.telegram.ui.Components.xq.f);
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
            ofFloat2.addUpdateListener(new ew(this, f10, z10, f42));
            this.I.addListener(new yv(this, z10, i11));
            this.I.setDuration(200L);
            this.I.setInterpolator(org.telegram.ui.Components.xq.f);
            this.I.start();
            return;
        }
        this.K = z10;
        pv pvVar = this.E0;
        if ((z10 || this.L) && !isInPreviewMode()) {
            i12 = 0;
        }
        pvVar.setVisibility(i12);
        if (z10) {
            this.y3 = -org.telegram.messenger.g0.L(81.0f);
            O4(-f4());
        } else {
            O4(0.0f);
        }
        while (true) {
            vw[] vwVarArr = this.e0;
            if (i7 >= vwVarArr.length) {
                break;
            }
            vw vwVar = vwVarArr[i7];
            if (vwVar != null) {
                vwVar.a.requestLayout();
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
        if (this.W2 == 0 && this.Y2 == 0 && Build.VERSION.SDK_INT >= 33 && dh0.J0(parentActivity)) {
            if (z9) {
                showDialog(new dh0(parentActivity, !c8.ia.a(), new ru(parentActivity, 1)));
                return;
            }
            arrayList.add("android.permission.POST_NOTIFICATIONS");
        }
        if (getUserConfig().U && this.U1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z9) {
                org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.v4.v(parentActivity, new iu(this, 1)).a;
                this.T1 = u1Var;
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
        if (this.S1) {
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
                fw fwVar = this.C0;
                recyclerView = fwVar != null ? fwVar.a0 : null;
            } else {
                vw[] vwVarArr = this.e0;
                if (vwVarArr != null) {
                    sw swVar = i14 < vwVarArr.length ? vwVarArr[i14].a : null;
                    if (swVar == null || vwVarArr[i14].getVisibility() == 0) {
                        r6 = swVar != null ? this.e0[i14] : null;
                        recyclerView = swVar;
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
                        ArrayList arrayList = this.I2;
                        if (z10 && (this.C0 == null || recyclerView.getAdapter() != this.C0.d0)) {
                            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) childAt;
                            int i17 = org.telegram.messenger.qp.C8;
                            if ((i7 & i12) != 0) {
                                t2Var.a0(this.actionBar.v(), true);
                                if (this.S1) {
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
                                    t2Var.setDialogSelected(t2Var.getDialogId() == this.p2.a);
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
                                if (!this.S1 && (childAt instanceof org.telegram.ui.Components.pj0)) {
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
                        if (!this.S1) {
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

    @Override // org.telegram.ui.ie0
    public final void v() {
        J4(true, true);
    }

    public final void v3(CharSequence charSequence) {
        if (this.B1 == null) {
            return;
        }
        if (this.D2 == null && this.E2 == null && this.F2 == null) {
            return;
        }
        int i7 = 0;
        if (this.G2 == null) {
            org.telegram.ui.Components.po0 po0Var = new org.telegram.ui.Components.po0(getParentActivity(), getResourceProvider());
            this.G2 = po0Var;
            po0Var.setLayoutClickListener(new eu(this, i7));
            this.G2.setOnModeChangeListener(new fu(this, i7));
            jv jvVar = this.B1;
            org.telegram.ui.Components.po0 po0Var2 = this.G2;
            if (po0Var2 == null) {
                jvVar.getClass();
            } else {
                jvVar.G1 = po0Var2;
                jvVar.addView(po0Var2, 0, c8.ha.e(-1, 48, 51));
                jvVar.g3 = false;
                jvVar.I();
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.G2.getLayoutParams();
            layoutParams.rightMargin = -this.B1.getPaddingRight();
            this.G2.setLayoutParams(layoutParams);
        }
        if (m4()) {
            this.G2.i(this.currentAccount, this.D2);
        } else {
            String str = this.E2;
            if (str != null) {
                org.telegram.ui.Components.po0 po0Var3 = this.G2;
                po0Var3.g(this.currentAccount);
                if (!str.isEmpty()) {
                    po0Var3.e(str, true);
                }
            } else {
                CharSequence charSequence2 = this.F2;
                if (charSequence2 != null) {
                    org.telegram.ui.Components.po0 po0Var4 = this.G2;
                    po0Var4.g(this.currentAccount);
                    if (charSequence2.length() > 0) {
                        po0Var4.e(charSequence2, true);
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.B1.setFieldText(charSequence);
        }
        this.B1.setOverrideHint(org.telegram.messenger.id.M0(m4() ? 2131754454 : 2131745465, null));
        H3();
        if (this.G2.getMode() != 0) {
            this.B1.y1(false, false);
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
        if ((i10 == 7 || i10 == 8) && (!this.actionBar.v() || this.actionBar.w(null))) {
            voVar = getMessagesController().M[this.e0[0].s == 8 ? (char) 1 : (char) 0];
        }
        int i11 = -1;
        if (voVar != null) {
            int i12 = voVar.g;
            int i13 = org.telegram.messenger.qp.C8;
            if ((i12 & 64) != 0 && !voVar.a(this.currentAccount, dialog)) {
                M4(true, true);
                z3();
                if (this.R1 != null) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= this.R1.size()) {
                            break;
                        }
                        if (((TLRPC.Dialog) this.R1.get(i14)).id == j10) {
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
            this.R1.remove(i15);
            this.e0[0].y.D();
            this.e0[0].q(true);
        }
    }

    public final boolean v5(long j3) {
        TLRPC.Chat M0;
        jv jvVar;
        if ((this.S0 <= 1 && ((jvVar = this.B1) == null || jvVar.getVisibility() != 0 || TextUtils.isEmpty(this.B1.getFieldText()))) || !org.telegram.messenger.m5.z(j3) || (M0 = getMessagesController().M0(Long.valueOf(-j3))) == null || org.telegram.messenger.t3.N(M0) || !M0.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.v4.r0(this, org.telegram.messenger.id.M0(2131745313, null), org.telegram.messenger.id.M0(2131745305, null), null);
        return false;
    }

    public final int w3() {
        if (this.B1 != null) {
            return (int) (this.y1.getInputBubbleHeight() + this.w.d() + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(2.0f));
        }
        if (this.Y2 == 0) {
            return this.f4 + this.h4;
        }
        return org.telegram.messenger.g0.L(72.0f) + this.f4;
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
            ArrayList arrayList = this.I2;
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
        fv fvVar;
        org.telegram.ui.Components.yl0 yl0Var;
        e61 e61Var;
        fw fwVar = this.C0;
        if (fwVar != null && (yl0Var = fwVar.d0) != null && (e61Var = yl0Var.k0) != null) {
            int childCount = e61Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = e61Var.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.o4) {
                    org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) childAt;
                    org.telegram.ui.Components.w8 w8Var = o4Var.c;
                    int i10 = o4Var.h;
                    if (org.telegram.messenger.m5.E(o4Var.f)) {
                        TLRPC.User a22 = org.telegram.messenger.qp.s1(i10).a2(Long.valueOf(o4Var.f));
                        o4Var.e = a22;
                        w8Var.r(a22);
                    } else {
                        w8Var.q(org.telegram.messenger.qp.s1(i10).M0(Long.valueOf(-o4Var.f)));
                        o4Var.e = null;
                    }
                    o4Var.c(true);
                }
            }
        }
        if (this.e0 != null) {
            int i11 = 0;
            while (true) {
                vw[] vwVarArr = this.e0;
                if (i11 >= vwVarArr.length) {
                    break;
                }
                vw vwVar = vwVarArr[i11];
                if (vwVar != null && (fvVar = vwVar.n) != null) {
                    fvVar.i();
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
        if (this.D3 != null) {
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.ni);
            Drawable drawable = this.K3;
            if (drawable != null && themedColor2 != this.w4) {
                this.w4 = themedColor2;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.Components.g5 g5Var = this.D3;
            if (g5Var != null) {
                g5Var.k(Integer.valueOf(themedColor2));
            }
            org.telegram.ui.Cells.o oVar = this.E3;
            if (oVar != null) {
                oVar.setColor(themedColor2);
            }
        }
        org.telegram.ui.Cells.b3 b3Var = this.M1;
        if (b3Var != null) {
            org.telegram.ui.ActionBar.k6.H1(b3Var.getBackground(), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i6, false), true);
        }
        org.telegram.ui.ActionBar.r0 r0Var = this.m0;
        if (r0Var != null) {
            r0Var.setIconColor(getThemedColor(org.telegram.ui.ActionBar.k6.v8));
        }
        jv jvVar = this.B1;
        if (jvVar != null) {
            jvVar.updateColors();
        }
        mw mwVar = this.z0;
        if (mwVar != null) {
            fh.g gVar = mwVar.y0;
            if (gVar != null) {
                gVar.updateColors();
            }
            mwVar.invalidate();
        }
        jg.q0 q0Var = this.b0;
        if (q0Var != null) {
            q0Var.updateColors();
        }
        fw fwVar2 = this.C0;
        if (fwVar2 != null && (ze0Var = fwVar2.r0) != null) {
            ze0Var.c();
        }
        org.telegram.ui.Components.u61 u61Var = this.a0;
        if (u61Var != null) {
            u61Var.updateColors();
        }
        cz0 cz0Var = this.Z;
        if (cz0Var != null) {
            cz0Var.updateColors();
        }
        if (this.K0 != null) {
            int o4 = i0.a.o(getThemedColor(org.telegram.ui.ActionBar.k6.d6), 100);
            if (!(this.K0.getForeground() instanceof ColorDrawable)) {
                this.K0.setForeground(new ColorDrawable(o4));
            } else if (((ColorDrawable) this.K0.getForeground()).getColor() != o4) {
                ((ColorDrawable) this.K0.getForeground()).setColor(o4);
            }
        }
        org.telegram.ui.Components.q00 q00Var = this.t0;
        if (q00Var != null) {
            q00Var.updateColors();
        }
        org.telegram.ui.Components.q00 q00Var2 = this.u0;
        if (q00Var2 != null) {
            q00Var2.updateColors();
        }
        int i12 = org.telegram.ui.ActionBar.k6.d6;
        this.m4.a(getThemedColor(i12));
        org.telegram.ui.Components.pr prVar = this.J1;
        if (prVar != null) {
            prVar.updateColors();
        }
        org.telegram.ui.Components.or orVar = this.K1;
        if (orVar != null) {
            orVar.setColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
        }
        hv hvVar = this.H1;
        if (hvVar != null) {
            hvVar.updateColors();
        }
        hv hvVar2 = this.F1;
        if (hvVar2 != null) {
            hvVar2.updateColors();
        }
        n5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        pv pvVar = this.E0;
        if (pvVar != null) {
            pvVar.o();
        }
        if (this.C3 != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.Ul)) != this.v4) {
            this.v4 = themedColor;
            this.C3.setColorFilter(themedColor, PorterDuff.Mode.MULTIPLY);
        }
        lw lwVar = this.X;
        if (lwVar != null) {
            lwVar.updateColors();
        }
    }

    public final void y4(View view) {
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        int i7 = 1;
        org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(getParentActivity(), false, 1, null);
        boolean z9 = getMessagesStorage().L != 0;
        int[] iArr = {z9 ? R.drawable.msg_markread : 0, org.telegram.messenger.iz.q1 ? R.drawable.chats_pin : R.drawable.chats_unpin};
        CharSequence[] charSequenceArr = {z9 ? org.telegram.messenger.id.M0(2131748683, null) : null, org.telegram.messenger.id.M0(org.telegram.messenger.iz.q1 ? 2131747247 : 2131749325, null)};
        k4 k4Var = new k4(this, i7);
        h.L = charSequenceArr;
        h.M = iArr;
        h.K = k4Var;
        showDialog(h);
    }

    public final void z3() {
        org.telegram.messenger.g0.i3(new zu(this, 0), 300L);
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
        sv svVar;
        long j12;
        long j13;
        int i13;
        org.telegram.messenger.ij ijVar2;
        long F;
        long j14;
        long j15;
        TLRPC.Chat M0;
        boolean z10;
        fw fwVar;
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
                    if (this.C2 == null && nVar.n && g0Var.d(i7) == 21) {
                        this.C2.N(this);
                        return;
                    }
                    if (J instanceof TLRPC.User) {
                        if (J instanceof TLRPC.Chat) {
                            j17 = ((TLRPC.Chat) J).id;
                        } else if (J instanceof TLRPC.Dialog) {
                            TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                            i15 = dialog.folder_id;
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                if (this.actionBar.w(null)) {
                                    return;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putInt("folderId", ((TLRPC.TL_dialogFolder) dialog).folder.id);
                                presentFragment(new ww(bundle));
                                return;
                            }
                            j16 = dialog.id;
                            if (this.actionBar.w(null)) {
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
            if (this.C2 == null) {
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
            fw fwVar2 = this.C0;
            if (fwVar2 == null || g0Var2 != (yl0Var = fwVar2.d0)) {
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
                    if (!this.l2) {
                        this.W1 = F;
                        this.X1 = user;
                    }
                } else if (I instanceof TLRPC.Chat) {
                    TLRPC.Chat chat3 = (TLRPC.Chat) I;
                    F = -chat3.id;
                    if (!this.l2) {
                        this.W1 = F;
                        this.X1 = chat3;
                    }
                } else if (I instanceof TLRPC.EncryptedChat) {
                    TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) I;
                    F = org.telegram.messenger.m5.F(encryptedChat.id);
                    if (!this.l2) {
                        this.W1 = F;
                        this.X1 = encryptedChat;
                    }
                } else {
                    if (I instanceof org.telegram.messenger.ij) {
                        ijVar2 = (org.telegram.messenger.ij) I;
                        long B0 = org.telegram.messenger.ij.B0(ijVar2.k);
                        int f12 = ijVar2.f1();
                        j3 = 0;
                        j13 = org.telegram.messenger.t3.c0(getMessagesController().M0(Long.valueOf(-B0))) ? org.telegram.messenger.ij.c2(ijVar2.I1, ijVar2.k, true, false) : 0L;
                        fw fwVar3 = this.C0;
                        if (fwVar3 != null) {
                            org.telegram.ui.Components.yl0 yl0Var2 = fwVar3.d0;
                            yl0Var2.j0.a(yl0Var2.Z);
                        }
                        i13 = f12;
                        j12 = B0;
                    } else {
                        j3 = 0;
                        if (I instanceof String) {
                            String str2 = (String) I;
                            fw fwVar4 = this.C0;
                            if (fwVar4 != null && !fwVar4.d0.J.isEmpty()) {
                                this.X.r.setText(str2);
                                this.X.r.setSelection(str2.length());
                            } else if (!str2.equals("section")) {
                                ah0 ah0Var = new ah0(getParentActivity(), this);
                                ah0Var.N0(str2, true);
                                ah0Var.show();
                            }
                        } else if (I instanceof org.telegram.messenger.d5) {
                            org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) I;
                            org.telegram.ui.Components.v4.u(this, d5Var.i, d5Var.j, (String) d5Var.e.get(0));
                        } else if ((I instanceof TLRPC.TL_forumTopic) && (svVar = this.F3) != null && (svVar.getFragment() instanceof w91)) {
                            j12 = -((w91) this.F3.getFragment()).a;
                            j13 = ((TLRPC.TL_forumTopic) I).id;
                            i13 = 0;
                            ijVar2 = null;
                        }
                        i13 = 0;
                        ijVar2 = null;
                        j13 = 0;
                        j12 = 0;
                    }
                    if (j12 == j3 && this.actionBar.v()) {
                        if (this.actionBar.w("search_dialogs_action_mode") && i13 == 0 && !z9) {
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
        if (this.l2) {
            if (v5(j11)) {
                if ((!getMessagesController().t2(j11) && !getMessagesController().p2(j11)) || r4(j11)) {
                    ArrayList arrayList = this.I2;
                    if (!arrayList.isEmpty() || (this.R0 == 3 && this.f2 != null)) {
                        if (arrayList.contains(Long.valueOf(j11)) || A3(j11)) {
                            boolean s32 = s3(j11, view);
                            fw fwVar5 = this.C0;
                            if (fwVar5 != null && g0Var2 == fwVar5.d0) {
                                this.actionBar.l(true);
                                b4(j11, s32);
                            }
                            o5();
                            return;
                        }
                        return;
                    }
                }
                if (this.m2 && getMessagesController().p2(j11)) {
                    Bundle bundle2 = new Bundle(this.arguments);
                    bundle2.putLong("community_id", -j11);
                    ww wwVar = new ww(bundle2);
                    wwVar.X2 = this;
                    wwVar.C2 = this.C2;
                    presentFragment(wwVar);
                    return;
                }
                if (!this.m2 || ((!getMessagesController().t2(j11) || r4(j11)) && !getMessagesController().z2(j11))) {
                    a4(j11, 0L, true, null);
                    return;
                }
                Bundle bundle3 = new Bundle();
                bundle3.putLong("chat_id", -j11);
                bundle3.putBoolean("for_select", true);
                bundle3.putBoolean("forward_to", true);
                bundle3.putBoolean("bot_share_to", this.R0 == 1);
                bundle3.putBoolean("quote", this.O0);
                bundle3.putBoolean("reply_to", this.N0);
                w91 w91Var = new w91(bundle3);
                w91Var.L0 = this;
                presentFragment(w91Var);
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
            TLObject tLObject = this.X1;
            if (tLObject != null) {
                fw fwVar6 = this.C0;
                if (fwVar6 != null) {
                    fwVar6.d0.Q(this.W1, tLObject);
                }
                this.X1 = null;
            }
        } else {
            V3();
        }
        boolean z12 = (org.telegram.messenger.id.a0 || this.j2 || (org.telegram.messenger.g0.Q1() && i10 != 0) || !org.telegram.messenger.sc.e(64) || this.Y2 != j3) ? false : true;
        bundle4.putInt("dialog_folder_id", i10);
        bundle4.putInt("dialog_filter_id", i12);
        if (org.telegram.messenger.g0.Q1() && ((!getMessagesController().t2(j11) || !z12) && this.p2.a == j11 && ((fwVar = this.C0) == null || g0Var2 != fwVar.d0))) {
            if (getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) getParentActivity();
                List fragmentStack = launchActivity.q0.getFragmentStack();
                if (fragmentStack.isEmpty()) {
                    return;
                }
                if (fragmentStack.size() == 1 && (rf.b.g(1, fragmentStack) instanceof an)) {
                    ((an) rf.b.g(1, fragmentStack)).ua();
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
        fw fwVar7 = this.C0;
        if (fwVar7 != null && fwVar7.A0) {
            fwVar7.R(false);
        }
        if (j11 == getUserConfig().e() && getMessagesController().o6) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("dialog_id", org.telegram.messenger.p10.i(this.currentAccount).e());
            bundle5.putInt(TeXSymbolParser.TYPE_ATTR, 0);
            bundle5.putInt("start_from", 11);
            if (this.D0 == null) {
                this.D0 = new org.telegram.ui.Components.ps0(this);
            }
            presentFragment(new org.telegram.ui.Components.u80(bundle5, this.D0));
            return;
        }
        if (this.n2 != null) {
            if (getMessagesController().E(bundle4, this, null, null)) {
                getNotificationCenter().k(org.telegram.messenger.qs.t, new Object[0]);
                an anVar = new an(bundle4);
                p4(anVar, ijVar);
                presentFragment(anVar);
                return;
            }
            return;
        }
        this.z3 = true;
        if (getMessagesController().E(bundle4, this, null, null)) {
            TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(-j11));
            TLRPC.Dialog S0 = getMessagesController().S0(j11);
            boolean V = org.telegram.messenger.t3.V(M02);
            boolean z13 = S0 != null && S0.view_forum_as_messages;
            int b10 = (this.Y2 == j3 || M02 == null) ? 0 : ii.m0.b(this.currentAccount, -M02.id);
            if (b10 == 3) {
                showDialog(new org.telegram.ui.Components.b70(getParentActivity(), M02, null, this, this.resourceProvider));
                return;
            }
            int i17 = 4;
            if (b10 == 4) {
                org.telegram.messenger.k5.o(null, V ? 2131751930 : 2131751927, org.telegram.ui.Components.hc.a0(this), R.raw.e_hand_2, 36);
                return;
            }
            if (M02 == null || !(((z10 = M02.monoforum) || M02.forum) && j14 == j3)) {
                if (org.telegram.messenger.t3.Y(M02)) {
                    Bundle bundle6 = new Bundle();
                    bundle6.putLong("community_id", M02.id);
                    presentFragment(new ww(bundle6));
                    return;
                }
                an anVar2 = new an(bundle4);
                if (j14 != j3) {
                    qg.d.a(anVar2, org.telegram.messenger.xr.a(j11, j14));
                }
                if (z11 && org.telegram.messenger.m5.E(j11) && getMessagesController().Q.f(j11) == null) {
                    org.telegram.messenger.ui mediaDataController = getMediaDataController();
                    TLRPC.Document document = mediaDataController.y0;
                    mediaDataController.n1();
                    if (document != null) {
                        anVar2.U9 = document;
                        anVar2.V9 = true;
                    }
                }
                if (org.telegram.messenger.g0.Q1()) {
                    sv svVar2 = this.F3;
                    if (svVar2.a != null) {
                        svVar2.a();
                    }
                }
                p4(anVar2, ijVar);
                presentFragment(anVar2);
                return;
            }
            if (z10) {
                bundle4.putInt("chatMode", 8);
                bundle4.putBoolean("isSubscriberSuggestions", !org.telegram.messenger.t3.A(this.currentAccount, M02, 24));
                an anVar3 = new an(bundle4);
                p4(anVar3, ijVar);
                presentFragment(anVar3);
                return;
            }
            if (org.telegram.messenger.t3.a(M02)) {
                an anVar4 = new an(bundle4);
                qg.d.a(anVar4, org.telegram.messenger.xr.a(-M02.id, getMessagesController().e7.getLong(a8.p0.o(M02.id, "forumlasttopic"), 1L)));
                presentFragment(anVar4);
                return;
            }
            if (!org.telegram.messenger.sc.e(64) || this.Y2 != j3) {
                if (!z13) {
                    presentFragment(new w91(bundle4));
                    return;
                }
                an anVar5 = new an(bundle4);
                p4(anVar5, ijVar);
                presentFragment(anVar5);
                return;
            }
            if (!z12) {
                if (!z13) {
                    presentFragment(new w91(bundle4));
                    return;
                }
                an anVar6 = new an(bundle4);
                p4(anVar6, ijVar);
                presentFragment(anVar6);
                return;
            }
            if (this.j2) {
                return;
            }
            if (z13) {
                an anVar7 = new an(bundle4);
                p4(anVar7, ijVar);
                presentFragment(anVar7);
                return;
            }
            sv svVar3 = this.F3;
            zv zvVar = svVar3.a;
            if (zvVar == null || (-zvVar.a) != j11) {
                sw swVar = this.e0[0].a;
                swVar.v3 = 0.0f;
                swVar.w3 = swVar.u3;
                swVar.x3 = swVar.o3 != 0.0f;
                zv zvVar2 = new zv(bundle4);
                zvVar2.M0 = this;
                final sv svVar4 = this.F3;
                org.telegram.ui.ActionBar.q4 parentLayout = getParentLayout();
                h2.f fVar = svVar4.n;
                if (!svVar4.r) {
                    svVar4.x = parentLayout;
                    zvVar2.onFragmentCreate();
                    zvVar2.setInPreviewMode(true);
                    zvVar2.setParentLayout(parentLayout);
                    View performCreateView = zvVar2.performCreateView(svVar4.getContext());
                    zvVar2.onResume();
                    svVar4.b = performCreateView;
                    svVar4.addView(performCreateView);
                    final zv zvVar3 = svVar4.a;
                    k0 k0Var = zvVar2.e;
                    svVar4.c = k0Var;
                    svVar4.addView(k0Var);
                    svVar4.a = zvVar2;
                    wy0.Q = j3;
                    wy0.Q = -zvVar2.a;
                    if (zvVar2.getActionBar() != null) {
                        org.telegram.ui.ActionBar.k actionBar = zvVar2.getActionBar();
                        svVar4.d = actionBar;
                        svVar4.addView(actionBar);
                        svVar4.d.e1 = new ru0(svVar4, 10);
                    }
                    if (zvVar3 != null) {
                        final zv zvVar4 = svVar4.a;
                        if (org.telegram.messenger.iz.c()) {
                            r1.g gVar = svVar4.y;
                            if (gVar != null) {
                                gVar.d();
                            }
                            zvVar4.onTransitionAnimationStart(true, false);
                            svVar4.E = zvVar3;
                            svVar4.w = true;
                            fVar.d();
                            r1.g gVar2 = new r1.g(new r1.f(0.0f));
                            svVar4.y = gVar2;
                            gVar2.m = org.telegram.ui.Cells.f1.o(1000.0f, 400.0f, 1.0f);
                            wy0.f(zvVar3, zvVar4, 0.0f);
                            svVar4.y.b(new ab0(svVar4, i17));
                            svVar4.y.a(new r1.c() { // from class: org.telegram.ui.uy0
                                @Override // r1.c
                                public final void a(r1.g gVar3, boolean z14, float f10, float f11) {
                                    wy0 wy0Var = svVar4;
                                    if (wy0Var.y == null) {
                                        return;
                                    }
                                    wy0Var.y = null;
                                    org.telegram.ui.ActionBar.f2 f2Var2 = zvVar4;
                                    f2Var2.onTransitionAnimationEnd(true, false);
                                    org.telegram.ui.ActionBar.f2 f2Var3 = zvVar3;
                                    wy0.f(f2Var3, f2Var2, 1.0f);
                                    wy0Var.w = false;
                                    wy0Var.E = null;
                                    f2Var3.onPause();
                                    f2Var3.onFragmentDestroy();
                                    wy0Var.removeView(f2Var3.getFragmentView());
                                    wy0Var.removeView(f2Var3.getActionBar());
                                    wy0Var.n.e();
                                }
                            });
                            svVar4.y.h();
                        } else {
                            zvVar4.onTransitionAnimationStart(true, false);
                            zvVar4.onTransitionAnimationEnd(true, false);
                            wy0.f(zvVar3, zvVar4, 1.0f);
                            svVar4.w = false;
                            svVar4.E = null;
                            zvVar3.onPause();
                            zvVar3.onFragmentDestroy();
                            svVar4.removeView(zvVar3.getFragmentView());
                            svVar4.removeView(zvVar3.getActionBar());
                            fVar.e();
                        }
                    } else if (!svVar4.f) {
                        int i18 = 1;
                        svVar4.f = true;
                        if (org.telegram.messenger.iz.c()) {
                            fVar.d();
                            svVar4.h = ValueAnimator.ofFloat(0.0f, 1.0f);
                            svVar4.e = 0.0f;
                            svVar4.e(true);
                            svVar4.g();
                            zvVar2.onTransitionAnimationStart(true, false);
                            svVar4.h.addUpdateListener(new ty0(svVar4, i18));
                            svVar4.h.addListener(new org.telegram.ui.Components.v50(13, svVar4, zvVar2));
                            svVar4.h.setDuration(250L);
                            svVar4.h.setInterpolator(org.telegram.ui.Components.xq.f);
                            svVar4.h.setStartDelay(org.telegram.messenger.iz.o() >= 2 ? 50L : 150L);
                            svVar4.h.start();
                        } else {
                            svVar4.e(true);
                            zvVar2.onTransitionAnimationStart(true, false);
                            zvVar2.onTransitionAnimationEnd(true, false);
                            svVar4.e = 1.0f;
                            svVar4.g();
                            svVar4.d(false);
                        }
                    }
                    zvVar2.setPreviewDelegate(new li0(svVar4, 15));
                    WeakHashMap weakHashMap = r0.i0.a;
                    r0.y.c(svVar4);
                }
            } else {
                svVar3.a();
            }
            fw fwVar8 = this.C0;
            if (fwVar8 != null) {
                fwVar8.S();
            }
        }
    }
}
