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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class yw extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is, pg.b, te.b, ie0 {
    public static final boolean[] A4 = new boolean[4];
    public static final org.telegram.ui.Components.tp0 B4 = new org.telegram.ui.Components.tp0(3);
    public static float C4;
    public static boolean z4;
    public ow A0;
    public jh.f A1;
    public boolean A2;
    public float A3;
    public boolean B0;
    public FrameLayout B1;
    public boolean B2;
    public boolean B3;
    public int C0;
    public FrameLayout C1;
    public boolean C2;
    public boolean C3;
    public hw D0;
    public kv D1;
    public boolean D2;
    public Long D3;
    public boolean E;
    public org.telegram.ui.Components.qs0 E0;
    public oi.u1 E1;
    public sw E2;
    public Drawable E3;
    public boolean F;
    public qv F0;
    public org.telegram.ui.ActionBar.q0 F1;
    public ArrayList F2;
    public org.telegram.ui.Components.e5 F3;
    public boolean G;
    public org.telegram.ui.Components.tr G0;
    public final TextPaint G1;
    public String G2;
    public org.telegram.ui.Cells.o G3;
    public TLRPC.RequestPeerType H;
    public boolean H0;
    public iv H1;
    public CharSequence H2;
    public uv H3;
    public long I;
    public float I0;
    public FrameLayout I1;
    public org.telegram.ui.Components.to0 I2;
    public final jv I3;
    public ValueAnimator J;
    public float J0;
    public iv J1;
    public org.telegram.ui.Components.voip.u J2;
    public final jv J3;
    public ValueAnimator K;
    public float K0;
    public FrameLayout K1;
    public final ArrayList K2;
    public f K3;
    public boolean L;
    public rv L0;
    public org.telegram.ui.Components.vr L1;
    public boolean L2;
    public xi.e L3;
    public boolean M;
    public org.telegram.ui.Components.m60 M0;
    public org.telegram.ui.Components.ur M1;
    public int M2;
    public Drawable M3;
    public boolean N;
    public wv N0;
    public org.telegram.ui.Cells.m N1;
    public int N2;
    public int N3;
    public float O;
    public boolean O0;
    public org.telegram.ui.Cells.b3 O1;
    public boolean O2;
    public boolean O3;
    public boolean P;
    public boolean P0;
    public org.telegram.ui.Cells.ma P1;
    public int P2;
    public boolean P3;
    public int Q;
    public long Q0;
    public Long Q1;
    public int Q2;
    public AnimatorSet Q3;
    public boolean R;
    public long R0;
    public Long R1;
    public int R2;
    public boolean R3;
    public boolean S;
    public long S0;
    public mi.j S1;
    public int S2;
    public pt S3;
    public org.telegram.ui.Components.xb T;
    public int T0;
    public ArrayList T1;
    public int T2;
    public String T3;
    public float U;
    public int U0;
    public boolean U1;
    public int U2;
    public ArrayList U3;
    public boolean V;
    public int V0;
    public org.telegram.ui.ActionBar.t1 V1;
    public int V2;
    public boolean V3;
    public boolean W;
    public boolean W0;
    public boolean W1;
    public int W2;
    public CharSequence W3;
    public boolean X;
    public org.telegram.ui.Components.ob0 X0;
    public boolean X1;
    public boolean X2;
    public boolean X3;
    public nw Y;
    public org.telegram.ui.Cells.t2 Y0;
    public long Y1;
    public int Y2;
    public float Y3;
    public bg.o0 Z;
    public org.telegram.ui.Cells.t2 Z0;
    public TLObject Z1;
    public yw Z2;
    public boolean Z3;
    public final int a;
    public az0 a0;
    public boolean a1;
    public int a2;
    public long a3;
    public boolean a4;
    public final te.a b;
    public org.telegram.ui.Components.v61 b0;
    public boolean b1;
    public int b2;
    public TLRPC.Chat b3;
    public ValueAnimator b4;
    public final te.a c;
    public jg.q0 c0;
    public final ArrayList c1;
    public boolean c2;
    public TLRPC.ChatFull c3;
    public org.telegram.ui.Components.m30 c4;
    public final te.a d;
    public float d0;
    public boolean d1;
    public boolean d2;
    public org.telegram.ui.Components.i9 d3;
    public TLRPC.FileLocation d4;
    public final te.a e;
    public ValueAnimator e0;
    public boolean e1;
    public boolean e2;
    public org.telegram.ui.Components.t8 e3;
    public TLRPC.FileLocation e4;
    public final te.a f;
    public xw[] f0;
    public boolean f1;
    public int f2;
    public long f3;
    public org.telegram.ui.Components.xb f4;
    public org.telegram.ui.ActionBar.q0 g0;
    public org.telegram.ui.ActionBar.x1 g1;
    public boolean g2;
    public boolean g3;
    public int g4;
    public final te.a h;
    public org.telegram.ui.ActionBar.q0 h0;
    public final Paint h1;
    public String h2;
    public boolean h3;
    public int h4;
    public ax i0;
    public ImageView i1;
    public String i2;
    public AnimatorSet i3;
    public int i4;
    public boolean j0;
    public NumberTextView j1;
    public String j2;
    public boolean j3;
    public int j4;
    public org.telegram.ui.ActionBar.q0 k0;
    public final ArrayList k1;
    public boolean k2;
    public boolean k3;
    public int k4;
    public org.telegram.ui.ActionBar.q0 l0;
    public org.telegram.ui.ActionBar.q0 l1;
    public boolean l2;
    public float l3;
    public final dh.g l4;
    public org.telegram.ui.ActionBar.q0 m0;
    public org.telegram.ui.ActionBar.q0 m1;
    public boolean m2;
    public boolean m3;
    public final ui.f m4;
    public final te.a n;
    public org.telegram.ui.ActionBar.q0 n0;
    public org.telegram.ui.ActionBar.q0 n1;
    public boolean n2;
    public int n3;
    public final ui.f n4;
    public org.telegram.ui.Components.lg0 o0;
    public org.telegram.ui.ActionBar.q0 o1;
    public boolean o2;
    public boolean o3;
    public final ui.c o4;
    public org.telegram.ui.ActionBar.z0 p0;
    public org.telegram.ui.ActionBar.z0 p1;
    public String p2;
    public boolean p3;
    public final dh.c p4;
    public hi.l3 q0;
    public org.telegram.ui.ActionBar.z0 q1;
    public String q2;
    public org.telegram.ui.Components.xb q3;
    public final dh.c q4;
    public final te.a r;
    public hi.l3 r0;
    public org.telegram.ui.ActionBar.z0 r1;
    public final org.telegram.messenger.ur r2;
    public final h2.f r3;
    public final dh.c r4;
    public final te.a s;
    public boolean s0;
    public org.telegram.ui.ActionBar.z0 s1;
    public boolean s2;
    public boolean s3;
    public final dh.c s4;
    public boolean t0;
    public org.telegram.ui.ActionBar.z0 t1;
    public boolean t2;
    public boolean t3;
    public vu t4;
    public org.telegram.ui.Components.t00 u0;
    public org.telegram.ui.ActionBar.z0 u1;
    public boolean u2;
    public boolean u3;
    public final ArrayList u4;
    public org.telegram.ui.Components.t00 v0;
    public org.telegram.ui.ActionBar.z0 v1;
    public boolean v2;
    public boolean v3;
    public final RectF v4;
    public final rh.h w;
    public hi.d w0;
    public float w1;
    public boolean w2;
    public float w3;
    public final RectF w4;
    public boolean x;
    public lh.f x0;
    public float x1;
    public boolean x2;
    public ValueAnimator x3;
    public int x4;
    public int y;
    public int y0;
    public AnimatorSet y1;
    public boolean y2;
    public float y3;
    public int y4;
    public final UndoView[] z0;
    public float z1;
    public boolean z2;
    public float z3;

    public yw(Bundle bundle) {
        super(bundle);
        int i7 = Build.VERSION.SDK_INT;
        this.a = i7 >= 31 ? 48 : 0;
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        this.b = new te.a(1, this, erVar, 350L, false);
        this.c = new te.a(2, this, erVar, 350L, false);
        this.d = new te.a(3, this, erVar, 350L, false);
        this.e = new te.a(4, this, erVar, 350L, false);
        this.f = new te.a(5, this, erVar, 350L, false);
        this.h = new te.a(6, this, erVar, 350L, false);
        this.n = new te.a(7, this, erVar, 350L, false);
        this.r = new te.a(8, this, erVar, 350L, false);
        this.s = new te.a(9, this, erVar, 350L, false);
        this.w = new rh.h(new eu(this, 18));
        this.y = -1;
        this.G = true;
        this.L = false;
        this.M = false;
        this.N = false;
        this.R = true;
        this.d0 = 1.0f;
        this.z0 = new UndoView[2];
        this.c1 = new ArrayList();
        this.h1 = new Paint();
        this.k1 = new ArrayList();
        new RectF();
        new Paint(1);
        this.G1 = new TextPaint(1);
        this.W1 = true;
        this.e2 = true;
        this.k2 = true;
        this.r2 = new org.telegram.messenger.ur();
        this.K2 = new ArrayList();
        this.L2 = true;
        this.r3 = new h2.f((int[]) null);
        this.I3 = new jv(this, 0);
        this.J3 = new jv(this, 1);
        this.N3 = -4;
        this.O3 = true;
        this.P3 = true;
        this.Y3 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.u4 = arrayList;
        RectF rectF = new RectF();
        this.v4 = rectF;
        RectF rectF2 = new RectF();
        this.w4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        ui.c d = this.glassEngine.d(new hu(this, 12));
        this.o4 = d;
        if (i7 >= 31) {
            dh.g gVar = new dh.g(false);
            this.l4 = gVar;
            ui.f fVar = new ui.f(d);
            this.n4 = fVar;
            fVar.f = d;
            fVar.d = gVar;
            fVar.e = -2;
            ui.f fVar2 = new ui.f(null);
            this.m4 = fVar2;
            fVar2.f = d;
            fVar2.d = gVar;
            fVar2.e = -3;
            dh.c cVar = new dh.c(fVar, fVar, fVar);
            this.r4 = cVar;
            cVar.k = true;
            int L = org.telegram.messenger.qc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
            cVar.d = L;
            cVar.e = L;
            dh.c cVar2 = new dh.c(fVar2, fVar2, fVar2);
            this.p4 = cVar2;
            cVar2.k = true;
            int L2 = org.telegram.messenger.g0.L(48.0f);
            cVar2.d = L2;
            cVar2.e = L2;
            this.q4 = new dh.c(fVar2, fVar2, fVar2);
        } else {
            this.l4 = null;
            this.m4 = null;
            this.n4 = null;
            this.p4 = new dh.c(d, d, d);
            this.r4 = new dh.c(d, d, d);
            this.q4 = new dh.c(d, d, d);
        }
        dh.c cVar3 = new dh.c(d, d, d);
        this.s4 = cVar3;
        dh.c cVar4 = this.r4;
        ri.q qVar = this.glassEngine;
        cVar4.j = qVar;
        this.p4.j = qVar;
        this.q4.j = qVar;
        cVar3.j = qVar;
    }

    public static void A0(yw ywVar) {
        if (ywVar.P3) {
            hi.l3 l3Var = ywVar.q0;
            if (l3Var != null) {
                l3Var.f(true);
            }
            fi.m6 o4 = org.telegram.messenger.np.s1(ywVar.currentAccount).P1().o();
            if (o4 != null && o4.a(ywVar.currentAccount, 1)) {
                ywVar.showDialog(new ug.j0(o4.b(), ywVar.currentAccount, ywVar.getParentActivity(), ywVar, null));
                return;
            } else {
                hi.sa D = hi.sa.D(ywVar.getParentActivity(), ywVar.currentAccount);
                D.y = new ev(ywVar);
                D.Q(null);
                return;
            }
        }
        hi.l3 l3Var2 = ywVar.r0;
        if (l3Var2 != null) {
            if (l3Var2.W) {
                return;
            } else {
                org.telegram.messenger.g0.E2(l3Var2);
            }
        }
        SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(org.telegram.messenger.hd.N0("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.j6.xj, 0, new eu(ywVar, 24), null);
        hi.l3 l3Var3 = new hi.l3(ywVar.getParentActivity(), 2);
        l3Var3.s(8.0f);
        l3Var3.d = 8000L;
        l3Var3.k(true);
        l3Var3.r(true);
        l3Var3.h = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(148.0f);
        l3Var3.u(S2);
        l3Var3.o(1.0f, -40.0f);
        l3Var3.j(ywVar.getThemedColor(org.telegram.ui.ActionBar.j6.wj));
        ywVar.r0 = l3Var3;
        l3Var3.setTranslationY((-ywVar.h4) - ywVar.j4);
        ((ViewGroup) ywVar.fragmentView).addView(ywVar.r0, c8.ja.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
        ywVar.r0.w();
    }

    public static void B0(yw ywVar) {
        org.telegram.messenger.np.s1(ywVar.currentAccount).k4(0L, "PREMIUM_CHRISTMAS");
        ywVar.g5();
        org.telegram.ui.Components.xb G = org.telegram.ui.Components.cc.a0(ywVar).G(R.raw.gift, 4, org.telegram.messenger.hd.M0(2131753330, null));
        G.j = 5000;
        G.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void C0(yw ywVar, int i7) {
        dh.g gVar = ywVar.l4;
        RectF rectF = ywVar.w4;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (c8.zc.a(i7, 4)) {
            int L = org.telegram.messenger.g0.L(48.0f);
            int measuredHeight = (ywVar.fragmentView.getMeasuredHeight() - ywVar.h4) - org.telegram.messenger.g0.L(8.0f);
            int L2 = measuredHeight - org.telegram.messenger.g0.L(56.0f);
            int L3 = org.telegram.messenger.g0.L(ywVar.L ? 81.0f : 0.0f) + org.telegram.messenger.g0.L(48.0f) + ywVar.actionBar.getMeasuredHeight();
            ow owVar = ywVar.A0;
            boolean z10 = false;
            int measuredHeight2 = L3 + ((owVar == null || owVar.getVisibility() != 0) ? 0 : ywVar.A0.getMeasuredHeight());
            org.telegram.ui.Components.vr vrVar = ywVar.L1;
            int sumHeightOfAllVisibleChild = measuredHeight2 + ((vrVar == null || vrVar.getVisibility() != 0) ? 0 : ywVar.L1.getSumHeightOfAllVisibleChild()) + ((int) ywVar.O);
            int measuredHeight3 = ywVar.actionBar.getMeasuredHeight();
            ywVar.v4.set(0.0f, -L, ywVar.fragmentView.getMeasuredWidth(), org.telegram.messenger.g0.W1(ywVar.b.e, sumHeightOfAllVisibleChild, org.telegram.messenger.g0.L(30.0f) + measuredHeight3 + (ywVar.a0 != null ? r9.getMeasuredHeight() : 0)) + L);
            if (ywVar.X) {
                rectF.set(0.0f, L2, ywVar.fragmentView.getMeasuredWidth(), measuredHeight);
                rectF.inset(0.0f, org.telegram.messenger.qc.e(262144) ? 0.0f : -org.telegram.messenger.g0.L(48.0f));
            } else {
                if (ywVar.D1 != null && ywVar.A1 != null) {
                    rectF.set(0.0f, ywVar.fragmentView.getMeasuredHeight() - ywVar.w3(), ywVar.fragmentView.getMeasuredWidth(), ywVar.fragmentView.getMeasuredHeight());
                    rectF.inset(0.0f, org.telegram.messenger.qc.e(262144) ? 0.0f : -org.telegram.messenger.g0.L(48.0f));
                }
                gVar.g(z10 ? 2 : 1, ywVar.u4);
            }
            z10 = true;
            gVar.g(z10 ? 2 : 1, ywVar.u4);
        }
        gVar.e(ywVar.t4, ywVar.fragmentView.getMeasuredWidth(), ywVar.fragmentView.getMeasuredHeight());
    }

    public static void D0(yw ywVar) {
        org.telegram.messenger.np.s1(ywVar.currentAccount).k4(0L, "BIRTHDAY_SETUP");
        ywVar.g5();
        org.telegram.ui.Components.xb K = org.telegram.ui.Components.cc.a0(ywVar).K(R.raw.chats_infotip, org.telegram.messenger.hd.M0(2131753714, null), org.telegram.messenger.hd.M0(2131745495, null), new eu(ywVar, 29));
        K.j = 5000;
        K.j();
    }

    public static void E0(yw ywVar) {
        try {
            ((org.telegram.ui.Components.ch0) ((org.telegram.ui.Components.t8) ywVar.O1.h.getImageReceiver().n0).K).H(true);
        } catch (Exception unused) {
        }
        if (ywVar.c4 == null) {
            org.telegram.ui.Components.m30 m30Var = new org.telegram.ui.Components.m30(0, true, true);
            ywVar.c4 = m30Var;
            m30Var.I = true;
            m30Var.a = ywVar;
            m30Var.b = new lw(ywVar);
            ywVar.getMediaDataController().x();
            ywVar.getMessagesController().d3();
            ywVar.getMessagesController().g3(ywVar.getUserConfig().f(), true, ywVar.classGuid);
        }
        TLRPC.User a22 = org.telegram.messenger.np.s1(ywVar.currentAccount).a2(Long.valueOf(org.telegram.messenger.m10.i(ywVar.currentAccount).e()));
        if (a22 == null) {
            a22 = org.telegram.messenger.m10.i(ywVar.currentAccount).f();
        }
        if (a22 == null) {
            return;
        }
        org.telegram.ui.Components.ki kiVar = ywVar.c4.c;
        if (kiVar != null) {
            kiVar.P0();
        }
        org.telegram.ui.Components.m30 m30Var2 = ywVar.c4;
        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
        m30Var2.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new eu(ywVar, 28), new nu(ywVar, 3), 0);
    }

    public static /* synthetic */ void G0(yw ywVar, float f10, ValueAnimator valueAnimator) {
        ywVar.f0[0].setTranslationY((1.0f - ywVar.w3) * f10);
        ywVar.w3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i7 = 0; i7 < ywVar.actionBar.getChildCount(); i7++) {
            if (ywVar.actionBar.getChildAt(i7).getVisibility() == 0 && ywVar.actionBar.getChildAt(i7) != ywVar.actionBar.getActionMode() && ywVar.actionBar.getChildAt(i7) != ywVar.actionBar.getBackButton()) {
                ywVar.actionBar.getChildAt(i7).setAlpha(1.0f - ywVar.w3);
            }
        }
        ywVar.Q3();
        ywVar.I3();
        View view = ywVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void H0(yw ywVar) {
        org.telegram.ui.Components.fb fbVar = new org.telegram.ui.Components.fb(ywVar.getParentActivity(), ywVar.resourceProvider);
        fbVar.d(R.raw.email_check_inbox, new String[0]);
        fbVar.b.setText(org.telegram.messenger.hd.M0(2131742811, null));
        org.telegram.ui.Components.xb.g(ywVar, fbVar, 2750).j();
        try {
            ywVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void I0(yw ywVar, org.telegram.messenger.t1 t1Var) {
        ArrayList arrayList = t1Var.c;
        if (arrayList.size() != 1) {
            wg.c1.l1(0, t1Var);
            return;
        }
        bi.s2 s2Var = new bi.s2(ywVar.getParentActivity(), ywVar.currentAccount, ((TLRPC.User) arrayList.get(0)).id, null, null);
        s2Var.e1(true);
        ywVar.showDialog(s2Var);
    }

    public static void J0(yw ywVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.xb I = org.telegram.ui.Components.cc.a0(ywVar).I(R.raw.gift, org.telegram.messenger.hd.M0(2131746856, null), org.telegram.messenger.hd.M0(2131746855, null));
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
            ywVar.getMessagesStorage().j2(userFull, false);
        }
        if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            org.telegram.messenger.k5.n(null, 2131743879, org.telegram.ui.Components.cc.a0(ywVar), R.raw.error, 36);
            return;
        }
        if (ywVar.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ywVar.getParentActivity(), ywVar.resourceProvider);
            String M0 = org.telegram.messenger.hd.M0(2131746852, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = M0;
            t1Var.U = org.telegram.messenger.hd.M0(2131746853, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
            ywVar.showDialog(t1Var);
        }
    }

    public static /* synthetic */ void K0(yw ywVar) {
        org.telegram.messenger.np.s1(ywVar.currentAccount).k4(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        ywVar.g5();
    }

    public static void X2(yw ywVar, float f10) {
        float f11;
        float f12;
        float i7 = Utilities.i(ywVar.z1 * 2.0f, 1.0f, 0.0f);
        qv qvVar = ywVar.F0;
        float f13 = (1.0f - ywVar.w3) * f10 * ywVar.I0;
        float f14 = 1.0f - i7;
        qvVar.setAlpha(f13 * f14);
        if (ywVar.L || ywVar.N) {
            float i10 = Utilities.i((-ywVar.O) / org.telegram.messenger.g0.L(81.0f), 1.0f, 0.0f);
            if (ywVar.w3 == 1.0f) {
                i10 = 1.0f;
            }
            float i11 = Utilities.i(i10 / 0.5f, 1.0f, 0.0f);
            ywVar.F0.setClipTop(0);
            if (ywVar.L || !ywVar.N) {
                ywVar.F0.setTranslationY(((ywVar.U / 2.0f) + (Math.max(ywVar.O, -ywVar.g4()) + ywVar.y3)) - org.telegram.messenger.g0.L(8.0f));
                ywVar.F0.l(!ywVar.H3.c(), i10);
                if (ywVar.N) {
                    f11 = 1.0f - i11;
                    ywVar.actionBar.setTranslationY(0.0f);
                } else {
                    f12 = ywVar.I0;
                }
            } else {
                ywVar.F0.setTranslationY((-org.telegram.messenger.g0.L(81.0f)) - org.telegram.messenger.g0.L(8.0f));
                ywVar.F0.setProgressToCollapse(1.0f);
                f12 = ywVar.I0;
            }
            f11 = 1.0f - f12;
            ywVar.actionBar.setTranslationY(0.0f);
        } else {
            if (ywVar.M) {
                ywVar.F0.setTranslationY((Math.max(ywVar.O, -ywVar.g4()) + (-org.telegram.messenger.g0.L(81.0f))) - org.telegram.messenger.g0.L(8.0f));
                ywVar.F0.setProgressToCollapse(1.0f);
                qv qvVar2 = ywVar.F0;
                qvVar2.setClipTop((int) (org.telegram.messenger.g0.m - qvVar2.getY()));
            }
            f11 = 1.0f - ywVar.I0;
            ywVar.actionBar.setTranslationY(0.0f);
        }
        float f15 = f11 * f14;
        if (f15 == 1.0f) {
            ywVar.actionBar.getTitlesContainer().setScaleY(1.0f);
            ywVar.actionBar.getTitlesContainer().setScaleX(1.0f);
            ywVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
            ywVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
            float f16 = 1.0f - ywVar.w3;
            ywVar.actionBar.getTitlesContainer().setAlpha(f16);
            ywVar.actionBar.getTitlesContainer().setVisibility(f16 > 0.0f ? 0 : 4);
            ywVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f16);
            ywVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f16 <= 0.0f ? 4 : 0);
            return;
        }
        ywVar.actionBar.getTitlesContainer().setPivotY(org.telegram.messenger.g0.m);
        ywVar.actionBar.getTitlesContainer().setPivotX(org.telegram.messenger.g0.L(20.0f));
        float f17 = (0.6f * f15) + 0.4f;
        ywVar.actionBar.getTitlesContainer().setScaleY(f17);
        ywVar.actionBar.getTitlesContainer().setScaleX(f17);
        ywVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
        ywVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-org.telegram.messenger.g0.L(30.0f));
        ywVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f17);
        ywVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f17);
        float f18 = (1.0f - ywVar.w3) * f15;
        ywVar.actionBar.getTitlesContainer().setAlpha(f18);
        ywVar.actionBar.getTitlesContainer().setVisibility(f18 > 0.0f ? 0 : 4);
        ywVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f18);
        ywVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f18 <= 0.0f ? 4 : 0);
    }

    public static void Y2(yw ywVar, Canvas canvas, int i7) {
        org.telegram.ui.ActionBar.o4 o4Var;
        if (ywVar.parentLayout == null || ywVar.actionBar == null) {
            return;
        }
        float max = Math.max(ywVar.e.e, ywVar.h4());
        float f10 = 1.0f;
        float f11 = 1.0f - ywVar.z1;
        float f12 = max * f11 * f11;
        if (f12 == 0.0f) {
            return;
        }
        if (-1 >= i7) {
            f10 = 0.0f;
            i7 = -1;
        }
        if (f10 <= 0.0f || f12 <= 0.0f || i7 <= 0 || (o4Var = ywVar.parentLayout) == null) {
            return;
        }
        ((ActionBarLayout) o4Var).p(canvas, (int) (f10 * 255.0f * f12), i7);
    }

    public static /* synthetic */ void Z(yw ywVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        org.telegram.messenger.np.s1(ywVar.currentAccount).k4(0L, tL_pendingSuggestion.suggestion);
        ywVar.g5();
    }

    public static /* synthetic */ void a0(yw ywVar, float f10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ywVar.w3 = floatValue;
        ywVar.f0[0].setTranslationY((-f10) * floatValue);
        for (int i7 = 0; i7 < ywVar.actionBar.getChildCount(); i7++) {
            if (ywVar.actionBar.getChildAt(i7).getVisibility() == 0 && ywVar.actionBar.getChildAt(i7) != ywVar.actionBar.getActionMode() && ywVar.actionBar.getChildAt(i7) != ywVar.actionBar.getBackButton()) {
                ywVar.actionBar.getChildAt(i7).setAlpha(1.0f - ywVar.w3);
            }
        }
        View view = ywVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        ywVar.Q3();
        ywVar.I3();
    }

    public static void b0(yw ywVar) {
        ArrayList arrayList = ywVar.K2;
        org.telegram.ui.ActionBar.o4 o4Var = ywVar.parentLayout;
        if (o4Var != null && ((ActionBarLayout) o4Var).y()) {
            ywVar.finishPreviewFragment();
            return;
        }
        if (ywVar.T0 != 10) {
            if (org.telegram.messenger.np.s1(ywVar.currentAccount).v2()) {
                b.b(ywVar.currentAccount);
                return;
            } else {
                ywVar.presentFragment(new ContactsActivity(a8.p0.k("destroyAfterSelect", true)));
                return;
            }
        }
        if (ywVar.E2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            arrayList2.add(org.telegram.messenger.ur.a(((Long) arrayList.get(i7)).longValue(), 0L));
        }
        ywVar.E2.y(ywVar, arrayList2, null, false, ywVar.L2, ywVar.M2, ywVar.N2, null);
    }

    public static /* synthetic */ void c0(yw ywVar) {
        org.telegram.messenger.np.s1(ywVar.currentAccount).k4(0L, "USERPIC_SETUP");
        ywVar.g5();
    }

    public static org.telegram.ui.Cells.t2 c4(xw xwVar) {
        uw uwVar = xwVar.a;
        for (int i7 = 0; i7 < uwVar.getChildCount(); i7++) {
            View childAt = uwVar.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.t2) {
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) childAt;
                if (t2Var.Y()) {
                    return t2Var;
                }
            }
        }
        return null;
    }

    public static void d0(yw ywVar) {
        PasskeysActivity.f0(ywVar.currentAccount, ywVar.getParentActivity(), ywVar.resourceProvider, true);
    }

    public static /* synthetic */ void e0(yw ywVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", org.telegram.messenger.m10.i(ywVar.currentAccount).e());
        ywVar.presentFragment(new an(bundle));
    }

    public static /* synthetic */ void f0(yw ywVar, TL_account.TL_birthday tL_birthday) {
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull b22 = ywVar.getMessagesController().b2(ywVar.getUserConfig().e());
        TL_account.TL_birthday tL_birthday2 = b22 != null ? b22.birthday : null;
        if (b22 != null) {
            b22.flags2 |= 32;
            b22.birthday = tL_birthday;
        }
        ywVar.getMessagesController().m2();
        ywVar.getConnectionsManager().sendRequest(updatebirthday, new z9(ywVar, b22, tL_birthday2, 8), 1024);
        org.telegram.messenger.np.s1(ywVar.currentAccount).k4(0L, "BIRTHDAY_SETUP");
        ywVar.g5();
    }

    public static void g0(yw ywVar, xw xwVar, View view, int i7) {
        int i10;
        if (view instanceof org.telegram.ui.Cells.x3) {
            return;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.t2;
        if (z10) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
            if (t2Var.o2) {
                ywVar.Z4(t2Var.getDialogId(), view);
                return;
            }
        }
        if (ywVar.U3()) {
            ywVar.A4(view, i7, 0.0f, xwVar.d);
            return;
        }
        int i11 = ywVar.T0;
        if (i11 == 15 && (view instanceof org.telegram.ui.Cells.l8)) {
            xwVar.d.L();
            return;
        }
        int i12 = 0;
        if ((i11 == 11 || i11 == 13) && i7 == 1) {
            Bundle k10 = a8.p0.k("forImport", true);
            k10.putLongArray("result", new long[]{ywVar.getUserConfig().e()});
            k10.putInt("chatType", 4);
            String string = ywVar.arguments.getString("importTitle");
            if (string != null) {
                k10.putString("title", string);
            }
            c50 c50Var = new c50(k10);
            c50Var.Z = new ev(ywVar);
            ywVar.presentFragment(c50Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.b3) && ((i10 = xwVar.s) == 7 || i10 == 8)) {
            jg.k kVar = (jg.k) xwVar.d.N.get(0);
            TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = (kVar == null || kVar.a != 17) ? null : kVar.i;
            if (tL_chatlists_chatlistUpdates != null) {
                org.telegram.messenger.so soVar = ywVar.getMessagesController().N[xwVar.s - 7];
                if (soVar != null) {
                    int i13 = soVar.a;
                    org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(ywVar, false);
                    zzVar.U1 = -1;
                    zzVar.Y1 = "";
                    zzVar.Z1 = new ArrayList();
                    zzVar.b2 = "";
                    zzVar.d2 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    zzVar.e2 = arrayList;
                    zzVar.v2 = -1;
                    zzVar.y2 = -5;
                    zzVar.U1 = i13;
                    zzVar.W1 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    zzVar.c2 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList arrayList2 = ywVar.getMessagesController().Q0;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i12 >= arrayList2.size()) {
                                break;
                            }
                            if (((org.telegram.messenger.so) arrayList2.get(i12)).a == i13) {
                                zzVar.Y1 = ((org.telegram.messenger.so) arrayList2.get(i12)).b;
                                break;
                            }
                            i12++;
                        }
                    }
                    zzVar.f1();
                    ywVar.showDialog(zzVar);
                    return;
                }
                return;
            }
        } else if (z10 && !ywVar.actionBar.x() && !ywVar.H3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.t2) view).Z1;
            org.telegram.messenger.g0.P.set(imageReceiver.L0, imageReceiver.M0, imageReceiver.y(), imageReceiver.A());
        }
        ywVar.z4(view, i7, xwVar.d);
    }

    public static /* synthetic */ void h0(yw ywVar) {
        ywVar.presentFragment(new PrivacySettingsActivity());
        org.telegram.messenger.g0.k3(ywVar.parentLayout, "newChatsRow");
    }

    public static /* synthetic */ void i0(yw ywVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.np.s1(ywVar.currentAccount).o1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(ywVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new z9(ywVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void j0(yw ywVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(launchActivity, ywVar.currentAccount, tL_attachMenuBot, null, true);
        org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(ywVar.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = b02.b;
        if (tL_attachMenuBots != null) {
            long j3 = b02.a;
            b02.getMessagesStorage().a.c(new org.telegram.messenger.fk(b02.e, 2, j3, b02, tL_attachMenuBots));
        }
    }

    public static void j1(yw ywVar, boolean z10) {
        if (ywVar.f0 == null || ywVar.O3 == z10) {
            return;
        }
        ywVar.O3 = z10;
        int i7 = 0;
        while (true) {
            xw[] xwVarArr = ywVar.f0;
            if (i7 >= xwVarArr.length) {
                return;
            }
            if (z10) {
                xwVarArr[i7].a.setScrollbarFadingEnabled(false);
            }
            ywVar.f0[i7].a.setVerticalScrollBarEnabled(z10);
            if (z10) {
                ywVar.f0[i7].a.setScrollbarFadingEnabled(true);
            }
            i7++;
        }
    }

    public static void k0(yw ywVar) {
        org.telegram.messenger.np.s1(ywVar.currentAccount).f7.edit().putBoolean("storyhint", false).commit();
    }

    public static /* synthetic */ void l0(yw ywVar) {
        if (ywVar.c4.g()) {
            org.telegram.messenger.np.s1(ywVar.currentAccount).k4(0L, "USERPIC_SETUP");
            ywVar.g5();
        }
    }

    public static /* synthetic */ void n0(yw ywVar) {
        org.telegram.messenger.np.s1(ywVar.currentAccount).k4(0L, "PREMIUM_GRACE");
        ywVar.g5();
    }

    public static /* synthetic */ void o0(yw ywVar) {
        org.telegram.messenger.np.s1(ywVar.currentAccount).k4(0L, "SETUP_PASSKEY");
        ywVar.g5();
    }

    public static void p0(yw ywVar, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        try {
            t1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (tLObject == null) {
            org.telegram.ui.Components.t4.c0(ywVar.currentAccount, tL_error, ywVar, tL_messages_checkHistoryImportPeer, new Object[0]);
            ywVar.getNotificationCenter().k(org.telegram.messenger.ns.v1, Long.valueOf(j3), tL_messages_checkHistoryImportPeer, tL_error);
            return;
        }
        ywVar.arguments.getString("importTitle");
        String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
        di.x2 x2Var = new di.x2(ywVar, j3, 25);
        Pattern pattern = org.telegram.ui.Components.t4.a;
        if (ywVar.getParentActivity() != null) {
            if (chat == null && user == null) {
                return;
            }
            int currentAccount = ywVar.getCurrentAccount();
            Activity parentActivity = ywVar.getParentActivity();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            long e11 = org.telegram.messenger.m10.i(currentAccount).e();
            TextView textView = new TextView(parentActivity);
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.j5, null);
            textView.setTextSize(1, 16.0f);
            textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            alertDialog$Builder.o(frameLayout);
            org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
            t8Var.u(org.telegram.messenger.g0.L(12.0f));
            org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(parentActivity);
            i9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
            frameLayout.addView(i9Var, c8.ja.d(40, 40.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            org.telegram.messenger.k5.m(textView2, org.telegram.ui.ActionBar.j6.E8, null, 1, 20.0f);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(org.telegram.messenger.hd.M0(2131749245, null));
            boolean z10 = org.telegram.messenger.hd.a0;
            frameLayout.addView(textView2, c8.ja.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 76, 11.0f, z10 ? 76 : 21, 0.0f));
            frameLayout.addView(textView, c8.ja.d(-2, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (user == null) {
                t8Var.q(chat);
                i9Var.f(chat, t8Var);
            } else if (org.telegram.messenger.q10.z(user)) {
                t8Var.p = 0.8f;
                t8Var.g(12);
                i9Var.j(null, null, t8Var, user);
            } else if (user.id == e11) {
                t8Var.p = 0.8f;
                t8Var.g(1);
                i9Var.j(null, null, t8Var, user);
            } else {
                t8Var.p = 1.0f;
                t8Var.r(user);
                i9Var.f(user, t8Var);
            }
            textView.setText(org.telegram.messenger.g0.X2(str));
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131749265, null), new org.telegram.ui.Components.s(x2Var, 3));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            ywVar.showDialog(alertDialog$Builder.a);
        }
    }

    public static void p4(an anVar, org.telegram.messenger.gj gjVar) {
        if (gjVar == null || !gjVar.r2()) {
            return;
        }
        try {
            CharSequence charSequence = !TextUtils.isEmpty(gjVar.z) ? gjVar.z : gjVar.v;
            CharSequence x12 = org.telegram.messenger.g0.x1(charSequence, gjVar.a2, null);
            if (x12 instanceof SpannableStringBuilder) {
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) x12;
                org.telegram.ui.Components.b00[] b00VarArr = (org.telegram.ui.Components.b00[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.b00.class);
                if (b00VarArr.length > 0) {
                    int spanStart = spannableStringBuilder.getSpanStart(b00VarArr[0]);
                    int spanEnd = spannableStringBuilder.getSpanEnd(b00VarArr[0]);
                    for (int i7 = 1; i7 < b00VarArr.length; i7++) {
                        int spanStart2 = spannableStringBuilder.getSpanStart(b00VarArr[i7]);
                        int spanStart3 = spannableStringBuilder.getSpanStart(b00VarArr[i7]);
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
                    anVar.Sb(gjVar.L1(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public static void q0(yw ywVar, int i7) {
        Object obj;
        org.telegram.ui.Components.xl0 xl0Var = ywVar.D0.r0;
        if (i7 < xl0Var.a0 || i7 >= xl0Var.b0) {
            obj = Boolean.FALSE;
        } else {
            org.telegram.ui.Components.b41 G = xl0Var.G(i7);
            obj = G != null ? G.G : null;
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ywVar.getParentActivity(), ywVar.resourceProvider);
            String M0 = org.telegram.messenger.hd.M0(2131754180, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = M0;
            t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131754179, "\"" + org.telegram.messenger.q10.p(user) + "\"");
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746321, null), new tr(4, ywVar, user));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
        }
    }

    public static void r0(yw ywVar, int i7, ArrayList arrayList, boolean z10, HashSet hashSet) {
        if (i7 != 102) {
            ywVar.D4(arrayList, i7, false, false, null);
            return;
        }
        ywVar.getMessagesController().t0 = true;
        ywVar.D4(arrayList, i7, false, false, z10 ? hashSet : null);
        org.telegram.messenger.np messagesController = ywVar.getMessagesController();
        messagesController.t0 = false;
        messagesController.getNotificationCenter().k(org.telegram.messenger.ns.s, Boolean.TRUE);
        ywVar.getMessagesController().J(ywVar.Y2);
        int i10 = ywVar.Y2;
        if (i10 == 0 || ywVar.d4(ywVar.currentAccount, ywVar.f0[0].s, i10, false).size() != 0) {
            return;
        }
        ywVar.f0[0].a.setEmptyView(null);
        ywVar.f0[0].x.setVisibility(4);
        ywVar.finishFragment();
    }

    public static void t0(yw ywVar, int i7, org.telegram.ui.Components.m60 m60Var) {
        if (ywVar.currentAccount == i7) {
            return;
        }
        m60Var.u();
        if (ywVar.getParentActivity() == null) {
            return;
        }
        sw swVar = ywVar.E2;
        LaunchActivity launchActivity = (LaunchActivity) ywVar.getParentActivity();
        ArrayList arrayList = ywVar.F2;
        String str = ywVar.G2;
        CharSequence charSequence = ywVar.H2;
        kv kvVar = ywVar.D1;
        CharSequence fieldText = kvVar != null ? kvVar.getFieldText() : null;
        launchActivity.O0(i7);
        yw ywVar2 = new yw(ywVar.arguments);
        ywVar2.E2 = swVar;
        if (arrayList == null || arrayList.isEmpty()) {
            if (str != null) {
                ywVar2.Q4(fieldText, str);
            } else if (charSequence != null) {
                if (charSequence.length() == 0) {
                    ywVar2.H2 = null;
                } else {
                    ywVar2.H2 = charSequence;
                    ywVar2.G2 = null;
                    ywVar2.F2 = null;
                    if (ywVar2.D1 != null) {
                        ywVar2.v3(fieldText);
                    } else {
                        ywVar2.W3 = fieldText;
                    }
                }
            }
        } else if (arrayList.isEmpty()) {
            ywVar2.F2 = null;
        } else {
            ywVar2.F2 = arrayList;
            ywVar2.G2 = null;
            ywVar2.O2 = false;
            if (ywVar2.D1 != null) {
                ywVar2.v3(fieldText);
            } else {
                ywVar2.W3 = fieldText;
            }
        }
        launchActivity.u0(ywVar2, false, true);
    }

    public static /* synthetic */ void u0(yw ywVar) {
        org.telegram.messenger.np.s1(ywVar.currentAccount).k4(0L, ywVar.C3 ? "PREMIUM_UPGRADE" : "PREMIUM_ANNUAL");
        ywVar.g5();
    }

    public static void u1(yw ywVar, xw xwVar, float f10) {
        if (ywVar.U == f10) {
            return;
        }
        ywVar.U = f10;
        if (f10 == 0.0f) {
            ywVar.V = false;
        }
        ywVar.F0.setOverscroll(f10);
        xwVar.a.setViewsOffset(f10);
        xwVar.a.setOverScrollMode(f10 != 0.0f ? 2 : 0);
        ywVar.fragmentView.invalidate();
        if (f10 <= org.telegram.messenger.g0.L(90.0f) || ywVar.V) {
            return;
        }
        qv qvVar = ywVar.F0;
        ValueAnimator valueAnimator = qvVar.I0;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            qvVar.i(qvVar.q0, true);
            ywVar.V = true;
            ywVar.getOrCreateStoryViewer().x(new eu(ywVar, 4));
        }
    }

    public static void u4(org.telegram.messenger.c cVar) {
        int i7 = cVar.a;
        boolean[] zArr = A4;
        if (zArr[i7]) {
            return;
        }
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
        s12.X2();
        s12.U2(0, 0, 100, true, null);
        if (s12.s.isEmpty() && !TextUtils.isEmpty(s12.S3)) {
            TLRPC.TL_help_getRecentMeUrls tL_help_getRecentMeUrls = new TLRPC.TL_help_getRecentMeUrls();
            tL_help_getRecentMeUrls.referer = s12.S3;
            s12.getConnectionsManager().sendRequest(tL_help_getRecentMeUrls, new org.telegram.messenger.pj(s12, 4));
        }
        s12.g3(org.telegram.messenger.m10.i(i7).f(), false, 0);
        org.telegram.messenger.g5.r(i7).f();
        org.telegram.messenger.si.b0(i7).u(false);
        org.telegram.messenger.g0.i3(new bh(cVar, 18), 200L);
        Iterator it = s12.d4.iterator();
        while (it.hasNext()) {
            org.telegram.messenger.si.b0(i7).c1((String) it.next(), true, true);
        }
        zArr[i7] = true;
    }

    public static void v0(yw ywVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
            wc1.a(ywVar.getParentActivity(), new x(ywVar, tL_attachMenuBot, launchActivity, 7), null);
        } else {
            LaunchActivity.G0(launchActivity, ywVar.currentAccount, tL_attachMenuBot, null, true);
        }
    }

    public static boolean v1(yw ywVar, xw xwVar) {
        if (ywVar.H3.c()) {
            return false;
        }
        int i7 = (int) (-ywVar.O);
        int f42 = ywVar.f4();
        int g42 = ywVar.g4();
        if (i7 == 0 || i7 == f42 || i7 == g42 || !xwVar.a.canScrollVertically(-1)) {
            return false;
        }
        if (g42 >= i7 || i7 >= f42) {
            if ((ywVar.w3 != 1.0f ? Utilities.i((-ywVar.O) / org.telegram.messenger.g0.L(81.0f), 1.0f, 0.0f) : 1.0f) < ywVar.F0.C0) {
                xwVar.b.w(-i7);
                return true;
            }
            xwVar.b.w(g42 - i7);
            return true;
        }
        int L = org.telegram.messenger.g0.L(48.0f);
        int i10 = i7 - g42;
        if (i10 < L / 2) {
            xwVar.b.w(-i10);
            return true;
        }
        xwVar.b.w(L - i10);
        return true;
    }

    public static void w0(yw ywVar) {
        b.c(ywVar.currentAccount, ywVar.getParentActivity(), ywVar.getResourceProvider());
    }

    public static String w2(yw ywVar) {
        ArrayList arrayList = ywVar.K2;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() >= 3) {
            return org.telegram.messenger.hd.G(arrayList.size(), "ShareSendToMany", new Object[0]);
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
            if (longValue == ywVar.getUserConfig().e()) {
                sb2.append(org.telegram.messenger.hd.M0(2131745901, null));
            } else {
                sb2.append(arrayList.size() == 1 ? org.telegram.messenger.m5.l(ywVar.currentAccount, longValue) : org.telegram.messenger.m5.s(ywVar.currentAccount, longValue));
            }
        }
        return org.telegram.messenger.hd.a0(null, null, 2131745439, sb2.toString());
    }

    public static void x0(final int i7, final long j3, TLRPC.Chat chat, final yw ywVar, final boolean z10, final boolean z11) {
        final TLRPC.Chat chat2;
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        ywVar.n4(false);
        if (i7 == 103 && org.telegram.messenger.t3.T(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || org.telegram.messenger.t3.t0(chat2)) {
                ywVar.getMessagesController().X(2, j3, z11);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i7 == 102 && (i12 = ywVar.Y2) != 0 && ywVar.d4(ywVar.currentAccount, ywVar.f0[0].s, i12, false).size() == 1) {
            ywVar.f0[0].x.setVisibility(4);
        }
        int i13 = -1;
        if (i7 == 102) {
            ywVar.M4(true, true);
            if (ywVar.T1 != null) {
                i11 = 0;
                while (i11 < ywVar.T1.size()) {
                    if (((TLRPC.Dialog) ywVar.T1.get(i11)).id == j3) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            i11 = -1;
            ywVar.z3();
            i10 = i11;
        } else {
            i10 = -1;
        }
        UndoView k42 = ywVar.k4();
        if (k42 != null) {
            k42.j(i7 == 103 ? 0 : z11 ? 1 : 95, j3, new Runnable() { // from class: org.telegram.ui.uu
                @Override // java.lang.Runnable
                public final void run() {
                    ywVar.C4(i7, j3, chat2, z10, z11);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(ywVar.d4(ywVar.currentAccount, ywVar.f0[0].s, ywVar.Y2, false));
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
            if (i10 < 0 || i13 >= 0 || (arrayList = ywVar.T1) == null) {
                ywVar.M4(false, true);
                return;
            }
            arrayList.remove(i10);
            ywVar.f0[0].y.D();
            ywVar.f0[0].q(true);
        }
    }

    public static void y0(yw ywVar) {
        org.telegram.messenger.v1 a10 = org.telegram.messenger.v1.a(ywVar.currentAccount);
        int i7 = a10.a;
        Set<String> set = a10.d;
        org.telegram.messenger.t1 t1Var = a10.c;
        if (t1Var != null && !set.contains(t1Var.a)) {
            set.add(a10.c.a);
            SharedPreferences.Editor edit = org.telegram.messenger.np.s1(i7).f7.edit();
            edit.putStringSet("bday_hidden", set);
            edit.apply();
            org.telegram.messenger.ns.f(i7).k(org.telegram.messenger.ns.g5, new Object[0]);
        }
        org.telegram.messenger.np.s1(ywVar.currentAccount).k4(0L, "BIRTHDAY_CONTACTS_TODAY");
        ywVar.g5();
        org.telegram.ui.Components.xb G = org.telegram.ui.Components.cc.a0(ywVar).G(R.raw.gift, 4, org.telegram.messenger.hd.M0(2131753330, null));
        G.j = 5000;
        G.j();
    }

    public static /* synthetic */ void z0(yw ywVar) {
        org.telegram.messenger.np.s1(ywVar.currentAccount).k4(0L, "PREMIUM_RESTORE");
        ywVar.g5();
    }

    public final boolean A3(long j3) {
        int i7;
        int i10 = this.T0;
        if (i10 == 15 || i10 == 16 || this.j2 != null || !this.u2) {
            return true;
        }
        if (!org.telegram.messenger.m5.z(j3)) {
            if (!org.telegram.messenger.m5.C(j3)) {
                return true;
            }
            if (this.V0 == 0 && !this.W0) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = org.telegram.messenger.hd.M0(2131745596, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = M0;
            int i11 = this.V0;
            if (i11 == 3) {
                t1Var.U = org.telegram.messenger.hd.M0(2131744090, null);
            } else if (i11 != 0) {
                t1Var.U = org.telegram.messenger.hd.M0(2131747176, null);
            } else {
                t1Var.U = org.telegram.messenger.hd.M0(2131749104, null);
            }
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131747831, null), null);
            showDialog(t1Var);
            return false;
        }
        long j10 = -j3;
        TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(j10));
        if (!org.telegram.messenger.t3.T(M02) || M02.megagroup) {
            return true;
        }
        if (!this.s2) {
            TLRPC.Chat M03 = org.telegram.messenger.np.s1(this.currentAccount).M0(Long.valueOf(j10));
            if ((org.telegram.messenger.t3.n(M03) || M03.megagroup) && (i7 = this.V0) != 2 && i7 != 3) {
                return true;
            }
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
        String M04 = org.telegram.messenger.hd.M0(2131745596, null);
        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
        t1Var2.S = M04;
        int i12 = this.V0;
        if (i12 == 3) {
            t1Var2.U = org.telegram.messenger.hd.M0(2131744091, null);
        } else if (i12 == 2) {
            t1Var2.U = org.telegram.messenger.hd.M0(2131746587, null);
        } else {
            t1Var2.U = org.telegram.messenger.hd.M0(2131752440, null);
        }
        alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131747831, null), null);
        showDialog(t1Var2);
        return false;
    }

    public final boolean A4(View view, int i7, float f10, org.telegram.ui.Components.tj0 tj0Var) {
        org.telegram.ui.Components.cm0 cm0Var;
        org.telegram.ui.Components.cm0 cm0Var2;
        long F;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.b3) && tj0Var.d(i7) != 21) {
            if (!this.actionBar.x() && !org.telegram.messenger.g0.Q1() && !this.n2 && (view instanceof org.telegram.ui.Cells.t2)) {
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                if (!getMessagesController().t2(t2Var.getDialogId()) && !this.H3.c() && t2Var.b0(f10)) {
                    return T4(t2Var);
                }
            }
            uv uvVar = this.H3;
            if (uvVar == null || !uvVar.c()) {
                hw hwVar = this.D0;
                if (hwVar != null && tj0Var == (cm0Var2 = hwVar.e0)) {
                    Object I = cm0Var2.I(i7);
                    if (!this.D0.e0.O) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String M0 = org.telegram.messenger.hd.M0(2131752054, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = M0;
                        if (I instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) I;
                            if (chat.monoforum) {
                                t1Var.U = org.telegram.messenger.hd.a0("ClearSearchSingleChatAlertText", null, 2131752053, qg.c.i(this.currentAccount, chat, false));
                            } else {
                                t1Var.U = org.telegram.messenger.hd.a0("ClearSearchSingleChatAlertText", null, 2131752053, chat.title);
                            }
                            F = -chat.id;
                        } else if (I instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) I;
                            if (user.id == getUserConfig().n) {
                                t1Var.U = org.telegram.messenger.hd.a0("ClearSearchSingleChatAlertText", null, 2131752053, org.telegram.messenger.hd.M0(2131745901, null));
                            } else {
                                t1Var.U = org.telegram.messenger.hd.a0("ClearSearchSingleUserAlertText", null, 2131752051, org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
                            }
                            F = user.id;
                        } else if (I instanceof TLRPC.EncryptedChat) {
                            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(((TLRPC.EncryptedChat) I).user_id));
                            t1Var.U = org.telegram.messenger.hd.a0("ClearSearchSingleUserAlertText", null, 2131752051, org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                            F = org.telegram.messenger.m5.F(r14.id);
                        }
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752055, null), new ai.c0(this, F, 8));
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        showDialog(t1Var);
                        TextView textView = (TextView) t1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, getResourceProvider());
                        }
                        return true;
                    }
                }
                hw hwVar2 = this.D0;
                if (hwVar2 == null || tj0Var != (cm0Var = hwVar2.e0)) {
                    Object J = ((jg.m) tj0Var).J(i7);
                    if (J instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                        if (this.n2) {
                            if ((this.T0 == 3 || U3()) && v5(dialog.id)) {
                                if (this.T0 != 1 || !U3() || !this.o2 || !getMessagesController().t2(dialog.id)) {
                                    s3(dialog.id, view);
                                    o5();
                                    return true;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -dialog.id);
                                bundle.putBoolean("for_select", true);
                                bundle.putBoolean("forward_to", true);
                                bundle.putBoolean("bot_share_to", this.T0 == 1);
                                bundle.putBoolean("quote", this.P0);
                                bundle.putBoolean("reply_to", this.O0);
                                u91 u91Var = new u91(bundle);
                                u91Var.M0 = this;
                                presentFragment(u91Var);
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
                    if (this.n2) {
                        z4(view, i7, tj0Var);
                        return false;
                    }
                    long dialogId = (!(view instanceof org.telegram.ui.Cells.f6) || cm0Var.N(i7)) ? 0L : ((org.telegram.ui.Cells.f6) view).getDialogId();
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
    public final ui.f B() {
        return this.n4;
    }

    public final void B3(boolean z10) {
        mi.j jVar;
        TLRPC.ChatFull chatFull;
        org.telegram.ui.Components.vr vrVar = this.L1;
        if (vrVar == null || (jVar = this.S1) == null || (chatFull = this.c3) == null) {
            return;
        }
        vrVar.i(jVar, (this.a3 == 0 || chatFull.requests_pending <= 0 || this.b.f) ? false : true, z10);
        this.S1.setTitle(org.telegram.messenger.hd.G(this.c3.requests_pending, "CommunityPendingRequestsRow", new Object[0]));
    }

    public final void B4(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i7 = 0; i7 < 4; i7++) {
            if (org.telegram.messenger.m10.i(i7).p()) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        Collections.sort(arrayList, new me(24));
        org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(this, view);
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
                int i11 = org.telegram.ui.ActionBar.j6.i6;
                Drawable a02 = org.telegram.ui.ActionBar.j6.a0(getThemedColor(i11), 0, 0);
                org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
                org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
                linearLayout.setBackground(a02);
                org.telegram.ui.ActionBar.q6.j(linearLayout, a02, null, M, resourceProvider);
                TLRPC.User f10 = org.telegram.messenger.m10.i(intValue).f();
                org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
                t8Var.r(f10);
                hi.q3 q3Var = new hi.q3(this, getParentActivity(), z10);
                linearLayout.addView(q3Var, c8.ja.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(getParentActivity());
                if (z10) {
                    i9Var.setScaleX(0.833f);
                    i9Var.setScaleY(0.833f);
                }
                i9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
                i9Var.getImageReceiver().d = intValue;
                i9Var.f(f10, t8Var);
                q3Var.addView(i9Var, c8.ja.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.j5, getResourceProvider());
                textView.setText(org.telegram.messenger.q10.p(f10));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, c8.ja.q(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new bi.x2(this, intValue, H, 17));
                H.r(linearLayout, c8.ja.o(org.telegram.messenger.ns.G3, 48));
            }
        }
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(24.0f), getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.j6.r1(0.15f, -16777216));
        H.z.set(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
        H.W(d02);
        H.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
        H.V(5);
        H.Z();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e6, code lost:
    
        if (getMessagesController().c2.get(r14.Y2) != false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0111 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C3(xw xwVar) {
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        int i7;
        int L0 = xwVar.c.L0();
        int N0 = xwVar.c.N0();
        if (this.j3 || this.o3) {
            return;
        }
        ow owVar = this.A0;
        if (owVar != null && owVar.getVisibility() == 0 && this.A0.P) {
            return;
        }
        int abs = Math.abs(N0 - L0) + 1;
        if (N0 != -1) {
            v4.e1 K = xwVar.a.K(N0);
            boolean z14 = K != null && K.f == 11;
            this.d2 = z14;
            if (z14) {
                o4(false);
            }
        } else {
            this.d2 = false;
        }
        int i10 = xwVar.s;
        if (i10 == 7 || i10 == 8) {
            ArrayList T0 = getMessagesController().T0();
            int i11 = xwVar.h;
            if (i11 >= 0 && i11 < T0.size()) {
                int i12 = ((org.telegram.messenger.so) T0.get(xwVar.h)).g;
                int i13 = org.telegram.messenger.np.D8;
                if ((i12 & 128) == 0 && ((abs > 0 && N0 >= d4(this.currentAccount, xwVar.s, 1, this.U1).size() - 10) || (abs == 0 && !getMessagesController().c2.get(1)))) {
                    boolean z15 = getMessagesController().c2.get(1);
                    boolean z16 = !z15;
                    z10 = (z15 && getMessagesController().d2.get(1)) ? false : true;
                    z11 = z16;
                    if (abs > 0 || N0 < d4(this.currentAccount, xwVar.s, this.Y2, this.U1).size() - 10) {
                        if (abs == 0 && ((i7 = xwVar.s) == 7 || i7 == 8)) {
                        }
                        z12 = false;
                        z13 = false;
                        if (!z12 || z10) {
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.wu
                                @Override // java.lang.Runnable
                                public final void run() {
                                    yw ywVar = yw.this;
                                    if (z12) {
                                        ywVar.getMessagesController().U2(ywVar.Y2, -1, 100, z13, null);
                                    }
                                    if (z10) {
                                        ywVar.getMessagesController().U2(1, -1, 100, z11, null);
                                    }
                                }
                            });
                        }
                        return;
                    }
                    boolean z17 = getMessagesController().c2.get(this.Y2);
                    boolean z18 = !z17;
                    if (z17) {
                        if (getMessagesController().d2.get(this.Y2)) {
                            z13 = z18;
                            z12 = false;
                            if (z12) {
                            }
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.wu
                                @Override // java.lang.Runnable
                                public final void run() {
                                    yw ywVar = yw.this;
                                    if (z12) {
                                        ywVar.getMessagesController().U2(ywVar.Y2, -1, 100, z13, null);
                                    }
                                    if (z10) {
                                        ywVar.getMessagesController().U2(1, -1, 100, z11, null);
                                    }
                                }
                            });
                        }
                    }
                    z13 = z18;
                    z12 = true;
                    if (z12) {
                    }
                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.wu
                        @Override // java.lang.Runnable
                        public final void run() {
                            yw ywVar = yw.this;
                            if (z12) {
                                ywVar.getMessagesController().U2(ywVar.Y2, -1, 100, z13, null);
                            }
                            if (z10) {
                                ywVar.getMessagesController().U2(1, -1, 100, z11, null);
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
        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.wu
            @Override // java.lang.Runnable
            public final void run() {
                yw ywVar = yw.this;
                if (z12) {
                    ywVar.getMessagesController().U2(ywVar.Y2, -1, 100, z13, null);
                }
                if (z10) {
                    ywVar.getMessagesController().U2(1, -1, 100, z11, null);
                }
            }
        });
    }

    public final void C4(int i7, long j3, TLRPC.Chat chat, boolean z10, boolean z11) {
        if (i7 == 103) {
            getMessagesController().X(1, j3, z11);
            return;
        }
        if (chat == null) {
            getMessagesController().X(0, j3, z11);
            if (z10 && z11) {
                getMessagesController().w(j3);
            }
        } else if (org.telegram.messenger.t3.r0(chat)) {
            getMessagesController().X(0, j3, z11);
        } else {
            getMessagesController().g0(-j3, getMessagesController().a2(Long.valueOf(getUserConfig().e())), null, z11, false);
        }
        if (org.telegram.messenger.g0.Q1()) {
            getNotificationCenter().k(org.telegram.messenger.ns.t, Long.valueOf(j3));
        }
        getMessagesController().J(this.Y2);
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
    public final void D4(java.util.ArrayList r42, int r43, boolean r44, boolean r45, java.util.HashSet r46) {
        /*
            Method dump skipped, instructions count: 2857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.D4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
    }

    @Override // te.b
    public final void E(float f10, int i7) {
        org.telegram.ui.ActionBar.q0 q0Var;
        if (i7 != 3 || (q0Var = this.m0) == null) {
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) q0Var.getIconView().getDrawable();
        if (!this.d.f) {
            animatedVectorDrawable.reset();
            return;
        }
        animatedVectorDrawable.start();
        if (org.telegram.messenger.gz.o() != 0) {
            TLRPC.TL_help_premiumPromo tL_help_premiumPromo = org.telegram.messenger.si.b0(this.currentAccount).E;
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

    public final void E3() {
        if (this.f0 == null) {
            return;
        }
        int w32 = w3();
        int i7 = 0;
        while (true) {
            xw[] xwVarArr = this.f0;
            if (i7 >= xwVarArr.length) {
                return;
            }
            xw xwVar = xwVarArr[i7];
            if (xwVar != null) {
                uw uwVar = xwVar.a;
                uwVar.setPadding(0, uwVar.g3, 0, w32);
            }
            i7++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E4(long j3, boolean z10, org.telegram.messenger.so soVar, int i7, boolean z11) {
        boolean z12;
        int i10;
        boolean B3;
        boolean z13;
        int i11 = (this.f0[0].s == 0 && l4() && this.f0[0].w == 2) ? 1 : 0;
        int L0 = this.f0[0].c.L0();
        if (soVar != null) {
            int i12 = soVar.j.get(j3, TLObject.FLAG_31);
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
            if (this.T1 != null) {
                for (int i14 = 0; i14 < this.T1.size(); i14++) {
                    if (((TLRPC.Dialog) this.T1.get(i14)).id == j3) {
                        i10 = i14;
                        z12 = false;
                        break;
                    }
                }
            }
            z12 = false;
        }
        i10 = -1;
        if (soVar != null) {
            LongSparseIntArray longSparseIntArray = soVar.j;
            if (z10) {
                longSparseIntArray.put(j3, i7);
            } else {
                longSparseIntArray.delete(j3);
            }
            if (z11) {
                getMessagesController().w3(soVar);
            }
            B3 = true;
        } else {
            B3 = getMessagesController().B3(j3, z10, null, -1L);
        }
        if (B3) {
            if (z12) {
                if (this.T0 != 10) {
                    o4(false);
                }
                J4(true, false);
            } else {
                ArrayList d42 = d4(this.currentAccount, this.f0[0].s, this.Y2, false);
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
        if (z12) {
            return;
        }
        if (i10 >= 0) {
            ArrayList arrayList = this.T1;
            if (arrayList != null && i13 >= 0 && i10 != i13) {
                arrayList.add(i13, (TLRPC.Dialog) arrayList.remove(i10));
                this.f0[0].y.D();
                this.f0[0].q(true);
                xw xwVar = this.f0[0];
                xwVar.c.h1((xwVar.s == 0 && l4() && this.f0[0].w == 2) ? 1 : 0, (int) this.O);
            } else if (i13 >= 0 && i10 == i13) {
                org.telegram.messenger.g0.i3(new eu(this, 13), 200L);
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

    @Override // pg.b
    public final List F() {
        return Arrays.asList(new pg.a(org.telegram.messenger.hd.M0(2131751648, null)), new pg.a(org.telegram.messenger.hd.M0(2131752076, null), new eu(this, 14)), new pg.a(org.telegram.messenger.hd.M0(2131751649, null), new eu(this, 15)));
    }

    public final void F3() {
        jh.f fVar = this.A1;
        if (fVar != null) {
            fVar.setBlurredBottomHeight(this.A1.getInputBubbleHeight() + this.w.d() + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(7.0f));
        }
    }

    public final void F4() {
        if (this.L0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / org.telegram.messenger.ns.K2));
        this.L0.setBackground(new BitmapDrawable(createBitmap));
        this.L0.setAlpha(0.0f);
        this.L0.setVisibility(0);
        N3();
    }

    @Override // te.b
    public final void G(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 1) {
            O3();
            Q3();
            T3();
            G3();
            R3();
            nw nwVar = this.Y;
            te.a aVar = this.b;
            nwVar.setBlurredBackgroundVisibility(aVar.e);
            float a10 = a8.m7.a(aVar.e);
            org.telegram.ui.Components.i9 i9Var = this.d3;
            if (i9Var != null) {
                i9Var.setScaleX(a10);
                this.d3.setScaleY(a10);
                this.d3.setAlpha(a10);
                this.d3.setVisibility(a10 > 0.0f ? 0 : 8);
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

    public final void G3() {
        xw xwVar;
        float e42 = e4(true);
        ow owVar = this.A0;
        if (owVar != null) {
            boolean z10 = owVar.getAlpha() != e42;
            float T1 = org.telegram.messenger.g0.T1(0.98f, 1.0f, e42);
            this.A0.setAlpha(e42);
            this.A0.setScaleX(T1);
            this.A0.setScaleY(T1);
            this.A0.setVisibility(e42 > 0.0f ? 0 : 8);
            if (z10 && (xwVar = this.f0[0]) != null) {
                xwVar.a.requestLayout();
            }
        }
        e5();
    }

    public final void G4(xw xwVar) {
        int i7;
        if (xwVar.getVisibility() != 0) {
            return;
        }
        int i10 = xwVar.d.w;
        if (xwVar.s == 0 && l4() && xwVar.a.getChildCount() == 0 && xwVar.w == 2) {
            ((v4.b0) xwVar.a.getLayoutManager()).h1(1, (int) this.O);
        }
        xwVar.d.getClass();
        xwVar.d.V();
        int b10 = xwVar.d.b();
        if (b10 == 1 && i10 == 1 && xwVar.d.d(0) == 5) {
            xwVar.q(true);
        } else {
            xwVar.q(false);
            if (b10 > i10 && (i7 = this.T0) != 11 && i7 != 12 && i7 != 13) {
                xwVar.E.b(i10);
            }
        }
        try {
            xwVar.a.setEmptyView((this.Y2 == 0 && this.a3 == 0) ? xwVar.x : null);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        C3(xwVar);
    }

    public final void H3() {
        float f10 = this.n.e;
        float T1 = org.telegram.messenger.g0.T1(0.2f, 1.0f, f10);
        oi.u1 u1Var = this.E1;
        if (u1Var != null) {
            u1Var.setScaleX(T1);
            this.E1.setScaleY(T1);
            this.E1.setAlpha(f10);
            this.E1.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        jh.f fVar = this.A1;
        if (fVar != null) {
            fVar.setAlpha(f10);
            this.A1.setVisibility(f10 > 0.0f ? 0 : 8);
            this.A1.getFadeView().setAlpha(f10);
            this.A1.getFadeView().setVisibility(f10 > 0.0f ? 0 : 8);
        }
    }

    public final void H4() {
        boolean z10;
        if (this.O == 0.0f || (z10 = this.L)) {
            return;
        }
        float f10 = z10 ? -g4() : 0.0f;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.I3, f10));
        animatorSet.setInterpolator(org.telegram.ui.Components.er.f);
        animatorSet.setDuration(250L);
        animatorSet.start();
    }

    public final void I3() {
        if (this.actionBar == null) {
            return;
        }
        float f10 = 1.0f - this.b.e;
        float h42 = 1.0f - h4();
        org.telegram.ui.Components.t00.d(this.actionBar.getBackButton(), Math.max(this.w3, f10 * h42 * (1.0f - this.c.e)));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I4(int i7) {
        org.telegram.ui.Components.fz fzVar;
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
            if (((org.telegram.messenger.so) T0.get(i10)).a == i7) {
                tabsCount = i10;
                break;
            }
            i10++;
        }
        ow owVar = this.A0;
        if (tabsCount < 0) {
            owVar.getClass();
        } else if (tabsCount < owVar.getTabsCount()) {
            fzVar = (org.telegram.ui.Components.fz) owVar.h.get(tabsCount);
            if (fzVar != null) {
                ow owVar2 = this.A0;
                ArrayList arrayList = owVar2.h;
                if (arrayList.isEmpty()) {
                    return;
                }
                owVar2.f((org.telegram.ui.Components.fz) i5.c.h(1, arrayList), arrayList.size() - 1);
                return;
            }
            xw[] xwVarArr = this.f0;
            if (xwVarArr == null || xwVarArr.length <= 0 || xwVarArr[0].h != fzVar.a) {
                this.A0.f(fzVar, tabsCount);
                return;
            }
            return;
        }
        fzVar = null;
        if (fzVar != null) {
        }
    }

    public final void J3() {
        org.telegram.ui.Components.t00.d(this.h0, com.google.android.gms.internal.vision.e2.D(this.j0 ? 1.0f : 0.0f, 1.0f - this.b.e, 1.0f - h4(), 1.0f - this.c.e));
    }

    public final void J4(boolean z10, boolean z11) {
        uv uvVar = this.H3;
        if (uvVar == null || !uvVar.c()) {
            int i7 = (this.f0[0].s == 0 && l4() && this.f0[0].w == 2) ? 1 : 0;
            int i10 = (!this.L || z11 || this.F0.g()) ? 0 : -org.telegram.messenger.g0.L(81.0f);
            if (!z10) {
                this.f0[0].c.h1(i7, i10);
                H4();
            } else {
                org.telegram.ui.Components.wi0 wi0Var = this.f0[0].r;
                wi0Var.b = 1;
                wi0Var.d(i7, i10, false, false);
                H4();
            }
        }
    }

    public final void K3() {
        org.telegram.ui.Components.t00.d(this.g0, com.google.android.gms.internal.vision.e2.D(org.telegram.messenger.gz.s.isEmpty() ? 0.0f : 1.0f, 1.0f - this.b.e, 1.0f - h4(), 1.0f - this.c.e));
    }

    public final void K4(String str, boolean z10) {
        a5(true, false, true, false);
        bg.o0 o0Var = this.Z;
        if (o0Var != null) {
            o0Var.b(true);
        }
        nw nwVar = this.Y;
        if (nwVar != null) {
            nwVar.r.setText(str);
            this.Y.r.setSelection(str.length());
        }
    }

    public final void L3() {
        org.telegram.ui.Components.t00.d(this.k0, com.google.android.gms.internal.vision.e2.D(this.T0 != 2 ? 1.0f : 0.0f, this.f.e, 1.0f - h4(), 1.0f - this.c.e));
        qv qvVar = this.F0;
        if (qvVar != null) {
            qvVar.invalidate();
        }
    }

    public final void L4(float f10) {
        this.d0 = f10;
        for (xw xwVar : this.f0) {
            uw uwVar = xwVar.a;
            for (int i7 = 0; i7 < uwVar.getChildCount(); i7++) {
                View childAt = uwVar.getChildAt(i7);
                if (childAt != null && RecyclerView.R(childAt) >= xwVar.d.f + 1) {
                    childAt.setAlpha(f10);
                }
            }
        }
    }

    public final void M3() {
        org.telegram.ui.Components.t00.d(this.m0, com.google.android.gms.internal.vision.e2.D(this.b.e, 1.0f - h4(), 1.0f - this.c.e, this.d.e));
    }

    public final void M4(boolean z10, boolean z11) {
        if (this.f0 == null || this.U1 == z10) {
            return;
        }
        if (z10) {
            this.T1 = new ArrayList(d4(this.currentAccount, this.f0[0].s, this.Y2, false));
        } else {
            this.T1 = null;
        }
        this.U1 = z10;
        xw xwVar = this.f0[0];
        xwVar.d.H = z10;
        if (z10 || !z11) {
            return;
        }
        if (xwVar.a.c0()) {
            this.f0[0].a.post(new eu(this, 25));
        } else {
            this.f0[0].d.f();
        }
    }

    public final void N3() {
        rv rvVar;
        boolean z10 = !this.l2 && ((rvVar = this.L0) == null || rvVar.getBackground() == null || this.L0.getAlpha() < 0.01f || this.L0.getVisibility() == 8);
        f fVar = this.K3;
        if (fVar != null) {
            ((je0) fVar.b).w.a(z10, true);
        }
    }

    public final void N4(boolean z10) {
        xw xwVar;
        if (org.telegram.messenger.gz.o() <= 1 || !org.telegram.messenger.qc.e(32768)) {
            return;
        }
        if (z10) {
            xw[] xwVarArr = this.f0;
            if (xwVarArr != null && (xwVar = xwVarArr[0]) != null) {
                xwVar.setLayerType(2, null);
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
            int i7 = 0;
            while (true) {
                xw[] xwVarArr2 = this.f0;
                if (i7 >= xwVarArr2.length) {
                    break;
                }
                xw xwVar2 = xwVarArr2[i7];
                if (xwVar2 != null) {
                    xwVar2.setLayerType(0, null);
                    xwVar2.setClipChildren(true);
                    xwVar2.setClipToPadding(true);
                    xwVar2.a.setClipChildren(true);
                }
                i7++;
            }
        }
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (kVar2 != null) {
            kVar2.setLayerType(0, null);
        }
        qv qvVar = this.F0;
        if (qvVar != null) {
            qvVar.setLayerType(0, null);
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            ((ViewGroup) view2).setClipChildren(true);
            this.fragmentView.requestLayout();
        }
    }

    public final void O3() {
        I3();
        org.telegram.ui.Components.t00.d(this.l0, (1.0f - this.b.e) * (1.0f - h4()) * (1.0f - this.c.e));
        J3();
        M3();
        K3();
        L3();
    }

    public final void O4(float f10) {
        xw[] xwVarArr = this.f0;
        if (xwVarArr != null) {
            int paddingTop = xwVarArr[0].a.getPaddingTop() + ((int) f10);
            int i7 = 0;
            while (true) {
                xw[] xwVarArr2 = this.f0;
                if (i7 >= xwVarArr2.length) {
                    break;
                }
                xwVarArr2[i7].a.setTopGlowOffset(paddingTop);
                i7++;
            }
        }
        if (this.fragmentView == null || f10 == this.O) {
            return;
        }
        this.O = f10;
        org.telegram.ui.Components.xb xbVar = this.q3;
        if (xbVar != null) {
            xbVar.l();
        }
        if (this.G3 != null) {
            float currentActionBarHeight = 1.0f - ((-f10) / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
            org.telegram.ui.Cells.o oVar = this.G3;
            float f11 = (int) f10;
            float f12 = oVar.f;
            oVar.h = f11;
            oVar.setTranslationY(f12 + f11);
            this.G3.setAlpha(c8.i9.a(currentActionBarHeight, 0.0f, 1.0f));
            this.G3.setVisibility(currentActionBarHeight <= 0.0f ? 4 : 0);
        }
        Q3();
        this.fragmentView.invalidate();
    }

    public final void P3() {
        String M0 = org.telegram.messenger.hd.M0(h4() > 0.5f ? 2131745706 : 2131745813, null);
        this.Y.r.setContentDescription(M0);
        this.Y.r.setHint(M0);
    }

    public final void P4(float f10) {
        this.z1 = f10;
        n5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (org.telegram.messenger.gz.o() != 0) {
            org.telegram.messenger.qc.e(32768);
        }
        e5();
    }

    public final void Q3() {
        if (this.Y == null) {
            return;
        }
        float a10 = 1.0f - c8.i9.a(((-this.O) - g4()) / org.telegram.messenger.g0.L(48.0f), 0.0f, 1.0f);
        float max = (this.T0 != 2 ? 1.0f : 0.0f) * (1.0f - this.c.e) * (1.0f - Math.max(this.w3, this.h.e)) * Math.max(this.b.e, (1.0f - h4()) * a10);
        this.Y.setAlpha(max);
        this.Y.setVisibility(max > 0.0f ? 0 : 8);
        this.f.a(max <= 0.01f, true);
    }

    public final void Q4(CharSequence charSequence, String str) {
        if (str == null || str.isEmpty()) {
            this.G2 = null;
            this.H2 = null;
            return;
        }
        this.G2 = str;
        this.H2 = null;
        this.F2 = null;
        if (this.D1 != null) {
            v3(charSequence);
        } else {
            this.W3 = charSequence;
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
        org.telegram.ui.Components.v61 v61Var = this.b0;
        te.a aVar = this.s;
        if (v61Var != null) {
            float f11 = 1.0f - aVar.e;
            v61Var.setAlpha(f11);
            this.b0.setVisibility(f11 > 0.0f ? 0 : 8);
        }
        jg.q0 q0Var = this.c0;
        if (q0Var != null) {
            float f12 = aVar.e;
            q0Var.setAlpha(f12);
            this.c0.setVisibility(f12 > 0.0f ? 0 : 8);
        }
    }

    public final void R4(float f10) {
        if (org.telegram.messenger.gz.o() <= 0) {
            boolean z10 = org.telegram.messenger.r2.a;
            return;
        }
        if (this.Y3 == f10) {
            return;
        }
        boolean z11 = true;
        if (org.telegram.messenger.gz.o() > 1 && org.telegram.messenger.qc.e(32768)) {
            z11 = false;
        }
        this.Z3 = z11;
        this.Y3 = f10;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (this.Z3) {
            float f11 = (1.0f - this.Y3) * (-org.telegram.messenger.g0.L(40.0f));
            qv qvVar = this.F0;
            if (qvVar != null) {
                qvVar.setTranslationX(f11);
            }
            nw nwVar = this.Y;
            if (nwVar != null) {
                nwVar.setTranslationX(f11);
            }
            uv uvVar = this.H3;
            if (uvVar == null || uvVar.getFragmentView() == null || this.E) {
                return;
            }
            this.H3.getFragmentView().setTranslationX(f11);
            return;
        }
        float f12 = -org.telegram.messenger.g0.L(4.0f);
        float f13 = 1.0f - this.Y3;
        float f14 = f12 * f13;
        float f15 = 1.0f - (f13 * 0.05f);
        qv qvVar2 = this.F0;
        if (qvVar2 != null) {
            qvVar2.setScaleX(f15);
            this.F0.setScaleY(f15);
            this.F0.setTranslationX(f14);
            this.F0.setPivotX(0.0f);
            this.F0.setPivotY(0.0f);
        }
        nw nwVar2 = this.Y;
        if (nwVar2 != null) {
            nwVar2.setTranslationX(f14);
            this.Y.setScaleX(f15);
            this.Y.setScaleY(f15);
        }
        uv uvVar2 = this.H3;
        if (uvVar2 == null || uvVar2.getFragmentView() == null) {
            return;
        }
        if (!this.E) {
            this.H3.getFragmentView().setScaleX(f15);
            this.H3.getFragmentView().setScaleY(f15);
            this.H3.getFragmentView().setTranslationX(f14);
        }
        this.H3.getFragmentView().setPivotX(0.0f);
        this.H3.getFragmentView().setPivotY(0.0f);
    }

    public final void S3(boolean z10) {
        if (this.D0 == null || this.actionBar == null) {
            return;
        }
        int i7 = org.telegram.messenger.g0.n;
        int measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(this.a) + (this.b0 != null ? org.telegram.messenger.g0.L(50.0f) : 0);
        org.telegram.ui.Components.vr vrVar = this.L1;
        int c10 = measuredHeight + (vrVar != null ? (int) vrVar.c(org.telegram.messenger.g0.L(7.0f)) : 0);
        hw hwVar = this.D0;
        SparseArray sparseArray = hwVar.h;
        hwVar.X0 = c10;
        hwVar.Y0 = i7;
        di.c1 c1Var = hwVar.b0;
        if (z10) {
            c1Var.q1(0, c10, 0, i7);
        } else {
            c1Var.setPadding(0, c10, 0, i7);
        }
        hwVar.P0.j(hwVar.X0, hwVar.Y0, z10);
        org.telegram.ui.Components.wl0 wl0Var = hwVar.c0;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wl0Var.getLayoutParams();
        int i10 = marginLayoutParams.topMargin;
        int i11 = hwVar.X0;
        if (i10 != i11 || marginLayoutParams.bottomMargin != hwVar.Y0) {
            marginLayoutParams.topMargin = i11;
            marginLayoutParams.bottomMargin = hwVar.Y0;
            wl0Var.requestLayout();
        }
        org.telegram.ui.Components.jm0.P(hwVar.i0, hwVar.l0, hwVar.X0, hwVar.Y0, z10);
        org.telegram.ui.Components.jm0.P(hwVar.n0, hwVar.q0, hwVar.X0, hwVar.Y0, z10);
        org.telegram.ui.Components.jm0.P(hwVar.u0, hwVar.x0, hwVar.X0, hwVar.Y0, z10);
        org.telegram.ui.Components.cf0 cf0Var = hwVar.s0;
        int i12 = hwVar.X0;
        int i13 = hwVar.Y0;
        cf0Var.setClipToPadding(false);
        org.telegram.ui.Components.u41 u41Var = cf0Var.c;
        cf0Var.K = z10;
        cf0Var.setPadding(0, i12, 0, i13);
        if (z10) {
            u41Var.q1(0, i12, 0, i13);
        } else {
            u41Var.setPadding(0, i12, 0, i13);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) u41Var.getLayoutParams();
        marginLayoutParams2.topMargin = -i12;
        marginLayoutParams2.bottomMargin = -i13;
        cf0Var.K = false;
        org.telegram.ui.Components.il0 il0Var = hwVar.J0;
        if (il0Var != null) {
            il0Var.b(hwVar.X0, hwVar.Y0, z10);
        }
        int size = sparseArray.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) sparseArray.valueAt(i14);
            if (view instanceof zz) {
                ((zz) view).j(hwVar.X0, hwVar.Y0, z10);
            }
        }
        for (int i15 = 0; i15 < hwVar.getChildCount(); i15++) {
            if (hwVar.getChildAt(i15) instanceof zz) {
                ((zz) hwVar.getChildAt(i15)).j(hwVar.X0, hwVar.Y0, z10);
            }
        }
    }

    public final void S4() {
        getContactsController().B();
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(getParentActivity(), this.currentAccount, getResourceProvider(), new org.telegram.ui.Components.voip.u(8, this, r1), new bh(r1, 17));
        org.telegram.ui.ActionBar.u2 i7 = org.telegram.messenger.i20.i(getParentActivity(), false, 1, getResourceProvider());
        i7.O = n6Var;
        i7.V0 = 49;
        i7.show();
        org.telegram.ui.ActionBar.u2[] u2VarArr = {i7};
        i7.Q(org.telegram.ui.ActionBar.j6.h5);
    }

    public final void T3() {
        if (this.L1 != null) {
            float T1 = org.telegram.messenger.g0.T1(0.98f, 1.0f, 1.0f);
            this.L1.setAlpha(1.0f);
            this.L1.setScaleX(T1);
            this.L1.setScaleY(T1);
            this.L1.setVisibility(0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0132, code lost:
    
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
        int i7;
        boolean z10;
        int i10;
        LinearLayout linearLayout;
        yw ywVar;
        char c10;
        long j10;
        org.telegram.messenger.so soVar;
        boolean[] zArr;
        ?? r52;
        yw ywVar2;
        long j11;
        int i11;
        boolean z11;
        int i12;
        int i13;
        int i14;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
        final long j12;
        int i15;
        int i16;
        org.telegram.ui.ActionBar.z0 z0Var;
        boolean z12;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
        bi.z3 z3Var;
        char c11;
        final yw ywVar3 = this;
        boolean Y = org.telegram.messenger.t3.Y(t2Var.h2);
        if (!t2Var.X()) {
            long dialogId = t2Var.getDialogId();
            Bundle bundle = new Bundle();
            int messageId = t2Var.getMessageId();
            if (!org.telegram.messenger.m5.C(dialogId)) {
                if (org.telegram.messenger.m5.E(dialogId)) {
                    bundle.putLong("user_id", dialogId);
                } else if (ywVar3.a3 == 0 || ((b10 = li.l0.b(ywVar3.currentAccount, dialogId)) != 4 && b10 != 3)) {
                    TLRPC.Chat M0 = ywVar3.getMessagesController().M0(Long.valueOf(-dialogId));
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
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(dialogId));
                boolean z13 = ywVar3.a3 == 0 && ywVar3.getMessagesController().F3 && ywVar3.getMessagesController().V0 && ywVar3.getMessagesController().Q0 != null && ywVar3.getMessagesController().Q0.size() > 0;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = new ActionBarPopupWindow$ActionBarPopupWindowLayout[1];
                int i17 = 2;
                if (z13) {
                    LinearLayout linearLayout2 = new LinearLayout(ywVar3.getParentActivity());
                    linearLayout2.setOrientation(1);
                    bi.z3 z3Var2 = new bi.z3(ywVar3.getParentActivity(), i17);
                    LinearLayout linearLayout3 = new LinearLayout(ywVar3.getParentActivity());
                    linearLayout3.setOrientation(1);
                    z3Var2.addView(linearLayout3);
                    int size = ywVar3.getMessagesController().Q0.size();
                    int i18 = 0;
                    org.telegram.ui.ActionBar.z0 z0Var2 = null;
                    while (i18 < size) {
                        final org.telegram.messenger.so soVar2 = (org.telegram.messenger.so) ywVar3.getMessagesController().Q0.get(i18);
                        if (soVar2.e()) {
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                            j12 = dialogId;
                            c11 = 'd';
                        } else {
                            final boolean b11 = soVar2.b(org.telegram.messenger.c.a(ywVar3.currentAccount), dialogId);
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                            j12 = dialogId;
                            final ArrayList J0 = org.telegram.ui.Components.jz.J0(ywVar3, soVar2, arrayList, true, false);
                            if (!b11) {
                                c11 = 'd';
                            }
                            org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(2, ywVar3.getParentActivity(), null, false, false);
                            z0Var3.setChecked(b11);
                            i15 = size;
                            i16 = i18;
                            Spannable B5 = org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(soVar2.b, z0Var3.getTextView().getPaint().getFontMetricsInt(), false, null, 0), soVar2.c, z0Var3.getTextView().getPaint().getFontMetricsInt(), false);
                            z0Var3.setEmojiCacheType(soVar2.n ? 26 : 0);
                            z0Var3.j(B5, 0, new org.telegram.ui.Components.a00(ywVar3.getParentActivity(), R.drawable.msg_folders, soVar2.m));
                            z0Var3.getTextView().setEmojiColor(ywVar3.getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
                            z0Var3.setMinimumWidth(org.telegram.messenger.ns.q2);
                            z0Var = z0Var3;
                            z12 = Y;
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                            z3Var = z3Var2;
                            dialogId = j12;
                            z0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ou
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    ArrayList arrayList2;
                                    long j13;
                                    org.telegram.messenger.so soVar3;
                                    yw ywVar4 = yw.this;
                                    ywVar4.getClass();
                                    boolean z14 = b11;
                                    ArrayList arrayList3 = J0;
                                    org.telegram.messenger.so soVar4 = soVar2;
                                    long j14 = j12;
                                    if (z14) {
                                        soVar4.h.remove(Long.valueOf(j14));
                                        soVar4.i.add(Long.valueOf(j14));
                                        hz.z0(soVar4, soVar4.g, soVar4.b, soVar4.c, soVar4.n, soVar4.m, soVar4.h, soVar4.i, soVar4.j, false, false, true, true, false, ywVar4, null);
                                        ywVar4.k4().k(j14, 21, Integer.valueOf(arrayList3.size()), soVar4, null, null);
                                    } else {
                                        if (arrayList3.isEmpty()) {
                                            arrayList2 = arrayList3;
                                            j13 = j14;
                                            soVar3 = soVar4;
                                        } else {
                                            for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                                                soVar4.i.remove(arrayList3.get(i19));
                                            }
                                            soVar4.h.addAll(arrayList3);
                                            arrayList2 = arrayList3;
                                            soVar3 = soVar4;
                                            j13 = j14;
                                            hz.z0(soVar3, soVar4.g, soVar4.b, soVar4.c, soVar4.n, soVar4.m, soVar4.h, soVar4.i, soVar4.j, false, false, true, true, false, ywVar4, null);
                                        }
                                        ywVar4.k4().k(j13, 20, Integer.valueOf(arrayList2.size()), soVar3, null, null);
                                    }
                                    ywVar4.n4(true);
                                    ywVar4.finishPreviewFragment();
                                }
                            });
                            linearLayout3.addView(z0Var);
                            i18 = i16 + 1;
                            ywVar3 = this;
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
                            z3Var2 = z3Var;
                            Y = z12;
                            size = i15;
                            z0Var2 = z0Var;
                        }
                        i16 = i18;
                        z3Var = z3Var2;
                        z12 = Y;
                        z0Var = z0Var2;
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                        dialogId = j12;
                        i15 = size;
                        i18 = i16 + 1;
                        ywVar3 = this;
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
                        z3Var2 = z3Var;
                        Y = z12;
                        size = i15;
                        z0Var2 = z0Var;
                    }
                    ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr5 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                    bi.z3 z3Var3 = z3Var2;
                    z10 = Y;
                    org.telegram.ui.ActionBar.z0 z0Var4 = z0Var2;
                    i10 = 8;
                    i7 = 2;
                    if (z0Var4 != null) {
                        z0Var4.m(false, true);
                    }
                    if (linearLayout3.getChildCount() <= 0) {
                        z13 = false;
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr5;
                        linearLayout = linearLayout2;
                    } else {
                        org.telegram.ui.ActionBar.d1 d1Var = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.j6.H8, getParentActivity(), getResourceProvider());
                        d1Var.setTag(R.id.fit_width_tag, 1);
                        org.telegram.ui.ActionBar.z0 z0Var5 = new org.telegram.ui.ActionBar.z0(getParentActivity(), true, false);
                        z0Var5.j(org.telegram.messenger.hd.M0(2131753756, null), R.drawable.ic_ab_back, null);
                        z0Var5.setMinimumWidth(org.telegram.messenger.ns.q2);
                        z0Var5.setOnClickListener(new a(actionBarPopupWindow$ActionBarPopupWindowLayoutArr5, 20));
                        linearLayout2.addView(z0Var5);
                        linearLayout2.addView(d1Var, c8.ja.o(-1, 8));
                        linearLayout2.addView(z3Var3);
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr5;
                        linearLayout = linearLayout2;
                    }
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                    i7 = 2;
                    z10 = Y;
                    i10 = 8;
                    linearLayout = null;
                }
                org.telegram.ui.ActionBar.e2[] e2VarArr = new org.telegram.ui.ActionBar.e2[1];
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, z13 ? 3 : i7, getParentActivity(), getResourceProvider());
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0] = actionBarPopupWindow$ActionBarPopupWindowLayout;
                if (z13) {
                    int[] iArr = {actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout)};
                    org.telegram.ui.ActionBar.z0 z0Var6 = new org.telegram.ui.ActionBar.z0(getParentActivity(), true, false);
                    z0Var6.j(org.telegram.messenger.hd.M0(2131750812, null), R.drawable.msg_addfolder, null);
                    z0Var6.setMinimumWidth(org.telegram.messenger.ns.q2);
                    z0Var6.setOnClickListener(new org.telegram.ui.Components.vv0(16, actionBarPopupWindow$ActionBarPopupWindowLayoutArr, iArr));
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(z0Var6);
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().setOnHeightUpdateListener(new zr(e2VarArr, 4));
                }
                if (z10) {
                    ywVar = this;
                    c10 = 0;
                } else {
                    org.telegram.ui.ActionBar.z0 z0Var7 = new org.telegram.ui.ActionBar.z0(getParentActivity(), !z13, false);
                    if (t2Var.getHasUnread()) {
                        z0Var7.j(org.telegram.messenger.hd.M0(2131748681, null), R.drawable.msg_markread, null);
                    } else {
                        z0Var7.j(org.telegram.messenger.hd.M0(2131748680, null), R.drawable.msg_markunread, null);
                    }
                    z0Var7.setMinimumWidth(org.telegram.messenger.ns.q2);
                    ywVar = this;
                    long j13 = dialogId;
                    dialogId = j13;
                    z0Var7.setOnClickListener(new di.v2(ywVar, t2Var, j13, 5));
                    c10 = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(z0Var7);
                }
                boolean[] zArr2 = new boolean[1];
                zArr2[c10] = true;
                TLRPC.Dialog dialog = (TLRPC.Dialog) ywVar.getMessagesController().R.f(dialogId);
                int i19 = ywVar.f0[c10].s;
                boolean z14 = (i19 == 7 || i19 == i10) && (!ywVar.actionBar.x() || ywVar.actionBar.y(null));
                if (z14) {
                    j10 = dialogId;
                    soVar = ywVar.getMessagesController().N[ywVar.f0[0].s == i10 ? (char) 1 : (char) 0];
                } else {
                    j10 = dialogId;
                    soVar = null;
                }
                if (ywVar.s4(dialog)) {
                    zArr = zArr2;
                    r52 = 0;
                } else {
                    ArrayList W0 = ywVar.getMessagesController().W0(ywVar.Y2);
                    int size2 = W0.size();
                    int i20 = 0;
                    int i21 = 0;
                    int i22 = 0;
                    while (true) {
                        if (i20 >= size2) {
                            zArr = zArr2;
                            z11 = z14;
                            break;
                        }
                        TLRPC.Dialog dialog2 = (TLRPC.Dialog) W0.get(i20);
                        ArrayList arrayList2 = W0;
                        if (dialog2 instanceof TLRPC.TL_dialogFolder) {
                            zArr = zArr2;
                        } else if (ywVar.s4(dialog2)) {
                            zArr = zArr2;
                            if (org.telegram.messenger.m5.C(dialog2.id)) {
                                i22++;
                            } else {
                                i21++;
                            }
                        } else {
                            zArr = zArr2;
                            z11 = z14;
                            if (!ywVar.getMessagesController().C2(dialog2.id, false)) {
                                break;
                            }
                            i20++;
                            W0 = arrayList2;
                            zArr2 = zArr;
                            z14 = z11;
                        }
                        z11 = z14;
                        i20++;
                        W0 = arrayList2;
                        zArr2 = zArr;
                        z14 = z11;
                    }
                    if (dialog == null || ywVar.s4(dialog)) {
                        i12 = 0;
                        i13 = 0;
                        i14 = 0;
                    } else {
                        boolean C = org.telegram.messenger.m5.C(j10);
                        int i23 = !C ? 1 : 0;
                        if (soVar == null || !soVar.h.contains(Long.valueOf(j10))) {
                            i14 = i23;
                            i13 = C ? 1 : 0;
                            i12 = 0;
                        } else {
                            i14 = i23;
                            i13 = C ? 1 : 0;
                            i12 = 1;
                        }
                    }
                    int size3 = (!z11 || soVar == null) ? (ywVar.Y2 == 0 && soVar == null) ? ywVar.getUserConfig().q() ? ywVar.getMessagesController().L4 : ywVar.getMessagesController().K4 : ywVar.getUserConfig().q() ? ywVar.getMessagesController().m3 : ywVar.getMessagesController().l3 : 100 - soVar.h.size();
                    boolean z15 = i13 + i22 <= size3 && (i14 + i21) - i12 <= size3;
                    r52 = 0;
                    zArr[0] = z15;
                }
                if (zArr[r52]) {
                    org.telegram.ui.ActionBar.z0 z0Var8 = new org.telegram.ui.ActionBar.z0(ywVar.getParentActivity(), (z13 || !z10) ? r52 : true, r52);
                    if (ywVar.s4(dialog)) {
                        z0Var8.j(org.telegram.messenger.hd.M0(2131743844, null), R.drawable.msg_unpin, null);
                    } else {
                        z0Var8.j(org.telegram.messenger.hd.M0(2131747245, null), R.drawable.msg_pin, null);
                    }
                    z0Var8.setMinimumWidth(org.telegram.messenger.ns.q2);
                    long j14 = j10;
                    org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(ywVar, soVar, dialog, j14, 1);
                    ywVar2 = ywVar;
                    j11 = j14;
                    z0Var8.setOnClickListener(yqVar);
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(z0Var8);
                } else {
                    ywVar2 = ywVar;
                    j11 = j10;
                }
                if (org.telegram.messenger.m5.E(j11) && org.telegram.messenger.q10.B(ywVar2.getMessagesController().a2(Long.valueOf(j11)))) {
                    i11 = 0;
                } else {
                    org.telegram.ui.ActionBar.z0 z0Var9 = new org.telegram.ui.ActionBar.z0(ywVar2.getParentActivity(), false, false);
                    if (ywVar2.getMessagesController().r2(j11, 0L, null)) {
                        z0Var9.j(org.telegram.messenger.hd.M0(2131743849, null), R.drawable.msg_unmute, null);
                    } else {
                        z0Var9.j(org.telegram.messenger.hd.M0(2131748314, null), R.drawable.msg_mute, null);
                    }
                    z0Var9.setMinimumWidth(org.telegram.messenger.ns.q2);
                    z0Var9.setOnClickListener(new bi.q(ywVar2, j11, 4));
                    i11 = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(z0Var9);
                }
                if (!z10) {
                    org.telegram.ui.ActionBar.z0 z0Var10 = new org.telegram.ui.ActionBar.z0(ywVar2.getParentActivity(), i11, true);
                    z0Var10.setIconColor(ywVar2.getThemedColor(org.telegram.ui.ActionBar.j6.p7));
                    int i24 = org.telegram.ui.ActionBar.j6.q7;
                    z0Var10.setTextColor(ywVar2.getThemedColor(i24));
                    z0Var10.h(0.12f, i24);
                    z0Var10.j(org.telegram.messenger.hd.M0(2131751598, null), R.drawable.msg_delete, null);
                    z0Var10.setMinimumWidth(org.telegram.messenger.ns.q2);
                    z0Var10.setOnClickListener(new org.telegram.ui.Components.vv0(17, ywVar2, arrayList));
                    i11 = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(z0Var10);
                }
                int i25 = org.telegram.messenger.ns.t;
                if (z10) {
                    if (ywVar2.p2 != null) {
                        ywVar2.getNotificationCenter().k(i25, new Object[i11]);
                    }
                    ywVar2.F4();
                    ywVar2.parentLayout.setHighlightActionButtons(true);
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("community_id", -j11);
                    yw ywVar4 = new yw(bundle2);
                    Point point = org.telegram.messenger.g0.q;
                    if (point.x > point.y) {
                        e2VarArr[0] = ywVar4;
                        ywVar2.presentFragmentAsPreview(ywVar4);
                        return false;
                    }
                    e2VarArr[0] = ywVar4;
                    ywVar2.presentFragmentAsPreviewWithMenu(ywVar4, actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0]);
                    return false;
                }
                if (!ywVar2.getMessagesController().E(bundle, ywVar2, null, null)) {
                    return i11;
                }
                if (ywVar2.p2 != null) {
                    ywVar2.getNotificationCenter().k(i25, new Object[i11]);
                }
                ywVar2.F4();
                ywVar2.parentLayout.setHighlightActionButtons(true);
                an anVar = new an(bundle);
                Point point2 = org.telegram.messenger.g0.q;
                if (point2.x > point2.y) {
                    e2VarArr[0] = anVar;
                    ywVar2.presentFragmentAsPreview(anVar);
                    return true;
                }
                e2VarArr[0] = anVar;
                ywVar2.presentFragmentAsPreviewWithMenu(anVar, actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0]);
                anVar.fa = true;
                try {
                    anVar.p1.getAvatarImageView().performAccessibilityAction(64, null);
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
        return this.T0 == 10;
    }

    public final void U4(boolean z10) {
        int i7 = 1;
        this.c.a(z10, true);
        if (this.n0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.Q3;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.Q3 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.Q3 = animatorSet2;
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
        this.Q3.playTogether(arrayList);
        this.Q3.addListener(new aw(this, z10, i7));
        this.Q3.start();
    }

    public final void V3() {
        if (!org.telegram.messenger.g0.Q1()) {
            this.X1 = true;
            return;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.n(true);
        }
        TLObject tLObject = this.Z1;
        if (tLObject != null) {
            hw hwVar = this.D0;
            if (hwVar != null) {
                hwVar.e0.Q(this.Y1, tLObject);
            }
            this.Z1 = null;
        }
    }

    public final void V4() {
        if (this.B0 || !getMessagesController().V0 || !getMessagesController().K3 || this.A0 == null || !getMessagesController().T0().isEmpty() || this.isPaused || !getUserConfig().Q || this.inPreviewMode) {
            return;
        }
        SharedPreferences e12 = org.telegram.messenger.np.e1();
        if (e12.getBoolean("filterhint", false)) {
            return;
        }
        e12.edit().putBoolean("filterhint", true).apply();
        org.telegram.messenger.g0.i3(new eu(this, 26), 1000L);
    }

    public final void W3() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar == null || !kVar.o0) {
            return;
        }
        kVar.n(true);
        this.s3 = false;
        i5(true, true);
    }

    public final void W4() {
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2;
        LaunchActivity launchActivity;
        float f10;
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        fu fuVar;
        org.telegram.ui.Components.voip.u uVar;
        org.telegram.ui.ActionBar.z0 z0Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(this, this.l0);
        int i7 = org.telegram.ui.ActionBar.j6.A8;
        H.S(getThemedColor(i7), getThemedColor(i7));
        int i10 = 8;
        H.s = 8;
        Activity parentActivity = getParentActivity();
        LaunchActivity launchActivity2 = parentActivity instanceof LaunchActivity ? (LaunchActivity) parentActivity : null;
        int i11 = 5;
        float f11 = 64.0f;
        int i12 = 0;
        if (this.a3 != 0) {
            int i13 = 1;
            if (org.telegram.messenger.t3.N(this.b3)) {
                H.c(R.drawable.msg_customize, org.telegram.messenger.hd.M0(2131751913, null), new av(this, i13), false);
                H.k();
            }
            H.i(new av(this, 4), org.telegram.messenger.hd.M0(2131751912, null), this.b3.collapsed_in_dialogs);
            H.i(new av(this, i11), org.telegram.messenger.hd.M0(2131751911, null), !this.b3.collapsed_in_dialogs);
            H.Z();
            H.X(-org.telegram.messenger.g0.L(64.0f));
            return;
        }
        if (q4()) {
            H.c(R.drawable.msg_customize, org.telegram.messenger.hd.M0(2131754143, null), new av(this, 6), false);
            H.c(R.drawable.msg_help, org.telegram.messenger.hd.M0(2131749276, null), new av(this, 7), false);
            H.Z();
            H.X(-org.telegram.messenger.g0.L(64.0f));
            return;
        }
        org.telegram.ui.ActionBar.e6 e6Var2 = this.resourceProvider;
        boolean a10 = e6Var2 != null ? e6Var2.a() : org.telegram.ui.ActionBar.j6.I.q();
        H.c(a10 ? R.drawable.menu_day_mode_24 : R.drawable.menu_night_mode_24, org.telegram.messenger.hd.M0(a10 ? 2131744300 : 2131744299, null), new av(this, i10), false);
        H.k();
        H.c(R.drawable.outline_groups_24, org.telegram.messenger.hd.M0(2131748273, null), new av(this, 9), false);
        int i14 = 10;
        H.c(R.drawable.outline_saved_24, org.telegram.messenger.hd.M0(2131745901, null), new av(this, i14), false);
        org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.a;
        if (((org.telegram.messenger.h0) getMessagesController().y7.j0.b).c) {
            H.c(R.drawable.ic_gram, org.telegram.messenger.hd.M0(2131743194, null), new eu(this, i12), false);
        } else {
            TLRPC.TL_attachMenuBots tL_attachMenuBots = org.telegram.messenger.si.b0(org.telegram.messenger.m10.t0).b;
            if (launchActivity2 != null && tL_attachMenuBots != null && (arrayList = tL_attachMenuBots.bots) != null && !arrayList.isEmpty()) {
                ArrayList<TLRPC.TL_attachMenuBot> arrayList3 = tL_attachMenuBots.bots;
                int size = arrayList3.size();
                int i15 = 0;
                while (i15 < size) {
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList3.get(i15);
                    i15++;
                    TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                    if (tL_attachMenuBot2.show_in_side_menu) {
                        fu fuVar2 = new fu(this, tL_attachMenuBot2, launchActivity2, i12);
                        org.telegram.ui.Components.voip.u uVar2 = new org.telegram.ui.Components.voip.u(i14, this, tL_attachMenuBot2);
                        org.telegram.ui.ActionBar.e6 e6Var3 = H.d;
                        if (H.e != null) {
                            int i16 = org.telegram.ui.ActionBar.j6.F8;
                            int i17 = org.telegram.ui.ActionBar.j6.E8;
                            f10 = f11;
                            org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(0, H.e, H.d, false, false);
                            z0Var2.setPadding(org.telegram.messenger.g0.L(18.0f), i12, org.telegram.messenger.g0.L(18.0f), i12);
                            CharSequence b10 = tL_attachMenuBot2.side_menu_disclaimer_needed ? org.telegram.ui.Cells.l8.b(tL_attachMenuBot2.short_name) : tL_attachMenuBot2.short_name;
                            Pattern pattern = org.telegram.messenger.si.S1;
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
                                org.telegram.messenger.pz f12 = org.telegram.messenger.t5.f(tL_attachMenuBotIcon.icon, org.telegram.ui.ActionBar.j6.c7, 1.0f, null);
                                if (f12 != null) {
                                    Integer num = H.k0;
                                    new PorterDuffColorFilter(num != null ? num.intValue() : org.telegram.ui.ActionBar.j6.w0(i16, e6Var3), PorterDuff.Mode.SRC_IN);
                                }
                                org.telegram.messenger.gc b11 = org.telegram.messenger.gc.b(tL_attachMenuBotIcon.icon);
                                fuVar = fuVar2;
                                z0Var = z0Var2;
                                e6Var = e6Var3;
                                uVar = uVar2;
                                z0Var.k(b10, b11, "24_24", f12, tL_attachMenuBot2);
                                org.telegram.ui.Components.i9 i9Var = z0Var.h;
                                if (i9Var != null) {
                                    i9Var.setLayoutParams(c8.ja.e(24, 24, (org.telegram.messenger.hd.a0 ? 5 : 3) | 16));
                                }
                            } else {
                                fuVar = fuVar2;
                                uVar = uVar2;
                                z0Var = z0Var2;
                                e6Var = e6Var3;
                                z0Var.j(b10, R.drawable.msg_bot, null);
                            }
                            Integer num2 = H.j0;
                            if (num2 == null && H.k0 == null) {
                                z0Var.c(i17, i16);
                            } else {
                                int intValue = num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.j6.w0(i17, e6Var);
                                Integer num3 = H.k0;
                                z0Var.d(intValue, num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.j6.w0(i16, e6Var));
                            }
                            Integer num4 = H.k0;
                            z0Var.setIconColorImage(num4 != null ? num4.intValue() : org.telegram.ui.ActionBar.j6.w0(i16, e6Var));
                            Integer num5 = H.l0;
                            if (num5 != null) {
                                z0Var.setSelectorColor(num5.intValue());
                            } else {
                                z0Var.h(0.12f, i17);
                            }
                            z0Var.setOnClickListener(new org.telegram.ui.Components.n2(23, H, fuVar));
                            z0Var.setOnLongClickListener(new fi.b2(3, H, uVar));
                            int i20 = H.S;
                            if (i20 > 0) {
                                z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i20));
                                H.r(z0Var, c8.ja.o(H.S, -2));
                            } else {
                                H.r(z0Var, c8.ja.o(-1, -2));
                            }
                            arrayList3 = arrayList2;
                            launchActivity2 = launchActivity;
                            f11 = f10;
                            i14 = 10;
                            i12 = 0;
                        }
                    }
                    arrayList2 = arrayList3;
                    launchActivity = launchActivity2;
                    f10 = f11;
                    arrayList3 = arrayList2;
                    launchActivity2 = launchActivity;
                    f11 = f10;
                    i14 = 10;
                    i12 = 0;
                }
            }
        }
        float f13 = f11;
        if (getUserConfig().X) {
            H.c(R.drawable.msg_settings_old, org.telegram.messenger.hd.M0(2131745495, null), new av(this, 3), false);
        }
        org.telegram.ui.ActionBar.z0 z0Var3 = this.p0;
        if (z0Var3 != null) {
            org.telegram.ui.ActionBar.q6.U(z0Var3.b, org.telegram.ui.ActionBar.j6.Ri, getResourceProvider());
            this.p0.setOnClickListener(new org.telegram.ui.Components.vv0(20, this, H));
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0);
            String string = sharedPreferences.getString("proxy_ip", "");
            if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().z3 && !org.telegram.messenger.gz.z1.isEmpty())) {
                H.k();
                H.d(this.p0);
            }
        }
        H.Z();
        H.X(-org.telegram.messenger.g0.L(f13));
    }

    @Override // org.telegram.ui.ActionBar.e2, org.telegram.ui.ie0
    public final boolean X(MotionEvent motionEvent, boolean z10) {
        uv uvVar;
        rv rvVar;
        ow owVar;
        if (!this.s3 && (((uvVar = this.H3) == null || !uvVar.c()) && (((rvVar = this.L0) == null || rvVar.getVisibility() != 0) && ((owVar = this.A0) == null || !owVar.n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                ow owVar2 = this.A0;
                boolean z11 = owVar2 == null || owVar2.getTabsCount() < 2 || this.A0.getCurrentTabId() == this.A0.getFirstTabId();
                ow owVar3 = this.A0;
                boolean z12 = owVar3 == null || owVar3.getTabsCount() < 2 || this.A0.getCurrentTabId() == this.A0.getLastTabId();
                org.telegram.messenger.gz.m(this.currentAccount);
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

    public final void X3(String str) {
        if (this.actionBar.c(str)) {
            return;
        }
        org.telegram.ui.ActionBar.y p10 = this.actionBar.p(str);
        boolean z10 = this.X;
        int i7 = 1;
        ArrayList arrayList = this.k1;
        if (z10) {
            ImageView imageView = new ImageView(getParentActivity());
            this.i1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.i1.setImageDrawable(new org.telegram.ui.ActionBar.x1(true));
            org.telegram.ui.ActionBar.q6.s(this.i1, org.telegram.ui.ActionBar.j6.y8, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.i1;
            int i10 = org.telegram.ui.ActionBar.j6.z8;
            org.telegram.ui.ActionBar.q6.Q(imageView2, org.telegram.ui.ActionBar.j6.h0(getThemedColor(i10), 1, -1), null, org.telegram.ui.ActionBar.q6.M(i10), getResourceProvider());
            this.i1.setOnClickListener(new gu(this, 6));
            p10.addView(this.i1, c8.ja.r(54, 54, 16));
            arrayList.add(this.i1);
        }
        NumberTextView numberTextView = new NumberTextView(p10.getContext());
        this.j1 = numberTextView;
        numberTextView.setTextSize(18);
        this.j1.setTypeface(org.telegram.messenger.g0.o());
        this.j1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.y8));
        p10.addView(this.j1, c8.ja.m(1.0f, 0, -1, this.X ? 18 : 72, 0, 0));
        this.j1.setOnTouchListener(new gi.a(2));
        this.m1 = p10.g(100, R.drawable.msg_pin, org.telegram.messenger.g0.L(48.0f));
        this.n1 = p10.g(org.telegram.messenger.ns.p1, R.drawable.msg_mute, org.telegram.messenger.g0.L(48.0f));
        this.o1 = p10.g(org.telegram.messenger.ns.s1, R.drawable.msg_archive, org.telegram.messenger.g0.L(48.0f));
        this.l1 = p10.h(org.telegram.messenger.ns.n1, R.drawable.msg_delete, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.hd.M0(2131751598, null));
        org.telegram.ui.ActionBar.q0 h = p10.h(0, R.drawable.ic_ab_other, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.hd.M0(2131754839, null));
        p10.addView(new View(getParentActivity()), c8.ja.o(5, -1));
        this.s1 = h.e(org.telegram.messenger.ns.q1, R.drawable.msg_archive, org.telegram.messenger.hd.M0(2131754172, null));
        this.p1 = h.e(org.telegram.messenger.ns.t1, R.drawable.msg_pin, org.telegram.messenger.hd.M0(2131751453, null));
        this.q1 = h.e(org.telegram.messenger.ns.u1, R.drawable.msg_addfolder, org.telegram.messenger.hd.M0(2131750812, null));
        this.r1 = h.e(org.telegram.messenger.ns.v1, R.drawable.msg_removefolder, org.telegram.messenger.hd.M0(2131750712, null));
        this.u1 = h.e(101, R.drawable.msg_markread, org.telegram.messenger.hd.M0(2131748681, null));
        this.t1 = h.e(org.telegram.messenger.ns.o1, R.drawable.msg_clear, org.telegram.messenger.hd.M0(2131752089, null));
        this.v1 = h.e(org.telegram.messenger.ns.r1, R.drawable.msg_block, org.telegram.messenger.hd.M0(2131753692, null));
        this.n1.setOnLongClickListener(new ru(this, i7));
        arrayList.add(this.m1);
        arrayList.add(this.o1);
        arrayList.add(this.n1);
        arrayList.add(this.l1);
        arrayList.add(h);
        f5(false);
    }

    public final void X4() {
        if (this.T3 != null) {
            return;
        }
        for (String str : getMessagesController().T3) {
            if ("AUTOARCHIVE_POPULAR".equals(str)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = org.telegram.messenger.hd.M0(2131749319, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = M0;
                t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131749320, null));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131749533, null), new hu(this, 6));
                showDialog(t1Var, new nu(this, 0));
                this.T3 = str;
                return;
            }
        }
    }

    public final void Y3() {
        hw hwVar = this.D0;
        if ((hwVar != null && hwVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        hw hwVar2 = new hw(this, getParentActivity(), this, this.p2 != null ? 2 : !this.n2 ? 1 : 0, this.T0, this.Y2, this.a3, new ev(this));
        this.D0 = hwVar2;
        this.glassEngine.c(hwVar2);
        ((rw) this.fragmentView).addView(this.D0, this.C0);
        hw hwVar3 = this.D0;
        hwVar3.e0.V = new jw(this);
        hwVar3.l0.setOnItemClickListener(new hu(this, 1));
        this.D0.q0.setOnItemClickListener(new hu(this, 2));
        this.D0.x0.setOnItemClickListener(new mu(this, 0));
        this.D0.q0.setOnItemLongClickListener(new hu(this, 3));
        this.D0.b0.setOnItemClickListener(new hu(this, 4));
        this.D0.b0.setOnItemLongClickListener(new ev(this));
        this.D0.setFilteredSearchViewDelegate(new hu(this, 5));
        this.D0.setAlpha(0.0f);
        this.D0.setScaleX(1.05f);
        this.D0.setScaleY(1.05f);
        this.D0.setVisibility(8);
        this.D0.setBlurredBackgroundDrawableFactory(this.q4);
    }

    public final void Y4(long j3, View view) {
        s3(j3, view);
        boolean x10 = this.actionBar.x();
        ArrayList arrayList = this.K2;
        boolean z10 = true;
        char c10 = 1;
        int i7 = 0;
        if (!x10) {
            if (this.s3) {
                X3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.p4)) {
                    this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
                }
            } else {
                X3(null);
            }
            org.telegram.messenger.g0.v1(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            this.actionBar.R(null, null);
            int i10 = this.f0[0].s;
            ArrayList d42 = ((i10 == 7 || i10 == 8) && (!this.actionBar.x() || this.actionBar.y(null))) ? d4(this.currentAccount, this.f0[0].s, this.Y2, this.U1) : getMessagesController().W0(this.Y2);
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
                        xw[] xwVarArr = this.f0;
                        if (i13 >= xwVarArr.length) {
                            break;
                        }
                        xwVarArr[i13].d.I = true;
                        i13++;
                    }
                }
                int i14 = org.telegram.messenger.np.D8;
                u5(131072, true);
            }
            if (!this.s3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = this.k1;
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
            ValueAnimator valueAnimator = this.x3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.x3 = ValueAnimator.ofFloat(this.w3, 1.0f);
            int i16 = 0;
            while (true) {
                xw[] xwVarArr2 = this.f0;
                if (i16 >= xwVarArr2.length) {
                    break;
                }
                xw xwVar = xwVarArr2[i16];
                if (xwVar != null) {
                    xwVar.a.I0(true);
                }
                i16++;
            }
            float max = Math.max(0.0f, org.telegram.messenger.g0.L((this.L ? 81 : 0) + 48) + this.O);
            if (max != 0.0f) {
                this.Q = (int) max;
                this.fragmentView.requestLayout();
            }
            this.x3.addUpdateListener(new iu(this, max, i7));
            this.x3.addListener(new cw(this, max, c10 == true ? 1 : 0));
            this.x3.setInterpolator(org.telegram.ui.Components.er.f);
            this.x3.setDuration(200L);
            this.x3.start();
            ow owVar = this.A0;
            if (owVar != null) {
                owVar.b(org.telegram.ui.ActionBar.j6.xi, org.telegram.ui.ActionBar.j6.wi, org.telegram.ui.ActionBar.j6.vi, org.telegram.ui.ActionBar.j6.yi, org.telegram.ui.ActionBar.j6.w8);
            }
            org.telegram.ui.ActionBar.x1 x1Var = this.g1;
            if (x1Var != null) {
                x1Var.c(true, 1.0f);
            }
            z10 = false;
        } else if (arrayList.isEmpty()) {
            n4(true);
            return;
        }
        f5(false);
        this.j1.a(arrayList.size(), z10);
    }

    public final void Z3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.z0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i7 = 0; i7 < 2; i7++) {
                undoViewArr[i7] = new dw(this, parentActivity);
                FrameLayout.LayoutParams d = c8.ja.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                d.bottomMargin = this.h4 + this.j4 + d.bottomMargin;
                rw rwVar = (rw) this.fragmentView;
                UndoView undoView = undoViewArr[i7];
                int i10 = this.y0 + 1;
                this.y0 = i10;
                rwVar.addView(undoView, i10, d);
            }
        }
    }

    public final void Z4(long j3, View view) {
        int i7 = -this.N3;
        this.N3 = i7;
        org.telegram.messenger.g0.F3(i7, view, null);
        org.telegram.messenger.p2.E.a();
        String p10 = j3 >= 0 ? org.telegram.messenger.q10.p(org.telegram.messenger.np.s1(this.currentAccount).a2(Long.valueOf(j3))) : "";
        (getMessagesController().D3() ? org.telegram.ui.Components.cc.a0(this).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131743760, p10))) : org.telegram.ui.Components.cc.a0(this).K(R.raw.star_premium_2, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131743760, p10)), org.telegram.messenger.hd.M0(2131743759, null), new eu(this, 8))).j();
    }

    public final void a4(final long j3, final long j10, boolean z10, final u91 u91Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String M0;
        String b02;
        String M02;
        TLRPC.TL_forumTopic f10;
        if (A3(j3)) {
            int i7 = this.T0;
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
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), null);
                TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
                tL_messages_checkHistoryImportPeer.peer = getMessagesController().j1(j3);
                getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new di.i3(this, t1Var, user, chat, j3, tL_messages_checkHistoryImportPeer));
                try {
                    t1Var.r(300L);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            if (!z10 || ((this.h2 == null || this.i2 == null) && this.j2 == null)) {
                if (i7 != 15) {
                    if (this.E2 == null) {
                        finishFragment();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(org.telegram.messenger.ur.a(j3, j10));
                    if (this.E2.y(this, arrayList, null, false, this.L2, this.M2, this.N2, u91Var) && this.k2) {
                        this.E2 = null;
                        return;
                    }
                    return;
                }
                Runnable m1Var = new bi.m1(this, j3, new d3.e0(this, j3, j10, u91Var, 6), 27);
                if (j3 < 0) {
                    c5(getMessagesController().M0(Long.valueOf(-j3)), m1Var, null);
                    return;
                }
                TLRPC.User a23 = getMessagesController().a2(Long.valueOf(j3));
                TLRPC.User a24 = getMessagesController().a2(Long.valueOf(this.I));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String a02 = org.telegram.messenger.hd.a0(null, null, 2131754074, org.telegram.messenger.q10.j(a23, true), org.telegram.messenger.q10.j(a24, true));
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.a;
                t1Var2.S = a02;
                t1Var2.U = TextUtils.concat(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131754075, org.telegram.messenger.q10.j(a23, true), org.telegram.messenger.q10.j(a24, true))));
                alertDialog$Builder.k(org.telegram.messenger.hd.a0("Send", null, 2131745640, new Object[0]), new zr(m1Var, 5));
                alertDialog$Builder.h(org.telegram.messenger.hd.a0("Cancel", null, 2131752589, new Object[0]), new org.telegram.ui.Components.rb0(22));
                showDialog(t1Var2);
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
                M0 = org.telegram.messenger.hd.M0(2131745596, null);
                b02 = org.telegram.messenger.hd.b0(this.h2, org.telegram.messenger.q10.p(a25));
                M02 = org.telegram.messenger.hd.M0(2131745640, null);
            } else if (!org.telegram.messenger.m5.E(j3)) {
                TLRPC.Chat M04 = getMessagesController().M0(Long.valueOf(-j3));
                if (M04 == null) {
                    return;
                }
                String str = M04.title;
                if (j10 != 0 && (f10 = getMessagesController().r7.f(M04.id, j10)) != null) {
                    str = ((Object) str) + " " + f10.title;
                }
                if (this.j2 != null) {
                    M0 = org.telegram.messenger.hd.M0(2131754366, null);
                    b02 = org.telegram.messenger.hd.b0(this.j2, str);
                    M02 = org.telegram.messenger.hd.M0(2131754486, null);
                } else {
                    M0 = org.telegram.messenger.hd.M0(2131745596, null);
                    b02 = org.telegram.messenger.hd.b0(this.i2, str);
                    M02 = org.telegram.messenger.hd.M0(2131745640, null);
                }
            } else if (j3 == getUserConfig().e()) {
                M0 = org.telegram.messenger.hd.M0(2131745596, null);
                b02 = org.telegram.messenger.hd.b0(this.i2, org.telegram.messenger.hd.M0(2131745901, null));
                M02 = org.telegram.messenger.hd.M0(2131745640, null);
            } else {
                TLRPC.User a26 = getMessagesController().a2(Long.valueOf(j3));
                if (a26 == null || this.h2 == null) {
                    return;
                }
                M0 = org.telegram.messenger.hd.M0(2131745596, null);
                b02 = org.telegram.messenger.hd.b0(this.h2, org.telegram.messenger.q10.p(a26));
                M02 = org.telegram.messenger.hd.M0(2131745640, null);
            }
            org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder2.a;
            t1Var3.S = M0;
            t1Var3.U = org.telegram.messenger.g0.X2(b02);
            alertDialog$Builder2.k(M02, new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.zu
                @Override // org.telegram.ui.ActionBar.q1
                public final void h(org.telegram.ui.ActionBar.t1 t1Var4, int i10) {
                    yw.this.a4(j3, j10, false, u91Var);
                }
            });
            alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            if (showDialog(t1Var3) == null) {
                t1Var3.show();
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
    public final void a5(boolean z10, boolean z11, boolean z12, boolean z13) {
        hw hwVar;
        hw hwVar2;
        qv qvVar;
        hw hwVar3;
        boolean z14;
        hw hwVar4;
        boolean z15;
        org.telegram.ui.Components.v61 v61Var;
        TLRPC.Chat chat;
        uv uvVar;
        boolean z16 = z12;
        this.b.a(z10, z16);
        int i7 = 0;
        if (z10) {
            Y3();
        } else {
            q5(false);
        }
        int i10 = this.T0;
        if (i10 != 0 && i10 != 3) {
            z16 = false;
        }
        AnimatorSet animatorSet = this.y1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.y1 = null;
        }
        this.s3 = z10;
        this.glassEngine.g();
        if (!z10) {
            i5(false, z16);
        }
        if (z10) {
            if (!this.v3 && !z13) {
                ArrayList arrayList = (ArrayList) getMessagesController().w.get(0);
                int size = arrayList != null ? arrayList.size() : 0;
                if (this.n2 || (size <= 10 && !this.L)) {
                    z14 = true;
                    hwVar4 = this.D0;
                    if (hwVar4 != null) {
                        hwVar4.R0 = z14;
                    }
                    z15 = z14 || this.L;
                    this.u3 = z15;
                    if (z15) {
                        this.v3 = true;
                    }
                    v61Var = this.b0;
                    if (v61Var != null && hwVar4 != null && !z14 && this.a3 == 0) {
                        org.telegram.ui.Components.v61 i11 = hwVar4.i(-2, false);
                        this.b0 = i11;
                        this.a0.addView(i11, 0, c8.ja.e(-1, -1, org.telegram.messenger.ns.E1));
                    } else if (this.a0 != null && z14 && this.a3 == 0) {
                        org.telegram.messenger.g0.E2(v61Var);
                        this.b0 = null;
                    }
                    if (this.D0 != null) {
                        S3(false);
                        this.D0.setKeyboardHeight(((rw) this.fragmentView).getKeyboardHeight());
                        hw hwVar5 = this.D0;
                        hwVar5.D0.clear();
                        hwVar5.J();
                    }
                    chat = this.b3;
                    if (chat == null) {
                        jg.o0 o0Var = new jg.o0(R.drawable.search_users_filled, 4, org.telegram.messenger.m5.u(chat));
                        o0Var.f = this.b3;
                        t3(o0Var);
                    } else if (this.Y2 != 0 && ((uvVar = this.H3) == null || !uvVar.c())) {
                        t3(new jg.o0(R.drawable.chats_archive, 2131754150, null, 7));
                    }
                }
            }
            z14 = false;
            hwVar4 = this.D0;
            if (hwVar4 != null) {
            }
            if (z14) {
            }
            this.u3 = z15;
            if (z15) {
            }
            v61Var = this.b0;
            if (v61Var != null) {
            }
            if (this.a0 != null) {
                org.telegram.messenger.g0.E2(v61Var);
                this.b0 = null;
            }
            if (this.D0 != null) {
            }
            chat = this.b3;
            if (chat == null) {
            }
        }
        if (z16 && (hwVar3 = this.D0) != null && hwVar3.e0.M()) {
            org.telegram.messenger.g0.l3(getParentActivity(), this.classGuid);
        } else {
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        }
        if (!z10 && (qvVar = this.F0) != null && this.H0) {
            qvVar.setVisibility(0);
        }
        Object[] objArr = org.telegram.messenger.gz.o() == 0 || !org.telegram.messenger.qc.e(32768);
        if (z16) {
            if (z10) {
                hw hwVar6 = this.D0;
                if (hwVar6 != null) {
                    hwVar6.setVisibility(0);
                    hw hwVar7 = this.D0;
                    hwVar7.setPosition(0);
                    if (hwVar7.e0.b() > 0) {
                        hwVar7.f0.h1(0, 0);
                    }
                    v4.b0 b0Var = hwVar7.k0;
                    if (b0Var != null) {
                        b0Var.h1(0, 0);
                    }
                    v4.b0 b0Var2 = hwVar7.p0;
                    if (b0Var2 != null) {
                        b0Var2.h1(0, 0);
                    }
                    v4.b0 b0Var3 = hwVar7.w0;
                    if (b0Var3 != null) {
                        b0Var3.h1(0, 0);
                    }
                    hwVar7.h.clear();
                }
                j5(true, null, null, false, false);
                org.telegram.ui.Components.v61 v61Var2 = this.b0;
                if (v61Var2 != null) {
                    v61Var2.b(false, false);
                }
            } else {
                this.f0[0].a.setVisibility(0);
                this.f0[0].setVisibility(0);
            }
            M4(true, true);
            this.f0[0].a.setVerticalScrollBarEnabled(false);
            hw hwVar8 = this.D0;
            if (hwVar8 != null) {
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, hwVar8, getResourceProvider());
            }
            this.y1 = new AnimatorSet();
            ArrayList arrayList2 = new ArrayList();
            xw xwVar = this.f0[0];
            Property property = View.ALPHA;
            arrayList2.add(ObjectAnimator.ofFloat(xwVar, (Property<xw, Float>) property, z10 ? 0.0f : 1.0f));
            if (objArr == true) {
                this.f0[0].setScaleX(1.0f);
                this.f0[0].setScaleY(1.0f);
            } else {
                arrayList2.add(ObjectAnimator.ofFloat(this.f0[0], (Property<xw, Float>) View.SCALE_X, z10 ? 0.95f : 1.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.f0[0], (Property<xw, Float>) View.SCALE_Y, z10 ? 0.95f : 1.0f));
            }
            uv uvVar2 = this.H3;
            if (uvVar2 != null) {
                uvVar2.setVisibility(0);
                arrayList2.add(ObjectAnimator.ofFloat(this.H3, (Property<uv, Float>) property, z10 ? 0.0f : 1.0f));
            }
            hw hwVar9 = this.D0;
            if (hwVar9 != null) {
                arrayList2.add(ObjectAnimator.ofFloat(hwVar9, (Property<hw, Float>) property, z10 ? 1.0f : 0.0f));
                if (this.L) {
                    float L = org.telegram.messenger.g0.L(81.0f) + this.O + org.telegram.messenger.g0.L(48.0f);
                    hw hwVar10 = this.D0;
                    float f10 = z10 ? L : 0.0f;
                    if (z10) {
                        L = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(hwVar10, this.J3, f10, L));
                }
                if (objArr == true) {
                    this.D0.setScaleX(1.0f);
                    this.D0.setScaleY(1.0f);
                } else {
                    arrayList2.add(ObjectAnimator.ofFloat(this.D0, (Property<hw, Float>) View.SCALE_X, z10 ? 1.0f : 1.05f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.D0, (Property<hw, Float>) View.SCALE_Y, z10 ? 1.0f : 1.05f));
                }
            }
            if (this.h0 != null) {
                m5(false, false);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.z1, z10 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new lu(this, i7));
            arrayList2.add(ofFloat);
            this.y1.playTogether(arrayList2);
            this.y1.setDuration(z10 ? 200L : 180L);
            this.y1.setInterpolator(org.telegram.ui.Components.er.g);
            if (!z10) {
                this.y1.setStartDelay(20L);
            }
            this.y1.addListener(new aw(this, z10, i7));
            this.r3.d();
            this.y1.start();
        } else {
            M4(false, true);
            if (z10) {
                this.f0[0].a.c1();
            } else {
                uw uwVar = this.f0[0].a;
                if (uwVar.h1) {
                    uwVar.h1 = false;
                    uwVar.K0(false);
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
            hw hwVar11 = this.D0;
            if (hwVar11 != null) {
                hwVar11.setAlpha(z10 ? 1.0f : 0.0f);
                if (objArr == true) {
                    this.D0.setScaleX(1.0f);
                    this.D0.setScaleY(1.0f);
                } else {
                    this.D0.setScaleX(z10 ? 1.0f : 1.1f);
                    this.D0.setScaleY(z10 ? 1.0f : 1.1f);
                }
                this.D0.setVisibility(z10 ? 0 : 8);
            }
            nw nwVar = this.Y;
            if (nwVar != null) {
                nwVar.setTranslationY(i4() + (z10 ? -org.telegram.messenger.g0.L(36.0f) : 0));
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
        int i12 = this.y;
        if (i12 >= 0 && (hwVar2 = this.D0) != null) {
            hwVar2.setPosition(hwVar2.L(i12));
        }
        if (!z10) {
            this.y = -1;
        }
        if (z10 && z11 && (hwVar = this.D0) != null) {
            hwVar.setPosition((hwVar.t0 ? 1 : 0) + 5);
            q5(true);
        }
        R3();
        g5();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Zk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Yk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.dl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.cl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.bl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.al));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ti));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.g8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ne));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Jj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Me));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Le));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.yj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.wj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.xj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.W8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Zl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.e9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.M7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.N7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.h9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.n9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.l9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.b8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.a8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Z7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Y7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.X7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.W7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.V7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.K7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.qk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Z5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.y9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.x9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.w9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.t9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.r9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.b9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.yi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.I5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.E8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G8));
    }

    public final void b4(long j3, boolean z10) {
        if (this.f0 == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            xw[] xwVarArr = this.f0;
            if (i7 >= xwVarArr.length) {
                return;
            }
            int childCount = xwVarArr[i7].a.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 < childCount) {
                    View childAt = this.f0[i7].a.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.t2) {
                        org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) childAt;
                        if (t2Var.getDialogId() == j3) {
                            t2Var.e0(z10, true);
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
        if (this.N0 != null || org.telegram.messenger.gz.x || (this.L && !this.F0.g())) {
            return;
        }
        e11[] e11VarArr = new e11[1];
        TLRPC.User f10 = org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).f();
        org.telegram.ui.ActionBar.j5 titleTextView = this.actionBar.getTitleTextView();
        if (titleTextView == null || titleTextView.getRightDrawable() == null) {
            i7 = 0;
            i10 = 0;
        } else {
            this.F3.f();
            Drawable drawable = this.F3.f[0];
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set(titleTextView.getRightDrawable().getBounds());
            rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
            int L = (-(this.actionBar.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
            i7 = org.telegram.messenger.g0.L(4.0f) + (rect.centerX() - org.telegram.messenger.g0.L(16.0f));
            org.telegram.ui.Cells.o oVar = this.G3;
            if (oVar != null) {
                oVar.b(rect.centerX(), rect.centerY());
            }
            i10 = L;
        }
        vv vvVar = new vv(this, this, getParentActivity(), Integer.valueOf(i7), getResourceProvider(), e11VarArr);
        if (f10 != null && org.telegram.messenger.m5.g(f10.emoji_status) > 0) {
            vvVar.setExpireDateHint(org.telegram.messenger.m5.g(f10.emoji_status));
        }
        Long l10 = this.D3;
        if (l10 != null) {
            vvVar.setSelected(l10);
        } else {
            Drawable drawable2 = this.F3.f[0];
            vvVar.setSelected(drawable2 instanceof org.telegram.ui.Components.g5 ? Long.valueOf(((org.telegram.ui.Components.g5) drawable2).h()) : null);
        }
        vvVar.setSaveState(1);
        vvVar.y(this.F3, titleTextView);
        wv wvVar = new wv(this, vvVar);
        this.N0 = wvVar;
        e11VarArr[0] = wvVar;
        wvVar.showAsDropDown(this.actionBar, org.telegram.messenger.g0.L(16.0f), i10, 48);
        e11VarArr[0].b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0069, code lost:
    
        if (r13.H.bot_admin_rights != null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v0, types: [org.telegram.ui.ActionBar.e2, org.telegram.ui.yw] */
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
        int i7 = 1;
        int i10 = 2;
        String a03 = org.telegram.messenger.hd.a0(null, null, 2131754074, chat.title, org.telegram.messenger.q10.j(a22, true));
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = a03;
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131754075, chat.title, org.telegram.messenger.q10.j(a22, true)));
        Boolean bool = this.H.bot_participant;
        ?? r10 = "";
        if (bool == null || !bool.booleanValue() || getMessagesController().x2(chat, a22)) {
            charSequence = r10;
        }
        if (this.H.bot_admin_rights == null) {
            a02 = org.telegram.messenger.hd.a0(null, null, 2131754077, org.telegram.messenger.q10.j(a22, true), chat.title);
        } else {
            String j3 = org.telegram.messenger.q10.j(a22, true);
            String str = chat.title;
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.H.bot_admin_rights;
            int i11 = org.telegram.ui.Cells.n6.c;
            ArrayList arrayList = new ArrayList();
            if (tL_chatAdminRights.change_info) {
                org.telegram.ui.Cells.y0.o(1, V ? org.telegram.messenger.hd.M0(2131751324, null) : org.telegram.messenger.hd.M0(2131751323, null), arrayList);
            }
            if (tL_chatAdminRights.post_messages && V) {
                org.telegram.ui.Cells.y0.o(1, org.telegram.messenger.hd.M0(2131751312, null), arrayList);
            }
            if (tL_chatAdminRights.edit_messages && V) {
                org.telegram.ui.Cells.y0.o(1, org.telegram.messenger.hd.M0(2131751319, null), arrayList);
            }
            if (tL_chatAdminRights.delete_messages) {
                org.telegram.ui.Cells.y0.o(1, org.telegram.messenger.hd.M0(V ? 2131751321 : 2131751316, null), arrayList);
            }
            if (tL_chatAdminRights.ban_users && !V) {
                org.telegram.ui.Cells.y0.o(1, org.telegram.messenger.hd.M0(2131751328, null), arrayList);
            }
            if (tL_chatAdminRights.invite_users) {
                org.telegram.ui.Cells.y0.o(1, org.telegram.messenger.hd.M0(2131751330, null), arrayList);
            }
            if (tL_chatAdminRights.pin_messages && !V) {
                org.telegram.ui.Cells.y0.o(1, org.telegram.messenger.hd.M0(2131751313, null), arrayList);
            }
            if (tL_chatAdminRights.add_admins) {
                org.telegram.ui.Cells.y0.o(1, org.telegram.messenger.hd.M0(2131751331, null), arrayList);
            }
            if (tL_chatAdminRights.anonymous && !V) {
                org.telegram.ui.Cells.y0.o(1, org.telegram.messenger.hd.M0(2131751303, null), arrayList);
            }
            if (tL_chatAdminRights.manage_call) {
                org.telegram.ui.Cells.y0.o(1, org.telegram.messenger.hd.M0(2131744901, null), arrayList);
            }
            if (tL_chatAdminRights.manage_topics && !V) {
                org.telegram.ui.Cells.y0.o(1, org.telegram.messenger.hd.M0(2131748692, null), arrayList);
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
            a02 = org.telegram.messenger.hd.a0(null, null, 2131754076, new Object[]{j3, str, r10});
        }
        charSequence = TextUtils.concat("\n\n", org.telegram.messenger.g0.X2(a02));
        t1Var.U = TextUtils.concat(X2, charSequence);
        alertDialog$Builder.k(org.telegram.messenger.hd.a0("Send", null, 2131745640, new Object[0]), new te(i7, runnable));
        alertDialog$Builder.h(org.telegram.messenger.hd.a0("Cancel", null, 2131752589, new Object[0]), new te(i10, runnable2));
        showDialog(t1Var);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean canBeginSlide() {
        ow owVar;
        if (this.H3.c()) {
            return false;
        }
        return this.T0 != 3 || (owVar = this.A0) == null || owVar.getVisibility() != 0 || this.A0.L <= 0;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean closeLastFragment() {
        if (!this.H3.c()) {
            return super.closeLastFragment();
        }
        this.H3.a();
        hw hwVar = this.D0;
        if (hwVar == null) {
            return true;
        }
        hwVar.R();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.Components.o7 o7Var = new org.telegram.ui.Components.o7(this, context, this.resourceProvider, 3);
        o7Var.setAllowOverlayTitle(true);
        o7Var.H0 = true;
        if (o7Var.G0 == null) {
            bi.v1 v1Var = new bi.v1(o7Var.getContext(), 7);
            o7Var.G0 = v1Var;
            o7Var.addView(v1Var);
        }
        org.telegram.ui.ActionBar.q6.l(o7Var, 3, org.telegram.ui.ActionBar.j6.t8, getResourceProvider());
        org.telegram.ui.ActionBar.q6.a(o7Var, org.telegram.ui.ActionBar.j6.z8, getResourceProvider(), true);
        org.telegram.ui.ActionBar.q6.l(o7Var, 1, org.telegram.ui.ActionBar.j6.v8, getResourceProvider());
        org.telegram.ui.ActionBar.q6.b(o7Var, org.telegram.ui.ActionBar.j6.y8, getResourceProvider(), true);
        if (o7Var.y1 == null) {
            fi.j jVar = new fi.j(o7Var, o7Var.getContext(), o7Var.K0, o7Var.P0);
            o7Var.y1 = jVar;
            jVar.setClipChildren(false);
            o7Var.addView(o7Var.y1);
        }
        o7Var.getAdditionalSubTitleOverlayContainer().setTranslationX(org.telegram.messenger.g0.L(4.0f));
        o7Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-org.telegram.messenger.g0.L(3.0f));
        if (!this.inPreviewMode && (!org.telegram.messenger.g0.Q1() || this.Y2 == 0 || q4())) {
            return o7Var;
        }
        o7Var.setOccupyStatusBar(false);
        return o7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0c15  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0c57  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0c80  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0cc2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0cd8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0cff  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0db3  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0e10  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0e48  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0dcd  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0c88  */
    /* JADX WARN: Type inference failed for: r10v18, types: [org.telegram.ui.Components.uj0, org.telegram.ui.uw] */
    /* JADX WARN: Type inference failed for: r10v23, types: [org.telegram.ui.Components.uj0, org.telegram.ui.uw] */
    /* JADX WARN: Type inference failed for: r10v24, types: [org.telegram.ui.Components.uj0, org.telegram.ui.uw] */
    /* JADX WARN: Type inference failed for: r10v26, types: [org.telegram.ui.dv, v4.b0] */
    /* JADX WARN: Type inference failed for: r13v10, types: [org.telegram.ui.Components.uj0, org.telegram.ui.uw] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r9v67, types: [android.graphics.drawable.BitmapDrawable] */
    @Override // org.telegram.ui.ActionBar.e2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i7;
        float f10;
        float f11;
        an anVar;
        ow owVar;
        nw nwVar;
        nw nwVar2;
        org.telegram.ui.Components.vr vrVar;
        ww wwVar;
        v4.y yVar;
        jg.m mVar;
        jg.m mVar2;
        jg.m mVar3;
        jg.m mVar4;
        jg.m mVar5;
        jg.m mVar6;
        sw swVar;
        int i10;
        int i11;
        TLRPC.UserProfilePhoto userProfilePhoto;
        ?? r92;
        int i12;
        int i13;
        Context context2 = context;
        int i14 = 0;
        this.l2 = false;
        this.m2 = false;
        this.W = false;
        this.X0 = null;
        this.A0 = null;
        ArrayList arrayList = this.K2;
        arrayList.clear();
        this.n3 = ViewConfiguration.get(context2).getScaledMaximumFlingVelocity();
        org.telegram.messenger.g0.h3(new du(context2, i14));
        this.P1 = null;
        this.N1 = null;
        this.O1 = null;
        this.S1 = null;
        this.L1 = null;
        org.telegram.ui.ActionBar.y s5 = this.actionBar.s();
        s5.setTranslationX(-org.telegram.messenger.g0.L(5.0f));
        org.telegram.ui.ActionBar.q0 a10 = s5.a(0, R.drawable.outline_header_search);
        a10.O();
        this.k0 = a10;
        int i15 = 3;
        a10.setOnClickListener(new gu(this, i15));
        int i16 = 8;
        int i17 = 2;
        if (this.T0 == 2 || (q4() && d4(this.currentAccount, this.T0, this.Y2, false).isEmpty())) {
            this.k0.setVisibility(8);
        }
        this.k0.setVisibility(8);
        ?? r52 = 1;
        ?? r53 = 1;
        if (!this.n2 && this.p2 == null && this.Y2 == 0 && this.a3 == 0) {
            int i18 = org.telegram.ui.ActionBar.j6.t8;
            int themedColor = getThemedColor(i18);
            int i19 = org.telegram.ui.ActionBar.j6.v8;
            org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context2, themedColor, getThemedColor(i19));
            this.n0 = q0Var;
            q0Var.setText(org.telegram.messenger.hd.L0(2131751354).toUpperCase());
            if (this.n0.getTextView() != null) {
                org.telegram.ui.ActionBar.q6.U(this.n0.getTextView(), i19, getResourceProvider());
            }
            org.telegram.ui.ActionBar.q0 q0Var2 = this.n0;
            org.telegram.ui.ActionBar.q6.Q(q0Var2, q0Var2.getBackground(), null, org.telegram.ui.ActionBar.q6.M(i18), getResourceProvider());
            this.actionBar.addView(this.n0, c8.ja.d(-2, -2.0f, 53, 0.0f, 0.0f, 10.0f, 0.0f));
            this.n0.setOnClickListener(new gu(this, i16));
            this.n0.setAlpha(0.0f);
            this.n0.setVisibility(8);
            this.o0 = new org.telegram.ui.Components.lg0(context2);
            org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(context2, this.resourceProvider, false, true);
            this.p0 = z0Var;
            z0Var.setItemHeight(56);
            this.p0.j(org.telegram.messenger.hd.L0(2131748605), 0, this.o0);
            this.p0.setContentDescription(org.telegram.messenger.hd.L0(2131746601));
            org.telegram.ui.ActionBar.q0 a11 = s5.a(1, R.drawable.outline_header_lock_24);
            this.g0 = a11;
            a11.setContentDescription(org.telegram.messenger.hd.L0(2131754813));
            org.telegram.ui.ActionBar.q0 d = s5.d(3, new ColorDrawable(0));
            this.h0 = d;
            ax axVar = new ax(context2, this.currentAccount);
            this.i0 = axVar;
            d.addView(axVar);
            this.h0.setContentDescription(org.telegram.messenger.hd.L0(2131751343));
            this.h0.setVisibility(8);
            m5(false, false);
        }
        nw nwVar3 = new nw(context2, this.resourceProvider);
        this.Y = nwVar3;
        nwVar3.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        this.Y.setPivotX(0.0f);
        this.Y.setPivotY(0.0f);
        int i20 = 9;
        if (this.T0 == 0) {
            org.telegram.ui.ActionBar.q0 a12 = s5.a(-47, R.drawable.avd_speed);
            this.m0 = a12;
            org.telegram.messenger.g0.E2(a12);
            this.m0.setOnClickListener(new gu(this, i20));
            this.Y.a(this.m0);
            this.Y.updateColors();
        }
        this.Y.setCloseButtonOnClickListener(new eu(this, 16));
        this.Y.r.setOnFocusChangeListener(new ed(this, r53 == true ? 1 : 0));
        ah.i iVar = this.Y.r;
        int i21 = 11;
        bg.o0 o0Var = new bg.o0(iVar, new kg.x1(this, i21));
        this.Z = o0Var;
        iVar.addTextChangedListener(o0Var);
        this.Y.setSearchFiltersListener(new ev(this));
        this.Z.a();
        int i22 = 10;
        if (this.T0 == 0) {
            org.telegram.ui.ActionBar.q0 a13 = s5.a(4, R.drawable.ic_ab_other);
            this.l0 = a13;
            a13.setContentDescription(org.telegram.messenger.hd.L0(2131754839));
            this.l0.setOnClickListener(new gu(this, i22));
            this.l0.setOnLongClickListener(new ru(this, i15));
        }
        this.k0.setSearchFieldHint(org.telegram.messenger.hd.L0(2131745836));
        this.k0.setContentDescription(org.telegram.messenger.hd.L0(2131745836));
        if (this.n2) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            int i23 = this.T0;
            if (i23 == 16) {
                this.actionBar.setTitle(org.telegram.messenger.hd.L0(2131753100));
            } else if (this.O0) {
                this.actionBar.setTitle(org.telegram.messenger.hd.L0(2131746252));
            } else if (this.P0) {
                this.actionBar.setTitle(org.telegram.messenger.hd.L0(2131746429));
            } else if (i23 == 3 && this.h2 == null) {
                this.actionBar.setTitle(org.telegram.messenger.hd.L0(2131750575));
            } else if (i23 == 10) {
                this.actionBar.setTitle(org.telegram.messenger.hd.L0(2131745668));
            } else if (i23 == 14) {
                boolean z10 = this.C2;
                if (!z10 || this.B2 || this.x2 || this.A2) {
                    boolean z11 = this.B2;
                    if (!z11 || z10) {
                        i12 = 2131745669;
                    } else {
                        i12 = 2131745669;
                        if (!this.x2 && !this.A2) {
                            this.actionBar.setTitle(org.telegram.messenger.hd.L0(2131752110));
                        }
                    }
                    boolean z12 = this.x2;
                    if (!z12 || z11 || z10) {
                        i13 = 2131752135;
                    } else {
                        i13 = 2131752135;
                        if (!this.A2) {
                            this.actionBar.setTitle(org.telegram.messenger.hd.L0(2131752125));
                        }
                    }
                    if (!this.A2 || z11 || z10 || z12) {
                        this.actionBar.setTitle(org.telegram.messenger.hd.L0(i12));
                    } else {
                        this.actionBar.setTitle(org.telegram.messenger.hd.L0(i13));
                    }
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.hd.L0(2131752137));
                }
            } else {
                TLRPC.RequestPeerType requestPeerType = this.H;
                if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                    Boolean bool = ((TLRPC.TL_requestPeerTypeUser) requestPeerType).bot;
                    if (bool == null) {
                        this.actionBar.setTitle(org.telegram.messenger.hd.L0(2131752110));
                    } else if (bool.booleanValue()) {
                        this.actionBar.setTitle(org.telegram.messenger.hd.L0(2131752137));
                    } else {
                        this.actionBar.setTitle(org.telegram.messenger.hd.L0(2131752110));
                    }
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
                    this.actionBar.setTitle(org.telegram.messenger.hd.L0(2131752135));
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
                    this.actionBar.setTitle(org.telegram.messenger.hd.L0(2131752125));
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.hd.L0(2131745669));
                }
            }
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, this.actionBar, getResourceProvider());
        } else {
            if (this.p2 != null || this.Y2 != 0 || this.a3 != 0) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
                this.g1 = x1Var;
                kVar.setBackButtonDrawable(x1Var);
            }
            if (this.Y2 != 0) {
                this.actionBar.setTitle(org.telegram.messenger.hd.L0(2131754136));
            } else if (this.a3 != 0) {
                this.actionBar.setTitle(org.telegram.messenger.m5.m(this.b3));
                this.actionBar.setAdditionalTextLeft(org.telegram.messenger.g0.L(28.0f));
                this.e3 = new org.telegram.ui.Components.t8(this.b3);
                org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(getContext());
                this.d3 = i9Var;
                i9Var.setRoundRadius(org.telegram.messenger.g0.L(11.0f));
                this.d3.f(this.b3, this.e3);
                this.actionBar.addView(this.d3, c8.ja.d(32, 32.0f, 83, 58.0f, 0.0f, 0.0f, 12.0f));
            } else {
                org.telegram.ui.Components.e5 e5Var = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(26.0f), null);
                this.F3 = e5Var;
                e5Var.a = true;
                Drawable g10 = i5.c.g(context2, R.drawable.telegram_logo_2);
                this.E3 = g10;
                g10.setBounds(0, org.telegram.messenger.g0.L(2.0f), this.E3.getIntrinsicWidth(), this.E3.getIntrinsicHeight() + org.telegram.messenger.g0.L(2.0f));
                Drawable drawable = this.E3;
                int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.Xl);
                this.x4 = themedColor2;
                drawable.setColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.hd.L0(R.string.AppName));
                spannableStringBuilder.setSpan(new ImageSpan(this.E3), 0, spannableStringBuilder.length(), 33);
                this.actionBar.M(spannableStringBuilder, this.F3);
                r5(org.telegram.messenger.m10.i(this.currentAccount).f(), false);
            }
            if (this.Y2 == 0) {
                this.actionBar.setSupportsHolidayImage(true);
            }
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        int i24 = 17;
        this.actionBar.setTitleActionRunnable(new eu(this, i24));
        int i25 = this.T0;
        if (((i25 == 0 && !this.n2) || i25 == 3) && this.Y2 == 0 && this.a3 == 0 && TextUtils.isEmpty(this.p2)) {
            ow owVar2 = new ow(this, context2, this.resourceProvider);
            this.A0 = owVar2;
            owVar2.setVisibility(8);
            this.x = false;
            this.r.a(false, false);
            this.A0.setDelegate(new pw(context2, this));
        }
        if (this.t2 && org.telegram.messenger.m10.c() > 1) {
            this.F1 = s5.g(11, 0, org.telegram.messenger.g0.L(56.0f));
            org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8();
            t8Var.u(org.telegram.messenger.g0.L(12.0f));
            org.telegram.ui.Components.i9 i9Var2 = new org.telegram.ui.Components.i9(context2);
            i9Var2.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
            this.F1.addView(i9Var2, c8.ja.e(36, 36, 17));
            this.F1.setOnClickListener(new gu(this, i21));
            this.F1.setOnLongClickListener(new ru(this, i17));
            TLRPC.User f12 = getUserConfig().f();
            t8Var.r(f12);
            ImageReceiver imageReceiver = i9Var2.getImageReceiver();
            int i26 = this.currentAccount;
            imageReceiver.d = i26;
            i9Var2.m(org.telegram.messenger.gc.m(i26, 1, f12), "50_50", org.telegram.messenger.gc.n(f12), "50_50", (f12 == null || (userProfilePhoto = f12.photo) == null || (r92 = userProfilePhoto.strippedBitmap) == null) ? t8Var : r92, f12);
        }
        this.actionBar.setActionBarMenuOnItemClick(new p9(this, 28));
        rw rwVar = new rw(context2, this);
        this.fragmentView = rwVar;
        this.t4 = new vu(this, rwVar, new PointF(), i14);
        int i27 = (this.Y2 == 0 && this.a3 == 0 && (((i11 = this.T0) == 0 && !this.n2) || i11 == 3)) ? 2 : 1;
        this.f0 = new xw[i27];
        int i28 = 0;
        while (true) {
            i7 = 5;
            if (i28 >= i27) {
                break;
            }
            xw xwVar = new xw(context2, this);
            rwVar.addView(xwVar, c8.ja.c(-1.0f, -1));
            xwVar.s = this.T0;
            this.f0[i28] = xwVar;
            xwVar.x = new org.telegram.ui.Components.pz(context2);
            xwVar.x.setViewType(7);
            xwVar.x.setVisibility(i16);
            xwVar.addView(xwVar.x, c8.ja.e(-2, -2, i24));
            uw uwVar = new uw(this, context2, xwVar);
            xwVar.a = uwVar;
            this.glassEngine.b(uwVar);
            ?? r13 = xwVar.a;
            xwVar.b = new a8.xa((org.telegram.ui.Components.uj0) r13);
            r13.setAllowStopHeaveOperations(r52);
            xwVar.a.setAccessibilityEnabled(false);
            xwVar.a.o1(0, r52);
            xwVar.a.setClipToPadding(false);
            xwVar.a.setPivotY(0.0f);
            if (this.T0 == 15) {
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.a7, xwVar.a, getResourceProvider());
            }
            xwVar.y = new bv(xwVar.a, xwVar);
            xwVar.a.setVerticalScrollBarEnabled(r52);
            xwVar.a.setInstantClick(r52);
            xwVar.c = new dv(this, xwVar);
            xwVar.c.j1(r52);
            xwVar.a.setLayoutManager(xwVar.c);
            xwVar.a.setVerticalScrollbarPosition(org.telegram.messenger.hd.a0 ? r52 : 2);
            xwVar.addView(xwVar.a, c8.ja.c(-1.0f, -1));
            xwVar.a.setOnItemClickListener(new tr(i7, this, xwVar));
            xwVar.a.setOnItemLongClickListener(new k8.a(i24, this, xwVar));
            xwVar.f = new ww(this, xwVar);
            xwVar.E = new org.telegram.ui.Components.xi0(xwVar.a, false);
            wwVar = xwVar.f;
            xwVar.e = new v4.y(wwVar);
            yVar = xwVar.e;
            yVar.h(xwVar.a);
            xwVar.a.setOnScrollListener(new fv(this, xwVar, rwVar));
            xwVar.w = org.telegram.messenger.gz.q1 ? 2 : 0;
            if (xwVar.n == null && this.Y2 == 0 && this.a3 == 0) {
                xwVar.n = new gv(org.telegram.messenger.hd.L0(2131754720), org.telegram.messenger.hd.L0(2131754722), xwVar);
                if (l4()) {
                    xwVar.n.h();
                } else {
                    xwVar.n.b();
                }
                gv gvVar = xwVar.n;
                i10 = xwVar.w;
                gvVar.g(i10 != 0 ? r52 : false);
            }
            rw rwVar2 = rwVar;
            boolean z13 = r52;
            int i29 = i28;
            int i30 = i27;
            context2 = context;
            xwVar.d = new hv(this, this, context, xwVar.s, this.Y2, this.n2, arrayList, this.currentAccount, this.H, xwVar);
            mVar = xwVar.d;
            mVar.S(xwVar.a);
            mVar2 = xwVar.d;
            mVar2.Q(this.v2);
            if (xwVar.s == 3) {
                mVar6 = xwVar.d;
                mVar6.N((getMessagesController().X4() && (swVar = this.E2) != null && swVar.H()) ? z13 : false);
            }
            if (org.telegram.messenger.g0.Q1()) {
                org.telegram.messenger.ur urVar = this.r2;
                if (urVar.a != 0) {
                    mVar5 = xwVar.d;
                    mVar5.R(urVar.a);
                }
            }
            mVar3 = xwVar.d;
            mVar3.O(xwVar.n);
            uw uwVar2 = xwVar.a;
            mVar4 = xwVar.d;
            uwVar2.setAdapter(mVar4);
            xwVar.a.setEmptyView((this.Y2 == 0 && this.a3 == 0) ? xwVar.x : null);
            xwVar.r = new org.telegram.ui.Components.wi0(xwVar.a, xwVar.c);
            org.telegram.ui.Components.wi0 wi0Var = xwVar.r;
            wi0Var.c = z13;
            wi0Var.d = z13;
            wi0Var.h = new hu(this, 13);
            if (i29 != 0) {
                this.f0[i29].setVisibility(8);
            }
            i28 = i29 + 1;
            r52 = z13;
            rwVar = rwVar2;
            i27 = i30;
            i24 = 17;
            i16 = 8;
        }
        rw rwVar3 = rwVar;
        int i31 = r52;
        org.telegram.ui.Components.ur urVar2 = new org.telegram.ui.Components.ur(context2);
        this.M1 = urVar2;
        int i32 = org.telegram.ui.ActionBar.j6.d6;
        urVar2.setColor(org.telegram.ui.ActionBar.j6.v0(i32));
        rwVar3.addView(this.M1, c8.ja.e(-1, 100, 48));
        this.C0 = rwVar3.getChildCount();
        az0 az0Var = new az0((Activity) getContext());
        this.a0 = az0Var;
        rwVar3.addView(az0Var, c8.ja.d(-1, 50.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
        az0 az0Var2 = this.a0;
        gh.e n10 = c8.g0.n(this.resourceProvider);
        dh.c cVar = this.r4;
        fh.g b10 = cVar.b(az0Var2, n10);
        org.telegram.messenger.i20.r(b10, org.telegram.messenger.g0.L(18.0f), 6.666f);
        this.a0.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f));
        this.a0.setBlurredBackground(b10);
        jg.q0 q0Var3 = new jg.q0(getParentActivity(), null);
        this.c0 = q0Var3;
        q0Var3.setPadding(0, org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f));
        jg.q0 q0Var4 = this.c0;
        q0Var4.i3 = false;
        q0Var4.setOnItemClickListener(new mu(this, i31));
        this.a0.addView(this.c0, c8.ja.e(-1, -1, 48));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context2, this.resourceProvider, i31);
        this.v0 = t00Var;
        t00Var.setContentDescription(org.telegram.messenger.hd.L0(2131744558));
        this.v0.setImageResource(R.drawable.outline_fab_story_24);
        this.v0.setOnClickListener(new gu(this, 27));
        rwVar3.addView(this.v0, org.telegram.ui.Components.t00.c());
        org.telegram.ui.Components.t00 t00Var2 = new org.telegram.ui.Components.t00(context2, this.resourceProvider);
        this.u0 = t00Var2;
        rwVar3.addView(t00Var2, org.telegram.ui.Components.t00.b());
        this.u0.setOnClickListener(new gu(this, 28));
        if (!q4() && this.T0 == 0 && org.telegram.messenger.np.s1(this.currentAccount).t1().getBoolean("storyhint", i31)) {
            hi.l3 l3Var = new hi.l3(context2, 2);
            l3Var.s(8.0f);
            l3Var.d = 8000L;
            l3Var.k(i31);
            l3Var.h = org.telegram.messenger.g0.L(165.0f);
            l3Var.r(i31);
            l3Var.u(org.telegram.messenger.g0.K2(org.telegram.messenger.hd.L0(2131744712), hi.sa.m(context2), "%s"));
            l3Var.o(1.0f, -40.0f);
            l3Var.j(getThemedColor(org.telegram.ui.ActionBar.j6.wj));
            l3Var.r0 = new av(this, 2);
            this.q0 = l3Var;
            rwVar3.addView(l3Var, c8.ja.d(-1, 160.0f, 87, 0.0f, 0.0f, 80.0f, 0.0f));
        }
        s5();
        this.b0 = null;
        if (this.n2 || this.T0 != 0) {
            f10 = 72.0f;
            if (this.T0 == 3 || U3()) {
                jh.f fVar = new jh.f(context2);
                this.A1 = fVar;
                fVar.setClipChildren(false);
                jh.f fVar2 = this.A1;
                rh.h hVar = this.w;
                fVar2.setWindowInsetsProvider(hVar);
                jh.f fVar3 = this.A1;
                fVar3.setInputIslandBubbleDrawable(cVar.b(fVar3, c8.g0.n(this.resourceProvider)));
                jh.f fVar4 = this.A1;
                fVar4.setUnderKeyboardBackgroundDrawable(this.p4.b(fVar4, c8.g0.n(this.resourceProvider)));
                dh.d dVar = new dh.d(this.s4.b(this.A1, null));
                if (!org.telegram.messenger.gz.f() || org.telegram.messenger.qc.e(262144)) {
                    dVar.b(org.telegram.messenger.g0.L(72.0f), i31);
                }
                this.A1.setBackgroundWithFadeDrawable(dVar);
                FrameLayout inputIslandBubbleContainer = this.A1.getInputIslandBubbleContainer();
                this.B1 = inputIslandBubbleContainer;
                inputIslandBubbleContainer.setClipChildren(false);
                this.C1 = this.A1.getInAppKeyboardBubbleContainer();
                kv kvVar = this.D1;
                if (kvVar != null) {
                    kvVar.Q0();
                }
                kv kvVar2 = new kv(this, getParentActivity(), rwVar3);
                this.D1 = kvVar2;
                kvVar2.setInAppInsetsController(hVar);
                this.D1.Q5 = false;
                rwVar3.setClipChildren(false);
                rwVar3.setClipToPadding(false);
                kv kvVar3 = this.D1;
                kvVar3.P5 = false;
                kvVar3.Q2 = (org.telegram.messenger.g0.E || ((anVar = kvVar3.x3) != null && anVar.isInBubbleMode())) ? false : i31;
                this.D1.l1(false, false, false);
                this.D1.w1(i31, false);
                this.D1.h2.setPadding(0, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(20.0f), 0);
                f11 = 0.0f;
                this.D1.getSendButton().setAlpha(0.0f);
                this.D1.setViewParentForEmoji(this.C1);
                this.B1.addView(this.D1, c8.ja.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
                rwVar3.addView(this.A1.getFadeView(), c8.ja.c(-1.0f, -1));
                rwVar3.addView(this.A1, c8.ja.c(-1.0f, -1));
                if (m4() || this.G2 != null || this.H2 != null) {
                    v3(this.W3);
                    this.W3 = null;
                }
                this.D1.setDelegate(new ev(this));
                oi.u1 u1Var = new oi.u1(this, context2, this.resourceProvider);
                this.E1 = u1Var;
                int L = org.telegram.messenger.g0.L(52.0f);
                int L2 = org.telegram.messenger.g0.L(38.0f);
                u1Var.L = L;
                u1Var.M = L2;
                oi.u1 u1Var2 = this.E1;
                float L3 = org.telegram.messenger.g0.L(7.0f);
                float L4 = org.telegram.messenger.g0.L(8.0f);
                u1Var2.P = L3;
                u1Var2.Q = L4;
                oi.u1 u1Var3 = this.E1;
                u1Var3.q0 = i31;
                rwVar3.addView(u1Var3, c8.ja.e(org.telegram.messenger.ns.v1, 50, 85));
                this.E1.setScrimViewBackgroundColor(getThemedColor(i32));
                this.E1.setOnClickListener(new gu(this, i7));
                this.E1.setOnLongClickListener(new ru(this, i14));
                this.E1.setVisibility(8);
                this.E1.setScaleX(0.2f);
                this.E1.setScaleY(0.2f);
                this.E1.setAlpha(0.0f);
                float L5 = org.telegram.messenger.g0.L(12.0f);
                TextPaint textPaint = this.G1;
                textPaint.setTextSize(L5);
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                owVar = this.A0;
                if (owVar != null) {
                    fh.g b11 = cVar.b(owVar, c8.g0.n(this.resourceProvider));
                    org.telegram.messenger.i20.r(b11, org.telegram.messenger.g0.L(18.0f), 6.666f);
                    this.A0.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f));
                    this.A0.setBlurredBackground(b11);
                    rwVar3.addView(this.A0, c8.ja.d(-1, 50.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
                }
                nwVar = this.Y;
                if (nwVar != null) {
                    nwVar.setupBlurredBackground(cVar.b(nwVar, c8.g0.n(this.resourceProvider)));
                }
                qv qvVar = new qv(this, context2, this, this.currentAccount, q4() ? 1 : 0);
                this.F0 = qvVar;
                qvVar.setActionBar(this.actionBar);
                this.F0.setMenuItemsOffset(!q4() ? org.telegram.messenger.g0.L(68.0f) : org.telegram.messenger.g0.N(16.66f));
                qv qvVar2 = this.F0;
                qvVar2.m0 = false;
                qvVar2.setVisibility(8);
                this.N = false;
                this.M = false;
                this.L = false;
                if (this.n2 && this.T0 == 3) {
                    org.telegram.messenger.np.s1(this.currentAccount).J1();
                }
                rwVar3.addView(this.actionBar, c8.ja.c(-2.0f, -1));
                if (!this.n2) {
                    org.telegram.ui.Cells.o oVar = new org.telegram.ui.Cells.o(context2);
                    this.G3 = oVar;
                    rwVar3.addView(oVar, c8.ja.e(20, 20, 51));
                }
                nwVar2 = this.Y;
                if (nwVar2 != null) {
                    rwVar3.addView(nwVar2, c8.ja.d(-1, 48.0f, 48, 7.0f, -2.0f, 7.0f, 0.0f));
                }
                this.y0 = rwVar3.getChildCount();
                UndoView[] undoViewArr = this.z0;
                undoViewArr[0] = null;
                undoViewArr[i31] = null;
                if (this.X) {
                    this.actionBar.getTitlesContainer().setTranslationX(org.telegram.messenger.g0.L(4.0f));
                    org.telegram.ui.ActionBar.q6.c(this.actionBar, org.telegram.ui.ActionBar.j6.Xl, getResourceProvider());
                }
                if (this.Y2 == 0 || this.a3 != 0) {
                    this.f0[0].a.setGlowColor(getThemedColor(i32));
                    org.telegram.ui.ActionBar.q6.b(this.actionBar, org.telegram.ui.ActionBar.j6.O8, getResourceProvider(), false);
                    org.telegram.ui.ActionBar.q6.a(this.actionBar, org.telegram.ui.ActionBar.j6.N8, getResourceProvider(), false);
                    this.actionBar.L(getThemedColor(org.telegram.ui.ActionBar.j6.Q8), false);
                    this.actionBar.L(getThemedColor(org.telegram.ui.ActionBar.j6.R8), i31);
                }
                if (!this.n2 && this.T0 == 0) {
                    rv rvVar = new rv(i14, context2, this);
                    this.L0 = rvVar;
                    rvVar.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i32), 100)));
                    this.L0.setFocusable(false);
                    this.L0.setImportantForAccessibility(2);
                    this.L0.setOnClickListener(new gu(this, 7));
                    this.L0.setVisibility(8);
                    rwVar3.addView(this.L0, c8.ja.c(-1.0f, -1));
                }
                this.h1.setColor(getThemedColor(i32));
                this.s3 = false;
                if (this.p2 == null) {
                    a5(i31, false, false, false);
                    this.Y.r.setText(this.p2);
                    this.Y.r.setSelection(this.p2.length());
                } else if (this.q2 != null) {
                    a5(i31, false, false, i31);
                    this.Z.b(i31);
                    this.Y.r.setText(this.q2);
                    this.Y.r.setSelection(this.q2.length());
                    this.q2 = null;
                    nw nwVar4 = this.Y;
                    if (nwVar4 != null) {
                        nwVar4.setTranslationY(i4() + (-org.telegram.messenger.g0.L(36.0f)));
                    }
                } else {
                    a5(false, false, false, false);
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    FilesMigrationService.a(this);
                }
                this.actionBar.setDrawBlurBackground(rwVar3);
                this.H3 = new uv(this, context2, rwVar3, context2);
                i5(i31, false);
                this.H3.setOpenProgress(f11);
                rwVar3.addView(this.F0, c8.ja.c(81.0f, -1));
                rwVar3.addView(this.H3, c8.ja.c(-1.0f, -1));
                this.G0 = new org.telegram.ui.Components.tr(context2);
                vrVar = this.L1;
                if (vrVar != null) {
                    rwVar3.addView(vrVar, c8.ja.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
                }
                if (this.a3 != 0 && this.T0 != 3 && org.telegram.messenger.t3.c(this.b3)) {
                    org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.filled_add_album);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("+ ");
                    spannableStringBuilder2.append((CharSequence) org.telegram.messenger.hd.L0(2131751989));
                    spannableStringBuilder2.setSpan(eqVar, 0, i31, 33);
                    hi.d dVar2 = new hi.d(context2, this.resourceProvider);
                    this.w0 = dVar2;
                    dVar2.f();
                    this.w0.setText(spannableStringBuilder2);
                    this.w0.setOnClickListener(new org.telegram.ui.Components.vv0(18, this, new org.telegram.ui.ActionBar.t1[i31]));
                    lh.f fVar5 = new lh.f(getContext());
                    this.x0 = fVar5;
                    fVar5.setupColorKey(org.telegram.ui.ActionBar.j6.a7);
                    this.x0.setFadeZoneBottom(org.telegram.messenger.g0.L(f10) + org.telegram.messenger.g0.n);
                    this.x0.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
                    rwVar3.addView(this.x0, c8.ja.g());
                    rwVar3.addView(this.w0, c8.ja.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.n));
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
                ri.q qVar = this.glassEngine;
                qVar.a = new hu(this, 8);
                qVar.d = new ti.b(org.telegram.messenger.g0.L(48.0f));
                r0.i0.l(this.fragmentView, new hu(this, 9));
                return this.fragmentView;
            }
        } else {
            org.telegram.ui.Components.vr vrVar2 = new org.telegram.ui.Components.vr(context2);
            this.L1 = vrVar2;
            int i33 = 11;
            vrVar2.setOnAnimatedHeightChangedListener(new av(this, i33));
            fh.g a14 = cVar.a(this.L1);
            a14.p(c8.g0.n(this.resourceProvider));
            a14.q(org.telegram.messenger.g0.L(7.0f));
            f10 = 72.0f;
            this.L1.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f));
            this.L1.setBlurredBackground(a14);
            this.L1.setDefaultRadiusDp(this.a3 != 0 ? 18 : 24);
            FrameLayout frameLayout = new FrameLayout(context2);
            this.I1 = frameLayout;
            this.L1.addView(frameLayout);
            this.L1.h(5, this.I1);
            this.L1.g(this.I1);
            this.L1.i(this.I1, i31, false);
            FrameLayout frameLayout2 = new FrameLayout(context2);
            this.K1 = frameLayout2;
            this.L1.addView(frameLayout2);
            int i34 = 4;
            this.L1.h(4, this.K1);
            this.L1.g(this.K1);
            this.L1.i(this.K1, i31, false);
            iv ivVar = new iv(this, context2, this, 0);
            this.H1 = ivVar;
            this.I1.addView(ivVar);
            iv ivVar2 = new iv(this, context2, this, i31);
            this.J1 = ivVar2;
            this.K1.addView(ivVar2);
            this.L1.setCallFragmentContextView(this.J1);
            org.telegram.ui.Cells.b3 b3Var = new org.telegram.ui.Cells.b3(context2);
            this.O1 = b3Var;
            b3Var.setBackground(org.telegram.ui.ActionBar.j6.N0(false));
            g5();
            y6.m0(new ju(this, i14));
            y6.r0(new a5(this, i33));
            this.L1.addView(this.O1);
            if (this.a3 != 0) {
                mi.j jVar = new mi.j(context2, this.resourceProvider, i31);
                this.S1 = jVar;
                jVar.a(-14899731, -15497247, R.drawable.filled_requests_24, org.telegram.messenger.hd.L0(2131751895), null, false);
                this.S1.setUnreadMode(i31);
                this.S1.setBackground(org.telegram.ui.ActionBar.j6.N0(false));
                this.S1.setOnClickListener(new gu(this, i34));
                this.L1.addView(this.S1);
                B3(false);
            }
        }
        f11 = 0.0f;
        owVar = this.A0;
        if (owVar != null) {
        }
        nwVar = this.Y;
        if (nwVar != null) {
        }
        qv qvVar3 = new qv(this, context2, this, this.currentAccount, q4() ? 1 : 0);
        this.F0 = qvVar3;
        qvVar3.setActionBar(this.actionBar);
        this.F0.setMenuItemsOffset(!q4() ? org.telegram.messenger.g0.L(68.0f) : org.telegram.messenger.g0.N(16.66f));
        qv qvVar22 = this.F0;
        qvVar22.m0 = false;
        qvVar22.setVisibility(8);
        this.N = false;
        this.M = false;
        this.L = false;
        if (this.n2) {
            org.telegram.messenger.np.s1(this.currentAccount).J1();
        }
        rwVar3.addView(this.actionBar, c8.ja.c(-2.0f, -1));
        if (!this.n2) {
        }
        nwVar2 = this.Y;
        if (nwVar2 != null) {
        }
        this.y0 = rwVar3.getChildCount();
        UndoView[] undoViewArr2 = this.z0;
        undoViewArr2[0] = null;
        undoViewArr2[i31] = null;
        if (this.X) {
        }
        if (this.Y2 == 0) {
        }
        this.f0[0].a.setGlowColor(getThemedColor(i32));
        org.telegram.ui.ActionBar.q6.b(this.actionBar, org.telegram.ui.ActionBar.j6.O8, getResourceProvider(), false);
        org.telegram.ui.ActionBar.q6.a(this.actionBar, org.telegram.ui.ActionBar.j6.N8, getResourceProvider(), false);
        this.actionBar.L(getThemedColor(org.telegram.ui.ActionBar.j6.Q8), false);
        this.actionBar.L(getThemedColor(org.telegram.ui.ActionBar.j6.R8), i31);
        if (!this.n2) {
            rv rvVar2 = new rv(i14, context2, this);
            this.L0 = rvVar2;
            rvVar2.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i32), 100)));
            this.L0.setFocusable(false);
            this.L0.setImportantForAccessibility(2);
            this.L0.setOnClickListener(new gu(this, 7));
            this.L0.setVisibility(8);
            rwVar3.addView(this.L0, c8.ja.c(-1.0f, -1));
        }
        this.h1.setColor(getThemedColor(i32));
        this.s3 = false;
        if (this.p2 == null) {
        }
        if (Build.VERSION.SDK_INT >= 30) {
        }
        this.actionBar.setDrawBlurBackground(rwVar3);
        this.H3 = new uv(this, context2, rwVar3, context2);
        i5(i31, false);
        this.H3.setOpenProgress(f11);
        rwVar3.addView(this.F0, c8.ja.c(81.0f, -1));
        rwVar3.addView(this.H3, c8.ja.c(-1.0f, -1));
        this.G0 = new org.telegram.ui.Components.tr(context2);
        vrVar = this.L1;
        if (vrVar != null) {
        }
        if (this.a3 != 0) {
            org.telegram.ui.Components.eq eqVar2 = new org.telegram.ui.Components.eq(R.drawable.filled_add_album);
            SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder("+ ");
            spannableStringBuilder22.append((CharSequence) org.telegram.messenger.hd.L0(2131751989));
            spannableStringBuilder22.setSpan(eqVar2, 0, i31, 33);
            hi.d dVar22 = new hi.d(context2, this.resourceProvider);
            this.w0 = dVar22;
            dVar22.f();
            this.w0.setText(spannableStringBuilder22);
            this.w0.setOnClickListener(new org.telegram.ui.Components.vv0(18, this, new org.telegram.ui.ActionBar.t1[i31]));
            lh.f fVar52 = new lh.f(getContext());
            this.x0 = fVar52;
            fVar52.setupColorKey(org.telegram.ui.ActionBar.j6.a7);
            this.x0.setFadeZoneBottom(org.telegram.messenger.g0.L(f10) + org.telegram.messenger.g0.n);
            this.x0.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
            rwVar3.addView(this.x0, c8.ja.g());
            rwVar3.addView(this.w0, c8.ja.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.n));
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
        ri.q qVar2 = this.glassEngine;
        qVar2.a = new hu(this, 8);
        qVar2.d = new ti.b(org.telegram.messenger.g0.L(48.0f));
        r0.i0.l(this.fragmentView, new hu(this, 9));
        return this.fragmentView;
    }

    /* JADX WARN: Removed duplicated region for block: B:283:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0218 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList d4(int i7, int i10, int i11, boolean z10) {
        boolean z11;
        ArrayList arrayList;
        if (z10 && (arrayList = this.T1) != null) {
            return arrayList;
        }
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(org.telegram.messenger.c.a(i7).a);
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
            if (arrayList5.size() > 0 && this.A2) {
                arrayList8.add(new tw(0));
                arrayList8.addAll(arrayList5);
            }
            if (arrayList4.size() > 0 && this.x2) {
                arrayList8.add(new tw(1));
                arrayList8.addAll(arrayList4);
            }
            if (arrayList7.size() > 0) {
                int size = arrayList7.size();
                for (int i12 = 0; i12 < size; i12++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList7.get(i12);
                    if ((this.A2 && org.telegram.messenger.t3.U(i7, -dialog.id)) || (this.x2 && (org.telegram.messenger.t3.m0(i7, -dialog.id) || !org.telegram.messenger.t3.S(i7, -dialog.id)))) {
                        if (r9) {
                            arrayList8.add(new tw(2));
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
            org.telegram.messenger.so soVar = s12.N[i10 != 7 ? 1 : 0];
            return soVar == null ? s12.W0(i11) : this.T0 == 3 ? soVar.l : soVar.k;
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
                        long j3 = user.id;
                        tL_peerUser.user_id = j3;
                        tL_dialog.id = j3;
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
        ArrayList arrayList10 = this.U3;
        if (arrayList10 != null) {
            return arrayList10;
        }
        this.U3 = new ArrayList();
        r9 = i10 == 16;
        if (this.B2 || this.C2 || r9) {
            int size4 = arrayList2.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj3 = arrayList2.get(i13);
                i13++;
                TLRPC.Dialog dialog4 = (TLRPC.Dialog) obj3;
                TLRPC.User a23 = s12.a2(Long.valueOf(dialog4.id));
                if (a23 != null && !org.telegram.messenger.q10.x(a23)) {
                    if (!r9) {
                        if (a23.bot) {
                            if (this.C2) {
                                if (org.telegram.messenger.q10.B(a23)) {
                                }
                            }
                        } else if (this.B2) {
                            if (org.telegram.messenger.q10.B(a23)) {
                            }
                        }
                        this.U3.add(dialog4);
                    } else if (!org.telegram.messenger.q10.A(a23.id) && !org.telegram.messenger.np.F2(a23)) {
                        this.U3.add(dialog4);
                    }
                }
            }
        }
        if (this.x2 || (((z11 = this.z2) && this.y2) || r9)) {
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
                            this.U3.add(dialog5);
                        }
                    } else if (s12.y(dialog5)) {
                        this.U3.add(dialog5);
                    }
                }
            }
        } else if (z11 || this.y2 || r9) {
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
                            this.U3.add(dialog6);
                        }
                    } else if (s12.y(dialog6)) {
                        if (this.z2) {
                            if (!org.telegram.messenger.t3.n0(M02)) {
                                this.U3.add(dialog6);
                            }
                        }
                        if (this.y2 && org.telegram.messenger.t3.n0(M02)) {
                            this.U3.add(dialog6);
                        }
                    }
                }
            }
        }
        if (this.A2 || r9) {
            int size7 = arrayList3.size();
            while (r8 < size7) {
                Object obj6 = arrayList3.get(r8);
                r8++;
                TLRPC.Dialog dialog7 = (TLRPC.Dialog) obj6;
                TLRPC.Chat M03 = s12.M0(Long.valueOf(-dialog7.id));
                if (r9) {
                    if (M03 instanceof TLRPC.TL_channel) {
                        this.U3.add(dialog7);
                    }
                } else if (s12.y(dialog7)) {
                    this.U3.add(dialog7);
                }
            }
        }
        org.telegram.messenger.np messagesController = getMessagesController();
        ArrayList arrayList11 = this.U3;
        if (arrayList11 == null) {
            messagesController.getClass();
        } else {
            Collections.sort(arrayList11, messagesController.F7);
        }
        return this.U3;
    }

    public final void d5(boolean z10) {
        xw[] xwVarArr;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            xwVarArr = this.f0;
            if (i10 >= xwVarArr.length) {
                break;
            }
            xwVarArr[i10].a.C0();
            i10++;
        }
        char c10 = (!z10 || xwVarArr.length <= 1) ? (char) 0 : (char) 1;
        int i11 = xwVarArr[c10].h;
        if (i11 < 0 || i11 >= getMessagesController().T0().size()) {
            return;
        }
        org.telegram.messenger.so soVar = (org.telegram.messenger.so) getMessagesController().T0().get(this.f0[c10].h);
        if (soVar.e()) {
            xw xwVar = this.f0[c10];
            xwVar.s = this.T0;
            uw uwVar = xwVar.a;
            int i12 = uw.C3;
            uwVar.D1();
        } else {
            xw[] xwVarArr2 = this.f0;
            if (xwVarArr2[c10 ^ 1].s == 7) {
                xwVarArr2[c10].s = 8;
            } else {
                xwVarArr2[c10].s = 7;
            }
            xwVarArr2[c10].a.setScrollEnabled(true);
            org.telegram.messenger.np messagesController = getMessagesController();
            char c11 = this.f0[c10].s == 8 ? (char) 1 : (char) 0;
            org.telegram.messenger.so[] soVarArr = messagesController.N;
            org.telegram.messenger.so soVar2 = soVarArr[c11];
            if (soVar2 != soVar) {
                soVarArr[c11] = soVar;
                int i13 = c11 ^ 1;
                if (soVarArr[i13] == soVar) {
                    soVarArr[i13] = null;
                }
                if (soVarArr[c11] != null) {
                    messagesController.U4(null);
                } else if (soVar2 != null) {
                    soVar2.k.clear();
                    soVar2.l.clear();
                }
            }
        }
        xw[] xwVarArr3 = this.f0;
        if (xwVarArr3.length > 1) {
            xwVarArr3[1].F = soVar.p;
        }
        xw xwVar2 = xwVarArr3[c10];
        hv hvVar = xwVar2.d;
        hvVar.h = xwVar2.s;
        hvVar.f();
        xw xwVar3 = this.f0[c10];
        dv dvVar = xwVar3.c;
        if (xwVar3.s == 0 && l4() && this.f0[c10].w == 2) {
            i7 = 1;
        }
        dvVar.h1(i7, (int) this.O);
        C3(this.f0[c10]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:426:0x05af, code lost:
    
        if (org.telegram.messenger.t3.S(r4.K0, r11) != false) goto L377;
     */
    /* JADX WARN: Removed duplicated region for block: B:364:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:370:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.messenger.is
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        org.telegram.messenger.so soVar;
        int i12;
        char c10;
        boolean booleanValue;
        boolean z10;
        org.telegram.ui.Components.cm0 cm0Var;
        org.telegram.ui.Components.cm0 cm0Var2;
        int i13;
        boolean z11;
        boolean z12;
        int i14 = 2;
        ArrayList arrayList = null;
        char c11 = 1;
        int i15 = 0;
        if (i7 == org.telegram.messenger.ns.s) {
            if (this.f0 == null || this.U1) {
                return;
            }
            int i16 = 0;
            while (true) {
                xw[] xwVarArr = this.f0;
                if (i16 >= xwVarArr.length) {
                    break;
                }
                xw xwVar = xwVarArr[i16];
                int i17 = xwVarArr[0].s;
                org.telegram.messenger.so soVar2 = (i17 == 7 || i17 == 8) ? getMessagesController().N[this.f0[0].s == 8 ? (char) 1 : (char) 0] : null;
                if (soVar2 != null) {
                    int i18 = soVar2.g;
                    int i19 = org.telegram.messenger.np.D8;
                    if ((i18 & 64) != 0) {
                        z12 = true;
                        if (this.B3 || !z12) {
                            G4(xwVar);
                        } else {
                            org.telegram.messenger.g0.i3(new tp(this, xwVar, objArr, i14), 160L);
                        }
                        i16++;
                    }
                }
                z12 = false;
                if (this.B3) {
                }
                G4(xwVar);
                i16++;
            }
            ow owVar = this.A0;
            if (owVar != null && owVar.getVisibility() == 0) {
                this.A0.c();
            }
            this.B3 = false;
            return;
        }
        if (i7 == org.telegram.messenger.ns.q5) {
            u5(0, true);
            return;
        }
        if (i7 == org.telegram.messenger.ns.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.a3 != chatFull.id) {
                return;
            }
            this.c3 = chatFull;
            B3(false);
            if (this.f0 == null || this.U1) {
                return;
            }
            while (true) {
                xw[] xwVarArr2 = this.f0;
                if (i15 >= xwVarArr2.length) {
                    return;
                }
                G4(xwVarArr2[i15]);
                i15++;
            }
        } else {
            if (i7 == org.telegram.messenger.ns.d2) {
                ow owVar2 = this.A0;
                if (owVar2 == null || owVar2.getVisibility() != 0) {
                    return;
                }
                ow owVar3 = this.A0;
                int defaultTabId = owVar3.getDefaultTabId();
                di.c1 c1Var = owVar3.G;
                ArrayList arrayList2 = owVar3.h;
                int i20 = owVar3.m0.get(defaultTabId, -1);
                if (i20 < 0 || i20 >= arrayList2.size()) {
                    return;
                }
                org.telegram.ui.Components.fz fzVar = (org.telegram.ui.Components.fz) arrayList2.get(i20);
                if (fzVar.d == ((pw) owVar3.K).a(fzVar.a) || ((pw) owVar3.K).a(fzVar.a) < 0) {
                    return;
                }
                c1Var.g1();
                if (owVar3.n0.get(i20) != fzVar.a(true) || owVar3.i0) {
                    owVar3.i0 = true;
                    owVar3.requestLayout();
                    c1Var.setItemAnimator(owVar3.t0);
                    l4 l4Var = owVar3.J;
                    if (l4Var != null) {
                        l4Var.f();
                    }
                    owVar3.N = 0;
                    org.telegram.ui.Components.fz d = owVar3.d();
                    if (d != null) {
                        d.b(org.telegram.messenger.hd.M0(2131750807, null));
                    }
                    int size = arrayList2.size();
                    while (i15 < size) {
                        owVar3.N = org.telegram.messenger.k5.C(24.0f, ((org.telegram.ui.Components.fz) arrayList2.get(i15)).a(true), owVar3.N);
                        i15++;
                    }
                    return;
                }
                return;
            }
            if (i7 == org.telegram.messenger.ns.Z4) {
                u5(0, true);
                return;
            }
            if (i7 == org.telegram.messenger.ns.Y4) {
                u5(0, true);
                return;
            }
            if (i7 == org.telegram.messenger.ns.i4) {
                if (this.f0 != null) {
                    int i21 = 0;
                    while (true) {
                        xw[] xwVarArr3 = this.f0;
                        if (i21 >= xwVarArr3.length) {
                            break;
                        }
                        uw uwVar = xwVarArr3[i21].a;
                        if (uwVar != null) {
                            for (int i22 = 0; i22 < uwVar.getChildCount(); i22++) {
                                View childAt = uwVar.getChildAt(i22);
                                if (childAt != null) {
                                    childAt.invalidate();
                                }
                            }
                        }
                        i21++;
                    }
                }
                ow owVar4 = this.A0;
                if (owVar4 != null) {
                    owVar4.getTabsContainer().g1();
                    return;
                }
                return;
            }
            if (i7 == org.telegram.messenger.ns.I4) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.n(true);
                    return;
                }
                return;
            }
            if (i7 == org.telegram.messenger.ns.A4) {
                m5(false, false);
                return;
            }
            long j3 = 0;
            if (i7 == org.telegram.messenger.ns.r) {
                Integer num = (Integer) objArr[0];
                u5(num.intValue(), true);
                ow owVar5 = this.A0;
                if (owVar5 != null && owVar5.getVisibility() == 0) {
                    int intValue = num.intValue();
                    int i23 = org.telegram.messenger.np.D8;
                    if ((intValue & 256) != 0) {
                        this.A0.c();
                    }
                }
                if (this.a3 != 0) {
                    int intValue2 = num.intValue();
                    int i24 = org.telegram.messenger.np.D8;
                    if ((intValue2 & TLObject.FLAG_13) != 0 || (num.intValue() & 2) != 0 || (num.intValue() & 8) != 0 || (num.intValue() & 16) != 0) {
                        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.a3));
                        this.b3 = M0;
                        this.actionBar.setTitle(org.telegram.messenger.m5.m(M0));
                        this.d3.f(this.b3, this.e3);
                    }
                }
                if (this.f0 != null) {
                    while (i15 < this.f0.length) {
                        int intValue3 = num.intValue();
                        int i25 = org.telegram.messenger.np.D8;
                        if ((intValue3 & 4) != 0) {
                            this.f0[i15].d.U(true);
                        }
                        i15++;
                    }
                }
                r5(org.telegram.messenger.m10.i(i10).f(), true);
                return;
            }
            int i26 = org.telegram.messenger.ns.I2;
            boolean[] zArr = A4;
            if (i7 == i26) {
                zArr[this.currentAccount] = false;
                return;
            }
            if (i7 == org.telegram.messenger.ns.Y) {
                u5(0, true);
                return;
            }
            if (i7 == org.telegram.messenger.ns.O) {
                if (this.f0 == null || this.U1) {
                    return;
                }
                org.telegram.ui.Components.t00 t00Var = this.u0;
                if (t00Var != null) {
                    z11 = t00Var.getProgressVisible();
                    this.u0.f(false, true);
                } else {
                    z11 = false;
                }
                for (xw xwVar2 : this.f0) {
                    xwVar2.d.e = false;
                }
                if (z11) {
                    L4(0.0f);
                    ValueAnimator valueAnimator = this.e0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(this.d0, 1.0f).setDuration(250L);
                    this.e0 = duration;
                    duration.setInterpolator(org.telegram.ui.Components.er.f);
                    this.e0.addUpdateListener(new lu(this, i14));
                    this.e0.start();
                }
                int i27 = 0;
                boolean z13 = false;
                while (true) {
                    xw[] xwVarArr4 = this.f0;
                    if (i27 >= xwVarArr4.length) {
                        break;
                    }
                    if (!xwVarArr4[i27].p() || getMessagesController().D0() > 10) {
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
            if (i7 == org.telegram.messenger.ns.h0) {
                if (this.f0 == null) {
                    return;
                }
                int i28 = 0;
                while (true) {
                    xw[] xwVarArr5 = this.f0;
                    if (i28 >= xwVarArr5.length) {
                        int i29 = org.telegram.messenger.np.D8;
                        u5(512, true);
                        return;
                    }
                    if (xwVarArr5[i28].p() && org.telegram.messenger.g0.Q1()) {
                        boolean booleanValue2 = ((Boolean) objArr[2]).booleanValue();
                        long longValue = ((Long) objArr[i15]).longValue();
                        long longValue2 = ((Long) objArr[c11]).longValue();
                        org.telegram.messenger.ur urVar = this.r2;
                        if (!booleanValue2) {
                            urVar.a = longValue;
                            urVar.b = longValue2;
                        } else if (longValue == urVar.a && longValue2 == urVar.b) {
                            urVar.a = 0L;
                            urVar.b = 0L;
                        }
                        this.f0[i28].d.s = urVar.a;
                    }
                    i28++;
                    c11 = 1;
                    i15 = 0;
                }
            } else {
                if (i7 == org.telegram.messenger.ns.f0) {
                    u5(0, true);
                    return;
                }
                if (i7 == org.telegram.messenger.ns.J || i7 == org.telegram.messenger.ns.K || i7 == org.telegram.messenger.ns.M) {
                    int i30 = org.telegram.messenger.np.D8;
                    u5(TLObject.FLAG_12, true);
                    return;
                }
                if (i7 == org.telegram.messenger.ns.n0) {
                    K3();
                    return;
                }
                if (i7 == org.telegram.messenger.ns.P0) {
                    hw hwVar = this.D0;
                    if (hwVar == null || (cm0Var2 = hwVar.e0) == null || (i13 = cm0Var2.i0) == 15) {
                        return;
                    }
                    int i31 = cm0Var2.t0;
                    org.telegram.messenger.vr.a0(i31).a.c(new jg.q(i31, i13, new jg.s(cm0Var2), 0));
                    return;
                }
                if (i7 == org.telegram.messenger.ns.s0) {
                    int i32 = org.telegram.messenger.np.D8;
                    u5(32768, true);
                    return;
                }
                if (i7 == org.telegram.messenger.ns.S0) {
                    hw hwVar2 = this.D0;
                    if (hwVar2 == null || (cm0Var = hwVar2.e0) == null) {
                        return;
                    }
                    cm0Var.f();
                    return;
                }
                if (i7 == org.telegram.messenger.ns.T1) {
                    int connectionState = ConnectionsManager.getInstance(org.telegram.messenger.c.a(i10).a).getConnectionState();
                    if (this.f2 != connectionState) {
                        this.f2 = connectionState;
                        m5(true, false);
                        return;
                    }
                    return;
                }
                if (i7 == org.telegram.messenger.ns.b5) {
                    m5(true, false);
                    hw hwVar3 = this.D0;
                    if (hwVar3 != null) {
                        int currentPosition = hwVar3.getCurrentPosition();
                        di.f4 f4Var = hwVar3.W;
                        q5(f4Var != null && f4Var.h(currentPosition) == 2);
                        return;
                    }
                    return;
                }
                if (i7 == org.telegram.messenger.ns.K2) {
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
                    Runnable f9Var = new hi.f9(this, chat, longValue3, booleanValue, user, z10);
                    Z3();
                    if (this.z0[0] == null) {
                        f9Var.run();
                        return;
                    }
                    if (org.telegram.messenger.t3.c0(chat)) {
                        f9Var.run();
                        return;
                    }
                    UndoView k42 = k4();
                    if (k42 != null) {
                        k42.j(booleanValue ? 1 : 95, longValue3, f9Var);
                        return;
                    }
                    return;
                }
                if (i7 == org.telegram.messenger.ns.d0) {
                    int intValue4 = ((Integer) objArr[0]).intValue();
                    int i33 = this.Y2;
                    if (i33 != intValue4 || i33 == 0) {
                        return;
                    }
                    finishFragment();
                    return;
                }
                if (i7 == org.telegram.messenger.ns.O2) {
                    i5(true, true);
                    return;
                }
                if (i7 == org.telegram.messenger.ns.P2) {
                    V4();
                    return;
                }
                if (i7 == org.telegram.messenger.ns.s1) {
                    X4();
                    g5();
                    org.telegram.messenger.np messagesController = getMessagesController();
                    if (!messagesController.v8 && messagesController.N7 + 10 >= messagesController.getConnectionsManager().getCurrentTime()) {
                        boolean contains = messagesController.T3.contains("SETUP_LOGIN_EMAIL");
                        if (messagesController.T3.contains("SETUP_LOGIN_EMAIL_NOSKIP")) {
                            c10 = 2;
                        } else if (contains) {
                            c10 = 1;
                        }
                        if (c10 == 0) {
                            ce0 ce0Var = new ce0();
                            eu euVar = new eu(this, 22);
                            eu euVar2 = new eu(this, 23);
                            boolean z14 = c10 == 2;
                            ce0Var.G = 3;
                            ce0Var.a = 12;
                            ce0Var.e0 = euVar;
                            ce0Var.f0 = euVar2;
                            ce0Var.h0 = z14;
                            ce0Var.i0 = true;
                            presentFragment(ce0Var);
                            getMessagesController().v8 = true;
                            return;
                        }
                        return;
                    }
                    c10 = 0;
                    if (c10 == 0) {
                    }
                } else {
                    boolean z15 = true;
                    if (i7 == org.telegram.messenger.ns.N) {
                        org.telegram.ui.Components.t00 t00Var2 = this.u0;
                        if (t00Var2 != null) {
                            t00Var2.f(true, true);
                        }
                        xw[] xwVarArr6 = this.f0;
                        if (xwVarArr6 != null) {
                            int length = xwVarArr6.length;
                            int i34 = 0;
                            while (i34 < length) {
                                hv hvVar = xwVarArr6[i34].d;
                                hvVar.R = false;
                                hvVar.e = z15;
                                hvVar.f();
                                i34++;
                                z15 = true;
                            }
                            return;
                        }
                        return;
                    }
                    if (i7 == org.telegram.messenger.ns.w) {
                        if (!this.s3 || this.D0 == null) {
                            return;
                        }
                        ArrayList arrayList3 = (ArrayList) objArr[0];
                        long longValue4 = ((Long) objArr[1]).longValue();
                        hw hwVar4 = this.D0;
                        HashMap hashMap = hwVar4.C0;
                        SparseArray sparseArray = hwVar4.h;
                        int size2 = sparseArray.size();
                        for (int i35 = 0; i35 < size2; i35++) {
                            View view = (View) sparseArray.valueAt(i35);
                            if (view instanceof zz) {
                                ((zz) view).e(arrayList3, longValue4);
                            }
                        }
                        for (int i36 = 0; i36 < hwVar4.getChildCount(); i36++) {
                            if (hwVar4.getChildAt(i36) instanceof zz) {
                                ((zz) hwVar4.getChildAt(i36)).e(arrayList3, longValue4);
                            }
                        }
                        hwVar4.P0.e(arrayList3, longValue4);
                        if (hashMap.isEmpty()) {
                            return;
                        }
                        ArrayList arrayList4 = new ArrayList(hashMap.keySet());
                        int i37 = 0;
                        while (i37 < arrayList4.size()) {
                            sz szVar = (sz) arrayList4.get(i37);
                            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) hashMap.get(szVar);
                            if (gjVar != null) {
                                long B0 = org.telegram.messenger.gj.B0(gjVar.k);
                                if (B0 < j3) {
                                    i12 = (int) (-B0);
                                }
                                i12 = 0;
                                if (i12 == longValue4) {
                                    for (int i38 = 0; i38 < arrayList3.size(); i38++) {
                                        if (gjVar.e1() == ((Integer) arrayList3.get(i38)).intValue()) {
                                            arrayList = new ArrayList();
                                            arrayList.add(szVar);
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
                            hwVar4.A0.a(hashMap.size(), true);
                            org.telegram.ui.ActionBar.q0 q0Var = hwVar4.F0;
                            if (q0Var != null) {
                                q0Var.setVisibility(hashMap.size() == 1 ? 0 : 8);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (i7 == org.telegram.messenger.ns.L4) {
                        if (this.f0 != null) {
                            int i40 = 0;
                            while (true) {
                                xw[] xwVarArr7 = this.f0;
                                if (i40 >= xwVarArr7.length) {
                                    break;
                                }
                                jg.j jVar = xwVarArr7[i40].d.Q;
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
                        int i41 = org.telegram.ui.Components.h10.m1;
                        return;
                    }
                    if (i7 == org.telegram.messenger.ns.T5) {
                        long longValue5 = ((Long) objArr[0]).longValue();
                        boolean booleanValue3 = ((Boolean) objArr[1]).booleanValue();
                        if (this.a3 != longValue5 || booleanValue3) {
                            return;
                        }
                        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
                        if (o4Var == null || o4Var.getLastFragment() != this) {
                            removeSelfFromStack();
                            return;
                        } else {
                            finishFragment();
                            return;
                        }
                    }
                    if (i7 == org.telegram.messenger.ns.S5) {
                        if (this.a3 == ((Long) objArr[0]).longValue()) {
                            B3(true);
                            return;
                        }
                        return;
                    }
                    if (i7 == org.telegram.messenger.ns.S4) {
                        boolean booleanValue4 = ((Boolean) objArr[0]).booleanValue();
                        if (this.fragmentView != null) {
                            if (!booleanValue4) {
                                pt ptVar = this.S3;
                                if (ptVar == null || ptVar.getTag() == null) {
                                    return;
                                }
                                pt ptVar2 = this.S3;
                                ptVar2.animate().setListener(null).cancel();
                                ptVar2.animate().setListener(new org.telegram.ui.Components.y50(8, this, ptVar2)).alpha(0.0f).setStartDelay(0L).setDuration(150L).start();
                                this.S3.setTag(null);
                                return;
                            }
                            if (this.S3 == null) {
                                Context context = this.fragmentView.getContext();
                                pt ptVar3 = new pt(context);
                                LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                                org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(context);
                                fh0Var.f(R.raw.db_migration_placeholder, org.telegram.messenger.ns.g2, org.telegram.messenger.ns.g2, null);
                                fh0Var.getAnimatedDrawable().K(1);
                                fh0Var.d();
                                f10.addView(fh0Var, c8.ja.r(org.telegram.messenger.ns.g2, org.telegram.messenger.ns.g2, 1));
                                TextView textView = new TextView(context);
                                i5.c.w(textView, 1, 24.0f, null, 2131747778);
                                int i42 = org.telegram.ui.ActionBar.j6.G6;
                                org.telegram.ui.ActionBar.q6.U(textView, i42, null);
                                textView.setGravity(1);
                                TextView f11 = org.telegram.messenger.i20.f(f10, textView, c8.ja.q(-1, -2, 0.0f, 0, 50, 32, 50, 0), context);
                                f11.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                                i5.c.w(f11, 1, 14.0f, null, 2131747777);
                                org.telegram.ui.ActionBar.q6.U(f11, i42, null);
                                f11.setGravity(1);
                                TextView f12 = org.telegram.messenger.i20.f(f10, f11, c8.ja.q(-1, -2, 0.0f, 0, 36, 20, 36, 0), context);
                                i5.c.w(f12, 1, 14.0f, null, 2131747776);
                                org.telegram.ui.ActionBar.q6.U(f12, i42, null);
                                f12.setGravity(1);
                                f10.addView(f12, c8.ja.q(-1, -2, 0.0f, 0, 36, 24, 36, 0));
                                ptVar3.addView(f10, c8.ja.e(-1, -2, 16));
                                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, ptVar3, null);
                                ptVar3.setOnTouchListener(new ot());
                                this.S3 = ptVar3;
                                ptVar3.setAlpha(0.0f);
                                ((rw) this.fragmentView).addView(this.S3);
                                this.S3.animate().alpha(1.0f).setDuration(300L).setStartDelay(1000L).start();
                            }
                            this.S3.setTag(1);
                            return;
                        }
                        return;
                    }
                    if (i7 == org.telegram.messenger.ns.a5) {
                        D3();
                        return;
                    }
                    if (i7 == org.telegram.messenger.ns.m5) {
                        r5((TLRPC.User) objArr[0], true);
                        return;
                    }
                    if (i7 == org.telegram.messenger.ns.f5) {
                        r5(org.telegram.messenger.m10.i(i10).f(), true);
                        s5();
                        return;
                    }
                    if (i7 == org.telegram.messenger.ns.t5) {
                        zArr[this.currentAccount] = false;
                        u4(getAccountInstance());
                        getMessagesController().b3(this.Y2);
                        return;
                    }
                    if (i7 == org.telegram.messenger.ns.z5) {
                        int intValue5 = ((Integer) objArr[0]).intValue();
                        int i43 = 0;
                        while (true) {
                            xw[] xwVarArr8 = this.f0;
                            if (i43 >= xwVarArr8.length) {
                                return;
                            }
                            xw xwVar3 = xwVarArr8[i43];
                            if (xwVar3 != null && (((i11 = xwVar3.s) == 7 || i11 == 8) && (soVar = getMessagesController().N[xwVar3.s - 7]) != null && intValue5 == soVar.a)) {
                                xwVar3.q(true);
                                return;
                            }
                            i43++;
                        }
                    } else {
                        if (i7 != org.telegram.messenger.ns.P1) {
                            if (i7 == org.telegram.messenger.ns.v5) {
                                t5(this.W);
                                u5(0, true);
                                return;
                            }
                            if (i7 == org.telegram.messenger.ns.Z2) {
                                s5();
                                return;
                            }
                            if (i7 == org.telegram.messenger.ns.d3) {
                                g5();
                                return;
                            }
                            if (i7 == org.telegram.messenger.ns.g5) {
                                g5();
                                return;
                            }
                            if (i7 == org.telegram.messenger.ns.y3 || i7 == org.telegram.messenger.ns.A3) {
                                g5();
                                return;
                            } else if (i7 == org.telegram.messenger.ns.P3) {
                                g5();
                                return;
                            } else {
                                if (i7 == org.telegram.messenger.ns.Q3) {
                                    g5();
                                    return;
                                }
                                return;
                            }
                        }
                        long longValue6 = ((Long) objArr[0]).longValue();
                        int i44 = 0;
                        while (true) {
                            xw[] xwVarArr9 = this.f0;
                            if (i44 >= xwVarArr9.length) {
                                return;
                            }
                            xw xwVar4 = xwVarArr9[i44];
                            if (xwVar4.a != null) {
                                int i45 = 0;
                                while (true) {
                                    if (i45 < xwVar4.a.getChildCount()) {
                                        View childAt2 = xwVar4.a.getChildAt(i45);
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

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return !(dialog instanceof ki.x2) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.e2
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
        az0 az0Var = this.a0;
        float measuredHeight = (az0Var == null || az0Var.getVisibility() == 8) ? 0.0f : this.a0.getMeasuredHeight();
        float L = this.L ? org.telegram.messenger.g0.L(81.0f) : 0.0f;
        if (this.L) {
            float f17 = this.O;
            float f18 = this.z1;
            f10 = (measuredHeight * f18) + com.google.android.gms.internal.vision.e2.z(1.0f, f18, L, f17);
            f11 = this.z3;
        } else {
            f10 = (measuredHeight * this.z1) + this.O;
            f11 = this.z3;
        }
        float f19 = f10 + f11 + this.U;
        nw nwVar = this.Y;
        float L2 = org.telegram.messenger.g0.L(4.0f) * ((nwVar == null || nwVar.getVisibility() != 0) ? 0.0f : this.Y.getAlpha());
        ow owVar = this.A0;
        if (owVar != null) {
            owVar.setTranslationY(f19 - L2);
            f13 = this.A0.getAlpha();
            f14 = org.telegram.messenger.g0.L(43.0f) * f13;
            f12 = f19 + f14;
        } else {
            f12 = f19;
            f13 = 0.0f;
            f14 = 0.0f;
        }
        org.telegram.ui.Components.vr vrVar = this.L1;
        if (vrVar != null) {
            vrVar.setTranslationY(org.telegram.messenger.g0.T1(f12 - L2, (-org.telegram.messenger.g0.L(3.0f)) - (this.b0 == null ? org.telegram.messenger.g0.L(44.0f) : 0), this.b.e));
            f15 = this.L1.getMetadata().c.a;
            f16 = this.L1.c(0.0f);
        } else {
            f15 = 0.0f;
            f16 = 0.0f;
        }
        org.telegram.ui.Components.ur urVar = this.M1;
        if (urVar != null) {
            urVar.setTranslationY(f19 - L2);
            float W1 = org.telegram.messenger.g0.W1(Math.min(f15, f13), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(50.0f));
            org.telegram.ui.Components.ur urVar2 = this.M1;
            float min = Math.min(org.telegram.messenger.g0.L(40.0f), (f16 + f14) - W1);
            Matrix matrix = urVar2.b;
            if (urVar2.e != W1 || urVar2.f != min) {
                urVar2.e = W1;
                urVar2.f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, W1);
                LinearGradient linearGradient = urVar2.c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                urVar2.invalidate();
            }
            this.M1.setAlpha(Math.max(f13, f15));
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
        ?? r52;
        org.telegram.ui.ActionBar.z0 z0Var;
        org.telegram.ui.ActionBar.q0 q0Var2;
        ow owVar;
        org.telegram.ui.Components.fz d;
        long j3;
        TLRPC.User a22;
        this.X2 = false;
        this.V2 = 0;
        this.S2 = 0;
        this.R2 = 0;
        this.Q2 = 0;
        this.P2 = 0;
        this.W2 = 0;
        this.T2 = 0;
        this.U2 = 0;
        if (z10) {
            return;
        }
        ArrayList arrayList = this.K2;
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
            TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(((Long) arrayList.get(i7)).longValue());
            if (dialog == null) {
                j3 = e10;
            } else {
                j3 = e10;
                long j10 = dialog.id;
                boolean s42 = s4(dialog);
                boolean z12 = dialog.unread_count != 0 || dialog.unread_mark;
                if (getMessagesController().t2(j10)) {
                    this.W2++;
                }
                if (getMessagesController().r2(j10, 0L, null)) {
                    this.S2++;
                } else {
                    this.R2++;
                }
                if (z12) {
                    this.P2++;
                }
                if (this.Y2 == 1 || dialog.folder_id == 1) {
                    this.V2++;
                } else if (j10 != j3 && dialog.community_id == 0 && j10 != 777000 && !getMessagesController().C2(j10, false)) {
                    i13++;
                }
                if (dialog.community_id != 0) {
                    i11++;
                }
                if (!org.telegram.messenger.m5.E(j10) || j10 == j3 || j10 == 489000 || org.telegram.messenger.np.F2(getMessagesController().a2(Long.valueOf(j10)))) {
                    i15++;
                } else if (org.telegram.messenger.k5.w("dialog_bar_report", j10, notificationsSettings, true)) {
                    this.U2++;
                }
                if (org.telegram.messenger.m5.y(dialog)) {
                    TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j10));
                    if (getMessagesController().C2(dialog.id, true)) {
                        this.T2++;
                        int i16 = getMessagesController().B2;
                        int i17 = org.telegram.messenger.np.D8;
                        if (i16 == 1) {
                            i10++;
                            this.X2 = true;
                        }
                    } else {
                        if (s42) {
                            i14++;
                        } else {
                            this.Q2++;
                        }
                        if (M0 == null || !M0.megagroup) {
                            this.T2++;
                        } else if (org.telegram.messenger.t3.t0(M0)) {
                            this.T2++;
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
                        org.telegram.messenger.np.F2(a22);
                    }
                    if (s42) {
                        i14++;
                    } else {
                        this.Q2++;
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
        org.telegram.ui.ActionBar.q0 q0Var3 = this.l1;
        if (q0Var3 != null) {
            if (i10 != size || i11 > 0) {
                q0Var3.setVisibility(8);
            } else {
                q0Var3.setVisibility(0);
            }
        }
        org.telegram.ui.ActionBar.z0 z0Var2 = this.t1;
        if (z0Var2 != null) {
            int i18 = this.T2;
            if ((i18 == 0 || i18 == size) && ((i12 == 0 || i12 == size) && i11 <= 0)) {
                z0Var2.setVisibility(0);
                if (this.T2 != 0) {
                    this.t1.setText(org.telegram.messenger.hd.M0(2131752088, null));
                } else {
                    this.t1.setText(org.telegram.messenger.hd.M0(2131752089, null));
                }
            } else {
                z0Var2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.z0 z0Var3 = this.s1;
        if (z0Var3 != null && this.o1 != null) {
            if (this.V2 != 0 && i11 == 0 && this.a3 == 0) {
                String M02 = org.telegram.messenger.hd.M0(2131743915, null);
                this.s1.j(M02, R.drawable.msg_unarchive, null);
                this.o1.setIcon(R.drawable.msg_unarchive);
                this.o1.setContentDescription(M02);
                ow owVar2 = this.A0;
                if (owVar2 == null || owVar2.getVisibility() != 0) {
                    this.s1.setVisibility(0);
                    this.o1.setVisibility(8);
                } else {
                    this.o1.setVisibility(0);
                    this.s1.setVisibility(8);
                }
            } else if (i13 != 0 && i11 == 0 && this.a3 == 0) {
                String M03 = org.telegram.messenger.hd.M0(2131754172, null);
                this.s1.j(M03, R.drawable.msg_archive, null);
                this.o1.setIcon(R.drawable.msg_archive);
                this.o1.setContentDescription(M03);
                ow owVar3 = this.A0;
                if (owVar3 == null || owVar3.getVisibility() != 0) {
                    this.s1.setVisibility(0);
                    this.o1.setVisibility(8);
                } else {
                    this.o1.setVisibility(0);
                    this.s1.setVisibility(8);
                }
            } else {
                z0Var3.setVisibility(8);
                this.o1.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var4 = this.m1;
        if (q0Var4 != null && this.p1 != null) {
            if (this.Q2 + i14 == size && this.a3 == 0) {
                ow owVar4 = this.A0;
                if (owVar4 == null || owVar4.getVisibility() != 0) {
                    this.m1.setVisibility(0);
                    this.p1.setVisibility(8);
                } else {
                    this.p1.setVisibility(0);
                    this.m1.setVisibility(8);
                }
            } else {
                q0Var4.setVisibility(8);
                this.p1.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.z0 z0Var4 = this.v1;
        if (z0Var4 != null) {
            if (i15 != 0) {
                z0Var4.setVisibility(8);
            } else {
                z0Var4.setVisibility(0);
            }
        }
        if (this.r1 != null) {
            ow owVar5 = this.A0;
            boolean z14 = owVar5 == null || owVar5.getVisibility() != 0 || ((d = (owVar = this.A0).d()) != null && d.a == owVar.M);
            if (!z14) {
                try {
                    z14 = size >= d4(this.currentAccount, this.f0[0].d.h, this.Y2, this.U1).size();
                } catch (Exception unused) {
                }
            }
            if (!z14) {
                z11 = false;
                this.r1.setVisibility(0);
                if (this.q1 != null) {
                    if (this.Y2 != 1) {
                        if (this.A0 != null && e4(z11) > 0.5f) {
                            ow owVar6 = this.A0;
                            org.telegram.ui.Components.fz d2 = owVar6.d();
                            if (d2 != null && d2.a == owVar6.M) {
                                int i19 = org.telegram.ui.Components.jz.x1;
                                ArrayList arrayList4 = new ArrayList();
                                ArrayList arrayList5 = getMessagesController().Q0;
                                int size2 = arrayList5.size();
                                int i20 = 0;
                                while (i20 < size2) {
                                    org.telegram.messenger.so soVar = (org.telegram.messenger.so) arrayList5.get(i20);
                                    ArrayList arrayList6 = arrayList3;
                                    if (!org.telegram.ui.Components.jz.J0(this, soVar, arrayList6, true, true).isEmpty() && !soVar.e()) {
                                        arrayList4.add(soVar);
                                    }
                                    i20++;
                                    arrayList3 = arrayList6;
                                }
                            }
                        }
                        this.q1.setVisibility(8);
                    }
                    this.q1.setVisibility(0);
                }
                q0Var = this.n1;
                if (q0Var != null) {
                    r52 = 0;
                } else if (this.S2 != 0) {
                    q0Var.setIcon(R.drawable.msg_unmute);
                    r52 = 0;
                    this.n1.setContentDescription(org.telegram.messenger.hd.M0(2131752165, null));
                } else {
                    r52 = 0;
                    q0Var.setIcon(R.drawable.msg_mute);
                    this.n1.setContentDescription(org.telegram.messenger.hd.M0(2131752175, null));
                }
                z0Var = this.u1;
                if (z0Var != 0) {
                    if (this.P2 != 0) {
                        z0Var.j(org.telegram.messenger.hd.M0(2131748681, r52), R.drawable.msg_markread, r52);
                        this.u1.setVisibility(0);
                    } else if (this.W2 == 0 && i11 == 0) {
                        z0Var.j(org.telegram.messenger.hd.M0(2131748680, r52), R.drawable.msg_markunread, r52);
                        this.u1.setVisibility(0);
                    } else {
                        z0Var.setVisibility(8);
                    }
                }
                q0Var2 = this.m1;
                if (q0Var2 != null || this.p1 == null) {
                }
                if (this.Q2 != 0) {
                    q0Var2.setIcon(R.drawable.msg_pin);
                    this.m1.setContentDescription(org.telegram.messenger.hd.M0(2131747237, null));
                    this.p1.setText(org.telegram.messenger.hd.M0(2131751453, null));
                    return;
                } else {
                    q0Var2.setIcon(R.drawable.msg_unpin);
                    this.m1.setContentDescription(org.telegram.messenger.hd.M0(2131743845, null));
                    this.p1.setText(org.telegram.messenger.hd.M0(2131751452, null));
                    return;
                }
            }
            this.r1.setVisibility(8);
        }
        z11 = false;
        if (this.q1 != null) {
        }
        q0Var = this.n1;
        if (q0Var != null) {
        }
        z0Var = this.u1;
        if (z0Var != 0) {
        }
        q0Var2 = this.m1;
        if (q0Var2 != null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.Components.m60 m60Var = this.M0;
        if (m60Var != null) {
            m60Var.u();
        }
    }

    public final int g4() {
        if (this.L) {
            return org.telegram.messenger.g0.L(81.0f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0a81  */
    /* JADX WARN: Removed duplicated region for block: B:347:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v73 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Runnable, org.telegram.ui.ActionBar.e6] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.util.LongSparseArray] */
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
        uv uvVar;
        org.telegram.messenger.r9 r9Var;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        int i7;
        boolean z12;
        uv uvVar2;
        long j3;
        boolean z13;
        boolean z14;
        org.telegram.messenger.t1 b10;
        ?? r62;
        String G;
        StringBuilder sb2;
        final long j10;
        final long j11;
        if (this.L1 == null || this.O1 == null || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Cells.b3 b3Var = this.O1;
        boolean z15 = false;
        r7 = false;
        boolean z16 = false;
        if (b3Var != null) {
            try {
                ((org.telegram.ui.Components.ch0) ((org.telegram.ui.Components.t8) b3Var.h.getImageReceiver().n0).K).R(null);
            } catch (Exception unused) {
            }
            org.telegram.ui.Cells.b3 b3Var2 = this.O1;
            b3Var2.setCompact(false);
            b3Var2.a(org.telegram.messenger.m10.t0, null);
            org.telegram.ui.Components.i9 i9Var = b3Var2.h;
            i9Var.setVisibility(8);
            i9Var.b();
        }
        long j12 = 0;
        final int i10 = 1;
        if (!isInPreviewMode()) {
            if (getMessagesController().v2()) {
                this.O1.setOnClickListener(new gu(this, 12));
                this.O1.c(org.telegram.messenger.hd.M0(2131754701, null), org.telegram.messenger.hd.M0(2131754702, null), false, true);
            } else {
                int i11 = 19;
                int i12 = 21;
                if (this.Y2 == 0 && this.a3 == 0 && getMessagesController().T3.contains("SETUP_PASSKEY")) {
                    this.O1.setOnClickListener(new gu(this, i11));
                    this.O1.b(org.telegram.messenger.j6.p(org.telegram.messenger.hd.M0(2131747630, null), this.O1.c, new eu(this, i12)), org.telegram.messenger.hd.M0(2131747631, null));
                    this.O1.setOnCloseListener(new gu(this, 24));
                } else if (this.Y2 == 0 && this.a3 == 0 && getMessagesController().T3.contains("PREMIUM_GRACE")) {
                    this.O1.setOnClickListener(new gu(this, 25));
                    this.O1.b(org.telegram.messenger.j6.p(org.telegram.messenger.hd.M0(2131749525, null), this.O1.c, new eu(this, i12)), org.telegram.messenger.hd.M0(2131749529, null));
                    this.O1.setOnCloseListener(new gu(this, 26));
                } else if (this.Y2 == 0 && this.a3 == 0 && getMessagesController().V3 != null) {
                    final TLRPC.TL_pendingSuggestion tL_pendingSuggestion = getMessagesController().V3;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_pendingSuggestion.title.text);
                    org.telegram.messenger.gj.b(spannableStringBuilder, tL_pendingSuggestion.title.entities, false, false, true, true, 0);
                    Spannable B5 = org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(spannableStringBuilder, this.O1.c.getPaint().getFontMetricsInt(), false, null, 0), tL_pendingSuggestion.title.entities, this.O1.c.getPaint().getFontMetricsInt(), false);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_pendingSuggestion.description.text);
                    org.telegram.messenger.gj.b(spannableStringBuilder2, tL_pendingSuggestion.description.entities, false, false, true, true, 0);
                    this.O1.b(B5, org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(spannableStringBuilder2, this.O1.d.getPaint().getFontMetricsInt(), false, null, 0), tL_pendingSuggestion.description.entities, this.O1.d.getPaint().getFontMetricsInt(), false));
                    org.telegram.ui.Cells.b3 b3Var3 = this.O1;
                    final int i13 = z15 ? 1 : 0;
                    b3Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.xu
                        public final /* synthetic */ yw b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    vf.c.t(this.b.getParentActivity(), tL_pendingSuggestion.url);
                                    break;
                                default:
                                    yw.Z(this.b, tL_pendingSuggestion);
                                    break;
                            }
                        }
                    });
                    this.O1.setOnCloseListener(new View.OnClickListener(this) { // from class: org.telegram.ui.xu
                        public final /* synthetic */ yw b;

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
                                    yw.Z(this.b, tL_pendingSuggestion);
                                    break;
                            }
                        }
                    });
                } else {
                    if (this.Y2 == 0 && this.a3 == 0 && org.telegram.messenger.np.s1(this.currentAccount).T3.contains("STARS_SUBSCRIPTION_LOW_BALANCE")) {
                        di.v8 y10 = di.v8.y(this.currentAccount, false);
                        ArrayList arrayList = y10.z;
                        if (!arrayList.isEmpty()) {
                            long j13 = -y10.f.amount;
                            int i14 = 0;
                            while (i14 < arrayList.size()) {
                                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList.get(i14);
                                long j14 = j12;
                                long o4 = org.telegram.messenger.m5.o(starsSubscription.peer);
                                if (o4 >= j14) {
                                    if (getMessagesController().a2(Long.valueOf(o4)) == null) {
                                        i14++;
                                        j12 = j14;
                                    }
                                    j13 += starsSubscription.pricing.amount;
                                    i14++;
                                    j12 = j14;
                                } else {
                                    if (getMessagesController().M0(Long.valueOf(-o4)) == null) {
                                        i14++;
                                        j12 = j14;
                                    }
                                    j13 += starsSubscription.pricing.amount;
                                    i14++;
                                    j12 = j14;
                                }
                            }
                            j3 = j12;
                            if (j13 > j3) {
                                di.v8 y11 = di.v8.y(this.currentAccount, false);
                                ArrayList arrayList2 = y11.z;
                                StringBuilder sb3 = new StringBuilder();
                                if (arrayList2.isEmpty()) {
                                    sb2 = sb3;
                                    j10 = j3;
                                    j11 = j10;
                                } else {
                                    int i15 = 0;
                                    long j15 = j3;
                                    j11 = j15;
                                    while (i15 < arrayList2.size()) {
                                        TL_stars.StarsSubscription starsSubscription2 = (TL_stars.StarsSubscription) arrayList2.get(i15);
                                        TLRPC.Peer peer = starsSubscription2.peer;
                                        boolean z17 = z16 ? 1 : 0;
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
                                                sb3.append(org.telegram.messenger.q10.p(a22));
                                                j15 += starsSubscription2.pricing.amount;
                                                i15++;
                                                z16 = z17 ? 1 : 0;
                                            } else {
                                                i15++;
                                                z16 = z17 ? 1 : 0;
                                            }
                                        } else {
                                            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-o10));
                                            if (M0 != null) {
                                                if (sb3.length() > 0) {
                                                    sb3.append(", ");
                                                }
                                                sb3.append(M0.title);
                                                j15 += starsSubscription2.pricing.amount;
                                                i15++;
                                                z16 = z17 ? 1 : 0;
                                            } else {
                                                i15++;
                                                z16 = z17 ? 1 : 0;
                                            }
                                        }
                                    }
                                    sb2 = sb3;
                                    j10 = j15;
                                }
                                boolean z18 = z16;
                                final String sb4 = sb2.toString();
                                this.O1.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.yu
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        yw ywVar = yw.this;
                                        new di.cb(ywVar.getParentActivity(), ywVar.getResourceProvider(), j10, 2, sb4, new eu(ywVar, 2), j11).show();
                                    }
                                });
                                org.telegram.ui.Cells.b3 b3Var4 = this.O1;
                                long j16 = j10 - y11.f.amount;
                                if (j16 > j3) {
                                    j10 = j16;
                                }
                                Object[] objArr = new Object[1];
                                objArr[z18 ? 1 : 0] = sb4;
                                b3Var4.b(di.mb.a1(z18, org.telegram.messenger.hd.K("StarsSubscriptionExpiredHintTitle2", (int) j10, ',', objArr), 0.72f, null), org.telegram.messenger.hd.M0(2131744989, null));
                                this.O1.setOnCloseListener(new gu(this, 13));
                            }
                            if (this.Y2 != 0 && this.a3 == j3 && !getMessagesController().i7 && (b10 = org.telegram.messenger.v1.a(this.currentAccount).b()) != null && !b10.c.isEmpty() && !getMessagesController().U3.contains("BIRTHDAY_CONTACTS_TODAY")) {
                                org.telegram.messenger.t1 b11 = org.telegram.messenger.v1.a(this.currentAccount).b();
                                ArrayList arrayList3 = b11.c;
                                this.O1.setOnClickListener(new org.telegram.ui.Components.vv0(i11, this, b11));
                                this.O1.a(this.currentAccount, arrayList3);
                                org.telegram.ui.Cells.b3 b3Var5 = this.O1;
                                if (arrayList3.size() == 1) {
                                    r62 = 0;
                                    G = org.telegram.messenger.hd.a0(null, null, 2131753706, org.telegram.messenger.q10.k((TLRPC.User) arrayList3.get(0)));
                                } else {
                                    r62 = 0;
                                    G = org.telegram.messenger.hd.G(arrayList3.size(), "BirthdayTodayMultipleTitle", new Object[0]);
                                }
                                b3Var5.b(org.telegram.messenger.j6.p(org.telegram.messenger.g0.S2(G, org.telegram.ui.ActionBar.j6.I6, 2, r62, r62), this.O1.c, new eu(this, 21)), org.telegram.messenger.hd.a0(null, null, arrayList3.size() == 1 ? 2131753707 : 2131753710, new Object[0]));
                                this.O1.setOnCloseListener(new gu(this, 14));
                                di.v8.y(this.currentAccount, false).U();
                            } else if (this.Y2 != 0 && this.a3 == j3 && org.telegram.messenger.np.s1(this.currentAccount).T3.contains("BIRTHDAY_SETUP") && getMessagesController().b2(getUserConfig().e()) != null && getMessagesController().b2(getUserConfig().e()).birthday == null) {
                                org.telegram.messenger.g5.r(this.currentAccount).D(false);
                                this.O1.setOnClickListener(new gu(this, 15));
                                this.O1.b(org.telegram.messenger.j6.p(org.telegram.messenger.hd.M0(2131753712, null), this.O1.c, new eu(this, 21)), org.telegram.messenger.hd.a0(null, null, 2131753713, new Object[0]));
                                this.O1.setOnCloseListener(new gu(this, 16));
                            } else {
                                int i16 = 18;
                                if (!((org.telegram.messenger.np.s1(this.currentAccount).D3() && this.Y2 == 0 && this.a3 == j3) ? org.telegram.messenger.np.s1(this.currentAccount).T3.contains("PREMIUM_CHRISTMAS") : false)) {
                                    this.O1.setOnClickListener(new bi.o(i16));
                                    this.O1.b(org.telegram.messenger.j6.m(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131749673, null), org.telegram.ui.ActionBar.j6.I6, 2, null, null), null, false, null, 0), org.telegram.messenger.hd.a0(null, null, 2131753331, new Object[0]));
                                    this.O1.setOnCloseListener(new gu(this, 17));
                                } else if (!org.telegram.messenger.np.s1(this.currentAccount).D3() && this.Y2 == 0 && this.a3 == j3 && org.telegram.messenger.np.s1(this.currentAccount).T3.contains("PREMIUM_RESTORE") && !getUserConfig().q() && org.telegram.messenger.si.b0(this.currentAccount).g0(false) != null) {
                                    this.O1.setOnClickListener(new gu(this, i16));
                                    this.O1.b(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.a0(null, null, 2131746064, org.telegram.messenger.si.b0(this.currentAccount).g0(false)), org.telegram.ui.ActionBar.j6.I6, 2, null, null), org.telegram.messenger.hd.M0(2131746065, null));
                                } else {
                                    if (org.telegram.messenger.np.s1(this.currentAccount).D3() || this.Y2 != 0 || this.a3 != j3 || ((!(org.telegram.messenger.np.s1(this.currentAccount).T3.contains("PREMIUM_UPGRADE") && getUserConfig().q()) && (!org.telegram.messenger.np.s1(this.currentAccount).T3.contains("PREMIUM_ANNUAL") || getUserConfig().q())) || (!org.telegram.messenger.m10.i(this.currentAccount).q() ? org.telegram.messenger.si.b0(this.currentAccount).g0(false) == null : org.telegram.messenger.r2.b() || org.telegram.messenger.si.b0(this.currentAccount).g0(true) == null))) {
                                        z13 = false;
                                    } else {
                                        this.C3 = org.telegram.messenger.np.s1(this.currentAccount).T3.contains("PREMIUM_UPGRADE");
                                        z13 = true;
                                    }
                                    if (z13) {
                                        this.O1.setOnClickListener(new gu(this, 20));
                                        this.O1.b(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.a0(null, null, this.C3 ? 2131745934 : 2131743806, org.telegram.messenger.si.b0(this.currentAccount).g0(false)), org.telegram.ui.ActionBar.j6.I6, 2, null, null), org.telegram.messenger.hd.M0(this.C3 ? 2131743809 : 2131745935, null));
                                    } else {
                                        if (this.Q1 != null && this.R1 != null) {
                                            if (r0.longValue() / this.R1.longValue() < 0.3f) {
                                                org.telegram.messenger.np.e1().edit().remove("cache_hint_showafter").remove("cache_hint_period").apply();
                                            } else if (System.currentTimeMillis() > org.telegram.messenger.np.e1().getLong("cache_hint_showafter", j3)) {
                                                z14 = true;
                                                if (!z14) {
                                                    this.O1.setOnClickListener(new gu(this, 21));
                                                    this.O1.b(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.a0(null, null, 2131752048, org.telegram.messenger.g0.i0(this.Q1.longValue(), false, false)), org.telegram.ui.ActionBar.j6.I6, 2, null, null), org.telegram.messenger.hd.M0(2131752049, null));
                                                } else if (this.Y2 == 0 && this.a3 == 0 && getUserConfig().f() != null && ((getUserConfig().f().photo == null || (getUserConfig().f().photo instanceof TLRPC.TL_userProfilePhotoEmpty)) && org.telegram.messenger.np.s1(this.currentAccount).T3.contains("USERPIC_SETUP"))) {
                                                    this.O1.setOnClickListener(new gu(this, 22));
                                                    this.O1.h.setVisibility(0);
                                                    org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
                                                    t8Var.setBounds(0, 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f));
                                                    long e10 = getUserConfig().e();
                                                    t8Var.A = true;
                                                    t8Var.b = true;
                                                    t8Var.c = false;
                                                    int i17 = org.telegram.ui.ActionBar.j6.p8[org.telegram.ui.Components.t8.e(e10)];
                                                    org.telegram.ui.ActionBar.e6 e6Var = t8Var.z;
                                                    t8Var.d = org.telegram.ui.ActionBar.j6.w0(i17, e6Var);
                                                    t8Var.e = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.q8[org.telegram.ui.Components.t8.e(e10)], e6Var);
                                                    t8Var.n = 0;
                                                    t8Var.m = false;
                                                    org.telegram.ui.Components.t8.a("", "", "", t8Var.q);
                                                    t8Var.K = getParentActivity().getResources().getDrawable(R.drawable.filled_profile_photo_20);
                                                    this.O1.h.setImageDrawable(t8Var);
                                                    this.O1.b(org.telegram.messenger.j6.p(org.telegram.messenger.hd.M0(2131749301, null), this.O1.c, new eu(this, 21)), org.telegram.messenger.hd.M0(2131749300, null));
                                                    this.O1.setOnCloseListener(new gu(this, 23));
                                                } else {
                                                    if (this.Y2 == 0 && this.a3 == 0 && org.telegram.messenger.t0.a != null) {
                                                        for (String str : org.telegram.messenger.np.s1(this.currentAccount).T3) {
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
                            }
                        } else if (!y10.A) {
                            y10.A = true;
                            TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
                            tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
                            tL_getStarsSubscriptions.missing_balance = true;
                            tL_getStarsSubscriptions.offset = "";
                            ConnectionsManager.getInstance(y10.a).sendRequest(tL_getStarsSubscriptions, new di.p7(y10, z15 ? 1 : 0));
                        }
                    }
                    j3 = 0;
                    if (this.Y2 != 0) {
                    }
                    if (this.Y2 != 0) {
                    }
                    int i162 = 18;
                    if (!((org.telegram.messenger.np.s1(this.currentAccount).D3() && this.Y2 == 0 && this.a3 == j3) ? org.telegram.messenger.np.s1(this.currentAccount).T3.contains("PREMIUM_CHRISTMAS") : false)) {
                    }
                }
            }
            z15 = true;
        }
        uv uvVar3 = this.H3;
        te.a aVar = this.b;
        if ((uvVar3 != null && uvVar3.c()) || aVar.f) {
            z15 = false;
        }
        this.L1.i(this.O1, z15, true);
        B3(true);
        if (this.fragmentView == null || this.L1 == null) {
            z10 = false;
        } else {
            boolean z19 = !isInPreviewMode() && this.Y2 == 0 && this.a3 == 0 && this.T0 == 0 && !getMessagesController().U1().b.isEmpty() && ((uvVar2 = this.H3) == null || !uvVar2.c()) && !aVar.f;
            if (z19) {
                if (this.P1 == null) {
                    org.telegram.ui.Cells.ma maVar = new org.telegram.ui.Cells.ma(getParentActivity());
                    this.P1 = maVar;
                    this.L1.addView(maVar);
                }
                org.telegram.ui.Cells.ma maVar2 = this.P1;
                int i18 = this.currentAccount;
                TextView textView = maVar2.b;
                TextView textView2 = maVar2.c;
                ArrayList arrayList4 = org.telegram.messenger.np.s1(i18).U1().b;
                org.telegram.ui.Cells.la laVar = maVar2.d;
                laVar.setText(org.telegram.messenger.hd.M0(2131743910, null));
                laVar.a(false, false);
                org.telegram.ui.Cells.la laVar2 = maVar2.e;
                laVar2.setText(org.telegram.messenger.hd.M0(2131743900, null));
                laVar2.a(false, false);
                if (arrayList4 == null || arrayList4.size() != 1) {
                    if (arrayList4 == null || arrayList4.size() <= 1) {
                        z10 = false;
                    } else {
                        textView.setText(org.telegram.messenger.hd.M0(2131743891, null));
                        String str2 = ((org.telegram.messenger.i10) arrayList4.get(0)).f;
                        int i19 = 1;
                        while (true) {
                            if (i19 >= arrayList4.size()) {
                                break;
                            }
                            if (!TextUtils.equals(str2, ((org.telegram.messenger.i10) arrayList4.get(i19)).f)) {
                                str2 = null;
                                break;
                            }
                            i19++;
                        }
                        if (str2 == null) {
                            z10 = false;
                            textView2.setText(org.telegram.messenger.hd.G(arrayList4.size(), "UnconfirmedAuthMultiple", new Object[0]));
                        } else {
                            z10 = false;
                            textView2.setText(org.telegram.messenger.hd.G(arrayList4.size(), "UnconfirmedAuthMultipleFrom", str2));
                        }
                    }
                    z12 = z10;
                } else {
                    org.telegram.messenger.i10 i10Var = (org.telegram.messenger.i10) arrayList4.get(0);
                    boolean z20 = i10Var.a;
                    String str3 = i10Var.f;
                    boolean z21 = true;
                    textView.setText(org.telegram.messenger.hd.M0(z20 ? 2131743890 : 2131743891, null));
                    String str4 = "" + i10Var.e;
                    if (!TextUtils.isEmpty(str3) && !str4.isEmpty()) {
                        str4 = str4.concat(", ");
                    }
                    String v = r.b.v(str4, str3);
                    if (i10Var.a) {
                        textView2.setText(org.telegram.messenger.hd.a0(null, null, 2131743892, "@" + org.telegram.messenger.m5.t(i10Var.c), v));
                    } else {
                        textView2.setText(org.telegram.messenger.hd.a0(null, null, 2131743893, v));
                        z21 = false;
                    }
                    z12 = z21;
                    z10 = false;
                }
                laVar.setOnClickListener(new org.telegram.ui.Cells.ka(this, z12, i18, arrayList4));
                laVar2.setOnClickListener(new bi.x2(maVar2, i18, arrayList4, 4));
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.ma maVar3 = this.P1;
            if (maVar3 != null) {
                this.L1.i(maVar3, z19, true);
            }
        }
        if (this.fragmentView == null || this.L1 == null) {
            return;
        }
        if (!isInPreviewMode() && this.Y2 == 0 && this.a3 == 0 && this.T0 == 0) {
            org.telegram.messenger.v9 giftAuctionsController = getGiftAuctionsController();
            if (!giftAuctionsController.d) {
                SharedPreferences sharedPreferences = giftAuctionsController.getMessagesController().f7;
                if (System.currentTimeMillis() - (sharedPreferences != null ? sharedPreferences.getLong("lastGiftAuctionTimeUpdate", 0L) : 0L) < 86400000) {
                    giftAuctionsController.d = true;
                    TL_payments.TL_getStarGiftActiveAuctions tL_getStarGiftActiveAuctions = new TL_payments.TL_getStarGiftActiveAuctions();
                    ?? arrayList5 = new ArrayList();
                    ?? r72 = giftAuctionsController.b;
                    int size = r72.size();
                    for (?? r92 = z10; r92 < size; r92++) {
                        org.telegram.messenger.s9 s9Var = (org.telegram.messenger.s9) r72.valueAt(r92);
                        org.telegram.messenger.r9 r9Var2 = s9Var.b;
                        if (r9Var2 != null && !r9Var2.f() && (tL_starGiftAuctionState = (r9Var = s9Var.b).f) != null && (i7 = r9Var.e.bid_date) > 0) {
                            arrayList5.add(Long.valueOf(tL_starGiftAuctionState.version | (i7 << 32)));
                        }
                    }
                    Collections.sort(arrayList5);
                    int size2 = arrayList5.size();
                    long j17 = 0;
                    for (?? r52 = z10; r52 < size2; r52++) {
                        Long l10 = (Long) arrayList5.get(r52);
                        j17 = org.telegram.messenger.si.p(org.telegram.messenger.si.p(j17, l10.longValue() & 4294967295L), l10.longValue() >> 32);
                    }
                    tL_getStarGiftActiveAuctions.hash = j17;
                    giftAuctionsController.getConnectionsManager().sendRequestTyped(tL_getStarGiftActiveAuctions, new d3.b(1), new org.telegram.messenger.d(giftAuctionsController, 2));
                }
            }
            if (!giftAuctionsController.c.isEmpty() && (((uvVar = this.H3) == null || !uvVar.c()) && !aVar.f)) {
                z11 = true;
                if (z11 && this.N1 == null) {
                    org.telegram.ui.Cells.m mVar2 = new org.telegram.ui.Cells.m(getParentActivity(), this.currentAccount);
                    this.N1 = mVar2;
                    this.L1.addView(mVar2);
                }
                mVar = this.N1;
                if (mVar == null) {
                    this.L1.i(mVar, z11, true);
                    return;
                }
                return;
            }
        }
        z11 = z10;
        if (z11) {
            org.telegram.ui.Cells.m mVar22 = new org.telegram.ui.Cells.m(getParentActivity(), this.currentAccount);
            this.N1 = mVar22;
            this.L1.addView(mVar22);
        }
        mVar = this.N1;
        if (mVar == null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.ActionBar.k4 getBackButtonState() {
        return (q4() || this.H3.f) ? org.telegram.ui.ActionBar.k4.a : org.telegram.ui.ActionBar.k4.b;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f10) {
        int i7 = 1;
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Y3, 1.0f);
            this.b4 = ofFloat;
            return ofFloat;
        }
        int i10 = (getLayoutContainer() == null || getLayoutContainer().getMeasuredWidth() <= 0) ? org.telegram.messenger.ns.g2 : (int) Utilities.i((200.0f / getLayoutContainer().getMeasuredWidth()) * f10, 200.0f, 80.0f);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.Y3, 1.0f);
        this.b4 = ofFloat2;
        ofFloat2.addUpdateListener(new lu(this, i7));
        this.b4.setInterpolator(org.telegram.ui.Components.er.g);
        this.b4.setDuration(i10);
        this.b4.start();
        return this.b4;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0230 A[SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.e2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList getThemeDescriptions() {
        View view;
        View view2;
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.ActionBar.q0 q0Var = this.n0;
        if (q0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.t8));
        }
        if (this.Y2 == 0) {
            hw hwVar = this.D0;
            if (hwVar != null) {
                arrayList.add(new org.telegram.ui.ActionBar.s6(hwVar.b0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.d6));
            }
            arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 128, (Class[]) null, (Paint) null, new Drawable[]{org.telegram.ui.ActionBar.j6.s1}, (org.telegram.ui.ActionBar.r6) null, !this.X ? org.telegram.ui.ActionBar.j6.A8 : org.telegram.ui.ActionBar.j6.Xl));
            arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.C8));
            arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.D8));
        } else {
            hw hwVar2 = this.D0;
            if (hwVar2 != null) {
                arrayList.add(new org.telegram.ui.ActionBar.s6(hwVar2.b0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.d6));
            }
            arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 128, (Class[]) null, (Paint) null, new Drawable[]{org.telegram.ui.ActionBar.j6.s1}, (org.telegram.ui.ActionBar.r6) null, !this.X ? org.telegram.ui.ActionBar.j6.P8 : org.telegram.ui.ActionBar.j6.Xl));
            arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Q8));
            arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.R8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, TLObject.FLAG_21, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.x8));
        NumberTextView numberTextView = this.j1;
        int i7 = org.telegram.ui.ActionBar.j6.y8;
        arrayList.add(new org.telegram.ui.ActionBar.s6(numberTextView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        if (this.A0 != null) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar == null || !kVar.x()) {
                arrayList.add(new org.telegram.ui.ActionBar.s6(this.A0, 0, new Class[]{org.telegram.ui.Components.iz.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.K8));
                arrayList.add(new org.telegram.ui.ActionBar.s6(this.A0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.gz.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.I8));
                arrayList.add(new org.telegram.ui.ActionBar.s6(this.A0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.gz.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.J8));
                arrayList.add(new org.telegram.ui.ActionBar.s6(this.A0.getTabsContainer(), TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.L8));
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.s6(this.A0, 0, new Class[]{org.telegram.ui.Components.iz.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.xi));
                arrayList.add(new org.telegram.ui.ActionBar.s6(this.A0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.gz.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.wi));
                arrayList.add(new org.telegram.ui.ActionBar.s6(this.A0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.gz.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.vi));
            }
        }
        arrayList.addAll(c8.oa.a(new g6(7, this), org.telegram.ui.ActionBar.j6.w8, i7));
        int i10 = 0;
        while (i10 < 3) {
            if (i10 == 2) {
                hw hwVar3 = this.D0;
                if (hwVar3 == null) {
                    i10++;
                } else {
                    view = hwVar3.b0;
                    view2 = view;
                    if (view2 == null) {
                        arrayList.add(new org.telegram.ui.ActionBar.s6(view2, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.i6));
                        arrayList.add(new org.telegram.ui.ActionBar.s6(view2, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.h6));
                        int i11 = org.telegram.ui.Cells.x3.h;
                        arrayList.add(new org.telegram.ui.ActionBar.s6(view2, 4, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.o6));
                    }
                    i10++;
                }
            } else {
                xw[] xwVarArr = this.f0;
                if (xwVarArr == null) {
                    i10++;
                } else {
                    view = i10 < xwVarArr.length ? xwVarArr[i10].a : null;
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
                xw[] xwVarArr2 = this.f0;
                if (i12 >= xwVarArr2.length) {
                    break;
                }
                if (this.Y2 == 0) {
                    arrayList.add(new org.telegram.ui.ActionBar.s6(xwVarArr2[i12].a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.d6));
                } else {
                    arrayList.add(new org.telegram.ui.ActionBar.s6(xwVarArr2[i12].a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.d6));
                }
                int i13 = org.telegram.messenger.gz.a;
                int i14 = org.telegram.ui.ActionBar.j6.q6;
                arrayList.add(new org.telegram.ui.ActionBar.s6(this.f0[i12].a, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.s6(this.f0[i12].a, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.s6(this.f0[i12].x, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.h6));
                this.f0[i12].d.getClass();
                arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.d6));
                i12++;
            }
        }
        int i15 = 0;
        while (true) {
            UndoView[] undoViewArr = this.z0;
            if (i15 >= undoViewArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.s6(undoViewArr[i15], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.wj));
            i15++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.i5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.k5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.l5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.m5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.n5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.o5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.q7));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.p5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.q5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.r5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.s5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.J5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.t5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.u5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.v5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.w5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.x5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.y5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.z5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.D5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.E5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.H5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.B5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.C5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.F5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.G5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.K5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.M5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.N5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.O5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Q5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.S5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.U5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.zj));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Aj));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ej));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Fj));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Gj));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Hj));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ij));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Jj));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Kj));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Lj));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Mj));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Nj));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Oj));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Kh));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Lh));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Mh));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ph));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Th));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Uh));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Wh));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Zh));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.ai));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.bi));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Yh));
        jg.q0 q0Var2 = this.c0;
        if (q0Var2 != null) {
            arrayList.addAll(q0Var2.getThemeDescriptions());
            this.c0.updateColors();
        }
        ax axVar = this.i0;
        if (axVar != null) {
            axVar.updateColors();
            this.i0.invalidate();
        }
        hw hwVar4 = this.D0;
        if (hwVar4 != null) {
            org.telegram.ui.Components.wl0 wl0Var = hwVar4.c0;
            SparseArray sparseArray = hwVar4.h;
            di.c1 c1Var = hwVar4.b0;
            for (int i16 = 0; i16 < c1Var.getChildCount(); i16++) {
                View childAt = c1Var.getChildAt(i16);
                if ((childAt instanceof org.telegram.ui.Cells.f6) || (childAt instanceof org.telegram.ui.Cells.t2) || (childAt instanceof org.telegram.ui.Cells.m4)) {
                    arrayList.add(new org.telegram.ui.ActionBar.s6(childAt, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.d6));
                }
            }
            for (int i17 = 0; i17 < hwVar4.getChildCount(); i17++) {
                if (hwVar4.getChildAt(i17) instanceof zz) {
                    arrayList.addAll(((zz) hwVar4.getChildAt(i17)).getThemeDescriptions());
                }
            }
            int size = sparseArray.size();
            for (int i18 = 0; i18 < size; i18++) {
                View view3 = (View) sparseArray.valueAt(i18);
                if (view3 instanceof zz) {
                    arrayList.addAll(((zz) view3).getThemeDescriptions());
                }
            }
            zz zzVar = hwVar4.P0;
            if (zzVar != null) {
                arrayList.addAll(zzVar.getThemeDescriptions());
            }
            arrayList.add(new org.telegram.ui.ActionBar.s6(wl0Var.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.s6(wl0Var.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.y6));
            arrayList.addAll(c8.oa.a(new org.telegram.ui.Components.q6(hwVar4, 4), org.telegram.ui.ActionBar.j6.y8));
        }
        org.telegram.ui.Cells.b3 b3Var = this.O1;
        int i19 = 5;
        if (b3Var != null) {
            arrayList.addAll(c8.oa.a(new org.telegram.ui.Components.q6(new bh(b3Var, 19), i19), org.telegram.ui.ActionBar.j6.d6, org.telegram.ui.ActionBar.j6.G6, org.telegram.ui.ActionBar.j6.y6));
        }
        org.telegram.ui.Cells.ma maVar = this.P1;
        if (maVar != null) {
            arrayList.addAll(c8.oa.a(new org.telegram.ui.Components.q6(new bh(maVar, 20), i19), org.telegram.ui.ActionBar.j6.d6, org.telegram.ui.ActionBar.j6.G6, org.telegram.ui.ActionBar.j6.y6, org.telegram.ui.ActionBar.j6.I6, org.telegram.ui.ActionBar.j6.q7));
        }
        org.telegram.ui.Cells.m mVar = this.N1;
        if (mVar != null) {
            arrayList.addAll(c8.oa.a(new org.telegram.ui.Components.q6(new bh(mVar, 21), i19), org.telegram.ui.ActionBar.j6.d6, org.telegram.ui.ActionBar.j6.G6, org.telegram.ui.ActionBar.j6.y6, org.telegram.ui.ActionBar.j6.I6, org.telegram.ui.ActionBar.j6.q7));
        }
        return arrayList;
    }

    public final float h4() {
        uv uvVar = this.H3;
        if (uvVar == null || !uvVar.c()) {
            return 0.0f;
        }
        return this.H3.e;
    }

    public final void h5() {
        di.c1 c1Var;
        uw uwVar;
        try {
            kv kvVar = this.D1;
            if (kvVar != null && kvVar.getEditField() != null) {
                this.D1.getEditField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.j6.Ne));
            }
            NumberTextView numberTextView = this.j1;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.y8));
            }
            ow owVar = this.A0;
            int i7 = 0;
            if (owVar != null && (owVar.getSelectorDrawable() instanceof GradientDrawable)) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                ((GradientDrawable) this.A0.getSelectorDrawable()).setColor(getThemedColor(kVar != null && kVar.x() ? org.telegram.ui.ActionBar.j6.xi : org.telegram.ui.ActionBar.j6.K8));
                this.A0.invalidate();
            }
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                if (this.Y2 != 0 || this.a3 != 0) {
                    kVar2.L(getThemedColor(org.telegram.ui.ActionBar.j6.Q8), false);
                    this.actionBar.L(getThemedColor(org.telegram.ui.ActionBar.j6.R8), true);
                }
                if (this.actionBar.x()) {
                    this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                }
                n5();
            }
            if (this.f0 != null) {
                while (true) {
                    xw[] xwVarArr = this.f0;
                    if (i7 >= xwVarArr.length) {
                        break;
                    }
                    xw xwVar = xwVarArr[i7];
                    if (xwVar != null && (uwVar = xwVar.a) != null) {
                        uwVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                    }
                    i7++;
                }
            }
            hw hwVar = this.D0;
            if (hwVar != null && (c1Var = hwVar.b0) != null) {
                c1Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            }
            oi.u1 u1Var = this.E1;
            if (u1Var != null) {
                u1Var.setScrimViewBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            }
            hi.l3 l3Var = this.q0;
            if (l3Var != null) {
                l3Var.j(getThemedColor(org.telegram.ui.ActionBar.j6.wj));
            }
            hi.l3 l3Var2 = this.r0;
            if (l3Var2 != null) {
                l3Var2.j(getThemedColor(org.telegram.ui.ActionBar.j6.wj));
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
        ?? r52;
        int L0;
        org.telegram.messenger.so soVar;
        Object[] objArr;
        boolean z12;
        boolean z13;
        if (this.A0 == null || this.inPreviewMode || this.s3) {
            return;
        }
        uv uvVar = this.H3;
        if (uvVar == null || !uvVar.c()) {
            org.telegram.ui.Components.m60 m60Var = this.M0;
            String str = null;
            if (m60Var != null) {
                m60Var.u();
                this.M0 = null;
            }
            ArrayList T0 = getMessagesController().T0();
            int size = T0.size();
            te.a aVar = this.r;
            boolean z14 = true;
            boolean z15 = false;
            if (size <= 1) {
                r52 = 0;
                if (this.A0.getVisibility() != 8) {
                    this.A0.setIsEditing(false);
                    U4(false);
                    this.p3 = false;
                    if (this.o3) {
                        this.o3 = false;
                        this.f0[0].setTranslationX(0.0f);
                        this.f0[1].setTranslationX(r2[0].getMeasuredWidth());
                    }
                    if (this.f0[0].h != this.A0.getDefaultTabId()) {
                        this.f0[0].h = this.A0.getDefaultTabId();
                        hv hvVar = this.f0[0].d;
                        hvVar.h = 0;
                        hvVar.f();
                        xw xwVar = this.f0[0];
                        xwVar.s = this.T0;
                        xwVar.d.f();
                    }
                    this.f0[1].setVisibility(8);
                    xw xwVar2 = this.f0[1];
                    xwVar2.h = 0;
                    hv hvVar2 = xwVar2.d;
                    hvVar2.h = 0;
                    hvVar2.f();
                    xw xwVar3 = this.f0[1];
                    xwVar3.s = this.T0;
                    xwVar3.d.f();
                    this.x = false;
                    if (this.fragmentView != null) {
                        boolean z16 = (this.isPaused || this.S3 != null) ? false : z11;
                        if (!this.s3) {
                            aVar.a(false, z16);
                        }
                    }
                    int i7 = 0;
                    while (true) {
                        xw[] xwVarArr = this.f0;
                        if (i7 >= xwVarArr.length) {
                            break;
                        }
                        xw xwVar4 = xwVarArr[i7];
                        if (xwVar4.s == 0 && xwVar4.w == 2 && l4() && ((L0 = this.f0[i7].c.L0()) == 0 || L0 == 1)) {
                            this.f0[i7].c.h1(1, (int) this.O);
                        }
                        this.f0[i7].a.setScrollingTouchSlop(0);
                        this.f0[i7].a.requestLayout();
                        this.f0[i7].requestLayout();
                        i7++;
                    }
                    this.A0.M = -1;
                    r52 = 0;
                }
            } else if (z10 || this.A0.getVisibility() != 0) {
                boolean z17 = this.A0.getVisibility() != 0 ? false : z11;
                this.x = true;
                boolean isEmpty = this.A0.h.isEmpty();
                if (this.fragmentView != null) {
                    boolean z18 = (this.isPaused || this.S3 != null) ? false : z11;
                    if (!this.s3) {
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
                ow owVar = this.A0;
                owVar.h.clear();
                owVar.k0.clear();
                owVar.m0.clear();
                owVar.n0.clear();
                owVar.o0.clear();
                owVar.p0.clear();
                owVar.N = 0;
                int size2 = T0.size();
                int i10 = 0;
                while (i10 < size2) {
                    if (((org.telegram.messenger.so) T0.get(i10)).e()) {
                        this.A0.a(i10, 0, org.telegram.messenger.hd.M0(2131750807, str), null, false, true, ((org.telegram.messenger.so) T0.get(i10)).p);
                        z13 = z15;
                    } else {
                        org.telegram.messenger.so soVar2 = (org.telegram.messenger.so) T0.get(i10);
                        z13 = z15;
                        this.A0.a(i10, soVar2.o, soVar2.b, soVar2.c, soVar2.n, false, ((org.telegram.messenger.so) T0.get(i10)).p);
                    }
                    i10++;
                    z15 = z13;
                    str = null;
                }
                boolean z19 = z15;
                if (currentTabStableId >= 0) {
                    if (objArr != false && !this.A0.h(currentTabStableId)) {
                        while (currentTabId >= 0) {
                            ow owVar2 = this.A0;
                            if (owVar2.h(owVar2.l0.get(currentTabId, -1))) {
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
                    xw[] xwVarArr2 = this.f0;
                    if (i11 >= xwVarArr2.length) {
                        break;
                    }
                    if (xwVarArr2[i11].h >= T0.size()) {
                        this.f0[i11].h = T0.size() - 1;
                    }
                    this.f0[i11].a.setScrollingTouchSlop(1);
                    i11++;
                }
                ow owVar3 = this.A0;
                owVar3.G.setItemAnimator(z17 ? owVar3.t0 : null);
                owVar3.J.f();
                if (isEmpty) {
                    d5(z19);
                }
                ow owVar4 = this.A0;
                int currentTabId2 = owVar4.getCurrentTabId();
                ArrayList arrayList = owVar4.h;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        z12 = false;
                        break;
                    } else {
                        if (((org.telegram.ui.Components.fz) arrayList.get(i12)).a == currentTabId2) {
                            z12 = ((org.telegram.ui.Components.fz) arrayList.get(i12)).f;
                            break;
                        }
                        i12++;
                    }
                }
                if (z12) {
                    ow owVar5 = this.A0;
                    ArrayList arrayList2 = owVar5.h;
                    if (!arrayList2.isEmpty()) {
                        r52 = 0;
                        owVar5.f((org.telegram.ui.Components.fz) arrayList2.get(0), 0);
                    }
                }
                r52 = 0;
            } else {
                r52 = 0;
            }
            f5(r52);
            int i13 = this.f0[r52].s;
            if ((i13 == 7 || i13 == 8) && (soVar = getMessagesController().N[i13 - 7]) != null) {
                int i14 = 0;
                while (true) {
                    if (i14 >= T0.size()) {
                        z14 = false;
                        break;
                    }
                    org.telegram.messenger.so soVar3 = (org.telegram.messenger.so) T0.get(i14);
                    if (soVar3 != null && soVar3.a == soVar.a) {
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

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isLightStatusBar() {
        uv uvVar;
        return (this.l2 || (uvVar = this.H3) == null || uvVar.getFragment() == null) ? i0.a.h(getThemedColor(org.telegram.ui.ActionBar.j6.d6)) > 0.699999988079071d : this.H3.getFragment().isLightStatusBar();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final fi.s6 j4() {
        return getMessagesController().P1();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j5(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11, boolean z12) {
        hw hwVar;
        boolean z13;
        org.telegram.ui.Components.v61 v61Var;
        if (!this.s3 || this.n2 || (hwVar = this.D0) == null) {
            return;
        }
        ArrayList<jg.o0> currentSearchFilters = hwVar.getCurrentSearchFilters();
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        for (int i7 = 0; i7 < currentSearchFilters.size(); i7++) {
            if (currentSearchFilters.get(i7).a()) {
                z15 = true;
            } else if (currentSearchFilters.get(i7).d == 4) {
                z16 = true;
            } else if (currentSearchFilters.get(i7).d == 6) {
                z17 = true;
            } else if (currentSearchFilters.get(i7).d == 7) {
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
                v61Var = this.b0;
                if (v61Var != null) {
                    v61Var.b(z13, true);
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
        v61Var = this.b0;
        if (v61Var != null) {
        }
        this.c0.setEnabled(z13);
        this.s.a(z13, true);
    }

    @Override // org.telegram.ui.ie0
    public final ui.f k() {
        return this.m4;
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
            rw rwVar = (rw) this.fragmentView;
            rwVar.removeView(undoViewArr[0]);
            rwVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void k5() {
        float f10 = (((-this.h4) - this.k4) - this.w1) - this.x1;
        org.telegram.ui.Components.t00 t00Var = this.u0;
        if (t00Var != null) {
            t00Var.setTranslationY(f10);
        }
        org.telegram.ui.Components.t00 t00Var2 = this.v0;
        if (t00Var2 != null) {
            t00Var2.setTranslationY(f10 - org.telegram.messenger.g0.L(52.0f));
            hi.l3 l3Var = this.q0;
            if (l3Var != null) {
                l3Var.setTranslationY(f10 - org.telegram.messenger.g0.L(52.0f));
            }
        }
    }

    public final boolean l4() {
        if (this.n2 || this.T0 != 0 || this.a3 != 0 || this.Y2 != 0) {
            return false;
        }
        org.telegram.messenger.np messagesController = getMessagesController();
        messagesController.getClass();
        return org.telegram.messenger.gz.q1 && messagesController.R.f(2305843009213693952L | ((long) 1)) != null;
    }

    public final void l5(boolean z10) {
        boolean z11 = this.n2;
        boolean z12 = (!z11 || this.T0 == 10) && this.Y2 == 0 && this.a3 == 0 && !this.inPreviewMode && (!this.l2 || z11) && !this.V3;
        org.telegram.ui.Components.t00 t00Var = this.u0;
        if (t00Var != null) {
            t00Var.e(z12, z10);
        }
        org.telegram.ui.Components.t00 t00Var2 = this.v0;
        if (t00Var2 != null) {
            t00Var2.e(z12, z10);
        }
    }

    public final boolean m4() {
        ArrayList arrayList = this.F2;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public final void m5(boolean z10, boolean z11) {
        boolean z12;
        if (this.o0 != null) {
            org.telegram.ui.ActionBar.q0 q0Var = this.n0;
            if (q0Var == null || q0Var.getVisibility() != 0) {
                int i7 = 0;
                while (true) {
                    if (i7 >= getDownloadController().H.size()) {
                        z12 = false;
                        break;
                    } else {
                        if (getFileLoader().S(((org.telegram.messenger.gj) getDownloadController().H.get(i7)).S0())) {
                            z12 = true;
                            break;
                        }
                        i7++;
                    }
                }
                if (getDownloadController().J.size() > 0 || z12 || (this.h0.getVisibility() == 0 && this.h0.getAlpha() == 1.0f && !z11)) {
                    this.j0 = true;
                } else {
                    this.j0 = false;
                }
                J3();
                boolean z13 = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i10 = this.f2;
                boolean z14 = i10 == 3 || i10 == 5;
                this.p0.setSubtext(org.telegram.messenger.hd.M0(z13 ? z14 ? 2131748608 : 2131748607 : 2131748606, null));
                this.o0.b(z13, z14, z10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n4(boolean z10) {
        boolean z11;
        this.actionBar.w();
        this.K2.clear();
        org.telegram.ui.ActionBar.x1 x1Var = this.g1;
        int i7 = 1;
        if (x1Var != null) {
            x1Var.c(true, 0.0f);
        }
        ow owVar = this.A0;
        if (owVar != null) {
            owVar.b(org.telegram.ui.ActionBar.j6.K8, org.telegram.ui.ActionBar.j6.I8, org.telegram.ui.ActionBar.j6.J8, org.telegram.ui.ActionBar.j6.L8, org.telegram.ui.ActionBar.j6.d6);
        }
        ValueAnimator valueAnimator = this.x3;
        Object obj = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.x3 = null;
        }
        if (this.w3 == 0.0f) {
            return;
        }
        O4(-f4());
        int i10 = 0;
        int i11 = 0;
        while (true) {
            xw[] xwVarArr = this.f0;
            if (i11 >= xwVarArr.length) {
                break;
            }
            xw xwVar = xwVarArr[i11];
            if (xwVar != null) {
                xwVar.a.I0(true);
            }
            i11++;
        }
        float max = Math.max(0.0f, org.telegram.messenger.g0.L((this.L ? 81 : 0) + 48) + this.O);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w3, 0.0f);
        this.x3 = ofFloat;
        ofFloat.addUpdateListener(new iu(this, max, i7));
        this.x3.addListener(new cw(this, max, i10));
        this.x3.setInterpolator(org.telegram.ui.Components.er.f);
        this.x3.setDuration(200L);
        this.x3.start();
        this.a1 = false;
        ArrayList arrayList = this.c1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                org.telegram.messenger.so soVar = (org.telegram.messenger.so) arrayList.get(i12);
                hz.z0(soVar, soVar.g, soVar.b, soVar.c, soVar.n, soVar.m, soVar.h, soVar.i, soVar.j, false, false, true, true, false, this, null);
                i12++;
                arrayList = arrayList;
                size = size;
                i10 = 0;
                i7 = 1;
                obj = null;
            }
            arrayList.clear();
        }
        if (this.b1) {
            getMessagesController().m4(this.Y2, 0L, null);
            z11 = 0;
            this.b1 = false;
        } else {
            z11 = 0;
        }
        f5(true);
        if (this.f0 != null) {
            int i13 = z11;
            while (true) {
                xw[] xwVarArr2 = this.f0;
                if (i13 >= xwVarArr2.length) {
                    break;
                }
                xwVarArr2[i13].d.I = z11;
                i13++;
            }
        }
        int i14 = org.telegram.messenger.np.D8;
        int i15 = z11;
        if (z10) {
            i15 = TLObject.FLAG_13;
        }
        u5(i15 | 196608, true);
    }

    public final void n5() {
        if (!this.u3 || this.actionBar == null) {
            return;
        }
        int themedColor = getThemedColor((this.Y2 == 0 && this.a3 == 0) ? org.telegram.ui.ActionBar.j6.v8 : org.telegram.ui.ActionBar.j6.O8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.j6.y8;
        kVar.H(i0.a.f(this.z1, themedColor, getThemedColor(i7)), false);
        this.actionBar.H(i0.a.f(this.z1, getThemedColor(i7), getThemedColor(i7)), true);
        this.actionBar.F(i0.a.f(this.z1, getThemedColor((this.Y2 == 0 && this.a3 == 0) ? org.telegram.ui.ActionBar.j6.t8 : org.telegram.ui.ActionBar.j6.N8), getThemedColor(org.telegram.ui.ActionBar.j6.z8)), false);
    }

    public final void o4(boolean z10) {
        if (this.H3.c()) {
            z10 = true;
        }
        if (z10 && this.d2) {
            return;
        }
        this.V3 = z10;
        l5(true);
        if (z10) {
            hi.l3 l3Var = this.q0;
            if (l3Var != null) {
                l3Var.f(true);
            }
            hi.l3 l3Var2 = this.r0;
            if (l3Var2 != null) {
                l3Var2.f(true);
            }
        }
    }

    public final void o5() {
        org.telegram.ui.Components.to0 to0Var;
        kv kvVar = this.D1;
        ArrayList arrayList = this.K2;
        if (kvVar == null) {
            if (this.T0 == 10) {
                o4(arrayList.isEmpty());
                return;
            }
            return;
        }
        this.n.a(!arrayList.isEmpty(), true);
        p5();
        if (arrayList.isEmpty()) {
            String M0 = org.telegram.messenger.hd.M0((this.T0 == 3 && this.h2 == null) ? 2131750575 : 2131745669, null);
            if (this.R3 == arrayList.isEmpty()) {
                this.actionBar.setTitle(M0);
            } else {
                this.actionBar.N(M0, true, 350L, org.telegram.ui.Components.er.h);
            }
            if (this.D1.getTag() != null) {
                this.D1.z0(false, false, false);
                this.D1.S();
                this.D1.setTag(null);
                this.fragmentView.requestLayout();
            }
        } else {
            if (this.D1.getTag() == null) {
                if (!m4() && this.G2 == null) {
                    this.D1.setFieldText("");
                }
                this.D1.setTag(1);
                if (!this.X3 && (to0Var = this.I2) != null) {
                    this.X3 = true;
                    String M02 = org.telegram.messenger.hd.M0(2131745429, null);
                    to0Var.j();
                    to0Var.G = M02;
                    hi.k1 k1Var = to0Var.a[0];
                    if (M02 != null) {
                        ((org.telegram.ui.ActionBar.j5) k1Var.f).l(M02, false);
                    }
                    org.telegram.ui.Components.wa0 wa0Var = new org.telegram.ui.Components.wa0(to0Var, 29);
                    to0Var.H = wa0Var;
                    org.telegram.messenger.g0.i3(wa0Var, 1000L);
                }
            }
            this.E1.e(Math.max(1, arrayList.size()), true);
            int i7 = this.U0 + (!TextUtils.isEmpty(this.D1.getFieldText()) ? 1 : 0);
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
            this.E1.i(i7, j3, true);
            this.D1.l2();
            if (this.R3 == arrayList.isEmpty()) {
                this.actionBar.setTitle(org.telegram.messenger.hd.G(arrayList.size(), "Recipient", new Object[0]));
            } else {
                this.actionBar.N(org.telegram.messenger.hd.G(arrayList.size(), "Recipient", new Object[0]), false, 350L, org.telegram.ui.Components.er.h);
            }
        }
        this.R3 = arrayList.isEmpty();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else if (!this.H3.c() || !this.H3.getFragment().onBackPressed(z10)) {
            org.telegram.ui.Components.m60 m60Var = this.M0;
            if (m60Var == null) {
                ow owVar = this.A0;
                if (owVar == null || !owVar.n) {
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar == null || !kVar.x()) {
                        if (!this.b.f) {
                            ow owVar2 = this.A0;
                            if (owVar2 != null && owVar2.getVisibility() == 0 && !this.j3) {
                                ow owVar3 = this.A0;
                                if (!owVar3.P && !this.o3) {
                                    ArrayList arrayList = owVar3.h;
                                    if (!arrayList.isEmpty() && owVar3.M != ((org.telegram.ui.Components.fz) arrayList.get(0)).a) {
                                        if (z10) {
                                            ow owVar4 = this.A0;
                                            ArrayList arrayList2 = owVar4.h;
                                            if (!arrayList2.isEmpty()) {
                                                owVar4.f((org.telegram.ui.Components.fz) arrayList2.get(0), 0);
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                            kv kvVar = this.D1;
                            if (kvVar == null || !kvVar.G0()) {
                                qv qvVar = this.F0;
                                if (qvVar.P != 0 || qvVar.T.L0() == 0) {
                                    return super.onBackPressed(z10);
                                }
                                qvVar.h.y0(0);
                                return false;
                            }
                            if (z10) {
                                this.D1.y0(true);
                            }
                        } else if (z10) {
                            this.Y.r.getText().clear();
                            this.Z.b(false);
                            this.Y.r.clearFocus();
                            return false;
                        }
                    } else if (z10) {
                        hw hwVar = this.D0;
                        if (hwVar != null && hwVar.getVisibility() == 0) {
                            this.D0.Q(false);
                        }
                        n4(true);
                        return false;
                    }
                } else if (z10) {
                    owVar.setIsEditing(false);
                    U4(false);
                    return false;
                }
            } else if (z10) {
                m60Var.u();
                this.M0 = null;
                return false;
            }
        } else if (z10) {
            this.H3.a();
            hw hwVar2 = this.D0;
            if (hwVar2 != null) {
                hwVar2.R();
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onBecomeFullyHidden() {
        rv rvVar;
        ow owVar;
        if (this.X1) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.n(true);
            }
            TLObject tLObject = this.Z1;
            if (tLObject != null) {
                hw hwVar = this.D0;
                if (hwVar != null) {
                    hwVar.e0.Q(this.Y1, tLObject);
                }
                this.Z1 = null;
            }
            this.X1 = false;
        }
        if (!this.L && (owVar = this.A0) != null && owVar.getVisibility() == 0 && this.r.f) {
            int i7 = (int) (-this.O);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (i7 != 0 && i7 != currentActionBarHeight && i7 >= currentActionBarHeight / 2) {
                this.f0[0].a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.z0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        if (!isInPreviewMode() && (rvVar = this.L0) != null && rvVar.getVisibility() == 0) {
            this.L0.setVisibility(8);
            this.L0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        N3();
        this.s0 = true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onBecomeFullyVisible() {
        hi.l3 l3Var;
        super.onBecomeFullyVisible();
        if (q4()) {
            SharedPreferences e12 = org.telegram.messenger.np.e1();
            boolean z10 = e12.getBoolean("archivehint", true);
            boolean isEmpty = d4(this.currentAccount, this.T0, this.Y2, false).isEmpty();
            if (z10 && isEmpty) {
                org.telegram.messenger.np.e1().edit().putBoolean("archivehint", false).commit();
                z10 = false;
            }
            if (z10) {
                e12.edit().putBoolean("archivehint", false).commit();
                S4();
            }
        }
        if (this.s0 && !this.t0 && (l3Var = this.q0) != null && this.P3) {
            this.t0 = true;
            this.s0 = false;
            l3Var.w();
        }
        org.telegram.messenger.g0.i3(new eu(this, 20), 200L);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.m60 m60Var = this.M0;
        if (m60Var != null) {
            m60Var.u();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.t1 t1Var;
        super.onDialogDismiss(dialog);
        if (this.Y2 == 0 && this.a3 == 0 && (t1Var = this.V1) != null && dialog == t1Var && getParentActivity() != null) {
            u3(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.n2 = bundle.getBoolean("onlySelect", false);
            this.o2 = this.arguments.getBoolean("canSelectTopics", false);
            this.s2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.T0 = this.arguments.getInt("dialogsType", 0);
            this.P0 = this.arguments.getBoolean("quote", false);
            this.O0 = this.arguments.getBoolean("reply_to", false);
            this.Q0 = this.arguments.getLong("reply_to_author", 0L);
            this.R0 = this.arguments.getLong("reply_to_channel_direct", 0L);
            this.S0 = this.arguments.getLong("forward_into_channel", 0L);
            this.h2 = this.arguments.getString("selectAlertString");
            this.i2 = this.arguments.getString("selectAlertStringGroup");
            this.j2 = this.arguments.getString("addToGroupAlertString");
            this.t2 = this.arguments.getBoolean("allowSwitchAccount");
            this.u2 = this.arguments.getBoolean("checkCanWrite", true);
            this.v2 = this.arguments.getBoolean("afterSignup", false);
            this.Y2 = this.arguments.getInt("folderId", 0);
            long j3 = this.arguments.getLong("community_id", 0L);
            this.a3 = j3;
            if (j3 != 0) {
                this.b3 = getMessagesController().M0(Long.valueOf(this.a3));
                this.c3 = getMessagesController().N0(this.a3);
            }
            this.k2 = this.arguments.getBoolean("resetDelegate", true);
            this.U0 = this.arguments.getInt("messagesCount", 0);
            this.V0 = this.arguments.getInt("hasPoll", 0);
            this.W0 = this.arguments.getBoolean("hasInvoice", false);
            this.w2 = this.arguments.getBoolean("showSetPasswordConfirm", this.w2);
            this.arguments.getInt("otherwiseRelogin");
            this.x2 = this.arguments.getBoolean("allowGroups", true);
            this.y2 = this.arguments.getBoolean("allowMegagroups", true);
            this.z2 = this.arguments.getBoolean("allowLegacyGroups", true);
            this.A2 = this.arguments.getBoolean("allowChannels", true);
            this.B2 = this.arguments.getBoolean("allowUsers", true);
            this.C2 = this.arguments.getBoolean("allowBots", true);
            this.D2 = this.arguments.getBoolean("closeFragment", true);
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
        if (this.T0 == 0) {
            this.W1 = org.telegram.messenger.np.f1().getBoolean("askAboutContacts", true);
            org.telegram.messenger.gz.u();
        }
        org.telegram.messenger.ns notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        this.L3 = new xi.e(notificationCenter, this);
        if (this.p2 == null) {
            this.f2 = getConnectionsManager().getConnectionState();
            this.L3.f(org.telegram.messenger.ns.i4);
            if (!this.n2) {
                this.L3.f(org.telegram.messenger.ns.I4);
                this.L3.f(org.telegram.messenger.ns.A4);
                this.L3.c(org.telegram.messenger.ns.P2);
                this.L3.c(org.telegram.messenger.ns.d2);
            }
            xi.e eVar = this.L3;
            eVar.c(org.telegram.messenger.ns.s);
            eVar.c(org.telegram.messenger.ns.O2);
            eVar.c(org.telegram.messenger.ns.r);
            eVar.c(org.telegram.messenger.ns.Y);
            eVar.c(org.telegram.messenger.ns.O);
            eVar.c(org.telegram.messenger.ns.I2);
            eVar.c(org.telegram.messenger.ns.h0);
            eVar.c(org.telegram.messenger.ns.f0);
            eVar.c(org.telegram.messenger.ns.J);
            eVar.c(org.telegram.messenger.ns.K);
            eVar.c(org.telegram.messenger.ns.M);
            eVar.c(org.telegram.messenger.ns.P0);
            eVar.c(org.telegram.messenger.ns.s0);
            eVar.c(org.telegram.messenger.ns.q5);
            eVar.c(org.telegram.messenger.ns.S0);
            eVar.c(org.telegram.messenger.ns.T1);
            eVar.c(org.telegram.messenger.ns.b5);
            eVar.c(org.telegram.messenger.ns.K2);
            eVar.c(org.telegram.messenger.ns.d0);
            eVar.c(org.telegram.messenger.ns.s1);
            eVar.c(org.telegram.messenger.ns.Y4);
            eVar.c(org.telegram.messenger.ns.Z4);
            eVar.c(org.telegram.messenger.ns.N);
            eVar.c(org.telegram.messenger.ns.m5);
            eVar.c(org.telegram.messenger.ns.f5);
            this.L3.f(org.telegram.messenger.ns.n0);
        }
        xi.e eVar2 = this.L3;
        eVar2.c(org.telegram.messenger.ns.w);
        eVar2.c(org.telegram.messenger.ns.S4);
        eVar2.c(org.telegram.messenger.ns.a5);
        eVar2.c(org.telegram.messenger.ns.T);
        eVar2.c(org.telegram.messenger.ns.L4);
        eVar2.c(org.telegram.messenger.ns.t5);
        eVar2.c(org.telegram.messenger.ns.v5);
        eVar2.c(org.telegram.messenger.ns.Z2);
        eVar2.c(org.telegram.messenger.ns.d3);
        eVar2.c(org.telegram.messenger.ns.g5);
        eVar2.c(org.telegram.messenger.ns.y3);
        eVar2.c(org.telegram.messenger.ns.A3);
        eVar2.c(org.telegram.messenger.ns.S5);
        eVar2.c(org.telegram.messenger.ns.T5);
        eVar2.c(org.telegram.messenger.ns.P3);
        eVar2.c(org.telegram.messenger.ns.Q3);
        if (this.T0 == 0) {
            this.L3.c(org.telegram.messenger.ns.z5);
            this.L3.c(org.telegram.messenger.ns.P1);
        }
        u4(getAccountInstance());
        fi.s6 P1 = getMessagesController().P1();
        if (!P1.A) {
            P1.W();
            if (!P1.s) {
                ConnectionsManager.getInstance(P1.a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new fi.p5(P1, r3));
            }
        }
        getMessagesController().b3(this.Y2);
        if (this.S3 != null && !getMessagesStorage().R) {
            pt ptVar = this.S3;
            if (ptVar.getParent() != null) {
                ((ViewGroup) ptVar.getParent()).removeView(ptVar);
            }
            this.S3 = null;
        }
        if (q4()) {
            fi.s6 P12 = getMessagesController().P1();
            if (P12.z) {
                P12.T(true);
            }
        } else {
            getMessagesController().P1().W();
        }
        getContactsController().B();
        if (getMessagesController().p6) {
            org.telegram.messenger.tv G1 = getMessagesController().G1();
            if (!G1.e) {
                G1.g(true);
            }
        }
        if (this.a3 != 0) {
            getMessagesController().V2(0, this.a3, true);
        }
        org.telegram.messenger.v1 a10 = org.telegram.messenger.v1.a(this.currentAccount);
        if (!a10.e) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = a10.b;
            boolean z10 = j10 == 0;
            if (!z10) {
                long j11 = currentTimeMillis - j10;
                boolean z11 = org.telegram.messenger.r2.a;
                z10 = j11 > ((long) 43200000);
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
        this.j4 = this.X ? org.telegram.messenger.g0.L(72.0f) : 0;
        this.k4 = this.X ? org.telegram.messenger.g0.L(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        xi.e eVar = this.L3;
        if (eVar != null) {
            eVar.b();
            this.L3 = null;
        }
        kv kvVar = this.D1;
        if (kvVar != null) {
            kvVar.Q0();
        }
        org.telegram.ui.Components.to0 to0Var = this.I2;
        if (to0Var != null) {
            to0Var.j();
        }
        org.telegram.ui.Components.voip.u uVar = this.J2;
        if (uVar != null) {
            org.telegram.messenger.g0.r(uVar);
            this.J2 = null;
        }
        UndoView undoView = this.z0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.r3.e();
        this.E2 = null;
        int i7 = org.telegram.ui.Components.h10.m1;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onPanTranslationUpdate(float f10) {
        if (this.f0 == null) {
            return;
        }
        this.K0 = f10;
        kv kvVar = this.D1;
        int i7 = 0;
        if (kvVar == null || !kvVar.G0()) {
            while (true) {
                xw[] xwVarArr = this.f0;
                if (i7 >= xwVarArr.length) {
                    break;
                }
                xwVarArr[i7].setTranslationY(f10);
                i7++;
            }
            if (!this.n2) {
                this.actionBar.setTranslationY(f10);
                org.telegram.ui.Components.xb xbVar = this.q3;
                if (xbVar != null) {
                    xbVar.l();
                }
            }
            hw hwVar = this.D0;
            if (hwVar != null) {
                hwVar.setTranslationY(this.K0 + this.J0);
                return;
            }
            return;
        }
        this.fragmentView.setTranslationY(f10);
        while (true) {
            xw[] xwVarArr2 = this.f0;
            if (i7 >= xwVarArr2.length) {
                break;
            }
            xwVarArr2[i7].setTranslationY(0.0f);
            i7++;
        }
        if (!this.n2) {
            this.actionBar.setTranslationY(0.0f);
            org.telegram.ui.Components.xb xbVar2 = this.q3;
            if (xbVar2 != null) {
                xbVar2.l();
            }
        }
        hw hwVar2 = this.D0;
        if (hwVar2 != null) {
            hwVar2.setTranslationY(this.J0);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.xb xbVar = this.T;
        if (xbVar != null) {
            xbVar.b();
            this.T = null;
        }
        uv uvVar = this.H3;
        if (uvVar != null) {
            uvVar.r = true;
            bw bwVar = uvVar.a;
            if (bwVar != null) {
                bwVar.onPause();
            }
        }
        org.telegram.ui.Components.m60 m60Var = this.M0;
        if (m60Var != null) {
            m60Var.u();
        }
        kv kvVar = this.D1;
        if (kvVar != null) {
            kvVar.S0();
        }
        int i7 = 0;
        UndoView undoView = this.z0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        setBulletinDelegate(null);
        if (this.f0 == null) {
            return;
        }
        while (true) {
            xw[] xwVarArr = this.f0;
            if (i7 >= xwVarArr.length) {
                return;
            }
            xwVarArr[i7].d.getClass();
            i7++;
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        org.telegram.messenger.b9 b9Var;
        if (i7 != 1) {
            if (i7 == 4) {
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
                            org.telegram.messenger.at.t(this.currentAccount).Y();
                            break;
                        } else {
                            fh0.I0();
                            break;
                        }
                    case "android.permission.WRITE_EXTERNAL_STORAGE":
                        if (iArr[i11] == 0) {
                            org.telegram.messenger.fc.D().i(null);
                            break;
                        } else {
                            break;
                        }
                    case "android.permission.READ_CONTACTS":
                        if (iArr[i11] == 0) {
                            org.telegram.messenger.g0.h3(new eu(this, 19));
                            getContactsController().l();
                            break;
                        } else {
                            SharedPreferences.Editor edit = org.telegram.messenger.np.f1().edit();
                            this.W1 = false;
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

    @Override // org.telegram.ui.ActionBar.e2
    public final void onResume() {
        xw xwVar;
        hv hvVar;
        org.telegram.ui.Components.cm0 cm0Var;
        rv rvVar;
        super.onResume();
        qv qvVar = this.F0;
        if (qvVar != null) {
            ArrayList arrayList = qvVar.y;
            fi.s6 s6Var = qvVar.s;
            s6Var.l(s6Var.g);
            s6Var.l(s6Var.h);
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                TL_stories.PeerStories y10 = s6Var.y(((fi.n) arrayList.get(i7)).c);
                if (y10 != null) {
                    s6Var.a0(y10);
                }
            }
        }
        uv uvVar = this.H3;
        if (uvVar != null) {
            uvVar.r = false;
            bw bwVar = uvVar.a;
            if (bwVar != null) {
                bwVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (rvVar = this.L0) != null && rvVar.getVisibility() == 0) {
            this.L0.setVisibility(8);
            this.L0.setBackground(null);
        }
        if (this.f0 != null) {
            int i10 = 0;
            while (true) {
                xw[] xwVarArr = this.f0;
                if (i10 >= xwVarArr.length) {
                    break;
                }
                xwVarArr[i10].d.f();
                i10++;
            }
        }
        kv kvVar = this.D1;
        if (kvVar != null) {
            kvVar.T0();
        }
        int i11 = 4;
        long j3 = 0;
        if (!this.n2 && this.Y2 == 0 && this.a3 == 0) {
            getMediaDataController().B(4);
        }
        hw hwVar = this.D0;
        if (hwVar != null && (cm0Var = hwVar.e0) != null) {
            cm0Var.f();
        }
        boolean z10 = this.v2 || getUserConfig().a0 == null;
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z10 && this.Y2 == 0 && this.a3 == 0 && this.e2 && !this.n2) {
            int i12 = Build.VERSION.SDK_INT;
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.e2 = false;
                boolean z11 = parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0;
                boolean z12 = (i12 <= 28 || org.telegram.messenger.r2.b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0;
                boolean z13 = i12 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0;
                org.telegram.messenger.i4 i4Var = new org.telegram.messenger.i4(this, z13, z11, z12, parentActivity);
                if (this.v2 && (z11 || z13)) {
                    j3 = 4000;
                }
                org.telegram.messenger.g0.i3(i4Var, j3);
            }
        } else if (!this.n2 && this.Y2 == 0 && this.a3 == 0 && org.telegram.messenger.b6.i() && !org.telegram.messenger.b6.g()) {
            if (getParentActivity() == null) {
                return;
            }
            if (!org.telegram.messenger.np.f1().getBoolean("askedAboutMiuiLockscreen", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                int i13 = org.telegram.ui.ActionBar.j6.L5;
                alertDialog$Builder.m(R.raw.permission_request_apk, 72, getThemedColor(i13), null);
                alertDialog$Builder.n(i13, getResourceProvider());
                String M0 = org.telegram.messenger.hd.M0(2131747298, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.U = M0;
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747300, null), new hu(this, 10));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751772, null), new org.telegram.ui.Components.rb0(23));
                showDialog(t1Var);
            }
        } else if (this.Y2 == 0 && this.a3 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
            if (getParentActivity() == null) {
                return;
            }
            if (!org.telegram.messenger.np.f1().getBoolean("askedAboutFSILockscreen", false)) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                int i14 = org.telegram.ui.ActionBar.j6.L5;
                alertDialog$Builder2.m(R.raw.permission_request_apk, 72, getThemedColor(i14), null);
                alertDialog$Builder2.n(i14, getResourceProvider());
                String M02 = org.telegram.messenger.hd.M0(2131747314, null);
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                t1Var2.U = M02;
                alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131747300, null), new hu(this, 11));
                alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131751772, null), new org.telegram.ui.Components.rb0(24));
                showDialog(t1Var2);
            }
        }
        V4();
        if (this.f0 != null) {
            int i15 = 0;
            while (true) {
                xw[] xwVarArr2 = this.f0;
                if (i15 >= xwVarArr2.length) {
                    break;
                }
                xw xwVar2 = xwVarArr2[i15];
                if (xwVar2.s == 0 && xwVar2.w == 2 && xwVar2.c.L0() == 0 && l4()) {
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
        setBulletinDelegate(new y8(this, i11));
        if (this.s3) {
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        }
        u5(0, false);
        m5(false, true);
        t5(false);
        D3();
        N3();
        if (this.A0 == null || (xwVar = this.f0[0]) == null || (hvVar = xwVar.d) == null) {
            return;
        }
        int i16 = hvVar.h;
        if (i16 == 7 || i16 == 8) {
            org.telegram.messenger.so soVar = getMessagesController().N[i16 != 7 ? (char) 1 : (char) 0];
            if (soVar != null) {
                this.A0.h(soVar.o);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onSlideProgress(boolean z10, float f10) {
        if (org.telegram.messenger.gz.o() <= 0) {
            boolean z11 = org.telegram.messenger.r2.a;
        } else if (this.a4 && this.b4 == null) {
            R4(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.h1.setColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            y3();
            h5();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        rv rvVar;
        yw ywVar;
        uv uvVar = this.H3;
        if (uvVar == null || !uvVar.c()) {
            if (z10 && (rvVar = this.L0) != null && rvVar.getVisibility() == 0) {
                this.L0.setVisibility(8);
                this.L0.setBackground(null);
            }
            if (z10 && this.v2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).w0.c(false);
                }
            }
        } else {
            this.H3.getFragment().onTransitionAnimationEnd(z10, z11);
        }
        if (!z10 && (ywVar = this.Z2) != null) {
            ywVar.removeSelfFromStack();
        }
        N3();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        uv uvVar = this.H3;
        if (uvVar == null || !uvVar.c()) {
            rv rvVar = this.L0;
            if (rvVar != null && rvVar.getVisibility() == 0) {
                if (z10) {
                    this.L0.setAlpha(1.0f - f10);
                } else {
                    this.L0.setAlpha(f10);
                }
            }
        } else {
            this.H3.getFragment().onTransitionAnimationProgress(z10, f10);
        }
        N3();
    }

    public final void p5() {
        org.telegram.ui.Components.to0 to0Var = this.I2;
        if (to0Var == null) {
            return;
        }
        int i7 = this.currentAccount;
        to0Var.h(i7);
        to0Var.d = org.telegram.messenger.m10.i(org.telegram.messenger.c.a(i7).a).e();
        ArrayList arrayList = to0Var.f;
        arrayList.clear();
        ArrayList arrayList2 = this.K2;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        hi.k1 k1Var = to0Var.a[0];
        if (to0Var.b == 1) {
            ((org.telegram.ui.ActionBar.j5) k1Var.e).l(to0Var.c(k1Var), false);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.a4 = true;
            N4(true);
        } else {
            this.b4 = null;
            this.a4 = false;
            N4(false);
            R4(1.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean presentFragment(org.telegram.ui.ActionBar.e2 e2Var) {
        boolean presentFragment = super.presentFragment(e2Var);
        if (presentFragment && this.f0 != null) {
            int i7 = 0;
            while (true) {
                xw[] xwVarArr = this.f0;
                if (i7 >= xwVarArr.length) {
                    break;
                }
                xwVarArr[i7].d.getClass();
                i7++;
            }
        }
        hi.l3 l3Var = this.q0;
        if (l3Var != null) {
            l3Var.f(true);
        }
        hi.l3 l3Var2 = this.r0;
        if (l3Var2 != null) {
            l3Var2.f(true);
        }
        org.telegram.ui.Components.xb.e();
        return presentFragment;
    }

    public final boolean q4() {
        return this.Y2 == 1;
    }

    public final void q5(boolean z10) {
        boolean z11;
        if (this.m0 == null) {
            return;
        }
        ArrayList arrayList = getDownloadController().H;
        int size = arrayList.size();
        boolean z12 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                z11 = false;
                break;
            }
            Object obj = arrayList.get(i7);
            i7++;
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
            if (gjVar.F0() != null && gjVar.F0().size >= 157286400) {
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
            org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) obj2;
            if (gjVar2.F0() != null && gjVar2.F0().size >= 157286400) {
                z11 = true;
                break;
            }
        }
        if (!getUserConfig().q() && !getMessagesController().D3() && z11 && z10) {
            z12 = true;
        }
        this.d.a(z12, true);
    }

    public final boolean r4(long j3) {
        if (j3 < 0) {
            return false;
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j3));
        if (!org.telegram.messenger.q10.u(a22)) {
            return false;
        }
        ArrayList l10 = org.telegram.messenger.np.s1(this.currentAccount).r7.l(-a22.id);
        return (l10 == null || l10.isEmpty()) && org.telegram.messenger.np.s1(this.currentAccount).r7.e(-a22.id);
    }

    public final void r5(TLRPC.User user, boolean z10) {
        org.telegram.ui.Components.e5 e5Var;
        qv qvVar = this.F0;
        org.telegram.ui.Components.e5 e5Var2 = null;
        if (qvVar != null && (e5Var = qvVar.b0) != null && qvVar.r0 != null) {
            Long h = org.telegram.messenger.q10.h(user);
            if (h != null) {
                boolean z11 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                e5Var.j(h.longValue(), z10);
                e5Var.m(z11, z10);
            } else {
                if (user != null) {
                    org.telegram.messenger.np.s1(qvVar.f);
                    if (org.telegram.messenger.np.B2(user)) {
                        if (qvVar.O0 == null) {
                            qvVar.O0 = qvVar.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                            qvVar.O0 = new fi.h(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), qvVar.O0);
                        }
                        Drawable drawable = qvVar.O0;
                        int i7 = org.telegram.ui.ActionBar.j6.qi;
                        yw ywVar = qvVar.f0;
                        org.telegram.ui.ActionBar.q6.x(qvVar, drawable, i7, ywVar != null ? ywVar.getResourceProvider() : null, PorterDuff.Mode.MULTIPLY);
                        e5Var.g(qvVar.O0, z10);
                        e5Var.m(false, z10);
                    }
                }
                e5Var.g(null, z10);
                e5Var.m(false, z10);
            }
            e5Var.k(Integer.valueOf(qvVar.f(org.telegram.ui.ActionBar.j6.qi)));
            qvVar.a0.invalidate();
        }
        if (this.F3 == null || this.actionBar == null) {
            return;
        }
        Long h7 = org.telegram.messenger.q10.h(user);
        this.D3 = null;
        if (h7 != null) {
            boolean z12 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
            this.F3.j(h7.longValue(), z10);
            this.F3.m(z12, z10);
            if (z12) {
                this.D3 = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
            }
            this.actionBar.setRightDrawableOnClick(new gu(this, 1));
            n11.t(this.currentAccount);
        } else {
            if (user != null) {
                org.telegram.messenger.np.s1(this.currentAccount);
                if (org.telegram.messenger.np.B2(user)) {
                    if (this.M3 == null) {
                        this.M3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                        this.M3 = new fw(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), this.M3);
                    }
                    Drawable drawable2 = this.M3;
                    int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.qi);
                    this.y4 = themedColor;
                    drawable2.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                    this.F3.g(this.M3, z10);
                    this.F3.m(false, z10);
                    this.actionBar.setRightDrawableOnClick(new gu(this, 2));
                    n11.t(this.currentAccount);
                }
            }
            this.F3.g(null, z10);
            this.F3.m(false, z10);
            this.actionBar.setRightDrawableOnClick(null);
        }
        org.telegram.ui.Components.e5 e5Var3 = this.F3;
        int i10 = org.telegram.ui.ActionBar.j6.qi;
        e5Var3.k(Integer.valueOf(getThemedColor(i10)));
        org.telegram.ui.Cells.o oVar = this.G3;
        if (oVar != null) {
            oVar.setColor(getThemedColor(i10));
        }
        wv wvVar = this.N0;
        if (wvVar == null || !(wvVar.getContentView() instanceof n11)) {
            return;
        }
        org.telegram.ui.ActionBar.j5 titleTextView = this.actionBar.getTitleTextView();
        n11 n11Var = (n11) this.N0.getContentView();
        if (titleTextView != null) {
            Drawable rightDrawable = titleTextView.getRightDrawable();
            org.telegram.ui.Components.e5 e5Var4 = this.F3;
            if (rightDrawable == e5Var4) {
                e5Var2 = e5Var4;
            }
        }
        n11Var.y(e5Var2, titleTextView);
    }

    public final boolean s3(long j3, View view) {
        if (this.n2 && getMessagesController().t2(j3)) {
            return false;
        }
        Long valueOf = Long.valueOf(j3);
        ArrayList arrayList = this.K2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j3));
            if (view instanceof org.telegram.ui.Cells.t2) {
                ((org.telegram.ui.Cells.t2) view).e0(false, true);
            } else if (view instanceof org.telegram.ui.Cells.f6) {
                ((org.telegram.ui.Cells.f6) view).w(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j3));
        if (view instanceof org.telegram.ui.Cells.t2) {
            ((org.telegram.ui.Cells.t2) view).e0(true, true);
        } else if (view instanceof org.telegram.ui.Cells.f6) {
            ((org.telegram.ui.Cells.f6) view).w(true, true);
        }
        return true;
    }

    public final boolean s4(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return false;
        }
        int i7 = this.f0[0].s;
        org.telegram.messenger.so soVar = null;
        if ((i7 == 7 || i7 == 8) && (!this.actionBar.x() || this.actionBar.y(null))) {
            soVar = getMessagesController().N[this.f0[0].s == 8 ? (char) 1 : (char) 0];
        }
        return soVar != null ? soVar.j.indexOfKey(dialog.id) >= 0 : dialog.pinned;
    }

    public final void s5() {
        hi.l3 l3Var;
        boolean X4 = getMessagesController().X4();
        if (this.P3 != X4) {
            k5();
            if (!this.P3 && X4 && (l3Var = this.q0) != null) {
                l3Var.w();
            }
            this.P3 = X4;
        }
        org.telegram.ui.Components.t00 t00Var = this.u0;
        if (t00Var == null) {
            return;
        }
        if (this.T0 == 10) {
            t00Var.setImageResource(R.drawable.floating_check);
            this.u0.setContentDescription(org.telegram.messenger.hd.M0(2131751354, null));
        } else {
            t00Var.setImageResource(R.drawable.filled_fab_compose_32);
            this.u0.setContentDescription(org.telegram.messenger.hd.M0(2131748270, null));
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void setInPreviewMode(boolean z10) {
        super.setInPreviewMode(z10);
        qv qvVar = this.F0;
        if (qvVar != null) {
            if (!this.H0 || z10) {
                qvVar.setVisibility(8);
            } else {
                qvVar.setVisibility(0);
            }
        }
        l5(true);
        g5();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r2 == r3) goto L14;
     */
    @Override // org.telegram.ui.ActionBar.e2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTitleOverlayText(String str, int i7, Runnable runnable) {
        wv wvVar;
        org.telegram.ui.Components.e5 e5Var;
        super.setTitleOverlayText(str, i7, runnable);
        if (this.actionBar != null && (wvVar = this.N0) != null && (wvVar.getContentView() instanceof n11)) {
            org.telegram.ui.ActionBar.j5 titleTextView = this.actionBar.getTitleTextView();
            n11 n11Var = (n11) this.N0.getContentView();
            if (titleTextView != null) {
                Drawable rightDrawable = titleTextView.getRightDrawable();
                e5Var = this.F3;
            }
            e5Var = null;
            n11Var.y(e5Var, titleTextView);
        }
        qv qvVar = this.F0;
        if (qvVar != null) {
            org.telegram.ui.Components.h6 h6Var = qvVar.U;
            qvVar.V.b(i7 == 2131751805 ? org.telegram.messenger.g0.I2(org.telegram.messenger.hd.M0(2131744113, null), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(2.0f)) : null, true);
            if (str != null) {
                qvVar.h0 = true;
                if (qvVar.i0 != i7) {
                    qvVar.i0 = i7;
                    h6Var.c(org.telegram.messenger.hd.M0(i7, str), !org.telegram.messenger.hd.a0, true);
                }
            } else {
                qvVar.h0 = false;
                qvVar.i0 = 0;
                h6Var.c(qvVar.g0, !org.telegram.messenger.hd.a0, true);
            }
            qvVar.a.a(qvVar.h0, true);
            qvVar.M0.x(h6Var);
        }
    }

    public final void t3(jg.o0 o0Var) {
        hw hwVar;
        if (!this.s3 || (hwVar = this.D0) == null) {
            return;
        }
        ArrayList arrayList = hwVar.D0;
        if (!arrayList.isEmpty()) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (o0Var.b((jg.o0) arrayList.get(i7))) {
                    return;
                }
            }
        }
        arrayList.add(o0Var);
        nw nwVar = this.Y;
        nwVar.G.add(o0Var);
        nwVar.J = r1.size() - 1;
        nwVar.e();
        this.Y.r.getText().clear();
        j5(true, null, null, false, true);
    }

    public final boolean t4() {
        return this.E2 == null && this.p2 == null;
    }

    public final void t5(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z11;
        fi.s6 j42;
        ArrayList arrayList;
        if (this.F0 == null || this.J != null) {
            return;
        }
        uv uvVar = this.H3;
        if ((uvVar != null && uvVar.c()) || this.s3 || (kVar = this.actionBar) == null || kVar.x() || this.n2) {
            return;
        }
        hi.sa saVar = hi.sa.G2;
        int i7 = 0;
        if ((saVar != null && saVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().K0)) {
            z10 = false;
        }
        int i10 = 1;
        boolean z12 = !q4() && j4().I();
        if (this.a3 != 0) {
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
                ofFloat.addUpdateListener(new ii(i10, this));
                this.K.addListener(new org.telegram.ui.Cells.w9(this, 26));
                this.K.setDuration(200L);
                this.K.setInterpolator(org.telegram.ui.Components.er.f);
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
            ofFloat2.addUpdateListener(new gw(this, f10, z11, f42));
            this.J.addListener(new aw(this, z11, i11));
            this.J.setDuration(200L);
            this.J.setInterpolator(org.telegram.ui.Components.er.f);
            this.J.start();
            return;
        }
        this.L = z11;
        qv qvVar = this.F0;
        if ((z11 || this.M) && !isInPreviewMode()) {
            i12 = 0;
        }
        qvVar.setVisibility(i12);
        if (z11) {
            this.A3 = -org.telegram.messenger.g0.L(81.0f);
            O4(-f4());
        } else {
            O4(0.0f);
        }
        while (true) {
            xw[] xwVarArr = this.f0;
            if (i7 >= xwVarArr.length) {
                break;
            }
            xw xwVar = xwVarArr[i7];
            if (xwVar != null) {
                xwVar.a.requestLayout();
            }
            i7++;
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
        if (this.Y2 == 0 && this.a3 == 0 && Build.VERSION.SDK_INT >= 33 && fh0.J0(parentActivity)) {
            if (z10) {
                showDialog(new fh0(parentActivity, !c8.ka.a(), new su(parentActivity, 1)));
                return;
            }
            arrayList.add("android.permission.POST_NOTIFICATIONS");
        }
        if (getUserConfig().V && this.W1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z10) {
                org.telegram.ui.ActionBar.t1 t1Var = org.telegram.ui.Components.t4.v(parentActivity, new ku(this, 1)).a;
                this.V1 = t1Var;
                showDialog(t1Var);
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
    public final void u5(int i7, boolean z10) {
        RecyclerView recyclerView;
        int i10;
        int childCount;
        int i11;
        int i12 = 131072;
        if (this.U1) {
            int i13 = org.telegram.messenger.np.D8;
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
                hw hwVar = this.D0;
                recyclerView = hwVar != null ? hwVar.b0 : null;
            } else {
                xw[] xwVarArr = this.f0;
                if (xwVarArr != null) {
                    uw uwVar = i14 < xwVarArr.length ? xwVarArr[i14].a : null;
                    if (uwVar == null || xwVarArr[i14].getVisibility() == 0) {
                        r6 = uwVar != null ? this.f0[i14] : null;
                        recyclerView = uwVar;
                    }
                }
                i10 = i14;
                i14 = i10 + 1;
                i12 = 131072;
            }
            if (recyclerView != null && recyclerView.getAdapter() != null) {
                int i15 = org.telegram.messenger.np.D8;
                if (((i7 & 2048) != 0 || i7 == 0) && r6 != null) {
                    r6.q(false);
                } else {
                    int childCount2 = recyclerView.getChildCount();
                    int i16 = 0;
                    while (i16 < childCount2) {
                        View childAt = recyclerView.getChildAt(i16);
                        boolean z11 = childAt instanceof org.telegram.ui.Cells.t2;
                        ArrayList arrayList = this.K2;
                        if (z11 && (this.D0 == null || recyclerView.getAdapter() != this.D0.e0)) {
                            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) childAt;
                            int i17 = org.telegram.messenger.np.D8;
                            if ((i7 & i12) != 0) {
                                t2Var.c0(this.actionBar.x(), true);
                                if (this.U1) {
                                    i10 = i14;
                                    i16++;
                                    i14 = i10;
                                    i12 = 131072;
                                }
                            }
                            if ((65536 & i7) != 0) {
                                t2Var.e0(false, (i7 & TLObject.FLAG_13) != 0);
                            } else {
                                if ((i7 & 512) == 0) {
                                    i10 = i14;
                                    if (t2Var.k0(i7, z10)) {
                                        r6.q(false);
                                        break;
                                    }
                                } else if (this.f0[i14].p() && org.telegram.messenger.g0.Q1()) {
                                    i10 = i14;
                                    t2Var.setDialogSelected(t2Var.getDialogId() == this.r2.a);
                                } else {
                                    i10 = i14;
                                }
                                if (arrayList != null) {
                                    t2Var.e0(arrayList.contains(Long.valueOf(t2Var.getDialogId())), false);
                                }
                                if (!(childAt instanceof org.telegram.ui.Cells.pa)) {
                                    ((org.telegram.ui.Cells.pa) childAt).i(i7);
                                } else if (childAt instanceof org.telegram.ui.Cells.f6) {
                                    org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) childAt;
                                    f6Var.y(i7);
                                    if (arrayList != null) {
                                        f6Var.w(arrayList.contains(Long.valueOf(f6Var.getDialogId())), false);
                                    }
                                }
                                if (!this.U1 && (childAt instanceof org.telegram.ui.Components.uj0)) {
                                    org.telegram.ui.Components.uj0 uj0Var = (org.telegram.ui.Components.uj0) childAt;
                                    childCount = uj0Var.getChildCount();
                                    for (i11 = 0; i11 < childCount; i11++) {
                                        View childAt2 = uj0Var.getChildAt(i11);
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
                        if (!this.U1) {
                            org.telegram.ui.Components.uj0 uj0Var2 = (org.telegram.ui.Components.uj0) childAt;
                            childCount = uj0Var2.getChildCount();
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
        if (this.D1 == null) {
            return;
        }
        if (this.F2 == null && this.G2 == null && this.H2 == null) {
            return;
        }
        int i7 = 0;
        if (this.I2 == null) {
            org.telegram.ui.Components.to0 to0Var = new org.telegram.ui.Components.to0(getParentActivity(), getResourceProvider());
            this.I2 = to0Var;
            to0Var.setLayoutClickListener(new gu(this, i7));
            this.I2.setOnModeChangeListener(new hu(this, i7));
            kv kvVar = this.D1;
            org.telegram.ui.Components.to0 to0Var2 = this.I2;
            if (to0Var2 == null) {
                kvVar.getClass();
            } else {
                kvVar.o2 = to0Var2;
                kvVar.addView(to0Var2, 0, c8.ja.e(-1, 48, 51));
                kvVar.O3 = false;
                kvVar.Q();
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.I2.getLayoutParams();
            layoutParams.rightMargin = -this.D1.getPaddingRight();
            this.I2.setLayoutParams(layoutParams);
        }
        if (m4()) {
            this.I2.i(this.currentAccount, this.F2);
        } else {
            String str = this.G2;
            if (str != null) {
                org.telegram.ui.Components.to0 to0Var3 = this.I2;
                to0Var3.g(this.currentAccount);
                if (!str.isEmpty()) {
                    to0Var3.e(str, true);
                }
            } else {
                CharSequence charSequence2 = this.H2;
                if (charSequence2 != null) {
                    org.telegram.ui.Components.to0 to0Var4 = this.I2;
                    to0Var4.g(this.currentAccount);
                    if (charSequence2.length() > 0) {
                        to0Var4.e(charSequence2, true);
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.D1.setFieldText(charSequence);
        }
        this.D1.setOverrideHint(org.telegram.messenger.hd.M0(m4() ? 2131754454 : 2131745462, null));
        H3();
        if (this.I2.getMode() != 0) {
            this.D1.Q1(false, false);
        }
        p5();
    }

    public final void v4(long j3) {
        long j10 = j3;
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(j10);
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
        int i10 = this.f0[0].s;
        org.telegram.messenger.so soVar = null;
        if ((i10 == 7 || i10 == 8) && (!this.actionBar.x() || this.actionBar.y(null))) {
            soVar = getMessagesController().N[this.f0[0].s == 8 ? (char) 1 : (char) 0];
        }
        int i11 = -1;
        if (soVar != null) {
            int i12 = soVar.g;
            int i13 = org.telegram.messenger.np.D8;
            if ((i12 & 64) != 0 && !soVar.a(this.currentAccount, dialog)) {
                M4(true, true);
                z3();
                if (this.T1 != null) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= this.T1.size()) {
                            break;
                        }
                        if (((TLRPC.Dialog) this.T1.get(i14)).id == j10) {
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
            org.telegram.messenger.np messagesController = getMessagesController();
            org.telegram.messenger.vr messagesStorage = messagesController.getMessagesStorage();
            org.telegram.messenger.ol olVar = new org.telegram.messenger.ol(messagesController, j10);
            org.telegram.messenger.p5 p5Var = messagesStorage.a;
            org.telegram.messenger.a4 a4Var = new org.telegram.messenger.a4(messagesStorage, j10, olVar, 5);
            j10 = j10;
            p5Var.c(a4Var);
        }
        getMessagesController().o3(j10, 0L);
        org.telegram.messenger.np messagesController2 = getMessagesController();
        int i16 = dialog.top_message;
        messagesController2.j3(j10, i16, i16, dialog.last_message_date, false, 0L, 0, true, 0);
        if (i15 >= 0) {
            this.T1.remove(i15);
            this.f0[0].y.D();
            this.f0[0].q(true);
        }
    }

    public final boolean v5(long j3) {
        TLRPC.Chat M0;
        kv kvVar;
        if ((this.U0 <= 1 && ((kvVar = this.D1) == null || kvVar.getVisibility() != 0 || TextUtils.isEmpty(this.D1.getFieldText()))) || !org.telegram.messenger.m5.z(j3) || (M0 = getMessagesController().M0(Long.valueOf(-j3))) == null || org.telegram.messenger.t3.N(M0) || !M0.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.t4.r0(this, org.telegram.messenger.hd.M0(2131745310, null), org.telegram.messenger.hd.M0(2131745302, null), null);
        return false;
    }

    public final int w3() {
        if (this.D1 != null) {
            return (int) (this.A1.getInputBubbleHeight() + this.w.d() + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(2.0f));
        }
        if (this.a3 == 0) {
            return this.h4 + this.j4;
        }
        return org.telegram.messenger.g0.L(72.0f) + this.h4;
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
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.K2;
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
        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) this.H;
        if (user == null || org.telegram.messenger.q10.z(user) || org.telegram.messenger.q10.x(user)) {
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
        org.telegram.ui.Components.cf0 cf0Var;
        gv gvVar;
        org.telegram.ui.Components.cm0 cm0Var;
        b61 b61Var;
        hw hwVar = this.D0;
        if (hwVar != null && (cm0Var = hwVar.e0) != null && (b61Var = cm0Var.l0) != null) {
            int childCount = b61Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = b61Var.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.o4) {
                    org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) childAt;
                    org.telegram.ui.Components.t8 t8Var = o4Var.c;
                    int i10 = o4Var.h;
                    if (org.telegram.messenger.m5.E(o4Var.f)) {
                        TLRPC.User a22 = org.telegram.messenger.np.s1(i10).a2(Long.valueOf(o4Var.f));
                        o4Var.e = a22;
                        t8Var.r(a22);
                    } else {
                        t8Var.q(org.telegram.messenger.np.s1(i10).M0(Long.valueOf(-o4Var.f)));
                        o4Var.e = null;
                    }
                    o4Var.c(true);
                }
            }
        }
        if (this.f0 != null) {
            int i11 = 0;
            while (true) {
                xw[] xwVarArr = this.f0;
                if (i11 >= xwVarArr.length) {
                    break;
                }
                xw xwVar = xwVarArr[i11];
                if (xwVar != null && (gvVar = xwVar.n) != null) {
                    gvVar.i();
                }
                i11++;
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.I(getThemedColor(org.telegram.ui.ActionBar.j6.G8), true);
            this.actionBar.J(getThemedColor(org.telegram.ui.ActionBar.j6.E8), false, true);
            this.actionBar.J(getThemedColor(org.telegram.ui.ActionBar.j6.F8), true, true);
            this.actionBar.K(getThemedColor(org.telegram.ui.ActionBar.j6.I5), true);
            this.actionBar.updateColors();
        }
        if (this.F3 != null) {
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.qi);
            Drawable drawable = this.M3;
            if (drawable != null && themedColor2 != this.y4) {
                this.y4 = themedColor2;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.Components.e5 e5Var = this.F3;
            if (e5Var != null) {
                e5Var.k(Integer.valueOf(themedColor2));
            }
            org.telegram.ui.Cells.o oVar = this.G3;
            if (oVar != null) {
                oVar.setColor(themedColor2);
            }
        }
        org.telegram.ui.Cells.b3 b3Var = this.O1;
        if (b3Var != null) {
            org.telegram.ui.ActionBar.j6.H1(b3Var.getBackground(), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.i6, false), true);
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.n0;
        if (q0Var != null) {
            q0Var.setIconColor(getThemedColor(org.telegram.ui.ActionBar.j6.v8));
        }
        kv kvVar = this.D1;
        if (kvVar != null) {
            kvVar.updateColors();
        }
        ow owVar = this.A0;
        if (owVar != null) {
            fh.g gVar = owVar.z0;
            if (gVar != null) {
                gVar.updateColors();
            }
            owVar.invalidate();
        }
        jg.q0 q0Var2 = this.c0;
        if (q0Var2 != null) {
            q0Var2.updateColors();
        }
        hw hwVar2 = this.D0;
        if (hwVar2 != null && (cf0Var = hwVar2.s0) != null) {
            cf0Var.c();
        }
        org.telegram.ui.Components.v61 v61Var = this.b0;
        if (v61Var != null) {
            v61Var.updateColors();
        }
        az0 az0Var = this.a0;
        if (az0Var != null) {
            az0Var.updateColors();
        }
        if (this.L0 != null) {
            int o4 = i0.a.o(getThemedColor(org.telegram.ui.ActionBar.j6.d6), 100);
            if (!(this.L0.getForeground() instanceof ColorDrawable)) {
                this.L0.setForeground(new ColorDrawable(o4));
            } else if (((ColorDrawable) this.L0.getForeground()).getColor() != o4) {
                ((ColorDrawable) this.L0.getForeground()).setColor(o4);
            }
        }
        org.telegram.ui.Components.t00 t00Var = this.u0;
        if (t00Var != null) {
            t00Var.updateColors();
        }
        org.telegram.ui.Components.t00 t00Var2 = this.v0;
        if (t00Var2 != null) {
            t00Var2.updateColors();
        }
        int i12 = org.telegram.ui.ActionBar.j6.d6;
        this.o4.a(getThemedColor(i12));
        org.telegram.ui.Components.vr vrVar = this.L1;
        if (vrVar != null) {
            vrVar.updateColors();
        }
        org.telegram.ui.Components.ur urVar = this.M1;
        if (urVar != null) {
            urVar.setColor(org.telegram.ui.ActionBar.j6.x0(null, i12, false));
        }
        iv ivVar = this.J1;
        if (ivVar != null) {
            ivVar.updateColors();
        }
        iv ivVar2 = this.H1;
        if (ivVar2 != null) {
            ivVar2.updateColors();
        }
        n5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        qv qvVar = this.F0;
        if (qvVar != null) {
            qvVar.o();
        }
        if (this.E3 != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.Xl)) != this.x4) {
            this.x4 = themedColor;
            this.E3.setColorFilter(themedColor, PorterDuff.Mode.MULTIPLY);
        }
        nw nwVar = this.Y;
        if (nwVar != null) {
            nwVar.updateColors();
        }
    }

    public final void y4(View view) {
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        int i7 = 1;
        org.telegram.ui.ActionBar.u2 i10 = org.telegram.messenger.i20.i(getParentActivity(), false, 1, null);
        boolean z10 = getMessagesStorage().M != 0;
        int[] iArr = {z10 ? R.drawable.msg_markread : 0, org.telegram.messenger.gz.q1 ? R.drawable.chats_pin : R.drawable.chats_unpin};
        CharSequence[] charSequenceArr = {z10 ? org.telegram.messenger.hd.M0(2131748682, null) : null, org.telegram.messenger.hd.M0(org.telegram.messenger.gz.q1 ? 2131747246 : 2131749324, null)};
        k4 k4Var = new k4(this, i7);
        i10.M = charSequenceArr;
        i10.N = iArr;
        i10.L = k4Var;
        showDialog(i10);
    }

    public final void z3() {
        org.telegram.messenger.g0.i3(new av(this, 0), 300L);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z4(View view, int i7, v4.h0 h0Var) {
        v4.h0 h0Var2;
        long j3;
        boolean z10;
        int i10;
        int i11;
        int i12;
        org.telegram.messenger.gj gjVar;
        long j10;
        long j11;
        org.telegram.ui.Components.cm0 cm0Var;
        uv uvVar;
        long j12;
        long j13;
        int i13;
        org.telegram.messenger.gj gjVar2;
        long F;
        long j14;
        long j15;
        TLRPC.Chat M0;
        boolean z11;
        hw hwVar;
        int i14;
        Object J;
        long j16;
        long j17;
        int i15;
        if (getParentActivity() == null) {
            return;
        }
        boolean z12 = h0Var instanceof jg.m;
        if (z12) {
            jg.m mVar = (jg.m) h0Var;
            int i16 = mVar.h;
            if (i16 == 7 || i16 == 8) {
                org.telegram.messenger.so soVar = getMessagesController().N[i16 == 7 ? (char) 0 : (char) 1];
                if (soVar != null) {
                    i14 = soVar.a;
                    J = mVar.J(i7);
                    if (this.E2 == null && mVar.n && h0Var.d(i7) == 21) {
                        this.E2.P(this);
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
                                presentFragment(new yw(bundle));
                                return;
                            }
                            j16 = dialog.id;
                            if (this.actionBar.y(null)) {
                                Y4(j16, view);
                                return;
                            }
                            h0Var2 = h0Var;
                            i10 = i15;
                            z10 = false;
                            i11 = 0;
                            gjVar = null;
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
                                    showDialog(new org.telegram.ui.Components.bw0(getParentActivity(), this, tL_inputStickerSetID, null, null, null));
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
                                showDialog(new org.telegram.ui.Components.e70(getParentActivity(), chatInvite, str, this, null));
                                return;
                            }
                            TLRPC.Chat chat2 = chatInvite.chat;
                            if (chat2 == null) {
                                return;
                            }
                            j16 = -chat2.id;
                            i15 = 0;
                            i10 = i15;
                            z10 = false;
                            i11 = 0;
                            gjVar = null;
                            i12 = i14;
                            j11 = j16;
                            j10 = 0;
                            j3 = 0;
                        }
                        j16 = -j17;
                    } else {
                        j16 = ((TLRPC.User) J).id;
                    }
                    h0Var2 = h0Var;
                    i15 = 0;
                    i10 = i15;
                    z10 = false;
                    i11 = 0;
                    gjVar = null;
                    i12 = i14;
                    j11 = j16;
                    j10 = 0;
                    j3 = 0;
                }
            }
            i14 = 0;
            J = mVar.J(i7);
            if (this.E2 == null) {
            }
            if (J instanceof TLRPC.User) {
            }
            h0Var2 = h0Var;
            i15 = 0;
            i10 = i15;
            z10 = false;
            i11 = 0;
            gjVar = null;
            i12 = i14;
            j11 = j16;
            j10 = 0;
            j3 = 0;
        } else {
            h0Var2 = h0Var;
            hw hwVar2 = this.D0;
            if (hwVar2 == null || h0Var2 != (cm0Var = hwVar2.e0)) {
                j3 = 0;
                z10 = false;
                i10 = 0;
                i11 = 0;
                i12 = 0;
                gjVar = null;
                j10 = 0;
                j11 = 0;
            } else {
                Object I = cm0Var.I(i7);
                z10 = this.D0.e0.N(i7);
                if (I instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) I;
                    F = user.id;
                    if (!this.n2) {
                        this.Y1 = F;
                        this.Z1 = user;
                    }
                } else if (I instanceof TLRPC.Chat) {
                    TLRPC.Chat chat3 = (TLRPC.Chat) I;
                    F = -chat3.id;
                    if (!this.n2) {
                        this.Y1 = F;
                        this.Z1 = chat3;
                    }
                } else if (I instanceof TLRPC.EncryptedChat) {
                    TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) I;
                    F = org.telegram.messenger.m5.F(encryptedChat.id);
                    if (!this.n2) {
                        this.Y1 = F;
                        this.Z1 = encryptedChat;
                    }
                } else {
                    if (I instanceof org.telegram.messenger.gj) {
                        gjVar2 = (org.telegram.messenger.gj) I;
                        long B0 = org.telegram.messenger.gj.B0(gjVar2.k);
                        int e12 = gjVar2.e1();
                        j3 = 0;
                        j13 = org.telegram.messenger.t3.c0(getMessagesController().M0(Long.valueOf(-B0))) ? org.telegram.messenger.gj.b2(gjVar2.K1, gjVar2.k, true, false) : 0L;
                        hw hwVar3 = this.D0;
                        if (hwVar3 != null) {
                            org.telegram.ui.Components.cm0 cm0Var2 = hwVar3.e0;
                            cm0Var2.k0.a(cm0Var2.a0);
                        }
                        i13 = e12;
                        j12 = B0;
                    } else {
                        j3 = 0;
                        if (I instanceof String) {
                            String str2 = (String) I;
                            hw hwVar4 = this.D0;
                            if (hwVar4 != null && !hwVar4.e0.K.isEmpty()) {
                                this.Y.r.setText(str2);
                                this.Y.r.setSelection(str2.length());
                            } else if (!str2.equals("section")) {
                                bh0 bh0Var = new bh0(getParentActivity(), this);
                                bh0Var.N0(str2, true);
                                bh0Var.show();
                            }
                        } else if (I instanceof org.telegram.messenger.d5) {
                            org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) I;
                            org.telegram.ui.Components.t4.u(this, d5Var.i, d5Var.j, (String) d5Var.e.get(0));
                        } else if ((I instanceof TLRPC.TL_forumTopic) && (uvVar = this.H3) != null && (uvVar.getFragment() instanceof u91)) {
                            j12 = -((u91) this.H3.getFragment()).a;
                            j13 = ((TLRPC.TL_forumTopic) I).id;
                            i13 = 0;
                            gjVar2 = null;
                        }
                        i13 = 0;
                        gjVar2 = null;
                        j13 = 0;
                        j12 = 0;
                    }
                    if (j12 == j3 && this.actionBar.x()) {
                        if (this.actionBar.y("search_dialogs_action_mode") && i13 == 0 && !z10) {
                            Y4(j12, view);
                            return;
                        }
                        return;
                    }
                    j11 = j12;
                    j10 = j13;
                    i12 = 0;
                    i11 = i13;
                    gjVar = gjVar2;
                    i10 = 0;
                }
                i13 = 0;
                gjVar2 = null;
                j12 = F;
                j13 = 0;
                j3 = 0;
                if (j12 == j3) {
                }
                j11 = j12;
                j10 = j13;
                i12 = 0;
                i11 = i13;
                gjVar = gjVar2;
                i10 = 0;
            }
        }
        if (j11 == j3) {
            return;
        }
        if (this.n2) {
            if (v5(j11)) {
                if ((!getMessagesController().t2(j11) && !getMessagesController().p2(j11)) || r4(j11)) {
                    ArrayList arrayList = this.K2;
                    if (!arrayList.isEmpty() || (this.T0 == 3 && this.h2 != null)) {
                        if (arrayList.contains(Long.valueOf(j11)) || A3(j11)) {
                            boolean s32 = s3(j11, view);
                            hw hwVar5 = this.D0;
                            if (hwVar5 != null && h0Var2 == hwVar5.e0) {
                                this.actionBar.n(true);
                                b4(j11, s32);
                            }
                            o5();
                            return;
                        }
                        return;
                    }
                }
                if (this.o2 && getMessagesController().p2(j11)) {
                    Bundle bundle2 = new Bundle(this.arguments);
                    bundle2.putLong("community_id", -j11);
                    yw ywVar = new yw(bundle2);
                    ywVar.Z2 = this;
                    ywVar.E2 = this.E2;
                    presentFragment(ywVar);
                    return;
                }
                if (!this.o2 || ((!getMessagesController().t2(j11) || r4(j11)) && !getMessagesController().z2(j11))) {
                    a4(j11, 0L, true, null);
                    return;
                }
                Bundle bundle3 = new Bundle();
                bundle3.putLong("chat_id", -j11);
                bundle3.putBoolean("for_select", true);
                bundle3.putBoolean("forward_to", true);
                bundle3.putBoolean("bot_share_to", this.T0 == 1);
                bundle3.putBoolean("quote", this.P0);
                bundle3.putBoolean("reply_to", this.O0);
                u91 u91Var = new u91(bundle3);
                u91Var.M0 = this;
                presentFragment(u91Var);
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
        } else if (z10) {
            TLObject tLObject = this.Z1;
            if (tLObject != null) {
                hw hwVar6 = this.D0;
                if (hwVar6 != null) {
                    hwVar6.e0.Q(this.Y1, tLObject);
                }
                this.Z1 = null;
            }
        } else {
            V3();
        }
        boolean z13 = (org.telegram.messenger.hd.a0 || this.l2 || (org.telegram.messenger.g0.Q1() && i10 != 0) || !org.telegram.messenger.qc.e(64) || this.a3 != j3) ? false : true;
        bundle4.putInt("dialog_folder_id", i10);
        bundle4.putInt("dialog_filter_id", i12);
        if (org.telegram.messenger.g0.Q1() && ((!getMessagesController().t2(j11) || !z13) && this.r2.a == j11 && ((hwVar = this.D0) == null || h0Var2 != hwVar.e0))) {
            if (getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) getParentActivity();
                List fragmentStack = launchActivity.r0.getFragmentStack();
                if (fragmentStack.isEmpty()) {
                    return;
                }
                if (fragmentStack.size() == 1 && (r.b.h(1, fragmentStack) instanceof an)) {
                    ((an) r.b.h(1, fragmentStack)).xa();
                    return;
                }
                if (fragmentStack.size() == 2) {
                    launchActivity.r0.l(true, false);
                    return;
                } else {
                    if (getParentActivity() instanceof LaunchActivity) {
                        org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) fragmentStack.get(0);
                        fragmentStack.clear();
                        fragmentStack.add(e2Var);
                        launchActivity.r0.X(true, true);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        hw hwVar7 = this.D0;
        if (hwVar7 != null && hwVar7.B0) {
            hwVar7.Q(false);
        }
        if (j11 == getUserConfig().e() && getMessagesController().p6) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("dialog_id", org.telegram.messenger.m10.i(this.currentAccount).e());
            bundle5.putInt(TeXSymbolParser.TYPE_ATTR, 0);
            bundle5.putInt("start_from", 11);
            if (this.E0 == null) {
                this.E0 = new org.telegram.ui.Components.qs0(this);
            }
            presentFragment(new org.telegram.ui.Components.x80(bundle5, this.E0));
            return;
        }
        if (this.p2 != null) {
            if (getMessagesController().E(bundle4, this, null, null)) {
                getNotificationCenter().k(org.telegram.messenger.ns.t, new Object[0]);
                an anVar = new an(bundle4);
                p4(anVar, gjVar);
                presentFragment(anVar);
                return;
            }
            return;
        }
        this.B3 = true;
        if (getMessagesController().E(bundle4, this, null, null)) {
            TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(-j11));
            TLRPC.Dialog S0 = getMessagesController().S0(j11);
            boolean V = org.telegram.messenger.t3.V(M02);
            boolean z14 = S0 != null && S0.view_forum_as_messages;
            int b10 = (this.a3 == j3 || M02 == null) ? 0 : li.l0.b(this.currentAccount, -M02.id);
            if (b10 == 3) {
                showDialog(new org.telegram.ui.Components.e70(getParentActivity(), M02, null, this, this.resourceProvider));
                return;
            }
            int i17 = 4;
            if (b10 == 4) {
                org.telegram.messenger.k5.n(null, V ? 2131751930 : 2131751927, org.telegram.ui.Components.cc.a0(this), R.raw.e_hand_2, 36);
                return;
            }
            if (M02 == null || !(((z11 = M02.monoforum) || M02.forum) && j14 == j3)) {
                if (org.telegram.messenger.t3.Y(M02)) {
                    Bundle bundle6 = new Bundle();
                    bundle6.putLong("community_id", M02.id);
                    presentFragment(new yw(bundle6));
                    return;
                }
                an anVar2 = new an(bundle4);
                if (j14 != j3) {
                    qg.c.a(anVar2, org.telegram.messenger.ur.a(j11, j14));
                }
                if (z12 && org.telegram.messenger.m5.E(j11) && getMessagesController().R.f(j11) == null) {
                    org.telegram.messenger.si mediaDataController = getMediaDataController();
                    TLRPC.Document document = mediaDataController.z0;
                    mediaDataController.n1();
                    if (document != null) {
                        anVar2.X9 = document;
                        anVar2.Y9 = true;
                    }
                }
                if (org.telegram.messenger.g0.Q1()) {
                    uv uvVar2 = this.H3;
                    if (uvVar2.a != null) {
                        uvVar2.a();
                    }
                }
                p4(anVar2, gjVar);
                presentFragment(anVar2);
                return;
            }
            if (z11) {
                bundle4.putInt("chatMode", 8);
                bundle4.putBoolean("isSubscriberSuggestions", !org.telegram.messenger.t3.A(this.currentAccount, M02, 24));
                an anVar3 = new an(bundle4);
                p4(anVar3, gjVar);
                presentFragment(anVar3);
                return;
            }
            if (org.telegram.messenger.t3.a(M02)) {
                an anVar4 = new an(bundle4);
                qg.c.a(anVar4, org.telegram.messenger.ur.a(-M02.id, getMessagesController().f7.getLong(a8.p0.o(M02.id, "forumlasttopic"), 1L)));
                presentFragment(anVar4);
                return;
            }
            if (!org.telegram.messenger.qc.e(64) || this.a3 != j3) {
                if (!z14) {
                    presentFragment(new u91(bundle4));
                    return;
                }
                an anVar5 = new an(bundle4);
                p4(anVar5, gjVar);
                presentFragment(anVar5);
                return;
            }
            if (!z13) {
                if (!z14) {
                    presentFragment(new u91(bundle4));
                    return;
                }
                an anVar6 = new an(bundle4);
                p4(anVar6, gjVar);
                presentFragment(anVar6);
                return;
            }
            if (this.l2) {
                return;
            }
            if (z14) {
                an anVar7 = new an(bundle4);
                p4(anVar7, gjVar);
                presentFragment(anVar7);
                return;
            }
            uv uvVar3 = this.H3;
            bw bwVar = uvVar3.a;
            if (bwVar == null || (-bwVar.a) != j11) {
                uw uwVar = this.f0[0].a;
                uwVar.w3 = 0.0f;
                uwVar.x3 = uwVar.v3;
                uwVar.y3 = uwVar.p3 != 0.0f;
                bw bwVar2 = new bw(bundle4);
                bwVar2.N0 = this;
                final uv uvVar4 = this.H3;
                org.telegram.ui.ActionBar.o4 parentLayout = getParentLayout();
                h2.f fVar = uvVar4.n;
                if (!uvVar4.r) {
                    uvVar4.x = parentLayout;
                    bwVar2.onFragmentCreate();
                    bwVar2.setInPreviewMode(true);
                    bwVar2.setParentLayout(parentLayout);
                    View performCreateView = bwVar2.performCreateView(uvVar4.getContext());
                    bwVar2.onResume();
                    uvVar4.b = performCreateView;
                    uvVar4.addView(performCreateView);
                    final bw bwVar3 = uvVar4.a;
                    k0 k0Var = bwVar2.e;
                    uvVar4.c = k0Var;
                    uvVar4.addView(k0Var);
                    uvVar4.a = bwVar2;
                    uy0.R = j3;
                    uy0.R = -bwVar2.a;
                    if (bwVar2.getActionBar() != null) {
                        org.telegram.ui.ActionBar.k actionBar = bwVar2.getActionBar();
                        uvVar4.d = actionBar;
                        uvVar4.addView(actionBar);
                        uvVar4.d.f1 = new pu0(uvVar4, 10);
                    }
                    if (bwVar3 != null) {
                        final bw bwVar4 = uvVar4.a;
                        if (org.telegram.messenger.gz.c()) {
                            r1.g gVar = uvVar4.y;
                            if (gVar != null) {
                                gVar.d();
                            }
                            bwVar4.onTransitionAnimationStart(true, false);
                            uvVar4.F = bwVar3;
                            uvVar4.w = true;
                            fVar.d();
                            r1.g gVar2 = new r1.g(new r1.f(0.0f));
                            uvVar4.y = gVar2;
                            gVar2.m = org.telegram.ui.Cells.y0.n(1000.0f, 400.0f, 1.0f);
                            uy0.f(bwVar3, bwVar4, 0.0f);
                            uvVar4.y.b(new ab0(uvVar4, i17));
                            uvVar4.y.a(new r1.c() { // from class: org.telegram.ui.sy0
                                @Override // r1.c
                                public final void a(r1.g gVar3, boolean z15, float f10, float f11) {
                                    uy0 uy0Var = uvVar4;
                                    if (uy0Var.y == null) {
                                        return;
                                    }
                                    uy0Var.y = null;
                                    org.telegram.ui.ActionBar.e2 e2Var2 = bwVar4;
                                    e2Var2.onTransitionAnimationEnd(true, false);
                                    org.telegram.ui.ActionBar.e2 e2Var3 = bwVar3;
                                    uy0.f(e2Var3, e2Var2, 1.0f);
                                    uy0Var.w = false;
                                    uy0Var.F = null;
                                    e2Var3.onPause();
                                    e2Var3.onFragmentDestroy();
                                    uy0Var.removeView(e2Var3.getFragmentView());
                                    uy0Var.removeView(e2Var3.getActionBar());
                                    uy0Var.n.e();
                                }
                            });
                            uvVar4.y.h();
                        } else {
                            bwVar4.onTransitionAnimationStart(true, false);
                            bwVar4.onTransitionAnimationEnd(true, false);
                            uy0.f(bwVar3, bwVar4, 1.0f);
                            uvVar4.w = false;
                            uvVar4.F = null;
                            bwVar3.onPause();
                            bwVar3.onFragmentDestroy();
                            uvVar4.removeView(bwVar3.getFragmentView());
                            uvVar4.removeView(bwVar3.getActionBar());
                            fVar.e();
                        }
                    } else if (!uvVar4.f) {
                        int i18 = 1;
                        uvVar4.f = true;
                        if (org.telegram.messenger.gz.c()) {
                            fVar.d();
                            uvVar4.h = ValueAnimator.ofFloat(0.0f, 1.0f);
                            uvVar4.e = 0.0f;
                            uvVar4.e(true);
                            uvVar4.g();
                            bwVar2.onTransitionAnimationStart(true, false);
                            uvVar4.h.addUpdateListener(new ry0(uvVar4, i18));
                            uvVar4.h.addListener(new org.telegram.ui.Components.y50(13, uvVar4, bwVar2));
                            uvVar4.h.setDuration(250L);
                            uvVar4.h.setInterpolator(org.telegram.ui.Components.er.f);
                            uvVar4.h.setStartDelay(org.telegram.messenger.gz.o() >= 2 ? 50L : 150L);
                            uvVar4.h.start();
                        } else {
                            uvVar4.e(true);
                            bwVar2.onTransitionAnimationStart(true, false);
                            bwVar2.onTransitionAnimationEnd(true, false);
                            uvVar4.e = 1.0f;
                            uvVar4.g();
                            uvVar4.d(false);
                        }
                    }
                    bwVar2.setPreviewDelegate(new ni0(uvVar4, 15));
                    WeakHashMap weakHashMap = r0.i0.a;
                    r0.y.c(uvVar4);
                }
            } else {
                uvVar3.a();
            }
            hw hwVar8 = this.D0;
            if (hwVar8 != null) {
                hwVar8.R();
            }
        }
    }
}
