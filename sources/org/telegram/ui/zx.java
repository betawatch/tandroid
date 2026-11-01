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
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public class zx extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs, fg.b, fe.e, nf0 {
    public static float A4;
    public static boolean x4;
    public static final boolean[] y4 = new boolean[4];
    public static final org.telegram.ui.Components.rq0 z4 = new org.telegram.ui.Components.rq0(3);
    public boolean A0;
    public FrameLayout A1;
    public boolean A2;
    public boolean A3;
    public int B0;
    public nw B1;
    public boolean B2;
    public Long B3;
    public jx C0;
    public bi.f2 C1;
    public tx C2;
    public Drawable C3;
    public boolean D;
    public org.telegram.ui.Components.st0 D0;
    public org.telegram.ui.ActionBar.t0 D1;
    public ArrayList D2;
    public org.telegram.ui.Components.d5 D3;
    public boolean E;
    public tw E0;
    public final TextPaint E1;
    public String E2;
    public org.telegram.ui.Cells.n E3;
    public boolean F;
    public org.telegram.ui.Components.xr F0;
    public lw F1;
    public CharSequence F2;
    public ww F3;
    public TLRPC.RequestPeerType G;
    public boolean G0;
    public FrameLayout G1;
    public org.telegram.ui.Components.tp0 G2;
    public final mw G3;
    public long H;
    public float H0;
    public lw H1;
    public org.telegram.ui.Components.voip.u H2;
    public final mw H3;
    public ValueAnimator I;
    public float I0;
    public FrameLayout I1;
    public final ArrayList I2;
    public e I3;
    public ValueAnimator J;
    public float J0;
    public org.telegram.ui.Components.zr J1;
    public boolean J2;
    public xa.n J3;
    public boolean K;
    public bi.t0 K0;
    public org.telegram.ui.Components.yr K1;
    public int K2;
    public Drawable K3;
    public boolean L;
    public org.telegram.ui.Components.z60 L0;
    public org.telegram.ui.Cells.l L1;
    public int L2;
    public int L3;
    public boolean M;
    public yw M0;
    public org.telegram.ui.Cells.d3 M1;
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
    public zh.j Q1;
    public int Q2;
    public nu Q3;
    public boolean R;
    public int R0;
    public ArrayList R1;
    public int R2;
    public String R3;
    public org.telegram.ui.Components.wb S;
    public int S0;
    public boolean S1;
    public int S2;
    public ArrayList S3;
    public float T;
    public int T0;
    public org.telegram.ui.ActionBar.x1 T1;
    public int T2;
    public boolean T3;
    public boolean U;
    public boolean U0;
    public boolean U1;
    public int U2;
    public CharSequence U3;
    public boolean V;
    public org.telegram.ui.Components.gc0 V0;
    public boolean V1;
    public boolean V2;
    public boolean V3;
    public boolean W;
    public org.telegram.ui.Cells.v2 W0;
    public long W1;
    public int W2;
    public float W3;
    public ox X;
    public org.telegram.ui.Cells.v2 X0;
    public TLObject X1;
    public zx X2;
    public boolean X3;
    public rf.a0 Y;
    public boolean Y0;
    public int Y1;
    public long Y2;
    public boolean Y3;
    public q01 Z;
    public boolean Z0;
    public int Z1;
    public TLRPC.Chat Z2;
    public ValueAnimator Z3;
    public final int a;
    public org.telegram.ui.Components.w71 a0;
    public final ArrayList a1;
    public boolean a2;
    public TLRPC.ChatFull a3;
    public org.telegram.ui.Components.b40 a4;
    public final fe.b b;
    public zf.g0 b0;
    public boolean b1;
    public boolean b2;
    public org.telegram.ui.Components.g9 b3;
    public TLRPC.FileLocation b4;
    public final fe.b c;
    public float c0;
    public boolean c1;
    public boolean c2;
    public org.telegram.ui.Components.r8 c3;
    public TLRPC.FileLocation c4;
    public final fe.b d;
    public ValueAnimator d0;
    public boolean d1;
    public int d2;
    public long d3;
    public org.telegram.ui.Components.wb d4;
    public final fe.b e;
    public yx[] e0;
    public org.telegram.ui.ActionBar.c2 e1;
    public boolean e2;
    public boolean e3;
    public int e4;
    public final fe.b f;
    public org.telegram.ui.ActionBar.t0 f0;
    public final Paint f1;
    public String f2;
    public boolean f3;
    public int f4;
    public org.telegram.ui.ActionBar.t0 g0;
    public ImageView g1;
    public String g2;
    public AnimatorSet g3;
    public int g4;
    public final fe.b h;
    public cy h0;
    public NumberTextView h1;
    public String h2;
    public boolean h3;
    public int h4;
    public boolean i0;
    public final ArrayList i1;
    public boolean i2;
    public boolean i3;
    public int i4;
    public org.telegram.ui.ActionBar.t0 j0;
    public org.telegram.ui.ActionBar.t0 j1;
    public boolean j2;
    public float j3;
    public final tg.f j4;
    public org.telegram.ui.ActionBar.t0 k0;
    public org.telegram.ui.ActionBar.t0 k1;
    public boolean k2;
    public boolean k3;
    public final hi.f k4;
    public org.telegram.ui.ActionBar.t0 l0;
    public org.telegram.ui.ActionBar.t0 l1;
    public boolean l2;
    public int l3;
    public final hi.f l4;
    public org.telegram.ui.ActionBar.t0 m0;
    public org.telegram.ui.ActionBar.t0 m1;
    public boolean m2;
    public boolean m3;
    public final hi.c m4;
    public final fe.b n;
    public org.telegram.ui.Components.lh0 n0;
    public org.telegram.ui.ActionBar.b1 n1;
    public String n2;
    public boolean n3;
    public final tg.b n4;
    public org.telegram.ui.ActionBar.b1 o0;
    public org.telegram.ui.ActionBar.b1 o1;
    public String o2;
    public org.telegram.ui.Components.wb o3;
    public final tg.b o4;
    public vh.p2 p0;
    public org.telegram.ui.ActionBar.b1 p1;
    public final org.telegram.messenger.hs p2;
    public final e2.f p3;
    public final tg.b p4;
    public vh.p2 q0;
    public org.telegram.ui.ActionBar.b1 q1;
    public boolean q2;
    public boolean q3;
    public final tg.b q4;
    public final fe.b r;
    public boolean r0;
    public org.telegram.ui.ActionBar.b1 r1;
    public boolean r2;
    public boolean r3;
    public xv r4;
    public final fe.b s;
    public boolean s0;
    public org.telegram.ui.ActionBar.b1 s1;
    public boolean s2;
    public boolean s3;
    public final ArrayList s4;
    public org.telegram.ui.Components.f10 t0;
    public org.telegram.ui.ActionBar.b1 t1;
    public boolean t2;
    public boolean t3;
    public final RectF t4;
    public org.telegram.ui.Components.f10 u0;
    public float u1;
    public boolean u2;
    public float u3;
    public final RectF u4;
    public vh.d v0;
    public float v1;
    public boolean v2;
    public ValueAnimator v3;
    public int v4;
    public final hh.i w;
    public bh.i w0;
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
    public zg.e y1;
    public boolean y2;
    public float y3;
    public px z0;
    public FrameLayout z1;
    public boolean z2;
    public boolean z3;

    public zx(Bundle bundle) {
        super(bundle);
        int i10 = Build.VERSION.SDK_INT;
        this.a = i10 >= 31 ? 48 : 0;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.b = new fe.b(1, this, grVar, 350L, false);
        this.c = new fe.b(2, this, grVar, 350L, false);
        this.d = new fe.b(3, this, grVar, 350L, false);
        this.e = new fe.b(4, this, grVar, 350L, false);
        this.f = new fe.b(5, this, grVar, 350L, false);
        this.h = new fe.b(6, this, grVar, 350L, false);
        this.n = new fe.b(7, this, grVar, 350L, false);
        this.r = new fe.b(8, this, grVar, 350L, false);
        this.s = new fe.b(9, this, grVar, 350L, false);
        this.w = new hh.i(new ev(this, 18));
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
        this.p2 = new org.telegram.messenger.hs();
        this.I2 = new ArrayList();
        this.J2 = true;
        this.p3 = new e2.f((int[]) null);
        this.G3 = new mw(this, 0);
        this.H3 = new mw(this, 1);
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
        hi.c d = this.glassEngine.d(new hv(this, 12));
        this.m4 = d;
        if (i10 >= 31) {
            tg.f fVar = new tg.f(false);
            this.j4 = fVar;
            hi.f fVar2 = new hi.f(d);
            this.l4 = fVar2;
            fVar2.f = d;
            fVar2.d = fVar;
            fVar2.e = -2;
            hi.f fVar3 = new hi.f(null);
            this.k4 = fVar3;
            fVar3.f = d;
            fVar3.d = fVar;
            fVar3.e = -3;
            tg.b bVar = new tg.b(fVar2, fVar2, fVar2);
            this.p4 = bVar;
            bVar.k = true;
            int L = org.telegram.messenger.tc.e(262144) ? org.telegram.messenger.i0.L(8.0f) : org.telegram.messenger.i0.L(48.0f);
            bVar.d = L;
            bVar.e = L;
            tg.b bVar2 = new tg.b(fVar3, fVar3, fVar3);
            this.n4 = bVar2;
            bVar2.k = true;
            int L2 = org.telegram.messenger.i0.L(48.0f);
            bVar2.d = L2;
            bVar2.e = L2;
            this.o4 = new tg.b(fVar3, fVar3, fVar3);
        } else {
            this.j4 = null;
            this.k4 = null;
            this.l4 = null;
            this.n4 = new tg.b(d, d, d);
            this.p4 = new tg.b(d, d, d);
            this.o4 = new tg.b(d, d, d);
        }
        tg.b bVar3 = new tg.b(d, d, d);
        this.q4 = bVar3;
        tg.b bVar4 = this.p4;
        ei.r rVar = this.glassEngine;
        bVar4.j = rVar;
        this.n4.j = rVar;
        this.o4.j = rVar;
        bVar3.j = rVar;
    }

    public static void A0(zx zxVar) {
        if (zxVar.N3) {
            vh.p2 p2Var = zxVar.p0;
            if (p2Var != null) {
                p2Var.e(true);
            }
            j4.w o10 = org.telegram.messenger.wp.r1(zxVar.currentAccount).O1().o();
            if (o10 != null && o10.a(zxVar.currentAccount, 1)) {
                zxVar.showDialog(new kg.q0(o10.b(), zxVar.currentAccount, zxVar.getParentActivity(), zxVar, null));
                return;
            } else {
                vh.o8 D = vh.o8.D(zxVar.getParentActivity(), zxVar.currentAccount);
                D.y = new hw(zxVar);
                D.Q(null);
                return;
            }
        }
        vh.p2 p2Var2 = zxVar.q0;
        if (p2Var2 != null) {
            if (p2Var2.V) {
                return;
            } else {
                org.telegram.messenger.i0.E2(p2Var2);
            }
        }
        SpannableStringBuilder R2 = org.telegram.messenger.i0.R2(org.telegram.messenger.dd.M0("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.t6.uj, 0, new ev(zxVar, 24), null);
        vh.p2 p2Var3 = new vh.p2(zxVar.getParentActivity(), 2);
        p2Var3.q(8.0f);
        p2Var3.d = 8000L;
        p2Var3.i(true);
        p2Var3.p(true);
        p2Var3.h = org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(148.0f);
        p2Var3.s(R2);
        p2Var3.l(1.0f, -40.0f);
        p2Var3.h(zxVar.getThemedColor(org.telegram.ui.ActionBar.t6.tj));
        zxVar.q0 = p2Var3;
        p2Var3.setTranslationY((-zxVar.f4) - zxVar.h4);
        ((ViewGroup) zxVar.fragmentView).addView(zxVar.q0, w7.b6.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
        zxVar.q0.u();
    }

    public static void B0(zx zxVar) {
        org.telegram.messenger.wp.r1(zxVar.currentAccount).h4(0L, "PREMIUM_CHRISTMAS");
        zxVar.g5();
        org.telegram.ui.Components.wb G = org.telegram.ui.Components.cc.a0(zxVar).G(R.raw.gift, 4, org.telegram.messenger.dd.L0(2131753330, null));
        G.j = 5000;
        G.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void C0(zx zxVar, int i10) {
        tg.f fVar = zxVar.j4;
        RectF rectF = zxVar.u4;
        if (Build.VERSION.SDK_INT < 31 || fVar == null) {
            return;
        }
        if (v7.u7.a(i10, 4)) {
            int L = org.telegram.messenger.i0.L(48.0f);
            int measuredHeight = (zxVar.fragmentView.getMeasuredHeight() - zxVar.f4) - org.telegram.messenger.i0.L(8.0f);
            int L2 = measuredHeight - org.telegram.messenger.i0.L(56.0f);
            int L3 = org.telegram.messenger.i0.L(zxVar.K ? 81.0f : 0.0f) + org.telegram.messenger.i0.L(48.0f) + zxVar.actionBar.getMeasuredHeight();
            px pxVar = zxVar.z0;
            boolean z10 = false;
            int measuredHeight2 = L3 + ((pxVar == null || pxVar.getVisibility() != 0) ? 0 : zxVar.z0.getMeasuredHeight());
            org.telegram.ui.Components.zr zrVar = zxVar.J1;
            int sumHeightOfAllVisibleChild = measuredHeight2 + ((zrVar == null || zrVar.getVisibility() != 0) ? 0 : zxVar.J1.getSumHeightOfAllVisibleChild()) + ((int) zxVar.N);
            int measuredHeight3 = zxVar.actionBar.getMeasuredHeight();
            zxVar.t4.set(0.0f, -L, zxVar.fragmentView.getMeasuredWidth(), org.telegram.messenger.i0.W1(zxVar.b.e, sumHeightOfAllVisibleChild, org.telegram.messenger.i0.L(30.0f) + measuredHeight3 + (zxVar.Z != null ? r9.getMeasuredHeight() : 0)) + L);
            if (zxVar.W) {
                rectF.set(0.0f, L2, zxVar.fragmentView.getMeasuredWidth(), measuredHeight);
                rectF.inset(0.0f, org.telegram.messenger.tc.e(262144) ? 0.0f : -org.telegram.messenger.i0.L(48.0f));
            } else {
                if (zxVar.B1 != null && zxVar.y1 != null) {
                    rectF.set(0.0f, zxVar.fragmentView.getMeasuredHeight() - zxVar.w3(), zxVar.fragmentView.getMeasuredWidth(), zxVar.fragmentView.getMeasuredHeight());
                    rectF.inset(0.0f, org.telegram.messenger.tc.e(262144) ? 0.0f : -org.telegram.messenger.i0.L(48.0f));
                }
                fVar.g(z10 ? 2 : 1, zxVar.s4);
            }
            z10 = true;
            fVar.g(z10 ? 2 : 1, zxVar.s4);
        }
        fVar.e(zxVar.r4, zxVar.fragmentView.getMeasuredWidth(), zxVar.fragmentView.getMeasuredHeight());
    }

    public static void D0(zx zxVar) {
        org.telegram.messenger.wp.r1(zxVar.currentAccount).h4(0L, "BIRTHDAY_SETUP");
        zxVar.g5();
        org.telegram.ui.Components.wb K = org.telegram.ui.Components.cc.a0(zxVar).K(R.raw.chats_infotip, org.telegram.messenger.dd.L0(2131753714, null), org.telegram.messenger.dd.L0(2131745512, null), new ev(zxVar, 29));
        K.j = 5000;
        K.j();
    }

    public static void E0(zx zxVar) {
        try {
            ((org.telegram.ui.Components.ci0) ((org.telegram.ui.Components.r8) zxVar.M1.h.getImageReceiver().m0).K).H(true);
        } catch (Exception unused) {
        }
        if (zxVar.a4 == null) {
            org.telegram.ui.Components.b40 b40Var = new org.telegram.ui.Components.b40(0, true, true);
            zxVar.a4 = b40Var;
            b40Var.H = true;
            b40Var.a = zxVar;
            b40Var.b = new nx(zxVar);
            zxVar.getMediaDataController().x();
            zxVar.getMessagesController().b3();
            zxVar.getMessagesController().e3(zxVar.getUserConfig().f(), true, zxVar.classGuid);
        }
        TLRPC.User Z1 = org.telegram.messenger.wp.r1(zxVar.currentAccount).Z1(Long.valueOf(org.telegram.messenger.e20.i(zxVar.currentAccount).e()));
        if (Z1 == null) {
            Z1 = org.telegram.messenger.e20.i(zxVar.currentAccount).f();
        }
        if (Z1 == null) {
            return;
        }
        org.telegram.ui.Components.bi biVar = zxVar.a4.c;
        if (biVar != null) {
            biVar.P0();
        }
        org.telegram.ui.Components.b40 b40Var2 = zxVar.a4;
        TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
        b40Var2.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new ev(zxVar, 28), new nv(zxVar, 3), 0);
    }

    public static /* synthetic */ void G0(zx zxVar, float f7, ValueAnimator valueAnimator) {
        zxVar.e0[0].setTranslationY((1.0f - zxVar.u3) * f7);
        zxVar.u3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i10 = 0; i10 < zxVar.actionBar.getChildCount(); i10++) {
            if (zxVar.actionBar.getChildAt(i10).getVisibility() == 0 && zxVar.actionBar.getChildAt(i10) != zxVar.actionBar.getActionMode() && zxVar.actionBar.getChildAt(i10) != zxVar.actionBar.getBackButton()) {
                zxVar.actionBar.getChildAt(i10).setAlpha(1.0f - zxVar.u3);
            }
        }
        zxVar.Q3();
        zxVar.I3();
        View view = zxVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void H0(zx zxVar) {
        org.telegram.ui.Components.eb ebVar = new org.telegram.ui.Components.eb(zxVar.getParentActivity(), zxVar.resourceProvider);
        ebVar.d(R.raw.email_check_inbox, new String[0]);
        ebVar.b.setText(org.telegram.messenger.dd.L0(2131742836, null));
        org.telegram.ui.Components.wb.g(zxVar, ebVar, 2750).j();
        try {
            zxVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void I0(zx zxVar, org.telegram.messenger.w1 w1Var) {
        ArrayList arrayList = w1Var.c;
        if (arrayList.size() != 1) {
            mg.i2.l1(0, w1Var);
            return;
        }
        ph.l1 l1Var = new ph.l1(zxVar.getParentActivity(), zxVar.currentAccount, ((TLRPC.User) arrayList.get(0)).id, null, null);
        l1Var.e1(true);
        zxVar.showDialog(l1Var);
    }

    public static void J0(zx zxVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.wb I = org.telegram.ui.Components.cc.a0(zxVar).I(R.raw.gift, org.telegram.messenger.dd.L0(2131746871, null), org.telegram.messenger.dd.L0(2131746870, null));
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
            zxVar.getMessagesStorage().j2(userFull, false);
        }
        if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            org.telegram.messenger.m5.n(null, 2131743904, org.telegram.ui.Components.cc.a0(zxVar), R.raw.error, 36);
            return;
        }
        if (zxVar.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zxVar.getParentActivity(), zxVar.resourceProvider);
            String L0 = org.telegram.messenger.dd.L0(2131746867, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.dd.L0(2131746868, null);
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), null);
            zxVar.showDialog(x1Var);
        }
    }

    public static /* synthetic */ void K0(zx zxVar) {
        org.telegram.messenger.wp.r1(zxVar.currentAccount).h4(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        zxVar.g5();
    }

    public static void X2(zx zxVar, float f7) {
        float f10;
        float f11;
        float i10 = Utilities.i(zxVar.x1 * 2.0f, 1.0f, 0.0f);
        tw twVar = zxVar.E0;
        float f12 = (1.0f - zxVar.u3) * f7 * zxVar.H0;
        float f13 = 1.0f - i10;
        twVar.setAlpha(f12 * f13);
        if (zxVar.K || zxVar.M) {
            float i11 = Utilities.i((-zxVar.N) / org.telegram.messenger.i0.L(81.0f), 1.0f, 0.0f);
            if (zxVar.u3 == 1.0f) {
                i11 = 1.0f;
            }
            float i12 = Utilities.i(i11 / 0.5f, 1.0f, 0.0f);
            zxVar.E0.setClipTop(0);
            if (zxVar.K || !zxVar.M) {
                zxVar.E0.setTranslationY(((zxVar.T / 2.0f) + (Math.max(zxVar.N, -zxVar.g4()) + zxVar.w3)) - org.telegram.messenger.i0.L(8.0f));
                zxVar.E0.l(!zxVar.F3.c(), i11);
                if (zxVar.M) {
                    f10 = 1.0f - i12;
                    zxVar.actionBar.setTranslationY(0.0f);
                } else {
                    f11 = zxVar.H0;
                }
            } else {
                zxVar.E0.setTranslationY((-org.telegram.messenger.i0.L(81.0f)) - org.telegram.messenger.i0.L(8.0f));
                zxVar.E0.setProgressToCollapse(1.0f);
                f11 = zxVar.H0;
            }
            f10 = 1.0f - f11;
            zxVar.actionBar.setTranslationY(0.0f);
        } else {
            if (zxVar.L) {
                zxVar.E0.setTranslationY((Math.max(zxVar.N, -zxVar.g4()) + (-org.telegram.messenger.i0.L(81.0f))) - org.telegram.messenger.i0.L(8.0f));
                zxVar.E0.setProgressToCollapse(1.0f);
                tw twVar2 = zxVar.E0;
                twVar2.setClipTop((int) (org.telegram.messenger.i0.m - twVar2.getY()));
            }
            f10 = 1.0f - zxVar.H0;
            zxVar.actionBar.setTranslationY(0.0f);
        }
        float f14 = f10 * f13;
        if (f14 == 1.0f) {
            zxVar.actionBar.getTitlesContainer().setScaleY(1.0f);
            zxVar.actionBar.getTitlesContainer().setScaleX(1.0f);
            zxVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
            zxVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
            float f15 = 1.0f - zxVar.u3;
            zxVar.actionBar.getTitlesContainer().setAlpha(f15);
            zxVar.actionBar.getTitlesContainer().setVisibility(f15 > 0.0f ? 0 : 4);
            zxVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f15);
            zxVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f15 <= 0.0f ? 4 : 0);
            return;
        }
        zxVar.actionBar.getTitlesContainer().setPivotY(org.telegram.messenger.i0.m);
        zxVar.actionBar.getTitlesContainer().setPivotX(org.telegram.messenger.i0.L(20.0f));
        float f16 = (0.6f * f14) + 0.4f;
        zxVar.actionBar.getTitlesContainer().setScaleY(f16);
        zxVar.actionBar.getTitlesContainer().setScaleX(f16);
        zxVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
        zxVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-org.telegram.messenger.i0.L(30.0f));
        zxVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f16);
        zxVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f16);
        float f17 = (1.0f - zxVar.u3) * f14;
        zxVar.actionBar.getTitlesContainer().setAlpha(f17);
        zxVar.actionBar.getTitlesContainer().setVisibility(f17 > 0.0f ? 0 : 4);
        zxVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f17);
        zxVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f17 <= 0.0f ? 4 : 0);
    }

    public static void Y2(zx zxVar, Canvas canvas, int i10) {
        org.telegram.ui.ActionBar.z4 z4Var;
        if (zxVar.parentLayout == null || zxVar.actionBar == null) {
            return;
        }
        float max = Math.max(zxVar.e.e, zxVar.h4());
        float f7 = 1.0f;
        float f10 = 1.0f - zxVar.x1;
        float f11 = max * f10 * f10;
        if (f11 == 0.0f) {
            return;
        }
        if (-1 >= i10) {
            f7 = 0.0f;
            i10 = -1;
        }
        if (f7 <= 0.0f || f11 <= 0.0f || i10 <= 0 || (z4Var = zxVar.parentLayout) == null) {
            return;
        }
        ((ActionBarLayout) z4Var).p(canvas, (int) (f7 * 255.0f * f11), i10);
    }

    public static /* synthetic */ void Z(zx zxVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        org.telegram.messenger.wp.r1(zxVar.currentAccount).h4(0L, tL_pendingSuggestion.suggestion);
        zxVar.g5();
    }

    public static /* synthetic */ void a0(zx zxVar, float f7, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        zxVar.u3 = floatValue;
        zxVar.e0[0].setTranslationY((-f7) * floatValue);
        for (int i10 = 0; i10 < zxVar.actionBar.getChildCount(); i10++) {
            if (zxVar.actionBar.getChildAt(i10).getVisibility() == 0 && zxVar.actionBar.getChildAt(i10) != zxVar.actionBar.getActionMode() && zxVar.actionBar.getChildAt(i10) != zxVar.actionBar.getBackButton()) {
                zxVar.actionBar.getChildAt(i10).setAlpha(1.0f - zxVar.u3);
            }
        }
        View view = zxVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        zxVar.Q3();
        zxVar.I3();
    }

    public static void b0(zx zxVar) {
        ArrayList arrayList = zxVar.I2;
        org.telegram.ui.ActionBar.z4 z4Var = zxVar.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).x()) {
            zxVar.finishPreviewFragment();
            return;
        }
        if (zxVar.R0 != 10) {
            if (org.telegram.messenger.wp.r1(zxVar.currentAccount).u2()) {
                b.b(zxVar.currentAccount);
                return;
            } else {
                zxVar.presentFragment(new ContactsActivity(a1.g.g("destroyAfterSelect", true)));
                return;
            }
        }
        if (zxVar.C2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList2.add(org.telegram.messenger.hs.a(((Long) arrayList.get(i10)).longValue(), 0L));
        }
        zxVar.C2.z(zxVar, arrayList2, null, false, zxVar.J2, zxVar.K2, zxVar.L2, null);
    }

    public static /* synthetic */ void c0(zx zxVar) {
        org.telegram.messenger.wp.r1(zxVar.currentAccount).h4(0L, "USERPIC_SETUP");
        zxVar.g5();
    }

    public static org.telegram.ui.Cells.v2 c4(yx yxVar) {
        vx vxVar = yxVar.a;
        for (int i10 = 0; i10 < vxVar.getChildCount(); i10++) {
            View childAt = vxVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.v2) {
                org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) childAt;
                if (v2Var.W()) {
                    return v2Var;
                }
            }
        }
        return null;
    }

    public static void d0(zx zxVar) {
        PasskeysActivity.f0(zxVar.currentAccount, zxVar.getParentActivity(), zxVar.resourceProvider, true);
    }

    public static /* synthetic */ void e0(zx zxVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", org.telegram.messenger.e20.i(zxVar.currentAccount).e());
        zxVar.presentFragment(new un(bundle));
    }

    public static /* synthetic */ void f0(zx zxVar, TL_account.TL_birthday tL_birthday) {
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull a2 = zxVar.getMessagesController().a2(zxVar.getUserConfig().e());
        TL_account.TL_birthday tL_birthday2 = a2 != null ? a2.birthday : null;
        if (a2 != null) {
            a2.flags2 |= 32;
            a2.birthday = tL_birthday;
        }
        zxVar.getMessagesController().l2();
        zxVar.getConnectionsManager().sendRequest(updatebirthday, new aa(zxVar, a2, tL_birthday2, 8), 1024);
        org.telegram.messenger.wp.r1(zxVar.currentAccount).h4(0L, "BIRTHDAY_SETUP");
        zxVar.g5();
    }

    public static void g0(zx zxVar, yx yxVar, View view, int i10) {
        int i11;
        if (view instanceof org.telegram.ui.Cells.z3) {
            return;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.v2;
        if (z10) {
            org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view;
            if (v2Var.n2) {
                zxVar.Z4(v2Var.getDialogId(), view);
                return;
            }
        }
        if (zxVar.U3()) {
            zxVar.A4(view, i10, 0.0f, yxVar.d);
            return;
        }
        int i12 = zxVar.R0;
        if (i12 == 15 && (view instanceof org.telegram.ui.Cells.p8)) {
            yxVar.d.L();
            return;
        }
        int i13 = 0;
        if ((i12 == 11 || i12 == 13) && i10 == 1) {
            Bundle g10 = a1.g.g("forImport", true);
            g10.putLongArray("result", new long[]{zxVar.getUserConfig().e()});
            g10.putInt("chatType", 4);
            String string = zxVar.arguments.getString("importTitle");
            if (string != null) {
                g10.putString("title", string);
            }
            b60 b60Var = new b60(g10);
            b60Var.Y = new hw(zxVar);
            zxVar.presentFragment(b60Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.d3) && ((i11 = yxVar.s) == 7 || i11 == 8)) {
            zf.k kVar = (zf.k) yxVar.d.M.get(0);
            TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = (kVar == null || kVar.a != 17) ? null : kVar.i;
            if (tL_chatlists_chatlistUpdates != null) {
                org.telegram.messenger.bp bpVar = zxVar.getMessagesController().M[yxVar.s - 7];
                if (bpVar != null) {
                    int i14 = bpVar.a;
                    org.telegram.ui.Components.j00 j00Var = new org.telegram.ui.Components.j00(zxVar, false);
                    j00Var.Q1 = -1;
                    j00Var.U1 = "";
                    j00Var.V1 = new ArrayList();
                    j00Var.X1 = "";
                    j00Var.Z1 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    j00Var.a2 = arrayList;
                    j00Var.r2 = -1;
                    j00Var.u2 = -5;
                    j00Var.Q1 = i14;
                    j00Var.S1 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    j00Var.Y1 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList arrayList2 = zxVar.getMessagesController().P0;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                break;
                            }
                            if (((org.telegram.messenger.bp) arrayList2.get(i13)).a == i14) {
                                j00Var.U1 = ((org.telegram.messenger.bp) arrayList2.get(i13)).b;
                                break;
                            }
                            i13++;
                        }
                    }
                    j00Var.f1();
                    zxVar.showDialog(j00Var);
                    return;
                }
                return;
            }
        } else if (z10 && !zxVar.actionBar.u() && !zxVar.F3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.v2) view).Y1;
            org.telegram.messenger.i0.P.set(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), imageReceiver.A());
        }
        zxVar.z4(view, i10, yxVar.d);
    }

    public static /* synthetic */ void h0(zx zxVar) {
        zxVar.presentFragment(new PrivacySettingsActivity());
        org.telegram.messenger.i0.j3(zxVar.parentLayout, "newChatsRow");
    }

    public static /* synthetic */ void i0(zx zxVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.wp.r1(zxVar.currentAccount).n1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(zxVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new aa(zxVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void j0(zx zxVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(launchActivity, zxVar.currentAccount, tL_attachMenuBot, null, true);
        org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(zxVar.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = b02.b;
        if (tL_attachMenuBots != null) {
            long j10 = b02.a;
            b02.getMessagesStorage().a.c(new org.telegram.messenger.sk(b02.e, 2, j10, b02, tL_attachMenuBots));
        }
    }

    public static void j1(zx zxVar, boolean z10) {
        if (zxVar.e0 == null || zxVar.M3 == z10) {
            return;
        }
        zxVar.M3 = z10;
        int i10 = 0;
        while (true) {
            yx[] yxVarArr = zxVar.e0;
            if (i10 >= yxVarArr.length) {
                return;
            }
            if (z10) {
                yxVarArr[i10].a.setScrollbarFadingEnabled(false);
            }
            zxVar.e0[i10].a.setVerticalScrollBarEnabled(z10);
            if (z10) {
                zxVar.e0[i10].a.setScrollbarFadingEnabled(true);
            }
            i10++;
        }
    }

    public static void k0(zx zxVar) {
        org.telegram.messenger.wp.r1(zxVar.currentAccount).f7.edit().putBoolean("storyhint", false).commit();
    }

    public static /* synthetic */ void l0(zx zxVar) {
        if (zxVar.a4.g()) {
            org.telegram.messenger.wp.r1(zxVar.currentAccount).h4(0L, "USERPIC_SETUP");
            zxVar.g5();
        }
    }

    public static /* synthetic */ void n0(zx zxVar) {
        org.telegram.messenger.wp.r1(zxVar.currentAccount).h4(0L, "PREMIUM_GRACE");
        zxVar.g5();
    }

    public static /* synthetic */ void o0(zx zxVar) {
        org.telegram.messenger.wp.r1(zxVar.currentAccount).h4(0L, "SETUP_PASSKEY");
        zxVar.g5();
    }

    public static void p0(zx zxVar, org.telegram.ui.ActionBar.x1 x1Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        try {
            x1Var.dismiss();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        if (tLObject == null) {
            org.telegram.ui.Components.s4.e0(zxVar.currentAccount, tL_error, zxVar, tL_messages_checkHistoryImportPeer, new Object[0]);
            zxVar.getNotificationCenter().k(org.telegram.messenger.at.v1, Long.valueOf(j10), tL_messages_checkHistoryImportPeer, tL_error);
            return;
        }
        zxVar.arguments.getString("importTitle");
        String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
        bi.e eVar = new bi.e(zxVar, j10, 14);
        Pattern pattern = org.telegram.ui.Components.s4.a;
        if (zxVar.getParentActivity() != null) {
            if (chat == null && user == null) {
                return;
            }
            int currentAccount = zxVar.getCurrentAccount();
            Activity parentActivity = zxVar.getParentActivity();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            long e7 = org.telegram.messenger.e20.i(currentAccount).e();
            TextView textView = new TextView(parentActivity);
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.j5, null);
            textView.setTextSize(1, 16.0f);
            textView.setGravity((org.telegram.messenger.dd.X ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            alertDialog$Builder.o(frameLayout);
            org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
            r8Var.u(org.telegram.messenger.i0.L(12.0f));
            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(parentActivity);
            g9Var.setRoundRadius(org.telegram.messenger.i0.L(20.0f));
            frameLayout.addView(g9Var, w7.b6.d(40, 40.0f, (org.telegram.messenger.dd.X ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            org.telegram.messenger.m5.m(textView2, org.telegram.ui.ActionBar.t6.E8, null, 1, 20.0f);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity((org.telegram.messenger.dd.X ? 5 : 3) | 16);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(org.telegram.messenger.dd.L0(2131749254, null));
            boolean z10 = org.telegram.messenger.dd.X;
            frameLayout.addView(textView2, w7.b6.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 76, 11.0f, z10 ? 76 : 21, 0.0f));
            frameLayout.addView(textView, w7.b6.d(-2, -2.0f, (org.telegram.messenger.dd.X ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (user == null) {
                r8Var.q(chat);
                g9Var.e(chat, r8Var);
            } else if (org.telegram.messenger.i20.z(user)) {
                r8Var.p = 0.8f;
                r8Var.g(12);
                g9Var.j(null, null, r8Var, user);
            } else if (user.id == e7) {
                r8Var.p = 0.8f;
                r8Var.g(1);
                g9Var.j(null, null, r8Var, user);
            } else {
                r8Var.p = 1.0f;
                r8Var.r(user);
                g9Var.e(user, r8Var);
            }
            textView.setText(org.telegram.messenger.i0.W2(str));
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131749274, null), new org.telegram.ui.Components.t(eVar, 3));
            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
            zxVar.showDialog(alertDialog$Builder.a);
        }
    }

    public static void p4(un unVar, org.telegram.messenger.kj kjVar) {
        if (kjVar == null || !kjVar.s2()) {
            return;
        }
        try {
            CharSequence charSequence = !TextUtils.isEmpty(kjVar.z) ? kjVar.z : kjVar.v;
            CharSequence x12 = org.telegram.messenger.i0.x1(charSequence, kjVar.Y1, null);
            if (x12 instanceof SpannableStringBuilder) {
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) x12;
                org.telegram.ui.Components.l00[] l00VarArr = (org.telegram.ui.Components.l00[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.l00.class);
                if (l00VarArr.length > 0) {
                    int spanStart = spannableStringBuilder.getSpanStart(l00VarArr[0]);
                    int spanEnd = spannableStringBuilder.getSpanEnd(l00VarArr[0]);
                    for (int i10 = 1; i10 < l00VarArr.length; i10++) {
                        int spanStart2 = spannableStringBuilder.getSpanStart(l00VarArr[i10]);
                        int spanStart3 = spannableStringBuilder.getSpanStart(l00VarArr[i10]);
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
                    unVar.Jb(kjVar.M1(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public static void q0(zx zxVar, int i10) {
        Object obj;
        org.telegram.ui.Components.vm0 vm0Var = zxVar.C0.q0;
        if (i10 < vm0Var.Z || i10 >= vm0Var.a0) {
            obj = Boolean.FALSE;
        } else {
            org.telegram.ui.Components.b51 G = vm0Var.G(i10);
            obj = G != null ? G.G : null;
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zxVar.getParentActivity(), zxVar.resourceProvider);
            String L0 = org.telegram.messenger.dd.L0(2131754180, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.dd.a0(null, null, 2131754179, "\"" + org.telegram.messenger.i20.p(user) + "\"");
            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131746336, null), new qv(1, zxVar, user));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
        }
    }

    public static void r0(zx zxVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        if (i10 != 102) {
            zxVar.D4(arrayList, i10, false, false, null);
            return;
        }
        zxVar.getMessagesController().s0 = true;
        zxVar.D4(arrayList, i10, false, false, z10 ? hashSet : null);
        org.telegram.messenger.wp messagesController = zxVar.getMessagesController();
        messagesController.s0 = false;
        messagesController.getNotificationCenter().k(org.telegram.messenger.at.s, Boolean.TRUE);
        zxVar.getMessagesController().J(zxVar.W2);
        int i11 = zxVar.W2;
        if (i11 == 0 || zxVar.d4(zxVar.currentAccount, zxVar.e0[0].s, i11, false).size() != 0) {
            return;
        }
        zxVar.e0[0].a.setEmptyView(null);
        zxVar.e0[0].x.setVisibility(4);
        zxVar.finishFragment();
    }

    public static void t0(zx zxVar, int i10, org.telegram.ui.Components.z60 z60Var) {
        if (zxVar.currentAccount == i10) {
            return;
        }
        z60Var.u();
        if (zxVar.getParentActivity() == null) {
            return;
        }
        tx txVar = zxVar.C2;
        LaunchActivity launchActivity = (LaunchActivity) zxVar.getParentActivity();
        ArrayList arrayList = zxVar.D2;
        String str = zxVar.E2;
        CharSequence charSequence = zxVar.F2;
        nw nwVar = zxVar.B1;
        CharSequence fieldText = nwVar != null ? nwVar.getFieldText() : null;
        launchActivity.O0(i10);
        zx zxVar2 = new zx(zxVar.arguments);
        zxVar2.C2 = txVar;
        if (arrayList == null || arrayList.isEmpty()) {
            if (str != null) {
                zxVar2.Q4(fieldText, str);
            } else if (charSequence != null) {
                if (charSequence.length() == 0) {
                    zxVar2.F2 = null;
                } else {
                    zxVar2.F2 = charSequence;
                    zxVar2.E2 = null;
                    zxVar2.D2 = null;
                    if (zxVar2.B1 != null) {
                        zxVar2.v3(fieldText);
                    } else {
                        zxVar2.U3 = fieldText;
                    }
                }
            }
        } else if (arrayList.isEmpty()) {
            zxVar2.D2 = null;
        } else {
            zxVar2.D2 = arrayList;
            zxVar2.E2 = null;
            zxVar2.M2 = false;
            if (zxVar2.B1 != null) {
                zxVar2.v3(fieldText);
            } else {
                zxVar2.U3 = fieldText;
            }
        }
        launchActivity.u0(zxVar2, false, true);
    }

    public static /* synthetic */ void u0(zx zxVar) {
        org.telegram.messenger.wp.r1(zxVar.currentAccount).h4(0L, zxVar.A3 ? "PREMIUM_UPGRADE" : "PREMIUM_ANNUAL");
        zxVar.g5();
    }

    public static void u1(zx zxVar, yx yxVar, float f7) {
        if (zxVar.T == f7) {
            return;
        }
        zxVar.T = f7;
        if (f7 == 0.0f) {
            zxVar.U = false;
        }
        zxVar.E0.setOverscroll(f7);
        yxVar.a.setViewsOffset(f7);
        yxVar.a.setOverScrollMode(f7 != 0.0f ? 2 : 0);
        zxVar.fragmentView.invalidate();
        if (f7 <= org.telegram.messenger.i0.L(90.0f) || zxVar.U) {
            return;
        }
        tw twVar = zxVar.E0;
        ValueAnimator valueAnimator = twVar.H0;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            twVar.i(twVar.p0, true);
            zxVar.U = true;
            zxVar.getOrCreateStoryViewer().G(new ev(zxVar, 4));
        }
    }

    public static void u4(org.telegram.messenger.c cVar) {
        int i10 = cVar.a;
        boolean[] zArr = y4;
        if (zArr[i10]) {
            return;
        }
        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i10);
        r12.V2();
        r12.S2(0, 0, 100, true, null);
        if (r12.s.isEmpty() && !TextUtils.isEmpty(r12.T3)) {
            TLRPC.TL_help_getRecentMeUrls tL_help_getRecentMeUrls = new TLRPC.TL_help_getRecentMeUrls();
            tL_help_getRecentMeUrls.referer = r12.T3;
            r12.getConnectionsManager().sendRequest(tL_help_getRecentMeUrls, new org.telegram.messenger.uj(r12, 4));
        }
        r12.e3(org.telegram.messenger.e20.i(i10).f(), false, 0);
        org.telegram.messenger.i5.r(i10).f();
        org.telegram.messenger.vi.b0(i10).u(false);
        org.telegram.messenger.i0.h3(new rh(cVar, 19), 200L);
        Iterator it = r12.e4.iterator();
        while (it.hasNext()) {
            org.telegram.messenger.vi.b0(i10).c1((String) it.next(), true, true);
        }
        zArr[i10] = true;
    }

    public static void v0(zx zxVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
            re1.a(zxVar.getParentActivity(), new w(zxVar, tL_attachMenuBot, launchActivity, 7), null);
        } else {
            LaunchActivity.G0(launchActivity, zxVar.currentAccount, tL_attachMenuBot, null, true);
        }
    }

    public static boolean v1(zx zxVar, yx yxVar) {
        if (zxVar.F3.c()) {
            return false;
        }
        int i10 = (int) (-zxVar.N);
        int f42 = zxVar.f4();
        int g42 = zxVar.g4();
        if (i10 == 0 || i10 == f42 || i10 == g42 || !yxVar.a.canScrollVertically(-1)) {
            return false;
        }
        if (g42 >= i10 || i10 >= f42) {
            if ((zxVar.u3 != 1.0f ? Utilities.i((-zxVar.N) / org.telegram.messenger.i0.L(81.0f), 1.0f, 0.0f) : 1.0f) < zxVar.E0.B0) {
                yxVar.b.y(-i10);
                return true;
            }
            yxVar.b.y(g42 - i10);
            return true;
        }
        int L = org.telegram.messenger.i0.L(48.0f);
        int i11 = i10 - g42;
        if (i11 < L / 2) {
            yxVar.b.y(-i11);
            return true;
        }
        yxVar.b.y(L - i11);
        return true;
    }

    public static void w0(zx zxVar) {
        b.c(zxVar.currentAccount, zxVar.getParentActivity(), zxVar.getResourceProvider());
    }

    public static String w2(zx zxVar) {
        ArrayList arrayList = zxVar.I2;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() >= 3) {
            return org.telegram.messenger.dd.G(arrayList.size(), "ShareSendToMany", new Object[0]);
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
            if (longValue == zxVar.getUserConfig().e()) {
                sb2.append(org.telegram.messenger.dd.L0(2131745918, null));
            } else {
                sb2.append(arrayList.size() == 1 ? org.telegram.messenger.o5.l(zxVar.currentAccount, longValue) : org.telegram.messenger.o5.s(zxVar.currentAccount, longValue));
            }
        }
        return org.telegram.messenger.dd.a0(null, null, 2131745457, sb2.toString());
    }

    public static void x0(final int i10, final long j10, TLRPC.Chat chat, final zx zxVar, final boolean z10, final boolean z11) {
        final TLRPC.Chat chat2;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        zxVar.n4(false);
        if (i10 == 103 && org.telegram.messenger.w3.T(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || org.telegram.messenger.w3.t0(chat2)) {
                zxVar.getMessagesController().X(2, j10, z11);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i10 == 102 && (i13 = zxVar.W2) != 0 && zxVar.d4(zxVar.currentAccount, zxVar.e0[0].s, i13, false).size() == 1) {
            zxVar.e0[0].x.setVisibility(4);
        }
        int i14 = -1;
        if (i10 == 102) {
            zxVar.M4(true, true);
            if (zxVar.R1 != null) {
                i12 = 0;
                while (i12 < zxVar.R1.size()) {
                    if (((TLRPC.Dialog) zxVar.R1.get(i12)).id == j10) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            i12 = -1;
            zxVar.z3();
            i11 = i12;
        } else {
            i11 = -1;
        }
        UndoView k42 = zxVar.k4();
        if (k42 != null) {
            k42.j(i10 == 103 ? 0 : z11 ? 1 : 95, j10, new Runnable() { // from class: org.telegram.ui.wv
                @Override // java.lang.Runnable
                public final void run() {
                    zxVar.C4(i10, j10, chat2, z10, z11);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(zxVar.d4(zxVar.currentAccount, zxVar.e0[0].s, zxVar.W2, false));
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
            if (i11 < 0 || i14 >= 0 || (arrayList = zxVar.R1) == null) {
                zxVar.M4(false, true);
                return;
            }
            arrayList.remove(i11);
            zxVar.e0[0].y.D();
            zxVar.e0[0].q(true);
        }
    }

    public static void y0(zx zxVar) {
        org.telegram.messenger.y1 a2 = org.telegram.messenger.y1.a(zxVar.currentAccount);
        int i10 = a2.a;
        Set<String> set = a2.d;
        org.telegram.messenger.w1 w1Var = a2.c;
        if (w1Var != null && !set.contains(w1Var.a)) {
            set.add(a2.c.a);
            SharedPreferences.Editor edit = org.telegram.messenger.wp.r1(i10).f7.edit();
            edit.putStringSet("bday_hidden", set);
            edit.apply();
            org.telegram.messenger.at.f(i10).k(org.telegram.messenger.at.g5, new Object[0]);
        }
        org.telegram.messenger.wp.r1(zxVar.currentAccount).h4(0L, "BIRTHDAY_CONTACTS_TODAY");
        zxVar.g5();
        org.telegram.ui.Components.wb G = org.telegram.ui.Components.cc.a0(zxVar).G(R.raw.gift, 4, org.telegram.messenger.dd.L0(2131753330, null));
        G.j = 5000;
        G.j();
    }

    public static /* synthetic */ void z0(zx zxVar) {
        org.telegram.messenger.wp.r1(zxVar.currentAccount).h4(0L, "PREMIUM_RESTORE");
        zxVar.g5();
    }

    public final boolean A3(long j10) {
        int i10;
        int i11 = this.R0;
        if (i11 == 15 || i11 == 16 || this.h2 != null || !this.s2) {
            return true;
        }
        if (!org.telegram.messenger.o5.z(j10)) {
            if (!org.telegram.messenger.o5.C(j10)) {
                return true;
            }
            if (this.T0 == 0 && !this.U0) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String L0 = org.telegram.messenger.dd.L0(2131745613, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            int i12 = this.T0;
            if (i12 == 3) {
                x1Var.T = org.telegram.messenger.dd.L0(2131744115, null);
            } else if (i12 != 0) {
                x1Var.T = org.telegram.messenger.dd.L0(2131747191, null);
            } else {
                x1Var.T = org.telegram.messenger.dd.L0(2131749114, null);
            }
            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131747847, null), null);
            showDialog(x1Var);
            return false;
        }
        long j11 = -j10;
        TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(j11));
        if (!org.telegram.messenger.w3.T(L02) || L02.megagroup) {
            return true;
        }
        if (!this.q2) {
            TLRPC.Chat L03 = org.telegram.messenger.wp.r1(this.currentAccount).L0(Long.valueOf(j11));
            if ((org.telegram.messenger.w3.n(L03) || L03.megagroup) && (i10 = this.T0) != 2 && i10 != 3) {
                return true;
            }
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
        String L04 = org.telegram.messenger.dd.L0(2131745613, null);
        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
        x1Var2.R = L04;
        int i13 = this.T0;
        if (i13 == 3) {
            x1Var2.T = org.telegram.messenger.dd.L0(2131744116, null);
        } else if (i13 == 2) {
            x1Var2.T = org.telegram.messenger.dd.L0(2131746602, null);
        } else {
            x1Var2.T = org.telegram.messenger.dd.L0(2131752440, null);
        }
        alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131747847, null), null);
        showDialog(x1Var2);
        return false;
    }

    public final boolean A4(View view, int i10, float f7, org.telegram.ui.Components.tk0 tk0Var) {
        org.telegram.ui.Components.an0 an0Var;
        org.telegram.ui.Components.an0 an0Var2;
        long F;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.d3) && tk0Var.d(i10) != 21) {
            if (!this.actionBar.u() && !org.telegram.messenger.i0.Q1() && !this.l2 && (view instanceof org.telegram.ui.Cells.v2)) {
                org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view;
                if (!getMessagesController().s2(v2Var.getDialogId()) && !this.F3.c() && v2Var.Z(f7)) {
                    return T4(v2Var);
                }
            }
            ww wwVar = this.F3;
            if (wwVar == null || !wwVar.c()) {
                jx jxVar = this.C0;
                if (jxVar != null && tk0Var == (an0Var2 = jxVar.d0)) {
                    Object I = an0Var2.I(i10);
                    if (!this.C0.d0.N) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String L0 = org.telegram.messenger.dd.L0(2131752054, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        x1Var.R = L0;
                        if (I instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) I;
                            if (chat.monoforum) {
                                x1Var.T = org.telegram.messenger.dd.a0("ClearSearchSingleChatAlertText", null, 2131752053, gg.e.i(this.currentAccount, chat, false));
                            } else {
                                x1Var.T = org.telegram.messenger.dd.a0("ClearSearchSingleChatAlertText", null, 2131752053, chat.title);
                            }
                            F = -chat.id;
                        } else if (I instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) I;
                            if (user.id == getUserConfig().n) {
                                x1Var.T = org.telegram.messenger.dd.a0("ClearSearchSingleChatAlertText", null, 2131752053, org.telegram.messenger.dd.L0(2131745918, null));
                            } else {
                                x1Var.T = org.telegram.messenger.dd.a0("ClearSearchSingleUserAlertText", null, 2131752051, org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
                            }
                            F = user.id;
                        } else if (I instanceof TLRPC.EncryptedChat) {
                            TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(((TLRPC.EncryptedChat) I).user_id));
                            x1Var.T = org.telegram.messenger.dd.a0("ClearSearchSingleUserAlertText", null, 2131752051, org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name));
                            F = org.telegram.messenger.o5.F(r14.id);
                        }
                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131752055, null), new m4.x0(this, F, 6));
                        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                        showDialog(x1Var);
                        TextView textView = (TextView) x1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, getResourceProvider());
                        }
                        return true;
                    }
                }
                jx jxVar2 = this.C0;
                if (jxVar2 == null || tk0Var != (an0Var = jxVar2.d0)) {
                    Object J = ((zf.m) tk0Var).J(i10);
                    if (J instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                        if (this.l2) {
                            if ((this.R0 == 3 || U3()) && v5(dialog.id)) {
                                if (this.R0 != 1 || !U3() || !this.m2 || !getMessagesController().s2(dialog.id)) {
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
                                nb1 nb1Var = new nb1(bundle);
                                nb1Var.L0 = this;
                                presentFragment(nb1Var);
                                return false;
                            }
                        } else {
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                y4(view);
                                return false;
                            }
                            if (!this.actionBar.u() || !s4(dialog)) {
                                Y4(dialog.id, view);
                                return true;
                            }
                        }
                    }
                } else {
                    if (this.l2) {
                        z4(view, i10, tk0Var);
                        return false;
                    }
                    long dialogId = (!(view instanceof org.telegram.ui.Cells.k6) || an0Var.N(i10)) ? 0L : ((org.telegram.ui.Cells.k6) view).getDialogId();
                    if (dialogId != 0) {
                        Y4(dialogId, view);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void B3(boolean z10) {
        zh.j jVar;
        TLRPC.ChatFull chatFull;
        org.telegram.ui.Components.zr zrVar = this.J1;
        if (zrVar == null || (jVar = this.Q1) == null || (chatFull = this.a3) == null) {
            return;
        }
        zrVar.i(jVar, (this.Y2 == 0 || chatFull.requests_pending <= 0 || this.b.f) ? false : true, z10);
        this.Q1.setTitle(org.telegram.messenger.dd.G(this.a3.requests_pending, "CommunityPendingRequestsRow", new Object[0]));
    }

    public final void B4(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (org.telegram.messenger.e20.i(i10).p()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList, new f6(24));
        org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(this, view);
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
                int i12 = org.telegram.ui.ActionBar.t6.i6;
                Drawable a02 = org.telegram.ui.ActionBar.t6.a0(getThemedColor(i12), 0, 0);
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
                org.telegram.ui.ActionBar.p6 resourceProvider = getResourceProvider();
                linearLayout.setBackground(a02);
                org.telegram.ui.ActionBar.a7.k(linearLayout, a02, null, N, resourceProvider);
                TLRPC.User f7 = org.telegram.messenger.e20.i(intValue).f();
                org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                r8Var.r(f7);
                kg.x xVar = new kg.x(this, getParentActivity(), z10);
                linearLayout.addView(xVar, w7.b6.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(getParentActivity());
                if (z10) {
                    g9Var.setScaleX(0.833f);
                    g9Var.setScaleY(0.833f);
                }
                g9Var.setRoundRadius(org.telegram.messenger.i0.L(16.0f));
                g9Var.getImageReceiver().d = intValue;
                g9Var.e(f7, r8Var);
                xVar.addView(g9Var, w7.b6.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.j5, getResourceProvider());
                textView.setText(org.telegram.messenger.i20.p(f7));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, w7.b6.q(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new jg.w1(this, intValue, H, 14));
                H.r(linearLayout, w7.b6.o(org.telegram.messenger.at.G3, 48));
            }
        }
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(24.0f), getThemedColor(org.telegram.ui.ActionBar.t6.d6));
        d02.getPaint().setShadowLayer(org.telegram.messenger.i0.L(6.0f), 0.0f, org.telegram.messenger.i0.L(1.0f), org.telegram.ui.ActionBar.t6.r1(0.15f, -16777216));
        H.z.set(-org.telegram.messenger.i0.L(4.0f), -org.telegram.messenger.i0.L(4.0f), -org.telegram.messenger.i0.L(4.0f), -org.telegram.messenger.i0.L(4.0f));
        H.W(d02);
        H.a0(0.0f, -org.telegram.messenger.i0.L(4.0f));
        H.V(5);
        H.Z();
    }

    @Override // org.telegram.ui.nf0
    public final hi.f C() {
        return this.l4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e6, code lost:
    
        if (getMessagesController().b2.get(r14.W2) != false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0111 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C3(yx yxVar) {
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        int i10;
        int L0 = yxVar.c.L0();
        int N0 = yxVar.c.N0();
        if (this.h3 || this.m3) {
            return;
        }
        px pxVar = this.z0;
        if (pxVar != null && pxVar.getVisibility() == 0 && this.z0.O) {
            return;
        }
        int abs = Math.abs(N0 - L0) + 1;
        if (N0 != -1) {
            s4.c1 K = yxVar.a.K(N0);
            boolean z14 = K != null && K.f == 11;
            this.b2 = z14;
            if (z14) {
                o4(false);
            }
        } else {
            this.b2 = false;
        }
        int i11 = yxVar.s;
        if (i11 == 7 || i11 == 8) {
            ArrayList S0 = getMessagesController().S0();
            int i12 = yxVar.h;
            if (i12 >= 0 && i12 < S0.size()) {
                int i13 = ((org.telegram.messenger.bp) S0.get(yxVar.h)).g;
                int i14 = org.telegram.messenger.wp.D8;
                if ((i13 & 128) == 0 && ((abs > 0 && N0 >= d4(this.currentAccount, yxVar.s, 1, this.S1).size() - 10) || (abs == 0 && !getMessagesController().b2.get(1)))) {
                    boolean z15 = getMessagesController().b2.get(1);
                    boolean z16 = !z15;
                    z10 = (z15 && getMessagesController().c2.get(1)) ? false : true;
                    z11 = z16;
                    if (abs > 0 || N0 < d4(this.currentAccount, yxVar.s, this.W2, this.S1).size() - 10) {
                        if (abs == 0 && ((i10 = yxVar.s) == 7 || i10 == 8)) {
                        }
                        z12 = false;
                        z13 = false;
                        if (!z12 || z10) {
                            org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.yv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zx zxVar = zx.this;
                                    if (z12) {
                                        zxVar.getMessagesController().S2(zxVar.W2, -1, 100, z13, null);
                                    }
                                    if (z10) {
                                        zxVar.getMessagesController().S2(1, -1, 100, z11, null);
                                    }
                                }
                            });
                        }
                        return;
                    }
                    boolean z17 = getMessagesController().b2.get(this.W2);
                    boolean z18 = !z17;
                    if (z17) {
                        if (getMessagesController().c2.get(this.W2)) {
                            z13 = z18;
                            z12 = false;
                            if (z12) {
                            }
                            org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.yv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zx zxVar = zx.this;
                                    if (z12) {
                                        zxVar.getMessagesController().S2(zxVar.W2, -1, 100, z13, null);
                                    }
                                    if (z10) {
                                        zxVar.getMessagesController().S2(1, -1, 100, z11, null);
                                    }
                                }
                            });
                        }
                    }
                    z13 = z18;
                    z12 = true;
                    if (z12) {
                    }
                    org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.yv
                        @Override // java.lang.Runnable
                        public final void run() {
                            zx zxVar = zx.this;
                            if (z12) {
                                zxVar.getMessagesController().S2(zxVar.W2, -1, 100, z13, null);
                            }
                            if (z10) {
                                zxVar.getMessagesController().S2(1, -1, 100, z11, null);
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
        org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.yv
            @Override // java.lang.Runnable
            public final void run() {
                zx zxVar = zx.this;
                if (z12) {
                    zxVar.getMessagesController().S2(zxVar.W2, -1, 100, z13, null);
                }
                if (z10) {
                    zxVar.getMessagesController().S2(1, -1, 100, z11, null);
                }
            }
        });
    }

    public final void C4(int i10, long j10, TLRPC.Chat chat, boolean z10, boolean z11) {
        if (i10 == 103) {
            getMessagesController().X(1, j10, z11);
            return;
        }
        if (chat == null) {
            getMessagesController().X(0, j10, z11);
            if (z10 && z11) {
                getMessagesController().w(j10);
            }
        } else if (org.telegram.messenger.w3.r0(chat)) {
            getMessagesController().X(0, j10, z11);
        } else {
            getMessagesController().g0(-j10, getMessagesController().Z1(Long.valueOf(getUserConfig().e())), null, z11, false);
        }
        if (org.telegram.messenger.i0.Q1()) {
            getNotificationCenter().k(org.telegram.messenger.at.t, Long.valueOf(j10));
        }
        getMessagesController().J(this.W2);
    }

    public final void D3() {
        getMessagesStorage().getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x0950  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x09a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D4(ArrayList arrayList, int i10, boolean z10, boolean z11, HashSet hashSet) {
        boolean z12;
        int i11;
        int i12;
        int i13;
        HashSet hashSet2;
        ArrayList arrayList2;
        long j10;
        int i14;
        int i15;
        Long l4;
        int i16;
        TLRPC.Chat L0;
        TLRPC.EncryptedChat encryptedChat;
        TLRPC.User user;
        TLRPC.User Z1;
        int i17;
        org.telegram.messenger.bp bpVar;
        int i18;
        zx zxVar;
        char c10;
        int i19;
        int i20;
        long j11;
        boolean z13;
        boolean z14;
        int i21;
        org.telegram.ui.ActionBar.z2 z2Var;
        float f7;
        boolean z15;
        int i22;
        TLRPC.User Z12;
        TLRPC.User user2;
        String L02;
        zx zxVar2 = this;
        int i23 = i10;
        if (zxVar2.getParentActivity() == null) {
            return;
        }
        int i24 = 0;
        int i25 = zxVar2.e0[0].s;
        int i26 = 1;
        boolean z16 = (i25 == 7 || i25 == 8) && (!zxVar2.actionBar.u() || zxVar2.actionBar.w(null));
        org.telegram.messenger.bp bpVar2 = z16 ? zxVar2.getMessagesController().M[zxVar2.e0[0].s == 8 ? (char) 1 : (char) 0] : null;
        int size = arrayList.size();
        if (i23 == 105 || i23 == 107) {
            ArrayList arrayList3 = new ArrayList(arrayList);
            zxVar2.getMessagesController().e(arrayList3, zxVar2.T2 == 0 ? 1 : 0, -1, null, 0L);
            if (zxVar2.T2 == 0) {
                SharedPreferences d12 = org.telegram.messenger.wp.d1();
                z12 = false;
                boolean z17 = d12.getBoolean("archivehint_l", false) || org.telegram.messenger.uz.q1;
                if (z17) {
                    i11 = 1;
                } else {
                    i11 = 1;
                    d12.edit().putBoolean("archivehint_l", true).commit();
                }
                int i27 = z17 ? arrayList3.size() > i11 ? 4 : 2 : arrayList3.size() > i11 ? 5 : 3;
                UndoView k42 = zxVar2.k4();
                if (k42 != null) {
                    k42.l(0L, i27, null, new org.telegram.ui.Components.voip.u(7, zxVar2, arrayList3));
                }
            } else {
                z12 = false;
                ArrayList V0 = zxVar2.getMessagesController().V0(zxVar2.W2);
                if (zxVar2.e0 != null && V0.isEmpty() && !zxVar2.K) {
                    zxVar2.e0[0].a.setEmptyView(null);
                    zxVar2.e0[0].x.setVisibility(4);
                    zxVar2.finishFragment();
                }
            }
            zxVar2.n4(z12);
            return;
        }
        if ((i23 == 100 || i23 == 108) && zxVar2.O2 != 0) {
            i12 = 100;
            ArrayList V02 = zxVar2.getMessagesController().V0(zxVar2.W2);
            int size2 = V02.size();
            int i28 = 0;
            int i29 = 0;
            for (int i30 = 0; i30 < size2; i30++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) V02.get(i30);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (!zxVar2.s4(dialog)) {
                        if (!zxVar2.getMessagesController().B2(dialog.id, false)) {
                            break;
                        }
                    } else if (org.telegram.messenger.o5.C(dialog.id)) {
                        i29++;
                    } else {
                        i28++;
                    }
                }
            }
            int i31 = 0;
            int i32 = 0;
            int i33 = 0;
            for (int i34 = 0; i34 < size; i34++) {
                Long l10 = (Long) arrayList.get(i34);
                long longValue = l10.longValue();
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) zxVar2.getMessagesController().Q.f(longValue);
                if (dialog2 != null && !zxVar2.s4(dialog2)) {
                    if (org.telegram.messenger.o5.C(longValue)) {
                        i32++;
                    } else {
                        i31++;
                    }
                    if (bpVar2 != null && bpVar2.h.contains(l10)) {
                        i33++;
                    }
                }
            }
            if (z16) {
                i13 = 100 - bpVar2.h.size();
            } else if (zxVar2.W2 == 0 && bpVar2 == null) {
                i13 = zxVar2.getUserConfig().q() ? zxVar2.getMessagesController().R4 : zxVar2.getMessagesController().Q4;
            } else {
                i13 = org.telegram.messenger.e20.i(zxVar2.currentAccount).q() ? zxVar2.getMessagesController().l3 : zxVar2.getMessagesController().k3;
            }
            if (i32 + i29 > i13 || (i31 + i28) - i33 > i13) {
                if (zxVar2.W2 == 0 && bpVar2 == null) {
                    showDialog(new kg.q0(0, zxVar2.currentAccount, zxVar2.getParentActivity(), this, null));
                    return;
                } else {
                    org.telegram.ui.Components.s4.t0(zxVar2, null, org.telegram.messenger.dd.a0("PinFolderLimitReached", null, 2131747263, org.telegram.messenger.dd.G(i13, "Chats", new Object[0])), null);
                    return;
                }
            }
            hashSet2 = hashSet;
            arrayList2 = arrayList;
        } else {
            i12 = 100;
            if (i23 != 111) {
                hashSet2 = hashSet;
                arrayList2 = arrayList;
                if ((i23 == 102 || i23 == 103) && size > 1 && z10) {
                    HashSet hashSet3 = new HashSet();
                    boolean z18 = org.telegram.messenger.wp.r1(zxVar2.currentAccount).c3;
                    long j12 = org.telegram.messenger.wp.r1(zxVar2.currentAccount).b3;
                    if (i23 == 102 && z18 && j12 == 2147483647L) {
                        int size3 = arrayList2.size();
                        z15 = false;
                        int i35 = 0;
                        while (i35 < size3) {
                            Object obj = arrayList2.get(i35);
                            i35++;
                            Long l11 = (Long) obj;
                            if (org.telegram.messenger.o5.E(l11.longValue()) || org.telegram.messenger.o5.C(l11.longValue())) {
                                if (org.telegram.messenger.o5.C(l11.longValue())) {
                                    TLRPC.EncryptedChat Z0 = zxVar2.getMessagesController().Z0(Integer.valueOf((int) (l11.longValue() & 4294967295L)));
                                    Z12 = Z0 != null ? zxVar2.getMessagesController().Z1(Long.valueOf(Z0.user_id)) : null;
                                } else {
                                    Z12 = zxVar2.getMessagesController().Z1(l11);
                                }
                                if (Z12 != null) {
                                    ArrayList arrayList4 = (ArrayList) org.telegram.messenger.wp.r1(zxVar2.currentAccount).R.f(Z12.id);
                                    boolean z19 = (arrayList4 == null || arrayList4.size() != 1 || arrayList4.get(0) == null || ((org.telegram.messenger.kj) arrayList4.get(0)).k == null || (!(((org.telegram.messenger.kj) arrayList4.get(0)).k.action instanceof TLRPC.TL_messageActionUserJoined) && !(((org.telegram.messenger.kj) arrayList4.get(0)).k.action instanceof TLRPC.TL_messageActionContactSignUp))) ? false : true;
                                    if (!Z12.bot && !org.telegram.messenger.i20.x(Z12) && Z12.id != zxVar2.getUserConfig().e() && !z19) {
                                        hashSet3.add(l11);
                                        z15 = true;
                                    }
                                }
                            }
                        }
                        f7 = 8.0f;
                    } else {
                        f7 = 8.0f;
                        z15 = false;
                    }
                    boolean z20 = i23 == 102;
                    int i36 = zxVar2.R2;
                    mg.i0 i0Var = new mg.i0(zxVar2, arrayList2, i23, hashSet3);
                    org.telegram.ui.ActionBar.p6 p6Var = zxVar2.resourceProvider;
                    Pattern pattern = org.telegram.ui.Components.s4.a;
                    int currentAccount = zxVar2.getCurrentAccount();
                    Activity parentActivity = zxVar2.getParentActivity();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, p6Var);
                    org.telegram.messenger.e20.i(currentAccount).e();
                    org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
                    boolean[] zArr = new boolean[1];
                    TextView textView = new TextView(parentActivity);
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.j5, null);
                    textView.setTextSize(1, 16.0f);
                    textView.setGravity((org.telegram.messenger.dd.X ? 5 : 3) | 48);
                    org.telegram.ui.Components.g3 g3Var = new org.telegram.ui.Components.g3(parentActivity, c2VarArr, i24);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                    x1Var.G = 6;
                    alertDialog$Builder.o(g3Var);
                    TextView textView2 = new TextView(parentActivity);
                    boolean z21 = z20;
                    org.telegram.messenger.m5.m(textView2, org.telegram.ui.ActionBar.t6.E8, null, 1, 20.0f);
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setGravity((org.telegram.messenger.dd.X ? 5 : 3) | 16);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    if (z21) {
                        if (z15) {
                            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, parentActivity, p6Var);
                            c2VarArr[0] = c2Var;
                            c2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                            c2VarArr[0].e(org.telegram.messenger.dd.L0(2131751528, null), "", false, false, false);
                            org.telegram.ui.Cells.c2 c2Var2 = c2VarArr[0];
                            i22 = 0;
                            c2Var2.setPadding(org.telegram.messenger.dd.X ? org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(f7), 0, org.telegram.messenger.dd.X ? org.telegram.messenger.i0.L(f7) : org.telegram.messenger.i0.L(16.0f), 0);
                            g3Var.addView(c2VarArr[0], w7.b6.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                            c2VarArr[0].setOnClickListener(new org.telegram.ui.Components.x0(i22, zArr));
                        } else {
                            i22 = 0;
                        }
                        Object[] objArr = new Object[1];
                        objArr[i22] = org.telegram.messenger.dd.G(size, "ChatsSelected", new Object[i22]);
                        textView2.setText(org.telegram.messenger.dd.a0("DeleteFewChatsTitle", null, 2131751542, objArr));
                        textView.setText(org.telegram.messenger.dd.L0(2131754102, "AreYouSureDeleteFewChats"));
                    } else if (i36 != 0) {
                        textView2.setText(org.telegram.messenger.dd.a0("ClearCacheFewChatsTitle", null, 2131752097, org.telegram.messenger.dd.G(size, "ChatsSelectedClearCache", new Object[0])));
                        textView.setText(org.telegram.messenger.dd.L0(2131754115, "AreYouSureClearHistoryCacheFewChats"));
                    } else {
                        textView2.setText(org.telegram.messenger.dd.a0("ClearFewChatsTitle", null, 2131752092, org.telegram.messenger.dd.G(size, "ChatsSelectedClear", new Object[0])));
                        textView.setText(org.telegram.messenger.dd.L0(2131754113, "AreYouSureClearHistoryFewChats"));
                    }
                    g3Var.addView(textView2, w7.b6.d(-1, -2.0f, (org.telegram.messenger.dd.X ? 5 : 3) | 48, 24.0f, 11.0f, 24.0f, 0.0f));
                    g3Var.addView(textView, w7.b6.d(-2, -2.0f, (org.telegram.messenger.dd.X ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                    alertDialog$Builder.k(z21 ? org.telegram.messenger.dd.L0(2131751599, "Delete") : i36 != 0 ? org.telegram.messenger.dd.L0(2131752088, "ClearHistoryCache") : org.telegram.messenger.dd.L0(2131752089, "ClearHistory"), new ng.d(23, i0Var, zArr));
                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, "Cancel"), null);
                    zxVar2.showDialog(x1Var);
                    TextView textView3 = (TextView) x1Var.d(-1);
                    if (textView3 != null) {
                        org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.q7, null);
                        return;
                    }
                    return;
                }
                int i37 = 48;
                if (i23 == 106 && z10) {
                    if (size == 1) {
                        Long l12 = (Long) arrayList2.get(0);
                        l12.getClass();
                        user2 = zxVar2.getMessagesController().Z1(l12);
                    } else {
                        user2 = null;
                    }
                    boolean z22 = zxVar2.S2 != 0;
                    qv qvVar = new qv(0, zxVar2, arrayList2);
                    Pattern pattern2 = org.telegram.ui.Components.s4.a;
                    if (zxVar2.getParentActivity() != null) {
                        if (size == 1 && user2 == null) {
                            return;
                        }
                        Activity parentActivity2 = zxVar2.getParentActivity();
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity2);
                        org.telegram.ui.Cells.c2[] c2VarArr2 = new org.telegram.ui.Cells.c2[2];
                        LinearLayout linearLayout = new LinearLayout(parentActivity2);
                        linearLayout.setOrientation(1);
                        alertDialog$Builder2.o(linearLayout);
                        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                        if (size == 1) {
                            String m10 = org.telegram.messenger.i5.m(0, user2.first_name, user2.last_name);
                            x1Var2.R = org.telegram.messenger.dd.a0("BlockUserTitle", null, 2131753685, m10);
                            L02 = org.telegram.messenger.dd.L0(2131753692, null);
                            x1Var2.T = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("BlockUserMessage", null, 2131753688, m10));
                        } else {
                            x1Var2.R = org.telegram.messenger.dd.a0("BlockUserTitle", null, 2131753685, org.telegram.messenger.dd.G(size, "UsersCountTitle", new Object[0]));
                            L02 = org.telegram.messenger.dd.L0(2131753684, null);
                            x1Var2.T = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("BlockUsersMessage", null, 2131753683, org.telegram.messenger.dd.G(size, "UsersCount", new Object[0])));
                        }
                        int i38 = 2;
                        boolean[] zArr2 = {true, true};
                        int i39 = 0;
                        while (i39 < i38) {
                            if (i39 != 0 || z22) {
                                org.telegram.ui.Cells.c2 c2Var3 = new org.telegram.ui.Cells.c2(parentActivity2, i26);
                                c2VarArr2[i39] = c2Var3;
                                c2Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                                if (i39 == 0) {
                                    c2VarArr2[i39].e(org.telegram.messenger.dd.L0(2131746217, null), "", true, false, false);
                                } else {
                                    c2VarArr2[i39].e(org.telegram.messenger.dd.L0(size == i26 ? 2131751482 : 2131751484, null), "", true, false, false);
                                }
                                c2VarArr2[i39].setPadding(org.telegram.messenger.dd.X ? org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.dd.X ? org.telegram.messenger.i0.L(8.0f) : org.telegram.messenger.i0.L(16.0f), 0);
                                linearLayout.addView(c2VarArr2[i39], w7.b6.o(-1, i37));
                                c2VarArr2[i39].setOnClickListener(new bh.f(zArr2, i39, 5));
                            }
                            i39++;
                            i38 = 2;
                            i26 = 1;
                            i37 = 48;
                        }
                        alertDialog$Builder2.k(L02, new ng.d(25, qvVar, zArr2));
                        alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                        zxVar2.showDialog(x1Var2);
                        TextView textView4 = (TextView) x1Var2.d(-1);
                        if (textView4 != null) {
                            org.telegram.ui.ActionBar.a7.V(textView4, org.telegram.ui.ActionBar.t6.q7, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else {
                if (z10) {
                    org.telegram.ui.Components.s4.u0(this, org.telegram.messenger.dd.L0(2131751846, null), org.telegram.messenger.dd.L0(2131751844, null), org.telegram.messenger.dd.L0(2131751845, null), true, new pv(zxVar2, arrayList, i23, z11, hashSet));
                    return;
                }
                hashSet2 = hashSet;
                arrayList2 = arrayList;
                int size4 = arrayList2.size();
                int i40 = 0;
                while (i40 < size4) {
                    Object obj2 = arrayList2.get(i40);
                    i40++;
                    zxVar2.getMessagesController().b5(-((Long) obj2).longValue(), false);
                }
            }
        }
        int i41 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (bpVar2 != null) {
            LongSparseIntArray longSparseIntArray = bpVar2.j;
            if ((i23 == i12 || i23 == 108) && zxVar2.O2 != 0) {
                int size5 = longSparseIntArray.size();
                for (int i42 = 0; i42 < size5; i42++) {
                    i41 = Math.min(i41, longSparseIntArray.valueAt(i42));
                }
                i41 -= zxVar2.O2;
            }
        }
        int i43 = i41;
        int i44 = 0;
        int i45 = 0;
        while (i44 < size) {
            Long l13 = (Long) arrayList2.get(i44);
            long longValue2 = l13.longValue();
            TLRPC.Dialog dialog3 = (TLRPC.Dialog) zxVar2.getMessagesController().Q.f(longValue2);
            if (dialog3 == null) {
                i17 = i23;
                i18 = i43;
                bpVar = bpVar2;
            } else {
                if (org.telegram.messenger.o5.C(longValue2)) {
                    encryptedChat = zxVar2.getMessagesController().Z0(Integer.valueOf((int) (longValue2 & 4294967295L)));
                    if (encryptedChat != null) {
                        l4 = l13;
                        Z1 = zxVar2.getMessagesController().Z1(Long.valueOf(encryptedChat.user_id));
                    } else {
                        l4 = l13;
                        Z1 = new TLRPC.TL_userEmpty();
                    }
                    i16 = i43;
                } else {
                    l4 = l13;
                    if (org.telegram.messenger.o5.E(longValue2)) {
                        Z1 = zxVar2.getMessagesController().Z1(l4);
                        i16 = i43;
                        encryptedChat = null;
                    } else {
                        i16 = i43;
                        L0 = zxVar2.getMessagesController().L0(Long.valueOf(-longValue2));
                        encryptedChat = null;
                        user = null;
                        if (L0 == null || user != null) {
                            boolean z23 = user == null && user.bot && !org.telegram.messenger.wp.E2(user);
                            TLRPC.Chat chat = L0;
                            if (i23 != 100 || i23 == 108) {
                                i17 = i23;
                                if (zxVar2.O2 == 0) {
                                    if (!zxVar2.s4(dialog3)) {
                                        i45++;
                                        bpVar = bpVar2;
                                        TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                        i18 = i16;
                                        zxVar2.E4(longValue2, true, bpVar, i18, size == 1);
                                        if (bpVar != null) {
                                            int i46 = i18 + 1;
                                            if (encryptedChat2 != null) {
                                                if (!bpVar.h.contains(Long.valueOf(encryptedChat2.user_id))) {
                                                    bpVar.h.add(Long.valueOf(encryptedChat2.user_id));
                                                }
                                            } else if (!bpVar.h.contains(Long.valueOf(dialog3.id))) {
                                                bpVar.h.add(Long.valueOf(dialog3.id));
                                            }
                                            i18 = i46;
                                        }
                                    }
                                    bpVar = bpVar2;
                                    i18 = i16;
                                } else {
                                    bpVar = bpVar2;
                                    i18 = i16;
                                    if (zxVar2.s4(dialog3)) {
                                        i45++;
                                        zxVar2.E4(longValue2, false, bpVar, i18, size == 1);
                                        i44++;
                                        bpVar2 = bpVar;
                                        i43 = i18;
                                        i23 = i17;
                                    }
                                }
                                i44++;
                                bpVar2 = bpVar;
                                i43 = i18;
                                i23 = i17;
                            } else if (i23 != 101) {
                                if (i23 == 102) {
                                    zxVar = zxVar2;
                                    c10 = 5;
                                    i19 = 1;
                                } else if (i23 == 103) {
                                    zxVar = zxVar2;
                                    c10 = 5;
                                    i19 = 1;
                                } else if (i23 == 104) {
                                    int i47 = 1;
                                    if (size == 1 && zxVar2.P2 == 1) {
                                        zx zxVar3 = zxVar2;
                                        zxVar3.showDialog(org.telegram.ui.Components.s4.E(longValue2, 0L, zxVar3, null), new nv(zxVar3, i47));
                                        return;
                                    }
                                    zx zxVar4 = zxVar2;
                                    if (zxVar4.Q2 != 0) {
                                        if (zxVar4.getMessagesController().q2(longValue2, 0L, null)) {
                                            zxVar4.getNotificationsController().T(longValue2, 4, 0L);
                                        }
                                        i17 = i23;
                                        zxVar2 = zxVar4;
                                        bpVar = bpVar2;
                                        i18 = i16;
                                    } else {
                                        if (z11) {
                                            Pattern pattern3 = org.telegram.ui.Components.s4.a;
                                            if (zxVar4.getParentActivity() == null) {
                                                z2Var = null;
                                                i21 = 2;
                                            } else {
                                                org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.a30.h(zxVar4.getParentActivity(), false, 1, null);
                                                h.O = org.telegram.messenger.dd.L0(2131747940, null);
                                                h.P = true;
                                                i21 = 2;
                                                CharSequence[] charSequenceArr = {org.telegram.messenger.dd.a0("MuteFor", null, 2131748327, org.telegram.messenger.dd.G(1, "Hours", new Object[0])), org.telegram.messenger.dd.a0("MuteFor", null, 2131748327, org.telegram.messenger.dd.G(8, "Hours", new Object[0])), org.telegram.messenger.dd.a0("MuteFor", null, 2131748327, org.telegram.messenger.dd.G(2, "Days", new Object[0])), org.telegram.messenger.dd.L0(2131748328, null)};
                                                eg.j jVar = new eg.j(5, arrayList2, zxVar4);
                                                h.L = charSequenceArr;
                                                h.K = jVar;
                                                z2Var = h;
                                            }
                                            zxVar4.showDialog(z2Var, new nv(zxVar4, i21));
                                            return;
                                        }
                                        if (!zxVar4.getMessagesController().q2(longValue2, 0L, null)) {
                                            zxVar4.getNotificationsController().T(longValue2, 3, 0L);
                                        }
                                        zxVar2 = zxVar4;
                                        bpVar = bpVar2;
                                        i18 = i16;
                                        i17 = i23;
                                        i44++;
                                        bpVar2 = bpVar;
                                        i43 = i18;
                                        i23 = i17;
                                    }
                                }
                                if (size == i19) {
                                    if (i23 != 102 || !zxVar.V2) {
                                        org.telegram.ui.Components.s4.r(this, i23 == 103, chat, user, org.telegram.messenger.o5.C(dialog3.id), i23 == 102, false, false, new rv(zxVar, i23, chat, longValue2, z23));
                                        return;
                                    }
                                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(zxVar.getParentActivity());
                                    String L03 = org.telegram.messenger.dd.L0(2131746612, null);
                                    org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder3.a;
                                    x1Var3.R = L03;
                                    x1Var3.T = org.telegram.messenger.dd.L0(2131746613, null);
                                    alertDialog$Builder3.k(org.telegram.messenger.dd.L0(2131746614, null), new hv(zxVar, 7));
                                    alertDialog$Builder3.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                                    zxVar.showDialog(x1Var3);
                                    return;
                                }
                                boolean z24 = z23;
                                zxVar2 = zxVar;
                                int i48 = i23;
                                if (zxVar2.getMessagesController().B2(longValue2, true)) {
                                    zxVar2.getMessagesController().i2();
                                    i17 = i48;
                                    bpVar = bpVar2;
                                    i18 = i16;
                                    i44++;
                                    bpVar2 = bpVar;
                                    i43 = i18;
                                    i23 = i17;
                                } else if (i48 != 103 || zxVar2.R2 == 0) {
                                    if (hashSet2 == null || !hashSet2.contains(l4)) {
                                        i20 = i48;
                                        j11 = longValue2;
                                        z13 = z24;
                                        z14 = false;
                                    } else {
                                        i20 = i48;
                                        j11 = longValue2;
                                        z13 = z24;
                                        z14 = true;
                                    }
                                    zxVar2.C4(i20, j11, chat, z13, z14);
                                    i17 = i20;
                                    bpVar = bpVar2;
                                    i18 = i16;
                                    i44++;
                                    bpVar2 = bpVar;
                                    i43 = i18;
                                    i23 = i17;
                                } else {
                                    zxVar2.getMessagesController().X(2, longValue2, false);
                                    bpVar = bpVar2;
                                    i18 = i16;
                                    i17 = i48;
                                    i44++;
                                    bpVar2 = bpVar;
                                    i43 = i18;
                                    i23 = i17;
                                }
                            } else if (zxVar2.N2 != 0) {
                                zxVar2.v4(longValue2);
                            } else {
                                zxVar2.getMessagesController().i3(longValue2, null, 0L);
                            }
                        }
                        i17 = i23;
                        bpVar = bpVar2;
                        i18 = i16;
                    }
                }
                user = Z1;
                L0 = null;
                if (L0 == null) {
                }
                if (user == null) {
                }
                TLRPC.Chat chat2 = L0;
                if (i23 != 100) {
                }
                i17 = i23;
                if (zxVar2.O2 == 0) {
                }
                i44++;
                bpVar2 = bpVar;
                i43 = i18;
                i23 = i17;
            }
            i44++;
            bpVar2 = bpVar;
            i43 = i18;
            i23 = i17;
        }
        int i49 = i23;
        org.telegram.messenger.bp bpVar3 = bpVar2;
        if (i49 == 104 && (size != 1 || zxVar2.P2 != 1)) {
            org.telegram.ui.Components.cc.A(zxVar2, zxVar2.Q2 == 0, null).j();
        }
        if (i49 == 100 || i49 == 108) {
            if (bpVar3 != null) {
                h00.z0(bpVar3, bpVar3.g, bpVar3.b, bpVar3.c, bpVar3.n, bpVar3.m, bpVar3.h, bpVar3.i, bpVar3.j, false, false, true, true, false, this, null);
                zxVar2 = this;
                j10 = 0;
            } else {
                j10 = 0;
                zxVar2.getMessagesController().j4(zxVar2.W2, 0L, null);
            }
            UndoView k43 = zxVar2.k4();
            if (zxVar2.q3 && k43 != null) {
                k43.m(j10, Integer.valueOf(i45), zxVar2.O2 != 0 ? 78 : 79);
            }
            i14 = i10;
            i15 = org.telegram.messenger.at.t1;
        } else {
            i15 = 108;
            i14 = i49;
        }
        zxVar2.n4((i14 == i15 || i14 == 100 || i14 == 102) ? false : true);
    }

    @Override // fe.e
    public final void E(float f7, int i10) {
        org.telegram.ui.ActionBar.t0 t0Var;
        if (i10 != 3 || (t0Var = this.l0) == null) {
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) t0Var.getIconView().getDrawable();
        if (!this.d.f) {
            animatedVectorDrawable.reset();
            return;
        }
        animatedVectorDrawable.start();
        if (org.telegram.messenger.uz.o() != 0) {
            TLRPC.TL_help_premiumPromo tL_help_premiumPromo = org.telegram.messenger.vi.b0(this.currentAccount).D;
            String q02 = PremiumPreviewFragment.q0(2);
            if (tL_help_premiumPromo != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= tL_help_premiumPromo.video_sections.size()) {
                        i11 = -1;
                        break;
                    } else if (tL_help_premiumPromo.video_sections.get(i11).equals(q02)) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 != -1) {
                    org.telegram.messenger.b8.G(this.currentAccount).X(tL_help_premiumPromo.videos.get(i11), tL_help_premiumPromo, 3, 0);
                }
            }
        }
    }

    public final void E3() {
        if (this.e0 == null) {
            return;
        }
        int w32 = w3();
        int i10 = 0;
        while (true) {
            yx[] yxVarArr = this.e0;
            if (i10 >= yxVarArr.length) {
                return;
            }
            yx yxVar = yxVarArr[i10];
            if (yxVar != null) {
                vx vxVar = yxVar.a;
                vxVar.setPadding(0, vxVar.f3, 0, w32);
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E4(long j10, boolean z10, org.telegram.messenger.bp bpVar, int i10, boolean z11) {
        boolean z12;
        int i11;
        boolean y3;
        boolean z13;
        int i12 = (this.e0[0].s == 0 && l4() && this.e0[0].w == 2) ? 1 : 0;
        int L0 = this.e0[0].c.L0();
        if (bpVar != null) {
            int i13 = bpVar.j.get(j10, TLObject.FLAG_31);
            if (!z10 && i13 == Integer.MIN_VALUE) {
                return;
            }
        }
        int i14 = -1;
        if (L0 > i12 || !z11) {
            z12 = true;
        } else {
            M4(true, true);
            z3();
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
        if (bpVar != null) {
            LongSparseIntArray longSparseIntArray = bpVar.j;
            if (z10) {
                longSparseIntArray.put(j10, i10);
            } else {
                longSparseIntArray.delete(j10);
            }
            if (z11) {
                getMessagesController().t3(bpVar);
            }
            y3 = true;
        } else {
            y3 = getMessagesController().y3(j10, z10, null, -1L);
        }
        if (y3) {
            if (z12) {
                if (this.R0 != 10) {
                    o4(false);
                }
                J4(true, false);
            } else {
                ArrayList d42 = d4(this.currentAccount, this.e0[0].s, this.W2, false);
                int i16 = 0;
                while (true) {
                    if (i16 >= d42.size()) {
                        break;
                    }
                    if (((TLRPC.Dialog) d42.get(i16)).id == j10) {
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
                this.e0[0].y.D();
                this.e0[0].q(true);
                yx yxVar = this.e0[0];
                yxVar.c.h1((yxVar.s == 0 && l4() && this.e0[0].w == 2) ? 1 : 0, (int) this.N);
            } else if (i14 >= 0 && i11 == i14) {
                org.telegram.messenger.i0.h3(new ev(this, 13), 200L);
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

    public final void F3() {
        zg.e eVar = this.y1;
        if (eVar != null) {
            eVar.setBlurredBottomHeight(this.y1.getInputBubbleHeight() + this.w.d() + org.telegram.messenger.i0.L(9.0f) + org.telegram.messenger.i0.L(7.0f));
        }
    }

    public final void F4() {
        if (this.K0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.t6.d6));
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / org.telegram.messenger.at.K2));
        this.K0.setBackground(new BitmapDrawable(createBitmap));
        this.K0.setAlpha(0.0f);
        this.K0.setVisibility(0);
        N3();
    }

    @Override // fg.b
    public final List G() {
        return Arrays.asList(new fg.a(org.telegram.messenger.dd.L0(2131751649, null)), new fg.a(org.telegram.messenger.dd.L0(2131752076, null), new ev(this, 14)), new fg.a(org.telegram.messenger.dd.L0(2131751650, null), new ev(this, 15)));
    }

    public final void G3() {
        yx yxVar;
        float e42 = e4(true);
        px pxVar = this.z0;
        if (pxVar != null) {
            boolean z10 = pxVar.getAlpha() != e42;
            float T1 = org.telegram.messenger.i0.T1(0.98f, 1.0f, e42);
            this.z0.setAlpha(e42);
            this.z0.setScaleX(T1);
            this.z0.setScaleY(T1);
            this.z0.setVisibility(e42 > 0.0f ? 0 : 8);
            if (z10 && (yxVar = this.e0[0]) != null) {
                yxVar.a.requestLayout();
            }
        }
        e5();
    }

    public final void G4(yx yxVar) {
        int i10;
        if (yxVar.getVisibility() != 0) {
            return;
        }
        int i11 = yxVar.d.w;
        if (yxVar.s == 0 && l4() && yxVar.a.getChildCount() == 0 && yxVar.w == 2) {
            ((s4.a0) yxVar.a.getLayoutManager()).h1(1, (int) this.N);
        }
        yxVar.d.getClass();
        yxVar.d.V();
        int b10 = yxVar.d.b();
        if (b10 == 1 && i11 == 1 && yxVar.d.d(0) == 5) {
            yxVar.q(true);
        } else {
            yxVar.q(false);
            if (b10 > i11 && (i10 = this.R0) != 11 && i10 != 12 && i10 != 13) {
                yxVar.D.b(i11);
            }
        }
        try {
            yxVar.a.setEmptyView((this.W2 == 0 && this.Y2 == 0) ? yxVar.x : null);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        C3(yxVar);
    }

    public final void H3() {
        float f7 = this.n.e;
        float T1 = org.telegram.messenger.i0.T1(0.2f, 1.0f, f7);
        bi.f2 f2Var = this.C1;
        if (f2Var != null) {
            f2Var.setScaleX(T1);
            this.C1.setScaleY(T1);
            this.C1.setAlpha(f7);
            this.C1.setVisibility(f7 > 0.0f ? 0 : 8);
        }
        zg.e eVar = this.y1;
        if (eVar != null) {
            eVar.setAlpha(f7);
            this.y1.setVisibility(f7 > 0.0f ? 0 : 8);
            this.y1.getFadeView().setAlpha(f7);
            this.y1.getFadeView().setVisibility(f7 > 0.0f ? 0 : 8);
        }
    }

    public final void H4() {
        boolean z10;
        if (this.N == 0.0f || (z10 = this.K)) {
            return;
        }
        float f7 = z10 ? -g4() : 0.0f;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.G3, f7));
        animatorSet.setInterpolator(org.telegram.ui.Components.gr.f);
        animatorSet.setDuration(250L);
        animatorSet.start();
    }

    public final void I3() {
        if (this.actionBar == null) {
            return;
        }
        float f7 = 1.0f - this.b.e;
        float h42 = 1.0f - h4();
        org.telegram.ui.Components.f10.d(this.actionBar.getBackButton(), Math.max(this.u3, f7 * h42 * (1.0f - this.c.e)));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I4(int i10) {
        org.telegram.ui.Components.pz pzVar;
        if (this.z0 == null) {
            i5(true, true);
            if (this.z0 == null) {
                return;
            }
        }
        int tabsCount = this.z0.getTabsCount() - 1;
        ArrayList S0 = getMessagesController().S0();
        int i11 = 0;
        while (true) {
            if (i11 >= S0.size()) {
                break;
            }
            if (((org.telegram.messenger.bp) S0.get(i11)).a == i10) {
                tabsCount = i11;
                break;
            }
            i11++;
        }
        px pxVar = this.z0;
        if (tabsCount < 0) {
            pxVar.getClass();
        } else if (tabsCount < pxVar.getTabsCount()) {
            pzVar = (org.telegram.ui.Components.pz) pxVar.h.get(tabsCount);
            if (pzVar != null) {
                px pxVar2 = this.z0;
                ArrayList arrayList = pxVar2.h;
                if (arrayList.isEmpty()) {
                    return;
                }
                pxVar2.f((org.telegram.ui.Components.pz) i0.a.g(1, arrayList), arrayList.size() - 1);
                return;
            }
            yx[] yxVarArr = this.e0;
            if (yxVarArr == null || yxVarArr.length <= 0 || yxVarArr[0].h != pzVar.a) {
                this.z0.f(pzVar, tabsCount);
                return;
            }
            return;
        }
        pzVar = null;
        if (pzVar != null) {
        }
    }

    public final void J3() {
        org.telegram.ui.Components.f10.d(this.g0, c3.i0.E(this.i0 ? 1.0f : 0.0f, 1.0f - this.b.e, 1.0f - h4(), 1.0f - this.c.e));
    }

    public final void J4(boolean z10, boolean z11) {
        ww wwVar = this.F3;
        if (wwVar == null || !wwVar.c()) {
            int i10 = (this.e0[0].s == 0 && l4() && this.e0[0].w == 2) ? 1 : 0;
            int i11 = (!this.K || z11 || this.E0.g()) ? 0 : -org.telegram.messenger.i0.L(81.0f);
            if (!z10) {
                this.e0[0].c.h1(i10, i11);
                H4();
            } else {
                org.telegram.ui.Components.wj0 wj0Var = this.e0[0].r;
                wj0Var.b = 1;
                wj0Var.d(i10, i11, false, false);
                H4();
            }
        }
    }

    public final void K3() {
        org.telegram.ui.Components.f10.d(this.f0, c3.i0.E(org.telegram.messenger.uz.s.isEmpty() ? 0.0f : 1.0f, 1.0f - this.b.e, 1.0f - h4(), 1.0f - this.c.e));
    }

    public final void K4(String str, boolean z10) {
        a5(true, false, true, false);
        ox oxVar = this.X;
        if (oxVar != null) {
            oxVar.r.setText(str);
            this.X.r.setSelection(str.length());
        }
    }

    public final void L3() {
        org.telegram.ui.Components.f10.d(this.j0, c3.i0.E(this.R0 != 2 ? 1.0f : 0.0f, this.f.e, 1.0f - h4(), 1.0f - this.c.e));
        tw twVar = this.E0;
        if (twVar != null) {
            twVar.invalidate();
        }
    }

    public final void L4(float f7) {
        this.c0 = f7;
        for (yx yxVar : this.e0) {
            vx vxVar = yxVar.a;
            for (int i10 = 0; i10 < vxVar.getChildCount(); i10++) {
                View childAt = vxVar.getChildAt(i10);
                if (childAt != null && RecyclerView.R(childAt) >= yxVar.d.f + 1) {
                    childAt.setAlpha(f7);
                }
            }
        }
    }

    public final void M3() {
        org.telegram.ui.Components.f10.d(this.l0, c3.i0.E(this.b.e, 1.0f - h4(), 1.0f - this.c.e, this.d.e));
    }

    public final void M4(boolean z10, boolean z11) {
        if (this.e0 == null || this.S1 == z10) {
            return;
        }
        if (z10) {
            this.R1 = new ArrayList(d4(this.currentAccount, this.e0[0].s, this.W2, false));
        } else {
            this.R1 = null;
        }
        this.S1 = z10;
        yx yxVar = this.e0[0];
        yxVar.d.G = z10;
        if (z10 || !z11) {
            return;
        }
        if (yxVar.a.c0()) {
            this.e0[0].a.post(new ev(this, 25));
        } else {
            this.e0[0].d.f();
        }
    }

    public final void N3() {
        bi.t0 t0Var;
        boolean z10 = !this.j2 && ((t0Var = this.K0) == null || t0Var.getBackground() == null || this.K0.getAlpha() < 0.01f || this.K0.getVisibility() == 8);
        e eVar = this.I3;
        if (eVar != null) {
            ((of0) eVar.b).w.a(z10, true);
        }
    }

    public final void N4(boolean z10) {
        yx yxVar;
        if (org.telegram.messenger.uz.o() <= 1 || !org.telegram.messenger.tc.e(32768)) {
            return;
        }
        if (z10) {
            yx[] yxVarArr = this.e0;
            if (yxVarArr != null && (yxVar = yxVarArr[0]) != null) {
                yxVar.setLayerType(2, null);
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
                yx[] yxVarArr2 = this.e0;
                if (i10 >= yxVarArr2.length) {
                    break;
                }
                yx yxVar2 = yxVarArr2[i10];
                if (yxVar2 != null) {
                    yxVar2.setLayerType(0, null);
                    yxVar2.setClipChildren(true);
                    yxVar2.setClipToPadding(true);
                    yxVar2.a.setClipChildren(true);
                }
                i10++;
            }
        }
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        if (lVar2 != null) {
            lVar2.setLayerType(0, null);
        }
        tw twVar = this.E0;
        if (twVar != null) {
            twVar.setLayerType(0, null);
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            ((ViewGroup) view2).setClipChildren(true);
            this.fragmentView.requestLayout();
        }
    }

    public final void O3() {
        I3();
        org.telegram.ui.Components.f10.d(this.k0, (1.0f - this.b.e) * (1.0f - h4()) * (1.0f - this.c.e));
        J3();
        M3();
        K3();
        L3();
    }

    public final void O4(float f7) {
        yx[] yxVarArr = this.e0;
        if (yxVarArr != null) {
            int paddingTop = yxVarArr[0].a.getPaddingTop() + ((int) f7);
            int i10 = 0;
            while (true) {
                yx[] yxVarArr2 = this.e0;
                if (i10 >= yxVarArr2.length) {
                    break;
                }
                yxVarArr2[i10].a.setTopGlowOffset(paddingTop);
                i10++;
            }
        }
        if (this.fragmentView == null || f7 == this.N) {
            return;
        }
        this.N = f7;
        org.telegram.ui.Components.wb wbVar = this.o3;
        if (wbVar != null) {
            wbVar.l();
        }
        if (this.E3 != null) {
            float currentActionBarHeight = 1.0f - ((-f7) / org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
            org.telegram.ui.Cells.n nVar = this.E3;
            float f10 = (int) f7;
            float f11 = nVar.f;
            nVar.h = f10;
            nVar.setTranslationY(f11 + f10);
            this.E3.setAlpha(w7.u.a(currentActionBarHeight, 0.0f, 1.0f));
            this.E3.setVisibility(currentActionBarHeight <= 0.0f ? 4 : 0);
        }
        Q3();
        this.fragmentView.invalidate();
    }

    public final void P3() {
        String L0 = org.telegram.messenger.dd.L0(h4() > 0.5f ? 2131745723 : 2131745830, null);
        this.X.r.setContentDescription(L0);
        this.X.r.setHint(L0);
    }

    public final void P4(float f7) {
        this.x1 = f7;
        n5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (org.telegram.messenger.uz.o() != 0) {
            org.telegram.messenger.tc.e(32768);
        }
        e5();
    }

    public final void Q3() {
        if (this.X == null) {
            return;
        }
        float a2 = 1.0f - w7.u.a(((-this.N) - g4()) / org.telegram.messenger.i0.L(48.0f), 0.0f, 1.0f);
        float max = (this.R0 != 2 ? 1.0f : 0.0f) * (1.0f - this.c.e) * (1.0f - Math.max(this.u3, this.h.e)) * Math.max(this.b.e, (1.0f - h4()) * a2);
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
            float f7 = (this.a0 != null ? 1.0f : 0.0f) * this.b.e;
            float T1 = org.telegram.messenger.i0.T1(0.98f, 1.0f, f7);
            this.Z.setScaleX(T1);
            this.Z.setScaleY(T1);
            this.Z.setAlpha(f7);
            this.Z.setVisibility(f7 > 0.0f ? 0 : 8);
        }
        org.telegram.ui.Components.w71 w71Var = this.a0;
        fe.b bVar = this.s;
        if (w71Var != null) {
            float f10 = 1.0f - bVar.e;
            w71Var.setAlpha(f10);
            this.a0.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        zf.g0 g0Var = this.b0;
        if (g0Var != null) {
            float f11 = bVar.e;
            g0Var.setAlpha(f11);
            this.b0.setVisibility(f11 > 0.0f ? 0 : 8);
        }
    }

    public final void R4(float f7) {
        if (org.telegram.messenger.uz.o() <= 0) {
            boolean z10 = org.telegram.messenger.v2.a;
            return;
        }
        if (this.W3 == f7) {
            return;
        }
        boolean z11 = true;
        if (org.telegram.messenger.uz.o() > 1 && org.telegram.messenger.tc.e(32768)) {
            z11 = false;
        }
        this.X3 = z11;
        this.W3 = f7;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (this.X3) {
            float f10 = (1.0f - this.W3) * (-org.telegram.messenger.i0.L(40.0f));
            tw twVar = this.E0;
            if (twVar != null) {
                twVar.setTranslationX(f10);
            }
            ox oxVar = this.X;
            if (oxVar != null) {
                oxVar.setTranslationX(f10);
            }
            ww wwVar = this.F3;
            if (wwVar == null || wwVar.getFragmentView() == null || this.D) {
                return;
            }
            this.F3.getFragmentView().setTranslationX(f10);
            return;
        }
        float f11 = -org.telegram.messenger.i0.L(4.0f);
        float f12 = 1.0f - this.W3;
        float f13 = f11 * f12;
        float f14 = 1.0f - (f12 * 0.05f);
        tw twVar2 = this.E0;
        if (twVar2 != null) {
            twVar2.setScaleX(f14);
            this.E0.setScaleY(f14);
            this.E0.setTranslationX(f13);
            this.E0.setPivotX(0.0f);
            this.E0.setPivotY(0.0f);
        }
        ox oxVar2 = this.X;
        if (oxVar2 != null) {
            oxVar2.setTranslationX(f13);
            this.X.setScaleX(f14);
            this.X.setScaleY(f14);
        }
        ww wwVar2 = this.F3;
        if (wwVar2 == null || wwVar2.getFragmentView() == null) {
            return;
        }
        if (!this.D) {
            this.F3.getFragmentView().setScaleX(f14);
            this.F3.getFragmentView().setScaleY(f14);
            this.F3.getFragmentView().setTranslationX(f13);
        }
        this.F3.getFragmentView().setPivotX(0.0f);
        this.F3.getFragmentView().setPivotY(0.0f);
    }

    public final void S3(boolean z10) {
        if (this.C0 == null || this.actionBar == null) {
            return;
        }
        int i10 = org.telegram.messenger.i0.n;
        int measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.i0.L(this.a) + (this.a0 != null ? org.telegram.messenger.i0.L(50.0f) : 0);
        org.telegram.ui.Components.zr zrVar = this.J1;
        int c10 = measuredHeight + (zrVar != null ? (int) zrVar.c(org.telegram.messenger.i0.L(7.0f)) : 0);
        jx jxVar = this.C0;
        SparseArray sparseArray = jxVar.h;
        jxVar.W0 = c10;
        jxVar.X0 = i10;
        ag.b1 b1Var = jxVar.a0;
        if (z10) {
            b1Var.q1(0, c10, 0, i10);
        } else {
            b1Var.setPadding(0, c10, 0, i10);
        }
        jxVar.O0.j(jxVar.W0, jxVar.X0, z10);
        org.telegram.ui.Components.um0 um0Var = jxVar.b0;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) um0Var.getLayoutParams();
        int i11 = marginLayoutParams.topMargin;
        int i12 = jxVar.W0;
        if (i11 != i12 || marginLayoutParams.bottomMargin != jxVar.X0) {
            marginLayoutParams.topMargin = i12;
            marginLayoutParams.bottomMargin = jxVar.X0;
            um0Var.requestLayout();
        }
        org.telegram.ui.Components.hn0.Q(jxVar.h0, jxVar.k0, jxVar.W0, jxVar.X0, z10);
        org.telegram.ui.Components.hn0.Q(jxVar.m0, jxVar.p0, jxVar.W0, jxVar.X0, z10);
        org.telegram.ui.Components.hn0.Q(jxVar.t0, jxVar.w0, jxVar.W0, jxVar.X0, z10);
        org.telegram.ui.Components.cg0 cg0Var = jxVar.r0;
        int i13 = jxVar.W0;
        int i14 = jxVar.X0;
        cg0Var.setClipToPadding(false);
        org.telegram.ui.Components.v51 v51Var = cg0Var.c;
        cg0Var.J = z10;
        cg0Var.setPadding(0, i13, 0, i14);
        if (z10) {
            v51Var.q1(0, i13, 0, i14);
        } else {
            v51Var.setPadding(0, i13, 0, i14);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) v51Var.getLayoutParams();
        marginLayoutParams2.topMargin = -i13;
        marginLayoutParams2.bottomMargin = -i14;
        cg0Var.J = false;
        org.telegram.ui.Components.hm0 hm0Var = jxVar.I0;
        if (hm0Var != null) {
            hm0Var.b(jxVar.W0, jxVar.X0, z10);
        }
        int size = sparseArray.size();
        for (int i15 = 0; i15 < size; i15++) {
            View view = (View) sparseArray.valueAt(i15);
            if (view instanceof y00) {
                ((y00) view).j(jxVar.W0, jxVar.X0, z10);
            }
        }
        for (int i16 = 0; i16 < jxVar.getChildCount(); i16++) {
            if (jxVar.getChildAt(i16) instanceof y00) {
                ((y00) jxVar.getChildAt(i16)).j(jxVar.W0, jxVar.X0, z10);
            }
        }
    }

    public final void S4() {
        getContactsController().B();
        org.telegram.ui.Components.l6 l6Var = new org.telegram.ui.Components.l6(getParentActivity(), this.currentAccount, getResourceProvider(), new org.telegram.ui.Components.voip.u(6, this, r1), new rh(r1, 18));
        org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.a30.h(getParentActivity(), false, 1, getResourceProvider());
        h.N = l6Var;
        h.U0 = 49;
        h.show();
        org.telegram.ui.ActionBar.z2[] z2VarArr = {h};
        h.Q(org.telegram.ui.ActionBar.t6.h5);
    }

    public final void T3() {
        if (this.J1 != null) {
            float T1 = org.telegram.messenger.i0.T1(0.98f, 1.0f, 1.0f);
            this.J1.setAlpha(1.0f);
            this.J1.setScaleX(T1);
            this.J1.setScaleY(T1);
            this.J1.setVisibility(0);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type int to boolean for r5v19 ??
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:116)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:138)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.inline(CodeShrinkVisitor.java:213)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:143)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:68)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:48)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:39)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, org.telegram.ui.ActionBar.k2, org.telegram.ui.zx] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r12v5, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r2v6, types: [org.telegram.messenger.wp] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v19, types: [int] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, org.telegram.ui.ActionBar.k2[]] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v7, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r9v8 */
    public final boolean T4(org.telegram.ui.Cells.v2 r33) {
        /*
            Method dump skipped, instructions count: 1463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zx.T4(org.telegram.ui.Cells.v2):boolean");
    }

    public boolean U3() {
        return this.R0 == 10;
    }

    public final void U4(boolean z10) {
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
        arrayList.add(ObjectAnimator.ofFloat(this.m0, (Property<org.telegram.ui.ActionBar.t0, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.O3.playTogether(arrayList);
        this.O3.addListener(new cx(this, z10, i10));
        this.O3.start();
    }

    public final void V3() {
        if (!org.telegram.messenger.i0.Q1()) {
            this.V1 = true;
            return;
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.k(true);
        }
        TLObject tLObject = this.X1;
        if (tLObject != null) {
            jx jxVar = this.C0;
            if (jxVar != null) {
                jxVar.d0.Q(this.W1, tLObject);
            }
            this.X1 = null;
        }
    }

    public final void V4() {
        if (this.A0 || !getMessagesController().U0 || !getMessagesController().J3 || this.z0 == null || !getMessagesController().S0().isEmpty() || this.isPaused || !getUserConfig().P || this.inPreviewMode) {
            return;
        }
        SharedPreferences d12 = org.telegram.messenger.wp.d1();
        if (d12.getBoolean("filterhint", false)) {
            return;
        }
        d12.edit().putBoolean("filterhint", true).apply();
        org.telegram.messenger.i0.h3(new ev(this, 26), 1000L);
    }

    public final void W3() {
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar == null || !lVar.n0) {
            return;
        }
        lVar.k(true);
        this.q3 = false;
        i5(true, true);
    }

    public final void W4() {
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        LaunchActivity launchActivity;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2;
        float f7;
        int i10;
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        fv fvVar;
        org.telegram.ui.Components.voip.u uVar;
        org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(this, this.k0);
        int i11 = org.telegram.ui.ActionBar.t6.A8;
        H.S(getThemedColor(i11), getThemedColor(i11));
        int i12 = 8;
        H.s = 8;
        Activity parentActivity = getParentActivity();
        LaunchActivity launchActivity2 = parentActivity instanceof LaunchActivity ? (LaunchActivity) parentActivity : null;
        int i13 = 5;
        float f10 = 64.0f;
        int i14 = 0;
        if (this.Y2 != 0) {
            int i15 = 1;
            if (org.telegram.messenger.w3.N(this.Z2)) {
                H.c(R.drawable.msg_customize, org.telegram.messenger.dd.L0(2131751913, null), new dw(this, i15), false);
                H.k();
            }
            H.i(new dw(this, 4), org.telegram.messenger.dd.L0(2131751912, null), this.Z2.collapsed_in_dialogs);
            H.i(new dw(this, i13), org.telegram.messenger.dd.L0(2131751911, null), !this.Z2.collapsed_in_dialogs);
            H.Z();
            H.X(-org.telegram.messenger.i0.L(64.0f));
            return;
        }
        if (q4()) {
            H.c(R.drawable.msg_customize, org.telegram.messenger.dd.L0(2131754143, null), new dw(this, 6), false);
            H.c(R.drawable.msg_help, org.telegram.messenger.dd.L0(2131749285, null), new dw(this, 7), false);
            H.Z();
            H.X(-org.telegram.messenger.i0.L(64.0f));
            return;
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.resourceProvider;
        boolean a2 = p6Var != null ? p6Var.a() : org.telegram.ui.ActionBar.t6.I.q();
        H.c(a2 ? R.drawable.menu_day_mode_24 : R.drawable.menu_night_mode_24, org.telegram.messenger.dd.L0(a2 ? 2131744326 : 2131744325, null), new dw(this, i12), false);
        H.k();
        int i16 = 9;
        H.c(R.drawable.outline_groups_24, org.telegram.messenger.dd.L0(2131748290, null), new dw(this, i16), false);
        H.c(R.drawable.outline_saved_24, org.telegram.messenger.dd.L0(2131745918, null), new dw(this, 10), false);
        org.telegram.messenger.w0 w0Var = org.telegram.messenger.w0.a;
        if (((org.telegram.messenger.j0) getMessagesController().y7.j0.b).c) {
            H.c(R.drawable.ic_gram, org.telegram.messenger.dd.L0(2131743220, null), new ev(this, i14), false);
        } else {
            TLRPC.TL_attachMenuBots tL_attachMenuBots = org.telegram.messenger.vi.b0(org.telegram.messenger.e20.s0).b;
            if (launchActivity2 != null && tL_attachMenuBots != null && (arrayList = tL_attachMenuBots.bots) != null && !arrayList.isEmpty()) {
                ArrayList<TLRPC.TL_attachMenuBot> arrayList3 = tL_attachMenuBots.bots;
                int size = arrayList3.size();
                int i17 = 0;
                while (i17 < size) {
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList3.get(i17);
                    i17++;
                    TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                    if (tL_attachMenuBot2.show_in_side_menu) {
                        fv fvVar2 = new fv(this, tL_attachMenuBot2, launchActivity2, i14);
                        org.telegram.ui.Components.voip.u uVar2 = new org.telegram.ui.Components.voip.u(i12, this, tL_attachMenuBot2);
                        org.telegram.ui.ActionBar.p6 p6Var2 = H.d;
                        f7 = f10;
                        if (H.e == null) {
                            launchActivity = launchActivity2;
                            arrayList2 = arrayList3;
                        } else {
                            int i18 = org.telegram.ui.ActionBar.t6.F8;
                            int i19 = org.telegram.ui.ActionBar.t6.E8;
                            org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, H.e, H.d, false, false);
                            b1Var.setPadding(org.telegram.messenger.i0.L(18.0f), i14, org.telegram.messenger.i0.L(18.0f), i14);
                            CharSequence b10 = tL_attachMenuBot2.side_menu_disclaimer_needed ? org.telegram.ui.Cells.p8.b(tL_attachMenuBot2.short_name) : tL_attachMenuBot2.short_name;
                            Pattern pattern = org.telegram.messenger.vi.R1;
                            ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList4 = tL_attachMenuBot2.icons;
                            int size2 = arrayList4.size();
                            launchActivity = launchActivity2;
                            int i20 = 0;
                            while (true) {
                                if (i20 >= size2) {
                                    arrayList2 = arrayList3;
                                    tL_attachMenuBotIcon = null;
                                    break;
                                }
                                TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = arrayList4.get(i20);
                                int i21 = i20 + 1;
                                TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon3 = tL_attachMenuBotIcon2;
                                arrayList2 = arrayList3;
                                if (tL_attachMenuBotIcon3.name.equals("android_side_menu_static")) {
                                    tL_attachMenuBotIcon = tL_attachMenuBotIcon3;
                                    break;
                                } else {
                                    i20 = i21;
                                    arrayList3 = arrayList2;
                                }
                            }
                            if (tL_attachMenuBotIcon != null) {
                                CharSequence charSequence = b10;
                                org.telegram.messenger.d00 f11 = org.telegram.messenger.v5.f(tL_attachMenuBotIcon.icon, org.telegram.ui.ActionBar.t6.c7, 1.0f, null);
                                if (f11 != null) {
                                    Integer num = H.k0;
                                    new PorterDuffColorFilter(num != null ? num.intValue() : org.telegram.ui.ActionBar.t6.w0(i18, p6Var2), PorterDuff.Mode.SRC_IN);
                                }
                                org.telegram.messenger.jc b11 = org.telegram.messenger.jc.b(tL_attachMenuBotIcon.icon);
                                uVar = uVar2;
                                fvVar = fvVar2;
                                b1Var.k(charSequence, b11, "24_24", f11, tL_attachMenuBot2);
                                org.telegram.ui.Components.g9 g9Var = b1Var.h;
                                if (g9Var != null) {
                                    g9Var.setLayoutParams(w7.b6.e(24, 24, (org.telegram.messenger.dd.X ? 5 : 3) | 16));
                                }
                            } else {
                                fvVar = fvVar2;
                                uVar = uVar2;
                                b1Var.j(b10, R.drawable.msg_bot, null);
                            }
                            Integer num2 = H.j0;
                            if (num2 == null && H.k0 == null) {
                                b1Var.c(i19, i18);
                            } else {
                                int intValue = num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.t6.w0(i19, p6Var2);
                                Integer num3 = H.k0;
                                b1Var.d(intValue, num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.t6.w0(i18, p6Var2));
                            }
                            Integer num4 = H.k0;
                            b1Var.setIconColorImage(num4 != null ? num4.intValue() : org.telegram.ui.ActionBar.t6.w0(i18, p6Var2));
                            Integer num5 = H.l0;
                            if (num5 != null) {
                                b1Var.setSelectorColor(num5.intValue());
                            } else {
                                b1Var.h(0.12f, i19);
                            }
                            i10 = 9;
                            b1Var.setOnClickListener(new org.telegram.ui.Components.sr(i10, H, fvVar));
                            b1Var.setOnLongClickListener(new org.telegram.ui.Components.b0(2, H, uVar));
                            int i22 = H.S;
                            if (i22 > 0) {
                                b1Var.setMinimumWidth(org.telegram.messenger.i0.L(i22));
                                H.r(b1Var, w7.b6.o(H.S, -2));
                            } else {
                                H.r(b1Var, w7.b6.o(-1, -2));
                            }
                            i16 = i10;
                            f10 = f7;
                            launchActivity2 = launchActivity;
                            arrayList3 = arrayList2;
                            i12 = 8;
                            i14 = 0;
                        }
                    } else {
                        launchActivity = launchActivity2;
                        arrayList2 = arrayList3;
                        f7 = f10;
                    }
                    i10 = i16;
                    i16 = i10;
                    f10 = f7;
                    launchActivity2 = launchActivity;
                    arrayList3 = arrayList2;
                    i12 = 8;
                    i14 = 0;
                }
            }
        }
        float f12 = f10;
        if (getUserConfig().W) {
            H.c(R.drawable.msg_settings_old, org.telegram.messenger.dd.L0(2131745512, null), new dw(this, 3), false);
        }
        org.telegram.ui.ActionBar.b1 b1Var2 = this.o0;
        if (b1Var2 != null) {
            org.telegram.ui.ActionBar.a7.V(b1Var2.b, org.telegram.ui.ActionBar.t6.Oi, getResourceProvider());
            this.o0.setOnClickListener(new vu(5, this, H));
            SharedPreferences sharedPreferences = org.telegram.messenger.w0.b.getSharedPreferences("mainconfig", 0);
            String string = sharedPreferences.getString("proxy_ip", "");
            if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().y3 && !org.telegram.messenger.uz.z1.isEmpty())) {
                H.k();
                H.d(this.o0);
            }
        }
        H.Z();
        H.X(-org.telegram.messenger.i0.L(f12));
    }

    @Override // org.telegram.ui.ActionBar.k2, org.telegram.ui.nf0
    public final boolean X(MotionEvent motionEvent, boolean z10) {
        ww wwVar;
        bi.t0 t0Var;
        px pxVar;
        if (!this.q3 && (((wwVar = this.F3) == null || !wwVar.c()) && (((t0Var = this.K0) == null || t0Var.getVisibility() != 0) && ((pxVar = this.z0) == null || !pxVar.n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                px pxVar2 = this.z0;
                boolean z11 = pxVar2 == null || pxVar2.getTabsCount() < 2 || this.z0.getCurrentTabId() == this.z0.getFirstTabId();
                px pxVar3 = this.z0;
                boolean z12 = pxVar3 == null || pxVar3.getTabsCount() < 2 || this.z0.getCurrentTabId() == this.z0.getLastTabId();
                org.telegram.messenger.uz.m(this.currentAccount);
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
        if (this.actionBar.e(str)) {
            return;
        }
        org.telegram.ui.ActionBar.y m10 = this.actionBar.m(str);
        boolean z10 = this.W;
        int i10 = 1;
        ArrayList arrayList = this.i1;
        if (z10) {
            ImageView imageView = new ImageView(getParentActivity());
            this.g1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.g1.setImageDrawable(new org.telegram.ui.ActionBar.c2(true));
            org.telegram.ui.ActionBar.a7.t(this.g1, org.telegram.ui.ActionBar.t6.y8, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.g1;
            int i11 = org.telegram.ui.ActionBar.t6.z8;
            org.telegram.ui.ActionBar.a7.R(imageView2, org.telegram.ui.ActionBar.t6.h0(getThemedColor(i11), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i11), getResourceProvider());
            this.g1.setOnClickListener(new gv(this, 6));
            m10.addView(this.g1, w7.b6.r(54, 54, 16));
            arrayList.add(this.g1);
        }
        NumberTextView numberTextView = new NumberTextView(m10.getContext());
        this.h1 = numberTextView;
        numberTextView.setTextSize(18);
        this.h1.setTypeface(org.telegram.messenger.i0.o());
        this.h1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.t6.y8));
        m10.addView(this.h1, w7.b6.m(1.0f, 0, -1, this.W ? 18 : 72, 0, 0));
        this.h1.setOnTouchListener(new org.telegram.ui.ActionBar.n2(i10));
        this.k1 = m10.g(100, R.drawable.msg_pin, org.telegram.messenger.i0.L(48.0f));
        this.l1 = m10.g(org.telegram.messenger.at.p1, R.drawable.msg_mute, org.telegram.messenger.i0.L(48.0f));
        this.m1 = m10.g(org.telegram.messenger.at.s1, R.drawable.msg_archive, org.telegram.messenger.i0.L(48.0f));
        this.j1 = m10.h(org.telegram.messenger.at.n1, R.drawable.msg_delete, org.telegram.messenger.dd.L0(2131751599, null), org.telegram.messenger.i0.L(48.0f));
        org.telegram.ui.ActionBar.t0 h = m10.h(0, R.drawable.ic_ab_other, org.telegram.messenger.dd.L0(2131754839, null), org.telegram.messenger.i0.L(48.0f));
        m10.addView(new View(getParentActivity()), w7.b6.o(5, -1));
        this.q1 = h.e(org.telegram.messenger.at.q1, R.drawable.msg_archive, org.telegram.messenger.dd.L0(2131754172, null));
        this.n1 = h.e(org.telegram.messenger.at.t1, R.drawable.msg_pin, org.telegram.messenger.dd.L0(2131751454, null));
        this.o1 = h.e(org.telegram.messenger.at.u1, R.drawable.msg_addfolder, org.telegram.messenger.dd.L0(2131750813, null));
        this.p1 = h.e(org.telegram.messenger.at.v1, R.drawable.msg_removefolder, org.telegram.messenger.dd.L0(2131750713, null));
        this.s1 = h.e(101, R.drawable.msg_markread, org.telegram.messenger.dd.L0(2131748696, null));
        this.r1 = h.e(org.telegram.messenger.at.o1, R.drawable.msg_clear, org.telegram.messenger.dd.L0(2131752089, null));
        this.t1 = h.e(org.telegram.messenger.at.r1, R.drawable.msg_block, org.telegram.messenger.dd.L0(2131753692, null));
        this.l1.setOnLongClickListener(new tv(this, i10));
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
        for (String str : getMessagesController().U3) {
            if ("AUTOARCHIVE_POPULAR".equals(str)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String L0 = org.telegram.messenger.dd.L0(2131749328, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131749329, null));
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131749542, null), new hv(this, 6));
                showDialog(x1Var, new nv(this, 0));
                this.R3 = str;
                return;
            }
        }
    }

    public final void Y3() {
        jx jxVar = this.C0;
        if ((jxVar != null && jxVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        jx jxVar2 = new jx(this, getParentActivity(), this, this.n2 != null ? 2 : !this.l2 ? 1 : 0, this.R0, this.W2, this.Y2, new hw(this));
        this.C0 = jxVar2;
        this.glassEngine.c(jxVar2);
        ((sx) this.fragmentView).addView(this.C0, this.B0);
        jx jxVar3 = this.C0;
        jxVar3.d0.U = new lx(this);
        jxVar3.k0.setOnItemClickListener(new hv(this, 1));
        this.C0.p0.setOnItemClickListener(new hv(this, 2));
        this.C0.w0.setOnItemClickListener(new mv(this, 0));
        this.C0.p0.setOnItemLongClickListener(new hv(this, 3));
        this.C0.a0.setOnItemClickListener(new hv(this, 4));
        this.C0.a0.setOnItemLongClickListener(new hw(this));
        this.C0.setFilteredSearchViewDelegate(new hv(this, 5));
        this.C0.setAlpha(0.0f);
        this.C0.setScaleX(1.05f);
        this.C0.setScaleY(1.05f);
        this.C0.setVisibility(8);
        this.C0.setBlurredBackgroundDrawableFactory(this.o4);
    }

    public final void Y4(long j10, View view) {
        s3(j10, view);
        boolean u10 = this.actionBar.u();
        ArrayList arrayList = this.I2;
        boolean z10 = true;
        char c10 = 1;
        int i10 = 0;
        if (!u10) {
            if (this.q3) {
                X3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.a5)) {
                    this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
                }
            } else {
                X3(null);
            }
            org.telegram.messenger.i0.v1(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.t6.d6));
            this.actionBar.O(null, null);
            int i11 = this.e0[0].s;
            ArrayList d42 = ((i11 == 7 || i11 == 8) && (!this.actionBar.u() || this.actionBar.w(null))) ? d4(this.currentAccount, this.e0[0].s, this.W2, this.S1) : getMessagesController().V0(this.W2);
            int size = d42.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) d42.get(i13);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (!s4(dialog)) {
                        if (!getMessagesController().B2(dialog.id, false)) {
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
                        yx[] yxVarArr = this.e0;
                        if (i14 >= yxVarArr.length) {
                            break;
                        }
                        yxVarArr[i14].d.H = true;
                        i14++;
                    }
                }
                int i15 = org.telegram.messenger.wp.D8;
                u5(131072, true);
            }
            if (!this.q3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                int i16 = 0;
                while (true) {
                    ArrayList arrayList3 = this.i1;
                    if (i16 >= arrayList3.size()) {
                        break;
                    }
                    View view2 = (View) arrayList3.get(i16);
                    view2.setPivotY(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2);
                    org.telegram.messenger.i0.y(view2);
                    arrayList2.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                    i16++;
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
            int i17 = 0;
            while (true) {
                yx[] yxVarArr2 = this.e0;
                if (i17 >= yxVarArr2.length) {
                    break;
                }
                yx yxVar = yxVarArr2[i17];
                if (yxVar != null) {
                    yxVar.a.I0(true);
                }
                i17++;
            }
            float max = Math.max(0.0f, org.telegram.messenger.i0.L((this.K ? 81 : 0) + 48) + this.N);
            if (max != 0.0f) {
                this.P = (int) max;
                this.fragmentView.requestLayout();
            }
            this.v3.addUpdateListener(new iv(this, max, i10));
            this.v3.addListener(new ex(this, max, c10 == true ? 1 : 0));
            this.v3.setInterpolator(org.telegram.ui.Components.gr.f);
            this.v3.setDuration(200L);
            this.v3.start();
            px pxVar = this.z0;
            if (pxVar != null) {
                pxVar.b(org.telegram.ui.ActionBar.t6.ui, org.telegram.ui.ActionBar.t6.ti, org.telegram.ui.ActionBar.t6.si, org.telegram.ui.ActionBar.t6.vi, org.telegram.ui.ActionBar.t6.w8);
            }
            org.telegram.ui.ActionBar.c2 c2Var = this.e1;
            if (c2Var != null) {
                c2Var.c(true, 1.0f);
            }
            z10 = false;
        } else if (arrayList.isEmpty()) {
            n4(true);
            return;
        }
        f5(false);
        this.h1.a(arrayList.size(), z10);
    }

    public final void Z3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.y0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                undoViewArr[i10] = new fx(this, parentActivity);
                FrameLayout.LayoutParams d = w7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                d.bottomMargin = this.f4 + this.h4 + d.bottomMargin;
                sx sxVar = (sx) this.fragmentView;
                UndoView undoView = undoViewArr[i10];
                int i11 = this.x0 + 1;
                this.x0 = i11;
                sxVar.addView(undoView, i11, d);
            }
        }
    }

    public final void Z4(long j10, View view) {
        int i10 = -this.L3;
        this.L3 = i10;
        org.telegram.messenger.i0.F3(i10, view, null);
        org.telegram.messenger.t2.D.a();
        String p5 = j10 >= 0 ? org.telegram.messenger.i20.p(org.telegram.messenger.wp.r1(this.currentAccount).Z1(Long.valueOf(j10))) : "";
        (getMessagesController().A3() ? org.telegram.ui.Components.cc.a0(this).Q(R.raw.star_premium_2, 36, org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131743786, p5))) : org.telegram.ui.Components.cc.a0(this).K(R.raw.star_premium_2, org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131743786, p5)), org.telegram.messenger.dd.L0(2131743785, null), new ev(this, 8))).j();
    }

    public final void a4(final long j10, final long j11, boolean z10, final nb1 nb1Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String L0;
        String b02;
        String L02;
        TLRPC.TL_forumTopic f7;
        if (A3(j10)) {
            int i10 = this.R0;
            if (i10 == 11 || i10 == 12 || i10 == 13) {
                if (org.telegram.messenger.o5.E(j10)) {
                    TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(j10));
                    if (!Z1.mutual_contact) {
                        UndoView k42 = k4();
                        if (k42 != null) {
                            k42.j(45, j10, null);
                            return;
                        }
                        return;
                    }
                    user = Z1;
                    chat = null;
                } else {
                    TLRPC.Chat L03 = getMessagesController().L0(Long.valueOf(-j10));
                    if (!org.telegram.messenger.w3.N(L03) || !org.telegram.messenger.w3.w(1, L03)) {
                        UndoView k43 = k4();
                        if (k43 != null) {
                            k43.j(46, j10, null);
                            return;
                        }
                        return;
                    }
                    chat = L03;
                    user = null;
                }
                org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, getParentActivity(), null);
                TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
                tL_messages_checkHistoryImportPeer.peer = getMessagesController().i1(j10);
                getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new org.telegram.messenger.wm(this, x1Var, user, chat, j10, tL_messages_checkHistoryImportPeer, 1));
                try {
                    x1Var.r(300L);
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
                    arrayList.add(org.telegram.messenger.hs.a(j10, j11));
                    if (this.C2.z(this, arrayList, null, false, this.J2, this.K2, this.L2, nb1Var) && this.i2) {
                        this.C2 = null;
                        return;
                    }
                    return;
                }
                Runnable i0Var = new a3.i0(this, j10, new a3.h0(this, j10, j11, nb1Var, 5), 17);
                if (j10 < 0) {
                    c5(getMessagesController().L0(Long.valueOf(-j10)), i0Var, null);
                    return;
                }
                TLRPC.User Z12 = getMessagesController().Z1(Long.valueOf(j10));
                TLRPC.User Z13 = getMessagesController().Z1(Long.valueOf(this.H));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String a02 = org.telegram.messenger.dd.a0(null, null, 2131754074, org.telegram.messenger.i20.j(Z12, true), org.telegram.messenger.i20.j(Z13, true));
                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.a;
                x1Var2.R = a02;
                x1Var2.T = TextUtils.concat(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131754075, org.telegram.messenger.i20.j(Z12, true), org.telegram.messenger.i20.j(Z13, true))));
                alertDialog$Builder.k(org.telegram.messenger.dd.a0("Send", null, 2131745657, new Object[0]), new st(i0Var, 4));
                alertDialog$Builder.h(org.telegram.messenger.dd.a0("Cancel", null, 2131752589, new Object[0]), new org.telegram.ui.Components.a21(7));
                showDialog(x1Var2);
                return;
            }
            if (getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
            if (org.telegram.messenger.o5.C(j10)) {
                TLRPC.User Z14 = getMessagesController().Z1(Long.valueOf(getMessagesController().Z0(Integer.valueOf((int) (4294967295L & j10))).user_id));
                if (Z14 == null) {
                    return;
                }
                L0 = org.telegram.messenger.dd.L0(2131745613, null);
                b02 = org.telegram.messenger.dd.b0(this.f2, org.telegram.messenger.i20.p(Z14));
                L02 = org.telegram.messenger.dd.L0(2131745657, null);
            } else if (!org.telegram.messenger.o5.E(j10)) {
                TLRPC.Chat L04 = getMessagesController().L0(Long.valueOf(-j10));
                if (L04 == null) {
                    return;
                }
                String str = L04.title;
                if (j11 != 0 && (f7 = getMessagesController().r7.f(L04.id, j11)) != null) {
                    str = ((Object) str) + " " + f7.title;
                }
                if (this.h2 != null) {
                    L0 = org.telegram.messenger.dd.L0(2131754366, null);
                    b02 = org.telegram.messenger.dd.b0(this.h2, str);
                    L02 = org.telegram.messenger.dd.L0(2131754486, null);
                } else {
                    L0 = org.telegram.messenger.dd.L0(2131745613, null);
                    b02 = org.telegram.messenger.dd.b0(this.g2, str);
                    L02 = org.telegram.messenger.dd.L0(2131745657, null);
                }
            } else if (j10 == getUserConfig().e()) {
                L0 = org.telegram.messenger.dd.L0(2131745613, null);
                b02 = org.telegram.messenger.dd.b0(this.g2, org.telegram.messenger.dd.L0(2131745918, null));
                L02 = org.telegram.messenger.dd.L0(2131745657, null);
            } else {
                TLRPC.User Z15 = getMessagesController().Z1(Long.valueOf(j10));
                if (Z15 == null || this.f2 == null) {
                    return;
                }
                L0 = org.telegram.messenger.dd.L0(2131745613, null);
                b02 = org.telegram.messenger.dd.b0(this.f2, org.telegram.messenger.i20.p(Z15));
                L02 = org.telegram.messenger.dd.L0(2131745657, null);
            }
            org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder2.a;
            x1Var3.R = L0;
            x1Var3.T = org.telegram.messenger.i0.W2(b02);
            alertDialog$Builder2.k(L02, new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.cw
                @Override // org.telegram.ui.ActionBar.u1
                public final void h(org.telegram.ui.ActionBar.x1 x1Var4, int i11) {
                    zx.this.a4(j10, j11, false, nb1Var);
                }
            });
            alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131752589, null), null);
            if (showDialog(x1Var3) == null) {
                x1Var3.show();
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
        jx jxVar;
        jx jxVar2;
        tw twVar;
        jx jxVar3;
        boolean z14;
        jx jxVar4;
        boolean z15;
        org.telegram.ui.Components.w71 w71Var;
        TLRPC.Chat chat;
        ww wwVar;
        boolean z16 = z12;
        this.b.a(z10, z16);
        int i10 = 0;
        if (z10) {
            Y3();
        } else {
            q5(false);
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
        this.q3 = z10;
        this.glassEngine.g();
        if (z10) {
            if (!this.t3 && !z13) {
                ArrayList arrayList = (ArrayList) getMessagesController().w.get(0);
                int size = arrayList != null ? arrayList.size() : 0;
                if (this.l2 || (size <= 10 && !this.K)) {
                    z14 = true;
                    jxVar4 = this.C0;
                    if (jxVar4 != null) {
                        jxVar4.Q0 = z14;
                    }
                    z15 = z14 || this.K;
                    this.s3 = z15;
                    if (z15) {
                        this.t3 = true;
                    }
                    w71Var = this.a0;
                    if (w71Var != null && jxVar4 != null && !z14 && this.Y2 == 0) {
                        org.telegram.ui.Components.w71 n10 = jxVar4.n(-2, false);
                        this.a0 = n10;
                        this.Z.addView(n10, 0, w7.b6.e(-1, -1, org.telegram.messenger.at.E1));
                    } else if (this.Z != null && z14 && this.Y2 == 0) {
                        org.telegram.messenger.i0.E2(w71Var);
                        this.a0 = null;
                    }
                    if (this.C0 != null) {
                        S3(false);
                        this.C0.setKeyboardHeight(((sx) this.fragmentView).getKeyboardHeight());
                        jx jxVar5 = this.C0;
                        jxVar5.C0.clear();
                        jxVar5.L();
                    }
                    chat = this.Z2;
                    if (chat == null) {
                        zf.e0 e0Var = new zf.e0(R.drawable.search_users_filled, 4, org.telegram.messenger.o5.u(chat));
                        e0Var.f = this.Z2;
                        t3(e0Var);
                    } else if (this.W2 != 0 && ((wwVar = this.F3) == null || !wwVar.c())) {
                        t3(new zf.e0(R.drawable.chats_archive, 2131754150, null, 7));
                    }
                }
            }
            z14 = false;
            jxVar4 = this.C0;
            if (jxVar4 != null) {
            }
            if (z14) {
            }
            this.s3 = z15;
            if (z15) {
            }
            w71Var = this.a0;
            if (w71Var != null) {
            }
            if (this.Z != null) {
                org.telegram.messenger.i0.E2(w71Var);
                this.a0 = null;
            }
            if (this.C0 != null) {
            }
            chat = this.Z2;
            if (chat == null) {
            }
        }
        if (z16 && (jxVar3 = this.C0) != null && jxVar3.d0.M()) {
            org.telegram.messenger.i0.k3(getParentActivity(), this.classGuid);
        } else {
            org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        }
        if (!z10 && (twVar = this.E0) != null && this.G0) {
            twVar.setVisibility(0);
        }
        Object[] objArr = org.telegram.messenger.uz.o() == 0 || !org.telegram.messenger.tc.e(32768);
        if (z16) {
            if (z10) {
                jx jxVar6 = this.C0;
                if (jxVar6 != null) {
                    jxVar6.setVisibility(0);
                    jx jxVar7 = this.C0;
                    jxVar7.setPosition(0);
                    if (jxVar7.d0.b() > 0) {
                        jxVar7.e0.h1(0, 0);
                    }
                    s4.a0 a0Var = jxVar7.j0;
                    if (a0Var != null) {
                        a0Var.h1(0, 0);
                    }
                    s4.a0 a0Var2 = jxVar7.o0;
                    if (a0Var2 != null) {
                        a0Var2.h1(0, 0);
                    }
                    s4.a0 a0Var3 = jxVar7.v0;
                    if (a0Var3 != null) {
                        a0Var3.h1(0, 0);
                    }
                    jxVar7.h.clear();
                }
                j5(true, null, null, false, false);
                org.telegram.ui.Components.w71 w71Var2 = this.a0;
                if (w71Var2 != null) {
                    w71Var2.b(false, false);
                }
            } else {
                this.e0[0].a.setVisibility(0);
                this.e0[0].setVisibility(0);
            }
            M4(true, true);
            this.e0[0].a.setVerticalScrollBarEnabled(false);
            jx jxVar8 = this.C0;
            if (jxVar8 != null) {
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, jxVar8, getResourceProvider());
            }
            this.w1 = new AnimatorSet();
            ArrayList arrayList2 = new ArrayList();
            yx yxVar = this.e0[0];
            Property property = View.ALPHA;
            arrayList2.add(ObjectAnimator.ofFloat(yxVar, (Property<yx, Float>) property, z10 ? 0.0f : 1.0f));
            if (objArr == true) {
                this.e0[0].setScaleX(1.0f);
                this.e0[0].setScaleY(1.0f);
            } else {
                arrayList2.add(ObjectAnimator.ofFloat(this.e0[0], (Property<yx, Float>) View.SCALE_X, z10 ? 0.95f : 1.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.e0[0], (Property<yx, Float>) View.SCALE_Y, z10 ? 0.95f : 1.0f));
            }
            ww wwVar2 = this.F3;
            if (wwVar2 != null) {
                wwVar2.setVisibility(0);
                arrayList2.add(ObjectAnimator.ofFloat(this.F3, (Property<ww, Float>) property, z10 ? 0.0f : 1.0f));
            }
            jx jxVar9 = this.C0;
            if (jxVar9 != null) {
                arrayList2.add(ObjectAnimator.ofFloat(jxVar9, (Property<jx, Float>) property, z10 ? 1.0f : 0.0f));
                if (this.K) {
                    float L = org.telegram.messenger.i0.L(81.0f) + this.N + org.telegram.messenger.i0.L(48.0f);
                    jx jxVar10 = this.C0;
                    float f7 = z10 ? L : 0.0f;
                    if (z10) {
                        L = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(jxVar10, this.H3, f7, L));
                }
                if (objArr == true) {
                    this.C0.setScaleX(1.0f);
                    this.C0.setScaleY(1.0f);
                } else {
                    arrayList2.add(ObjectAnimator.ofFloat(this.C0, (Property<jx, Float>) View.SCALE_X, z10 ? 1.0f : 1.05f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.C0, (Property<jx, Float>) View.SCALE_Y, z10 ? 1.0f : 1.05f));
                }
            }
            if (this.g0 != null) {
                m5(false, false);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x1, z10 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new lv(this, i10));
            arrayList2.add(ofFloat);
            this.w1.playTogether(arrayList2);
            this.w1.setDuration(z10 ? 200L : 180L);
            this.w1.setInterpolator(org.telegram.ui.Components.gr.g);
            if (!z10) {
                this.w1.setStartDelay(20L);
            }
            this.w1.addListener(new cx(this, z10, i10));
            this.p3.d();
            this.w1.start();
        } else {
            M4(false, true);
            if (z10) {
                this.e0[0].a.c1();
            } else {
                vx vxVar = this.e0[0].a;
                if (vxVar.g1) {
                    vxVar.g1 = false;
                    vxVar.K0(false);
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
            jx jxVar11 = this.C0;
            if (jxVar11 != null) {
                jxVar11.setAlpha(z10 ? 1.0f : 0.0f);
                if (objArr == true) {
                    this.C0.setScaleX(1.0f);
                    this.C0.setScaleY(1.0f);
                } else {
                    this.C0.setScaleX(z10 ? 1.0f : 1.1f);
                    this.C0.setScaleY(z10 ? 1.0f : 1.1f);
                }
                this.C0.setVisibility(z10 ? 0 : 8);
            }
            ox oxVar = this.X;
            if (oxVar != null) {
                oxVar.setTranslationY(i4() + (z10 ? -org.telegram.messenger.i0.L(36.0f) : 0));
            }
            if (this.E0 != null) {
                if (!this.G0 || isInPreviewMode() || z10) {
                    this.E0.setVisibility(8);
                } else {
                    this.E0.setVisibility(0);
                }
            }
            P4(z10 ? 1.0f : 0.0f);
            this.fragmentView.invalidate();
        }
        int i12 = this.y;
        if (i12 >= 0 && (jxVar2 = this.C0) != null) {
            jxVar2.setPosition(jxVar2.N(i12));
        }
        if (!z10) {
            this.y = -1;
        }
        if (z10 && z11 && (jxVar = this.C0) != null) {
            jxVar.setPosition((jxVar.s0 ? 1 : 0) + 5);
            q5(true);
        }
        R3();
        g5();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Wk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Vk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.al));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Zk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Yk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Xk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Qi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.g8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Gj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.He));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.W8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Wl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.e9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.M7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.N7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.h9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.n9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.l9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.b8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.a8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Z7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Y7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.X7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.W7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.V7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.K7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.nk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Z5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.y9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.x9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.w9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.r9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.b9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.vi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.E8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G8));
    }

    public final void b4(long j10, boolean z10) {
        if (this.e0 == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            yx[] yxVarArr = this.e0;
            if (i10 >= yxVarArr.length) {
                return;
            }
            int childCount = yxVarArr[i10].a.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 < childCount) {
                    View childAt = this.e0[i10].a.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.v2) {
                        org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) childAt;
                        if (v2Var.getDialogId() == j10) {
                            v2Var.c0(z10, true);
                            break;
                        }
                    }
                    i11++;
                }
            }
            i10++;
        }
    }

    public final void b5() {
        int i10;
        int i11;
        if (this.M0 != null || org.telegram.messenger.uz.x || (this.K && !this.E0.g())) {
            return;
        }
        x21[] x21VarArr = new x21[1];
        TLRPC.User f7 = org.telegram.messenger.e20.i(org.telegram.messenger.e20.s0).f();
        org.telegram.ui.ActionBar.u5 titleTextView = this.actionBar.getTitleTextView();
        if (titleTextView == null || titleTextView.getRightDrawable() == null) {
            i10 = 0;
            i11 = 0;
        } else {
            this.D3.f();
            Drawable drawable = this.D3.f[0];
            Rect rect = org.telegram.messenger.i0.Q;
            rect.set(titleTextView.getRightDrawable().getBounds());
            rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
            int L = (-(this.actionBar.getHeight() - rect.centerY())) - org.telegram.messenger.i0.L(16.0f);
            i10 = org.telegram.messenger.i0.L(4.0f) + (rect.centerX() - org.telegram.messenger.i0.L(16.0f));
            org.telegram.ui.Cells.n nVar = this.E3;
            if (nVar != null) {
                nVar.b(rect.centerX(), rect.centerY());
            }
            i11 = L;
        }
        xw xwVar = new xw(this, this, getParentActivity(), Integer.valueOf(i10), getResourceProvider(), x21VarArr);
        if (f7 != null && org.telegram.messenger.o5.g(f7.emoji_status) > 0) {
            xwVar.setExpireDateHint(org.telegram.messenger.o5.g(f7.emoji_status));
        }
        Long l4 = this.B3;
        if (l4 != null) {
            xwVar.setSelected(l4);
        } else {
            Drawable drawable2 = this.D3.f[0];
            xwVar.setSelected(drawable2 instanceof org.telegram.ui.Components.f5 ? Long.valueOf(((org.telegram.ui.Components.f5) drawable2).h()) : null);
        }
        xwVar.setSaveState(1);
        xwVar.y(this.D3, titleTextView);
        yw ywVar = new yw(this, xwVar);
        this.M0 = ywVar;
        x21VarArr[0] = ywVar;
        ywVar.showAsDropDown(this.actionBar, org.telegram.messenger.i0.L(16.0f), i11, 48);
        x21VarArr[0].b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0069, code lost:
    
        if (r13.G.bot_admin_rights != null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v0, types: [org.telegram.ui.ActionBar.k2, org.telegram.ui.zx] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c5(TLRPC.Chat chat, Runnable runnable, Runnable runnable2) {
        CharSequence charSequence;
        String a02;
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.H));
        boolean V = org.telegram.messenger.w3.V(chat);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        int i10 = 1;
        int i11 = 2;
        String a03 = org.telegram.messenger.dd.a0(null, null, 2131754074, chat.title, org.telegram.messenger.i20.j(Z1, true));
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = a03;
        SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131754075, chat.title, org.telegram.messenger.i20.j(Z1, true)));
        Boolean bool = this.G.bot_participant;
        ?? r10 = "";
        if (bool == null || !bool.booleanValue() || getMessagesController().w2(chat, Z1)) {
            charSequence = r10;
        }
        if (this.G.bot_admin_rights == null) {
            a02 = org.telegram.messenger.dd.a0(null, null, 2131754077, org.telegram.messenger.i20.j(Z1, true), chat.title);
        } else {
            String j10 = org.telegram.messenger.i20.j(Z1, true);
            String str = chat.title;
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.G.bot_admin_rights;
            int i12 = org.telegram.ui.Cells.s6.c;
            ArrayList arrayList = new ArrayList();
            if (tL_chatAdminRights.change_info) {
                org.telegram.ui.Cells.f1.q(1, V ? org.telegram.messenger.dd.L0(2131751325, null) : org.telegram.messenger.dd.L0(2131751324, null), arrayList);
            }
            if (tL_chatAdminRights.post_messages && V) {
                org.telegram.ui.Cells.f1.q(1, org.telegram.messenger.dd.L0(2131751313, null), arrayList);
            }
            if (tL_chatAdminRights.edit_messages && V) {
                org.telegram.ui.Cells.f1.q(1, org.telegram.messenger.dd.L0(2131751320, null), arrayList);
            }
            if (tL_chatAdminRights.delete_messages) {
                org.telegram.ui.Cells.f1.q(1, org.telegram.messenger.dd.L0(V ? 2131751322 : 2131751317, null), arrayList);
            }
            if (tL_chatAdminRights.ban_users && !V) {
                org.telegram.ui.Cells.f1.q(1, org.telegram.messenger.dd.L0(2131751329, null), arrayList);
            }
            if (tL_chatAdminRights.invite_users) {
                org.telegram.ui.Cells.f1.q(1, org.telegram.messenger.dd.L0(2131751331, null), arrayList);
            }
            if (tL_chatAdminRights.pin_messages && !V) {
                org.telegram.ui.Cells.f1.q(1, org.telegram.messenger.dd.L0(2131751314, null), arrayList);
            }
            if (tL_chatAdminRights.add_admins) {
                org.telegram.ui.Cells.f1.q(1, org.telegram.messenger.dd.L0(2131751332, null), arrayList);
            }
            if (tL_chatAdminRights.anonymous && !V) {
                org.telegram.ui.Cells.f1.q(1, org.telegram.messenger.dd.L0(2131751304, null), arrayList);
            }
            if (tL_chatAdminRights.manage_call) {
                org.telegram.ui.Cells.f1.q(1, org.telegram.messenger.dd.L0(2131744919, null), arrayList);
            }
            if (tL_chatAdminRights.manage_topics && !V) {
                org.telegram.ui.Cells.f1.q(1, org.telegram.messenger.dd.L0(2131748707, null), arrayList);
            }
            if (arrayList.size() == 1) {
                r10 = ((org.telegram.ui.Cells.t6) arrayList.get(0)).b.toString().toLowerCase();
            } else if (!arrayList.isEmpty()) {
                r10 = new SpannableStringBuilder();
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    if (i13 > 0) {
                        r10.append(", ");
                    }
                    r10.append(((org.telegram.ui.Cells.t6) arrayList.get(i13)).b.toString().toLowerCase());
                }
            }
            a02 = org.telegram.messenger.dd.a0(null, null, 2131754076, new Object[]{j10, str, r10});
        }
        charSequence = TextUtils.concat("\n\n", org.telegram.messenger.i0.W2(a02));
        x1Var.T = TextUtils.concat(W2, charSequence);
        alertDialog$Builder.k(org.telegram.messenger.dd.a0("Send", null, 2131745657, new Object[0]), new hf(i10, runnable));
        alertDialog$Builder.h(org.telegram.messenger.dd.a0("Cancel", null, 2131752589, new Object[0]), new hf(i11, runnable2));
        showDialog(x1Var);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean canBeginSlide() {
        px pxVar;
        if (this.F3.c()) {
            return false;
        }
        return this.R0 != 3 || (pxVar = this.z0) == null || pxVar.getVisibility() != 0 || this.z0.K <= 0;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean closeLastFragment() {
        if (!this.F3.c()) {
            return super.closeLastFragment();
        }
        this.F3.a();
        jx jxVar = this.C0;
        if (jxVar == null) {
            return true;
        }
        jxVar.S();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.ActionBar.l createActionBar(Context context) {
        kg.g1 g1Var = new kg.g1(this, context, this.resourceProvider, 4);
        g1Var.setAllowOverlayTitle(true);
        g1Var.G0 = true;
        if (g1Var.F0 == null) {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(g1Var.getContext(), 9);
            g1Var.F0 = a5Var;
            g1Var.addView(a5Var);
        }
        org.telegram.ui.ActionBar.a7.m(g1Var, 3, org.telegram.ui.ActionBar.t6.t8, getResourceProvider());
        org.telegram.ui.ActionBar.a7.a(g1Var, org.telegram.ui.ActionBar.t6.z8, getResourceProvider(), true);
        org.telegram.ui.ActionBar.a7.m(g1Var, 1, org.telegram.ui.ActionBar.t6.v8, getResourceProvider());
        org.telegram.ui.ActionBar.a7.b(g1Var, org.telegram.ui.ActionBar.t6.y8, getResourceProvider(), true);
        if (g1Var.x1 == null) {
            org.telegram.ui.ActionBar.j jVar = new org.telegram.ui.ActionBar.j(g1Var, g1Var.getContext(), g1Var.J0, g1Var.O0);
            g1Var.x1 = jVar;
            jVar.setClipChildren(false);
            g1Var.addView(g1Var.x1);
        }
        g1Var.getAdditionalSubTitleOverlayContainer().setTranslationX(org.telegram.messenger.i0.L(4.0f));
        g1Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-org.telegram.messenger.i0.L(3.0f));
        if (!this.inPreviewMode && (!org.telegram.messenger.i0.Q1() || this.W2 == 0 || q4())) {
            return g1Var;
        }
        g1Var.setOccupyStatusBar(false);
        return g1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0c14  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0c56  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0c7f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0cc1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0cd7  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0cfe  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0db4  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0e0c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0e44  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0dce  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0c87  */
    /* JADX WARN: Type inference failed for: r10v18, types: [org.telegram.ui.Components.uk0, org.telegram.ui.vx] */
    /* JADX WARN: Type inference failed for: r10v23, types: [org.telegram.ui.Components.uk0, org.telegram.ui.vx] */
    /* JADX WARN: Type inference failed for: r10v24, types: [org.telegram.ui.Components.uk0, org.telegram.ui.vx] */
    /* JADX WARN: Type inference failed for: r10v26, types: [org.telegram.ui.gw, s4.a0] */
    /* JADX WARN: Type inference failed for: r13v10, types: [org.telegram.ui.Components.uk0, org.telegram.ui.vx] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r9v61, types: [android.graphics.drawable.BitmapDrawable] */
    @Override // org.telegram.ui.ActionBar.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        float f7;
        float f10;
        float f11;
        un unVar;
        px pxVar;
        ox oxVar;
        ox oxVar2;
        org.telegram.ui.Components.zr zrVar;
        xx xxVar;
        s4.x xVar;
        zf.m mVar;
        zf.m mVar2;
        zf.m mVar3;
        zf.m mVar4;
        zf.m mVar5;
        zf.m mVar6;
        tx txVar;
        int i10;
        int i11;
        TLRPC.UserProfilePhoto userProfilePhoto;
        ?? r92;
        int i12;
        int i13;
        Context context2 = context;
        int i14 = 0;
        this.j2 = false;
        this.k2 = false;
        this.V = false;
        this.V0 = null;
        this.z0 = null;
        ArrayList arrayList = this.I2;
        arrayList.clear();
        this.l3 = ViewConfiguration.get(context2).getScaledMaximumFlingVelocity();
        org.telegram.messenger.i0.g3(new dv(context2, i14));
        this.N1 = null;
        this.L1 = null;
        this.M1 = null;
        this.Q1 = null;
        this.J1 = null;
        org.telegram.ui.ActionBar.y p5 = this.actionBar.p();
        p5.setTranslationX(-org.telegram.messenger.i0.L(5.0f));
        org.telegram.ui.ActionBar.t0 a2 = p5.a(0, R.drawable.outline_header_search);
        a2.N();
        this.j0 = a2;
        int i15 = 3;
        a2.setOnClickListener(new gv(this, i15));
        int i16 = 8;
        int i17 = 2;
        if (this.R0 == 2 || (q4() && d4(this.currentAccount, this.R0, this.W2, false).isEmpty())) {
            this.j0.setVisibility(8);
        }
        this.j0.setVisibility(8);
        ?? r52 = 1;
        ?? r53 = 1;
        if (!this.l2 && this.n2 == null && this.W2 == 0 && this.Y2 == 0) {
            int i18 = org.telegram.ui.ActionBar.t6.t8;
            int themedColor = getThemedColor(i18);
            int i19 = org.telegram.ui.ActionBar.t6.v8;
            org.telegram.ui.ActionBar.t0 t0Var = new org.telegram.ui.ActionBar.t0(context2, themedColor, getThemedColor(i19));
            this.m0 = t0Var;
            t0Var.setText(org.telegram.messenger.dd.K0(2131751355).toUpperCase());
            if (this.m0.getTextView() != null) {
                org.telegram.ui.ActionBar.a7.V(this.m0.getTextView(), i19, getResourceProvider());
            }
            org.telegram.ui.ActionBar.t0 t0Var2 = this.m0;
            org.telegram.ui.ActionBar.a7.R(t0Var2, t0Var2.getBackground(), null, org.telegram.ui.ActionBar.a7.N(i18), getResourceProvider());
            this.actionBar.addView(this.m0, w7.b6.d(-2, -2.0f, 53, 0.0f, 0.0f, 10.0f, 0.0f));
            this.m0.setOnClickListener(new gv(this, i16));
            this.m0.setAlpha(0.0f);
            this.m0.setVisibility(8);
            this.n0 = new org.telegram.ui.Components.lh0(context2);
            org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(context2, this.resourceProvider, false, true);
            this.o0 = b1Var;
            b1Var.setItemHeight(56);
            this.o0.j(org.telegram.messenger.dd.K0(2131748620), 0, this.n0);
            this.o0.setContentDescription(org.telegram.messenger.dd.K0(2131746616));
            org.telegram.ui.ActionBar.t0 a10 = p5.a(1, R.drawable.outline_header_lock_24);
            this.f0 = a10;
            a10.setContentDescription(org.telegram.messenger.dd.K0(2131754813));
            org.telegram.ui.ActionBar.t0 d = p5.d(3, new ColorDrawable(0));
            this.g0 = d;
            cy cyVar = new cy(context2, this.currentAccount);
            this.h0 = cyVar;
            d.addView(cyVar);
            this.g0.setContentDescription(org.telegram.messenger.dd.K0(2131751344));
            this.g0.setVisibility(8);
            m5(false, false);
        }
        ox oxVar3 = new ox(context2, this.resourceProvider);
        this.X = oxVar3;
        oxVar3.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        this.X.setPivotX(0.0f);
        this.X.setPivotY(0.0f);
        int i20 = 9;
        if (this.R0 == 0) {
            org.telegram.ui.ActionBar.t0 a11 = p5.a(-47, R.drawable.avd_speed);
            this.l0 = a11;
            org.telegram.messenger.i0.E2(a11);
            this.l0.setOnClickListener(new gv(this, i20));
            this.X.a(this.l0);
            this.X.updateColors();
        }
        this.X.setCloseButtonOnClickListener(new ev(this, 16));
        this.X.r.setOnFocusChangeListener(new od(this, r53 == true ? 1 : 0));
        org.telegram.ui.ActionBar.n0 n0Var = this.X.r;
        int i21 = 11;
        rf.a0 a0Var = new rf.a0(n0Var, new ag.l3(this, i21));
        this.Y = a0Var;
        n0Var.addTextChangedListener(a0Var);
        this.X.setSearchFiltersListener(new hw(this));
        this.Y.a();
        int i22 = 10;
        if (this.R0 == 0) {
            org.telegram.ui.ActionBar.t0 a12 = p5.a(4, R.drawable.ic_ab_other);
            this.k0 = a12;
            a12.setContentDescription(org.telegram.messenger.dd.K0(2131754839));
            this.k0.setOnClickListener(new gv(this, i22));
            this.k0.setOnLongClickListener(new tv(this, i15));
        }
        this.j0.setSearchFieldHint(org.telegram.messenger.dd.K0(2131745853));
        this.j0.setContentDescription(org.telegram.messenger.dd.K0(2131745853));
        if (this.l2) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            int i23 = this.R0;
            if (i23 == 16) {
                this.actionBar.setTitle(org.telegram.messenger.dd.K0(2131753100));
            } else if (this.N0) {
                this.actionBar.setTitle(org.telegram.messenger.dd.K0(2131746269));
            } else if (this.O0) {
                this.actionBar.setTitle(org.telegram.messenger.dd.K0(2131746444));
            } else if (i23 == 3 && this.f2 == null) {
                this.actionBar.setTitle(org.telegram.messenger.dd.K0(2131750577));
            } else if (i23 == 10) {
                this.actionBar.setTitle(org.telegram.messenger.dd.K0(2131745685));
            } else if (i23 == 14) {
                boolean z10 = this.A2;
                if (!z10 || this.z2 || this.v2 || this.y2) {
                    boolean z11 = this.z2;
                    if (!z11 || z10) {
                        i12 = 2131745686;
                    } else {
                        i12 = 2131745686;
                        if (!this.v2 && !this.y2) {
                            this.actionBar.setTitle(org.telegram.messenger.dd.K0(2131752110));
                        }
                    }
                    boolean z12 = this.v2;
                    if (!z12 || z11 || z10) {
                        i13 = 2131752135;
                    } else {
                        i13 = 2131752135;
                        if (!this.y2) {
                            this.actionBar.setTitle(org.telegram.messenger.dd.K0(2131752125));
                        }
                    }
                    if (!this.y2 || z11 || z10 || z12) {
                        this.actionBar.setTitle(org.telegram.messenger.dd.K0(i12));
                    } else {
                        this.actionBar.setTitle(org.telegram.messenger.dd.K0(i13));
                    }
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.dd.K0(2131752137));
                }
            } else {
                TLRPC.RequestPeerType requestPeerType = this.G;
                if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                    Boolean bool = ((TLRPC.TL_requestPeerTypeUser) requestPeerType).bot;
                    if (bool == null) {
                        this.actionBar.setTitle(org.telegram.messenger.dd.K0(2131752110));
                    } else if (bool.booleanValue()) {
                        this.actionBar.setTitle(org.telegram.messenger.dd.K0(2131752137));
                    } else {
                        this.actionBar.setTitle(org.telegram.messenger.dd.K0(2131752110));
                    }
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
                    this.actionBar.setTitle(org.telegram.messenger.dd.K0(2131752135));
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
                    this.actionBar.setTitle(org.telegram.messenger.dd.K0(2131752125));
                } else {
                    this.actionBar.setTitle(org.telegram.messenger.dd.K0(2131745686));
                }
            }
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, this.actionBar, getResourceProvider());
        } else {
            if (this.n2 != null || this.W2 != 0 || this.Y2 != 0) {
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(false);
                this.e1 = c2Var;
                lVar.setBackButtonDrawable(c2Var);
            }
            if (this.W2 != 0) {
                this.actionBar.setTitle(org.telegram.messenger.dd.K0(2131754136));
            } else if (this.Y2 != 0) {
                this.actionBar.setTitle(org.telegram.messenger.o5.m(this.Z2));
                this.actionBar.setAdditionalTextLeft(org.telegram.messenger.i0.L(28.0f));
                this.c3 = new org.telegram.ui.Components.r8(this.Z2);
                org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(getContext());
                this.b3 = g9Var;
                g9Var.setRoundRadius(org.telegram.messenger.i0.L(11.0f));
                this.b3.e(this.Z2, this.c3);
                this.actionBar.addView(this.b3, w7.b6.d(32, 32.0f, 83, 58.0f, 0.0f, 0.0f, 12.0f));
            } else {
                org.telegram.ui.Components.d5 d5Var = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(26.0f), null);
                this.D3 = d5Var;
                d5Var.a = true;
                Drawable f12 = i0.a.f(context2, R.drawable.telegram_logo_2);
                this.C3 = f12;
                f12.setBounds(0, org.telegram.messenger.i0.L(2.0f), this.C3.getIntrinsicWidth(), this.C3.getIntrinsicHeight() + org.telegram.messenger.i0.L(2.0f));
                Drawable drawable = this.C3;
                int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.t6.Ul);
                this.v4 = themedColor2;
                drawable.setColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.dd.K0(R.string.AppName));
                spannableStringBuilder.setSpan(new ImageSpan(this.C3), 0, spannableStringBuilder.length(), 33);
                this.actionBar.J(spannableStringBuilder, this.D3);
                r5(org.telegram.messenger.e20.i(this.currentAccount).f(), false);
            }
            if (this.W2 == 0) {
                this.actionBar.setSupportsHolidayImage(true);
            }
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        int i24 = 17;
        this.actionBar.setTitleActionRunnable(new ev(this, i24));
        int i25 = this.R0;
        if (((i25 == 0 && !this.l2) || i25 == 3) && this.W2 == 0 && this.Y2 == 0 && TextUtils.isEmpty(this.n2)) {
            px pxVar2 = new px(this, context2, this.resourceProvider);
            this.z0 = pxVar2;
            pxVar2.setVisibility(8);
            this.x = false;
            this.r.a(false, false);
            this.z0.setDelegate(new qx(context2, this));
        }
        if (this.r2 && org.telegram.messenger.e20.c() > 1) {
            this.D1 = p5.g(11, 0, org.telegram.messenger.i0.L(56.0f));
            org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8();
            r8Var.u(org.telegram.messenger.i0.L(12.0f));
            org.telegram.ui.Components.g9 g9Var2 = new org.telegram.ui.Components.g9(context2);
            g9Var2.setRoundRadius(org.telegram.messenger.i0.L(18.0f));
            this.D1.addView(g9Var2, w7.b6.e(36, 36, 17));
            this.D1.setOnClickListener(new gv(this, i21));
            this.D1.setOnLongClickListener(new tv(this, i17));
            TLRPC.User f13 = getUserConfig().f();
            r8Var.r(f13);
            ImageReceiver imageReceiver = g9Var2.getImageReceiver();
            int i26 = this.currentAccount;
            imageReceiver.d = i26;
            g9Var2.m(org.telegram.messenger.jc.m(i26, 1, f13), "50_50", org.telegram.messenger.jc.n(f13), "50_50", (f13 == null || (userProfilePhoto = f13.photo) == null || (r92 = userProfilePhoto.strippedBitmap) == null) ? r8Var : r92, f13);
        }
        this.actionBar.setActionBarMenuOnItemClick(new ar(this, 18));
        sx sxVar = new sx(context2, this);
        this.fragmentView = sxVar;
        this.r4 = new xv(this, sxVar, new PointF(), i14);
        int i27 = (this.W2 == 0 && this.Y2 == 0 && (((i11 = this.R0) == 0 && !this.l2) || i11 == 3)) ? 2 : 1;
        this.e0 = new yx[i27];
        int i28 = 0;
        while (i28 < i27) {
            yx yxVar = new yx(context2, this);
            sxVar.addView(yxVar, w7.b6.c(-1.0f, -1));
            yxVar.s = this.R0;
            this.e0[i28] = yxVar;
            yxVar.x = new org.telegram.ui.Components.zz(context2);
            yxVar.x.setViewType(7);
            yxVar.x.setVisibility(i16);
            yxVar.addView(yxVar.x, w7.b6.e(-2, -2, i24));
            vx vxVar = new vx(this, context2, yxVar);
            yxVar.a = vxVar;
            this.glassEngine.b(vxVar);
            ?? r13 = yxVar.a;
            yxVar.b = new a5.a((org.telegram.ui.Components.uk0) r13);
            r13.setAllowStopHeaveOperations(r52);
            yxVar.a.setAccessibilityEnabled(false);
            yxVar.a.o1(0, r52);
            yxVar.a.setClipToPadding(false);
            yxVar.a.setPivotY(0.0f);
            if (this.R0 == 15) {
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.a7, yxVar.a, getResourceProvider());
            }
            yxVar.y = new ew(yxVar.a, yxVar);
            yxVar.a.setVerticalScrollBarEnabled(r52);
            yxVar.a.setInstantClick(r52);
            yxVar.c = new gw(this, yxVar);
            yxVar.c.j1(r52);
            yxVar.a.setLayoutManager(yxVar.c);
            yxVar.a.setVerticalScrollbarPosition(org.telegram.messenger.dd.X ? r52 : 2);
            yxVar.addView(yxVar.a, w7.b6.c(-1.0f, -1));
            yxVar.a.setOnItemClickListener(new qv(i17, this, yxVar));
            yxVar.a.setOnItemLongClickListener(new m4.c(i24, this, yxVar));
            yxVar.f = new xx(this, yxVar);
            yxVar.D = new org.telegram.ui.Components.xj0(yxVar.a, false);
            xxVar = yxVar.f;
            yxVar.e = new s4.x(xxVar);
            xVar = yxVar.e;
            xVar.h(yxVar.a);
            yxVar.a.setOnScrollListener(new iw(this, yxVar, sxVar));
            yxVar.w = org.telegram.messenger.uz.q1 ? 2 : 0;
            if (yxVar.n == null && this.W2 == 0 && this.Y2 == 0) {
                yxVar.n = new jw(org.telegram.messenger.dd.K0(2131754720), org.telegram.messenger.dd.K0(2131754722), yxVar);
                if (l4()) {
                    yxVar.n.h();
                } else {
                    yxVar.n.b();
                }
                jw jwVar = yxVar.n;
                i10 = yxVar.w;
                jwVar.g(i10 != 0 ? r52 : false);
            }
            sx sxVar2 = sxVar;
            boolean z13 = r52;
            int i29 = i28;
            int i30 = i27;
            context2 = context;
            yxVar.d = new kw(this, this, context, yxVar.s, this.W2, this.l2, arrayList, this.currentAccount, this.G, yxVar);
            mVar = yxVar.d;
            mVar.S(yxVar.a);
            mVar2 = yxVar.d;
            mVar2.Q(this.t2);
            if (yxVar.s == 3) {
                mVar6 = yxVar.d;
                mVar6.N((getMessagesController().T4() && (txVar = this.C2) != null && txVar.H()) ? z13 : false);
            }
            if (org.telegram.messenger.i0.Q1()) {
                org.telegram.messenger.hs hsVar = this.p2;
                if (hsVar.a != 0) {
                    mVar5 = yxVar.d;
                    mVar5.R(hsVar.a);
                }
            }
            mVar3 = yxVar.d;
            mVar3.O(yxVar.n);
            vx vxVar2 = yxVar.a;
            mVar4 = yxVar.d;
            vxVar2.setAdapter(mVar4);
            yxVar.a.setEmptyView((this.W2 == 0 && this.Y2 == 0) ? yxVar.x : null);
            yxVar.r = new org.telegram.ui.Components.wj0(yxVar.a, yxVar.c);
            org.telegram.ui.Components.wj0 wj0Var = yxVar.r;
            wj0Var.c = z13;
            wj0Var.d = z13;
            wj0Var.h = new hv(this, 13);
            if (i29 != 0) {
                this.e0[i29].setVisibility(8);
            }
            i28 = i29 + 1;
            i21 = 11;
            sxVar = sxVar2;
            r52 = z13;
            i27 = i30;
            i24 = 17;
            i16 = 8;
        }
        sx sxVar3 = sxVar;
        int i31 = i21;
        int i32 = r52;
        org.telegram.ui.Components.yr yrVar = new org.telegram.ui.Components.yr(context2);
        this.K1 = yrVar;
        int i33 = org.telegram.ui.ActionBar.t6.d6;
        yrVar.setColor(org.telegram.ui.ActionBar.t6.v0(i33));
        sxVar3.addView(this.K1, w7.b6.e(-1, 100, 48));
        this.B0 = sxVar3.getChildCount();
        q01 q01Var = new q01((Activity) getContext());
        this.Z = q01Var;
        sxVar3.addView(q01Var, w7.b6.d(-1, 50.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
        q01 q01Var2 = this.Z;
        wg.d o10 = w7.b9.o(this.resourceProvider);
        tg.b bVar = this.p4;
        vg.f b10 = bVar.b(q01Var2, o10);
        org.telegram.messenger.a30.u(b10, org.telegram.messenger.i0.L(18.0f), 6.666f);
        this.Z.setPadding(0, org.telegram.messenger.i0.L(7.0f), 0, org.telegram.messenger.i0.L(7.0f));
        this.Z.setBlurredBackground(b10);
        zf.g0 g0Var = new zf.g0(getParentActivity(), null);
        this.b0 = g0Var;
        g0Var.setPadding(0, org.telegram.messenger.i0.L(3.0f), 0, org.telegram.messenger.i0.L(3.0f));
        zf.g0 g0Var2 = this.b0;
        g0Var2.h3 = false;
        g0Var2.setOnItemClickListener(new mv(this, i32));
        this.Z.addView(this.b0, w7.b6.e(-1, -1, 48));
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context2, this.resourceProvider, i32);
        this.u0 = f10Var;
        f10Var.setContentDescription(org.telegram.messenger.dd.K0(2131744577));
        this.u0.setImageResource(R.drawable.outline_fab_story_24);
        this.u0.setOnClickListener(new gv(this, 27));
        sxVar3.addView(this.u0, org.telegram.ui.Components.f10.c());
        org.telegram.ui.Components.f10 f10Var2 = new org.telegram.ui.Components.f10(context2, this.resourceProvider);
        this.t0 = f10Var2;
        sxVar3.addView(f10Var2, org.telegram.ui.Components.f10.b());
        this.t0.setOnClickListener(new gv(this, 28));
        if (!q4() && this.R0 == 0 && org.telegram.messenger.wp.r1(this.currentAccount).s1().getBoolean("storyhint", i32)) {
            vh.p2 p2Var = new vh.p2(context2, 2);
            p2Var.q(8.0f);
            p2Var.d = 8000L;
            p2Var.i(i32);
            p2Var.n();
            p2Var.p(i32);
            f7 = 8.0f;
            p2Var.s(org.telegram.messenger.i0.J2(org.telegram.messenger.dd.K0(2131744730), vh.o8.m(context2), "%s"));
            p2Var.l(1.0f, -40.0f);
            p2Var.h(getThemedColor(org.telegram.ui.ActionBar.t6.tj));
            p2Var.l0 = new dw(this, i17);
            this.p0 = p2Var;
            sxVar3.addView(p2Var, w7.b6.d(-1, 160.0f, 87, 0.0f, 0.0f, 80.0f, 0.0f));
        } else {
            f7 = 8.0f;
        }
        s5();
        this.a0 = null;
        int i34 = 5;
        if (this.l2 || this.R0 != 0) {
            f10 = 72.0f;
            if (this.R0 == 3 || U3()) {
                zg.e eVar = new zg.e(context2);
                this.y1 = eVar;
                eVar.setClipChildren(false);
                zg.e eVar2 = this.y1;
                hh.i iVar = this.w;
                eVar2.setWindowInsetsProvider(iVar);
                zg.e eVar3 = this.y1;
                eVar3.setInputIslandBubbleDrawable(bVar.b(eVar3, w7.b9.o(this.resourceProvider)));
                zg.e eVar4 = this.y1;
                eVar4.setUnderKeyboardBackgroundDrawable(this.n4.b(eVar4, w7.b9.o(this.resourceProvider)));
                tg.c cVar = new tg.c(this.q4.b(this.y1, null));
                if (!org.telegram.messenger.uz.f() || org.telegram.messenger.tc.e(262144)) {
                    cVar.b(org.telegram.messenger.i0.L(72.0f), i32);
                }
                this.y1.setBackgroundWithFadeDrawable(cVar);
                FrameLayout inputIslandBubbleContainer = this.y1.getInputIslandBubbleContainer();
                this.z1 = inputIslandBubbleContainer;
                inputIslandBubbleContainer.setClipChildren(false);
                this.A1 = this.y1.getInAppKeyboardBubbleContainer();
                nw nwVar = this.B1;
                if (nwVar != null) {
                    nwVar.z0();
                }
                nw nwVar2 = new nw(this, getParentActivity(), sxVar3);
                this.B1 = nwVar2;
                nwVar2.setInAppInsetsController(iVar);
                this.B1.y4 = false;
                sxVar3.setClipChildren(false);
                sxVar3.setClipToPadding(false);
                nw nwVar3 = this.B1;
                nwVar3.x4 = false;
                nwVar3.i2 = (org.telegram.messenger.i0.E || ((unVar = nwVar3.P2) != null && unVar.isInBubbleMode())) ? false : i32;
                this.B1.S0(false, false);
                this.B1.e1(i32, false);
                this.B1.z1.setPadding(0, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(20.0f), 0);
                f11 = 0.0f;
                this.B1.getSendButton().setAlpha(0.0f);
                this.B1.setViewParentForEmoji(this.A1);
                this.z1.addView(this.B1, w7.b6.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
                sxVar3.addView(this.y1.getFadeView(), w7.b6.c(-1.0f, -1));
                sxVar3.addView(this.y1, w7.b6.c(-1.0f, -1));
                if (m4() || this.E2 != null || this.F2 != null) {
                    v3(this.U3);
                    this.U3 = null;
                }
                this.B1.setDelegate(new hw(this));
                bi.f2 f2Var = new bi.f2(this, context2, this.resourceProvider);
                this.C1 = f2Var;
                int L = org.telegram.messenger.i0.L(52.0f);
                int L2 = org.telegram.messenger.i0.L(38.0f);
                f2Var.I = L;
                f2Var.J = L2;
                bi.f2 f2Var2 = this.C1;
                float L3 = org.telegram.messenger.i0.L(7.0f);
                float L4 = org.telegram.messenger.i0.L(f7);
                f2Var2.M = L3;
                f2Var2.N = L4;
                bi.f2 f2Var3 = this.C1;
                f2Var3.h0 = i32;
                sxVar3.addView(f2Var3, w7.b6.e(org.telegram.messenger.at.v1, 50, 85));
                this.C1.setScrimViewBackgroundColor(getThemedColor(i33));
                this.C1.setOnClickListener(new gv(this, i34));
                this.C1.setOnLongClickListener(new tv(this, i14));
                this.C1.setVisibility(8);
                this.C1.setScaleX(0.2f);
                this.C1.setScaleY(0.2f);
                this.C1.setAlpha(0.0f);
                float L5 = org.telegram.messenger.i0.L(12.0f);
                TextPaint textPaint = this.E1;
                textPaint.setTextSize(L5);
                textPaint.setTypeface(org.telegram.messenger.i0.o());
                pxVar = this.z0;
                if (pxVar != null) {
                    vg.f b11 = bVar.b(pxVar, w7.b9.o(this.resourceProvider));
                    org.telegram.messenger.a30.u(b11, org.telegram.messenger.i0.L(18.0f), 6.666f);
                    this.z0.setPadding(0, org.telegram.messenger.i0.L(7.0f), 0, org.telegram.messenger.i0.L(7.0f));
                    this.z0.setBlurredBackground(b11);
                    sxVar3.addView(this.z0, w7.b6.d(-1, 50.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
                }
                oxVar = this.X;
                if (oxVar != null) {
                    oxVar.setupBlurredBackground(bVar.b(oxVar, w7.b9.o(this.resourceProvider)));
                }
                tw twVar = new tw(this, context2, this, this.currentAccount, q4() ? 1 : 0);
                this.E0 = twVar;
                twVar.setActionBar(this.actionBar);
                this.E0.setMenuItemsOffset(!q4() ? org.telegram.messenger.i0.L(68.0f) : org.telegram.messenger.i0.N(16.66f));
                tw twVar2 = this.E0;
                twVar2.l0 = false;
                twVar2.setVisibility(8);
                this.M = false;
                this.L = false;
                this.K = false;
                if (this.l2 && this.R0 == 3) {
                    org.telegram.messenger.wp.r1(this.currentAccount).I1();
                }
                sxVar3.addView(this.actionBar, w7.b6.c(-2.0f, -1));
                if (!this.l2) {
                    org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(context2);
                    this.E3 = nVar;
                    sxVar3.addView(nVar, w7.b6.e(20, 20, 51));
                }
                oxVar2 = this.X;
                if (oxVar2 != null) {
                    sxVar3.addView(oxVar2, w7.b6.d(-1, 48.0f, 48, 7.0f, -2.0f, 7.0f, 0.0f));
                }
                this.x0 = sxVar3.getChildCount();
                UndoView[] undoViewArr = this.y0;
                undoViewArr[0] = null;
                undoViewArr[i32] = null;
                if (this.W) {
                    this.actionBar.getTitlesContainer().setTranslationX(org.telegram.messenger.i0.L(4.0f));
                    org.telegram.ui.ActionBar.a7.d(this.actionBar, org.telegram.ui.ActionBar.t6.Ul, getResourceProvider());
                }
                if (this.W2 == 0 || this.Y2 != 0) {
                    this.e0[0].a.setGlowColor(getThemedColor(i33));
                    org.telegram.ui.ActionBar.a7.b(this.actionBar, org.telegram.ui.ActionBar.t6.O8, getResourceProvider(), false);
                    org.telegram.ui.ActionBar.a7.a(this.actionBar, org.telegram.ui.ActionBar.t6.N8, getResourceProvider(), false);
                    this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.t6.Q8), false);
                    this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.t6.R8), i32);
                }
                if (!this.l2 && this.R0 == 0) {
                    bi.t0 t0Var3 = new bi.t0(this, context2, 25);
                    this.K0 = t0Var3;
                    t0Var3.setForeground(new ColorDrawable(i0.b.o(getThemedColor(i33), 100)));
                    this.K0.setFocusable(false);
                    this.K0.setImportantForAccessibility(2);
                    this.K0.setOnClickListener(new gv(this, 7));
                    this.K0.setVisibility(8);
                    sxVar3.addView(this.K0, w7.b6.c(-1.0f, -1));
                }
                this.f1.setColor(getThemedColor(i33));
                this.q3 = false;
                if (this.n2 == null) {
                    a5(i32, false, false, false);
                    this.X.r.setText(this.n2);
                    this.X.r.setSelection(this.n2.length());
                } else if (this.o2 != null) {
                    a5(i32, false, false, i32);
                    this.X.r.setText(this.o2);
                    this.X.r.setSelection(this.o2.length());
                    this.o2 = null;
                    ox oxVar4 = this.X;
                    if (oxVar4 != null) {
                        oxVar4.setTranslationY(i4() + (-org.telegram.messenger.i0.L(36.0f)));
                    }
                } else {
                    a5(false, false, false, false);
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    FilesMigrationService.a(this);
                }
                this.actionBar.setDrawBlurBackground(sxVar3);
                this.F3 = new ww(this, context2, sxVar3, context2);
                i5(i32, false);
                this.F3.setOpenProgress(f11);
                sxVar3.addView(this.E0, w7.b6.c(81.0f, -1));
                sxVar3.addView(this.F3, w7.b6.c(-1.0f, -1));
                this.F0 = new org.telegram.ui.Components.xr(context2);
                zrVar = this.J1;
                if (zrVar != null) {
                    sxVar3.addView(zrVar, w7.b6.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
                }
                if (this.Y2 != 0 && this.R0 != 3 && org.telegram.messenger.w3.c(this.Z2)) {
                    org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(R.drawable.filled_add_album);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("+ ");
                    spannableStringBuilder2.append((CharSequence) org.telegram.messenger.dd.K0(2131751989));
                    spannableStringBuilder2.setSpan(dqVar, 0, i32, 33);
                    vh.d dVar = new vh.d(context2, this.resourceProvider);
                    this.v0 = dVar;
                    dVar.f();
                    this.v0.setText(spannableStringBuilder2);
                    this.v0.setOnClickListener(new vu(3, this, new org.telegram.ui.ActionBar.x1[i32]));
                    bh.i iVar2 = new bh.i(getContext());
                    this.w0 = iVar2;
                    iVar2.setupColorKey(org.telegram.ui.ActionBar.t6.a7);
                    this.w0.setFadeZoneBottom(org.telegram.messenger.i0.L(f10) + org.telegram.messenger.i0.n);
                    this.w0.setFadeHeightBottom(org.telegram.messenger.i0.L(24.0f));
                    sxVar3.addView(this.w0, w7.b6.g());
                    sxVar3.addView(this.v0, w7.b6.f(48.0f, -1, 80, org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f) + org.telegram.messenger.i0.n));
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
                ei.r rVar = this.glassEngine;
                rVar.a = new hv(this, 8);
                rVar.d = new gi.b(org.telegram.messenger.i0.L(48.0f));
                r0.h0.l(this.fragmentView, new hv(this, 9));
                return this.fragmentView;
            }
        } else {
            org.telegram.ui.Components.zr zrVar2 = new org.telegram.ui.Components.zr(context2);
            this.J1 = zrVar2;
            zrVar2.setOnAnimatedHeightChangedListener(new dw(this, i31));
            vg.f a13 = bVar.a(this.J1);
            a13.o(w7.b9.o(this.resourceProvider));
            a13.p(org.telegram.messenger.i0.L(7.0f));
            f10 = 72.0f;
            this.J1.setPadding(org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(21.0f));
            this.J1.setBlurredBackground(a13);
            this.J1.setDefaultRadiusDp(this.Y2 != 0 ? 18 : 24);
            FrameLayout frameLayout = new FrameLayout(context2);
            this.G1 = frameLayout;
            this.J1.addView(frameLayout);
            this.J1.h(5, this.G1);
            this.J1.g(this.G1);
            this.J1.i(this.G1, i32, false);
            FrameLayout frameLayout2 = new FrameLayout(context2);
            this.I1 = frameLayout2;
            this.J1.addView(frameLayout2);
            int i35 = 4;
            this.J1.h(4, this.I1);
            this.J1.g(this.I1);
            this.J1.i(this.I1, i32, false);
            lw lwVar = new lw(this, context2, this, 0);
            this.F1 = lwVar;
            this.G1.addView(lwVar);
            lw lwVar2 = new lw(this, context2, this, i32);
            this.H1 = lwVar2;
            this.I1.addView(lwVar2);
            this.J1.setCallFragmentContextView(this.H1);
            org.telegram.ui.Cells.d3 d3Var = new org.telegram.ui.Cells.d3(context2);
            this.M1 = d3Var;
            d3Var.setBackground(org.telegram.ui.ActionBar.t6.N0(false));
            g5();
            y6.m0(new jv(this, i14));
            y6.r0(new z4(this, i31));
            this.J1.addView(this.M1);
            if (this.Y2 != 0) {
                zh.j jVar = new zh.j(context2, this.resourceProvider, i32);
                this.Q1 = jVar;
                jVar.a(-14899731, -15497247, R.drawable.filled_requests_24, org.telegram.messenger.dd.K0(2131751895), null, false);
                this.Q1.setUnreadMode(i32);
                this.Q1.setBackground(org.telegram.ui.ActionBar.t6.N0(false));
                this.Q1.setOnClickListener(new gv(this, i35));
                this.J1.addView(this.Q1);
                B3(false);
            }
        }
        f11 = 0.0f;
        pxVar = this.z0;
        if (pxVar != null) {
        }
        oxVar = this.X;
        if (oxVar != null) {
        }
        tw twVar3 = new tw(this, context2, this, this.currentAccount, q4() ? 1 : 0);
        this.E0 = twVar3;
        twVar3.setActionBar(this.actionBar);
        this.E0.setMenuItemsOffset(!q4() ? org.telegram.messenger.i0.L(68.0f) : org.telegram.messenger.i0.N(16.66f));
        tw twVar22 = this.E0;
        twVar22.l0 = false;
        twVar22.setVisibility(8);
        this.M = false;
        this.L = false;
        this.K = false;
        if (this.l2) {
            org.telegram.messenger.wp.r1(this.currentAccount).I1();
        }
        sxVar3.addView(this.actionBar, w7.b6.c(-2.0f, -1));
        if (!this.l2) {
        }
        oxVar2 = this.X;
        if (oxVar2 != null) {
        }
        this.x0 = sxVar3.getChildCount();
        UndoView[] undoViewArr2 = this.y0;
        undoViewArr2[0] = null;
        undoViewArr2[i32] = null;
        if (this.W) {
        }
        if (this.W2 == 0) {
        }
        this.e0[0].a.setGlowColor(getThemedColor(i33));
        org.telegram.ui.ActionBar.a7.b(this.actionBar, org.telegram.ui.ActionBar.t6.O8, getResourceProvider(), false);
        org.telegram.ui.ActionBar.a7.a(this.actionBar, org.telegram.ui.ActionBar.t6.N8, getResourceProvider(), false);
        this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.t6.Q8), false);
        this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.t6.R8), i32);
        if (!this.l2) {
            bi.t0 t0Var32 = new bi.t0(this, context2, 25);
            this.K0 = t0Var32;
            t0Var32.setForeground(new ColorDrawable(i0.b.o(getThemedColor(i33), 100)));
            this.K0.setFocusable(false);
            this.K0.setImportantForAccessibility(2);
            this.K0.setOnClickListener(new gv(this, 7));
            this.K0.setVisibility(8);
            sxVar3.addView(this.K0, w7.b6.c(-1.0f, -1));
        }
        this.f1.setColor(getThemedColor(i33));
        this.q3 = false;
        if (this.n2 == null) {
        }
        if (Build.VERSION.SDK_INT >= 30) {
        }
        this.actionBar.setDrawBlurBackground(sxVar3);
        this.F3 = new ww(this, context2, sxVar3, context2);
        i5(i32, false);
        this.F3.setOpenProgress(f11);
        sxVar3.addView(this.E0, w7.b6.c(81.0f, -1));
        sxVar3.addView(this.F3, w7.b6.c(-1.0f, -1));
        this.F0 = new org.telegram.ui.Components.xr(context2);
        zrVar = this.J1;
        if (zrVar != null) {
        }
        if (this.Y2 != 0) {
            org.telegram.ui.Components.dq dqVar2 = new org.telegram.ui.Components.dq(R.drawable.filled_add_album);
            SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder("+ ");
            spannableStringBuilder22.append((CharSequence) org.telegram.messenger.dd.K0(2131751989));
            spannableStringBuilder22.setSpan(dqVar2, 0, i32, 33);
            vh.d dVar2 = new vh.d(context2, this.resourceProvider);
            this.v0 = dVar2;
            dVar2.f();
            this.v0.setText(spannableStringBuilder22);
            this.v0.setOnClickListener(new vu(3, this, new org.telegram.ui.ActionBar.x1[i32]));
            bh.i iVar22 = new bh.i(getContext());
            this.w0 = iVar22;
            iVar22.setupColorKey(org.telegram.ui.ActionBar.t6.a7);
            this.w0.setFadeZoneBottom(org.telegram.messenger.i0.L(f10) + org.telegram.messenger.i0.n);
            this.w0.setFadeHeightBottom(org.telegram.messenger.i0.L(24.0f));
            sxVar3.addView(this.w0, w7.b6.g());
            sxVar3.addView(this.v0, w7.b6.f(48.0f, -1, 80, org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f) + org.telegram.messenger.i0.n));
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
        ei.r rVar2 = this.glassEngine;
        rVar2.a = new hv(this, 8);
        rVar2.d = new gi.b(org.telegram.messenger.i0.L(48.0f));
        r0.h0.l(this.fragmentView, new hv(this, 9));
        return this.fragmentView;
    }

    /* JADX WARN: Removed duplicated region for block: B:283:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0218 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList d4(int i10, int i11, int i12, boolean z10) {
        boolean z11;
        ArrayList arrayList;
        if (z10 && (arrayList = this.R1) != null) {
            return arrayList;
        }
        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(org.telegram.messenger.c.a(i10).a);
        a0.h hVar = r12.Q;
        ArrayList arrayList2 = r12.J;
        ArrayList arrayList3 = r12.I;
        ArrayList arrayList4 = r12.H;
        ArrayList arrayList5 = r12.G;
        ArrayList arrayList6 = r12.L;
        ArrayList arrayList7 = r12.F;
        if (i11 == 0) {
            return r12.V0(i12);
        }
        if (i11 == 10 || i11 == 13) {
            return r12.E;
        }
        if (i11 == 2) {
            ArrayList arrayList8 = new ArrayList(arrayList4.size() + arrayList5.size() + arrayList7.size() + 2);
            if (arrayList5.size() > 0 && this.y2) {
                arrayList8.add(new ux(0));
                arrayList8.addAll(arrayList5);
            }
            if (arrayList4.size() > 0 && this.v2) {
                arrayList8.add(new ux(1));
                arrayList8.addAll(arrayList4);
            }
            if (arrayList7.size() > 0) {
                int size = arrayList7.size();
                for (int i13 = 0; i13 < size; i13++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList7.get(i13);
                    if ((this.y2 && org.telegram.messenger.w3.U(i10, -dialog.id)) || (this.v2 && (org.telegram.messenger.w3.m0(i10, -dialog.id) || !org.telegram.messenger.w3.S(i10, -dialog.id)))) {
                        if (r9) {
                            arrayList8.add(new ux(2));
                            r9 = false;
                        }
                        arrayList8.add(dialog);
                    }
                }
            }
            return arrayList8;
        }
        if (i11 == 3) {
            return r12.D;
        }
        if (i11 == 4 || i11 == 12) {
            return arrayList2;
        }
        if (i11 == 5) {
            return arrayList3;
        }
        if (i11 == 6 || i11 == 11) {
            return arrayList6;
        }
        if (i11 == 7 || i11 == 8) {
            org.telegram.messenger.bp bpVar = r12.M[i11 != 7 ? 1 : 0];
            return bpVar == null ? r12.V0(i12) : this.R0 == 3 ? bpVar.l : bpVar.k;
        }
        if (i11 == 9) {
            return r12.K;
        }
        if (i11 != 1 && i11 != 16 && i11 != 14) {
            if (i11 != 15) {
                return new ArrayList();
            }
            ArrayList arrayList9 = new ArrayList();
            TLRPC.User Z1 = r12.Z1(Long.valueOf(this.H));
            TLRPC.RequestPeerType requestPeerType = this.G;
            if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                ConcurrentHashMap concurrentHashMap = r12.d;
                int size2 = arrayList2.size();
                while (r8 < size2) {
                    Object obj = arrayList2.get(r8);
                    r8++;
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) obj;
                    if (x4(getMessagesController().Z1(Long.valueOf(dialog2.id)))) {
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
                    ConcurrentHashMap concurrentHashMap2 = r12.b;
                    if (z12) {
                        arrayList3 = arrayList6;
                    }
                    int size3 = arrayList3.size();
                    while (r8 < size3) {
                        Object obj2 = arrayList3.get(r8);
                        r8++;
                        TLRPC.Dialog dialog3 = (TLRPC.Dialog) obj2;
                        if (w4(getMessagesController().L0(Long.valueOf(-dialog3.id)), Z1)) {
                            arrayList9.add(dialog3);
                        }
                    }
                    for (TLRPC.Chat chat : concurrentHashMap2.values()) {
                        if (chat != null && !hVar.d(-chat.id) && w4(chat, Z1)) {
                            TLRPC.TL_dialog tL_dialog2 = new TLRPC.TL_dialog();
                            if (org.telegram.messenger.w3.T(chat)) {
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
        r9 = i11 == 16;
        if (this.z2 || this.A2 || r9) {
            int size4 = arrayList2.size();
            int i14 = 0;
            while (i14 < size4) {
                Object obj3 = arrayList2.get(i14);
                i14++;
                TLRPC.Dialog dialog4 = (TLRPC.Dialog) obj3;
                TLRPC.User Z12 = r12.Z1(Long.valueOf(dialog4.id));
                if (Z12 != null && !org.telegram.messenger.i20.x(Z12)) {
                    if (!r9) {
                        if (Z12.bot) {
                            if (this.A2) {
                                if (org.telegram.messenger.i20.B(Z12)) {
                                }
                            }
                        } else if (this.z2) {
                            if (org.telegram.messenger.i20.B(Z12)) {
                            }
                        }
                        this.S3.add(dialog4);
                    } else if (!org.telegram.messenger.i20.A(Z12.id) && !org.telegram.messenger.wp.E2(Z12)) {
                        this.S3.add(dialog4);
                    }
                }
            }
        }
        if (this.v2 || (((z11 = this.x2) && this.w2) || r9)) {
            int size5 = arrayList6.size();
            int i15 = 0;
            while (i15 < size5) {
                Object obj4 = arrayList6.get(i15);
                i15++;
                TLRPC.Dialog dialog5 = (TLRPC.Dialog) obj4;
                TLRPC.Chat L0 = r12.L0(Long.valueOf(-dialog5.id));
                if (L0 != null && !org.telegram.messenger.w3.V(L0)) {
                    if (r9) {
                        if (org.telegram.messenger.w3.n0(L0)) {
                            this.S3.add(dialog5);
                        }
                    } else if (r12.y(dialog5)) {
                        this.S3.add(dialog5);
                    }
                }
            }
        } else if (z11 || this.w2 || r9) {
            int size6 = arrayList6.size();
            int i16 = 0;
            while (i16 < size6) {
                Object obj5 = arrayList6.get(i16);
                i16++;
                TLRPC.Dialog dialog6 = (TLRPC.Dialog) obj5;
                TLRPC.Chat L02 = r12.L0(Long.valueOf(-dialog6.id));
                if (L02 != null && !org.telegram.messenger.w3.V(L02)) {
                    if (r9) {
                        if (org.telegram.messenger.w3.n0(L02)) {
                            this.S3.add(dialog6);
                        }
                    } else if (r12.y(dialog6)) {
                        if (this.x2) {
                            if (!org.telegram.messenger.w3.n0(L02)) {
                                this.S3.add(dialog6);
                            }
                        }
                        if (this.w2 && org.telegram.messenger.w3.n0(L02)) {
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
                TLRPC.Chat L03 = r12.L0(Long.valueOf(-dialog7.id));
                if (r9) {
                    if (L03 instanceof TLRPC.TL_channel) {
                        this.S3.add(dialog7);
                    }
                } else if (r12.y(dialog7)) {
                    this.S3.add(dialog7);
                }
            }
        }
        org.telegram.messenger.wp messagesController = getMessagesController();
        ArrayList arrayList11 = this.S3;
        if (arrayList11 == null) {
            messagesController.getClass();
        } else {
            Collections.sort(arrayList11, messagesController.F7);
        }
        return this.S3;
    }

    public final void d5(boolean z10) {
        yx[] yxVarArr;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            yxVarArr = this.e0;
            if (i11 >= yxVarArr.length) {
                break;
            }
            yxVarArr[i11].a.C0();
            i11++;
        }
        char c10 = (!z10 || yxVarArr.length <= 1) ? (char) 0 : (char) 1;
        int i12 = yxVarArr[c10].h;
        if (i12 < 0 || i12 >= getMessagesController().S0().size()) {
            return;
        }
        org.telegram.messenger.bp bpVar = (org.telegram.messenger.bp) getMessagesController().S0().get(this.e0[c10].h);
        if (bpVar.e()) {
            yx yxVar = this.e0[c10];
            yxVar.s = this.R0;
            vx vxVar = yxVar.a;
            int i13 = vx.B3;
            vxVar.D1();
        } else {
            yx[] yxVarArr2 = this.e0;
            if (yxVarArr2[c10 ^ 1].s == 7) {
                yxVarArr2[c10].s = 8;
            } else {
                yxVarArr2[c10].s = 7;
            }
            yxVarArr2[c10].a.setScrollEnabled(true);
            org.telegram.messenger.wp messagesController = getMessagesController();
            char c11 = this.e0[c10].s == 8 ? (char) 1 : (char) 0;
            org.telegram.messenger.bp[] bpVarArr = messagesController.M;
            org.telegram.messenger.bp bpVar2 = bpVarArr[c11];
            if (bpVar2 != bpVar) {
                bpVarArr[c11] = bpVar;
                int i14 = c11 ^ 1;
                if (bpVarArr[i14] == bpVar) {
                    bpVarArr[i14] = null;
                }
                if (bpVarArr[c11] != null) {
                    messagesController.Q4(null);
                } else if (bpVar2 != null) {
                    bpVar2.k.clear();
                    bpVar2.l.clear();
                }
            }
        }
        yx[] yxVarArr3 = this.e0;
        if (yxVarArr3.length > 1) {
            yxVarArr3[1].E = bpVar.p;
        }
        yx yxVar2 = yxVarArr3[c10];
        kw kwVar = yxVar2.d;
        kwVar.h = yxVar2.s;
        kwVar.f();
        yx yxVar3 = this.e0[c10];
        gw gwVar = yxVar3.c;
        if (yxVar3.s == 0 && l4() && this.e0[c10].w == 2) {
            i10 = 1;
        }
        gwVar.h1(i10, (int) this.N);
        C3(this.e0[c10]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:426:0x05b0, code lost:
    
        if (org.telegram.messenger.w3.S(r4.J0, r11) != false) goto L377;
     */
    /* JADX WARN: Removed duplicated region for block: B:364:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:370:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.messenger.vs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        org.telegram.messenger.bp bpVar;
        int i13;
        char c10;
        boolean booleanValue;
        boolean z10;
        org.telegram.ui.Components.an0 an0Var;
        org.telegram.ui.Components.an0 an0Var2;
        int i14;
        boolean z11;
        boolean z12;
        int i15 = 2;
        ArrayList arrayList = null;
        char c11 = 1;
        int i16 = 0;
        if (i10 == org.telegram.messenger.at.s) {
            if (this.e0 == null || this.S1) {
                return;
            }
            int i17 = 0;
            while (true) {
                yx[] yxVarArr = this.e0;
                if (i17 >= yxVarArr.length) {
                    break;
                }
                yx yxVar = yxVarArr[i17];
                int i18 = yxVarArr[0].s;
                org.telegram.messenger.bp bpVar2 = (i18 == 7 || i18 == 8) ? getMessagesController().M[this.e0[0].s == 8 ? (char) 1 : (char) 0] : null;
                if (bpVar2 != null) {
                    int i19 = bpVar2.g;
                    int i20 = org.telegram.messenger.wp.D8;
                    if ((i19 & 64) != 0) {
                        z12 = true;
                        if (this.z3 || !z12) {
                            G4(yxVar);
                        } else {
                            org.telegram.messenger.i0.h3(new qq(this, yxVar, objArr, i15), 160L);
                        }
                        i17++;
                    }
                }
                z12 = false;
                if (this.z3) {
                }
                G4(yxVar);
                i17++;
            }
            px pxVar = this.z0;
            if (pxVar != null && pxVar.getVisibility() == 0) {
                this.z0.c();
            }
            this.z3 = false;
            return;
        }
        if (i10 == org.telegram.messenger.at.q5) {
            u5(0, true);
            return;
        }
        if (i10 == org.telegram.messenger.at.T) {
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
                yx[] yxVarArr2 = this.e0;
                if (i16 >= yxVarArr2.length) {
                    return;
                }
                G4(yxVarArr2[i16]);
                i16++;
            }
        } else {
            if (i10 == org.telegram.messenger.at.d2) {
                px pxVar2 = this.z0;
                if (pxVar2 == null || pxVar2.getVisibility() != 0) {
                    return;
                }
                px pxVar3 = this.z0;
                int defaultTabId = pxVar3.getDefaultTabId();
                ag.b1 b1Var = pxVar3.F;
                ArrayList arrayList2 = pxVar3.h;
                int i21 = pxVar3.l0.get(defaultTabId, -1);
                if (i21 < 0 || i21 >= arrayList2.size()) {
                    return;
                }
                org.telegram.ui.Components.pz pzVar = (org.telegram.ui.Components.pz) arrayList2.get(i21);
                if (pzVar.d == ((qx) pxVar3.J).a(pzVar.a) || ((qx) pxVar3.J).a(pzVar.a) < 0) {
                    return;
                }
                b1Var.g1();
                if (pxVar3.m0.get(i21) != pzVar.a(true) || pxVar3.h0) {
                    pxVar3.h0 = true;
                    pxVar3.requestLayout();
                    b1Var.setItemAnimator(pxVar3.s0);
                    fg.j jVar = pxVar3.I;
                    if (jVar != null) {
                        jVar.f();
                    }
                    pxVar3.M = 0;
                    org.telegram.ui.Components.pz d = pxVar3.d();
                    if (d != null) {
                        d.b(org.telegram.messenger.dd.L0(2131750808, null));
                    }
                    int size = arrayList2.size();
                    while (i16 < size) {
                        pxVar3.M = org.telegram.messenger.m5.C(24.0f, ((org.telegram.ui.Components.pz) arrayList2.get(i16)).a(true), pxVar3.M);
                        i16++;
                    }
                    return;
                }
                return;
            }
            if (i10 == org.telegram.messenger.at.Z4) {
                u5(0, true);
                return;
            }
            if (i10 == org.telegram.messenger.at.Y4) {
                u5(0, true);
                return;
            }
            if (i10 == org.telegram.messenger.at.i4) {
                if (this.e0 != null) {
                    int i22 = 0;
                    while (true) {
                        yx[] yxVarArr3 = this.e0;
                        if (i22 >= yxVarArr3.length) {
                            break;
                        }
                        vx vxVar = yxVarArr3[i22].a;
                        if (vxVar != null) {
                            for (int i23 = 0; i23 < vxVar.getChildCount(); i23++) {
                                View childAt = vxVar.getChildAt(i23);
                                if (childAt != null) {
                                    childAt.invalidate();
                                }
                            }
                        }
                        i22++;
                    }
                }
                px pxVar4 = this.z0;
                if (pxVar4 != null) {
                    pxVar4.getTabsContainer().g1();
                    return;
                }
                return;
            }
            if (i10 == org.telegram.messenger.at.I4) {
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                if (lVar != null) {
                    lVar.k(true);
                    return;
                }
                return;
            }
            if (i10 == org.telegram.messenger.at.A4) {
                m5(false, false);
                return;
            }
            long j10 = 0;
            if (i10 == org.telegram.messenger.at.r) {
                Integer num = (Integer) objArr[0];
                u5(num.intValue(), true);
                px pxVar5 = this.z0;
                if (pxVar5 != null && pxVar5.getVisibility() == 0) {
                    int intValue = num.intValue();
                    int i24 = org.telegram.messenger.wp.D8;
                    if ((intValue & 256) != 0) {
                        this.z0.c();
                    }
                }
                if (this.Y2 != 0) {
                    int intValue2 = num.intValue();
                    int i25 = org.telegram.messenger.wp.D8;
                    if ((intValue2 & TLObject.FLAG_13) != 0 || (num.intValue() & 2) != 0 || (num.intValue() & 8) != 0 || (num.intValue() & 16) != 0) {
                        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.Y2));
                        this.Z2 = L0;
                        this.actionBar.setTitle(org.telegram.messenger.o5.m(L0));
                        this.b3.e(this.Z2, this.c3);
                    }
                }
                if (this.e0 != null) {
                    while (i16 < this.e0.length) {
                        int intValue3 = num.intValue();
                        int i26 = org.telegram.messenger.wp.D8;
                        if ((intValue3 & 4) != 0) {
                            this.e0[i16].d.U(true);
                        }
                        i16++;
                    }
                }
                r5(org.telegram.messenger.e20.i(i11).f(), true);
                return;
            }
            int i27 = org.telegram.messenger.at.I2;
            boolean[] zArr = y4;
            if (i10 == i27) {
                zArr[this.currentAccount] = false;
                return;
            }
            if (i10 == org.telegram.messenger.at.Y) {
                u5(0, true);
                return;
            }
            if (i10 == org.telegram.messenger.at.O) {
                if (this.e0 == null || this.S1) {
                    return;
                }
                org.telegram.ui.Components.f10 f10Var = this.t0;
                if (f10Var != null) {
                    z11 = f10Var.getProgressVisible();
                    this.t0.f(false, true);
                } else {
                    z11 = false;
                }
                for (yx yxVar2 : this.e0) {
                    yxVar2.d.e = false;
                }
                if (z11) {
                    L4(0.0f);
                    ValueAnimator valueAnimator = this.d0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(this.c0, 1.0f).setDuration(250L);
                    this.d0 = duration;
                    duration.setInterpolator(org.telegram.ui.Components.gr.f);
                    this.d0.addUpdateListener(new lv(this, i15));
                    this.d0.start();
                }
                int i28 = 0;
                boolean z13 = false;
                while (true) {
                    yx[] yxVarArr4 = this.e0;
                    if (i28 >= yxVarArr4.length) {
                        break;
                    }
                    if (!yxVarArr4[i28].p() || getMessagesController().D0() > 10) {
                        z13 = true;
                    } else {
                        this.e0[i28].d.f();
                    }
                    i28++;
                }
                if (z13) {
                    u5(0, true);
                    return;
                }
                return;
            }
            if (i10 == org.telegram.messenger.at.h0) {
                if (this.e0 == null) {
                    return;
                }
                int i29 = 0;
                while (true) {
                    yx[] yxVarArr5 = this.e0;
                    if (i29 >= yxVarArr5.length) {
                        int i30 = org.telegram.messenger.wp.D8;
                        u5(512, true);
                        return;
                    }
                    if (yxVarArr5[i29].p() && org.telegram.messenger.i0.Q1()) {
                        boolean booleanValue2 = ((Boolean) objArr[2]).booleanValue();
                        long longValue = ((Long) objArr[i16]).longValue();
                        long longValue2 = ((Long) objArr[c11]).longValue();
                        org.telegram.messenger.hs hsVar = this.p2;
                        if (!booleanValue2) {
                            hsVar.a = longValue;
                            hsVar.b = longValue2;
                        } else if (longValue == hsVar.a && longValue2 == hsVar.b) {
                            hsVar.a = 0L;
                            hsVar.b = 0L;
                        }
                        this.e0[i29].d.s = hsVar.a;
                    }
                    i29++;
                    c11 = 1;
                    i16 = 0;
                }
            } else {
                if (i10 == org.telegram.messenger.at.f0) {
                    u5(0, true);
                    return;
                }
                if (i10 == org.telegram.messenger.at.J || i10 == org.telegram.messenger.at.K || i10 == org.telegram.messenger.at.M) {
                    int i31 = org.telegram.messenger.wp.D8;
                    u5(TLObject.FLAG_12, true);
                    return;
                }
                if (i10 == org.telegram.messenger.at.n0) {
                    K3();
                    return;
                }
                if (i10 == org.telegram.messenger.at.P0) {
                    jx jxVar = this.C0;
                    if (jxVar == null || (an0Var2 = jxVar.d0) == null || (i14 = an0Var2.h0) == 15) {
                        return;
                    }
                    int i32 = an0Var2.s0;
                    org.telegram.messenger.is.a0(i32).a.c(new i2.u(i32, i14, new zf.q(an0Var2), 17));
                    return;
                }
                if (i10 == org.telegram.messenger.at.s0) {
                    int i33 = org.telegram.messenger.wp.D8;
                    u5(32768, true);
                    return;
                }
                if (i10 == org.telegram.messenger.at.S0) {
                    jx jxVar2 = this.C0;
                    if (jxVar2 == null || (an0Var = jxVar2.d0) == null) {
                        return;
                    }
                    an0Var.f();
                    return;
                }
                if (i10 == org.telegram.messenger.at.T1) {
                    int connectionState = ConnectionsManager.getInstance(org.telegram.messenger.c.a(i11).a).getConnectionState();
                    if (this.d2 != connectionState) {
                        this.d2 = connectionState;
                        m5(true, false);
                        return;
                    }
                    return;
                }
                if (i10 == org.telegram.messenger.at.b5) {
                    m5(true, false);
                    jx jxVar3 = this.C0;
                    if (jxVar3 != null) {
                        int currentPosition = jxVar3.getCurrentPosition();
                        mg.s sVar = jxVar3.V;
                        q5(sVar != null && sVar.h(currentPosition) == 2);
                        return;
                    }
                    return;
                }
                int i34 = 3;
                if (i10 == org.telegram.messenger.at.K2) {
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
                    Runnable zvVar = new zv(this, chat, longValue3, booleanValue, user, z10);
                    Z3();
                    if (this.y0[0] == null) {
                        zvVar.run();
                        return;
                    }
                    if (org.telegram.messenger.w3.c0(chat)) {
                        zvVar.run();
                        return;
                    }
                    UndoView k42 = k4();
                    if (k42 != null) {
                        k42.j(booleanValue ? 1 : 95, longValue3, zvVar);
                        return;
                    }
                    return;
                }
                if (i10 == org.telegram.messenger.at.d0) {
                    int intValue4 = ((Integer) objArr[0]).intValue();
                    int i35 = this.W2;
                    if (i35 != intValue4 || i35 == 0) {
                        return;
                    }
                    finishFragment();
                    return;
                }
                if (i10 == org.telegram.messenger.at.O2) {
                    i5(true, true);
                    return;
                }
                if (i10 == org.telegram.messenger.at.P2) {
                    V4();
                    return;
                }
                if (i10 == org.telegram.messenger.at.s1) {
                    X4();
                    g5();
                    org.telegram.messenger.wp messagesController = getMessagesController();
                    if (!messagesController.v8 && messagesController.N7 + 10 >= messagesController.getConnectionsManager().getCurrentTime()) {
                        boolean contains = messagesController.U3.contains("SETUP_LOGIN_EMAIL");
                        if (messagesController.U3.contains("SETUP_LOGIN_EMAIL_NOSKIP")) {
                            c10 = 2;
                        } else if (contains) {
                            c10 = 1;
                        }
                        if (c10 == 0) {
                            gf0 gf0Var = new gf0();
                            ev evVar = new ev(this, 22);
                            ev evVar2 = new ev(this, 23);
                            boolean z14 = c10 == 2;
                            gf0Var.F = 3;
                            gf0Var.a = 12;
                            gf0Var.d0 = evVar;
                            gf0Var.e0 = evVar2;
                            gf0Var.g0 = z14;
                            gf0Var.h0 = true;
                            presentFragment(gf0Var);
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
                    if (i10 == org.telegram.messenger.at.N) {
                        org.telegram.ui.Components.f10 f10Var2 = this.t0;
                        if (f10Var2 != null) {
                            f10Var2.f(true, true);
                        }
                        yx[] yxVarArr6 = this.e0;
                        if (yxVarArr6 != null) {
                            int length = yxVarArr6.length;
                            int i36 = 0;
                            while (i36 < length) {
                                kw kwVar = yxVarArr6[i36].d;
                                kwVar.Q = false;
                                kwVar.e = z15;
                                kwVar.f();
                                i36++;
                                z15 = true;
                            }
                            return;
                        }
                        return;
                    }
                    if (i10 == org.telegram.messenger.at.w) {
                        if (!this.q3 || this.C0 == null) {
                            return;
                        }
                        ArrayList arrayList3 = (ArrayList) objArr[0];
                        long longValue4 = ((Long) objArr[1]).longValue();
                        jx jxVar4 = this.C0;
                        HashMap hashMap = jxVar4.B0;
                        SparseArray sparseArray = jxVar4.h;
                        int size2 = sparseArray.size();
                        for (int i37 = 0; i37 < size2; i37++) {
                            View view = (View) sparseArray.valueAt(i37);
                            if (view instanceof y00) {
                                ((y00) view).e(arrayList3, longValue4);
                            }
                        }
                        for (int i38 = 0; i38 < jxVar4.getChildCount(); i38++) {
                            if (jxVar4.getChildAt(i38) instanceof y00) {
                                ((y00) jxVar4.getChildAt(i38)).e(arrayList3, longValue4);
                            }
                        }
                        jxVar4.O0.e(arrayList3, longValue4);
                        if (hashMap.isEmpty()) {
                            return;
                        }
                        ArrayList arrayList4 = new ArrayList(hashMap.keySet());
                        int i39 = 0;
                        while (i39 < arrayList4.size()) {
                            r00 r00Var = (r00) arrayList4.get(i39);
                            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) hashMap.get(r00Var);
                            if (kjVar != null) {
                                long B0 = org.telegram.messenger.kj.B0(kjVar.k);
                                if (B0 < j10) {
                                    i13 = (int) (-B0);
                                }
                                i13 = 0;
                                if (i13 == longValue4) {
                                    for (int i40 = 0; i40 < arrayList3.size(); i40++) {
                                        if (kjVar.f1() == ((Integer) arrayList3.get(i40)).intValue()) {
                                            arrayList = new ArrayList();
                                            arrayList.add(r00Var);
                                        }
                                    }
                                }
                            }
                            i39++;
                            j10 = 0;
                        }
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i41 = 0; i41 < size3; i41++) {
                                hashMap.remove(arrayList.get(i41));
                            }
                            jxVar4.z0.a(hashMap.size(), true);
                            org.telegram.ui.ActionBar.t0 t0Var = jxVar4.E0;
                            if (t0Var != null) {
                                t0Var.setVisibility(hashMap.size() == 1 ? 0 : 8);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (i10 == org.telegram.messenger.at.L4) {
                        if (this.e0 != null) {
                            int i42 = 0;
                            while (true) {
                                yx[] yxVarArr7 = this.e0;
                                if (i42 >= yxVarArr7.length) {
                                    break;
                                }
                                zf.j jVar2 = yxVarArr7[i42].d.P;
                                if (jVar2 != null) {
                                    jVar2.a.clear();
                                    jVar2.b.clear();
                                    jVar2.c.clear();
                                    jVar2.d.clear();
                                    org.telegram.messenger.i0.r(jVar2.e);
                                }
                                i42++;
                            }
                        }
                        int i43 = org.telegram.ui.Components.t10.i1;
                        return;
                    }
                    if (i10 == org.telegram.messenger.at.T5) {
                        long longValue5 = ((Long) objArr[0]).longValue();
                        boolean booleanValue3 = ((Boolean) objArr[1]).booleanValue();
                        if (this.Y2 != longValue5 || booleanValue3) {
                            return;
                        }
                        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
                        if (z4Var == null || z4Var.getLastFragment() != this) {
                            removeSelfFromStack();
                            return;
                        } else {
                            finishFragment();
                            return;
                        }
                    }
                    if (i10 == org.telegram.messenger.at.S5) {
                        if (this.Y2 == ((Long) objArr[0]).longValue()) {
                            B3(true);
                            return;
                        }
                        return;
                    }
                    if (i10 == org.telegram.messenger.at.S4) {
                        boolean booleanValue4 = ((Boolean) objArr[0]).booleanValue();
                        if (this.fragmentView != null) {
                            if (!booleanValue4) {
                                nu nuVar = this.Q3;
                                if (nuVar == null || nuVar.getTag() == null) {
                                    return;
                                }
                                nu nuVar2 = this.Q3;
                                nuVar2.animate().setListener(null).cancel();
                                nuVar2.animate().setListener(new org.telegram.ui.Components.jw0(i34, this, nuVar2)).alpha(0.0f).setStartDelay(0L).setDuration(150L).start();
                                this.Q3.setTag(null);
                                return;
                            }
                            if (this.Q3 == null) {
                                Context context = this.fragmentView.getContext();
                                nu nuVar3 = new nu(context);
                                LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
                                org.telegram.ui.Components.fi0 fi0Var = new org.telegram.ui.Components.fi0(context);
                                fi0Var.f(R.raw.db_migration_placeholder, org.telegram.messenger.at.g2, org.telegram.messenger.at.g2, null);
                                fi0Var.getAnimatedDrawable().K(1);
                                fi0Var.d();
                                f7.addView(fi0Var, w7.b6.r(org.telegram.messenger.at.g2, org.telegram.messenger.at.g2, 1));
                                TextView textView = new TextView(context);
                                sc.e.u(textView, 1, 24.0f, null, 2131747794);
                                int i44 = org.telegram.ui.ActionBar.t6.G6;
                                org.telegram.ui.ActionBar.a7.V(textView, i44, null);
                                textView.setGravity(1);
                                TextView f10 = org.telegram.messenger.a30.f(f7, textView, w7.b6.q(-1, -2, 0.0f, 0, 50, 32, 50, 0), context);
                                f10.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                                sc.e.u(f10, 1, 14.0f, null, 2131747793);
                                org.telegram.ui.ActionBar.a7.V(f10, i44, null);
                                f10.setGravity(1);
                                TextView f11 = org.telegram.messenger.a30.f(f7, f10, w7.b6.q(-1, -2, 0.0f, 0, 36, 20, 36, 0), context);
                                sc.e.u(f11, 1, 14.0f, null, 2131747792);
                                org.telegram.ui.ActionBar.a7.V(f11, i44, null);
                                f11.setGravity(1);
                                f7.addView(f11, w7.b6.q(-1, -2, 0.0f, 0, 36, 24, 36, 0));
                                nuVar3.addView(f7, w7.b6.e(-1, -2, 16));
                                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, nuVar3, null);
                                nuVar3.setOnTouchListener(new mu());
                                this.Q3 = nuVar3;
                                nuVar3.setAlpha(0.0f);
                                ((sx) this.fragmentView).addView(this.Q3);
                                this.Q3.animate().alpha(1.0f).setDuration(300L).setStartDelay(1000L).start();
                            }
                            this.Q3.setTag(1);
                            return;
                        }
                        return;
                    }
                    if (i10 == org.telegram.messenger.at.a5) {
                        D3();
                        return;
                    }
                    if (i10 == org.telegram.messenger.at.m5) {
                        r5((TLRPC.User) objArr[0], true);
                        return;
                    }
                    if (i10 == org.telegram.messenger.at.f5) {
                        r5(org.telegram.messenger.e20.i(i11).f(), true);
                        s5();
                        return;
                    }
                    if (i10 == org.telegram.messenger.at.t5) {
                        zArr[this.currentAccount] = false;
                        u4(getAccountInstance());
                        getMessagesController().Z2(this.W2);
                        return;
                    }
                    if (i10 == org.telegram.messenger.at.z5) {
                        int intValue5 = ((Integer) objArr[0]).intValue();
                        int i45 = 0;
                        while (true) {
                            yx[] yxVarArr8 = this.e0;
                            if (i45 >= yxVarArr8.length) {
                                return;
                            }
                            yx yxVar3 = yxVarArr8[i45];
                            if (yxVar3 != null && (((i12 = yxVar3.s) == 7 || i12 == 8) && (bpVar = getMessagesController().M[yxVar3.s - 7]) != null && intValue5 == bpVar.a)) {
                                yxVar3.q(true);
                                return;
                            }
                            i45++;
                        }
                    } else {
                        if (i10 != org.telegram.messenger.at.P1) {
                            if (i10 == org.telegram.messenger.at.v5) {
                                t5(this.V);
                                u5(0, true);
                                return;
                            }
                            if (i10 == org.telegram.messenger.at.Z2) {
                                s5();
                                return;
                            }
                            if (i10 == org.telegram.messenger.at.d3) {
                                g5();
                                return;
                            }
                            if (i10 == org.telegram.messenger.at.g5) {
                                g5();
                                return;
                            }
                            if (i10 == org.telegram.messenger.at.y3 || i10 == org.telegram.messenger.at.A3) {
                                g5();
                                return;
                            } else if (i10 == org.telegram.messenger.at.P3) {
                                g5();
                                return;
                            } else {
                                if (i10 == org.telegram.messenger.at.Q3) {
                                    g5();
                                    return;
                                }
                                return;
                            }
                        }
                        long longValue6 = ((Long) objArr[0]).longValue();
                        int i46 = 0;
                        while (true) {
                            yx[] yxVarArr9 = this.e0;
                            if (i46 >= yxVarArr9.length) {
                                return;
                            }
                            yx yxVar4 = yxVarArr9[i46];
                            if (yxVar4.a != null) {
                                int i47 = 0;
                                while (true) {
                                    if (i47 < yxVar4.a.getChildCount()) {
                                        View childAt2 = yxVar4.a.getChildAt(i47);
                                        if (childAt2 instanceof org.telegram.ui.Cells.v2) {
                                            org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) childAt2;
                                            if (longValue6 == v2Var.getDialogId()) {
                                                v2Var.z();
                                                break;
                                            }
                                        }
                                        i47++;
                                    }
                                }
                            }
                            i46++;
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return !(dialog instanceof xh.m2) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final float e4(boolean z10) {
        return (z10 ? 1.0f - this.b.e : 1.0f) * (1.0f - h4()) * this.r.e;
    }

    public final void e5() {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        q01 q01Var = this.Z;
        float measuredHeight = (q01Var == null || q01Var.getVisibility() == 8) ? 0.0f : this.Z.getMeasuredHeight();
        float L = this.K ? org.telegram.messenger.i0.L(81.0f) : 0.0f;
        if (this.K) {
            float f16 = this.N;
            float f17 = this.x1;
            f7 = (measuredHeight * f17) + c3.i0.z(1.0f, f17, L, f16);
            f10 = this.x3;
        } else {
            f7 = (measuredHeight * this.x1) + this.N;
            f10 = this.x3;
        }
        float f18 = f7 + f10 + this.T;
        ox oxVar = this.X;
        float L2 = org.telegram.messenger.i0.L(4.0f) * ((oxVar == null || oxVar.getVisibility() != 0) ? 0.0f : this.X.getAlpha());
        px pxVar = this.z0;
        if (pxVar != null) {
            pxVar.setTranslationY(f18 - L2);
            f12 = this.z0.getAlpha();
            f13 = org.telegram.messenger.i0.L(43.0f) * f12;
            f11 = f18 + f13;
        } else {
            f11 = f18;
            f12 = 0.0f;
            f13 = 0.0f;
        }
        org.telegram.ui.Components.zr zrVar = this.J1;
        if (zrVar != null) {
            zrVar.setTranslationY(org.telegram.messenger.i0.T1(f11 - L2, (-org.telegram.messenger.i0.L(3.0f)) - (this.a0 == null ? org.telegram.messenger.i0.L(44.0f) : 0), this.b.e));
            f14 = this.J1.getMetadata().c.a;
            f15 = this.J1.c(0.0f);
        } else {
            f14 = 0.0f;
            f15 = 0.0f;
        }
        org.telegram.ui.Components.yr yrVar = this.K1;
        if (yrVar != null) {
            yrVar.setTranslationY(f18 - L2);
            float W1 = org.telegram.messenger.i0.W1(Math.min(f14, f12), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(50.0f));
            org.telegram.ui.Components.yr yrVar2 = this.K1;
            float min = Math.min(org.telegram.messenger.i0.L(40.0f), (f15 + f13) - W1);
            Matrix matrix = yrVar2.b;
            if (yrVar2.e != W1 || yrVar2.f != min) {
                yrVar2.e = W1;
                yrVar2.f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, W1);
                LinearGradient linearGradient = yrVar2.c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                yrVar2.invalidate();
            }
            this.K1.setAlpha(Math.max(f12, f14));
        }
    }

    public final int f4() {
        if (!this.K) {
            return org.telegram.messenger.i0.L(48.0f);
        }
        return org.telegram.messenger.i0.L(48.0f) + org.telegram.messenger.i0.L(81.0f);
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
        org.telegram.ui.ActionBar.t0 t0Var;
        ?? r52;
        org.telegram.ui.ActionBar.b1 b1Var;
        org.telegram.ui.ActionBar.t0 t0Var2;
        px pxVar;
        org.telegram.ui.Components.pz d;
        long j10;
        TLRPC.User Z1;
        this.V2 = false;
        this.T2 = 0;
        this.Q2 = 0;
        this.P2 = 0;
        this.O2 = 0;
        this.N2 = 0;
        this.U2 = 0;
        this.R2 = 0;
        this.S2 = 0;
        if (z10) {
            return;
        }
        ArrayList arrayList = this.I2;
        int size = arrayList.size();
        long e = getUserConfig().e();
        SharedPreferences notificationsSettings = getNotificationsSettings();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i10 < size) {
            ArrayList arrayList2 = arrayList;
            TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().Q.f(((Long) arrayList.get(i10)).longValue());
            if (dialog == null) {
                j10 = e;
            } else {
                j10 = e;
                long j11 = dialog.id;
                boolean s42 = s4(dialog);
                boolean z12 = dialog.unread_count != 0 || dialog.unread_mark;
                if (getMessagesController().s2(j11)) {
                    this.U2++;
                }
                if (getMessagesController().q2(j11, 0L, null)) {
                    this.Q2++;
                } else {
                    this.P2++;
                }
                if (z12) {
                    this.N2++;
                }
                if (this.W2 == 1 || dialog.folder_id == 1) {
                    this.T2++;
                } else if (j11 != j10 && dialog.community_id == 0 && j11 != 777000 && !getMessagesController().B2(j11, false)) {
                    i14++;
                }
                if (dialog.community_id != 0) {
                    i12++;
                }
                if (!org.telegram.messenger.o5.E(j11) || j11 == j10 || j11 == 489000 || org.telegram.messenger.wp.E2(getMessagesController().Z1(Long.valueOf(j11)))) {
                    i16++;
                } else if (org.telegram.messenger.m5.w("dialog_bar_report", j11, notificationsSettings, true)) {
                    this.S2++;
                }
                if (org.telegram.messenger.o5.y(dialog)) {
                    TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-j11));
                    if (getMessagesController().B2(dialog.id, true)) {
                        this.R2++;
                        int i17 = getMessagesController().A2;
                        int i18 = org.telegram.messenger.wp.D8;
                        if (i17 == 1) {
                            i11++;
                            this.V2 = true;
                        }
                    } else {
                        if (s42) {
                            i15++;
                        } else {
                            this.O2++;
                        }
                        if (L0 == null || !L0.megagroup) {
                            this.R2++;
                        } else if (org.telegram.messenger.w3.t0(L0)) {
                            this.R2++;
                        }
                        i11++;
                    }
                } else {
                    boolean z13 = org.telegram.messenger.o5.z(dialog.id);
                    if (z13) {
                        getMessagesController().L0(Long.valueOf(-dialog.id));
                    }
                    if (org.telegram.messenger.o5.C(dialog.id)) {
                        TLRPC.EncryptedChat Z0 = getMessagesController().Z0(Integer.valueOf((int) (dialog.id & 4294967295L)));
                        Z1 = Z0 != null ? getMessagesController().Z1(Long.valueOf(Z0.user_id)) : new TLRPC.TL_userEmpty();
                    } else {
                        Z1 = (z13 || !org.telegram.messenger.o5.E(dialog.id)) ? null : getMessagesController().Z1(Long.valueOf(dialog.id));
                    }
                    if (Z1 != null && Z1.bot) {
                        org.telegram.messenger.wp.E2(Z1);
                    }
                    if (s42) {
                        i15++;
                    } else {
                        this.O2++;
                    }
                }
                i13++;
                i11++;
            }
            i10++;
            arrayList = arrayList2;
            e = j10;
        }
        ArrayList arrayList3 = arrayList;
        org.telegram.ui.ActionBar.t0 t0Var3 = this.j1;
        if (t0Var3 != null) {
            if (i11 != size || i12 > 0) {
                t0Var3.setVisibility(8);
            } else {
                t0Var3.setVisibility(0);
            }
        }
        org.telegram.ui.ActionBar.b1 b1Var2 = this.r1;
        if (b1Var2 != null) {
            int i19 = this.R2;
            if ((i19 == 0 || i19 == size) && ((i13 == 0 || i13 == size) && i12 <= 0)) {
                b1Var2.setVisibility(0);
                if (this.R2 != 0) {
                    this.r1.setText(org.telegram.messenger.dd.L0(2131752088, null));
                } else {
                    this.r1.setText(org.telegram.messenger.dd.L0(2131752089, null));
                }
            } else {
                b1Var2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.b1 b1Var3 = this.q1;
        if (b1Var3 != null && this.m1 != null) {
            if (this.T2 != 0 && i12 == 0 && this.Y2 == 0) {
                String L02 = org.telegram.messenger.dd.L0(2131743940, null);
                this.q1.j(L02, R.drawable.msg_unarchive, null);
                this.m1.setIcon(R.drawable.msg_unarchive);
                this.m1.setContentDescription(L02);
                px pxVar2 = this.z0;
                if (pxVar2 == null || pxVar2.getVisibility() != 0) {
                    this.q1.setVisibility(0);
                    this.m1.setVisibility(8);
                } else {
                    this.m1.setVisibility(0);
                    this.q1.setVisibility(8);
                }
            } else if (i14 != 0 && i12 == 0 && this.Y2 == 0) {
                String L03 = org.telegram.messenger.dd.L0(2131754172, null);
                this.q1.j(L03, R.drawable.msg_archive, null);
                this.m1.setIcon(R.drawable.msg_archive);
                this.m1.setContentDescription(L03);
                px pxVar3 = this.z0;
                if (pxVar3 == null || pxVar3.getVisibility() != 0) {
                    this.q1.setVisibility(0);
                    this.m1.setVisibility(8);
                } else {
                    this.m1.setVisibility(0);
                    this.q1.setVisibility(8);
                }
            } else {
                b1Var3.setVisibility(8);
                this.m1.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.t0 t0Var4 = this.k1;
        if (t0Var4 != null && this.n1 != null) {
            if (this.O2 + i15 == size && this.Y2 == 0) {
                px pxVar4 = this.z0;
                if (pxVar4 == null || pxVar4.getVisibility() != 0) {
                    this.k1.setVisibility(0);
                    this.n1.setVisibility(8);
                } else {
                    this.n1.setVisibility(0);
                    this.k1.setVisibility(8);
                }
            } else {
                t0Var4.setVisibility(8);
                this.n1.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.b1 b1Var4 = this.t1;
        if (b1Var4 != null) {
            if (i16 != 0) {
                b1Var4.setVisibility(8);
            } else {
                b1Var4.setVisibility(0);
            }
        }
        if (this.p1 != null) {
            px pxVar5 = this.z0;
            boolean z14 = pxVar5 == null || pxVar5.getVisibility() != 0 || ((d = (pxVar = this.z0).d()) != null && d.a == pxVar.L);
            if (!z14) {
                try {
                    z14 = size >= d4(this.currentAccount, this.e0[0].d.h, this.W2, this.S1).size();
                } catch (Exception unused) {
                }
            }
            if (!z14) {
                z11 = false;
                this.p1.setVisibility(0);
                if (this.o1 != null) {
                    if (this.W2 != 1) {
                        if (this.z0 != null && e4(z11) > 0.5f) {
                            px pxVar6 = this.z0;
                            org.telegram.ui.Components.pz d10 = pxVar6.d();
                            if (d10 != null && d10.a == pxVar6.L) {
                                int i20 = org.telegram.ui.Components.uz.t1;
                                ArrayList arrayList4 = new ArrayList();
                                ArrayList arrayList5 = getMessagesController().P0;
                                int size2 = arrayList5.size();
                                int i21 = 0;
                                while (i21 < size2) {
                                    org.telegram.messenger.bp bpVar = (org.telegram.messenger.bp) arrayList5.get(i21);
                                    ArrayList arrayList6 = arrayList3;
                                    if (!org.telegram.ui.Components.uz.J0(this, bpVar, arrayList6, true, true).isEmpty() && !bpVar.e()) {
                                        arrayList4.add(bpVar);
                                    }
                                    i21++;
                                    arrayList3 = arrayList6;
                                }
                            }
                        }
                        this.o1.setVisibility(8);
                    }
                    this.o1.setVisibility(0);
                }
                t0Var = this.l1;
                if (t0Var != null) {
                    r52 = 0;
                } else if (this.Q2 != 0) {
                    t0Var.setIcon(R.drawable.msg_unmute);
                    r52 = 0;
                    this.l1.setContentDescription(org.telegram.messenger.dd.L0(2131752165, null));
                } else {
                    r52 = 0;
                    t0Var.setIcon(R.drawable.msg_mute);
                    this.l1.setContentDescription(org.telegram.messenger.dd.L0(2131752175, null));
                }
                b1Var = this.s1;
                if (b1Var != 0) {
                    if (this.N2 != 0) {
                        b1Var.j(org.telegram.messenger.dd.L0(2131748696, r52), R.drawable.msg_markread, r52);
                        this.s1.setVisibility(0);
                    } else if (this.U2 == 0 && i12 == 0) {
                        b1Var.j(org.telegram.messenger.dd.L0(2131748695, r52), R.drawable.msg_markunread, r52);
                        this.s1.setVisibility(0);
                    } else {
                        b1Var.setVisibility(8);
                    }
                }
                t0Var2 = this.k1;
                if (t0Var2 != null || this.n1 == null) {
                }
                if (this.O2 != 0) {
                    t0Var2.setIcon(R.drawable.msg_pin);
                    this.k1.setContentDescription(org.telegram.messenger.dd.L0(2131747253, null));
                    this.n1.setText(org.telegram.messenger.dd.L0(2131751454, null));
                    return;
                } else {
                    t0Var2.setIcon(R.drawable.msg_unpin);
                    this.k1.setContentDescription(org.telegram.messenger.dd.L0(2131743870, null));
                    this.n1.setText(org.telegram.messenger.dd.L0(2131751453, null));
                    return;
                }
            }
            this.p1.setVisibility(8);
        }
        z11 = false;
        if (this.o1 != null) {
        }
        t0Var = this.l1;
        if (t0Var != null) {
        }
        b1Var = this.s1;
        if (b1Var != 0) {
        }
        t0Var2 = this.k1;
        if (t0Var2 != null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.Components.z60 z60Var = this.L0;
        if (z60Var != null) {
            z60Var.u();
        }
    }

    public final int g4() {
        if (this.K) {
            return org.telegram.messenger.i0.L(81.0f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0a84  */
    /* JADX WARN: Removed duplicated region for block: B:346:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Runnable, org.telegram.ui.ActionBar.p6] */
    /* JADX WARN: Type inference failed for: r6v16 */
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
        org.telegram.ui.Cells.l lVar;
        ww wwVar;
        org.telegram.messenger.u9 u9Var;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        int i10;
        boolean z12;
        ww wwVar2;
        long j10;
        boolean z13;
        boolean z14;
        org.telegram.messenger.w1 b10;
        ?? r62;
        String G;
        StringBuilder sb2;
        final long j11;
        final long j12;
        if (this.J1 == null || this.M1 == null || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Cells.d3 d3Var = this.M1;
        boolean z15 = false;
        r7 = false;
        boolean z16 = false;
        if (d3Var != null) {
            try {
                ((org.telegram.ui.Components.ci0) ((org.telegram.ui.Components.r8) d3Var.h.getImageReceiver().m0).K).R(null);
            } catch (Exception unused) {
            }
            org.telegram.ui.Cells.d3 d3Var2 = this.M1;
            d3Var2.setCompact(false);
            d3Var2.a(org.telegram.messenger.e20.s0, null);
            org.telegram.ui.Components.g9 g9Var = d3Var2.h;
            g9Var.setVisibility(8);
            g9Var.b();
        }
        long j13 = 0;
        final int i11 = 1;
        if (!isInPreviewMode()) {
            if (getMessagesController().u2()) {
                this.M1.setOnClickListener(new gv(this, 12));
                this.M1.c(org.telegram.messenger.dd.L0(2131754701, null), org.telegram.messenger.dd.L0(2131754702, null), false, true);
            } else {
                int i12 = 21;
                if (this.W2 == 0 && this.Y2 == 0 && getMessagesController().U3.contains("SETUP_PASSKEY")) {
                    this.M1.setOnClickListener(new gv(this, 19));
                    this.M1.b(org.telegram.messenger.k6.p(org.telegram.messenger.dd.L0(2131747646, null), this.M1.c, new ev(this, i12)), org.telegram.messenger.dd.L0(2131747647, null));
                    this.M1.setOnCloseListener(new gv(this, 24));
                } else if (this.W2 == 0 && this.Y2 == 0 && getMessagesController().U3.contains("PREMIUM_GRACE")) {
                    this.M1.setOnClickListener(new gv(this, 25));
                    this.M1.b(org.telegram.messenger.k6.p(org.telegram.messenger.dd.L0(2131749534, null), this.M1.c, new ev(this, i12)), org.telegram.messenger.dd.L0(2131749538, null));
                    this.M1.setOnCloseListener(new gv(this, 26));
                } else if (this.W2 == 0 && this.Y2 == 0 && getMessagesController().W3 != null) {
                    final TLRPC.TL_pendingSuggestion tL_pendingSuggestion = getMessagesController().W3;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_pendingSuggestion.title.text);
                    org.telegram.messenger.kj.b(spannableStringBuilder, tL_pendingSuggestion.title.entities, false, false, true, true, 0);
                    Spannable A5 = org.telegram.messenger.kj.A5(org.telegram.messenger.k6.m(spannableStringBuilder, this.M1.c.getPaint().getFontMetricsInt(), false, null, 0), tL_pendingSuggestion.title.entities, this.M1.c.getPaint().getFontMetricsInt(), false);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_pendingSuggestion.description.text);
                    org.telegram.messenger.kj.b(spannableStringBuilder2, tL_pendingSuggestion.description.entities, false, false, true, true, 0);
                    this.M1.b(A5, org.telegram.messenger.kj.A5(org.telegram.messenger.k6.m(spannableStringBuilder2, this.M1.d.getPaint().getFontMetricsInt(), false, null, 0), tL_pendingSuggestion.description.entities, this.M1.d.getPaint().getFontMetricsInt(), false));
                    org.telegram.ui.Cells.d3 d3Var3 = this.M1;
                    final int i13 = z15 ? 1 : 0;
                    d3Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.aw
                        public final /* synthetic */ zx b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    gf.f.r(this.b.getParentActivity(), tL_pendingSuggestion.url);
                                    break;
                                default:
                                    zx.Z(this.b, tL_pendingSuggestion);
                                    break;
                            }
                        }
                    });
                    this.M1.setOnCloseListener(new View.OnClickListener(this) { // from class: org.telegram.ui.aw
                        public final /* synthetic */ zx b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i11) {
                                case 0:
                                    gf.f.r(this.b.getParentActivity(), tL_pendingSuggestion.url);
                                    break;
                                default:
                                    zx.Z(this.b, tL_pendingSuggestion);
                                    break;
                            }
                        }
                    });
                } else {
                    if (this.W2 == 0 && this.Y2 == 0 && org.telegram.messenger.wp.r1(this.currentAccount).U3.contains("STARS_SUBSCRIPTION_LOW_BALANCE")) {
                        rh.e6 y3 = rh.e6.y(this.currentAccount, false);
                        ArrayList arrayList = y3.z;
                        if (!arrayList.isEmpty()) {
                            long j14 = -y3.f.amount;
                            int i14 = 0;
                            while (i14 < arrayList.size()) {
                                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList.get(i14);
                                long j15 = j13;
                                long o10 = org.telegram.messenger.o5.o(starsSubscription.peer);
                                if (o10 >= j15) {
                                    if (getMessagesController().Z1(Long.valueOf(o10)) == null) {
                                        i14++;
                                        j13 = j15;
                                    }
                                    j14 += starsSubscription.pricing.amount;
                                    i14++;
                                    j13 = j15;
                                } else {
                                    if (getMessagesController().L0(Long.valueOf(-o10)) == null) {
                                        i14++;
                                        j13 = j15;
                                    }
                                    j14 += starsSubscription.pricing.amount;
                                    i14++;
                                    j13 = j15;
                                }
                            }
                            j10 = j13;
                            if (j14 > j10) {
                                rh.e6 y10 = rh.e6.y(this.currentAccount, false);
                                ArrayList arrayList2 = y10.z;
                                StringBuilder sb3 = new StringBuilder();
                                if (arrayList2.isEmpty()) {
                                    sb2 = sb3;
                                    j11 = j10;
                                    j12 = j11;
                                } else {
                                    int i15 = 0;
                                    long j16 = j10;
                                    j12 = j16;
                                    while (i15 < arrayList2.size()) {
                                        TL_stars.StarsSubscription starsSubscription2 = (TL_stars.StarsSubscription) arrayList2.get(i15);
                                        TLRPC.Peer peer = starsSubscription2.peer;
                                        boolean z17 = z16 ? 1 : 0;
                                        long o11 = org.telegram.messenger.o5.o(peer);
                                        if (j12 == j10) {
                                            j12 = o11;
                                        }
                                        if (o11 >= j10) {
                                            TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(o11));
                                            if (Z1 != null) {
                                                if (sb3.length() > 0) {
                                                    sb3.append(", ");
                                                }
                                                sb3.append(org.telegram.messenger.i20.p(Z1));
                                                j16 += starsSubscription2.pricing.amount;
                                                i15++;
                                                z16 = z17 ? 1 : 0;
                                            } else {
                                                i15++;
                                                z16 = z17 ? 1 : 0;
                                            }
                                        } else {
                                            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-o11));
                                            if (L0 != null) {
                                                if (sb3.length() > 0) {
                                                    sb3.append(", ");
                                                }
                                                sb3.append(L0.title);
                                                j16 += starsSubscription2.pricing.amount;
                                                i15++;
                                                z16 = z17 ? 1 : 0;
                                            } else {
                                                i15++;
                                                z16 = z17 ? 1 : 0;
                                            }
                                        }
                                    }
                                    sb2 = sb3;
                                    j11 = j16;
                                }
                                boolean z18 = z16;
                                final String sb4 = sb2.toString();
                                this.M1.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.bw
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        zx zxVar = zx.this;
                                        new rh.x7(zxVar.getParentActivity(), zxVar.getResourceProvider(), j11, 2, sb4, new ev(zxVar, 2), j12).show();
                                    }
                                });
                                org.telegram.ui.Cells.d3 d3Var4 = this.M1;
                                long j17 = j11 - y10.f.amount;
                                if (j17 > j10) {
                                    j11 = j17;
                                }
                                Object[] objArr = new Object[1];
                                objArr[z18 ? 1 : 0] = sb4;
                                d3Var4.b(rh.h8.a1(z18, org.telegram.messenger.dd.K("StarsSubscriptionExpiredHintTitle2", (int) j11, ',', objArr), 0.72f, null), org.telegram.messenger.dd.L0(2131745007, null));
                                this.M1.setOnCloseListener(new gv(this, 13));
                            }
                            if (this.W2 != 0 && this.Y2 == j10 && !getMessagesController().i7 && (b10 = org.telegram.messenger.y1.a(this.currentAccount).b()) != null && !b10.c.isEmpty() && !getMessagesController().V3.contains("BIRTHDAY_CONTACTS_TODAY")) {
                                org.telegram.messenger.w1 b11 = org.telegram.messenger.y1.a(this.currentAccount).b();
                                ArrayList arrayList3 = b11.c;
                                this.M1.setOnClickListener(new vu(4, this, b11));
                                this.M1.a(this.currentAccount, arrayList3);
                                org.telegram.ui.Cells.d3 d3Var5 = this.M1;
                                if (arrayList3.size() == 1) {
                                    r62 = 0;
                                    G = org.telegram.messenger.dd.a0(null, null, 2131753706, org.telegram.messenger.i20.k((TLRPC.User) arrayList3.get(0)));
                                } else {
                                    r62 = 0;
                                    G = org.telegram.messenger.dd.G(arrayList3.size(), "BirthdayTodayMultipleTitle", new Object[0]);
                                }
                                d3Var5.b(org.telegram.messenger.k6.p(org.telegram.messenger.i0.R2(G, org.telegram.ui.ActionBar.t6.I6, 2, r62, r62), this.M1.c, new ev(this, 21)), org.telegram.messenger.dd.a0(null, null, arrayList3.size() == 1 ? 2131753707 : 2131753710, new Object[0]));
                                this.M1.setOnCloseListener(new gv(this, 14));
                                rh.e6.y(this.currentAccount, false).U();
                            } else if (this.W2 != 0 && this.Y2 == j10 && org.telegram.messenger.wp.r1(this.currentAccount).U3.contains("BIRTHDAY_SETUP") && getMessagesController().a2(getUserConfig().e()) != null && getMessagesController().a2(getUserConfig().e()).birthday == null) {
                                org.telegram.messenger.i5.r(this.currentAccount).D(false);
                                this.M1.setOnClickListener(new gv(this, 15));
                                this.M1.b(org.telegram.messenger.k6.p(org.telegram.messenger.dd.L0(2131753712, null), this.M1.c, new ev(this, 21)), org.telegram.messenger.dd.a0(null, null, 2131753713, new Object[0]));
                                this.M1.setOnCloseListener(new gv(this, 16));
                            } else if (!((org.telegram.messenger.wp.r1(this.currentAccount).A3() && this.W2 == 0 && this.Y2 == j10) ? org.telegram.messenger.wp.r1(this.currentAccount).U3.contains("PREMIUM_CHRISTMAS") : false)) {
                                this.M1.setOnClickListener(new bh.c(13));
                                this.M1.b(org.telegram.messenger.k6.m(org.telegram.messenger.i0.R2(org.telegram.messenger.dd.L0(2131749682, null), org.telegram.ui.ActionBar.t6.I6, 2, null, null), null, false, null, 0), org.telegram.messenger.dd.a0(null, null, 2131753331, new Object[0]));
                                this.M1.setOnCloseListener(new gv(this, 17));
                            } else if (!org.telegram.messenger.wp.r1(this.currentAccount).A3() && this.W2 == 0 && this.Y2 == j10 && org.telegram.messenger.wp.r1(this.currentAccount).U3.contains("PREMIUM_RESTORE") && !getUserConfig().q() && org.telegram.messenger.vi.b0(this.currentAccount).g0(false) != null) {
                                this.M1.setOnClickListener(new gv(this, 18));
                                this.M1.b(org.telegram.messenger.i0.R2(org.telegram.messenger.dd.a0(null, null, 2131746081, org.telegram.messenger.vi.b0(this.currentAccount).g0(false)), org.telegram.ui.ActionBar.t6.I6, 2, null, null), org.telegram.messenger.dd.L0(2131746082, null));
                            } else {
                                if (org.telegram.messenger.wp.r1(this.currentAccount).A3() || this.W2 != 0 || this.Y2 != j10 || ((!(org.telegram.messenger.wp.r1(this.currentAccount).U3.contains("PREMIUM_UPGRADE") && getUserConfig().q()) && (!org.telegram.messenger.wp.r1(this.currentAccount).U3.contains("PREMIUM_ANNUAL") || getUserConfig().q())) || (!org.telegram.messenger.e20.i(this.currentAccount).q() ? org.telegram.messenger.vi.b0(this.currentAccount).g0(false) == null : org.telegram.messenger.v2.b() || org.telegram.messenger.vi.b0(this.currentAccount).g0(true) == null))) {
                                    z13 = false;
                                } else {
                                    this.A3 = org.telegram.messenger.wp.r1(this.currentAccount).U3.contains("PREMIUM_UPGRADE");
                                    z13 = true;
                                }
                                if (z13) {
                                    this.M1.setOnClickListener(new gv(this, 20));
                                    this.M1.b(org.telegram.messenger.i0.R2(org.telegram.messenger.dd.a0(null, null, this.A3 ? 2131745951 : 2131743832, org.telegram.messenger.vi.b0(this.currentAccount).g0(false)), org.telegram.ui.ActionBar.t6.I6, 2, null, null), org.telegram.messenger.dd.L0(this.A3 ? 2131743835 : 2131745952, null));
                                } else {
                                    if (this.O1 != null && this.P1 != null) {
                                        if (r0.longValue() / this.P1.longValue() < 0.3f) {
                                            org.telegram.messenger.wp.d1().edit().remove("cache_hint_showafter").remove("cache_hint_period").apply();
                                        } else if (System.currentTimeMillis() > org.telegram.messenger.wp.d1().getLong("cache_hint_showafter", j10)) {
                                            z14 = true;
                                            if (!z14) {
                                                this.M1.setOnClickListener(new gv(this, 21));
                                                this.M1.b(org.telegram.messenger.i0.R2(org.telegram.messenger.dd.a0(null, null, 2131752048, org.telegram.messenger.i0.i0(this.O1.longValue(), false, false)), org.telegram.ui.ActionBar.t6.I6, 2, null, null), org.telegram.messenger.dd.L0(2131752049, null));
                                            } else if (this.W2 == 0 && this.Y2 == 0 && getUserConfig().f() != null && ((getUserConfig().f().photo == null || (getUserConfig().f().photo instanceof TLRPC.TL_userProfilePhotoEmpty)) && org.telegram.messenger.wp.r1(this.currentAccount).U3.contains("USERPIC_SETUP"))) {
                                                this.M1.setOnClickListener(new gv(this, 22));
                                                this.M1.h.setVisibility(0);
                                                org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                                                r8Var.setBounds(0, 0, org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(36.0f));
                                                long e = getUserConfig().e();
                                                r8Var.A = true;
                                                r8Var.b = true;
                                                r8Var.c = false;
                                                int i16 = org.telegram.ui.ActionBar.t6.p8[org.telegram.ui.Components.r8.e(e)];
                                                org.telegram.ui.ActionBar.p6 p6Var = r8Var.z;
                                                r8Var.d = org.telegram.ui.ActionBar.t6.w0(i16, p6Var);
                                                r8Var.e = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.q8[org.telegram.ui.Components.r8.e(e)], p6Var);
                                                r8Var.n = 0;
                                                r8Var.m = false;
                                                org.telegram.ui.Components.r8.a("", "", "", r8Var.q);
                                                r8Var.K = getParentActivity().getResources().getDrawable(R.drawable.filled_profile_photo_20);
                                                this.M1.h.setImageDrawable(r8Var);
                                                this.M1.b(org.telegram.messenger.k6.p(org.telegram.messenger.dd.L0(2131749310, null), this.M1.c, new ev(this, 21)), org.telegram.messenger.dd.L0(2131749309, null));
                                                this.M1.setOnCloseListener(new gv(this, 23));
                                            } else {
                                                if (this.W2 == 0 && this.Y2 == 0 && org.telegram.messenger.w0.a != null) {
                                                    for (String str : org.telegram.messenger.wp.r1(this.currentAccount).U3) {
                                                        org.telegram.messenger.w0.a.getClass();
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
                        } else if (!y3.A) {
                            y3.A = true;
                            TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
                            tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
                            tL_getStarsSubscriptions.missing_balance = true;
                            tL_getStarsSubscriptions.offset = "";
                            ConnectionsManager.getInstance(y3.a).sendRequest(tL_getStarsSubscriptions, new rh.g5(y3, z15 ? 1 : 0));
                        }
                    }
                    j10 = 0;
                    if (this.W2 != 0) {
                    }
                    if (this.W2 != 0) {
                    }
                    if (!((org.telegram.messenger.wp.r1(this.currentAccount).A3() && this.W2 == 0 && this.Y2 == j10) ? org.telegram.messenger.wp.r1(this.currentAccount).U3.contains("PREMIUM_CHRISTMAS") : false)) {
                    }
                }
            }
            z15 = true;
        }
        ww wwVar3 = this.F3;
        fe.b bVar = this.b;
        if ((wwVar3 != null && wwVar3.c()) || bVar.f) {
            z15 = false;
        }
        this.J1.i(this.M1, z15, true);
        B3(true);
        if (this.fragmentView == null || this.J1 == null) {
            z10 = false;
        } else {
            boolean z19 = !isInPreviewMode() && this.W2 == 0 && this.Y2 == 0 && this.R0 == 0 && !getMessagesController().T1().b.isEmpty() && ((wwVar2 = this.F3) == null || !wwVar2.c()) && !bVar.f;
            if (z19) {
                if (this.N1 == null) {
                    org.telegram.ui.Cells.ma maVar = new org.telegram.ui.Cells.ma(getParentActivity());
                    this.N1 = maVar;
                    this.J1.addView(maVar);
                }
                org.telegram.ui.Cells.ma maVar2 = this.N1;
                int i17 = this.currentAccount;
                TextView textView = maVar2.b;
                TextView textView2 = maVar2.c;
                ArrayList arrayList4 = org.telegram.messenger.wp.r1(i17).T1().b;
                org.telegram.ui.Cells.la laVar = maVar2.d;
                laVar.setText(org.telegram.messenger.dd.L0(2131743935, null));
                laVar.a(false, false);
                org.telegram.ui.Cells.la laVar2 = maVar2.e;
                laVar2.setText(org.telegram.messenger.dd.L0(2131743925, null));
                laVar2.a(false, false);
                if (arrayList4 == null || arrayList4.size() != 1) {
                    if (arrayList4 == null || arrayList4.size() <= 1) {
                        z10 = false;
                    } else {
                        textView.setText(org.telegram.messenger.dd.L0(2131743916, null));
                        String str2 = ((org.telegram.messenger.a20) arrayList4.get(0)).f;
                        int i18 = 1;
                        while (true) {
                            if (i18 >= arrayList4.size()) {
                                break;
                            }
                            if (!TextUtils.equals(str2, ((org.telegram.messenger.a20) arrayList4.get(i18)).f)) {
                                str2 = null;
                                break;
                            }
                            i18++;
                        }
                        if (str2 == null) {
                            z10 = false;
                            textView2.setText(org.telegram.messenger.dd.G(arrayList4.size(), "UnconfirmedAuthMultiple", new Object[0]));
                        } else {
                            z10 = false;
                            textView2.setText(org.telegram.messenger.dd.G(arrayList4.size(), "UnconfirmedAuthMultipleFrom", str2));
                        }
                    }
                    z12 = z10;
                } else {
                    org.telegram.messenger.a20 a20Var = (org.telegram.messenger.a20) arrayList4.get(0);
                    boolean z20 = a20Var.a;
                    String str3 = a20Var.f;
                    boolean z21 = true;
                    textView.setText(org.telegram.messenger.dd.L0(z20 ? 2131743915 : 2131743916, null));
                    String str4 = "" + a20Var.e;
                    if (!TextUtils.isEmpty(str3) && !str4.isEmpty()) {
                        str4 = str4.concat(", ");
                    }
                    String A = sc.e.A(str4, str3);
                    if (a20Var.a) {
                        textView2.setText(org.telegram.messenger.dd.a0(null, null, 2131743917, "@" + org.telegram.messenger.o5.t(a20Var.c), A));
                    } else {
                        textView2.setText(org.telegram.messenger.dd.a0(null, null, 2131743918, A));
                        z21 = false;
                    }
                    z12 = z21;
                    z10 = false;
                }
                laVar.setOnClickListener(new org.telegram.ui.Cells.ka(this, z12, i17, arrayList4));
                laVar2.setOnClickListener(new jg.w1(maVar2, i17, arrayList4, 2));
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.ma maVar3 = this.N1;
            if (maVar3 != null) {
                this.J1.i(maVar3, z19, true);
            }
        }
        if (this.fragmentView == null || this.J1 == null) {
            return;
        }
        if (!isInPreviewMode() && this.W2 == 0 && this.Y2 == 0 && this.R0 == 0) {
            org.telegram.messenger.y9 giftAuctionsController = getGiftAuctionsController();
            if (!giftAuctionsController.d) {
                SharedPreferences sharedPreferences = giftAuctionsController.getMessagesController().f7;
                if (System.currentTimeMillis() - (sharedPreferences != null ? sharedPreferences.getLong("lastGiftAuctionTimeUpdate", 0L) : 0L) < 86400000) {
                    giftAuctionsController.d = true;
                    TL_payments.TL_getStarGiftActiveAuctions tL_getStarGiftActiveAuctions = new TL_payments.TL_getStarGiftActiveAuctions();
                    ?? arrayList5 = new ArrayList();
                    ?? r72 = giftAuctionsController.b;
                    int size = r72.size();
                    for (?? r92 = z10; r92 < size; r92++) {
                        org.telegram.messenger.v9 v9Var = (org.telegram.messenger.v9) r72.valueAt(r92);
                        org.telegram.messenger.u9 u9Var2 = v9Var.b;
                        if (u9Var2 != null && !u9Var2.f() && (tL_starGiftAuctionState = (u9Var = v9Var.b).f) != null && (i10 = u9Var.e.bid_date) > 0) {
                            arrayList5.add(Long.valueOf(tL_starGiftAuctionState.version | (i10 << 32)));
                        }
                    }
                    Collections.sort(arrayList5);
                    int size2 = arrayList5.size();
                    long j18 = 0;
                    for (?? r52 = z10; r52 < size2; r52++) {
                        Long l4 = (Long) arrayList5.get(r52);
                        j18 = org.telegram.messenger.vi.p(org.telegram.messenger.vi.p(j18, l4.longValue() & 4294967295L), l4.longValue() >> 32);
                    }
                    tL_getStarGiftActiveAuctions.hash = j18;
                    giftAuctionsController.getConnectionsManager().sendRequestTyped(tL_getStarGiftActiveAuctions, new a3.b(1), new org.telegram.messenger.d(giftAuctionsController, 2));
                }
            }
            if (!giftAuctionsController.c.isEmpty() && (((wwVar = this.F3) == null || !wwVar.c()) && !bVar.f)) {
                z11 = true;
                if (z11 && this.L1 == null) {
                    org.telegram.ui.Cells.l lVar2 = new org.telegram.ui.Cells.l(getParentActivity(), this.currentAccount);
                    this.L1 = lVar2;
                    this.J1.addView(lVar2);
                }
                lVar = this.L1;
                if (lVar == null) {
                    this.J1.i(lVar, z11, true);
                    return;
                }
                return;
            }
        }
        z11 = z10;
        if (z11) {
            org.telegram.ui.Cells.l lVar22 = new org.telegram.ui.Cells.l(getParentActivity(), this.currentAccount);
            this.L1 = lVar22;
            this.J1.addView(lVar22);
        }
        lVar = this.L1;
        if (lVar == null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.ActionBar.u4 getBackButtonState() {
        return (q4() || this.F3.f) ? org.telegram.ui.ActionBar.u4.a : org.telegram.ui.ActionBar.u4.b;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f7) {
        int i10 = 1;
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.W3, 1.0f);
            this.Z3 = ofFloat;
            return ofFloat;
        }
        int i11 = (getLayoutContainer() == null || getLayoutContainer().getMeasuredWidth() <= 0) ? org.telegram.messenger.at.g2 : (int) Utilities.i((200.0f / getLayoutContainer().getMeasuredWidth()) * f7, 200.0f, 80.0f);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.W3, 1.0f);
        this.Z3 = ofFloat2;
        ofFloat2.addUpdateListener(new lv(this, i10));
        this.Z3.setInterpolator(org.telegram.ui.Components.gr.g);
        this.Z3.setDuration(i11);
        this.Z3.start();
        return this.Z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0230 A[SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList getThemeDescriptions() {
        View view;
        View view2;
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.ActionBar.t0 t0Var = this.m0;
        if (t0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.t8));
        }
        if (this.W2 == 0) {
            jx jxVar = this.C0;
            if (jxVar != null) {
                arrayList.add(new org.telegram.ui.ActionBar.c7(jxVar.a0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
            }
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 128, (Class[]) null, (Paint) null, new Drawable[]{org.telegram.ui.ActionBar.t6.s1}, (org.telegram.ui.ActionBar.b7) null, !this.W ? org.telegram.ui.ActionBar.t6.A8 : org.telegram.ui.ActionBar.t6.Ul));
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.C8));
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.D8));
        } else {
            jx jxVar2 = this.C0;
            if (jxVar2 != null) {
                arrayList.add(new org.telegram.ui.ActionBar.c7(jxVar2.a0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
            }
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 128, (Class[]) null, (Paint) null, new Drawable[]{org.telegram.ui.ActionBar.t6.s1}, (org.telegram.ui.ActionBar.b7) null, !this.W ? org.telegram.ui.ActionBar.t6.P8 : org.telegram.ui.ActionBar.t6.Ul));
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Q8));
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.R8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, TLObject.FLAG_21, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.x8));
        NumberTextView numberTextView = this.h1;
        int i10 = org.telegram.ui.ActionBar.t6.y8;
        arrayList.add(new org.telegram.ui.ActionBar.c7(numberTextView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        if (this.z0 != null) {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar == null || !lVar.u()) {
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.z0, 0, new Class[]{org.telegram.ui.Components.tz.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.K8));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.rz.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.I8));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.rz.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.J8));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.z0.getTabsContainer(), TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.L8));
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.z0, 0, new Class[]{org.telegram.ui.Components.tz.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.ui));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.rz.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.ti));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.z0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.rz.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.si));
            }
        }
        arrayList.addAll(w7.f6.a(new g6(7, this), org.telegram.ui.ActionBar.t6.w8, i10));
        int i11 = 0;
        while (i11 < 3) {
            if (i11 == 2) {
                jx jxVar3 = this.C0;
                if (jxVar3 == null) {
                    i11++;
                } else {
                    view = jxVar3.a0;
                    view2 = view;
                    if (view2 == null) {
                        arrayList.add(new org.telegram.ui.ActionBar.c7(view2, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.i6));
                        arrayList.add(new org.telegram.ui.ActionBar.c7(view2, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.h6));
                        int i12 = org.telegram.ui.Cells.z3.h;
                        arrayList.add(new org.telegram.ui.ActionBar.c7(view2, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.o6));
                    }
                    i11++;
                }
            } else {
                yx[] yxVarArr = this.e0;
                if (yxVarArr == null) {
                    i11++;
                } else {
                    view = i11 < yxVarArr.length ? yxVarArr[i11].a : null;
                    view2 = view;
                    if (view2 == null) {
                    }
                    i11++;
                }
            }
        }
        if (this.e0 != null) {
            int i13 = 0;
            while (true) {
                yx[] yxVarArr2 = this.e0;
                if (i13 >= yxVarArr2.length) {
                    break;
                }
                if (this.W2 == 0) {
                    arrayList.add(new org.telegram.ui.ActionBar.c7(yxVarArr2[i13].a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
                } else {
                    arrayList.add(new org.telegram.ui.ActionBar.c7(yxVarArr2[i13].a, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
                }
                int i14 = org.telegram.messenger.uz.a;
                int i15 = org.telegram.ui.ActionBar.t6.q6;
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.e0[i13].a, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.e0[i13].a, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.e0[i13].x, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.h6));
                this.e0[i13].d.getClass();
                arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
                i13++;
            }
        }
        int i16 = 0;
        while (true) {
            UndoView[] undoViewArr = this.y0;
            if (i16 >= undoViewArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.c7(undoViewArr[i16], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.tj));
            i16++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.i5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.k5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.l5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.m5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.n5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.o5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.q7));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.p5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.q5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.r5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.s5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.J5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.t5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.u5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.v5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.w5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.x5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.y5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.z5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.D5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.E5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.H5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.B5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.C5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.F5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.K5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.M5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.N5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.O5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Q5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.S5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.U5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.wj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.xj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Bj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Cj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Dj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ej));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Fj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Gj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Hj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ij));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Jj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Kj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Lj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Hh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ih));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Jh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Kh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Lh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Mh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ph));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Th));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Wh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Uh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Vh));
        zf.g0 g0Var = this.b0;
        if (g0Var != null) {
            arrayList.addAll(g0Var.getThemeDescriptions());
            this.b0.updateColors();
        }
        cy cyVar = this.h0;
        if (cyVar != null) {
            cyVar.updateColors();
            this.h0.invalidate();
        }
        jx jxVar4 = this.C0;
        if (jxVar4 != null) {
            org.telegram.ui.Components.um0 um0Var = jxVar4.b0;
            SparseArray sparseArray = jxVar4.h;
            ag.b1 b1Var = jxVar4.a0;
            for (int i17 = 0; i17 < b1Var.getChildCount(); i17++) {
                View childAt = b1Var.getChildAt(i17);
                if ((childAt instanceof org.telegram.ui.Cells.k6) || (childAt instanceof org.telegram.ui.Cells.v2) || (childAt instanceof org.telegram.ui.Cells.o4)) {
                    arrayList.add(new org.telegram.ui.ActionBar.c7(childAt, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
                }
            }
            for (int i18 = 0; i18 < jxVar4.getChildCount(); i18++) {
                if (jxVar4.getChildAt(i18) instanceof y00) {
                    arrayList.addAll(((y00) jxVar4.getChildAt(i18)).getThemeDescriptions());
                }
            }
            int size = sparseArray.size();
            for (int i19 = 0; i19 < size; i19++) {
                View view3 = (View) sparseArray.valueAt(i19);
                if (view3 instanceof y00) {
                    arrayList.addAll(((y00) view3).getThemeDescriptions());
                }
            }
            y00 y00Var = jxVar4.O0;
            if (y00Var != null) {
                arrayList.addAll(y00Var.getThemeDescriptions());
            }
            arrayList.add(new org.telegram.ui.ActionBar.c7(um0Var.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.c7(um0Var.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.y6));
            arrayList.addAll(w7.f6.a(new org.telegram.ui.Components.o6(jxVar4, 4), org.telegram.ui.ActionBar.t6.y8));
        }
        org.telegram.ui.Cells.d3 d3Var = this.M1;
        int i20 = 5;
        if (d3Var != null) {
            arrayList.addAll(w7.f6.a(new org.telegram.ui.Components.o6(new rh(d3Var, 20), i20), org.telegram.ui.ActionBar.t6.d6, org.telegram.ui.ActionBar.t6.G6, org.telegram.ui.ActionBar.t6.y6));
        }
        org.telegram.ui.Cells.ma maVar = this.N1;
        if (maVar != null) {
            arrayList.addAll(w7.f6.a(new org.telegram.ui.Components.o6(new rh(maVar, 21), i20), org.telegram.ui.ActionBar.t6.d6, org.telegram.ui.ActionBar.t6.G6, org.telegram.ui.ActionBar.t6.y6, org.telegram.ui.ActionBar.t6.I6, org.telegram.ui.ActionBar.t6.q7));
        }
        org.telegram.ui.Cells.l lVar2 = this.L1;
        if (lVar2 != null) {
            arrayList.addAll(w7.f6.a(new org.telegram.ui.Components.o6(new rh(lVar2, 22), i20), org.telegram.ui.ActionBar.t6.d6, org.telegram.ui.ActionBar.t6.G6, org.telegram.ui.ActionBar.t6.y6, org.telegram.ui.ActionBar.t6.I6, org.telegram.ui.ActionBar.t6.q7));
        }
        return arrayList;
    }

    public final float h4() {
        ww wwVar = this.F3;
        if (wwVar == null || !wwVar.c()) {
            return 0.0f;
        }
        return this.F3.e;
    }

    public final void h5() {
        ag.b1 b1Var;
        vx vxVar;
        try {
            nw nwVar = this.B1;
            if (nwVar != null && nwVar.getEditField() != null) {
                this.B1.getEditField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.t6.Ke));
            }
            NumberTextView numberTextView = this.h1;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.t6.y8));
            }
            px pxVar = this.z0;
            int i10 = 0;
            if (pxVar != null && (pxVar.getSelectorDrawable() instanceof GradientDrawable)) {
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                ((GradientDrawable) this.z0.getSelectorDrawable()).setColor(getThemedColor(lVar != null && lVar.u() ? org.telegram.ui.ActionBar.t6.ui : org.telegram.ui.ActionBar.t6.K8));
                this.z0.invalidate();
            }
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            if (lVar2 != null) {
                if (this.W2 != 0 || this.Y2 != 0) {
                    lVar2.I(getThemedColor(org.telegram.ui.ActionBar.t6.Q8), false);
                    this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.t6.R8), true);
                }
                if (this.actionBar.u()) {
                    this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.t6.d6));
                }
                n5();
            }
            if (this.e0 != null) {
                while (true) {
                    yx[] yxVarArr = this.e0;
                    if (i10 >= yxVarArr.length) {
                        break;
                    }
                    yx yxVar = yxVarArr[i10];
                    if (yxVar != null && (vxVar = yxVar.a) != null) {
                        vxVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.t6.d6));
                    }
                    i10++;
                }
            }
            jx jxVar = this.C0;
            if (jxVar != null && (b1Var = jxVar.a0) != null) {
                b1Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.t6.d6));
            }
            bi.f2 f2Var = this.C1;
            if (f2Var != null) {
                f2Var.setScrimViewBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.t6.d6));
            }
            vh.p2 p2Var = this.p0;
            if (p2Var != null) {
                p2Var.h(getThemedColor(org.telegram.ui.ActionBar.t6.tj));
            }
            vh.p2 p2Var2 = this.q0;
            if (p2Var2 != null) {
                p2Var2.h(getThemedColor(org.telegram.ui.ActionBar.t6.tj));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final float i4() {
        return -org.telegram.messenger.i0.W1(this.b.e, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(48.0f));
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
        org.telegram.messenger.bp bpVar;
        Object[] objArr;
        boolean z12;
        boolean z13;
        if (this.z0 == null || this.inPreviewMode || this.q3) {
            return;
        }
        ww wwVar = this.F3;
        if (wwVar == null || !wwVar.c()) {
            org.telegram.ui.Components.z60 z60Var = this.L0;
            String str = null;
            if (z60Var != null) {
                z60Var.u();
                this.L0 = null;
            }
            ArrayList S0 = getMessagesController().S0();
            int size = S0.size();
            fe.b bVar = this.r;
            boolean z14 = true;
            boolean z15 = false;
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
                        kw kwVar = this.e0[0].d;
                        kwVar.h = 0;
                        kwVar.f();
                        yx yxVar = this.e0[0];
                        yxVar.s = this.R0;
                        yxVar.d.f();
                    }
                    this.e0[1].setVisibility(8);
                    yx yxVar2 = this.e0[1];
                    yxVar2.h = 0;
                    kw kwVar2 = yxVar2.d;
                    kwVar2.h = 0;
                    kwVar2.f();
                    yx yxVar3 = this.e0[1];
                    yxVar3.s = this.R0;
                    yxVar3.d.f();
                    this.x = false;
                    if (this.fragmentView != null) {
                        boolean z16 = (this.isPaused || this.Q3 != null) ? false : z11;
                        if (!this.q3) {
                            bVar.a(false, z16);
                        }
                    }
                    int i10 = 0;
                    while (true) {
                        yx[] yxVarArr = this.e0;
                        if (i10 >= yxVarArr.length) {
                            break;
                        }
                        yx yxVar4 = yxVarArr[i10];
                        if (yxVar4.s == 0 && yxVar4.w == 2 && l4() && ((L0 = this.e0[i10].c.L0()) == 0 || L0 == 1)) {
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
                this.x = true;
                boolean isEmpty = this.z0.h.isEmpty();
                if (this.fragmentView != null) {
                    boolean z18 = (this.isPaused || this.Q3 != null) ? false : z11;
                    if (!this.q3) {
                        bVar.a(this.x, z18);
                    }
                }
                int currentTabId = this.z0.getCurrentTabId();
                int currentTabStableId = this.z0.getCurrentTabStableId();
                if (currentTabId == this.z0.getDefaultTabId() || currentTabId < S0.size()) {
                    objArr = false;
                } else {
                    this.z0.L = -1;
                    objArr = true;
                }
                px pxVar = this.z0;
                pxVar.h.clear();
                pxVar.j0.clear();
                pxVar.l0.clear();
                pxVar.m0.clear();
                pxVar.n0.clear();
                pxVar.o0.clear();
                pxVar.M = 0;
                int size2 = S0.size();
                int i11 = 0;
                while (i11 < size2) {
                    if (((org.telegram.messenger.bp) S0.get(i11)).e()) {
                        this.z0.a(i11, 0, org.telegram.messenger.dd.L0(2131750808, str), null, false, true, ((org.telegram.messenger.bp) S0.get(i11)).p);
                        z13 = z15;
                    } else {
                        org.telegram.messenger.bp bpVar2 = (org.telegram.messenger.bp) S0.get(i11);
                        z13 = z15;
                        this.z0.a(i11, bpVar2.o, bpVar2.b, bpVar2.c, bpVar2.n, false, ((org.telegram.messenger.bp) S0.get(i11)).p);
                    }
                    i11++;
                    z15 = z13;
                    str = null;
                }
                boolean z19 = z15;
                if (currentTabStableId >= 0) {
                    if (objArr != false && !this.z0.h(currentTabStableId)) {
                        while (currentTabId >= 0) {
                            px pxVar2 = this.z0;
                            if (pxVar2.h(pxVar2.k0.get(currentTabId, -1))) {
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
                    yx[] yxVarArr2 = this.e0;
                    if (i12 >= yxVarArr2.length) {
                        break;
                    }
                    if (yxVarArr2[i12].h >= S0.size()) {
                        this.e0[i12].h = S0.size() - 1;
                    }
                    this.e0[i12].a.setScrollingTouchSlop(1);
                    i12++;
                }
                px pxVar3 = this.z0;
                pxVar3.F.setItemAnimator(z17 ? pxVar3.s0 : null);
                pxVar3.I.f();
                if (isEmpty) {
                    d5(z19);
                }
                px pxVar4 = this.z0;
                int currentTabId2 = pxVar4.getCurrentTabId();
                ArrayList arrayList = pxVar4.h;
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        z12 = false;
                        break;
                    } else {
                        if (((org.telegram.ui.Components.pz) arrayList.get(i13)).a == currentTabId2) {
                            z12 = ((org.telegram.ui.Components.pz) arrayList.get(i13)).f;
                            break;
                        }
                        i13++;
                    }
                }
                if (z12) {
                    px pxVar5 = this.z0;
                    ArrayList arrayList2 = pxVar5.h;
                    if (!arrayList2.isEmpty()) {
                        r52 = 0;
                        pxVar5.f((org.telegram.ui.Components.pz) arrayList2.get(0), 0);
                    }
                }
                r52 = 0;
            } else {
                r52 = 0;
            }
            f5(r52);
            int i14 = this.e0[r52].s;
            if ((i14 == 7 || i14 == 8) && (bpVar = getMessagesController().M[i14 - 7]) != null) {
                int i15 = 0;
                while (true) {
                    if (i15 >= S0.size()) {
                        z14 = false;
                        break;
                    }
                    org.telegram.messenger.bp bpVar3 = (org.telegram.messenger.bp) S0.get(i15);
                    if (bpVar3 != null && bpVar3.a == bpVar.a) {
                        break;
                    } else {
                        i15++;
                    }
                }
                if (z14) {
                    return;
                }
                d5(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isLightStatusBar() {
        ww wwVar;
        return (this.j2 || (wwVar = this.F3) == null || wwVar.getFragment() == null) ? i0.b.h(getThemedColor(org.telegram.ui.ActionBar.t6.d6)) > 0.699999988079071d : this.F3.getFragment().isLightStatusBar();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final th.e5 j4() {
        return getMessagesController().O1();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j5(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11, boolean z12) {
        jx jxVar;
        boolean z13;
        org.telegram.ui.Components.w71 w71Var;
        if (!this.q3 || this.l2 || (jxVar = this.C0) == null) {
            return;
        }
        ArrayList<zf.e0> currentSearchFilters = jxVar.getCurrentSearchFilters();
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
                this.b0.D1(arrayList, arrayList2, z11);
                z13 = true;
                if (!z13) {
                    this.b0.D1(null, null, false);
                }
                if (!z12) {
                    this.b0.getAdapter().f();
                }
                w71Var = this.a0;
                if (w71Var != null) {
                    w71Var.b(z13, true);
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
        w71Var = this.a0;
        if (w71Var != null) {
        }
        this.b0.setEnabled(z13);
        this.s.a(z13, true);
    }

    @Override // org.telegram.ui.nf0
    public final hi.f k() {
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
            sx sxVar = (sx) this.fragmentView;
            sxVar.removeView(undoViewArr[0]);
            sxVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void k5() {
        float f7 = (((-this.f4) - this.i4) - this.u1) - this.v1;
        org.telegram.ui.Components.f10 f10Var = this.t0;
        if (f10Var != null) {
            f10Var.setTranslationY(f7);
        }
        org.telegram.ui.Components.f10 f10Var2 = this.u0;
        if (f10Var2 != null) {
            f10Var2.setTranslationY(f7 - org.telegram.messenger.i0.L(52.0f));
            vh.p2 p2Var = this.p0;
            if (p2Var != null) {
                p2Var.setTranslationY(f7 - org.telegram.messenger.i0.L(52.0f));
            }
        }
    }

    public final boolean l4() {
        if (this.l2 || this.R0 != 0 || this.Y2 != 0 || this.W2 != 0) {
            return false;
        }
        org.telegram.messenger.wp messagesController = getMessagesController();
        messagesController.getClass();
        return org.telegram.messenger.uz.q1 && messagesController.Q.f(2305843009213693952L | ((long) 1)) != null;
    }

    public final void l5(boolean z10) {
        boolean z11 = this.l2;
        boolean z12 = (!z11 || this.R0 == 10) && this.W2 == 0 && this.Y2 == 0 && !this.inPreviewMode && (!this.j2 || z11) && !this.T3;
        org.telegram.ui.Components.f10 f10Var = this.t0;
        if (f10Var != null) {
            f10Var.e(z12, z10);
        }
        org.telegram.ui.Components.f10 f10Var2 = this.u0;
        if (f10Var2 != null) {
            f10Var2.e(z12, z10);
        }
    }

    public final boolean m4() {
        ArrayList arrayList = this.D2;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public final void m5(boolean z10, boolean z11) {
        boolean z12;
        if (this.n0 != null) {
            org.telegram.ui.ActionBar.t0 t0Var = this.m0;
            if (t0Var == null || t0Var.getVisibility() != 0) {
                int i10 = 0;
                while (true) {
                    if (i10 >= getDownloadController().G.size()) {
                        z12 = false;
                        break;
                    } else {
                        if (getFileLoader().T(((org.telegram.messenger.kj) getDownloadController().G.get(i10)).S0())) {
                            z12 = true;
                            break;
                        }
                        i10++;
                    }
                }
                if (getDownloadController().I.size() > 0 || z12 || (this.g0.getVisibility() == 0 && this.g0.getAlpha() == 1.0f && !z11)) {
                    this.i0 = true;
                } else {
                    this.i0 = false;
                }
                J3();
                boolean z13 = org.telegram.messenger.w0.b.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i11 = this.d2;
                boolean z14 = i11 == 3 || i11 == 5;
                this.o0.setSubtext(org.telegram.messenger.dd.L0(z13 ? z14 ? 2131748623 : 2131748622 : 2131748621, null));
                this.n0.b(z13, z14, z10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n4(boolean z10) {
        boolean z11;
        this.actionBar.t();
        this.I2.clear();
        org.telegram.ui.ActionBar.c2 c2Var = this.e1;
        int i10 = 1;
        if (c2Var != null) {
            c2Var.c(true, 0.0f);
        }
        px pxVar = this.z0;
        if (pxVar != null) {
            pxVar.b(org.telegram.ui.ActionBar.t6.K8, org.telegram.ui.ActionBar.t6.I8, org.telegram.ui.ActionBar.t6.J8, org.telegram.ui.ActionBar.t6.L8, org.telegram.ui.ActionBar.t6.d6);
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
        int i11 = 0;
        int i12 = 0;
        while (true) {
            yx[] yxVarArr = this.e0;
            if (i12 >= yxVarArr.length) {
                break;
            }
            yx yxVar = yxVarArr[i12];
            if (yxVar != null) {
                yxVar.a.I0(true);
            }
            i12++;
        }
        float max = Math.max(0.0f, org.telegram.messenger.i0.L((this.K ? 81 : 0) + 48) + this.N);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.u3, 0.0f);
        this.v3 = ofFloat;
        ofFloat.addUpdateListener(new iv(this, max, i10));
        this.v3.addListener(new ex(this, max, i11));
        this.v3.setInterpolator(org.telegram.ui.Components.gr.f);
        this.v3.setDuration(200L);
        this.v3.start();
        this.Y0 = false;
        ArrayList arrayList = this.a1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                org.telegram.messenger.bp bpVar = (org.telegram.messenger.bp) arrayList.get(i13);
                h00.z0(bpVar, bpVar.g, bpVar.b, bpVar.c, bpVar.n, bpVar.m, bpVar.h, bpVar.i, bpVar.j, false, false, true, true, false, this, null);
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
            getMessagesController().j4(this.W2, 0L, null);
            z11 = 0;
            this.Z0 = false;
        } else {
            z11 = 0;
        }
        f5(true);
        if (this.e0 != null) {
            int i14 = z11;
            while (true) {
                yx[] yxVarArr2 = this.e0;
                if (i14 >= yxVarArr2.length) {
                    break;
                }
                yxVarArr2[i14].d.H = z11;
                i14++;
            }
        }
        int i15 = org.telegram.messenger.wp.D8;
        int i16 = z11;
        if (z10) {
            i16 = TLObject.FLAG_13;
        }
        u5(i16 | 196608, true);
    }

    public final void n5() {
        if (!this.s3 || this.actionBar == null) {
            return;
        }
        int themedColor = getThemedColor((this.W2 == 0 && this.Y2 == 0) ? org.telegram.ui.ActionBar.t6.v8 : org.telegram.ui.ActionBar.t6.O8);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.t6.y8;
        lVar.D(i0.b.f(this.x1, themedColor, getThemedColor(i10)), false);
        this.actionBar.D(i0.b.f(this.x1, getThemedColor(i10), getThemedColor(i10)), true);
        this.actionBar.C(i0.b.f(this.x1, getThemedColor((this.W2 == 0 && this.Y2 == 0) ? org.telegram.ui.ActionBar.t6.t8 : org.telegram.ui.ActionBar.t6.N8), getThemedColor(org.telegram.ui.ActionBar.t6.z8)), false);
    }

    public final void o4(boolean z10) {
        if (this.F3.c()) {
            z10 = true;
        }
        if (z10 && this.b2) {
            return;
        }
        this.T3 = z10;
        l5(true);
        if (z10) {
            vh.p2 p2Var = this.p0;
            if (p2Var != null) {
                p2Var.e(true);
            }
            vh.p2 p2Var2 = this.q0;
            if (p2Var2 != null) {
                p2Var2.e(true);
            }
        }
    }

    public final void o5() {
        org.telegram.ui.Components.tp0 tp0Var;
        nw nwVar = this.B1;
        ArrayList arrayList = this.I2;
        if (nwVar == null) {
            if (this.R0 == 10) {
                o4(arrayList.isEmpty());
                return;
            }
            return;
        }
        int i10 = 1;
        this.n.a(!arrayList.isEmpty(), true);
        p5();
        if (arrayList.isEmpty()) {
            String L0 = org.telegram.messenger.dd.L0((this.R0 == 3 && this.f2 == null) ? 2131750577 : 2131745686, null);
            if (this.P3 == arrayList.isEmpty()) {
                this.actionBar.setTitle(L0);
            } else {
                this.actionBar.K(L0, true, 350L, org.telegram.ui.Components.gr.h);
            }
            if (this.B1.getTag() != null) {
                this.B1.j0(false, false, false);
                this.B1.K();
                this.B1.setTag(null);
                this.fragmentView.requestLayout();
            }
        } else {
            if (this.B1.getTag() == null) {
                if (!m4() && this.E2 == null) {
                    this.B1.setFieldText("");
                }
                this.B1.setTag(1);
                if (!this.V3 && (tp0Var = this.G2) != null) {
                    this.V3 = true;
                    String L02 = org.telegram.messenger.dd.L0(2131745447, null);
                    tp0Var.j();
                    tp0Var.F = L02;
                    org.telegram.ui.Components.rp0 rp0Var = tp0Var.a[0];
                    if (L02 != null) {
                        ((org.telegram.ui.ActionBar.u5) rp0Var.h).l(L02, false);
                    }
                    org.telegram.ui.Components.vo0 vo0Var = new org.telegram.ui.Components.vo0(tp0Var, i10);
                    tp0Var.G = vo0Var;
                    org.telegram.messenger.i0.h3(vo0Var, 1000L);
                }
            }
            this.C1.g(Math.max(1, arrayList.size()), true);
            int i11 = this.S0 + (!TextUtils.isEmpty(this.B1.getFieldText()) ? 1 : 0);
            int size = arrayList.size();
            int i12 = 0;
            long j10 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                long longValue = ((Long) obj).longValue();
                long M1 = getMessagesController().M1(longValue);
                if (M1 <= 0 && longValue > 0) {
                    M1 = org.telegram.messenger.o5.k(getMessagesController().H2(longValue));
                }
                j10 += M1;
            }
            this.C1.i(i11, j10, true);
            this.B1.Q1();
            if (this.P3 == arrayList.isEmpty()) {
                this.actionBar.setTitle(org.telegram.messenger.dd.G(arrayList.size(), "Recipient", new Object[0]));
            } else {
                this.actionBar.K(org.telegram.messenger.dd.G(arrayList.size(), "Recipient", new Object[0]), false, 350L, org.telegram.ui.Components.gr.h);
            }
        }
        this.P3 = arrayList.isEmpty();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else if (!this.F3.c() || !this.F3.getFragment().onBackPressed(z10)) {
            org.telegram.ui.Components.z60 z60Var = this.L0;
            if (z60Var == null) {
                px pxVar = this.z0;
                if (pxVar == null || !pxVar.n) {
                    org.telegram.ui.ActionBar.l lVar = this.actionBar;
                    if (lVar == null || !lVar.u()) {
                        if (!this.b.f) {
                            px pxVar2 = this.z0;
                            if (pxVar2 != null && pxVar2.getVisibility() == 0 && !this.h3) {
                                px pxVar3 = this.z0;
                                if (!pxVar3.O && !this.m3) {
                                    ArrayList arrayList = pxVar3.h;
                                    if (!arrayList.isEmpty() && pxVar3.L != ((org.telegram.ui.Components.pz) arrayList.get(0)).a) {
                                        if (z10) {
                                            px pxVar4 = this.z0;
                                            ArrayList arrayList2 = pxVar4.h;
                                            if (!arrayList2.isEmpty()) {
                                                pxVar4.f((org.telegram.ui.Components.pz) arrayList2.get(0), 0);
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                            nw nwVar = this.B1;
                            if (nwVar == null || !nwVar.q0()) {
                                tw twVar = this.E0;
                                if (twVar.O != 0 || twVar.S.L0() == 0) {
                                    return super.onBackPressed(z10);
                                }
                                twVar.h.y0(0);
                                return false;
                            }
                            if (z10) {
                                this.B1.i0(true);
                            }
                        } else if (z10) {
                            this.X.r.getText().clear();
                            this.Y.b(false);
                            this.X.r.clearFocus();
                            return false;
                        }
                    } else if (z10) {
                        jx jxVar = this.C0;
                        if (jxVar != null && jxVar.getVisibility() == 0) {
                            this.C0.R(false);
                        }
                        n4(true);
                        return false;
                    }
                } else if (z10) {
                    pxVar.setIsEditing(false);
                    U4(false);
                    return false;
                }
            } else if (z10) {
                z60Var.u();
                this.L0 = null;
                return false;
            }
        } else if (z10) {
            this.F3.a();
            jx jxVar2 = this.C0;
            if (jxVar2 != null) {
                jxVar2.S();
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onBecomeFullyHidden() {
        bi.t0 t0Var;
        px pxVar;
        if (this.V1) {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.k(true);
            }
            TLObject tLObject = this.X1;
            if (tLObject != null) {
                jx jxVar = this.C0;
                if (jxVar != null) {
                    jxVar.d0.Q(this.W1, tLObject);
                }
                this.X1 = null;
            }
            this.V1 = false;
        }
        if (!this.K && (pxVar = this.z0) != null && pxVar.getVisibility() == 0 && this.r.f) {
            int i10 = (int) (-this.N);
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            if (i10 != 0 && i10 != currentActionBarHeight && i10 >= currentActionBarHeight / 2) {
                this.e0[0].a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        if (!isInPreviewMode() && (t0Var = this.K0) != null && t0Var.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        N3();
        this.r0 = true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onBecomeFullyVisible() {
        vh.p2 p2Var;
        super.onBecomeFullyVisible();
        if (q4()) {
            SharedPreferences d12 = org.telegram.messenger.wp.d1();
            boolean z10 = d12.getBoolean("archivehint", true);
            boolean isEmpty = d4(this.currentAccount, this.R0, this.W2, false).isEmpty();
            if (z10 && isEmpty) {
                org.telegram.messenger.wp.d1().edit().putBoolean("archivehint", false).commit();
                z10 = false;
            }
            if (z10) {
                d12.edit().putBoolean("archivehint", false).commit();
                S4();
            }
        }
        if (this.r0 && !this.s0 && (p2Var = this.p0) != null && this.N3) {
            this.s0 = true;
            this.r0 = false;
            p2Var.u();
        }
        org.telegram.messenger.i0.h3(new ev(this, 20), 200L);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.z60 z60Var = this.L0;
        if (z60Var != null) {
            z60Var.u();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.x1 x1Var;
        super.onDialogDismiss(dialog);
        if (this.W2 == 0 && this.Y2 == 0 && (x1Var = this.T1) != null && dialog == x1Var && getParentActivity() != null) {
            u3(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
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
            long j10 = this.arguments.getLong("community_id", 0L);
            this.Y2 = j10;
            if (j10 != 0) {
                this.Z2 = getMessagesController().L0(Long.valueOf(this.Y2));
                this.a3 = getMessagesController().M0(this.Y2);
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
            this.U1 = org.telegram.messenger.wp.e1().getBoolean("askAboutContacts", true);
            org.telegram.messenger.uz.u();
        }
        org.telegram.messenger.at notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        this.J3 = new xa.n(notificationCenter, this);
        if (this.n2 == null) {
            this.d2 = getConnectionsManager().getConnectionState();
            this.J3.h(org.telegram.messenger.at.i4);
            if (!this.l2) {
                this.J3.h(org.telegram.messenger.at.I4);
                this.J3.h(org.telegram.messenger.at.A4);
                this.J3.e(org.telegram.messenger.at.P2);
                this.J3.e(org.telegram.messenger.at.d2);
            }
            xa.n nVar = this.J3;
            nVar.e(org.telegram.messenger.at.s);
            nVar.e(org.telegram.messenger.at.O2);
            nVar.e(org.telegram.messenger.at.r);
            nVar.e(org.telegram.messenger.at.Y);
            nVar.e(org.telegram.messenger.at.O);
            nVar.e(org.telegram.messenger.at.I2);
            nVar.e(org.telegram.messenger.at.h0);
            nVar.e(org.telegram.messenger.at.f0);
            nVar.e(org.telegram.messenger.at.J);
            nVar.e(org.telegram.messenger.at.K);
            nVar.e(org.telegram.messenger.at.M);
            nVar.e(org.telegram.messenger.at.P0);
            nVar.e(org.telegram.messenger.at.s0);
            nVar.e(org.telegram.messenger.at.q5);
            nVar.e(org.telegram.messenger.at.S0);
            nVar.e(org.telegram.messenger.at.T1);
            nVar.e(org.telegram.messenger.at.b5);
            nVar.e(org.telegram.messenger.at.K2);
            nVar.e(org.telegram.messenger.at.d0);
            nVar.e(org.telegram.messenger.at.s1);
            nVar.e(org.telegram.messenger.at.Y4);
            nVar.e(org.telegram.messenger.at.Z4);
            nVar.e(org.telegram.messenger.at.N);
            nVar.e(org.telegram.messenger.at.m5);
            nVar.e(org.telegram.messenger.at.f5);
            this.J3.h(org.telegram.messenger.at.n0);
        }
        xa.n nVar2 = this.J3;
        nVar2.e(org.telegram.messenger.at.w);
        nVar2.e(org.telegram.messenger.at.S4);
        nVar2.e(org.telegram.messenger.at.a5);
        nVar2.e(org.telegram.messenger.at.T);
        nVar2.e(org.telegram.messenger.at.L4);
        nVar2.e(org.telegram.messenger.at.t5);
        nVar2.e(org.telegram.messenger.at.v5);
        nVar2.e(org.telegram.messenger.at.Z2);
        nVar2.e(org.telegram.messenger.at.d3);
        nVar2.e(org.telegram.messenger.at.g5);
        nVar2.e(org.telegram.messenger.at.y3);
        nVar2.e(org.telegram.messenger.at.A3);
        nVar2.e(org.telegram.messenger.at.S5);
        nVar2.e(org.telegram.messenger.at.T5);
        nVar2.e(org.telegram.messenger.at.P3);
        nVar2.e(org.telegram.messenger.at.Q3);
        if (this.R0 == 0) {
            this.J3.e(org.telegram.messenger.at.z5);
            this.J3.e(org.telegram.messenger.at.P1);
        }
        u4(getAccountInstance());
        th.e5 O1 = getMessagesController().O1();
        if (!O1.A) {
            O1.W();
            if (!O1.s) {
                ConnectionsManager.getInstance(O1.a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new th.i4(O1, r3));
            }
        }
        getMessagesController().Z2(this.W2);
        if (this.Q3 != null && !getMessagesStorage().Q) {
            nu nuVar = this.Q3;
            if (nuVar.getParent() != null) {
                ((ViewGroup) nuVar.getParent()).removeView(nuVar);
            }
            this.Q3 = null;
        }
        if (q4()) {
            th.e5 O12 = getMessagesController().O1();
            if (O12.z) {
                O12.T(true);
            }
        } else {
            getMessagesController().O1().W();
        }
        getContactsController().B();
        if (getMessagesController().p6) {
            org.telegram.messenger.hw F1 = getMessagesController().F1();
            if (!F1.e) {
                F1.g(true);
            }
        }
        if (this.Y2 != 0) {
            getMessagesController().T2(0, this.Y2, true);
        }
        org.telegram.messenger.y1 a2 = org.telegram.messenger.y1.a(this.currentAccount);
        if (!a2.e) {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = a2.b;
            boolean z10 = j11 == 0;
            if (!z10) {
                long j12 = currentTimeMillis - j11;
                boolean z11 = org.telegram.messenger.v2.a;
                z10 = j12 > ((long) 43200000);
            }
            if (!z10) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(a2.b);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(currentTimeMillis);
                z10 = (calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1)) ? false : true;
            }
            if (z10) {
                a2.e = true;
                ConnectionsManager.getInstance(a2.a).sendRequest(new TL_account.getBirthdays(), new org.telegram.messenger.v1(a2, r3));
            }
        }
        this.h4 = this.W ? org.telegram.messenger.i0.L(72.0f) : 0;
        this.i4 = this.W ? org.telegram.messenger.i0.L(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        xa.n nVar = this.J3;
        if (nVar != null) {
            nVar.a();
            this.J3 = null;
        }
        nw nwVar = this.B1;
        if (nwVar != null) {
            nwVar.z0();
        }
        org.telegram.ui.Components.tp0 tp0Var = this.G2;
        if (tp0Var != null) {
            tp0Var.j();
        }
        org.telegram.ui.Components.voip.u uVar = this.H2;
        if (uVar != null) {
            org.telegram.messenger.i0.r(uVar);
            this.H2 = null;
        }
        UndoView undoView = this.y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.p3.e();
        this.C2 = null;
        int i10 = org.telegram.ui.Components.t10.i1;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onPanTranslationUpdate(float f7) {
        if (this.e0 == null) {
            return;
        }
        this.J0 = f7;
        nw nwVar = this.B1;
        int i10 = 0;
        if (nwVar == null || !nwVar.q0()) {
            while (true) {
                yx[] yxVarArr = this.e0;
                if (i10 >= yxVarArr.length) {
                    break;
                }
                yxVarArr[i10].setTranslationY(f7);
                i10++;
            }
            if (!this.l2) {
                this.actionBar.setTranslationY(f7);
                org.telegram.ui.Components.wb wbVar = this.o3;
                if (wbVar != null) {
                    wbVar.l();
                }
            }
            jx jxVar = this.C0;
            if (jxVar != null) {
                jxVar.setTranslationY(this.J0 + this.I0);
                return;
            }
            return;
        }
        this.fragmentView.setTranslationY(f7);
        while (true) {
            yx[] yxVarArr2 = this.e0;
            if (i10 >= yxVarArr2.length) {
                break;
            }
            yxVarArr2[i10].setTranslationY(0.0f);
            i10++;
        }
        if (!this.l2) {
            this.actionBar.setTranslationY(0.0f);
            org.telegram.ui.Components.wb wbVar2 = this.o3;
            if (wbVar2 != null) {
                wbVar2.l();
            }
        }
        jx jxVar2 = this.C0;
        if (jxVar2 != null) {
            jxVar2.setTranslationY(this.I0);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.wb wbVar = this.S;
        if (wbVar != null) {
            wbVar.b();
            this.S = null;
        }
        ww wwVar = this.F3;
        if (wwVar != null) {
            wwVar.r = true;
            dx dxVar = wwVar.a;
            if (dxVar != null) {
                dxVar.onPause();
            }
        }
        org.telegram.ui.Components.z60 z60Var = this.L0;
        if (z60Var != null) {
            z60Var.u();
        }
        nw nwVar = this.B1;
        if (nwVar != null) {
            nwVar.B0();
        }
        int i10 = 0;
        UndoView undoView = this.y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        setBulletinDelegate(null);
        if (this.e0 == null) {
            return;
        }
        while (true) {
            yx[] yxVarArr = this.e0;
            if (i10 >= yxVarArr.length) {
                return;
            }
            yxVarArr[i10].d.getClass();
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.messenger.i9 i9Var;
        if (i10 != 1) {
            if (i10 == 4) {
                for (int i11 : iArr) {
                    if (i11 != 0) {
                        return;
                    }
                }
                if (Build.VERSION.SDK_INT < 30 || (i9Var = FilesMigrationService.e) == null) {
                    return;
                }
                i9Var.I0();
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
                            org.telegram.messenger.pt.t(this.currentAccount).Y();
                            break;
                        } else {
                            hi0.I0();
                            break;
                        }
                    case "android.permission.WRITE_EXTERNAL_STORAGE":
                        if (iArr[i12] == 0) {
                            org.telegram.messenger.ic.D().i(null);
                            break;
                        } else {
                            break;
                        }
                    case "android.permission.READ_CONTACTS":
                        if (iArr[i12] == 0) {
                            org.telegram.messenger.i0.g3(new ev(this, 19));
                            getContactsController().l();
                            break;
                        } else {
                            SharedPreferences.Editor edit = org.telegram.messenger.wp.e1().edit();
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

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        yx yxVar;
        kw kwVar;
        org.telegram.ui.Components.an0 an0Var;
        bi.t0 t0Var;
        super.onResume();
        tw twVar = this.E0;
        if (twVar != null) {
            ArrayList arrayList = twVar.y;
            th.e5 e5Var = twVar.s;
            e5Var.l(e5Var.g);
            e5Var.l(e5Var.h);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TL_stories.PeerStories y3 = e5Var.y(((th.j) arrayList.get(i10)).c);
                if (y3 != null) {
                    e5Var.a0(y3);
                }
            }
        }
        ww wwVar = this.F3;
        if (wwVar != null) {
            wwVar.r = false;
            dx dxVar = wwVar.a;
            if (dxVar != null) {
                dxVar.onResume();
            }
        }
        int i11 = 8;
        if (!((ActionBarLayout) this.parentLayout).x() && (t0Var = this.K0) != null && t0Var.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        if (this.e0 != null) {
            int i12 = 0;
            while (true) {
                yx[] yxVarArr = this.e0;
                if (i12 >= yxVarArr.length) {
                    break;
                }
                yxVarArr[i12].d.f();
                i12++;
            }
        }
        nw nwVar = this.B1;
        if (nwVar != null) {
            nwVar.C0();
        }
        int i13 = 4;
        long j10 = 0;
        if (!this.l2 && this.W2 == 0 && this.Y2 == 0) {
            getMediaDataController().B(4);
        }
        jx jxVar = this.C0;
        if (jxVar != null && (an0Var = jxVar.d0) != null) {
            an0Var.f();
        }
        boolean z10 = this.t2 || getUserConfig().Z == null;
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z10 && this.W2 == 0 && this.Y2 == 0 && this.c2 && !this.l2) {
            int i14 = Build.VERSION.SDK_INT;
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.c2 = false;
                boolean z11 = parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0;
                boolean z12 = (i14 <= 28 || org.telegram.messenger.v2.b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0;
                boolean z13 = i14 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0;
                org.telegram.messenger.m4 m4Var = new org.telegram.messenger.m4(this, z13, z11, z12, parentActivity);
                if (this.t2 && (z11 || z13)) {
                    j10 = 4000;
                }
                org.telegram.messenger.i0.h3(m4Var, j10);
            }
        } else if (!this.l2 && this.W2 == 0 && this.Y2 == 0 && org.telegram.messenger.d6.i() && !org.telegram.messenger.d6.f()) {
            if (getParentActivity() == null) {
                return;
            }
            if (!org.telegram.messenger.wp.e1().getBoolean("askedAboutMiuiLockscreen", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                int i15 = org.telegram.ui.ActionBar.t6.L5;
                alertDialog$Builder.m(R.raw.permission_request_apk, 72, getThemedColor(i15), null);
                alertDialog$Builder.n(i15, getResourceProvider());
                String L0 = org.telegram.messenger.dd.L0(2131747314, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.T = L0;
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747316, null), new hv(this, 10));
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131751772, null), new org.telegram.ui.Components.a21(i11));
                showDialog(x1Var);
            }
        } else if (this.W2 == 0 && this.Y2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
            if (getParentActivity() == null) {
                return;
            }
            if (!org.telegram.messenger.wp.e1().getBoolean("askedAboutFSILockscreen", false)) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                int i16 = org.telegram.ui.ActionBar.t6.L5;
                alertDialog$Builder2.m(R.raw.permission_request_apk, 72, getThemedColor(i16), null);
                alertDialog$Builder2.n(i16, getResourceProvider());
                String L02 = org.telegram.messenger.dd.L0(2131747330, null);
                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                x1Var2.T = L02;
                alertDialog$Builder2.k(org.telegram.messenger.dd.L0(2131747316, null), new hv(this, 11));
                alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131751772, null), new org.telegram.ui.Components.a21(9));
                showDialog(x1Var2);
            }
        }
        V4();
        if (this.e0 != null) {
            int i17 = 0;
            while (true) {
                yx[] yxVarArr2 = this.e0;
                if (i17 >= yxVarArr2.length) {
                    break;
                }
                yx yxVar2 = yxVarArr2[i17];
                if (yxVar2.s == 0 && yxVar2.w == 2 && yxVar2.c.L0() == 0 && l4()) {
                    this.e0[i17].c.h1(1, (int) this.N);
                }
                if (i17 == 0) {
                    this.e0[i17].d.getClass();
                } else {
                    this.e0[i17].d.getClass();
                }
                i17++;
            }
        }
        X4();
        setBulletinDelegate(new z8(this, i13));
        if (this.q3) {
            org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        }
        u5(0, false);
        m5(false, true);
        t5(false);
        D3();
        N3();
        if (this.z0 == null || (yxVar = this.e0[0]) == null || (kwVar = yxVar.d) == null) {
            return;
        }
        int i18 = kwVar.h;
        if (i18 == 7 || i18 == 8) {
            org.telegram.messenger.bp bpVar = getMessagesController().M[i18 != 7 ? (char) 1 : (char) 0];
            if (bpVar != null) {
                this.z0.h(bpVar.o);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onSlideProgress(boolean z10, float f7) {
        if (org.telegram.messenger.uz.o() <= 0) {
            boolean z11 = org.telegram.messenger.v2.a;
        } else if (this.Y3 && this.Z3 == null) {
            R4(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.f1.setColor(getThemedColor(org.telegram.ui.ActionBar.t6.d6));
            y3();
            h5();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        bi.t0 t0Var;
        zx zxVar;
        ww wwVar = this.F3;
        if (wwVar == null || !wwVar.c()) {
            if (z10 && (t0Var = this.K0) != null && t0Var.getVisibility() == 0) {
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
        if (!z10 && (zxVar = this.X2) != null) {
            zxVar.removeSelfFromStack();
        }
        N3();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        ww wwVar = this.F3;
        if (wwVar == null || !wwVar.c()) {
            bi.t0 t0Var = this.K0;
            if (t0Var != null && t0Var.getVisibility() == 0) {
                if (z10) {
                    this.K0.setAlpha(1.0f - f7);
                } else {
                    this.K0.setAlpha(f7);
                }
            }
        } else {
            this.F3.getFragment().onTransitionAnimationProgress(z10, f7);
        }
        N3();
    }

    public final void p5() {
        org.telegram.ui.Components.tp0 tp0Var = this.G2;
        if (tp0Var == null) {
            return;
        }
        int i10 = this.currentAccount;
        tp0Var.h(i10);
        tp0Var.d = org.telegram.messenger.e20.i(org.telegram.messenger.c.a(i10).a).e();
        ArrayList arrayList = tp0Var.f;
        arrayList.clear();
        ArrayList arrayList2 = this.I2;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        org.telegram.ui.Components.rp0 rp0Var = tp0Var.a[0];
        if (tp0Var.b == 1) {
            ((org.telegram.ui.ActionBar.u5) rp0Var.f).l(tp0Var.c(rp0Var), false);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.Y3 = true;
            N4(true);
        } else {
            this.Z3 = null;
            this.Y3 = false;
            N4(false);
            R4(1.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean presentFragment(org.telegram.ui.ActionBar.k2 k2Var) {
        boolean presentFragment = super.presentFragment(k2Var);
        if (presentFragment && this.e0 != null) {
            int i10 = 0;
            while (true) {
                yx[] yxVarArr = this.e0;
                if (i10 >= yxVarArr.length) {
                    break;
                }
                yxVarArr[i10].d.getClass();
                i10++;
            }
        }
        vh.p2 p2Var = this.p0;
        if (p2Var != null) {
            p2Var.e(true);
        }
        vh.p2 p2Var2 = this.q0;
        if (p2Var2 != null) {
            p2Var2.e(true);
        }
        org.telegram.ui.Components.wb.e();
        return presentFragment;
    }

    public final boolean q4() {
        return this.W2 == 1;
    }

    public final void q5(boolean z10) {
        boolean z11;
        if (this.l0 == null) {
            return;
        }
        ArrayList arrayList = getDownloadController().G;
        int size = arrayList.size();
        boolean z12 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z11 = false;
                break;
            }
            Object obj = arrayList.get(i10);
            i10++;
            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) obj;
            if (kjVar.F0() != null && kjVar.F0().size >= 157286400) {
                z11 = true;
                break;
            }
        }
        ArrayList arrayList2 = getDownloadController().H;
        int size2 = arrayList2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i11);
            i11++;
            org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) obj2;
            if (kjVar2.F0() != null && kjVar2.F0().size >= 157286400) {
                z11 = true;
                break;
            }
        }
        if (!getUserConfig().q() && !getMessagesController().A3() && z11 && z10) {
            z12 = true;
        }
        this.d.a(z12, true);
    }

    public final boolean r4(long j10) {
        if (j10 < 0) {
            return false;
        }
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(j10));
        if (!org.telegram.messenger.i20.u(Z1)) {
            return false;
        }
        ArrayList l4 = org.telegram.messenger.wp.r1(this.currentAccount).r7.l(-Z1.id);
        return (l4 == null || l4.isEmpty()) && org.telegram.messenger.wp.r1(this.currentAccount).r7.e(-Z1.id);
    }

    public final void r5(TLRPC.User user, boolean z10) {
        org.telegram.ui.Components.d5 d5Var;
        tw twVar = this.E0;
        org.telegram.ui.Components.d5 d5Var2 = null;
        if (twVar != null && (d5Var = twVar.a0) != null && twVar.q0 != null) {
            Long h = org.telegram.messenger.i20.h(user);
            if (h != null) {
                boolean z11 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                d5Var.j(h.longValue(), z10);
                d5Var.m(z11, z10);
            } else {
                if (user != null) {
                    org.telegram.messenger.wp.r1(twVar.f);
                    if (org.telegram.messenger.wp.A2(user)) {
                        if (twVar.N0 == null) {
                            twVar.N0 = twVar.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                            twVar.N0 = new th.f(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), twVar.N0);
                        }
                        Drawable drawable = twVar.N0;
                        int i10 = org.telegram.ui.ActionBar.t6.ni;
                        zx zxVar = twVar.e0;
                        org.telegram.ui.ActionBar.a7.y(twVar, drawable, i10, zxVar != null ? zxVar.getResourceProvider() : null, PorterDuff.Mode.MULTIPLY);
                        d5Var.g(twVar.N0, z10);
                        d5Var.m(false, z10);
                    }
                }
                d5Var.g(null, z10);
                d5Var.m(false, z10);
            }
            d5Var.k(Integer.valueOf(twVar.f(org.telegram.ui.ActionBar.t6.ni)));
            twVar.W.invalidate();
        }
        if (this.D3 == null || this.actionBar == null) {
            return;
        }
        Long h10 = org.telegram.messenger.i20.h(user);
        this.B3 = null;
        if (h10 != null) {
            boolean z12 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
            this.D3.j(h10.longValue(), z10);
            this.D3.m(z12, z10);
            if (z12) {
                this.B3 = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
            }
            this.actionBar.setRightDrawableOnClick(new gv(this, 1));
            g31.t(this.currentAccount);
        } else {
            if (user != null) {
                org.telegram.messenger.wp.r1(this.currentAccount);
                if (org.telegram.messenger.wp.A2(user)) {
                    if (this.K3 == null) {
                        this.K3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                        this.K3 = new hx(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), this.K3);
                    }
                    Drawable drawable2 = this.K3;
                    int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.ni);
                    this.w4 = themedColor;
                    drawable2.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                    this.D3.g(this.K3, z10);
                    this.D3.m(false, z10);
                    this.actionBar.setRightDrawableOnClick(new gv(this, 2));
                    g31.t(this.currentAccount);
                }
            }
            this.D3.g(null, z10);
            this.D3.m(false, z10);
            this.actionBar.setRightDrawableOnClick(null);
        }
        org.telegram.ui.Components.d5 d5Var3 = this.D3;
        int i11 = org.telegram.ui.ActionBar.t6.ni;
        d5Var3.k(Integer.valueOf(getThemedColor(i11)));
        org.telegram.ui.Cells.n nVar = this.E3;
        if (nVar != null) {
            nVar.setColor(getThemedColor(i11));
        }
        yw ywVar = this.M0;
        if (ywVar == null || !(ywVar.getContentView() instanceof g31)) {
            return;
        }
        org.telegram.ui.ActionBar.u5 titleTextView = this.actionBar.getTitleTextView();
        g31 g31Var = (g31) this.M0.getContentView();
        if (titleTextView != null) {
            Drawable rightDrawable = titleTextView.getRightDrawable();
            org.telegram.ui.Components.d5 d5Var4 = this.D3;
            if (rightDrawable == d5Var4) {
                d5Var2 = d5Var4;
            }
        }
        g31Var.y(d5Var2, titleTextView);
    }

    public final boolean s3(long j10, View view) {
        if (this.l2 && getMessagesController().s2(j10)) {
            return false;
        }
        Long valueOf = Long.valueOf(j10);
        ArrayList arrayList = this.I2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j10));
            if (view instanceof org.telegram.ui.Cells.v2) {
                ((org.telegram.ui.Cells.v2) view).c0(false, true);
            } else if (view instanceof org.telegram.ui.Cells.k6) {
                ((org.telegram.ui.Cells.k6) view).y(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j10));
        if (view instanceof org.telegram.ui.Cells.v2) {
            ((org.telegram.ui.Cells.v2) view).c0(true, true);
        } else if (view instanceof org.telegram.ui.Cells.k6) {
            ((org.telegram.ui.Cells.k6) view).y(true, true);
        }
        return true;
    }

    public final boolean s4(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return false;
        }
        int i10 = this.e0[0].s;
        org.telegram.messenger.bp bpVar = null;
        if ((i10 == 7 || i10 == 8) && (!this.actionBar.u() || this.actionBar.w(null))) {
            bpVar = getMessagesController().M[this.e0[0].s == 8 ? (char) 1 : (char) 0];
        }
        return bpVar != null ? bpVar.j.indexOfKey(dialog.id) >= 0 : dialog.pinned;
    }

    public final void s5() {
        vh.p2 p2Var;
        boolean T4 = getMessagesController().T4();
        if (this.N3 != T4) {
            k5();
            if (!this.N3 && T4 && (p2Var = this.p0) != null) {
                p2Var.u();
            }
            this.N3 = T4;
        }
        org.telegram.ui.Components.f10 f10Var = this.t0;
        if (f10Var == null) {
            return;
        }
        if (this.R0 == 10) {
            f10Var.setImageResource(R.drawable.floating_check);
            this.t0.setContentDescription(org.telegram.messenger.dd.L0(2131751355, null));
        } else {
            f10Var.setImageResource(R.drawable.filled_fab_compose_32);
            this.t0.setContentDescription(org.telegram.messenger.dd.L0(2131748287, null));
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void setInPreviewMode(boolean z10) {
        super.setInPreviewMode(z10);
        tw twVar = this.E0;
        if (twVar != null) {
            if (!this.G0 || z10) {
                twVar.setVisibility(8);
            } else {
                twVar.setVisibility(0);
            }
        }
        l5(true);
        g5();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r2 == r3) goto L14;
     */
    @Override // org.telegram.ui.ActionBar.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        yw ywVar;
        org.telegram.ui.Components.d5 d5Var;
        super.setTitleOverlayText(str, i10, runnable);
        if (this.actionBar != null && (ywVar = this.M0) != null && (ywVar.getContentView() instanceof g31)) {
            org.telegram.ui.ActionBar.u5 titleTextView = this.actionBar.getTitleTextView();
            g31 g31Var = (g31) this.M0.getContentView();
            if (titleTextView != null) {
                Drawable rightDrawable = titleTextView.getRightDrawable();
                d5Var = this.D3;
            }
            d5Var = null;
            g31Var.y(d5Var, titleTextView);
        }
        tw twVar = this.E0;
        if (twVar != null) {
            org.telegram.ui.Components.f6 f6Var = twVar.T;
            twVar.U.c(i10 == 2131751805 ? org.telegram.messenger.i0.H2(org.telegram.messenger.dd.L0(2131744138, null), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(2.0f)) : null, true);
            if (str != null) {
                twVar.g0 = true;
                if (twVar.h0 != i10) {
                    twVar.h0 = i10;
                    f6Var.c(org.telegram.messenger.dd.L0(i10, str), !org.telegram.messenger.dd.X, true);
                }
            } else {
                twVar.g0 = false;
                twVar.h0 = 0;
                f6Var.c(twVar.f0, !org.telegram.messenger.dd.X, true);
            }
            twVar.a.a(twVar.g0, true);
            twVar.L0.w(f6Var);
        }
    }

    public final void t3(zf.e0 e0Var) {
        jx jxVar;
        if (!this.q3 || (jxVar = this.C0) == null) {
            return;
        }
        ArrayList arrayList = jxVar.C0;
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (e0Var.b((zf.e0) arrayList.get(i10))) {
                    return;
                }
            }
        }
        arrayList.add(e0Var);
        ox oxVar = this.X;
        oxVar.F.add(e0Var);
        oxVar.I = r1.size() - 1;
        oxVar.e();
        this.X.r.getText().clear();
        j5(true, null, null, false, true);
    }

    public final boolean t4() {
        return this.C2 == null && this.n2 == null;
    }

    public final void t5(boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        boolean z11;
        th.e5 j42;
        ArrayList arrayList;
        if (this.E0 == null || this.I != null) {
            return;
        }
        ww wwVar = this.F3;
        if ((wwVar != null && wwVar.c()) || this.q3 || (lVar = this.actionBar) == null || lVar.u() || this.l2) {
            return;
        }
        vh.o8 o8Var = vh.o8.F2;
        int i10 = 0;
        if ((o8Var != null && o8Var.d) || (getLastStoryViewer() != null && getLastStoryViewer().K0)) {
            z10 = false;
        }
        int i11 = 1;
        boolean z12 = !q4() && j4().I();
        if (this.Y2 != 0) {
            z11 = false;
        } else if (q4()) {
            z11 = !j4().h.isEmpty();
        } else {
            z11 = !z12 && (((arrayList = (j42 = j4()).g) != null && arrayList.size() > 0) || j42.J());
            z12 = j4().I();
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
                ofFloat.addUpdateListener(new cj(i11, this));
                this.J.addListener(new org.telegram.ui.Components.voip.i2(this, 6));
                this.J.setDuration(200L);
                this.J.setInterpolator(org.telegram.ui.Components.gr.f);
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
            this.E0.l(false, 1.0f);
        }
        if (z10 && !isInPreviewMode()) {
            this.E0.setVisibility(0);
            float f7 = -this.N;
            float f42 = z11 ? 0.0f : f4();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.I = ofFloat2;
            ofFloat2.addUpdateListener(new ix(this, f7, z11, f42));
            this.I.addListener(new cx(this, z11, i12));
            this.I.setDuration(200L);
            this.I.setInterpolator(org.telegram.ui.Components.gr.f);
            this.I.start();
            return;
        }
        this.K = z11;
        tw twVar = this.E0;
        if ((z11 || this.L) && !isInPreviewMode()) {
            i13 = 0;
        }
        twVar.setVisibility(i13);
        if (z11) {
            this.y3 = -org.telegram.messenger.i0.L(81.0f);
            O4(-f4());
        } else {
            O4(0.0f);
        }
        while (true) {
            yx[] yxVarArr = this.e0;
            if (i10 >= yxVarArr.length) {
                break;
            }
            yx yxVar = yxVarArr[i10];
            if (yxVar != null) {
                yxVar.a.requestLayout();
            }
            i10++;
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
        if (this.W2 == 0 && this.Y2 == 0 && Build.VERSION.SDK_INT >= 33 && hi0.J0(parentActivity)) {
            if (z10) {
                showDialog(new hi0(parentActivity, !w7.c6.a(), new uv(parentActivity, 1)));
                return;
            }
            arrayList.add("android.permission.POST_NOTIFICATIONS");
        }
        if (getUserConfig().U && this.U1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z10) {
                org.telegram.ui.ActionBar.x1 x1Var = org.telegram.ui.Components.s4.v(parentActivity, new kv(this, 1)).a;
                this.T1 = x1Var;
                showDialog(x1Var);
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
        } else if ((i10 <= 28 || org.telegram.messenger.v2.b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
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
    public final void u5(int i10, boolean z10) {
        RecyclerView recyclerView;
        int i11;
        int childCount;
        int i12;
        int i13 = 131072;
        if (this.S1) {
            int i14 = org.telegram.messenger.wp.D8;
            if ((i10 & 131072) == 0) {
                return;
            }
        }
        if (this.isPaused) {
            return;
        }
        int i15 = 0;
        while (i15 < 3) {
            if (i15 == 2) {
                jx jxVar = this.C0;
                recyclerView = jxVar != null ? jxVar.a0 : null;
            } else {
                yx[] yxVarArr = this.e0;
                if (yxVarArr != null) {
                    vx vxVar = i15 < yxVarArr.length ? yxVarArr[i15].a : null;
                    if (vxVar == null || yxVarArr[i15].getVisibility() == 0) {
                        r6 = vxVar != null ? this.e0[i15] : null;
                        recyclerView = vxVar;
                    }
                }
                i11 = i15;
                i15 = i11 + 1;
                i13 = 131072;
            }
            if (recyclerView != null && recyclerView.getAdapter() != null) {
                int i16 = org.telegram.messenger.wp.D8;
                if (((i10 & 2048) != 0 || i10 == 0) && r6 != null) {
                    r6.q(false);
                } else {
                    int childCount2 = recyclerView.getChildCount();
                    int i17 = 0;
                    while (i17 < childCount2) {
                        View childAt = recyclerView.getChildAt(i17);
                        boolean z11 = childAt instanceof org.telegram.ui.Cells.v2;
                        ArrayList arrayList = this.I2;
                        if (z11 && (this.C0 == null || recyclerView.getAdapter() != this.C0.d0)) {
                            org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) childAt;
                            int i18 = org.telegram.messenger.wp.D8;
                            if ((i10 & i13) != 0) {
                                v2Var.a0(this.actionBar.u(), true);
                                if (this.S1) {
                                    i11 = i15;
                                    i17++;
                                    i15 = i11;
                                    i13 = 131072;
                                }
                            }
                            if ((65536 & i10) != 0) {
                                v2Var.c0(false, (i10 & TLObject.FLAG_13) != 0);
                            } else {
                                if ((i10 & 512) == 0) {
                                    i11 = i15;
                                    if (v2Var.i0(i10, z10)) {
                                        r6.q(false);
                                        break;
                                    }
                                } else if (this.e0[i15].p() && org.telegram.messenger.i0.Q1()) {
                                    i11 = i15;
                                    v2Var.setDialogSelected(v2Var.getDialogId() == this.p2.a);
                                } else {
                                    i11 = i15;
                                }
                                if (arrayList != null) {
                                    v2Var.c0(arrayList.contains(Long.valueOf(v2Var.getDialogId())), false);
                                }
                                if (!(childAt instanceof org.telegram.ui.Cells.pa)) {
                                    ((org.telegram.ui.Cells.pa) childAt).i(i10);
                                } else if (childAt instanceof org.telegram.ui.Cells.k6) {
                                    org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) childAt;
                                    k6Var.A(i10);
                                    if (arrayList != null) {
                                        k6Var.y(arrayList.contains(Long.valueOf(k6Var.getDialogId())), false);
                                    }
                                }
                                if (!this.S1 && (childAt instanceof org.telegram.ui.Components.uk0)) {
                                    org.telegram.ui.Components.uk0 uk0Var = (org.telegram.ui.Components.uk0) childAt;
                                    childCount = uk0Var.getChildCount();
                                    for (i12 = 0; i12 < childCount; i12++) {
                                        View childAt2 = uk0Var.getChildAt(i12);
                                        if (childAt2 instanceof org.telegram.ui.Cells.q4) {
                                            ((org.telegram.ui.Cells.q4) childAt2).b(i10);
                                        }
                                    }
                                }
                                i17++;
                                i15 = i11;
                                i13 = 131072;
                            }
                        }
                        i11 = i15;
                        if (!(childAt instanceof org.telegram.ui.Cells.pa)) {
                        }
                        if (!this.S1) {
                            org.telegram.ui.Components.uk0 uk0Var2 = (org.telegram.ui.Components.uk0) childAt;
                            childCount = uk0Var2.getChildCount();
                            while (i12 < childCount) {
                            }
                        }
                        i17++;
                        i15 = i11;
                        i13 = 131072;
                    }
                }
            }
            i11 = i15;
            i15 = i11 + 1;
            i13 = 131072;
        }
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 1) {
            O3();
            Q3();
            T3();
            G3();
            R3();
            ox oxVar = this.X;
            fe.b bVar = this.b;
            oxVar.setBlurredBackgroundVisibility(bVar.e);
            float a2 = w7.n7.a(bVar.e);
            org.telegram.ui.Components.g9 g9Var = this.b3;
            if (g9Var != null) {
                g9Var.setScaleX(a2);
                this.b3.setScaleY(a2);
                this.b3.setAlpha(a2);
                this.b3.setVisibility(a2 > 0.0f ? 0 : 8);
            }
            if (this.v0 != null) {
                float T1 = org.telegram.messenger.i0.T1(0.9f, 1.0f, a2);
                this.v0.setScaleX(T1);
                this.v0.setScaleY(T1);
                this.v0.setAlpha(a2);
                this.v0.setVisibility(a2 > 0.0f ? 0 : 8);
                this.w0.setAlpha(a2);
                this.w0.setVisibility(a2 > 0.0f ? 0 : 8);
                return;
            }
            return;
        }
        if (i10 == 2) {
            O3();
            Q3();
            return;
        }
        if (i10 == 3) {
            M3();
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
            L3();
            return;
        }
        if (i10 == 6) {
            O3();
            Q3();
        } else {
            if (i10 == 7) {
                H3();
                return;
            }
            if (i10 == 8) {
                G3();
                R3();
            } else if (i10 == 9) {
                R3();
            }
        }
    }

    public final void v3(CharSequence charSequence) {
        if (this.B1 == null) {
            return;
        }
        if (this.D2 == null && this.E2 == null && this.F2 == null) {
            return;
        }
        int i10 = 0;
        if (this.G2 == null) {
            org.telegram.ui.Components.tp0 tp0Var = new org.telegram.ui.Components.tp0(getParentActivity(), getResourceProvider());
            this.G2 = tp0Var;
            tp0Var.setLayoutClickListener(new gv(this, i10));
            this.G2.setOnModeChangeListener(new hv(this, i10));
            nw nwVar = this.B1;
            org.telegram.ui.Components.tp0 tp0Var2 = this.G2;
            if (tp0Var2 == null) {
                nwVar.getClass();
            } else {
                nwVar.G1 = tp0Var2;
                nwVar.addView(tp0Var2, 0, w7.b6.e(-1, 48, 51));
                nwVar.g3 = false;
                nwVar.I();
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
                org.telegram.ui.Components.tp0 tp0Var3 = this.G2;
                tp0Var3.g(this.currentAccount);
                if (!str.isEmpty()) {
                    tp0Var3.e(str, true);
                }
            } else {
                CharSequence charSequence2 = this.F2;
                if (charSequence2 != null) {
                    org.telegram.ui.Components.tp0 tp0Var4 = this.G2;
                    tp0Var4.g(this.currentAccount);
                    if (charSequence2.length() > 0) {
                        tp0Var4.e(charSequence2, true);
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.B1.setFieldText(charSequence);
        }
        this.B1.setOverrideHint(org.telegram.messenger.dd.L0(m4() ? 2131754454 : 2131745480, null));
        H3();
        if (this.G2.getMode() != 0) {
            this.B1.v1(false, false);
        }
        p5();
    }

    public final void v4(long j10) {
        long j11 = j10;
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().Q.f(j11);
        int i10 = 0;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            ArrayList arrayList = (ArrayList) getMessagesController().x.f(dialog.community_id);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                v4(((TLRPC.Dialog) obj).id);
            }
            return;
        }
        int i11 = this.e0[0].s;
        org.telegram.messenger.bp bpVar = null;
        if ((i11 == 7 || i11 == 8) && (!this.actionBar.u() || this.actionBar.w(null))) {
            bpVar = getMessagesController().M[this.e0[0].s == 8 ? (char) 1 : (char) 0];
        }
        int i12 = -1;
        if (bpVar != null) {
            int i13 = bpVar.g;
            int i14 = org.telegram.messenger.wp.D8;
            if ((i13 & 64) != 0 && !bpVar.a(this.currentAccount, dialog)) {
                M4(true, true);
                z3();
                if (this.R1 != null) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= this.R1.size()) {
                            break;
                        }
                        if (((TLRPC.Dialog) this.R1.get(i15)).id == j11) {
                            i12 = i15;
                            break;
                        }
                        i15++;
                    }
                    if (i12 < 0) {
                        M4(false, false);
                    }
                }
            }
        }
        int i16 = i12;
        if (getMessagesController().s2(j11) || getMessagesController().y2(j11)) {
            org.telegram.messenger.wp messagesController = getMessagesController();
            org.telegram.messenger.is messagesStorage = messagesController.getMessagesStorage();
            org.telegram.messenger.wl wlVar = new org.telegram.messenger.wl(messagesController, j11);
            org.telegram.messenger.r5 r5Var = messagesStorage.a;
            org.telegram.messenger.d4 d4Var = new org.telegram.messenger.d4(messagesStorage, j11, wlVar, 5);
            j11 = j11;
            r5Var.c(d4Var);
        }
        getMessagesController().l3(j11, 0L);
        org.telegram.messenger.wp messagesController2 = getMessagesController();
        int i17 = dialog.top_message;
        messagesController2.h3(j11, i17, i17, dialog.last_message_date, false, 0L, 0, true, 0);
        if (i16 >= 0) {
            this.R1.remove(i16);
            this.e0[0].y.D();
            this.e0[0].q(true);
        }
    }

    public final boolean v5(long j10) {
        TLRPC.Chat L0;
        nw nwVar;
        if ((this.S0 <= 1 && ((nwVar = this.B1) == null || nwVar.getVisibility() != 0 || TextUtils.isEmpty(this.B1.getFieldText()))) || !org.telegram.messenger.o5.z(j10) || (L0 = getMessagesController().L0(Long.valueOf(-j10))) == null || org.telegram.messenger.w3.N(L0) || !L0.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.s4.t0(this, org.telegram.messenger.dd.L0(2131745328, null), org.telegram.messenger.dd.L0(2131745320, null), null);
        return false;
    }

    @Override // org.telegram.ui.nf0
    public final void w() {
        J4(true, true);
    }

    public final int w3() {
        if (this.B1 != null) {
            return (int) (this.y1.getInputBubbleHeight() + this.w.d() + org.telegram.messenger.i0.L(9.0f) + org.telegram.messenger.i0.L(7.0f) + org.telegram.messenger.i0.L(2.0f));
        }
        if (this.Y2 == 0) {
            return this.f4 + this.h4;
        }
        return org.telegram.messenger.i0.L(72.0f) + this.f4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r1.booleanValue() == (org.telegram.messenger.w3.K(r6, false) != null)) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean w4(TLRPC.Chat chat, TLRPC.User user) {
        Boolean bool;
        Boolean bool2;
        if (chat != null) {
            boolean V = org.telegram.messenger.w3.V(chat);
            TLRPC.RequestPeerType requestPeerType = this.G;
            if (V == (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) && (((bool = requestPeerType.creator) == null || !bool.booleanValue() || chat.creator) && ((bool2 = this.G.bot_participant) == null || !bool2.booleanValue() || getMessagesController().w2(chat, user) || org.telegram.messenger.w3.b(chat)))) {
                Boolean bool3 = this.G.has_username;
                if (bool3 != null) {
                }
                Boolean bool4 = this.G.forum;
                if ((bool4 == null || bool4.booleanValue() == org.telegram.messenger.w3.c0(chat)) && ((this.G.user_admin_rights == null || getMessagesController().r3(chat, getUserConfig().f(), this.G.user_admin_rights)) && (this.G.bot_admin_rights == null || getMessagesController().r3(chat, user, this.G.bot_admin_rights) || org.telegram.messenger.w3.w(4, chat)))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean x3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.I2;
            if (i10 >= arrayList.size()) {
                return true;
            }
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-((Long) arrayList.get(i10)).longValue()));
            if (L0 != null && !org.telegram.messenger.w3.l(L0)) {
                return false;
            }
            i10++;
        }
    }

    public final boolean x4(TLRPC.User user) {
        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) this.G;
        if (user == null || org.telegram.messenger.i20.z(user) || org.telegram.messenger.i20.x(user)) {
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
        org.telegram.ui.Components.cg0 cg0Var;
        jw jwVar;
        org.telegram.ui.Components.an0 an0Var;
        u71 u71Var;
        jx jxVar = this.C0;
        if (jxVar != null && (an0Var = jxVar.d0) != null && (u71Var = an0Var.k0) != null) {
            int childCount = u71Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = u71Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q4) {
                    org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) childAt;
                    org.telegram.ui.Components.r8 r8Var = q4Var.c;
                    int i11 = q4Var.h;
                    if (org.telegram.messenger.o5.E(q4Var.f)) {
                        TLRPC.User Z1 = org.telegram.messenger.wp.r1(i11).Z1(Long.valueOf(q4Var.f));
                        q4Var.e = Z1;
                        r8Var.r(Z1);
                    } else {
                        r8Var.q(org.telegram.messenger.wp.r1(i11).L0(Long.valueOf(-q4Var.f)));
                        q4Var.e = null;
                    }
                    q4Var.c(true);
                }
            }
        }
        if (this.e0 != null) {
            int i12 = 0;
            while (true) {
                yx[] yxVarArr = this.e0;
                if (i12 >= yxVarArr.length) {
                    break;
                }
                yx yxVar = yxVarArr[i12];
                if (yxVar != null && (jwVar = yxVar.n) != null) {
                    jwVar.i();
                }
                i12++;
            }
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.F(getThemedColor(org.telegram.ui.ActionBar.t6.G8), true);
            this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.t6.E8), false, true);
            this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.t6.F8), true, true);
            this.actionBar.H(getThemedColor(org.telegram.ui.ActionBar.t6.I5), true);
            this.actionBar.updateColors();
        }
        if (this.D3 != null) {
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.t6.ni);
            Drawable drawable = this.K3;
            if (drawable != null && themedColor2 != this.w4) {
                this.w4 = themedColor2;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.Components.d5 d5Var = this.D3;
            if (d5Var != null) {
                d5Var.k(Integer.valueOf(themedColor2));
            }
            org.telegram.ui.Cells.n nVar = this.E3;
            if (nVar != null) {
                nVar.setColor(themedColor2);
            }
        }
        org.telegram.ui.Cells.d3 d3Var = this.M1;
        if (d3Var != null) {
            org.telegram.ui.ActionBar.t6.H1(d3Var.getBackground(), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.i6, false), true);
        }
        org.telegram.ui.ActionBar.t0 t0Var = this.m0;
        if (t0Var != null) {
            t0Var.setIconColor(getThemedColor(org.telegram.ui.ActionBar.t6.v8));
        }
        nw nwVar = this.B1;
        if (nwVar != null) {
            nwVar.updateColors();
        }
        px pxVar = this.z0;
        if (pxVar != null) {
            vg.f fVar = pxVar.y0;
            if (fVar != null) {
                fVar.updateColors();
            }
            pxVar.invalidate();
        }
        zf.g0 g0Var = this.b0;
        if (g0Var != null) {
            g0Var.updateColors();
        }
        jx jxVar2 = this.C0;
        if (jxVar2 != null && (cg0Var = jxVar2.r0) != null) {
            cg0Var.c();
        }
        org.telegram.ui.Components.w71 w71Var = this.a0;
        if (w71Var != null) {
            w71Var.updateColors();
        }
        q01 q01Var = this.Z;
        if (q01Var != null) {
            q01Var.updateColors();
        }
        if (this.K0 != null) {
            int o10 = i0.b.o(getThemedColor(org.telegram.ui.ActionBar.t6.d6), 100);
            if (!(this.K0.getForeground() instanceof ColorDrawable)) {
                this.K0.setForeground(new ColorDrawable(o10));
            } else if (((ColorDrawable) this.K0.getForeground()).getColor() != o10) {
                ((ColorDrawable) this.K0.getForeground()).setColor(o10);
            }
        }
        org.telegram.ui.Components.f10 f10Var = this.t0;
        if (f10Var != null) {
            f10Var.updateColors();
        }
        org.telegram.ui.Components.f10 f10Var2 = this.u0;
        if (f10Var2 != null) {
            f10Var2.updateColors();
        }
        int i13 = org.telegram.ui.ActionBar.t6.d6;
        this.m4.a(getThemedColor(i13));
        org.telegram.ui.Components.zr zrVar = this.J1;
        if (zrVar != null) {
            zrVar.updateColors();
        }
        org.telegram.ui.Components.yr yrVar = this.K1;
        if (yrVar != null) {
            yrVar.setColor(org.telegram.ui.ActionBar.t6.x0(null, i13, false));
        }
        lw lwVar = this.H1;
        if (lwVar != null) {
            lwVar.updateColors();
        }
        lw lwVar2 = this.F1;
        if (lwVar2 != null) {
            lwVar2.updateColors();
        }
        n5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        tw twVar = this.E0;
        if (twVar != null) {
            twVar.o();
        }
        if (this.C3 != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.Ul)) != this.v4) {
            this.v4 = themedColor;
            this.C3.setColorFilter(themedColor, PorterDuff.Mode.MULTIPLY);
        }
        ox oxVar = this.X;
        if (oxVar != null) {
            oxVar.updateColors();
        }
    }

    public final void y4(View view) {
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        int i10 = 1;
        org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.a30.h(getParentActivity(), false, 1, null);
        boolean z10 = getMessagesStorage().L != 0;
        int[] iArr = {z10 ? R.drawable.msg_markread : 0, org.telegram.messenger.uz.q1 ? R.drawable.chats_pin : R.drawable.chats_unpin};
        CharSequence[] charSequenceArr = {z10 ? org.telegram.messenger.dd.L0(2131748697, null) : null, org.telegram.messenger.dd.L0(org.telegram.messenger.uz.q1 ? 2131747262 : 2131749333, null)};
        l4 l4Var = new l4(this, i10);
        h.L = charSequenceArr;
        h.M = iArr;
        h.K = l4Var;
        showDialog(h);
    }

    public final void z3() {
        org.telegram.messenger.i0.h3(new dw(this, 0), 300L);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z4(View view, int i10, s4.g0 g0Var) {
        s4.g0 g0Var2;
        long j10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        org.telegram.messenger.kj kjVar;
        long j11;
        long j12;
        org.telegram.ui.Components.an0 an0Var;
        ww wwVar;
        long j13;
        long j14;
        int i14;
        org.telegram.messenger.kj kjVar2;
        long F;
        long j15;
        long j16;
        TLRPC.Chat L0;
        boolean z11;
        jx jxVar;
        int i15;
        Object J;
        long j17;
        long j18;
        int i16;
        if (getParentActivity() == null) {
            return;
        }
        boolean z12 = g0Var instanceof zf.m;
        if (z12) {
            zf.m mVar = (zf.m) g0Var;
            int i17 = mVar.h;
            if (i17 == 7 || i17 == 8) {
                org.telegram.messenger.bp bpVar = getMessagesController().M[i17 == 7 ? (char) 0 : (char) 1];
                if (bpVar != null) {
                    i15 = bpVar.a;
                    J = mVar.J(i10);
                    if (this.C2 == null && mVar.n && g0Var.d(i10) == 21) {
                        this.C2.O(this);
                        return;
                    }
                    if (J instanceof TLRPC.User) {
                        if (J instanceof TLRPC.Chat) {
                            j18 = ((TLRPC.Chat) J).id;
                        } else if (J instanceof TLRPC.Dialog) {
                            TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                            i16 = dialog.folder_id;
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                if (this.actionBar.w(null)) {
                                    return;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putInt("folderId", ((TLRPC.TL_dialogFolder) dialog).folder.id);
                                presentFragment(new zx(bundle));
                                return;
                            }
                            j17 = dialog.id;
                            if (this.actionBar.w(null)) {
                                Y4(j17, view);
                                return;
                            }
                            g0Var2 = g0Var;
                            i11 = i16;
                            z10 = false;
                            i12 = 0;
                            kjVar = null;
                            i13 = i15;
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
                                    showDialog(new org.telegram.ui.Components.dx0(getParentActivity(), this, tL_inputStickerSetID, null, null, null));
                                    return;
                                }
                                return;
                            }
                            TLRPC.TL_recentMeUrlChatInvite tL_recentMeUrlChatInvite = (TLRPC.TL_recentMeUrlChatInvite) J;
                            g0Var2 = g0Var;
                            TLRPC.ChatInvite chatInvite = tL_recentMeUrlChatInvite.chat_invite;
                            TLRPC.Chat chat = chatInvite.chat;
                            if ((chat == null && (!chatInvite.channel || chatInvite.megagroup)) || (chat != null && (!org.telegram.messenger.w3.T(chat) || chatInvite.chat.megagroup))) {
                                String str = tL_recentMeUrlChatInvite.url;
                                int indexOf = str.indexOf(47);
                                if (indexOf > 0) {
                                    str = str.substring(indexOf + 1);
                                }
                                showDialog(new org.telegram.ui.Components.u70(getParentActivity(), chatInvite, str, this, null));
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
                            kjVar = null;
                            i13 = i15;
                            j12 = j17;
                            j11 = 0;
                            j10 = 0;
                        }
                        j17 = -j18;
                    } else {
                        j17 = ((TLRPC.User) J).id;
                    }
                    g0Var2 = g0Var;
                    i16 = 0;
                    i11 = i16;
                    z10 = false;
                    i12 = 0;
                    kjVar = null;
                    i13 = i15;
                    j12 = j17;
                    j11 = 0;
                    j10 = 0;
                }
            }
            i15 = 0;
            J = mVar.J(i10);
            if (this.C2 == null) {
            }
            if (J instanceof TLRPC.User) {
            }
            g0Var2 = g0Var;
            i16 = 0;
            i11 = i16;
            z10 = false;
            i12 = 0;
            kjVar = null;
            i13 = i15;
            j12 = j17;
            j11 = 0;
            j10 = 0;
        } else {
            g0Var2 = g0Var;
            jx jxVar2 = this.C0;
            if (jxVar2 == null || g0Var2 != (an0Var = jxVar2.d0)) {
                j10 = 0;
                z10 = false;
                i11 = 0;
                i12 = 0;
                i13 = 0;
                kjVar = null;
                j11 = 0;
                j12 = 0;
            } else {
                Object I = an0Var.I(i10);
                z10 = this.C0.d0.N(i10);
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
                    F = org.telegram.messenger.o5.F(encryptedChat.id);
                    if (!this.l2) {
                        this.W1 = F;
                        this.X1 = encryptedChat;
                    }
                } else {
                    if (I instanceof org.telegram.messenger.kj) {
                        kjVar2 = (org.telegram.messenger.kj) I;
                        long B0 = org.telegram.messenger.kj.B0(kjVar2.k);
                        int f12 = kjVar2.f1();
                        j10 = 0;
                        j14 = org.telegram.messenger.w3.c0(getMessagesController().L0(Long.valueOf(-B0))) ? org.telegram.messenger.kj.c2(kjVar2.I1, kjVar2.k, true, false) : 0L;
                        jx jxVar3 = this.C0;
                        if (jxVar3 != null) {
                            org.telegram.ui.Components.an0 an0Var2 = jxVar3.d0;
                            an0Var2.j0.a(an0Var2.Z);
                        }
                        i14 = f12;
                        j13 = B0;
                    } else {
                        j10 = 0;
                        if (I instanceof String) {
                            String str2 = (String) I;
                            jx jxVar4 = this.C0;
                            if (jxVar4 != null && !jxVar4.d0.J.isEmpty()) {
                                this.X.r.setText(str2);
                                this.X.r.setSelection(str2.length());
                            } else if (!str2.equals("section")) {
                                ei0 ei0Var = new ei0(getParentActivity(), this);
                                ei0Var.N0(str2, true);
                                ei0Var.show();
                            }
                        } else if (I instanceof org.telegram.messenger.f5) {
                            org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) I;
                            org.telegram.ui.Components.s4.u(this, f5Var.i, f5Var.j, (String) f5Var.e.get(0));
                        } else if ((I instanceof TLRPC.TL_forumTopic) && (wwVar = this.F3) != null && (wwVar.getFragment() instanceof nb1)) {
                            j13 = -((nb1) this.F3.getFragment()).a;
                            j14 = ((TLRPC.TL_forumTopic) I).id;
                            i14 = 0;
                            kjVar2 = null;
                        }
                        i14 = 0;
                        kjVar2 = null;
                        j14 = 0;
                        j13 = 0;
                    }
                    if (j13 == j10 && this.actionBar.u()) {
                        if (this.actionBar.w("search_dialogs_action_mode") && i14 == 0 && !z10) {
                            Y4(j13, view);
                            return;
                        }
                        return;
                    }
                    j12 = j13;
                    j11 = j14;
                    i13 = 0;
                    i12 = i14;
                    kjVar = kjVar2;
                    i11 = 0;
                }
                i14 = 0;
                kjVar2 = null;
                j13 = F;
                j14 = 0;
                j10 = 0;
                if (j13 == j10) {
                }
                j12 = j13;
                j11 = j14;
                i13 = 0;
                i12 = i14;
                kjVar = kjVar2;
                i11 = 0;
            }
        }
        if (j12 == j10) {
            return;
        }
        if (this.l2) {
            if (v5(j12)) {
                if ((!getMessagesController().s2(j12) && !getMessagesController().o2(j12)) || r4(j12)) {
                    ArrayList arrayList = this.I2;
                    if (!arrayList.isEmpty() || (this.R0 == 3 && this.f2 != null)) {
                        if (arrayList.contains(Long.valueOf(j12)) || A3(j12)) {
                            boolean s32 = s3(j12, view);
                            jx jxVar5 = this.C0;
                            if (jxVar5 != null && g0Var2 == jxVar5.d0) {
                                this.actionBar.k(true);
                                b4(j12, s32);
                            }
                            o5();
                            return;
                        }
                        return;
                    }
                }
                if (this.m2 && getMessagesController().o2(j12)) {
                    Bundle bundle2 = new Bundle(this.arguments);
                    bundle2.putLong("community_id", -j12);
                    zx zxVar = new zx(bundle2);
                    zxVar.X2 = this;
                    zxVar.C2 = this.C2;
                    presentFragment(zxVar);
                    return;
                }
                if (!this.m2 || ((!getMessagesController().s2(j12) || r4(j12)) && !getMessagesController().y2(j12))) {
                    a4(j12, 0L, true, null);
                    return;
                }
                Bundle bundle3 = new Bundle();
                bundle3.putLong("chat_id", -j12);
                bundle3.putBoolean("for_select", true);
                bundle3.putBoolean("forward_to", true);
                bundle3.putBoolean("bot_share_to", this.R0 == 1);
                bundle3.putBoolean("quote", this.O0);
                bundle3.putBoolean("reply_to", this.N0);
                nb1 nb1Var = new nb1(bundle3);
                nb1Var.L0 = this;
                presentFragment(nb1Var);
                return;
            }
            return;
        }
        Bundle bundle4 = new Bundle();
        if (org.telegram.messenger.o5.C(j12)) {
            j15 = j11;
            bundle4.putInt("enc_id", (int) (j12 & 4294967295L));
        } else {
            j15 = j11;
            if (org.telegram.messenger.o5.E(j12)) {
                bundle4.putLong("user_id", j12);
            } else {
                if (i12 == 0 || (L0 = getMessagesController().L0(Long.valueOf(-j12))) == null || L0.migrated_to == null) {
                    j16 = j12;
                } else {
                    bundle4.putLong("migrated_to", j12);
                    j16 = -L0.migrated_to.channel_id;
                }
                bundle4.putLong("chat_id", -j16);
            }
        }
        if (i12 != 0) {
            bundle4.putInt("message_id", i12);
        } else if (z10) {
            TLObject tLObject = this.X1;
            if (tLObject != null) {
                jx jxVar6 = this.C0;
                if (jxVar6 != null) {
                    jxVar6.d0.Q(this.W1, tLObject);
                }
                this.X1 = null;
            }
        } else {
            V3();
        }
        boolean z13 = (org.telegram.messenger.dd.X || this.j2 || (org.telegram.messenger.i0.Q1() && i11 != 0) || !org.telegram.messenger.tc.e(64) || this.Y2 != j10) ? false : true;
        bundle4.putInt("dialog_folder_id", i11);
        bundle4.putInt("dialog_filter_id", i13);
        if (org.telegram.messenger.i0.Q1() && ((!getMessagesController().s2(j12) || !z13) && this.p2.a == j12 && ((jxVar = this.C0) == null || g0Var2 != jxVar.d0))) {
            if (getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) getParentActivity();
                List fragmentStack = launchActivity.s0.getFragmentStack();
                if (fragmentStack.isEmpty()) {
                    return;
                }
                if (fragmentStack.size() == 1 && (sc.e.g(1, fragmentStack) instanceof un)) {
                    ((un) sc.e.g(1, fragmentStack)).pa();
                    return;
                }
                if (fragmentStack.size() == 2) {
                    launchActivity.s0.l(true, false);
                    return;
                } else {
                    if (getParentActivity() instanceof LaunchActivity) {
                        org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) fragmentStack.get(0);
                        fragmentStack.clear();
                        fragmentStack.add(k2Var);
                        launchActivity.s0.W(true, true);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        jx jxVar7 = this.C0;
        if (jxVar7 != null && jxVar7.A0) {
            jxVar7.R(false);
        }
        if (j12 == getUserConfig().e() && getMessagesController().p6) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("dialog_id", org.telegram.messenger.e20.i(this.currentAccount).e());
            bundle5.putInt(TeXSymbolParser.TYPE_ATTR, 0);
            bundle5.putInt("start_from", 11);
            if (this.D0 == null) {
                this.D0 = new org.telegram.ui.Components.st0(this);
            }
            presentFragment(new org.telegram.ui.Components.n90(bundle5, this.D0));
            return;
        }
        if (this.n2 != null) {
            if (getMessagesController().E(bundle4, this, null, null)) {
                getNotificationCenter().k(org.telegram.messenger.at.t, new Object[0]);
                un unVar = new un(bundle4);
                p4(unVar, kjVar);
                presentFragment(unVar);
                return;
            }
            return;
        }
        this.z3 = true;
        if (getMessagesController().E(bundle4, this, null, null)) {
            TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(-j12));
            TLRPC.Dialog R0 = getMessagesController().R0(j12);
            boolean V = org.telegram.messenger.w3.V(L02);
            boolean z14 = R0 != null && R0.view_forum_as_messages;
            int b10 = (this.Y2 == j10 || L02 == null) ? 0 : yh.e0.b(this.currentAccount, -L02.id);
            if (b10 == 3) {
                showDialog(new org.telegram.ui.Components.u70(getParentActivity(), L02, null, this, this.resourceProvider));
                return;
            }
            int i18 = 4;
            if (b10 == 4) {
                org.telegram.messenger.m5.n(null, V ? 2131751930 : 2131751927, org.telegram.ui.Components.cc.a0(this), R.raw.e_hand_2, 36);
                return;
            }
            if (L02 == null || !(((z11 = L02.monoforum) || L02.forum) && j15 == j10)) {
                if (org.telegram.messenger.w3.Y(L02)) {
                    Bundle bundle6 = new Bundle();
                    bundle6.putLong("community_id", L02.id);
                    presentFragment(new zx(bundle6));
                    return;
                }
                un unVar2 = new un(bundle4);
                if (j15 != j10) {
                    gg.e.a(unVar2, org.telegram.messenger.hs.a(j12, j15));
                }
                if (z12 && org.telegram.messenger.o5.E(j12) && getMessagesController().Q.f(j12) == null) {
                    org.telegram.messenger.vi mediaDataController = getMediaDataController();
                    TLRPC.Document document = mediaDataController.y0;
                    mediaDataController.n1();
                    if (document != null) {
                        unVar2.U9 = document;
                        unVar2.V9 = true;
                    }
                }
                if (org.telegram.messenger.i0.Q1()) {
                    ww wwVar2 = this.F3;
                    if (wwVar2.a != null) {
                        wwVar2.a();
                    }
                }
                p4(unVar2, kjVar);
                presentFragment(unVar2);
                return;
            }
            if (z11) {
                bundle4.putInt("chatMode", 8);
                bundle4.putBoolean("isSubscriberSuggestions", !org.telegram.messenger.w3.A(this.currentAccount, L02, 24));
                un unVar3 = new un(bundle4);
                p4(unVar3, kjVar);
                presentFragment(unVar3);
                return;
            }
            if (org.telegram.messenger.w3.a(L02)) {
                un unVar4 = new un(bundle4);
                gg.e.a(unVar4, org.telegram.messenger.hs.a(-L02.id, getMessagesController().f7.getLong(a1.g.l(L02.id, "forumlasttopic"), 1L)));
                presentFragment(unVar4);
                return;
            }
            if (!org.telegram.messenger.tc.e(64) || this.Y2 != j10) {
                if (!z14) {
                    presentFragment(new nb1(bundle4));
                    return;
                }
                un unVar5 = new un(bundle4);
                p4(unVar5, kjVar);
                presentFragment(unVar5);
                return;
            }
            if (!z13) {
                if (!z14) {
                    presentFragment(new nb1(bundle4));
                    return;
                }
                un unVar6 = new un(bundle4);
                p4(unVar6, kjVar);
                presentFragment(unVar6);
                return;
            }
            if (this.j2) {
                return;
            }
            if (z14) {
                un unVar7 = new un(bundle4);
                p4(unVar7, kjVar);
                presentFragment(unVar7);
                return;
            }
            ww wwVar3 = this.F3;
            dx dxVar = wwVar3.a;
            if (dxVar == null || (-dxVar.a) != j12) {
                vx vxVar = this.e0[0].a;
                vxVar.v3 = 0.0f;
                vxVar.w3 = vxVar.u3;
                vxVar.x3 = vxVar.o3 != 0.0f;
                dx dxVar2 = new dx(bundle4);
                dxVar2.M0 = this;
                final ww wwVar4 = this.F3;
                org.telegram.ui.ActionBar.z4 parentLayout = getParentLayout();
                e2.f fVar = wwVar4.n;
                if (!wwVar4.r) {
                    wwVar4.x = parentLayout;
                    dxVar2.onFragmentCreate();
                    dxVar2.setInPreviewMode(true);
                    dxVar2.setParentLayout(parentLayout);
                    View performCreateView = dxVar2.performCreateView(wwVar4.getContext());
                    dxVar2.onResume();
                    wwVar4.b = performCreateView;
                    wwVar4.addView(performCreateView);
                    final dx dxVar3 = wwVar4.a;
                    l0 l0Var = dxVar2.e;
                    wwVar4.c = l0Var;
                    wwVar4.addView(l0Var);
                    wwVar4.a = dxVar2;
                    k01.Q = j10;
                    k01.Q = -dxVar2.a;
                    if (dxVar2.getActionBar() != null) {
                        org.telegram.ui.ActionBar.l actionBar = dxVar2.getActionBar();
                        wwVar4.d = actionBar;
                        wwVar4.addView(actionBar);
                        wwVar4.d.e1 = new vv0(wwVar4, 12);
                    }
                    if (dxVar3 != null) {
                        final dx dxVar4 = wwVar4.a;
                        if (org.telegram.messenger.uz.c()) {
                            o1.j jVar = wwVar4.y;
                            if (jVar != null) {
                                jVar.d();
                            }
                            dxVar4.onTransitionAnimationStart(true, false);
                            wwVar4.E = dxVar3;
                            wwVar4.w = true;
                            fVar.d();
                            o1.j jVar2 = new o1.j(new o1.i(0.0f));
                            wwVar4.y = jVar2;
                            jVar2.m = org.telegram.ui.Cells.f1.p(1000.0f, 400.0f, 1.0f);
                            k01.f(dxVar3, dxVar4, 0.0f);
                            wwVar4.y.b(new ic0(wwVar4, i18));
                            wwVar4.y.a(new o1.f() { // from class: org.telegram.ui.i01
                                @Override // o1.f
                                public final void a(o1.j jVar3, boolean z15, float f7, float f10) {
                                    k01 k01Var = wwVar4;
                                    if (k01Var.y == null) {
                                        return;
                                    }
                                    k01Var.y = null;
                                    org.telegram.ui.ActionBar.k2 k2Var2 = dxVar4;
                                    k2Var2.onTransitionAnimationEnd(true, false);
                                    org.telegram.ui.ActionBar.k2 k2Var3 = dxVar3;
                                    k01.f(k2Var3, k2Var2, 1.0f);
                                    k01Var.w = false;
                                    k01Var.E = null;
                                    k2Var3.onPause();
                                    k2Var3.onFragmentDestroy();
                                    k01Var.removeView(k2Var3.getFragmentView());
                                    k01Var.removeView(k2Var3.getActionBar());
                                    k01Var.n.e();
                                }
                            });
                            wwVar4.y.h();
                        } else {
                            dxVar4.onTransitionAnimationStart(true, false);
                            dxVar4.onTransitionAnimationEnd(true, false);
                            k01.f(dxVar3, dxVar4, 1.0f);
                            wwVar4.w = false;
                            wwVar4.E = null;
                            dxVar3.onPause();
                            dxVar3.onFragmentDestroy();
                            wwVar4.removeView(dxVar3.getFragmentView());
                            wwVar4.removeView(dxVar3.getActionBar());
                            fVar.e();
                        }
                    } else if (!wwVar4.f) {
                        wwVar4.f = true;
                        if (org.telegram.messenger.uz.c()) {
                            fVar.d();
                            wwVar4.h = ValueAnimator.ofFloat(0.0f, 1.0f);
                            wwVar4.e = 0.0f;
                            wwVar4.e(true);
                            wwVar4.g();
                            dxVar2.onTransitionAnimationStart(true, false);
                            wwVar4.h.addUpdateListener(new h01(wwVar4, 1));
                            wwVar4.h.addListener(new org.telegram.ui.Components.jw0(8, (Object) wwVar4, (Object) dxVar2));
                            wwVar4.h.setDuration(250L);
                            wwVar4.h.setInterpolator(org.telegram.ui.Components.gr.f);
                            wwVar4.h.setStartDelay(org.telegram.messenger.uz.o() >= 2 ? 50L : 150L);
                            wwVar4.h.start();
                        } else {
                            wwVar4.e(true);
                            dxVar2.onTransitionAnimationStart(true, false);
                            dxVar2.onTransitionAnimationEnd(true, false);
                            wwVar4.e = 1.0f;
                            wwVar4.g();
                            wwVar4.d(false);
                        }
                    }
                    dxVar2.setPreviewDelegate(new rj0(wwVar4, 16));
                    WeakHashMap weakHashMap = r0.h0.a;
                    r0.x.c(wwVar4);
                }
            } else {
                wwVar3.a();
            }
            jx jxVar8 = this.C0;
            if (jxVar8 != null) {
                jxVar8.S();
            }
        }
    }
}
