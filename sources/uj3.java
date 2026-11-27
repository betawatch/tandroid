// default package

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
import android.os.SystemClock;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.LongSparseArray;
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
import java.util.LinkedHashMap;
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
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class uj3 extends e implements fn7, el4, s84, ej6 {
    public static boolean E4;
    public static final boolean[] F4 = new boolean[4];
    public static final yf3 G4 = new yf3((byte) 1);
    public static float H4;
    public ij3 A0;
    public z92 A1;
    public boolean A2;
    public float A3;
    public final RectF A4;
    public boolean B0;
    public FrameLayout B1;
    public boolean B2;
    public boolean B3;
    public final RectF B4;
    public int C0;
    public FrameLayout C1;
    public boolean C2;
    public boolean C3;
    public int C4;
    public bj3 D0;
    public bi3 D1;
    public boolean D2;
    public Long D3;
    public int D4;
    public boolean E;
    public wia E0;
    public di3 E1;
    public oj3 E2;
    public Drawable E3;
    public boolean F;
    public ii3 F0;
    public s7 F1;
    public ArrayList F2;
    public ul F3;
    public boolean G;
    public vj3 G0;
    public final TextPaint G1;
    public String G2;
    public zm G3;
    public TLRPC.RequestPeerType H;
    public boolean H0;
    public zh3 H1;
    public CharSequence H2;
    public li3 H3;
    public long I;
    public float I0;
    public FrameLayout I1;
    public sea I2;
    public final ai3 I3;
    public ValueAnimator J;
    public float J0;
    public zh3 J1;
    public wd3 J2;
    public final ai3 J3;
    public ValueAnimator K;
    public float K0;
    public FrameLayout K1;
    public final ArrayList K2;
    public aj3 K3;
    public boolean L;
    public tb L0;
    public xj3 L1;
    public boolean L2;
    public u8a L3;
    public boolean M;
    public fu5 M0;
    public wj3 M1;
    public int M2;
    public Drawable M3;
    public boolean N;
    public ni3 N0;
    public m9 N1;
    public int N2;
    public int N3;
    public float O;
    public boolean O0;
    public uk3 O1;
    public boolean O2;
    public boolean O3;
    public boolean P;
    public boolean P0;
    public w8c P1;
    public int P2;
    public final u8a P3;
    public int Q;
    public long Q0;
    public Long Q1;
    public int Q2;
    public final ch3 Q3;
    public boolean R;
    public long R0;
    public Long R1;
    public int R2;
    public boolean R3;
    public boolean S;
    public long S0;
    public ko2 S1;
    public int S2;
    public boolean S3;
    public v21 T;
    public int T0;
    public ArrayList T1;
    public int T2;
    public final ch3 T3;
    public float U;
    public int U0;
    public boolean U1;
    public int U2;
    public int U3;
    public boolean V;
    public int V0;
    public id V1;
    public int V2;
    public AnimatorSet V3;
    public boolean W;
    public boolean W0;
    public boolean W1;
    public int W2;
    public boolean W3;
    public boolean X;
    public su7 X0;
    public boolean X1;
    public boolean X2;
    public d93 X3;
    public hj3 Y;
    public of3 Y0;
    public long Y1;
    public int Y2;
    public String Y3;
    public rw9 Z;
    public of3 Z0;
    public TLObject Z1;
    public uj3 Z2;
    public ArrayList Z3;
    public final byte a;
    public ew9 a0;
    public boolean a1;
    public int a2;
    public long a3;
    public boolean a4;
    public final fm0 b;
    public uic b0;
    public boolean b1;
    public int b2;
    public TLRPC.Chat b3;
    public CharSequence b4;
    public final fm0 c;
    public rh4 c0;
    public final ArrayList c1;
    public boolean c2;
    public TLRPC.ChatFull c3;
    public boolean c4;
    public final fm0 d;
    public float d0;
    public boolean d1;
    public boolean d2;
    public de0 d3;
    public float d4;
    public final fm0 e;
    public ValueAnimator e0;
    public boolean e1;
    public boolean e2;
    public rb0 e3;
    public boolean e4;
    public final fm0 f;
    public tj3[] f0;
    public boolean f1;
    public int f2;
    public long f3;
    public boolean f4;
    public s7 g0;
    public gd0 g1;
    public boolean g2;
    public boolean g3;
    public ValueAnimator g4;
    public final fm0 h;
    public s7 h0;
    public final Paint h1;
    public String h2;
    public boolean h3;
    public zn5 h4;
    public oq3 i0;
    public ImageView i1;
    public String i2;
    public AnimatorSet i3;
    public TLRPC.FileLocation i4;
    public boolean j0;
    public NumberTextView j1;
    public String j2;
    public boolean j3;
    public TLRPC.FileLocation j4;
    public s7 k0;
    public final ArrayList k1;
    public boolean k2;
    public boolean k3;
    public v21 k4;
    public s7 l0;
    public s7 l1;
    public boolean l2;
    public float l3;
    public int l4;
    public s7 m0;
    public s7 m1;
    public boolean m2;
    public boolean m3;
    public int m4;
    public final fm0 n;
    public s7 n0;
    public s7 n1;
    public boolean n2;
    public int n3;
    public int n4;
    public cx8 o0;
    public s7 o1;
    public boolean o2;
    public boolean o3;
    public int o4;
    public b8 p0;
    public b8 p1;
    public String p2;
    public boolean p3;
    public int p4;
    public kg5 q0;
    public b8 q1;
    public String q2;
    public v21 q3;
    public final tq3 q4;
    public final fm0 r;
    public kg5 r0;
    public b8 r1;
    public final if7 r2;
    public final pn r3;
    public final rz4 r4;
    public final fm0 s;
    public boolean s0;
    public b8 s1;
    public boolean s2;
    public boolean s3;
    public final rz4 s4;
    public boolean t0;
    public b8 t1;
    public boolean t2;
    public boolean t3;
    public final oz4 t4;
    public zp4 u0;
    public b8 u1;
    public boolean u2;
    public boolean u3;
    public final ll0 u4;
    public zp4 v0;
    public b8 v1;
    public boolean v2;
    public boolean v3;
    public final ll0 v4;
    public final v2d w;
    public c51 w0;
    public float w1;
    public boolean w2;
    public float w3;
    public final ll0 w4;
    public boolean x;
    public jz1 x0;
    public float x1;
    public boolean x2;
    public ValueAnimator x3;
    public final ll0 x4;
    public int y;
    public int y0;
    public AnimatorSet y1;
    public boolean y2;
    public float y3;
    public kh3 y4;
    public final UndoView[] z0;
    public float z1;
    public boolean z2;
    public float z3;
    public final ArrayList z4;

    public uj3(Bundle bundle) {
        super(bundle);
        ll0 ll0Var;
        ll0 ll0Var2;
        ll0 ll0Var3;
        int i = Build.VERSION.SDK_INT;
        this.a = i >= 31 ? (byte) 48 : (byte) 0;
        k43 k43Var = k43.h;
        this.b = new fm0(1, this, k43Var, 350L, false);
        this.c = new fm0(2, this, k43Var, 350L, false);
        this.d = new fm0(3, this, k43Var, 350L, false);
        this.e = new fm0(4, this, k43Var, 350L, false);
        this.f = new fm0(5, this, k43Var, 350L, false);
        this.h = new fm0(6, this, k43Var, 350L, false);
        this.n = new fm0(7, this, k43Var, 350L, false);
        this.r = new fm0(8, this, k43Var, 350L, false);
        this.s = new fm0(9, this, k43Var, 350L, false);
        this.w = new v2d(new ch3(this, (byte) 7));
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
        new Paint(1);
        this.G1 = new TextPaint(1);
        this.W1 = true;
        this.e2 = true;
        this.k2 = true;
        this.r2 = new if7();
        this.K2 = new ArrayList();
        this.L2 = true;
        this.r3 = new pn(null);
        this.I3 = new ai3(this, (byte) 0);
        this.J3 = new ai3(this, (byte) 1);
        this.N3 = -4;
        this.O3 = true;
        int i2 = this.currentAccount;
        HashMap hashMap = ea4.d;
        if (!hashMap.containsKey(Integer.valueOf(i2))) {
            hashMap.put(Integer.valueOf(i2), new HashSet());
        }
        su3 su3Var = new su3((byte) 21);
        HashSet hashSet = (HashSet) hashMap.get(Integer.valueOf(i2));
        yd ydVar = new yd(i2, (byte) 5);
        u8a u8aVar = new u8a();
        u8aVar.d = new LinkedHashMap();
        u8aVar.a = su3Var;
        u8aVar.b = hashSet;
        u8aVar.c = ydVar;
        this.P3 = u8aVar;
        this.Q3 = new ch3(this, (byte) 8);
        this.R3 = true;
        this.T3 = new ch3(this, (byte) 9);
        this.U3 = -1;
        this.d4 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.z4 = arrayList;
        RectF rectF = new RectF();
        this.A4 = rectF;
        RectF rectF2 = new RectF();
        this.B4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        oz4 d = this.glassEngine.d(new xg3(this, (byte) 10));
        this.t4 = d;
        if (i >= 31) {
            tq3 tq3Var = new tq3(false);
            this.q4 = tq3Var;
            rz4 rz4Var = new rz4(d);
            this.s4 = rz4Var;
            rz4Var.f = d;
            rz4Var.d = tq3Var;
            rz4Var.e = -2;
            rz4 rz4Var2 = new rz4(null);
            this.r4 = rz4Var2;
            rz4Var2.f = d;
            rz4Var2.d = tq3Var;
            rz4Var2.e = -3;
            ll0Var2 = new ll0(rz4Var, rz4Var, rz4Var);
            this.w4 = ll0Var2;
            ll0Var2.k = true;
            int L = i86.e(262144) ? hl.L(8.0f) : hl.L(48.0f);
            ll0Var2.d = L;
            ll0Var2.e = L;
            ll0Var = new ll0(rz4Var2, rz4Var2, rz4Var2);
            this.u4 = ll0Var;
            ll0Var.k = true;
            int L2 = hl.L(48.0f);
            ll0Var.d = L2;
            ll0Var.e = L2;
            ll0Var3 = new ll0(rz4Var2, rz4Var2, rz4Var2);
            this.v4 = ll0Var3;
        } else {
            this.q4 = null;
            this.r4 = null;
            this.s4 = null;
            ll0Var = new ll0(d, d, d);
            this.u4 = ll0Var;
            ll0Var2 = new ll0(d, d, d);
            this.w4 = ll0Var2;
            ll0Var3 = new ll0(d, d, d);
            this.v4 = ll0Var3;
        }
        ll0 ll0Var4 = new ll0(d, d, d);
        this.x4 = ll0Var4;
        vy4 vy4Var = this.glassEngine;
        ll0Var2.j = vy4Var;
        ll0Var.j = vy4Var;
        ll0Var3.j = vy4Var;
        ll0Var4.j = vy4Var;
    }

    public static void C3(zu1 zu1Var, r47 r47Var) {
        if (r47Var == null || !r47Var.r2()) {
            return;
        }
        try {
            CharSequence charSequence = !TextUtils.isEmpty(r47Var.z) ? r47Var.z : r47Var.v;
            CharSequence v1 = hl.v1(charSequence, r47Var.a2, null);
            if (v1 instanceof SpannableStringBuilder) {
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) v1;
                ho4[] ho4VarArr = (ho4[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ho4.class);
                if (ho4VarArr.length > 0) {
                    int spanStart = spannableStringBuilder.getSpanStart(ho4VarArr[0]);
                    int spanEnd = spannableStringBuilder.getSpanEnd(ho4VarArr[0]);
                    for (int i = 1; i < ho4VarArr.length; i++) {
                        int spanStart2 = spannableStringBuilder.getSpanStart(ho4VarArr[i]);
                        int spanStart3 = spannableStringBuilder.getSpanStart(ho4VarArr[i]);
                        if (spanStart2 != spanEnd) {
                            if (spanStart2 > spanEnd) {
                                for (int i2 = spanEnd; i2 <= spanStart2; i2++) {
                                    if (Character.isWhitespace(spannableStringBuilder.charAt(i2))) {
                                    }
                                }
                            }
                        }
                        spanEnd = spanStart3;
                    }
                    zu1Var.Lb(r47Var.L1(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public static of3 n3(tj3 tj3Var) {
        qj3 qj3Var = tj3Var.a;
        for (int i = 0; i < qj3Var.getChildCount(); i++) {
            View childAt = qj3Var.getChildAt(i);
            if (childAt instanceof of3) {
                of3 of3Var = (of3) childAt;
                if (of3Var.X()) {
                    return of3Var;
                }
            }
        }
        return null;
    }

    public static void x4(k5 k5Var) {
        SharedPreferences.Editor editor;
        int i = k5Var.a;
        boolean[] zArr = F4;
        if (zArr[i]) {
            return;
        }
        uc7 s1 = uc7.s1(i);
        byte b = 1;
        if (s1.k2 == 0 && !s1.getUserConfig().T) {
            SharedPreferences sharedPreferences = uc7.s1(s1.currentAccount).W3;
            if (sharedPreferences.contains("EnableGroup")) {
                boolean z = sharedPreferences.getBoolean("EnableGroup", true);
                editor = sharedPreferences.edit();
                if (!z) {
                    editor.putInt("EnableGroup2", ConnectionsManager.DEFAULT_DATACENTER_ID);
                    editor.putInt("EnableChannel2", ConnectionsManager.DEFAULT_DATACENTER_ID);
                }
                editor.remove("EnableGroup").commit();
            } else {
                editor = null;
            }
            if (sharedPreferences.contains("EnableAll")) {
                boolean z2 = sharedPreferences.getBoolean("EnableAll", true);
                if (editor == null) {
                    editor = sharedPreferences.edit();
                }
                if (!z2) {
                    editor.putInt("EnableAll2", ConnectionsManager.DEFAULT_DATACENTER_ID);
                }
                editor.remove("EnableAll").commit();
            }
            if (editor != null) {
                editor.commit();
            }
            s1.k2 = 4;
            for (int i2 = 0; i2 < 3; i2++) {
                TL_account.getNotifySettings getnotifysettings = new TL_account.getNotifySettings();
                if (i2 == 0) {
                    getnotifysettings.peer = new TLRPC.TL_inputNotifyChats();
                } else if (i2 == 1) {
                    getnotifysettings.peer = new TLRPC.TL_inputNotifyUsers();
                } else {
                    getnotifysettings.peer = new TLRPC.TL_inputNotifyBroadcasts();
                }
                s1.getConnectionsManager().sendRequest(getnotifysettings, new b87(s1, i2, b));
            }
            s1.getConnectionsManager().sendRequest(new TL_account.getReactionsNotifySettings(), new h77(s1, (byte) 7));
        }
        if (!s1.getUserConfig().U && !s1.l2) {
            s1.l2 = true;
            s1.getConnectionsManager().sendRequest(new TL_account.getContactSignUpNotification(), new h77(s1, (byte) 13));
        }
        s1.d3(0, 0, 100, true, null);
        if (s1.s.isEmpty() && !TextUtils.isEmpty(s1.t3)) {
            TLRPC.TL_help_getRecentMeUrls tL_help_getRecentMeUrls = new TLRPC.TL_help_getRecentMeUrls();
            tL_help_getRecentMeUrls.referer = s1.t3;
            s1.getConnectionsManager().sendRequest(tL_help_getRecentMeUrls, new h77(s1, (byte) 5));
        }
        s1.o3(0, yac.h(i).f(), false);
        lv2.r(i).f();
        ls6.d0(i).w(false);
        hl.d3(new zg3(k5Var, b), 200L);
        Iterator it = s1.y3.iterator();
        while (it.hasNext()) {
            ls6.d0(i).d1((String) it.next(), true, true);
        }
        zArr[i] = true;
    }

    @Override // ej6
    public final rz4 A() {
        return this.s4;
    }

    public final boolean A2(long j, View view) {
        if (this.n2 && getMessagesController().v2(j)) {
            return false;
        }
        Long valueOf = Long.valueOf(j);
        ArrayList arrayList = this.K2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j));
            if (view instanceof of3) {
                ((of3) view).d0(false, true);
            } else if (view instanceof bv8) {
                ((bv8) view).A(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j));
        if (view instanceof of3) {
            ((of3) view).d0(true, true);
        } else if (view instanceof bv8) {
            ((bv8) view).A(true, true);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A3(boolean z) {
        boolean z2;
        this.actionBar.y();
        this.K2.clear();
        gd0 gd0Var = this.g1;
        if (gd0Var != null) {
            gd0Var.c(true, 0.0f);
        }
        ij3 ij3Var = this.A0;
        if (ij3Var != null) {
            ij3Var.c(aob.K8, aob.I8, aob.J8, aob.L8, aob.d6);
        }
        ValueAnimator valueAnimator = this.x3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.x3 = null;
        }
        if (this.w3 == 0.0f) {
            return;
        }
        W4(-q3());
        byte b = 0;
        int i = 0;
        while (true) {
            tj3[] tj3VarArr = this.f0;
            if (i >= tj3VarArr.length) {
                break;
            }
            tj3 tj3Var = tj3VarArr[i];
            if (tj3Var != null) {
                tj3Var.a.K0(true);
            }
            i++;
        }
        float max = Math.max(0.0f, hl.L((this.L ? 81 : 0) + 48) + this.O);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w3, 0.0f);
        this.x3 = ofFloat;
        ofFloat.addUpdateListener(new gh3(this, max, (byte) 1));
        this.x3.addListener(new ui3(this, max, b));
        this.x3.setInterpolator(k43.f);
        this.x3.setDuration(200L);
        this.x3.start();
        this.a1 = false;
        ArrayList arrayList = this.c1;
        if (!arrayList.isEmpty()) {
            int i2 = 0;
            for (int size = arrayList.size(); i2 < size; size = size) {
                ac7 ac7Var = (ac7) arrayList.get(i2);
                nf4.z0(ac7Var, ac7Var.g, ac7Var.b, ac7Var.c, ac7Var.n, ac7Var.m, ac7Var.h, ac7Var.i, ac7Var.j, false, false, true, true, false, this, null);
                i2++;
                arrayList = arrayList;
            }
            arrayList.clear();
        }
        if (this.b1) {
            getMessagesController().x4(this.Y2, 0L, null);
            z2 = 0;
            this.b1 = false;
        } else {
            z2 = 0;
        }
        p5(true);
        if (this.f0 != null) {
            int i3 = z2;
            while (true) {
                tj3[] tj3VarArr2 = this.f0;
                if (i3 >= tj3VarArr2.length) {
                    break;
                }
                tj3VarArr2[i3].d.I = z2;
                i3++;
            }
        }
        int i4 = uc7.r5;
        int i5 = z2;
        if (z) {
            i5 = TLObject.FLAG_13;
        }
        G5(196608 | i5, true);
    }

    public final boolean A4(TLRPC.User user) {
        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) this.H;
        if (user == null || lbc.B(user) || lbc.z(user)) {
            return false;
        }
        Boolean bool = tL_requestPeerTypeUser.bot;
        if (bool != null && bool.booleanValue() != user.bot) {
            return false;
        }
        Boolean bool2 = tL_requestPeerTypeUser.premium;
        return bool2 == null || bool2.booleanValue() == user.premium;
    }

    public final void A5(boolean z) {
        boolean z2;
        if (this.m0 == null) {
            return;
        }
        ArrayList arrayList = getDownloadController().H;
        int size = arrayList.size();
        boolean z3 = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z2 = false;
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            r47 r47Var = (r47) obj;
            if (r47Var.F0() != null && r47Var.F0().size >= 157286400) {
                z2 = true;
                break;
            }
        }
        ArrayList arrayList2 = getDownloadController().I;
        int size2 = arrayList2.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i2);
            i2++;
            r47 r47Var2 = (r47) obj2;
            if (r47Var2.F0() != null && r47Var2.F0().size >= 157286400) {
                z2 = true;
                break;
            }
        }
        if (!getUserConfig().p() && !getMessagesController().M3() && z2 && z) {
            z3 = true;
        }
        this.d.a(z3, true);
    }

    public final void B2(ph4 ph4Var) {
        bj3 bj3Var;
        if (!this.s3 || (bj3Var = this.D0) == null) {
            return;
        }
        ArrayList arrayList = bj3Var.D0;
        if (!arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (ph4Var.b((ph4) arrayList.get(i))) {
                    return;
                }
            }
        }
        arrayList.add(ph4Var);
        hj3 hj3Var = this.Y;
        hj3Var.H.add(ph4Var);
        hj3Var.K = r1.size() - 1;
        hj3Var.f();
        this.Y.r.getText().clear();
        t5(true, null, null, false, true);
    }

    public final void B3(boolean z) {
        if (this.H3.c()) {
            z = true;
        }
        if (z && this.d2) {
            return;
        }
        this.a4 = z;
        v5(true);
        if (z) {
            kg5 kg5Var = this.q0;
            if (kg5Var != null) {
                kg5Var.f(true);
            }
            kg5 kg5Var2 = this.r0;
            if (kg5Var2 != null) {
                kg5Var2.f(true);
            }
        }
    }

    public final void B4(View view) {
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        byte b = 1;
        nx0 i = ik8.i(getParentActivity(), false, 1, null);
        boolean z = getMessagesStorage().M != 0;
        int[] iArr = {z ? R.drawable.msg_markread : 0, xea.m1 ? R.drawable.chats_pin : R.drawable.chats_unpin};
        CharSequence[] charSequenceArr = {z ? ob6.M0(2131748436, null) : null, ob6.M0(xea.m1 ? 2131746973 : 2131749078, null)};
        s20 s20Var = new s20(this, b);
        i.M = charSequenceArr;
        i.N = iArr;
        i.L = s20Var;
        showDialog(i);
    }

    public final void B5(TLRPC.User user, boolean z) {
        ul ulVar;
        ii3 ii3Var = this.F0;
        ul ulVar2 = null;
        if (ii3Var != null && (ulVar = ii3Var.b0) != null && ii3Var.r0 != null) {
            Long i = lbc.i(user);
            if (i != null) {
                boolean z2 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                ulVar.j(i.longValue(), z);
                ulVar.m(z2, z);
            } else {
                if (user != null) {
                    uc7.s1(ii3Var.f);
                    if (uc7.F2(user)) {
                        if (ii3Var.O0 == null) {
                            ii3Var.O0 = ii3Var.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                            ii3Var.O0 = new ig3(hl.L(18.0f), hl.L(18.0f), ii3Var.O0);
                        }
                        Drawable drawable = ii3Var.O0;
                        int i2 = aob.qi;
                        uj3 uj3Var = ii3Var.f0;
                        yob.x(ii3Var, drawable, i2, uj3Var != null ? uj3Var.getResourceProvider() : null, PorterDuff.Mode.MULTIPLY);
                        ulVar.g(ii3Var.O0, z);
                        ulVar.m(false, z);
                    }
                }
                ulVar.g(null, z);
                ulVar.m(false, z);
            }
            ulVar.k(Integer.valueOf(ii3Var.f(aob.qi)));
            ii3Var.a0.invalidate();
        }
        if (this.F3 == null || this.actionBar == null) {
            return;
        }
        Long i3 = lbc.i(user);
        this.D3 = null;
        if (i3 != null) {
            boolean z3 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
            this.F3.j(i3.longValue(), z);
            this.F3.m(z3, z);
            if (z3) {
                this.D3 = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
            }
            this.actionBar.setRightDrawableOnClick(new wg3(this, (byte) 1));
            n1a.s(this.currentAccount);
        } else {
            if (user != null) {
                uc7.s1(this.currentAccount);
                if (uc7.F2(user)) {
                    if (this.M3 == null) {
                        this.M3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                        this.M3 = new yi3(hl.L(18.0f), hl.L(18.0f), this.M3);
                    }
                    Drawable drawable2 = this.M3;
                    int themedColor = getThemedColor(aob.qi);
                    this.D4 = themedColor;
                    drawable2.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                    this.F3.g(this.M3, z);
                    this.F3.m(false, z);
                    this.actionBar.setRightDrawableOnClick(new wg3(this, (byte) 2));
                    n1a.s(this.currentAccount);
                }
            }
            this.F3.g(null, z);
            this.F3.m(false, z);
            this.actionBar.setRightDrawableOnClick(null);
        }
        ul ulVar3 = this.F3;
        int i4 = aob.qi;
        ulVar3.k(Integer.valueOf(getThemedColor(i4)));
        zm zmVar = this.G3;
        if (zmVar != null) {
            zmVar.setColor(getThemedColor(i4));
        }
        ni3 ni3Var = this.N0;
        if (ni3Var == null || !(ni3Var.getContentView() instanceof n1a)) {
            return;
        }
        ema titleTextView = this.actionBar.getTitleTextView();
        n1a n1aVar = (n1a) this.N0.getContentView();
        if (titleTextView != null) {
            Drawable rightDrawable = titleTextView.getRightDrawable();
            ul ulVar4 = this.F3;
            if (rightDrawable == ulVar4) {
                ulVar2 = ulVar4;
            }
        }
        n1aVar.y(ulVar2, titleTextView);
    }

    public final void C2(boolean z) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            ArrayList arrayList = new ArrayList();
            byte b = 1;
            if (this.Y2 == 0 && this.a3 == 0 && Build.VERSION.SDK_INT >= 33 && so7.F0(parentActivity)) {
                if (z) {
                    showDialog(new so7(parentActivity, !jve.a(), new dh3(parentActivity, b)));
                    return;
                }
                arrayList.add("android.permission.POST_NOTIFICATIONS");
            }
            if (getUserConfig().V && this.W1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (z) {
                    id idVar = jj.v(parentActivity, new qg3(this, b)).a;
                    this.V1 = idVar;
                    showDialog(idVar);
                    return;
                } else {
                    arrayList.add("android.permission.READ_CONTACTS");
                    arrayList.add("android.permission.WRITE_CONTACTS");
                    arrayList.add("android.permission.GET_ACCOUNTS");
                }
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                    arrayList.add("android.permission.READ_MEDIA_IMAGES");
                }
                if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                    arrayList.add("android.permission.READ_MEDIA_VIDEO");
                }
                if (parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
                }
            } else if ((i <= 28 || f11.b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
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
                e5();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:321:0x00c6, code lost:
    
        if (r2.megagroup == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x00d5, code lost:
    
        if (r1 == null) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x00d7, code lost:
    
        r13 = -r1.id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x00d3, code lost:
    
        if (r1.megagroup == false) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C4(View view, int i, c79 c79Var) {
        c79 c79Var2;
        long j;
        boolean z;
        int i2;
        int i3;
        int i4;
        r47 r47Var;
        long j2;
        long j3;
        gx9 gx9Var;
        li3 li3Var;
        long j4;
        long j5;
        int i5;
        r47 r47Var2;
        long E;
        long j6;
        long j7;
        TLRPC.Chat M0;
        boolean z2;
        int i6;
        boolean z3;
        bj3 bj3Var;
        int i7;
        Object J;
        int indexOf;
        long j8;
        long j9;
        int i8;
        if (getParentActivity() != null) {
            boolean z4 = c79Var instanceof gk3;
            if (z4) {
                gk3 gk3Var = (gk3) c79Var;
                int i9 = gk3Var.h;
                if (i9 == 7 || i9 == 8) {
                    ac7 ac7Var = getMessagesController().N[i9 == 7 ? (char) 0 : (char) 1];
                    if (ac7Var != null) {
                        i7 = ac7Var.a;
                        J = gk3Var.J(i);
                        if (this.E2 == null && gk3Var.n && c79Var.d(i) == 21) {
                            this.E2.s(this);
                            return;
                        }
                        if (J instanceof TLRPC.User) {
                            if (J instanceof TLRPC.Chat) {
                                j9 = ((TLRPC.Chat) J).id;
                            } else if (J instanceof TLRPC.Dialog) {
                                TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                                i8 = dialog.folder_id;
                                if (dialog instanceof TLRPC.TL_dialogFolder) {
                                    if (this.actionBar.A(null)) {
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("folderId", ((TLRPC.TL_dialogFolder) dialog).folder.id);
                                    presentFragment(new uj3(bundle));
                                    return;
                                }
                                j8 = dialog.id;
                                if (this.actionBar.A(null)) {
                                    h5(j8, view);
                                    return;
                                }
                                c79Var2 = c79Var;
                                i2 = i8;
                                z = false;
                                i3 = 0;
                                r47Var = null;
                                i4 = i7;
                                j3 = j8;
                                j2 = 0;
                                j = 0;
                            } else if (J instanceof TLRPC.TL_recentMeUrlChat) {
                                j9 = ((TLRPC.TL_recentMeUrlChat) J).chat_id;
                            } else if (J instanceof TLRPC.TL_recentMeUrlUser) {
                                j8 = ((TLRPC.TL_recentMeUrlUser) J).user_id;
                            } else {
                                if (!(J instanceof TLRPC.TL_recentMeUrlChatInvite)) {
                                    if (J instanceof TLRPC.TL_recentMeUrlStickerSet) {
                                        TLRPC.StickerSet stickerSet = ((TLRPC.TL_recentMeUrlStickerSet) J).set.set;
                                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                                        tL_inputStickerSetID.id = stickerSet.id;
                                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                                        showDialog(new s4b(getParentActivity(), this, tL_inputStickerSetID, null, null, null));
                                        return;
                                    }
                                    return;
                                }
                                TLRPC.TL_recentMeUrlChatInvite tL_recentMeUrlChatInvite = (TLRPC.TL_recentMeUrlChatInvite) J;
                                c79Var2 = c79Var;
                                TLRPC.ChatInvite chatInvite = tL_recentMeUrlChatInvite.chat_invite;
                                TLRPC.Chat chat = chatInvite.chat;
                                if (chat == null) {
                                    if (chatInvite.channel) {
                                    }
                                    String str = tL_recentMeUrlChatInvite.url;
                                    indexOf = str.indexOf(47);
                                    if (indexOf > 0) {
                                        str = str.substring(indexOf + 1);
                                    }
                                    showDialog(new jw5(getParentActivity(), chatInvite, str, this, null));
                                    return;
                                }
                                if (xc2.T(chat)) {
                                    chat = chatInvite.chat;
                                }
                                String str2 = tL_recentMeUrlChatInvite.url;
                                indexOf = str2.indexOf(47);
                                if (indexOf > 0) {
                                }
                                showDialog(new jw5(getParentActivity(), chatInvite, str2, this, null));
                                return;
                                i8 = 0;
                                i2 = i8;
                                z = false;
                                i3 = 0;
                                r47Var = null;
                                i4 = i7;
                                j3 = j8;
                                j2 = 0;
                                j = 0;
                            }
                            j8 = -j9;
                        } else {
                            j8 = ((TLRPC.User) J).id;
                        }
                        c79Var2 = c79Var;
                        i8 = 0;
                        i2 = i8;
                        z = false;
                        i3 = 0;
                        r47Var = null;
                        i4 = i7;
                        j3 = j8;
                        j2 = 0;
                        j = 0;
                    }
                }
                i7 = 0;
                J = gk3Var.J(i);
                if (this.E2 == null) {
                }
                if (J instanceof TLRPC.User) {
                }
                c79Var2 = c79Var;
                i8 = 0;
                i2 = i8;
                z = false;
                i3 = 0;
                r47Var = null;
                i4 = i7;
                j3 = j8;
                j2 = 0;
                j = 0;
            } else {
                c79Var2 = c79Var;
                bj3 bj3Var2 = this.D0;
                if (bj3Var2 == null || c79Var2 != (gx9Var = bj3Var2.e0)) {
                    j = 0;
                    z = false;
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    r47Var = null;
                    j2 = 0;
                    j3 = 0;
                } else {
                    Object I = gx9Var.I(i);
                    z = this.D0.e0.N(i);
                    if (I instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) I;
                        E = user.id;
                        if (!this.n2) {
                            this.Y1 = E;
                            this.Z1 = user;
                        }
                    } else if (I instanceof TLRPC.Chat) {
                        TLRPC.Chat chat2 = (TLRPC.Chat) I;
                        E = -chat2.id;
                        if (!this.n2) {
                            this.Y1 = E;
                            this.Z1 = chat2;
                        }
                    } else if (I instanceof TLRPC.EncryptedChat) {
                        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) I;
                        E = wf3.E(encryptedChat.id);
                        if (!this.n2) {
                            this.Y1 = E;
                            this.Z1 = encryptedChat;
                        }
                    } else {
                        if (I instanceof r47) {
                            r47Var2 = (r47) I;
                            long B0 = r47.B0(r47Var2.k);
                            int e1 = r47Var2.e1();
                            j = 0;
                            j5 = xc2.c0(getMessagesController().M0(Long.valueOf(-B0))) ? r47.b2(r47Var2.K1, r47Var2.k, true, false) : 0L;
                            bj3 bj3Var3 = this.D0;
                            if (bj3Var3 != null) {
                                gx9 gx9Var2 = bj3Var3.e0;
                                gx9Var2.k0.a(gx9Var2.a0);
                            }
                            i5 = e1;
                            j4 = B0;
                        } else {
                            j = 0;
                            if (I instanceof String) {
                                String str3 = (String) I;
                                bj3 bj3Var4 = this.D0;
                                if (bj3Var4 != null && !bj3Var4.e0.K.isEmpty()) {
                                    this.Y.r.setText(str3);
                                    this.Y.r.setSelection(str3.length());
                                } else if (!str3.equals("section")) {
                                    rl7 rl7Var = new rl7(this, getParentActivity());
                                    rl7Var.I0(str3, true);
                                    rl7Var.show();
                                }
                            } else if (I instanceof iv2) {
                                iv2 iv2Var = (iv2) I;
                                jj.u(this, iv2Var.i, iv2Var.j, (String) iv2Var.e.get(0));
                            } else if ((I instanceof TLRPC.TL_forumTopic) && (li3Var = this.H3) != null && (li3Var.getFragment() instanceof tzb)) {
                                j4 = -((tzb) this.H3.getFragment()).a;
                                j5 = ((TLRPC.TL_forumTopic) I).id;
                                i5 = 0;
                                r47Var2 = null;
                            }
                            i5 = 0;
                            r47Var2 = null;
                            j5 = 0;
                            j4 = 0;
                        }
                        if (j4 == j && this.actionBar.z()) {
                            if (this.actionBar.A("search_dialogs_action_mode") && i5 == 0 && !z) {
                                h5(j4, view);
                                return;
                            }
                            return;
                        }
                        j3 = j4;
                        j2 = j5;
                        i4 = 0;
                        i3 = i5;
                        r47Var = r47Var2;
                        i2 = 0;
                    }
                    i5 = 0;
                    r47Var2 = null;
                    j4 = E;
                    j5 = 0;
                    j = 0;
                    if (j4 == j) {
                    }
                    j3 = j4;
                    j2 = j5;
                    i4 = 0;
                    i3 = i5;
                    r47Var = r47Var2;
                    i2 = 0;
                }
            }
            if (j3 != j) {
                if (this.n2) {
                    if (H5(j3)) {
                        if ((!getMessagesController().v2(j3) && !getMessagesController().n2(j3)) || G3(j3)) {
                            ArrayList arrayList = this.K2;
                            if (!arrayList.isEmpty() || (this.T0 == 3 && this.h2 != null)) {
                                if (arrayList.contains(Long.valueOf(j3)) || K2(j3)) {
                                    boolean A2 = A2(j3, view);
                                    bj3 bj3Var5 = this.D0;
                                    if (bj3Var5 != null && c79Var2 == bj3Var5.e0) {
                                        this.actionBar.o(true);
                                        m3(j3, A2);
                                    }
                                    y5();
                                    return;
                                }
                                return;
                            }
                        }
                        if (this.o2 && getMessagesController().n2(j3)) {
                            Bundle bundle2 = new Bundle(this.arguments);
                            bundle2.putLong("community_id", -j3);
                            uj3 uj3Var = new uj3(bundle2);
                            uj3Var.Z2 = this;
                            uj3Var.E2 = this.E2;
                            presentFragment(uj3Var);
                            return;
                        }
                        if (!this.o2 || ((!getMessagesController().v2(j3) || G3(j3)) && !getMessagesController().C2(j3))) {
                            k3(j3, 0L, true, null);
                            return;
                        }
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("chat_id", -j3);
                        bundle3.putBoolean("for_select", true);
                        bundle3.putBoolean("forward_to", true);
                        bundle3.putBoolean("bot_share_to", this.T0 == 1);
                        bundle3.putBoolean("quote", this.P0);
                        bundle3.putBoolean("reply_to", this.O0);
                        tzb tzbVar = new tzb(bundle3);
                        tzbVar.M0 = this;
                        presentFragment(tzbVar);
                        return;
                    }
                    return;
                }
                Bundle bundle4 = new Bundle();
                if (wf3.B(j3)) {
                    j6 = j2;
                    bundle4.putInt("enc_id", (int) (j3 & 4294967295L));
                } else {
                    j6 = j2;
                    if (wf3.D(j3)) {
                        bundle4.putLong("user_id", j3);
                    } else {
                        if (i3 == 0 || (M0 = getMessagesController().M0(Long.valueOf(-j3))) == null || M0.migrated_to == null) {
                            j7 = j3;
                        } else {
                            bundle4.putLong("migrated_to", j3);
                            j7 = -M0.migrated_to.channel_id;
                        }
                        bundle4.putLong("chat_id", -j7);
                    }
                }
                if (i3 != 0) {
                    bundle4.putInt("message_id", i3);
                } else if (z) {
                    TLObject tLObject = this.Z1;
                    if (tLObject != null) {
                        bj3 bj3Var6 = this.D0;
                        if (bj3Var6 != null) {
                            bj3Var6.e0.Q(this.Y1, tLObject);
                        }
                        this.Z1 = null;
                    }
                } else {
                    f3();
                }
                boolean z5 = (ob6.a0 || this.l2 || (hl.O1() && i2 != 0) || !i86.e(64) || this.a3 != j) ? false : true;
                bundle4.putInt("dialog_folder_id", i2);
                bundle4.putInt("dialog_filter_id", i4);
                if (hl.O1() && ((!getMessagesController().v2(j3) || !z5) && this.r2.a == j3 && ((bj3Var = this.D0) == null || c79Var2 != bj3Var.e0))) {
                    if (getParentActivity() instanceof LaunchActivity) {
                        LaunchActivity launchActivity = (LaunchActivity) getParentActivity();
                        List fragmentStack = launchActivity.r0.getFragmentStack();
                        if (fragmentStack.isEmpty()) {
                            return;
                        }
                        if (fragmentStack.size() == 1 && (bp1.m(1, fragmentStack) instanceof zu1)) {
                            ((zu1) bp1.m(1, fragmentStack)).ka();
                            return;
                        }
                        if (fragmentStack.size() == 2) {
                            launchActivity.r0.j(true, false);
                            return;
                        } else {
                            if (getParentActivity() instanceof LaunchActivity) {
                                e eVar = (e) fragmentStack.get(0);
                                fragmentStack.clear();
                                fragmentStack.add(eVar);
                                launchActivity.r0.W(true, true);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                bj3 bj3Var7 = this.D0;
                if (bj3Var7 != null && bj3Var7.B0) {
                    bj3Var7.S(false);
                }
                if (j3 == getUserConfig().e() && getMessagesController().P3) {
                    Bundle bundle5 = new Bundle();
                    bundle5.putLong("dialog_id", yac.h(this.currentAccount).e());
                    bundle5.putInt(TeXSymbolParser.TYPE_ATTR, 0);
                    bundle5.putInt("start_from", 11);
                    wia wiaVar = this.E0;
                    if (wiaVar == null) {
                        wiaVar = new wia(this);
                        this.E0 = wiaVar;
                    }
                    presentFragment(new em6(bundle5, wiaVar));
                    return;
                }
                if (this.p2 != null) {
                    if (getMessagesController().C(bundle4, this, null, null)) {
                        getNotificationCenter().k(jn7.s, new Object[0]);
                        zu1 zu1Var = new zu1(bundle4);
                        C3(zu1Var, r47Var);
                        presentFragment(zu1Var);
                        return;
                    }
                    return;
                }
                this.B3 = true;
                if (getMessagesController().C(bundle4, this, null, null)) {
                    TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(-j3));
                    TLRPC.Dialog S0 = getMessagesController().S0(j3);
                    boolean V = xc2.V(M02);
                    boolean z6 = S0 != null && S0.view_forum_as_messages;
                    if (this.a3 == j || M02 == null) {
                        z2 = z6;
                        i6 = 0;
                    } else {
                        z2 = z6;
                        i6 = gp2.b(this.currentAccount, -M02.id);
                    }
                    if (i6 == 3) {
                        showDialog(new jw5(getParentActivity(), M02, null, this, this.resourceProvider));
                        return;
                    }
                    if (i6 == 4) {
                        bs2.v(null, V ? 2131751895 : 2131751892, d31.b0(this), R.raw.e_hand_2, 36);
                        return;
                    }
                    if (M02 == null || !(((z3 = M02.monoforum) || M02.forum) && j6 == j)) {
                        if (xc2.Y(M02)) {
                            Bundle bundle6 = new Bundle();
                            bundle6.putLong("community_id", M02.id);
                            presentFragment(new uj3(bundle6));
                            return;
                        }
                        zu1 zu1Var2 = new zu1(bundle4);
                        if (j6 != j) {
                            ro4.a(zu1Var2, if7.a(j3, j6));
                        }
                        if (z4 && wf3.D(j3) && getMessagesController().R.f(j3) == null) {
                            ls6 mediaDataController = getMediaDataController();
                            TLRPC.Document document = mediaDataController.z0;
                            mediaDataController.o1();
                            if (document != null) {
                                zu1Var2.Y9 = document;
                                zu1Var2.Z9 = true;
                            }
                        }
                        if (hl.O1()) {
                            li3 li3Var2 = this.H3;
                            if (li3Var2.a != null) {
                                li3Var2.a();
                            }
                        }
                        C3(zu1Var2, r47Var);
                        presentFragment(zu1Var2);
                        return;
                    }
                    if (z3) {
                        bundle4.putInt("chatMode", 8);
                        bundle4.putBoolean("isSubscriberSuggestions", !xc2.A(this.currentAccount, M02, 24));
                        zu1 zu1Var3 = new zu1(bundle4);
                        C3(zu1Var3, r47Var);
                        presentFragment(zu1Var3);
                        return;
                    }
                    if (xc2.a(M02)) {
                        zu1 zu1Var4 = new zu1(bundle4);
                        ro4.a(zu1Var4, if7.a(-M02.id, getMessagesController().X3.getLong(qu6.n(M02.id, "forumlasttopic"), 1L)));
                        presentFragment(zu1Var4);
                        return;
                    }
                    if (!i86.e(64) || this.a3 != j) {
                        if (!z2) {
                            presentFragment(new tzb(bundle4));
                            return;
                        }
                        zu1 zu1Var5 = new zu1(bundle4);
                        C3(zu1Var5, r47Var);
                        presentFragment(zu1Var5);
                        return;
                    }
                    if (!z5) {
                        if (!z2) {
                            presentFragment(new tzb(bundle4));
                            return;
                        }
                        zu1 zu1Var6 = new zu1(bundle4);
                        C3(zu1Var6, r47Var);
                        presentFragment(zu1Var6);
                        return;
                    }
                    if (this.l2) {
                        return;
                    }
                    if (z2) {
                        zu1 zu1Var7 = new zu1(bundle4);
                        C3(zu1Var7, r47Var);
                        presentFragment(zu1Var7);
                        return;
                    }
                    li3 li3Var3 = this.H3;
                    si3 si3Var = li3Var3.a;
                    if (si3Var == null || (-si3Var.a) != j3) {
                        qj3 qj3Var = this.f0[0].a;
                        qj3Var.w3 = 0.0f;
                        qj3Var.x3 = qj3Var.v3;
                        qj3Var.y3 = qj3Var.p3 != 0.0f;
                        si3 si3Var2 = new si3(bundle4);
                        si3Var2.N0 = this;
                        final li3 li3Var4 = this.H3;
                        wk5 parentLayout = getParentLayout();
                        pn pnVar = li3Var4.n;
                        if (!li3Var4.r) {
                            li3Var4.x = parentLayout;
                            si3Var2.onFragmentCreate();
                            si3Var2.setInPreviewMode(true);
                            si3Var2.setParentLayout(parentLayout);
                            View performCreateView = si3Var2.performCreateView(li3Var4.getContext());
                            si3Var2.onResume();
                            li3Var4.b = performCreateView;
                            li3Var4.addView(performCreateView);
                            final si3 si3Var3 = li3Var4.a;
                            h8b h8bVar = si3Var2.e;
                            li3Var4.c = h8bVar;
                            li3Var4.addView(h8bVar);
                            li3Var4.a = si3Var2;
                            rm9.R = j;
                            rm9.R = -si3Var2.a;
                            if (si3Var2.getActionBar() != null) {
                                a actionBar = si3Var2.getActionBar();
                                li3Var4.d = actionBar;
                                li3Var4.addView(actionBar);
                                li3Var4.d.f1 = new v59(li3Var4, (byte) 15);
                            }
                            if (si3Var3 != null) {
                                final si3 si3Var4 = li3Var4.a;
                                if (xea.c()) {
                                    vpa vpaVar = li3Var4.y;
                                    if (vpaVar != null) {
                                        vpaVar.d();
                                    }
                                    si3Var4.onTransitionAnimationStart(true, false);
                                    li3Var4.F = si3Var3;
                                    li3Var4.w = true;
                                    pnVar.d();
                                    vpa vpaVar2 = new vpa(new xk4(0.0f));
                                    li3Var4.y = vpaVar2;
                                    vpaVar2.m = bp1.j(1000.0f, 400.0f, 1.0f);
                                    rm9.f(si3Var3, si3Var4, 0.0f);
                                    li3Var4.y.b(new i10(li3Var4, (byte) 14));
                                    li3Var4.y.a(new ps3() { // from class: pm9
                                        @Override // ps3
                                        public final void a(vpa vpaVar3, boolean z7, float f, float f2) {
                                            li3 li3Var5 = li3.this;
                                            if (li3Var5.y == null) {
                                                return;
                                            }
                                            li3Var5.y = null;
                                            si3 si3Var5 = si3Var4;
                                            si3Var5.onTransitionAnimationEnd(true, false);
                                            si3 si3Var6 = si3Var3;
                                            rm9.f(si3Var6, si3Var5, 1.0f);
                                            li3Var5.w = false;
                                            li3Var5.F = null;
                                            si3Var6.onPause();
                                            si3Var6.onFragmentDestroy();
                                            li3Var5.removeView(si3Var6.getFragmentView());
                                            li3Var5.removeView(si3Var6.getActionBar());
                                            li3Var5.n.e();
                                        }
                                    });
                                    li3Var4.y.h();
                                } else {
                                    si3Var4.onTransitionAnimationStart(true, false);
                                    si3Var4.onTransitionAnimationEnd(true, false);
                                    rm9.f(si3Var3, si3Var4, 1.0f);
                                    li3Var4.w = false;
                                    li3Var4.F = null;
                                    si3Var3.onPause();
                                    si3Var3.onFragmentDestroy();
                                    li3Var4.removeView(si3Var3.getFragmentView());
                                    li3Var4.removeView(si3Var3.getActionBar());
                                    pnVar.e();
                                }
                            } else if (!li3Var4.f) {
                                li3Var4.f = true;
                                if (xea.c()) {
                                    pnVar.d();
                                    li3Var4.h = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    li3Var4.e = 0.0f;
                                    li3Var4.e(true);
                                    li3Var4.g();
                                    si3Var2.onTransitionAnimationStart(true, false);
                                    li3Var4.h.addUpdateListener(new b49(li3Var4, (byte) 6));
                                    li3Var4.h.addListener(new wd8((Object) li3Var4, (Object) si3Var2, (byte) 11));
                                    li3Var4.h.setDuration(250L);
                                    li3Var4.h.setInterpolator(k43.f);
                                    li3Var4.h.setStartDelay(xea.o() >= 2 ? 50L : 150L);
                                    li3Var4.h.start();
                                } else {
                                    li3Var4.e(true);
                                    si3Var2.onTransitionAnimationStart(true, false);
                                    si3Var2.onTransitionAnimationEnd(true, false);
                                    li3Var4.e = 1.0f;
                                    li3Var4.g();
                                    li3Var4.d(false);
                                }
                            }
                            si3Var2.setPreviewDelegate(new ye9(li3Var4, (byte) 10));
                            WeakHashMap weakHashMap = ihc.a;
                            ygc.c(li3Var4);
                        }
                    } else {
                        li3Var3.a();
                    }
                    bj3 bj3Var8 = this.D0;
                    if (bj3Var8 != null) {
                        bj3Var8.T();
                    }
                }
            }
        }
    }

    public final void C5() {
        kg5 kg5Var;
        boolean k5 = getMessagesController().k5();
        if (this.R3 != k5) {
            u5();
            if (!this.R3 && k5 && (kg5Var = this.q0) != null) {
                kg5Var.v();
            }
            this.R3 = k5;
        }
        zp4 zp4Var = this.u0;
        if (zp4Var == null) {
            return;
        }
        if (this.T0 == 10) {
            zp4Var.setImageResource(R.drawable.floating_check);
            this.u0.setContentDescription(ob6.M0(2131751319, null));
        } else {
            zp4Var.setImageResource(R.drawable.filled_fab_compose_32);
            this.u0.setContentDescription(ob6.M0(2131748024, null));
        }
    }

    @Override // el4
    public final List D() {
        return Arrays.asList(new dl4(ob6.M0(2131751613, null)), new dl4(ob6.M0(2131752041, null), new rg3(this, (byte) 28)), new dl4(ob6.M0(2131751614, null), new rg3(this, (byte) 29)));
    }

    public final void D2(CharSequence charSequence) {
        if (this.D1 != null) {
            if (this.F2 == null && this.G2 == null && this.H2 == null) {
                return;
            }
            if (this.I2 == null) {
                sea seaVar = new sea(getParentActivity(), getResourceProvider());
                this.I2 = seaVar;
                byte b = 11;
                seaVar.setLayoutClickListener(new wg3(this, b));
                this.I2.setOnModeChangeListener(new xg3(this, b));
                bi3 bi3Var = this.D1;
                sea seaVar2 = this.I2;
                if (seaVar2 == null) {
                    bi3Var.getClass();
                } else {
                    bi3Var.v2 = seaVar2;
                    bi3Var.addView(seaVar2, 0, tre.e(-1, 48, 51));
                    bi3Var.V3 = false;
                    bi3Var.S();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.I2.getLayoutParams();
                layoutParams.rightMargin = -this.D1.getPaddingRight();
                this.I2.setLayoutParams(layoutParams);
            }
            if (z3()) {
                this.I2.i(this.currentAccount, this.F2);
            } else {
                String str = this.G2;
                if (str != null) {
                    sea seaVar3 = this.I2;
                    seaVar3.g(this.currentAccount);
                    if (!str.isEmpty()) {
                        seaVar3.e(str, true);
                    }
                } else {
                    CharSequence charSequence2 = this.H2;
                    if (charSequence2 != null) {
                        sea seaVar4 = this.I2;
                        seaVar4.g(this.currentAccount);
                        if (charSequence2.length() > 0) {
                            seaVar4.e(charSequence2, true);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.D1.setFieldText(charSequence);
            }
            this.D1.setOverrideHint(ob6.M0(z3() ? 2131754447 : 2131745190, null));
            R2();
            if (this.I2.getMode() != 0) {
                this.D1.n2(false, false);
            }
            z5();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D3(int i) {
        tq3 tq3Var;
        if (Build.VERSION.SDK_INT < 31 || (tq3Var = this.q4) == null) {
            return;
        }
        if (vsd.a(i, 4)) {
            int L = hl.L(48.0f);
            int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.m4) - hl.L(8.0f);
            int L2 = measuredHeight - hl.L(56.0f);
            int L3 = hl.L(this.L ? 81.0f : 0.0f) + hl.L(48.0f) + this.actionBar.getMeasuredHeight();
            ij3 ij3Var = this.A0;
            boolean z = false;
            int measuredHeight2 = L3 + ((ij3Var == null || ij3Var.getVisibility() != 0) ? 0 : this.A0.getMeasuredHeight());
            xj3 xj3Var = this.L1;
            int sumHeightOfAllVisibleChild = measuredHeight2 + ((xj3Var == null || xj3Var.getVisibility() != 0) ? 0 : this.L1.getSumHeightOfAllVisibleChild()) + ((int) this.O);
            int measuredHeight3 = this.actionBar.getMeasuredHeight();
            this.A4.set(0.0f, -L, this.fragmentView.getMeasuredWidth(), hl.U1(this.b.e, sumHeightOfAllVisibleChild, hl.L(30.0f) + measuredHeight3 + (this.a0 != null ? r8.getMeasuredHeight() : 0)) + L);
            boolean z2 = this.X;
            RectF rectF = this.B4;
            if (z2) {
                rectF.set(0.0f, L2, this.fragmentView.getMeasuredWidth(), measuredHeight);
                rectF.inset(0.0f, i86.e(262144) ? 0.0f : -hl.L(48.0f));
            } else {
                if (this.D1 != null && this.A1 != null) {
                    rectF.set(0.0f, this.fragmentView.getMeasuredHeight() - F2(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                    rectF.inset(0.0f, i86.e(262144) ? 0.0f : -hl.L(48.0f));
                }
                tq3Var.g(z ? 2 : 1, this.z4);
            }
            z = true;
            tq3Var.g(z ? 2 : 1, this.z4);
        }
        tq3Var.e(this.y4, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    public final boolean D4(View view, int i, float f, c79 c79Var) {
        gx9 gx9Var;
        gx9 gx9Var2;
        long E;
        if (getParentActivity() != null && !(view instanceof uk3) && c79Var.d(i) != 21) {
            if (!this.actionBar.z() && !hl.O1() && !this.n2 && (view instanceof of3)) {
                of3 of3Var = (of3) view;
                if (!getMessagesController().v2(of3Var.getDialogId()) && !this.H3.c() && of3Var.a0(f)) {
                    return c5(of3Var);
                }
            }
            li3 li3Var = this.H3;
            if (li3Var == null || !li3Var.c()) {
                bj3 bj3Var = this.D0;
                char c = 1;
                if (bj3Var != null && c79Var == (gx9Var2 = bj3Var.e0)) {
                    Object I = gx9Var2.I(i);
                    bj3 bj3Var2 = this.D0;
                    if (!bj3Var2.e0.O) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String M0 = ob6.M0(2131752019, null);
                        id idVar = alertDialog$Builder.a;
                        idVar.S = M0;
                        if (I instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) I;
                            if (chat.monoforum) {
                                idVar.U = ob6.a0("ClearSearchSingleChatAlertText", null, 2131752018, ro4.j(this.currentAccount, chat, false));
                            } else {
                                idVar.U = ob6.a0("ClearSearchSingleChatAlertText", null, 2131752018, chat.title);
                            }
                            E = -chat.id;
                        } else if (I instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) I;
                            if (user.id == getUserConfig().n) {
                                idVar.U = ob6.a0("ClearSearchSingleChatAlertText", null, 2131752018, ob6.M0(2131745629, null));
                            } else {
                                idVar.U = ob6.a0("ClearSearchSingleUserAlertText", null, 2131752016, lv2.m(0, user.first_name, user.last_name));
                            }
                            E = user.id;
                        } else if (I instanceof TLRPC.EncryptedChat) {
                            TLRPC.User X1 = getMessagesController().X1(Long.valueOf(((TLRPC.EncryptedChat) I).user_id));
                            idVar.U = ob6.a0("ClearSearchSingleUserAlertText", null, 2131752016, lv2.m(0, X1.first_name, X1.last_name));
                            E = wf3.E(r14.id);
                        }
                        alertDialog$Builder.j(ob6.M0(2131752020, null), new i02((Object) this, E, (byte) (c == true ? 1 : 0)));
                        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                        showDialog(idVar);
                        TextView textView = (TextView) idVar.c(-1);
                        if (textView != null) {
                            yob.X(textView, aob.q7, getResourceProvider());
                        }
                        return true;
                    }
                    bj3Var = bj3Var2;
                }
                if (bj3Var == null || c79Var != (gx9Var = bj3Var.e0)) {
                    Object J = ((gk3) c79Var).J(i);
                    if (J instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                        if (this.n2) {
                            if ((this.T0 == 3 || e3()) && H5(dialog.id)) {
                                if (this.T0 != 1 || !e3() || !this.o2 || !getMessagesController().v2(dialog.id)) {
                                    A2(dialog.id, view);
                                    y5();
                                    return true;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -dialog.id);
                                bundle.putBoolean("for_select", true);
                                bundle.putBoolean("forward_to", true);
                                bundle.putBoolean("bot_share_to", this.T0 == 1);
                                bundle.putBoolean("quote", this.P0);
                                bundle.putBoolean("reply_to", this.O0);
                                tzb tzbVar = new tzb(bundle);
                                tzbVar.M0 = this;
                                presentFragment(tzbVar);
                                return false;
                            }
                        } else {
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                B4(view);
                                return false;
                            }
                            if (!this.actionBar.z() || !H3(dialog)) {
                                h5(dialog.id, view);
                                return true;
                            }
                        }
                    }
                } else {
                    if (this.n2) {
                        C4(view, i, c79Var);
                        return false;
                    }
                    long dialogId = (!(view instanceof bv8) || gx9Var.N(i)) ? 0L : ((bv8) view).getDialogId();
                    if (dialogId != 0) {
                        h5(dialogId, view);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void D5(float f) {
        float f2;
        float f3;
        float i = Utilities.i(this.z1 * 2.0f, 1.0f, 0.0f);
        ii3 ii3Var = this.F0;
        float f4 = (1.0f - this.w3) * f * this.I0;
        float f5 = 1.0f - i;
        ii3Var.setAlpha(f4 * f5);
        if (this.L || this.N) {
            float i2 = Utilities.i((-this.O) / hl.L(81.0f), 1.0f, 0.0f);
            if (this.w3 == 1.0f) {
                i2 = 1.0f;
            }
            float i3 = Utilities.i(i2 / 0.5f, 1.0f, 0.0f);
            this.F0.setClipTop(0);
            if (this.L || !this.N) {
                this.F0.setTranslationY(((this.U / 2.0f) + (Math.max(this.O, -r3()) + this.y3)) - hl.L(8.0f));
                this.F0.l(!this.H3.c(), i2);
                if (this.N) {
                    f2 = 1.0f - i3;
                    this.actionBar.setTranslationY(0.0f);
                } else {
                    f3 = this.I0;
                }
            } else {
                this.F0.setTranslationY((-hl.L(81.0f)) - hl.L(8.0f));
                this.F0.setProgressToCollapse(1.0f);
                f3 = this.I0;
            }
            f2 = 1.0f - f3;
            this.actionBar.setTranslationY(0.0f);
        } else {
            if (this.M) {
                this.F0.setTranslationY((Math.max(this.O, -r3()) + (-hl.L(81.0f))) - hl.L(8.0f));
                this.F0.setProgressToCollapse(1.0f);
                ii3 ii3Var2 = this.F0;
                ii3Var2.setClipTop((int) (hl.m - ii3Var2.getY()));
            }
            f2 = 1.0f - this.I0;
            this.actionBar.setTranslationY(0.0f);
        }
        float f6 = f2 * f5;
        a aVar = this.actionBar;
        if (f6 == 1.0f) {
            aVar.getTitlesContainer().setScaleY(1.0f);
            this.actionBar.getTitlesContainer().setScaleX(1.0f);
            this.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
            this.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
            float f7 = 1.0f - this.w3;
            this.actionBar.getTitlesContainer().setAlpha(f7);
            this.actionBar.getTitlesContainer().setVisibility(f7 > 0.0f ? 0 : 4);
            this.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f7);
            this.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f7 <= 0.0f ? 4 : 0);
            return;
        }
        aVar.getTitlesContainer().setPivotY(hl.m);
        this.actionBar.getTitlesContainer().setPivotX(hl.L(20.0f));
        float f8 = (0.6f * f6) + 0.4f;
        this.actionBar.getTitlesContainer().setScaleY(f8);
        this.actionBar.getTitlesContainer().setScaleX(f8);
        this.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
        this.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-hl.L(30.0f));
        this.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f8);
        this.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f8);
        float f9 = (1.0f - this.w3) * f6;
        this.actionBar.getTitlesContainer().setAlpha(f9);
        this.actionBar.getTitlesContainer().setVisibility(f9 > 0.0f ? 0 : 4);
        this.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f9);
        this.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f9 <= 0.0f ? 4 : 0);
    }

    public final String E2() {
        ArrayList arrayList = this.K2;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() >= 3) {
            return ob6.G(arrayList.size(), "ShareSendToMany", new Object[0]);
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            long longValue = ((Long) obj).longValue();
            if (sb.length() > 0) {
                sb.append(", ");
            }
            if (longValue == getUserConfig().e()) {
                sb.append(ob6.M0(2131745629, null));
            } else {
                int size2 = arrayList.size();
                int i2 = this.currentAccount;
                sb.append(size2 == 1 ? wf3.k(i2, longValue) : wf3.r(i2, longValue));
            }
        }
        return ob6.a0(null, null, 2131745167, sb.toString());
    }

    public final boolean E3() {
        return this.A0 != null && this.T0 == 0 && !this.n2 && this.Y2 == 0 && this.a3 == 0 && getMessagesController().l2();
    }

    public final void E4(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i = 0; i < 4; i++) {
            if (yac.h(i).o()) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        Collections.sort(arrayList, new f03((byte) 12));
        fu5 I = fu5.I(this, view);
        if (arrayList.size() > 0) {
            if (I.y() > 0) {
                I.j();
            }
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                int intValue = ((Integer) obj).intValue();
                boolean z = this.currentAccount == intValue;
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                int i3 = aob.i6;
                Drawable Y = aob.Y(getThemedColor(i3), 0, 0);
                uob M = yob.M(i3);
                vnb resourceProvider = getResourceProvider();
                linearLayout.setBackground(Y);
                yob.j(linearLayout, Y, null, M, resourceProvider);
                TLRPC.User f = yac.h(intValue).f();
                rb0 rb0Var = new rb0((vnb) null);
                rb0Var.q(f);
                gj3 gj3Var = new gj3(this, getParentActivity(), z);
                linearLayout.addView(gj3Var, tre.t(34, 34, 16, 12, 0, 0, 0));
                de0 de0Var = new de0(getParentActivity());
                if (z) {
                    de0Var.setScaleX(0.833f);
                    de0Var.setScaleY(0.833f);
                }
                de0Var.setRoundRadius(hl.L(16.0f));
                de0Var.getImageReceiver().d = intValue;
                de0Var.f(f, rb0Var);
                gj3Var.addView(de0Var, tre.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                yob.X(textView, aob.j5, getResourceProvider());
                textView.setText(lbc.r(f));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, tre.q(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new ae((Object) this, intValue, (Object) I, (byte) 7));
                I.q(linearLayout, tre.o(230, 48));
            }
        }
        ShapeDrawable b0 = aob.b0(hl.L(24.0f), getThemedColor(aob.d6));
        b0.getPaint().setShadowLayer(hl.L(6.0f), 0.0f, hl.L(1.0f), aob.p1(0.15f, -16777216));
        I.z.set(-hl.L(4.0f), -hl.L(4.0f), -hl.L(4.0f), -hl.L(4.0f));
        I.X(b0);
        I.b0(0.0f, -hl.L(4.0f));
        I.W(5);
        I.a0();
    }

    public final void E5(boolean z) {
        a aVar;
        boolean z2;
        c6b v3;
        ArrayList arrayList;
        if (this.F0 == null || this.J != null) {
            return;
        }
        li3 li3Var = this.H3;
        if ((li3Var != null && li3Var.c()) || this.s3 || (aVar = this.actionBar) == null || aVar.z() || this.n2) {
            return;
        }
        rbb rbbVar = rbb.G2;
        int i = 0;
        if ((rbbVar != null && rbbVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().K0)) {
            z = false;
        }
        boolean z3 = !F3() && v3().H();
        if (this.a3 != 0) {
            z2 = false;
        } else if (F3()) {
            z2 = !v3().h.isEmpty();
        } else {
            z2 = !z3 && (((arrayList = (v3 = v3()).g) != null && arrayList.size() > 0) || v3.I());
            z3 = v3().H();
        }
        this.M = z3;
        boolean z4 = this.H0;
        boolean z5 = z3 || z2;
        this.H0 = z5;
        if (z2 || z5) {
            this.F0.p(z, z5 != z4);
        }
        boolean z6 = this.H0;
        byte b = 2;
        byte b2 = 8;
        if (z6 != z4) {
            if (z) {
                ValueAnimator valueAnimator = this.K;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (this.H0 && !isInPreviewMode()) {
                    this.F0.setVisibility(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I0, this.H0 ? 1.0f : 0.0f);
                this.K = ofFloat;
                ofFloat.addUpdateListener(new ce0(this, (byte) 4));
                this.K.addListener(new cn2(this, b2));
                this.K.setDuration(200L);
                this.K.setInterpolator(k43.f);
                this.K.start();
            } else {
                this.F0.setVisibility((!z6 || isInPreviewMode()) ? 8 : 0);
                this.I0 = this.H0 ? 1.0f : 0.0f;
                View view = this.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (z2 != this.N) {
            this.N = z2;
            if (z2) {
                this.F0.l(false, 1.0f);
            }
            if (z && !isInPreviewMode()) {
                this.F0.setVisibility(0);
                float f = -this.O;
                float q3 = z2 ? 0.0f : q3();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.J = ofFloat2;
                ofFloat2.addUpdateListener(new zi3(this, f, z2, q3));
                this.J.addListener(new ri3(this, z2, b));
                this.J.setDuration(200L);
                this.J.setInterpolator(k43.f);
                this.J.start();
                return;
            }
            this.L = z2;
            ii3 ii3Var = this.F0;
            if ((z2 || this.M) && !isInPreviewMode()) {
                b2 = 0;
            }
            ii3Var.setVisibility(b2);
            if (z2) {
                this.A3 = -hl.L(81.0f);
                W4(-q3());
            } else {
                W4(0.0f);
            }
            while (true) {
                tj3[] tj3VarArr = this.f0;
                if (i >= tj3VarArr.length) {
                    break;
                }
                tj3 tj3Var = tj3VarArr[i];
                if (tj3Var != null) {
                    tj3Var.a.requestLayout();
                }
                i++;
            }
            View view2 = this.fragmentView;
            if (view2 != null) {
                view2.requestLayout();
                this.fragmentView.invalidate();
            }
        }
    }

    public final int F2() {
        if (this.D1 != null) {
            return (int) (this.A1.getInputBubbleHeight() + this.w.d() + hl.L(9.0f) + hl.L(7.0f) + hl.L(2.0f));
        }
        long j = this.a3;
        int i = this.m4;
        return j != 0 ? hl.L(72.0f) + i : i + this.o4;
    }

    public final boolean F3() {
        return this.Y2 == 1;
    }

    public final void F4() {
        try {
            ((b29) ((rb0) this.O1.h.getImageReceiver().n0).K).C(true);
        } catch (Exception unused) {
        }
        byte b = 0;
        if (this.h4 == null) {
            zn5 zn5Var = new zn5(0, true, true);
            this.h4 = zn5Var;
            zn5Var.I = true;
            zn5Var.a = this;
            zn5Var.b = new fj3(this);
            getMediaDataController().z();
            getMessagesController().l3();
            getMessagesController().o3(this.classGuid, getUserConfig().f(), true);
        }
        TLRPC.User X1 = uc7.s1(this.currentAccount).X1(Long.valueOf(yac.h(this.currentAccount).e()));
        if (X1 == null) {
            X1 = yac.h(this.currentAccount).f();
        }
        if (X1 == null) {
            return;
        }
        n12 n12Var = this.h4.c;
        if (n12Var != null) {
            n12Var.I0();
        }
        zn5 zn5Var2 = this.h4;
        TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
        zn5Var2.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new rg3(this, (byte) 5), new tg3(this, b), 0);
    }

    public final void F5(int i, boolean z) {
        if (this.A0 == null || this.T0 != 0 || this.n2) {
            return;
        }
        this.U3 = i;
        ac7 x3 = x3();
        this.U3 = -1;
        boolean z2 = false;
        boolean z3 = x3 != null && getMessagesController().T0().size() > 1 && getMessagesController().u2(x3);
        ij3 ij3Var = this.A0;
        if (z && ij3Var.getVisibility() == 0) {
            z2 = true;
        }
        ij3Var.m(z3, z2);
    }

    public final boolean G2() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.K2;
            if (i >= arrayList.size()) {
                return true;
            }
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-((Long) arrayList.get(i)).longValue()));
            if (M0 != null && !xc2.l(M0)) {
                return false;
            }
            i++;
        }
    }

    public final boolean G3(long j) {
        if (j < 0) {
            return false;
        }
        TLRPC.User X1 = getMessagesController().X1(Long.valueOf(j));
        if (!lbc.w(X1)) {
            return false;
        }
        ArrayList l = uc7.s1(this.currentAccount).g4.l(-X1.id);
        return (l == null || l.isEmpty()) && uc7.s1(this.currentAccount).g4.e(-X1.id);
    }

    public final void G4() {
        if (this.R3) {
            kg5 kg5Var = this.q0;
            if (kg5Var != null) {
                kg5Var.f(true);
            }
            xx n = uc7.s1(this.currentAccount).O1().n();
            if (n != null && n.a(this.currentAccount, 1)) {
                showDialog(new l46(n.b(), this.currentAccount, null, getParentActivity(), this));
                return;
            } else {
                rbb C = rbb.C(getParentActivity(), this.currentAccount);
                C.y = new ci3(this);
                C.Q(null);
                return;
            }
        }
        kg5 kg5Var2 = this.r0;
        if (kg5Var2 != null) {
            if (kg5Var2.W) {
                return;
            } else {
                hl.B2(kg5Var2);
            }
        }
        SpannableStringBuilder N2 = hl.N2(ob6.N0("StoriesPremiumHint2").replace('\n', ' '), aob.xj, 0, new ch3(this, (byte) 16), null);
        kg5 kg5Var3 = new kg5(getParentActivity(), 2);
        kg5Var3.q(8.0f);
        kg5Var3.d = 8000L;
        kg5Var3.j(true);
        kg5Var3.p(true);
        kg5Var3.h = hl.q.x - hl.L(148.0f);
        kg5Var3.t(N2);
        kg5Var3.n(1.0f, -40.0f);
        kg5Var3.i(getThemedColor(aob.wj));
        this.r0 = kg5Var3;
        kg5Var3.setTranslationY((-this.m4) - this.o4);
        ((ViewGroup) this.fragmentView).addView(this.r0, tre.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
        this.r0.v();
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G5(int i, boolean z) {
        RecyclerView recyclerView;
        int i2;
        int childCount;
        int i3;
        int i4 = 131072;
        if (this.U1) {
            int i5 = uc7.r5;
            if ((i & 131072) == 0) {
                return;
            }
        }
        if (this.isPaused) {
            return;
        }
        int i6 = 0;
        while (i6 < 3) {
            if (i6 == 2) {
                bj3 bj3Var = this.D0;
                recyclerView = bj3Var != null ? bj3Var.b0 : null;
            } else {
                tj3[] tj3VarArr = this.f0;
                if (tj3VarArr != null) {
                    qj3 qj3Var = i6 < tj3VarArr.length ? tj3VarArr[i6].a : null;
                    if (qj3Var != null) {
                        r6 = tj3VarArr[i6].getVisibility() == 0 ? this.f0[i6] : null;
                    }
                    recyclerView = qj3Var;
                }
                i2 = i6;
                i6 = i2 + 1;
                i4 = 131072;
            }
            if (recyclerView != null && recyclerView.getAdapter() != null) {
                int i7 = uc7.r5;
                if (((i & 2048) != 0 || i == 0) && r6 != null) {
                    r6.b(false);
                } else {
                    int childCount2 = recyclerView.getChildCount();
                    int i8 = 0;
                    while (i8 < childCount2) {
                        View childAt = recyclerView.getChildAt(i8);
                        boolean z2 = childAt instanceof of3;
                        ArrayList arrayList = this.K2;
                        if (z2 && (this.D0 == null || recyclerView.getAdapter() != this.D0.e0)) {
                            of3 of3Var = (of3) childAt;
                            int i9 = uc7.r5;
                            if ((i & i4) != 0) {
                                of3Var.b0(this.actionBar.z(), true);
                                if (this.U1) {
                                    i2 = i6;
                                    i8++;
                                    i6 = i2;
                                    i4 = 131072;
                                }
                            }
                            if ((65536 & i) != 0) {
                                of3Var.d0(false, (i & TLObject.FLAG_13) != 0);
                            } else {
                                if ((i & 512) == 0) {
                                    i2 = i6;
                                    if (of3Var.j0(i, z)) {
                                        r6.b(false);
                                        break;
                                    }
                                } else if (this.f0[i6].a() && hl.O1()) {
                                    i2 = i6;
                                    of3Var.setDialogSelected(of3Var.getDialogId() == this.r2.a);
                                } else {
                                    i2 = i6;
                                }
                                if (arrayList != null) {
                                    of3Var.d0(arrayList.contains(Long.valueOf(of3Var.getDialogId())), false);
                                }
                                if (!(childAt instanceof vac)) {
                                    ((vac) childAt).i(i);
                                } else if (childAt instanceof bv8) {
                                    bv8 bv8Var = (bv8) childAt;
                                    bv8Var.D(i);
                                    if (arrayList != null) {
                                        bv8Var.A(arrayList.contains(Long.valueOf(bv8Var.getDialogId())), false);
                                    }
                                }
                                if (!this.U1 && (childAt instanceof d79)) {
                                    d79 d79Var = (d79) childAt;
                                    childCount = d79Var.getChildCount();
                                    for (i3 = 0; i3 < childCount; i3++) {
                                        View childAt2 = d79Var.getChildAt(i3);
                                        if (childAt2 instanceof fg5) {
                                            ((fg5) childAt2).b(i);
                                        }
                                    }
                                }
                                i8++;
                                i6 = i2;
                                i4 = 131072;
                            }
                        }
                        i2 = i6;
                        if (!(childAt instanceof vac)) {
                        }
                        if (!this.U1) {
                            d79 d79Var2 = (d79) childAt;
                            childCount = d79Var2.getChildCount();
                            while (i3 < childCount) {
                            }
                        }
                        i8++;
                        i6 = i2;
                        i4 = 131072;
                    }
                }
            }
            i2 = i6;
            i6 = i2 + 1;
            i4 = 131072;
        }
    }

    public final void H2() {
        int themedColor;
        mj8 mj8Var;
        xh3 xh3Var;
        gx9 gx9Var;
        qob qobVar;
        bj3 bj3Var = this.D0;
        if (bj3Var != null && (gx9Var = bj3Var.e0) != null && (qobVar = gx9Var.l0) != null) {
            int childCount = qobVar.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = qobVar.getChildAt(i);
                if (childAt instanceof fg5) {
                    fg5 fg5Var = (fg5) childAt;
                    rb0 rb0Var = fg5Var.c;
                    boolean D = wf3.D(fg5Var.f);
                    int i2 = fg5Var.h;
                    if (D) {
                        TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(fg5Var.f));
                        fg5Var.e = X1;
                        rb0Var.q(X1);
                    } else {
                        rb0Var.p(uc7.s1(i2).M0(Long.valueOf(-fg5Var.f)));
                        fg5Var.e = null;
                    }
                    fg5Var.c(true);
                }
            }
        }
        if (this.f0 != null) {
            int i3 = 0;
            while (true) {
                tj3[] tj3VarArr = this.f0;
                if (i3 >= tj3VarArr.length) {
                    break;
                }
                tj3 tj3Var = tj3VarArr[i3];
                if (tj3Var != null && (xh3Var = tj3Var.n) != null) {
                    xh3Var.h();
                }
                i3++;
            }
        }
        a aVar = this.actionBar;
        if (aVar != null) {
            aVar.I(getThemedColor(aob.G8), true);
            this.actionBar.J(getThemedColor(aob.E8), false, true);
            this.actionBar.J(getThemedColor(aob.F8), true, true);
            this.actionBar.K(getThemedColor(aob.I5), true);
            this.actionBar.updateColors();
        }
        if (this.F3 != null) {
            int themedColor2 = getThemedColor(aob.qi);
            Drawable drawable = this.M3;
            if (drawable != null && themedColor2 != this.D4) {
                this.D4 = themedColor2;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
            }
            ul ulVar = this.F3;
            if (ulVar != null) {
                ulVar.k(Integer.valueOf(themedColor2));
            }
            zm zmVar = this.G3;
            if (zmVar != null) {
                zmVar.setColor(themedColor2);
            }
        }
        uk3 uk3Var = this.O1;
        if (uk3Var != null) {
            aob.F1(uk3Var.getBackground(), aob.w0(null, aob.i6, false), true);
        }
        s7 s7Var = this.n0;
        if (s7Var != null) {
            s7Var.setIconColor(getThemedColor(aob.v8));
        }
        bi3 bi3Var = this.D1;
        if (bi3Var != null) {
            bi3Var.updateColors();
        }
        ij3 ij3Var = this.A0;
        if (ij3Var != null) {
            jl0 jl0Var = ij3Var.G0;
            if (jl0Var != null) {
                jl0Var.updateColors();
            }
            jo0 jo0Var = ij3Var.A0;
            if (jo0Var != null) {
                jo0Var.g();
            }
            ij3Var.invalidate();
        }
        rh4 rh4Var = this.c0;
        if (rh4Var != null) {
            rh4Var.updateColors();
        }
        bj3 bj3Var2 = this.D0;
        if (bj3Var2 != null && (mj8Var = bj3Var2.s0) != null) {
            mj8Var.c();
        }
        uic uicVar = this.b0;
        if (uicVar != null) {
            uicVar.updateColors();
        }
        ew9 ew9Var = this.a0;
        if (ew9Var != null) {
            ew9Var.updateColors();
        }
        if (this.L0 != null) {
            int o = vm2.o(getThemedColor(aob.d6), 100);
            boolean z = this.L0.getForeground() instanceof ColorDrawable;
            tb tbVar = this.L0;
            if (!z) {
                tbVar.setForeground(new ColorDrawable(o));
            } else if (((ColorDrawable) tbVar.getForeground()).getColor() != o) {
                ((ColorDrawable) this.L0.getForeground()).setColor(o);
            }
        }
        zp4 zp4Var = this.u0;
        if (zp4Var != null) {
            zp4Var.updateColors();
        }
        zp4 zp4Var2 = this.v0;
        if (zp4Var2 != null) {
            zp4Var2.updateColors();
        }
        int i4 = aob.d6;
        this.t4.a(getThemedColor(i4));
        xj3 xj3Var = this.L1;
        if (xj3Var != null) {
            xj3Var.updateColors();
        }
        wj3 wj3Var = this.M1;
        if (wj3Var != null) {
            wj3Var.setColor(aob.w0(null, i4, false));
        }
        zh3 zh3Var = this.J1;
        if (zh3Var != null) {
            zh3Var.updateColors();
        }
        zh3 zh3Var2 = this.H1;
        if (zh3Var2 != null) {
            zh3Var2.updateColors();
        }
        x5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        ii3 ii3Var = this.F0;
        if (ii3Var != null) {
            ii3Var.o();
        }
        if (this.E3 != null && (themedColor = getThemedColor(aob.Xl)) != this.C4) {
            this.C4 = themedColor;
            this.E3.setColorFilter(themedColor, PorterDuff.Mode.MULTIPLY);
        }
        hj3 hj3Var = this.Y;
        if (hj3Var != null) {
            hj3Var.updateColors();
        }
    }

    public final boolean H3(TLRPC.Dialog dialog) {
        if (dialog != null) {
            int i = this.f0[0].s;
            ac7 ac7Var = null;
            if ((i == 7 || i == 8) && (!this.actionBar.z() || this.actionBar.A(null))) {
                ac7Var = getMessagesController().N[this.f0[0].s == 8 ? (char) 1 : (char) 0];
            }
            if (ac7Var == null) {
                return dialog.pinned;
            }
            if (ac7Var.j.indexOfKey(dialog.id) >= 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean H4(tj3 tj3Var, TLRPC.Dialog dialog) {
        TLRPC.EncryptedChat a1;
        if (tj3Var != null && dialog != null) {
            if (!getMessagesController().o4.containsKey(Long.valueOf(dialog.id))) {
                if (K3(tj3Var)) {
                    return true;
                }
                ac7 s3 = s3(tj3Var);
                if (s3 != null) {
                    int i = s3.g;
                    int i2 = uc7.r5;
                    if ((i & 64) != 0) {
                        int i3 = this.currentAccount;
                        long j = dialog.id;
                        if (wf3.B(j) && (a1 = uc7.s1(i3).a1(Integer.valueOf((int) (4294967295L & j)))) != null) {
                            j = a1.user_id;
                        }
                        if (!s3.h.contains(Long.valueOf(j))) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean H5(long j) {
        TLRPC.Chat M0;
        bi3 bi3Var;
        if ((this.U0 <= 1 && ((bi3Var = this.D1) == null || bi3Var.getVisibility() != 0 || TextUtils.isEmpty(this.D1.getFieldText()))) || !wf3.y(j) || (M0 = getMessagesController().M0(Long.valueOf(-j))) == null || xc2.N(M0) || !M0.slowmode_enabled) {
            return true;
        }
        jj.r0(this, ob6.M0(2131745038, null), ob6.M0(2131745030, null), null);
        return false;
    }

    public final void I2() {
        hl.d3(new rg3(this, (byte) 7), 300L);
    }

    public final boolean I3(int i) {
        if (i == 0) {
            return E3();
        }
        if ((i == 7 || i == 8) && this.T0 == 0) {
            if (getMessagesController().u2(getMessagesController().N[i == 8 ? (char) 1 : (char) 0])) {
                return true;
            }
        }
        return false;
    }

    public final boolean I4(tj3 tj3Var) {
        if (tj3Var == null) {
            return false;
        }
        if (K3(tj3Var)) {
            return true;
        }
        ac7 s3 = s3(tj3Var);
        if (s3 != null) {
            int i = s3.g;
            int i2 = uc7.r5;
            if ((i & 64) != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean J2(tj3 tj3Var) {
        if (this.H3.c()) {
            return false;
        }
        int i = (int) (-this.O);
        int q3 = q3();
        int r3 = r3();
        if (i == 0 || i == q3 || i == r3 || !tj3Var.a.canScrollVertically(-1)) {
            return false;
        }
        if (r3 >= i || i >= q3) {
            float i2 = this.w3 != 1.0f ? Utilities.i((-this.O) / hl.L(81.0f), 1.0f, 0.0f) : 1.0f;
            float f = this.F0.C0;
            lp lpVar = tj3Var.b;
            if (i2 < f) {
                lpVar.z(-i);
                return true;
            }
            lpVar.z(r3 - i);
            return true;
        }
        int L = hl.L(48.0f);
        int i3 = i - r3;
        int i4 = L / 2;
        lp lpVar2 = tj3Var.b;
        if (i3 < i4) {
            lpVar2.z(-i3);
            return true;
        }
        lpVar2.z(L - i3);
        return true;
    }

    public final boolean J3() {
        return this.E2 == null && this.p2 == null;
    }

    public final void J4(int i, long j, TLRPC.Chat chat, boolean z, boolean z2) {
        if (i == 103) {
            getMessagesController().V(1, j, z2);
            return;
        }
        if (chat == null) {
            getMessagesController().V(0, j, z2);
            if (z && z2) {
                getMessagesController().u(j);
            }
        } else if (xc2.r0(chat)) {
            getMessagesController().V(0, j, z2);
        } else {
            getMessagesController().e0(-j, getMessagesController().X1(Long.valueOf(getUserConfig().e())), null, z2, false);
        }
        if (hl.O1()) {
            getNotificationCenter().k(jn7.s, Long.valueOf(j));
        }
        getMessagesController().H(this.Y2);
    }

    public final boolean K2(long j) {
        int i;
        int i2 = this.T0;
        if (i2 == 15 || i2 == 16 || this.j2 != null || !this.u2) {
            return true;
        }
        if (!wf3.y(j)) {
            if (!wf3.B(j)) {
                return true;
            }
            if (this.V0 == 0 && !this.W0) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = ob6.M0(2131745324, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            int i3 = this.V0;
            if (i3 == 3) {
                idVar.U = ob6.M0(2131743743, null);
            } else if (i3 != 0) {
                idVar.U = ob6.M0(2131746903, null);
            } else {
                idVar.U = ob6.M0(2131748858, null);
            }
            alertDialog$Builder.g(ob6.M0(2131747558, null), null);
            showDialog(idVar);
            return false;
        }
        long j2 = -j;
        TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(j2));
        if (!xc2.T(M02) || M02.megagroup) {
            return true;
        }
        if (!this.s2) {
            TLRPC.Chat M03 = uc7.s1(this.currentAccount).M0(Long.valueOf(j2));
            if ((xc2.n(M03) || M03.megagroup) && (i = this.V0) != 2 && i != 3) {
                return true;
            }
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
        String M04 = ob6.M0(2131745324, null);
        id idVar2 = alertDialog$Builder2.a;
        idVar2.S = M04;
        int i4 = this.V0;
        if (i4 == 3) {
            idVar2.U = ob6.M0(2131743744, null);
        } else if (i4 == 2) {
            idVar2.U = ob6.M0(2131746314, null);
        } else {
            idVar2.U = ob6.M0(2131752414, null);
        }
        alertDialog$Builder2.g(ob6.M0(2131747558, null), null);
        showDialog(idVar2);
        return false;
    }

    public final boolean K3(tj3 tj3Var) {
        return tj3Var != null && I3(tj3Var.s);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void K4(java.util.ArrayList r45, int r46, boolean r47, boolean r48, java.util.HashSet r49) {
        /*
            Method dump skipped, instructions count: 2667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uj3.K4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
    }

    public final void L2(boolean z) {
        ko2 ko2Var;
        TLRPC.ChatFull chatFull;
        xj3 xj3Var = this.L1;
        if (xj3Var == null || (ko2Var = this.S1) == null || (chatFull = this.c3) == null) {
            return;
        }
        xj3Var.j(ko2Var, (this.a3 == 0 || chatFull.requests_pending <= 0 || this.b.f) ? false : true, z);
        this.S1.setTitle(ob6.G(this.c3.requests_pending, "CommunityPendingRequestsRow", new Object[0]));
    }

    public final void L3() {
        c21 c21Var = new c21(getParentActivity(), this.resourceProvider);
        c21Var.h(R.raw.email_check_inbox, new String[0]);
        c21Var.b.setText(ob6.M0(2131742442, null));
        v21.g(this, c21Var, 2750).j();
        try {
            this.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void L4(long j, boolean z, ac7 ac7Var, int i, boolean z2) {
        boolean z3;
        int i2;
        boolean K3;
        int i3 = 0;
        int i4 = (this.f0[0].s == 0 && y3() && this.f0[0].w == 2) ? 1 : 0;
        int K0 = this.f0[0].c.K0();
        if (ac7Var != null) {
            int i5 = ac7Var.j.get(j, TLObject.FLAG_31);
            if (!z && i5 == Integer.MIN_VALUE) {
                return;
            }
        }
        int i6 = -1;
        if (K0 > i4 || !z2) {
            z3 = true;
        } else {
            U4(true, true);
            I2();
            if (this.T1 != null) {
                for (int i7 = 0; i7 < this.T1.size(); i7++) {
                    if (((TLRPC.Dialog) this.T1.get(i7)).id == j) {
                        i2 = i7;
                        z3 = false;
                        break;
                    }
                }
            }
            z3 = false;
        }
        i2 = -1;
        if (ac7Var != null) {
            LongSparseIntArray longSparseIntArray = ac7Var.j;
            if (z) {
                longSparseIntArray.put(j, i);
            } else {
                longSparseIntArray.delete(j);
            }
            if (z2) {
                getMessagesController().F3(ac7Var);
            }
            K3 = true;
        } else {
            K3 = getMessagesController().K3(j, z, null, -1L);
        }
        if (K3) {
            if (z3) {
                if (this.T0 != 10) {
                    B3(false);
                }
                R4(true, false);
            } else {
                ArrayList o3 = o3(this.currentAccount, this.f0[0].s, this.Y2, false);
                int i8 = 0;
                while (true) {
                    if (i8 >= o3.size()) {
                        break;
                    }
                    if (((TLRPC.Dialog) o3.get(i8)).id == j) {
                        i6 = i8;
                        break;
                    }
                    i8++;
                }
            }
        }
        if (z3) {
            return;
        }
        if (i2 >= 0) {
            ArrayList arrayList = this.T1;
            if (arrayList != null && i6 >= 0 && i2 != i6) {
                arrayList.add(i6, (TLRPC.Dialog) arrayList.remove(i2));
                this.f0[0].y.D();
                this.f0[0].b(true);
                tj3 tj3Var = this.f0[0];
                uh3 uh3Var = tj3Var.c;
                if (tj3Var.s == 0 && y3() && this.f0[0].w == 2) {
                    i3 = 1;
                }
                uh3Var.g1(i3, (int) this.O);
                return;
            }
            if (i6 >= 0 && i2 == i6) {
                hl.d3(new rg3(this, (byte) 26), 200L);
                return;
            }
        }
        U4(false, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e9, code lost:
    
        if (getMessagesController().U1.get(r14.Y2) != false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0113 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M2(tj3 tj3Var) {
        final boolean z;
        final boolean z2;
        final boolean z3;
        final boolean z4;
        int i;
        int K0 = tj3Var.c.K0();
        int M0 = tj3Var.c.M0();
        if (this.j3 || this.o3) {
            return;
        }
        ij3 ij3Var = this.A0;
        if (ij3Var != null && ij3Var.getVisibility() == 0 && this.A0.Q) {
            return;
        }
        int abs = Math.abs(M0 - K0) + 1;
        if (M0 != -1) {
            f89 L = tj3Var.a.L(M0);
            boolean z5 = L != null && L.f == 11;
            this.d2 = z5;
            if (z5) {
                B3(false);
            }
        } else {
            this.d2 = false;
        }
        int i2 = tj3Var.s;
        if (i2 == 7 || i2 == 8) {
            ArrayList T0 = getMessagesController().T0();
            int i3 = tj3Var.h;
            if (i3 >= 0 && i3 < T0.size()) {
                int i4 = ((ac7) T0.get(tj3Var.h)).g;
                int i5 = uc7.r5;
                if ((i4 & 128) == 0 && ((abs > 0 && M0 >= o3(this.currentAccount, tj3Var.s, 1, this.U1).size() - 10) || (abs == 0 && !getMessagesController().U1.get(1)))) {
                    boolean z6 = getMessagesController().U1.get(1);
                    boolean z7 = !z6;
                    z = (z6 && getMessagesController().V1.get(1)) ? false : true;
                    z2 = z7;
                    if (abs > 0 || M0 < o3(this.currentAccount, tj3Var.s, this.Y2, this.U1).size() - 10) {
                        if (abs == 0 && ((i = tj3Var.s) == 7 || i == 8 || K3(tj3Var))) {
                        }
                        z3 = false;
                        z4 = false;
                        if (!z3 || z) {
                            hl.c3(new Runnable() { // from class: hh3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    uj3 uj3Var = uj3.this;
                                    if (z3) {
                                        uj3Var.getMessagesController().d3(uj3Var.Y2, -1, 100, z4, null);
                                    }
                                    if (z) {
                                        uj3Var.getMessagesController().d3(1, -1, 100, z2, null);
                                    }
                                }
                            });
                        }
                        return;
                    }
                    boolean z8 = getMessagesController().U1.get(this.Y2);
                    boolean z9 = !z8;
                    if (z8) {
                        if (getMessagesController().V1.get(this.Y2)) {
                            z4 = z9;
                            z3 = false;
                            if (z3) {
                            }
                            hl.c3(new Runnable() { // from class: hh3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    uj3 uj3Var = uj3.this;
                                    if (z3) {
                                        uj3Var.getMessagesController().d3(uj3Var.Y2, -1, 100, z4, null);
                                    }
                                    if (z) {
                                        uj3Var.getMessagesController().d3(1, -1, 100, z2, null);
                                    }
                                }
                            });
                        }
                    }
                    z4 = z9;
                    z3 = true;
                    if (z3) {
                    }
                    hl.c3(new Runnable() { // from class: hh3
                        @Override // java.lang.Runnable
                        public final void run() {
                            uj3 uj3Var = uj3.this;
                            if (z3) {
                                uj3Var.getMessagesController().d3(uj3Var.Y2, -1, 100, z4, null);
                            }
                            if (z) {
                                uj3Var.getMessagesController().d3(1, -1, 100, z2, null);
                            }
                        }
                    });
                }
            }
        }
        z = false;
        z2 = false;
        if (abs > 0) {
        }
        if (abs == 0) {
        }
        z3 = false;
        z4 = false;
        if (z3) {
        }
        hl.c3(new Runnable() { // from class: hh3
            @Override // java.lang.Runnable
            public final void run() {
                uj3 uj3Var = uj3.this;
                if (z3) {
                    uj3Var.getMessagesController().d3(uj3Var.Y2, -1, 100, z4, null);
                }
                if (z) {
                    uj3Var.getMessagesController().d3(1, -1, 100, z2, null);
                }
            }
        });
    }

    public final void M3(int i) {
        b8c G = this.D0.r0.G(i);
        Object obj = G != null ? G.H : null;
        if (obj instanceof TLRPC.User) {
            int i2 = this.currentAccount;
            long j = ((TLRPC.User) obj).id;
            e e0 = rr0.e0(i2, j);
            if (e0 == null) {
                e0 = ProfileActivity.Q2(j);
            }
            presentFragment(e0);
            return;
        }
        if (obj instanceof r47) {
            r47 r47Var = (r47) obj;
            Bundle bundle = new Bundle();
            long B0 = r47.B0(r47Var.k);
            TLRPC.Message message = r47Var.k;
            if (B0 >= 0) {
                bundle.putLong("user_id", r47.B0(message));
            } else {
                bundle.putLong("chat_id", -r47.B0(message));
            }
            bundle.putInt("message_id", r47Var.e1());
            zu1 zu1Var = new zu1(bundle);
            C3(zu1Var, r47Var);
            presentFragment(zu1Var);
        }
    }

    public final void M4() {
        if (this.L0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(aob.d6));
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / jn7.J2));
        this.L0.setBackground(new BitmapDrawable(createBitmap));
        this.L0.setAlpha(0.0f);
        this.L0.setVisibility(0);
        X2();
    }

    public final void N2() {
        getMessagesStorage().getClass();
    }

    public final void N3(int i) {
        Object obj;
        bx9 bx9Var = this.D0.r0;
        if (i < bx9Var.a0 || i >= bx9Var.b0) {
            obj = Boolean.FALSE;
        } else {
            b8c G = bx9Var.G(i);
            obj = G != null ? G.H : null;
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.resourceProvider, getParentActivity());
            String M0 = ob6.M0(2131754173, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.a0(null, null, 2131754172, "\"" + lbc.r(user) + "\"");
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            alertDialog$Builder.j(ob6.M0(2131746048, null), new q72((Object) this, (Object) user, (byte) 24));
            alertDialog$Builder.c(-1);
            alertDialog$Builder.o();
        }
    }

    public final void N4(boolean z) {
        tj3[] tj3VarArr = this.f0;
        if (tj3VarArr != null && !this.U1) {
            for (tj3 tj3Var : tj3VarArr) {
                if (tj3Var.getVisibility() == 0) {
                    if (z) {
                        sh3 sh3Var = tj3Var.y;
                        sh3Var.D();
                        sh3Var.A = true;
                    }
                    tj3Var.b(z);
                    M2(tj3Var);
                }
            }
        }
        ij3 ij3Var = this.A0;
        if (ij3Var == null || ij3Var.getVisibility() != 0) {
            return;
        }
        this.A0.d();
    }

    public final void O2() {
        if (this.f0 == null) {
            return;
        }
        int F2 = F2();
        int i = 0;
        while (true) {
            tj3[] tj3VarArr = this.f0;
            if (i >= tj3VarArr.length) {
                return;
            }
            tj3 tj3Var = tj3VarArr[i];
            if (tj3Var != null) {
                qj3 qj3Var = tj3Var.a;
                qj3Var.setPadding(0, qj3Var.g3, 0, F2);
            }
            i++;
        }
    }

    public final void O3(tj3 tj3Var, View view, int i) {
        int i2;
        if (view instanceof p55) {
            return;
        }
        boolean z = view instanceof of3;
        if (z) {
            of3 of3Var = (of3) view;
            if (of3Var.o2) {
                i5(of3Var.getDialogId(), view);
                return;
            }
        }
        if (e3()) {
            D4(view, i, 0.0f, tj3Var.d);
            return;
        }
        int i3 = this.T0;
        if (i3 == 15 && (view instanceof skb)) {
            tj3Var.d.L();
            return;
        }
        int i4 = 0;
        if ((i3 == 11 || i3 == 13) && i == 1) {
            Bundle l = bs2.l("forImport", true);
            l.putLongArray("result", new long[]{getUserConfig().e()});
            l.putInt("chatType", 4);
            String string = this.arguments.getString("importTitle");
            if (string != null) {
                l.putString("title", string);
            }
            xc5 xc5Var = new xc5(l);
            xc5Var.Z = new vh3(this);
            presentFragment(xc5Var);
            return;
        }
        if ((view instanceof uk3) && ((i2 = tj3Var.s) == 7 || i2 == 8)) {
            ek3 ek3Var = (ek3) tj3Var.d.N.get(0);
            TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = (ek3Var == null || ek3Var.a != 17) ? null : ek3Var.i;
            if (tL_chatlists_chatlistUpdates != null) {
                ac7 ac7Var = getMessagesController().N[tj3Var.s - 7];
                if (ac7Var != null) {
                    int i5 = ac7Var.a;
                    qn4 qn4Var = new qn4(this, false);
                    qn4Var.T1 = -1;
                    qn4Var.X1 = "";
                    qn4Var.Y1 = new ArrayList();
                    qn4Var.a2 = "";
                    qn4Var.c2 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    qn4Var.d2 = arrayList;
                    qn4Var.u2 = -1;
                    qn4Var.x2 = -5;
                    qn4Var.T1 = i5;
                    qn4Var.V1 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    qn4Var.b2 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList arrayList2 = getMessagesController().G0;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i4 >= arrayList2.size()) {
                                break;
                            }
                            if (((ac7) arrayList2.get(i4)).a == i5) {
                                qn4Var.X1 = ((ac7) arrayList2.get(i4)).b;
                                break;
                            }
                            i4++;
                        }
                    }
                    qn4Var.b1();
                    showDialog(qn4Var);
                    return;
                }
                return;
            }
        } else if (z && !this.actionBar.z() && !this.H3.c()) {
            ImageReceiver imageReceiver = ((of3) view).Z1;
            hl.P.set(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), imageReceiver.x());
        }
        C4(view, i, tj3Var.d);
    }

    public final void O4(tj3 tj3Var) {
        int i;
        if (tj3Var.getVisibility() != 0) {
            return;
        }
        int i2 = tj3Var.d.w;
        if (tj3Var.s == 0 && y3() && tj3Var.a.getChildCount() == 0 && tj3Var.w == 2) {
            ((x46) tj3Var.a.getLayoutManager()).g1(1, (int) this.O);
        }
        tj3Var.d.getClass();
        tj3Var.d.Q();
        int b = tj3Var.d.b();
        if (b == 1 && i2 == 1 && tj3Var.d.d(0) == 5) {
            tj3Var.b(true);
        } else {
            tj3Var.b(false);
            if (b > i2 && (i = this.T0) != 11 && i != 12 && i != 13) {
                tj3Var.E.b(i2);
            }
        }
        try {
            tj3Var.a.setEmptyView((this.Y2 == 0 && this.a3 == 0) ? tj3Var.x : null);
        } catch (Exception e) {
            cc4.g(e, true);
        }
        M2(tj3Var);
    }

    public final void P2() {
        z92 z92Var = this.A1;
        if (z92Var != null) {
            z92Var.setBlurredBottomHeight(this.A1.getInputBubbleHeight() + this.w.d() + hl.L(9.0f) + hl.L(7.0f));
        }
    }

    public final void P3() {
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && ((ActionBarLayout) wk5Var).w()) {
            finishPreviewFragment();
            return;
        }
        if (this.T0 != 10) {
            if (uc7.s1(this.currentAccount).x2()) {
                i5.b(this.currentAccount);
                return;
            } else {
                presentFragment(new ContactsActivity(bs2.l("destroyAfterSelect", true)));
                return;
            }
        }
        if (this.E2 != null) {
            ArrayList arrayList = this.K2;
            if (arrayList.isEmpty()) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < arrayList.size(); i++) {
                arrayList2.add(if7.a(((Long) arrayList.get(i)).longValue(), 0L));
            }
            this.E2.q(this, arrayList2, null, false, this.L2, this.M2, this.N2, null);
        }
    }

    public final void P4() {
        boolean z;
        if (this.O == 0.0f || (z = this.L)) {
            return;
        }
        float f = z ? -r3() : 0.0f;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.I3, f));
        animatorSet.setInterpolator(k43.f);
        animatorSet.setDuration(250L);
        animatorSet.start();
    }

    public final void Q2() {
        tj3 tj3Var;
        float p3 = p3(true);
        ij3 ij3Var = this.A0;
        if (ij3Var != null) {
            boolean z = ij3Var.getAlpha() != p3;
            float R1 = hl.R1(0.98f, 1.0f, p3);
            this.A0.setAlpha(p3);
            this.A0.setScaleX(R1);
            this.A0.setScaleY(R1);
            this.A0.setVisibility(p3 > 0.0f ? 0 : 8);
            if (z && (tj3Var = this.f0[0]) != null) {
                tj3Var.a.requestLayout();
            }
        }
        o5();
    }

    public final void Q3() {
        uc7.s1(this.currentAccount).X3.edit().putBoolean("storyhint", false).commit();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q4(int i) {
        bg4 bg4Var;
        ij3 ij3Var = this.A0;
        if (ij3Var == null) {
            s5(true, true);
            ij3Var = this.A0;
            if (ij3Var == null) {
                return;
            }
        }
        int tabsCount = ij3Var.getTabsCount() - 1;
        ArrayList T0 = getMessagesController().T0();
        int i2 = 0;
        while (true) {
            if (i2 >= T0.size()) {
                break;
            }
            if (((ac7) T0.get(i2)).a == i) {
                tabsCount = i2;
                break;
            }
            i2++;
        }
        ij3 ij3Var2 = this.A0;
        if (tabsCount < 0) {
            ij3Var2.getClass();
        } else if (tabsCount < ij3Var2.getTabsCount()) {
            bg4Var = (bg4) ij3Var2.h.get(tabsCount);
            if (bg4Var != null) {
                ij3 ij3Var3 = this.A0;
                ArrayList arrayList = ij3Var3.h;
                if (arrayList.isEmpty()) {
                    return;
                }
                ij3Var3.i((bg4) c00.g(1, arrayList), arrayList.size() - 1);
                return;
            }
            tj3[] tj3VarArr = this.f0;
            if (tj3VarArr == null || tj3VarArr.length <= 0 || tj3VarArr[0].h != bg4Var.a) {
                this.A0.i(bg4Var, tabsCount);
                return;
            }
            return;
        }
        bg4Var = null;
        if (bg4Var != null) {
        }
    }

    public final void R2() {
        float f = this.n.e;
        float R1 = hl.R1(0.2f, 1.0f, f);
        di3 di3Var = this.E1;
        if (di3Var != null) {
            di3Var.setScaleX(R1);
            this.E1.setScaleY(R1);
            this.E1.setAlpha(f);
            this.E1.setVisibility(f > 0.0f ? 0 : 8);
        }
        z92 z92Var = this.A1;
        if (z92Var != null) {
            z92Var.setAlpha(f);
            this.A1.setVisibility(f > 0.0f ? 0 : 8);
            this.A1.getFadeView().setAlpha(f);
            this.A1.getFadeView().setVisibility(f > 0.0f ? 0 : 8);
        }
    }

    public final /* synthetic */ void R3(id[] idVarArr) {
        gp2.e(idVarArr, this, this.currentAccount, this.b3);
    }

    public final void R4(boolean z, boolean z2) {
        li3 li3Var = this.H3;
        if (li3Var == null || !li3Var.c()) {
            int i = (this.f0[0].s == 0 && y3() && this.f0[0].w == 2) ? 1 : 0;
            int i2 = (!this.L || z2 || this.F0.g()) ? 0 : -hl.L(81.0f);
            tj3[] tj3VarArr = this.f0;
            if (!z) {
                tj3VarArr[0].c.g1(i, i2);
                P4();
            } else {
                hw6 hw6Var = tj3VarArr[0].r;
                hw6Var.b = 1;
                hw6Var.k(i, i2, false, false);
                P4();
            }
        }
    }

    public final void S2() {
        if (this.actionBar == null) {
            return;
        }
        float f = 1.0f - this.b.e;
        float t3 = 1.0f - t3();
        zp4.d(this.actionBar.getBackButton(), Math.max(this.w3, f * t3 * (1.0f - this.c.e)));
    }

    public final void S3(id idVar, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        try {
            idVar.dismiss();
        } catch (Exception e) {
            cc4.g(e, true);
        }
        if (tLObject == null) {
            jj.c0(this.currentAccount, tL_error, this, tL_messages_checkHistoryImportPeer, new Object[0]);
            getNotificationCenter().k(jn7.v1, Long.valueOf(j), tL_messages_checkHistoryImportPeer, tL_error);
            return;
        }
        this.arguments.getString("importTitle");
        String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
        kt ktVar = new kt((Object) this, j, (byte) 14);
        Pattern pattern = jj.a;
        if (getParentActivity() != null) {
            if (chat == null && user == null) {
                return;
            }
            int currentAccount = getCurrentAccount();
            Activity parentActivity = getParentActivity();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            long e2 = yac.h(currentAccount).e();
            TextView textView = new TextView(parentActivity);
            yob.X(textView, aob.j5, null);
            textView.setTextSize(1, 16.0f);
            textView.setGravity((ob6.a0 ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            alertDialog$Builder.n(frameLayout);
            rb0 rb0Var = new rb0((vnb) null);
            rb0Var.s(hl.L(12.0f));
            de0 de0Var = new de0(parentActivity);
            de0Var.setRoundRadius(hl.L(20.0f));
            frameLayout.addView(de0Var, tre.d(40, 40.0f, (ob6.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            qd4.w(textView2, aob.E8, null, 1, 20.0f);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity((ob6.a0 ? 5 : 3) | 16);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(ob6.M0(2131748999, null));
            boolean z = ob6.a0;
            frameLayout.addView(textView2, tre.d(-1, -2.0f, (z ? 5 : 3) | 48, z ? 21 : 76, 11.0f, z ? 76 : 21, 0.0f));
            frameLayout.addView(textView, tre.d(-2, -2.0f, (ob6.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (user == null) {
                rb0Var.p(chat);
                de0Var.f(chat, rb0Var);
            } else if (lbc.B(user)) {
                rb0Var.p = 0.8f;
                rb0Var.f(12);
                de0Var.m(null, null, rb0Var, user);
            } else if (user.id == e2) {
                rb0Var.p = 0.8f;
                rb0Var.f(1);
                de0Var.m(null, null, rb0Var, user);
            } else {
                rb0Var.p = 1.0f;
                rb0Var.q(user);
                de0Var.f(user, rb0Var);
            }
            textView.setText(hl.S2(str));
            alertDialog$Builder.j(ob6.M0(2131749019, null), new m0(ktVar, (byte) 10));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            showDialog(alertDialog$Builder.a);
        }
    }

    public final void S4(String str, boolean z) {
        k5(true, false, true, false);
        rw9 rw9Var = this.Z;
        if (rw9Var != null) {
            rw9Var.b(true);
        }
        hj3 hj3Var = this.Y;
        if (hj3Var != null) {
            hj3Var.r.setText(str);
            this.Y.r.setSelection(str.length());
        }
    }

    public final void T2() {
        zp4.d(this.h0, xnb.C(this.j0 ? 1.0f : 0.0f, 1.0f - this.b.e, 1.0f - t3(), 1.0f - this.c.e));
    }

    public final /* synthetic */ void T3(float f, ValueAnimator valueAnimator) {
        this.f0[0].setTranslationY((1.0f - this.w3) * f);
        this.w3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i = 0; i < this.actionBar.getChildCount(); i++) {
            if (this.actionBar.getChildAt(i).getVisibility() == 0 && this.actionBar.getChildAt(i) != this.actionBar.getActionMode() && this.actionBar.getChildAt(i) != this.actionBar.getBackButton()) {
                this.actionBar.getChildAt(i).setAlpha(1.0f - this.w3);
            }
        }
        a3();
        S2();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void T4(float f) {
        this.d0 = f;
        for (tj3 tj3Var : this.f0) {
            qj3 qj3Var = tj3Var.a;
            for (int i = 0; i < qj3Var.getChildCount(); i++) {
                View childAt = qj3Var.getChildAt(i);
                if (childAt != null && RecyclerView.S(childAt) >= tj3Var.d.f + 1) {
                    childAt.setAlpha(f);
                }
            }
        }
    }

    public final void U2() {
        zp4.d(this.g0, xnb.C(xea.r.isEmpty() ? 0.0f : 1.0f, 1.0f - this.b.e, 1.0f - t3(), 1.0f - this.c.e));
    }

    public final /* synthetic */ void U3() {
        if (this.f0 == null) {
            return;
        }
        if (this.U1 || this.isPaused) {
            this.S3 = true;
            return;
        }
        this.S3 = false;
        getMessagesController().h5(null);
        N4(false);
    }

    public final void U4(boolean z, boolean z2) {
        if (this.f0 == null || this.U1 == z) {
            return;
        }
        byte b = 0;
        if (z) {
            this.T1 = new ArrayList(o3(this.currentAccount, this.f0[0].s, this.Y2, false));
        } else {
            this.T1 = null;
        }
        this.U1 = z;
        tj3 tj3Var = this.f0[0];
        tj3Var.d.H = z;
        if (z || !z2) {
            return;
        }
        boolean e0 = tj3Var.a.e0();
        tj3[] tj3VarArr = this.f0;
        if (e0) {
            tj3VarArr[0].a.post(new rg3(this, b));
        } else {
            tj3VarArr[0].d.f();
        }
    }

    public final void V2() {
        zp4.d(this.k0, xnb.C(this.T0 != 2 ? 1.0f : 0.0f, this.f.e, 1.0f - t3(), 1.0f - this.c.e));
        ii3 ii3Var = this.F0;
        if (ii3Var != null) {
            ii3Var.invalidate();
        }
    }

    public final void V3(int i, fu5 fu5Var) {
        if (this.currentAccount != i) {
            fu5Var.u();
            if (getParentActivity() == null) {
                return;
            }
            oj3 oj3Var = this.E2;
            LaunchActivity launchActivity = (LaunchActivity) getParentActivity();
            ArrayList arrayList = this.F2;
            String str = this.G2;
            CharSequence charSequence = this.H2;
            bi3 bi3Var = this.D1;
            CharSequence fieldText = bi3Var != null ? bi3Var.getFieldText() : null;
            launchActivity.N0(i);
            uj3 uj3Var = new uj3(this.arguments);
            uj3Var.E2 = oj3Var;
            if (arrayList == null || arrayList.isEmpty()) {
                if (str != null) {
                    uj3Var.Y4(fieldText, str);
                } else if (charSequence != null) {
                    if (charSequence.length() == 0) {
                        uj3Var.H2 = null;
                    } else {
                        uj3Var.H2 = charSequence;
                        uj3Var.G2 = null;
                        uj3Var.F2 = null;
                        if (uj3Var.D1 != null) {
                            uj3Var.D2(fieldText);
                        } else {
                            uj3Var.b4 = fieldText;
                        }
                    }
                }
            } else if (arrayList.isEmpty()) {
                uj3Var.F2 = null;
            } else {
                uj3Var.F2 = arrayList;
                uj3Var.G2 = null;
                uj3Var.O2 = false;
                if (uj3Var.D1 != null) {
                    uj3Var.D2(fieldText);
                } else {
                    uj3Var.b4 = fieldText;
                }
            }
            launchActivity.u0(uj3Var, false, true);
        }
    }

    public final void V4(boolean z) {
        tj3 tj3Var;
        if (xea.o() <= 1 || !i86.e(32768)) {
            return;
        }
        tj3[] tj3VarArr = this.f0;
        if (z) {
            if (tj3VarArr != null && (tj3Var = tj3VarArr[0]) != null) {
                tj3Var.setLayerType(2, null);
                this.f0[0].setClipChildren(false);
                this.f0[0].setClipToPadding(false);
                this.f0[0].a.setClipChildren(false);
            }
            a aVar = this.actionBar;
            if (aVar != null) {
                aVar.setLayerType(2, null);
            }
            View view = this.fragmentView;
            if (view != null) {
                ((ViewGroup) view).setClipChildren(false);
                this.fragmentView.requestLayout();
                return;
            }
            return;
        }
        if (tj3VarArr != null) {
            int i = 0;
            while (true) {
                tj3[] tj3VarArr2 = this.f0;
                if (i >= tj3VarArr2.length) {
                    break;
                }
                tj3 tj3Var2 = tj3VarArr2[i];
                if (tj3Var2 != null) {
                    tj3Var2.setLayerType(0, null);
                    tj3Var2.setClipChildren(true);
                    tj3Var2.setClipToPadding(true);
                    tj3Var2.a.setClipChildren(true);
                }
                i++;
            }
        }
        a aVar2 = this.actionBar;
        if (aVar2 != null) {
            aVar2.setLayerType(0, null);
        }
        ii3 ii3Var = this.F0;
        if (ii3Var != null) {
            ii3Var.setLayerType(0, null);
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            ((ViewGroup) view2).setClipChildren(true);
            this.fragmentView.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.e, ej6
    public final boolean W(MotionEvent motionEvent, boolean z) {
        li3 li3Var;
        tb tbVar;
        ij3 ij3Var;
        if (!this.s3 && (((li3Var = this.H3) == null || !li3Var.c()) && (((tbVar = this.L0) == null || tbVar.getVisibility() != 0) && ((ij3Var = this.A0) == null || !ij3Var.n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                ij3 ij3Var2 = this.A0;
                boolean z2 = ij3Var2 == null || ij3Var2.getTabsCount() < 2 || this.A0.getCurrentTabId() == this.A0.getFirstTabId();
                ij3 ij3Var3 = this.A0;
                boolean z3 = ij3Var3 == null || ij3Var3.getTabsCount() < 2 || this.A0.getCurrentTabId() == this.A0.getLastTabId();
                xea.m(this.currentAccount);
                if (!z) {
                    return z2;
                }
                if (!z3 || z2) {
                }
            }
            return true;
        }
        return false;
    }

    public final void W2() {
        zp4.d(this.m0, xnb.C(this.b.e, 1.0f - t3(), 1.0f - this.c.e, this.d.e));
    }

    public final /* synthetic */ void W3() {
        uc7.s1(this.currentAccount).j0(null);
    }

    public final void W4(float f) {
        tj3[] tj3VarArr = this.f0;
        if (tj3VarArr != null) {
            int paddingTop = tj3VarArr[0].a.getPaddingTop() + ((int) f);
            int i = 0;
            while (true) {
                tj3[] tj3VarArr2 = this.f0;
                if (i >= tj3VarArr2.length) {
                    break;
                }
                tj3VarArr2[i].a.setTopGlowOffset(paddingTop);
                i++;
            }
        }
        if (this.fragmentView == null || f == this.O) {
            return;
        }
        this.O = f;
        v21 v21Var = this.q3;
        if (v21Var != null) {
            v21Var.l();
        }
        if (this.G3 != null) {
            float currentActionBarHeight = 1.0f - ((-f) / a.getCurrentActionBarHeight());
            zm zmVar = this.G3;
            float f2 = (int) f;
            float f3 = zmVar.f;
            zmVar.h = f2;
            zmVar.setTranslationY(f3 + f2);
            this.G3.setAlpha(ete.a(currentActionBarHeight, 0.0f, 1.0f));
            this.G3.setVisibility(currentActionBarHeight <= 0.0f ? 4 : 0);
        }
        a3();
        this.fragmentView.invalidate();
    }

    public final void X2() {
        tb tbVar;
        boolean z = !this.l2 && ((tbVar = this.L0) == null || tbVar.getBackground() == null || this.L0.getAlpha() < 0.01f || this.L0.getVisibility() == 8);
        aj3 aj3Var = this.K3;
        if (aj3Var != null) {
            ((fj6) aj3Var.b).E.a(z, true);
        }
    }

    public final /* synthetic */ void X3() {
        if (this.h4.g()) {
            uc7.s1(this.currentAccount).v4(0L, "USERPIC_SETUP");
            q5();
        }
    }

    public final void X4(float f) {
        this.z1 = f;
        x5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (xea.o() != 0) {
            i86.e(32768);
        }
        o5();
    }

    public final void Y2() {
        S2();
        zp4.d(this.l0, (1.0f - this.b.e) * (1.0f - t3()) * (1.0f - this.c.e));
        T2();
        W2();
        U2();
        V2();
    }

    public final void Y3(int i, ArrayList arrayList, boolean z, HashSet hashSet) {
        if (i != 102) {
            K4(arrayList, i, false, false, null);
            return;
        }
        getMessagesController().j0 = true;
        K4(arrayList, i, false, false, z ? hashSet : null);
        uc7 messagesController = getMessagesController();
        messagesController.j0 = false;
        messagesController.getNotificationCenter().k(jn7.r, Boolean.TRUE);
        getMessagesController().H(this.Y2);
        int i2 = this.Y2;
        if (i2 == 0 || o3(this.currentAccount, this.f0[0].s, i2, false).size() != 0) {
            return;
        }
        this.f0[0].a.setEmptyView(null);
        this.f0[0].x.setVisibility(4);
        finishFragment();
    }

    public final void Y4(CharSequence charSequence, String str) {
        if (str == null || str.isEmpty()) {
            this.G2 = null;
            this.H2 = null;
            return;
        }
        this.G2 = str;
        this.H2 = null;
        this.F2 = null;
        if (this.D1 != null) {
            D2(charSequence);
        } else {
            this.b4 = charSequence;
        }
    }

    public final void Z2() {
        String M0 = ob6.M0(t3() > 0.5f ? 2131745434 : 2131745541, null);
        this.Y.r.setContentDescription(M0);
        this.Y.r.setHint(M0);
    }

    public final void Z3(final int i, final long j, TLRPC.Chat chat, final boolean z, final boolean z2) {
        final TLRPC.Chat chat2;
        int i2;
        ArrayList arrayList;
        int i3;
        int i4;
        A3(false);
        if (i == 103 && xc2.T(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || xc2.t0(chat2)) {
                getMessagesController().V(2, j, z2);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i == 102 && (i4 = this.Y2) != 0 && o3(this.currentAccount, this.f0[0].s, i4, false).size() == 1) {
            this.f0[0].x.setVisibility(4);
        }
        int i5 = -1;
        if (i == 102) {
            U4(true, true);
            if (this.T1 != null) {
                i3 = 0;
                while (i3 < this.T1.size()) {
                    if (((TLRPC.Dialog) this.T1.get(i3)).id == j) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            i3 = -1;
            I2();
            i2 = i3;
        } else {
            i2 = -1;
        }
        UndoView w3 = w3();
        if (w3 != null) {
            w3.j(i == 103 ? 0 : z2 ? 1 : 95, j, new Runnable() { // from class: fh3
                @Override // java.lang.Runnable
                public final void run() {
                    uj3.this.J4(i, j, chat2, z, z2);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(o3(this.currentAccount, this.f0[0].s, this.Y2, false));
        int i6 = 0;
        while (true) {
            if (i6 >= arrayList2.size()) {
                break;
            }
            if (((TLRPC.Dialog) arrayList2.get(i6)).id == j) {
                i5 = i6;
                break;
            }
            i6++;
        }
        if (i == 102) {
            if (i2 < 0 || i5 >= 0 || (arrayList = this.T1) == null) {
                U4(false, true);
                return;
            }
            arrayList.remove(i2);
            this.f0[0].y.D();
            this.f0[0].b(true);
        }
    }

    public final void Z4(float f) {
        if (xea.o() <= 0) {
            boolean z = f11.a;
            return;
        }
        if (this.d4 != f) {
            boolean z2 = true;
            if (xea.o() > 1 && i86.e(32768)) {
                z2 = false;
            }
            this.e4 = z2;
            this.d4 = f;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            if (this.e4) {
                float f2 = (1.0f - this.d4) * (-hl.L(40.0f));
                ii3 ii3Var = this.F0;
                if (ii3Var != null) {
                    ii3Var.setTranslationX(f2);
                }
                hj3 hj3Var = this.Y;
                if (hj3Var != null) {
                    hj3Var.setTranslationX(f2);
                }
                li3 li3Var = this.H3;
                if (li3Var == null || li3Var.getFragmentView() == null || this.E) {
                    return;
                }
                this.H3.getFragmentView().setTranslationX(f2);
                return;
            }
            float f3 = -hl.L(4.0f);
            float f4 = 1.0f - this.d4;
            float f5 = f3 * f4;
            float f6 = 1.0f - (f4 * 0.05f);
            ii3 ii3Var2 = this.F0;
            if (ii3Var2 != null) {
                ii3Var2.setScaleX(f6);
                this.F0.setScaleY(f6);
                this.F0.setTranslationX(f5);
                this.F0.setPivotX(0.0f);
                this.F0.setPivotY(0.0f);
            }
            hj3 hj3Var2 = this.Y;
            if (hj3Var2 != null) {
                hj3Var2.setTranslationX(f5);
                this.Y.setScaleX(f6);
                this.Y.setScaleY(f6);
            }
            li3 li3Var2 = this.H3;
            if (li3Var2 == null || li3Var2.getFragmentView() == null) {
                return;
            }
            if (!this.E) {
                this.H3.getFragmentView().setScaleX(f6);
                this.H3.getFragmentView().setScaleY(f6);
                this.H3.getFragmentView().setTranslationX(f5);
            }
            this.H3.getFragmentView().setPivotX(0.0f);
            this.H3.getFragmentView().setPivotY(0.0f);
        }
    }

    public final void a3() {
        if (this.Y == null) {
            return;
        }
        float a = 1.0f - ete.a(((-this.O) - r3()) / hl.L(48.0f), 0.0f, 1.0f);
        float max = (this.T0 != 2 ? 1.0f : 0.0f) * (1.0f - this.c.e) * (1.0f - Math.max(this.w3, this.h.e)) * Math.max(this.b.e, (1.0f - t3()) * a);
        this.Y.setAlpha(max);
        this.Y.setVisibility(max > 0.0f ? 0 : 8);
        this.f.a(max <= 0.01f, true);
    }

    public final /* synthetic */ void a4() {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", yac.h(this.currentAccount).e());
        presentFragment(new zu1(bundle));
    }

    public final void a5(tj3 tj3Var, float f) {
        if (this.U != f) {
            this.U = f;
            byte b = 0;
            if (f == 0.0f) {
                this.V = false;
            }
            this.F0.setOverscroll(f);
            tj3Var.a.setViewsOffset(f);
            tj3Var.a.setOverScrollMode(f != 0.0f ? 2 : 0);
            this.fragmentView.invalidate();
            if (f <= hl.L(90.0f) || this.V) {
                return;
            }
            ii3 ii3Var = this.F0;
            ValueAnimator valueAnimator = ii3Var.I0;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                ii3Var.i(ii3Var.q0, true);
                this.V = true;
                getOrCreateStoryViewer().t(new ch3(this, b));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.Zk));
        hashSet.add(Integer.valueOf(aob.Yk));
        hashSet.add(Integer.valueOf(aob.dl));
        hashSet.add(Integer.valueOf(aob.cl));
        hashSet.add(Integer.valueOf(aob.bl));
        hashSet.add(Integer.valueOf(aob.al));
        hashSet.add(Integer.valueOf(aob.Ti));
        hashSet.add(Integer.valueOf(aob.g8));
        hashSet.add(Integer.valueOf(aob.Ne));
        hashSet.add(Integer.valueOf(aob.Jj));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.Me));
        hashSet.add(Integer.valueOf(aob.Le));
        hashSet.add(Integer.valueOf(aob.Ke));
        hashSet.add(Integer.valueOf(aob.Je));
        hashSet.add(Integer.valueOf(aob.yj));
        hashSet.add(Integer.valueOf(aob.wj));
        hashSet.add(Integer.valueOf(aob.xj));
        hashSet.add(Integer.valueOf(aob.T8));
        hashSet.add(Integer.valueOf(aob.f9));
        hashSet.add(Integer.valueOf(aob.W8));
        hashSet.add(Integer.valueOf(aob.V8));
        hashSet.add(Integer.valueOf(aob.U8));
        hashSet.add(Integer.valueOf(aob.S9));
        hashSet.add(Integer.valueOf(aob.R9));
        hashSet.add(Integer.valueOf(aob.g9));
        hashSet.add(Integer.valueOf(aob.m9));
        hashSet.add(Integer.valueOf(aob.Zl));
        hashSet.add(Integer.valueOf(aob.y6));
        hashSet.add(Integer.valueOf(aob.e9));
        hashSet.add(Integer.valueOf(aob.d9));
        hashSet.add(Integer.valueOf(aob.c9));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.M7));
        hashSet.add(Integer.valueOf(aob.N7));
        hashSet.add(Integer.valueOf(aob.h9));
        hashSet.add(Integer.valueOf(aob.n9));
        hashSet.add(Integer.valueOf(aob.l9));
        hashSet.add(Integer.valueOf(aob.Y8));
        hashSet.add(Integer.valueOf(aob.o9));
        hashSet.add(Integer.valueOf(aob.j9));
        hashSet.add(Integer.valueOf(aob.k9));
        hashSet.add(Integer.valueOf(aob.L7));
        hashSet.add(Integer.valueOf(aob.b8));
        hashSet.add(Integer.valueOf(aob.a8));
        hashSet.add(Integer.valueOf(aob.Z7));
        hashSet.add(Integer.valueOf(aob.Y7));
        hashSet.add(Integer.valueOf(aob.X7));
        hashSet.add(Integer.valueOf(aob.W7));
        hashSet.add(Integer.valueOf(aob.V7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.K7));
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.b7));
        hashSet.add(Integer.valueOf(aob.p6));
        hashSet.add(Integer.valueOf(aob.A6));
        hashSet.add(Integer.valueOf(aob.k7));
        hashSet.add(Integer.valueOf(aob.qk));
        hashSet.add(Integer.valueOf(aob.Z5));
        hashSet.add(Integer.valueOf(aob.B9));
        hashSet.add(Integer.valueOf(aob.z9));
        hashSet.add(Integer.valueOf(aob.A9));
        hashSet.add(Integer.valueOf(aob.y9));
        hashSet.add(Integer.valueOf(aob.x9));
        hashSet.add(Integer.valueOf(aob.w9));
        hashSet.add(Integer.valueOf(aob.v9));
        hashSet.add(Integer.valueOf(aob.u9));
        hashSet.add(Integer.valueOf(aob.t9));
        hashSet.add(Integer.valueOf(aob.s9));
        hashSet.add(Integer.valueOf(aob.r9));
        hashSet.add(Integer.valueOf(aob.q9));
        hashSet.add(Integer.valueOf(aob.p9));
        hashSet.add(Integer.valueOf(aob.i9));
        hashSet.add(Integer.valueOf(aob.Z8));
        hashSet.add(Integer.valueOf(aob.X8));
        hashSet.add(Integer.valueOf(aob.b9));
        hashSet.add(Integer.valueOf(aob.a9));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.U9));
        hashSet.add(Integer.valueOf(aob.T9));
        hashSet.add(Integer.valueOf(aob.yi));
        hashSet.add(Integer.valueOf(aob.I5));
        hashSet.add(Integer.valueOf(aob.E8));
        hashSet.add(Integer.valueOf(aob.G8));
    }

    public final void b3() {
        if (this.a0 != null) {
            float f = (this.b0 != null ? 1.0f : 0.0f) * this.b.e;
            float R1 = hl.R1(0.98f, 1.0f, f);
            this.a0.setScaleX(R1);
            this.a0.setScaleY(R1);
            this.a0.setAlpha(f);
            this.a0.setVisibility(f > 0.0f ? 0 : 8);
        }
        uic uicVar = this.b0;
        fm0 fm0Var = this.s;
        if (uicVar != null) {
            float f2 = 1.0f - fm0Var.e;
            uicVar.setAlpha(f2);
            this.b0.setVisibility(f2 > 0.0f ? 0 : 8);
        }
        rh4 rh4Var = this.c0;
        if (rh4Var != null) {
            float f3 = fm0Var.e;
            rh4Var.setAlpha(f3);
            this.c0.setVisibility(f3 > 0.0f ? 0 : 8);
        }
    }

    public final void b4(TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(launchActivity, this.currentAccount, tL_attachMenuBot, null, true);
        ls6 d0 = ls6.d0(this.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = d0.b;
        if (tL_attachMenuBots != null) {
            d0.getMessagesStorage().a.c(new r77((Object) d0, (Object) tL_attachMenuBots, d0.a, d0.e, (byte) 7));
        }
    }

    public final void b5() {
        getContactsController().B();
        zr zrVar = new zr(getParentActivity(), this.currentAccount, getResourceProvider(), new wd3(this, r1, (byte) 2), new zg3(r1, (byte) 0));
        nx0 i = ik8.i(getParentActivity(), false, 1, getResourceProvider());
        i.O = zrVar;
        i.U0 = (byte) 49;
        i.show();
        nx0[] nx0VarArr = {i};
        i.L(aob.h5);
    }

    public final void c3(boolean z) {
        if (this.D0 == null || this.actionBar == null) {
            return;
        }
        int i = hl.n;
        int measuredHeight = this.actionBar.getMeasuredHeight() + hl.L(this.a) + (this.b0 != null ? hl.L(50.0f) : 0);
        xj3 xj3Var = this.L1;
        int c = measuredHeight + (xj3Var != null ? (int) xj3Var.c(hl.L(7.0f)) : 0);
        bj3 bj3Var = this.D0;
        SparseArray sparseArray = bj3Var.h;
        bj3Var.X0 = c;
        bj3Var.Y0 = i;
        gw9 gw9Var = bj3Var.b0;
        if (z) {
            gw9Var.r1(0, c, 0, i);
        } else {
            gw9Var.setPadding(0, c, 0, i);
        }
        bj3Var.P0.j(bj3Var.X0, bj3Var.Y0, z);
        ax9 ax9Var = bj3Var.c0;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ax9Var.getLayoutParams();
        int i2 = marginLayoutParams.topMargin;
        int i3 = bj3Var.X0;
        if (i2 != i3 || marginLayoutParams.bottomMargin != bj3Var.Y0) {
            marginLayoutParams.topMargin = i3;
            marginLayoutParams.bottomMargin = bj3Var.Y0;
            ax9Var.requestLayout();
        }
        nx9.R(bj3Var.i0, bj3Var.l0, bj3Var.X0, bj3Var.Y0, z);
        nx9.R(bj3Var.n0, bj3Var.q0, bj3Var.X0, bj3Var.Y0, z);
        nx9.R(bj3Var.u0, bj3Var.x0, bj3Var.X0, bj3Var.Y0, z);
        mj8 mj8Var = bj3Var.s0;
        int i4 = bj3Var.X0;
        int i5 = bj3Var.Y0;
        mj8Var.setClipToPadding(false);
        q9c q9cVar = mj8Var.c;
        mj8Var.K = z;
        mj8Var.setPadding(0, i4, 0, i5);
        if (z) {
            q9cVar.r1(0, i4, 0, i5);
        } else {
            q9cVar.setPadding(0, i4, 0, i5);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) q9cVar.getLayoutParams();
        marginLayoutParams2.topMargin = -i4;
        marginLayoutParams2.bottomMargin = -i5;
        mj8Var.K = false;
        aw9 aw9Var = bj3Var.J0;
        if (aw9Var != null) {
            aw9Var.b(bj3Var.X0, bj3Var.Y0, z);
        }
        int size = sparseArray.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) sparseArray.valueAt(i6);
            if (view instanceof yg4) {
                ((yg4) view).j(bj3Var.X0, bj3Var.Y0, z);
            }
        }
        for (int i7 = 0; i7 < bj3Var.getChildCount(); i7++) {
            if (bj3Var.getChildAt(i7) instanceof yg4) {
                ((yg4) bj3Var.getChildAt(i7)).j(bj3Var.X0, bj3Var.Y0, z);
            }
        }
    }

    public final /* synthetic */ void c4(TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = uc7.s1(this.currentAccount).o1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new fn0((Object) this, (Object) tL_attachMenuBot, (Object) launchActivity, (byte) 22), 66);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0132, code lost:
    
        if ((r25.size() + r11.h.size()) > 100) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c5(of3 of3Var) {
        long j;
        long j2;
        int b;
        ArrayList arrayList;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr;
        boolean z;
        boolean z2;
        int i;
        LinearLayout linearLayout;
        uj3 uj3Var;
        char c;
        long j3;
        ac7 ac7Var;
        boolean[] zArr;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
        Object[] objArr;
        ?? r5;
        uj3 uj3Var2;
        long j4;
        boolean z3;
        int i2;
        boolean z4;
        Object[] objArr2;
        int i3;
        int i4;
        int i5;
        int i6;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
        final long j5;
        int i7;
        boolean z5;
        int i8;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
        ArrayList arrayList2;
        ti3 ti3Var;
        b8 b8Var;
        boolean z6;
        final uj3 uj3Var3 = this;
        int i9 = jn7.s;
        boolean Y = xc2.Y(of3Var.h2);
        byte b2 = 0;
        if (!of3Var.W()) {
            long dialogId = of3Var.getDialogId();
            Bundle bundle = new Bundle();
            int messageId = of3Var.getMessageId();
            if (!wf3.B(dialogId)) {
                if (wf3.D(dialogId)) {
                    bundle.putLong("user_id", dialogId);
                    j = 0;
                } else {
                    j = 0;
                    if (uj3Var3.a3 == 0 || ((b = gp2.b(uj3Var3.currentAccount, dialogId)) != 4 && b != 3)) {
                        TLRPC.Chat M0 = uj3Var3.getMessagesController().M0(Long.valueOf(-dialogId));
                        if (messageId == 0 || M0 == null || M0.migrated_to == null) {
                            j2 = dialogId;
                        } else {
                            bundle.putLong("migrated_to", dialogId);
                            j2 = -M0.migrated_to.channel_id;
                        }
                        bundle.putLong("chat_id", -j2);
                    }
                }
                if (messageId != 0) {
                    bundle.putInt("message_id", messageId);
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(Long.valueOf(dialogId));
                boolean z7 = uj3Var3.a3 == j && uj3Var3.getMessagesController().k4.P0.f && uj3Var3.getMessagesController().L0 && uj3Var3.getMessagesController().G0 != null && uj3Var3.getMessagesController().G0.size() > 0;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr5 = new ActionBarPopupWindow$ActionBarPopupWindowLayout[1];
                if (z7) {
                    LinearLayout linearLayout2 = new LinearLayout(uj3Var3.getParentActivity());
                    linearLayout2.setOrientation(1);
                    ti3 ti3Var2 = new ti3(uj3Var3.getParentActivity(), b2);
                    LinearLayout linearLayout3 = new LinearLayout(uj3Var3.getParentActivity());
                    linearLayout3.setOrientation(1);
                    ti3Var2.addView(linearLayout3);
                    int size = uj3Var3.getMessagesController().G0.size();
                    int i10 = 0;
                    b8 b8Var2 = null;
                    while (i10 < size) {
                        final ac7 ac7Var2 = (ac7) uj3Var3.getMessagesController().G0.get(i10);
                        if (ac7Var2.d()) {
                            j5 = dialogId;
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr5;
                        } else {
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr5;
                            final boolean a = ac7Var2.a(k5.a(uj3Var3.currentAccount), dialogId);
                            j5 = dialogId;
                            final ArrayList E0 = ah4.E0(uj3Var3, ac7Var2, arrayList3, true, false);
                            if (!a) {
                            }
                            b8 b8Var3 = new b8(2, null, uj3Var3.getParentActivity(), false, false);
                            b8Var3.setChecked(a);
                            String str = ac7Var2.b;
                            TextPaint paint = b8Var3.getTextView().getPaint();
                            ArrayList arrayList4 = arrayList3;
                            i7 = size;
                            Spannable A5 = r47.A5(pv3.m(str, paint.getFontMetricsInt(), false, null, 0), ac7Var2.c, b8Var3.getTextView().getPaint().getFontMetricsInt(), false);
                            b8Var3.setEmojiCacheType(ac7Var2.n ? 26 : 0);
                            b8Var3.j(A5, 0, new pb2(uj3Var3.getParentActivity(), R.drawable.msg_folders, ac7Var2.m));
                            b8Var3.getTextView().setEmojiColor(uj3Var3.getThemedColor(aob.Fi));
                            b8Var3.setMinimumWidth(jn7.p2);
                            z5 = Y;
                            i8 = i10;
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
                            arrayList2 = arrayList4;
                            ti3Var = ti3Var2;
                            b8Var = b8Var3;
                            z6 = z7;
                            dialogId = j5;
                            b8Var.setOnClickListener(new View.OnClickListener() { // from class: lh3
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    ArrayList arrayList5;
                                    long j6;
                                    ac7 ac7Var3 = ac7Var2;
                                    LongSparseIntArray longSparseIntArray = ac7Var3.j;
                                    uj3 uj3Var4 = uj3.this;
                                    boolean z8 = a;
                                    ArrayList arrayList6 = E0;
                                    long j7 = j5;
                                    if (z8) {
                                        ac7Var3.h.remove(Long.valueOf(j7));
                                        ac7Var3.i.add(Long.valueOf(j7));
                                        nf4.z0(ac7Var3, ac7Var3.g, ac7Var3.b, ac7Var3.c, ac7Var3.n, ac7Var3.m, ac7Var3.h, ac7Var3.i, longSparseIntArray, false, false, true, true, false, uj3Var4, null);
                                        uj3Var4.w3().k(j7, 21, Integer.valueOf(arrayList6.size()), ac7Var3, null, null);
                                    } else {
                                        if (arrayList6.isEmpty()) {
                                            arrayList5 = arrayList6;
                                            j6 = j7;
                                        } else {
                                            for (int i11 = 0; i11 < arrayList6.size(); i11++) {
                                                ac7Var3.i.remove(arrayList6.get(i11));
                                            }
                                            ac7Var3.h.addAll(arrayList6);
                                            j6 = j7;
                                            arrayList5 = arrayList6;
                                            nf4.z0(ac7Var3, ac7Var3.g, ac7Var3.b, ac7Var3.c, ac7Var3.n, ac7Var3.m, ac7Var3.h, ac7Var3.i, longSparseIntArray, false, false, true, true, false, uj3Var4, null);
                                            ac7Var3 = ac7Var3;
                                        }
                                        uj3Var4.w3().k(j6, 20, Integer.valueOf(arrayList5.size()), ac7Var3, null, null);
                                    }
                                    uj3Var4.A3(true);
                                    uj3Var4.finishPreviewFragment();
                                }
                            });
                            linearLayout3.addView(b8Var);
                            uj3Var3 = this;
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr5 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                            ti3Var2 = ti3Var;
                            b8Var2 = b8Var;
                            Y = z5;
                            z7 = z6;
                            size = i7;
                            i10 = i8 + 1;
                            arrayList3 = arrayList2;
                        }
                        arrayList2 = arrayList3;
                        i7 = size;
                        z5 = Y;
                        i8 = i10;
                        b8Var = b8Var2;
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
                        ti3Var = ti3Var2;
                        z6 = z7;
                        dialogId = j5;
                        uj3Var3 = this;
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr5 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                        ti3Var2 = ti3Var;
                        b8Var2 = b8Var;
                        Y = z5;
                        z7 = z6;
                        size = i7;
                        i10 = i8 + 1;
                        arrayList3 = arrayList2;
                    }
                    arrayList = arrayList3;
                    ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr6 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr5;
                    z = Y;
                    z2 = z7;
                    b8 b8Var4 = b8Var2;
                    i = 8;
                    ti3 ti3Var3 = ti3Var2;
                    if (b8Var4 != null) {
                        b8Var4.m(false, true);
                    }
                    if (linearLayout3.getChildCount() <= 0) {
                        z2 = false;
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr6;
                        linearLayout = linearLayout2;
                    } else {
                        k8 k8Var = new k8(aob.H8, getResourceProvider(), getParentActivity());
                        k8Var.setTag(R.id.fit_width_tag, 1);
                        b8 b8Var5 = new b8(getParentActivity(), true, false);
                        b8Var5.j(ob6.M0(2131753749, null), R.drawable.ic_ab_back, null);
                        b8Var5.setMinimumWidth(jn7.p2);
                        b8Var5.setOnClickListener(new mh3(actionBarPopupWindow$ActionBarPopupWindowLayoutArr6, (byte) 0));
                        linearLayout2.addView(b8Var5);
                        linearLayout2.addView(k8Var, tre.o(-1, 8));
                        linearLayout2.addView(ti3Var3);
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr6;
                        linearLayout = linearLayout2;
                    }
                } else {
                    arrayList = arrayList3;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr5;
                    z = Y;
                    z2 = z7;
                    i = 8;
                    linearLayout = null;
                }
                Object[] objArr3 = new e[1];
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, z2 ? 3 : 2, getResourceProvider(), getParentActivity());
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0] = actionBarPopupWindow$ActionBarPopupWindowLayout;
                if (z2) {
                    int[] iArr = {actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout)};
                    b8 b8Var6 = new b8(getParentActivity(), true, false);
                    b8Var6.j(ob6.M0(2131750777, null), R.drawable.msg_addfolder, null);
                    b8Var6.setMinimumWidth(jn7.p2);
                    b8Var6.setOnClickListener(new je3(actionBarPopupWindow$ActionBarPopupWindowLayoutArr, iArr, (byte) 4));
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(b8Var6);
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().setOnHeightUpdateListener(new ht2(objArr3, (byte) 25));
                }
                if (z) {
                    uj3Var = this;
                    c = 0;
                } else {
                    b8 b8Var7 = new b8(getParentActivity(), !z2, false);
                    if (of3Var.getHasUnread()) {
                        b8Var7.j(ob6.M0(2131748435, null), R.drawable.msg_markread, null);
                    } else {
                        b8Var7.j(ob6.M0(2131748434, null), R.drawable.msg_markunread, null);
                    }
                    b8Var7.setMinimumWidth(jn7.p2);
                    uj3Var = this;
                    long j6 = dialogId;
                    dialogId = j6;
                    b8Var7.setOnClickListener(new dg(uj3Var, of3Var, j6, (byte) 3));
                    c = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].addView(b8Var7);
                }
                boolean[] zArr2 = new boolean[1];
                zArr2[c] = true;
                TLRPC.Dialog dialog = (TLRPC.Dialog) uj3Var.getMessagesController().R.f(dialogId);
                int i11 = uj3Var.f0[c].s;
                boolean z8 = (i11 == 7 || i11 == i) && (!uj3Var.actionBar.z() || uj3Var.actionBar.A(null));
                if (z8) {
                    j3 = dialogId;
                    ac7Var = uj3Var.getMessagesController().N[uj3Var.f0[0].s == i ? (char) 1 : (char) 0];
                } else {
                    j3 = dialogId;
                    ac7Var = null;
                }
                if (uj3Var.H3(dialog)) {
                    zArr = zArr2;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr;
                    objArr = objArr3;
                    r5 = 0;
                } else {
                    ArrayList W0 = uj3Var.getMessagesController().W0(uj3Var.Y2);
                    int size2 = W0.size();
                    int i12 = 0;
                    int i13 = 0;
                    int i14 = 0;
                    ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr7 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr;
                    while (true) {
                        if (i12 >= size2) {
                            zArr = zArr2;
                            z4 = z8;
                            actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr7;
                            objArr2 = objArr3;
                            break;
                        }
                        TLRPC.Dialog dialog2 = (TLRPC.Dialog) W0.get(i12);
                        zArr = zArr2;
                        if (!(dialog2 instanceof TLRPC.TL_dialogFolder)) {
                            z4 = z8;
                            if (!uj3Var.H3(dialog2)) {
                                i6 = size2;
                                actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr7;
                                objArr2 = objArr3;
                                if (!uj3Var.getMessagesController().G2(dialog2.id, false)) {
                                    break;
                                }
                                i12++;
                                z8 = z4;
                                size2 = i6;
                                zArr2 = zArr;
                                actionBarPopupWindow$ActionBarPopupWindowLayoutArr7 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                                objArr3 = objArr2;
                            } else {
                                i6 = size2;
                                if (wf3.B(dialog2.id)) {
                                    i14++;
                                } else {
                                    i13++;
                                }
                            }
                        } else {
                            z4 = z8;
                            i6 = size2;
                        }
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr7;
                        objArr2 = objArr3;
                        i12++;
                        z8 = z4;
                        size2 = i6;
                        zArr2 = zArr;
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr7 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                        objArr3 = objArr2;
                    }
                    if (dialog == null || uj3Var.H3(dialog)) {
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                    } else {
                        boolean B = wf3.B(j3);
                        int i15 = !B ? 1 : 0;
                        if (ac7Var == null || !ac7Var.h.contains(Long.valueOf(j3))) {
                            i5 = i15;
                            i4 = B ? 1 : 0;
                            i3 = 0;
                        } else {
                            i5 = i15;
                            i4 = B ? 1 : 0;
                            i3 = 1;
                        }
                    }
                    int f = (!z4 || ac7Var == null) ? (uj3Var.Y2 == 0 && ac7Var == null) ? uj3Var.getUserConfig().p() ? uj3Var.getMessagesController().k4.g1.f() : uj3Var.getMessagesController().k4.f1.f() : uj3Var.getUserConfig().p() ? uj3Var.getMessagesController().e3 : uj3Var.getMessagesController().d3 : 100 - ac7Var.h.size();
                    boolean z9 = i4 + i14 <= f && (i5 + i13) - i3 <= f;
                    r5 = 0;
                    zArr[0] = z9;
                    objArr = objArr2;
                }
                if (zArr[r5]) {
                    b8 b8Var8 = new b8(uj3Var.getParentActivity(), (z2 || !z) ? r5 : true, r5);
                    if (uj3Var.H3(dialog)) {
                        b8Var8.j(ob6.M0(2131743499, null), R.drawable.msg_unpin, null);
                    } else {
                        b8Var8.j(ob6.M0(2131746972, null), R.drawable.msg_pin, null);
                    }
                    b8Var8.setMinimumWidth(jn7.p2);
                    long j7 = j3;
                    yn0 yn0Var = new yn0(uj3Var, ac7Var, dialog, j7, (byte) 2);
                    uj3Var2 = uj3Var;
                    j4 = j7;
                    b8Var8.setOnClickListener(yn0Var);
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr2[0].addView(b8Var8);
                } else {
                    uj3Var2 = uj3Var;
                    j4 = j3;
                }
                if (wf3.D(j4) && lbc.D(uj3Var2.getMessagesController().X1(Long.valueOf(j4)))) {
                    z3 = true;
                    i2 = 0;
                } else {
                    b8 b8Var9 = new b8(uj3Var2.getParentActivity(), false, false);
                    if (uj3Var2.getMessagesController().p2(j4, 0L, null)) {
                        b8Var9.j(ob6.M0(2131743504, null), R.drawable.msg_unmute, null);
                    } else {
                        b8Var9.j(ob6.M0(2131748068, null), R.drawable.msg_mute, null);
                    }
                    b8Var9.setMinimumWidth(jn7.p2);
                    z3 = true;
                    b8Var9.setOnClickListener(new my(uj3Var2, j4, true ? 1 : 0));
                    i2 = 0;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr2[0].addView(b8Var9);
                }
                if (z) {
                    if (uj3Var2.p2 != null) {
                        uj3Var2.getNotificationCenter().k(i9, new Object[i2]);
                    }
                    uj3Var2.M4();
                    uj3Var2.parentLayout.setHighlightActionButtons(true);
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("community_id", -j4);
                    uj3 uj3Var4 = new uj3(bundle2);
                    Point point = hl.q;
                    if (point.x > point.y) {
                        objArr[0] = uj3Var4;
                        uj3Var2.presentFragmentAsPreview(uj3Var4);
                        return false;
                    }
                    objArr[0] = uj3Var4;
                    uj3Var2.presentFragmentAsPreviewWithMenu(uj3Var4, actionBarPopupWindow$ActionBarPopupWindowLayoutArr2[0]);
                    return false;
                }
                b8 b8Var10 = new b8(uj3Var2.getParentActivity(), i2, z3);
                b8Var10.setIconColor(uj3Var2.getThemedColor(aob.p7));
                int i16 = aob.q7;
                b8Var10.setTextColor(uj3Var2.getThemedColor(i16));
                b8Var10.h(0.12f, i16);
                b8Var10.j(ob6.M0(2131751563, null), R.drawable.msg_delete, null);
                b8Var10.setMinimumWidth(jn7.p2);
                b8Var10.setOnClickListener(new je3(uj3Var2, arrayList, (byte) 5));
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr2[0].addView(b8Var10);
                if (!uj3Var2.getMessagesController().C(bundle, uj3Var2, null, null)) {
                    return false;
                }
                if (uj3Var2.p2 != null) {
                    uj3Var2.getNotificationCenter().k(i9, new Object[0]);
                }
                uj3Var2.M4();
                uj3Var2.parentLayout.setHighlightActionButtons(true);
                zu1 zu1Var = new zu1(bundle);
                Point point2 = hl.q;
                if (point2.x > point2.y) {
                    objArr[0] = zu1Var;
                    uj3Var2.presentFragmentAsPreview(zu1Var);
                    return true;
                }
                objArr[0] = zu1Var;
                uj3Var2.presentFragmentAsPreviewWithMenu(zu1Var, actionBarPopupWindow$ActionBarPopupWindowLayoutArr2[0]);
                zu1Var.ga = true;
                try {
                    zu1Var.p1.getAvatarImageView().performAccessibilityAction(64, null);
                } catch (Exception unused) {
                }
                return true;
            }
        } else if (of3Var.getCurrentDialogFolderId() == 1) {
            B4(of3Var);
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean canBeginSlide() {
        ij3 ij3Var;
        if (this.H3.c()) {
            return false;
        }
        return this.T0 != 3 || (ij3Var = this.A0) == null || ij3Var.getVisibility() != 0 || this.A0.L <= 0;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean closeLastFragment() {
        if (!this.H3.c()) {
            return super.closeLastFragment();
        }
        this.H3.a();
        bj3 bj3Var = this.D0;
        if (bj3Var == null) {
            return true;
        }
        bj3Var.T();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final a createActionBar(Context context) {
        y10 y10Var = new y10(this, context, this.resourceProvider, (byte) 2);
        y10Var.setAllowOverlayTitle(true);
        y10Var.H0 = true;
        if (y10Var.G0 == null) {
            b6 b6Var = new b6(y10Var.getContext(), (byte) 0);
            y10Var.G0 = b6Var;
            y10Var.addView(b6Var);
        }
        yob.l(y10Var, 3, aob.t8, getResourceProvider());
        yob.a(y10Var, aob.z8, getResourceProvider(), true);
        yob.l(y10Var, 1, aob.v8, getResourceProvider());
        yob.b(y10Var, aob.y8, getResourceProvider(), true);
        if (y10Var.y1 == null) {
            c6 c6Var = new c6(y10Var, y10Var.getContext(), y10Var.K0, y10Var.P0);
            y10Var.y1 = c6Var;
            c6Var.setClipChildren(false);
            y10Var.addView(y10Var.y1);
        }
        y10Var.getAdditionalSubTitleOverlayContainer().setTranslationX(hl.L(4.0f));
        y10Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-hl.L(3.0f));
        if (!this.inPreviewMode && (!hl.O1() || this.Y2 == 0 || F3())) {
            return y10Var;
        }
        y10Var.setOccupyStatusBar(false);
        return y10Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0bd2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0c25  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0c4e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0c90  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0ca6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0ccf  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0d86  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0de4  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0e1b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0da0  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0c56  */
    /* JADX WARN: Type inference failed for: r0v100, types: [org.telegram.ui.ActionBar.a] */
    /* JADX WARN: Type inference failed for: r0v178, types: [d79, qj3] */
    /* JADX WARN: Type inference failed for: r0v27, types: [z92] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r3v18, types: [m7, org.telegram.ui.Components.EditTextBoldCursor] */
    /* JADX WARN: Type inference failed for: r3v269, types: [android.view.ViewGroup, s7] */
    /* JADX WARN: Type inference failed for: r4v2, types: [org.telegram.ui.ActionBar.a] */
    /* JADX WARN: Type inference failed for: r5v22, types: [ll0] */
    /* JADX WARN: Type inference failed for: r5v40, types: [d79, qj3] */
    /* JADX WARN: Type inference failed for: r5v41, types: [d79, qj3] */
    /* JADX WARN: Type inference failed for: r5v42, types: [androidx.recyclerview.widget.RecyclerView, qj3] */
    /* JADX WARN: Type inference failed for: r9v40, types: [android.graphics.drawable.BitmapDrawable] */
    @Override // org.telegram.ui.ActionBar.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        float f;
        byte b;
        float f2;
        float f3;
        zu1 zu1Var;
        ij3 ij3Var;
        hj3 hj3Var;
        hj3 hj3Var2;
        xj3 xj3Var;
        oj3 oj3Var;
        int i;
        TLRPC.UserProfilePhoto userProfilePhoto;
        ?? r9;
        Context context2 = context;
        ?? r11 = 0;
        ?? r112 = 0;
        ?? r113 = 0;
        this.l2 = false;
        this.m2 = false;
        this.W = false;
        this.X0 = null;
        this.A0 = null;
        ArrayList arrayList = this.K2;
        arrayList.clear();
        this.n3 = ViewConfiguration.get(context2).getScaledMaximumFlingVelocity();
        byte b2 = 1;
        hl.c3(new xf1(context2, b2));
        this.P1 = null;
        this.N1 = null;
        this.O1 = null;
        this.S1 = null;
        this.L1 = null;
        s6 u = this.actionBar.u();
        u.setTranslationX(-hl.L(5.0f));
        s7 a = u.a(0, R.drawable.outline_header_search);
        a.N();
        this.k0 = a;
        a.setOnClickListener(new wg3(this, 0 == true ? 1 : 0));
        byte b3 = 8;
        if (this.T0 == 2 || (F3() && o3(this.currentAccount, this.T0, this.Y2, false).isEmpty())) {
            this.k0.setVisibility(8);
        }
        this.k0.setVisibility(8);
        byte b4 = 7;
        byte b5 = 3;
        if (!this.n2 && this.p2 == null && this.Y2 == 0 && this.a3 == 0) {
            int i2 = aob.t8;
            int themedColor = getThemedColor(i2);
            int i3 = aob.v8;
            s7 s7Var = new s7(context2, themedColor, getThemedColor(i3));
            this.n0 = s7Var;
            s7Var.setText(ob6.L0(2131751319).toUpperCase());
            if (this.n0.getTextView() != null) {
                yob.X(this.n0.getTextView(), i3, getResourceProvider());
            }
            s7 s7Var2 = this.n0;
            yob.R(s7Var2, s7Var2.getBackground(), null, yob.M(i2), getResourceProvider());
            this.actionBar.addView(this.n0, tre.d(-2, -2.0f, 53, 0.0f, 0.0f, 10.0f, 0.0f));
            this.n0.setOnClickListener(new wg3(this, b4));
            this.n0.setAlpha(0.0f);
            this.n0.setVisibility(8);
            this.o0 = new cx8(context2);
            b8 b8Var = new b8(this.resourceProvider, context2, false, true);
            this.p0 = b8Var;
            b8Var.setItemHeight(56);
            this.p0.j(ob6.L0(2131748359), 0, this.o0);
            this.p0.setContentDescription(ob6.L0(2131746328));
            s7 a2 = u.a(1, R.drawable.outline_header_lock_24);
            this.g0 = a2;
            a2.setContentDescription(ob6.L0(2131754808));
            ?? d = u.d(3, new ColorDrawable(0));
            this.h0 = d;
            oq3 oq3Var = new oq3(context2, this.currentAccount);
            this.i0 = oq3Var;
            d.addView(oq3Var);
            this.h0.setContentDescription(ob6.L0(2131751308));
            this.h0.setVisibility(8);
            w5(false, false);
        }
        hj3 hj3Var3 = new hj3(context2, this.resourceProvider, r113 == true ? 1 : 0);
        this.Y = hj3Var3;
        hj3Var3.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
        this.Y.setPivotX(0.0f);
        this.Y.setPivotY(0.0f);
        if (this.T0 == 0) {
            s7 a3 = u.a(-47, R.drawable.avd_speed);
            this.m0 = a3;
            hl.B2(a3);
            this.m0.setOnClickListener(new wg3(this, b3));
            this.Y.a(this.m0);
            this.Y.updateColors();
        }
        byte b6 = 5;
        this.Y.setCloseButtonOnClickListener(new ch3(this, b6));
        this.Y.r.setOnFocusChangeListener(new ts0(this, b6));
        ?? r3 = this.Y.r;
        byte b7 = 10;
        rw9 rw9Var = new rw9(r3, new r10(this, b7));
        this.Z = rw9Var;
        r3.addTextChangedListener(rw9Var);
        this.Y.setSearchFiltersListener(new xi3(this));
        this.Z.a();
        if (this.T0 == 0) {
            s7 a4 = u.a(4, R.drawable.ic_ab_other);
            this.l0 = a4;
            a4.setContentDescription(ob6.L0(2131754834));
            this.l0.setOnClickListener(new wg3(this, (byte) 9));
            this.l0.setOnLongClickListener(new bh3(this, b5));
        }
        this.k0.setSearchFieldHint(ob6.L0(2131745564));
        this.k0.setContentDescription(ob6.L0(2131745564));
        if (this.n2) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            int i4 = this.T0;
            if (i4 == 16) {
                this.actionBar.setTitle(ob6.L0(2131753093));
            } else if (this.O0) {
                this.actionBar.setTitle(ob6.L0(2131745979));
            } else if (this.P0) {
                this.actionBar.setTitle(ob6.L0(2131746156));
            } else if (i4 == 3 && this.h2 == null) {
                this.actionBar.setTitle(ob6.L0(2131750535));
            } else if (i4 == 10) {
                this.actionBar.setTitle(ob6.L0(2131745396));
            } else if (i4 == 14) {
                boolean z = this.C2;
                if (!z || this.B2 || this.x2 || this.A2) {
                    boolean z2 = this.B2;
                    if (!z2 || z || this.x2 || this.A2) {
                        boolean z3 = this.x2;
                        if (z3 && !z2 && !z && !this.A2) {
                            this.actionBar.setTitle(ob6.L0(2131752090));
                        } else if (!this.A2 || z2 || z || z3) {
                            this.actionBar.setTitle(ob6.L0(2131745397));
                        } else {
                            this.actionBar.setTitle(ob6.L0(2131752100));
                        }
                    } else {
                        this.actionBar.setTitle(ob6.L0(2131752075));
                    }
                } else {
                    this.actionBar.setTitle(ob6.L0(2131752102));
                }
            } else {
                TLRPC.RequestPeerType requestPeerType = this.H;
                if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                    Boolean bool = ((TLRPC.TL_requestPeerTypeUser) requestPeerType).bot;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        a aVar = this.actionBar;
                        if (booleanValue) {
                            aVar.setTitle(ob6.L0(2131752102));
                        } else {
                            aVar.setTitle(ob6.L0(2131752075));
                        }
                    } else {
                        this.actionBar.setTitle(ob6.L0(2131752075));
                    }
                } else {
                    boolean z4 = requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast;
                    a aVar2 = this.actionBar;
                    if (z4) {
                        aVar2.setTitle(ob6.L0(2131752100));
                    } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
                        aVar2.setTitle(ob6.L0(2131752090));
                    } else {
                        aVar2.setTitle(ob6.L0(2131745397));
                    }
                }
            }
            yob.h(aob.d6, getResourceProvider(), this.actionBar);
        } else {
            if (this.p2 != null || this.Y2 != 0 || this.a3 != 0) {
                ?? r4 = this.actionBar;
                gd0 gd0Var = new gd0(false);
                this.g1 = gd0Var;
                r4.setBackButtonDrawable(gd0Var);
            }
            if (this.Y2 != 0) {
                this.actionBar.setTitle(ob6.L0(2131754129));
            } else if (this.a3 != 0) {
                this.actionBar.setTitle(wf3.l(this.b3));
                this.actionBar.setAdditionalTextLeft(hl.L(28.0f));
                this.e3 = new rb0(this.b3);
                de0 de0Var = new de0(getContext());
                this.d3 = de0Var;
                de0Var.setRoundRadius(hl.L(11.0f));
                this.d3.f(this.b3, this.e3);
                this.actionBar.addView(this.d3, tre.d(32, 32.0f, 83, 58.0f, 0.0f, 0.0f, 12.0f));
            } else {
                ul ulVar = new ul(hl.L(26.0f), null);
                this.F3 = ulVar;
                ulVar.a = true;
                Drawable e = c00.e(context2, R.drawable.telegram_logo_2);
                this.E3 = e;
                e.setBounds(0, hl.L(2.0f), this.E3.getIntrinsicWidth(), this.E3.getIntrinsicHeight() + hl.L(2.0f));
                Drawable drawable = this.E3;
                int themedColor2 = getThemedColor(aob.Xl);
                this.C4 = themedColor2;
                drawable.setColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.L0(R.string.AppName));
                spannableStringBuilder.setSpan(new ImageSpan(this.E3), 0, spannableStringBuilder.length(), 33);
                this.actionBar.M(spannableStringBuilder, this.F3);
                B5(yac.h(this.currentAccount).f(), false);
            }
            if (this.Y2 == 0) {
                this.actionBar.setSupportsHolidayImage(true);
            }
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setTitleActionRunnable(new ch3(this, (byte) 6));
        int i5 = this.T0;
        if (((i5 == 0 && !this.n2) || i5 == 3) && this.Y2 == 0 && this.a3 == 0 && TextUtils.isEmpty(this.p2)) {
            ij3 ij3Var2 = new ij3(this, context2, this.resourceProvider);
            this.A0 = ij3Var2;
            ij3Var2.setVisibility(8);
            this.x = false;
            this.r.a(false, false);
            this.A0.setDelegate(new lj3(this, context2));
        }
        int i6 = 17;
        if (this.t2 && yac.c() > 1) {
            this.F1 = u.g(11, 0, hl.L(56.0f));
            rb0 rb0Var = new rb0();
            rb0Var.s(hl.L(12.0f));
            de0 de0Var2 = new de0(context2);
            de0Var2.setRoundRadius(hl.L(18.0f));
            this.F1.addView(de0Var2, tre.e(36, 36, 17));
            this.F1.setOnClickListener(new wg3(this, b7));
            this.F1.setOnLongClickListener(new bh3(this, (byte) 2));
            TLRPC.User f4 = getUserConfig().f();
            rb0Var.q(f4);
            ImageReceiver imageReceiver = de0Var2.getImageReceiver();
            int i7 = this.currentAccount;
            imageReceiver.d = i7;
            de0Var2.j(jn5.m(i7, 1, f4), "50_50", jn5.n(f4), "50_50", (f4 == null || (userProfilePhoto = f4.photo) == null || (r9 = userProfilePhoto.strippedBitmap) == null) ? rb0Var : r9, f4);
        }
        this.actionBar.setActionBarMenuOnItemClick(new kg2(this, (byte) 13));
        nj3 nj3Var = new nj3(this, context2);
        this.fragmentView = nj3Var;
        this.y4 = new kh3(this, nj3Var, new PointF(), r112 == true ? 1 : 0);
        int i8 = (this.Y2 == 0 && this.a3 == 0 && (((i = this.T0) == 0 && !this.n2) || i == 3)) ? 2 : 1;
        this.f0 = new tj3[i8];
        int i9 = 0;
        while (true) {
            byte b8 = 12;
            if (i9 >= i8) {
                break;
            }
            tj3 tj3Var = new tj3(this, context2);
            nj3Var.addView(tj3Var, tre.c(-1.0f, -1));
            tj3Var.s = this.T0;
            this.f0[i9] = tj3Var;
            tk4 tk4Var = new tk4(context2);
            tj3Var.x = tk4Var;
            tk4Var.setViewType(7);
            tj3Var.x.setVisibility(8);
            tj3Var.addView(tj3Var.x, tre.e(-2, -2, i6));
            qj3 qj3Var = new qj3(this, context2, tj3Var);
            tj3Var.a = qj3Var;
            this.glassEngine.b(qj3Var);
            qj3 qj3Var2 = tj3Var.a;
            tj3Var.b = new lp(qj3Var2);
            qj3Var2.setAllowStopHeaveOperations(true);
            tj3Var.a.setAccessibilityEnabled(r11);
            tj3Var.a.q1(r11, true);
            tj3Var.a.setClipToPadding(r11);
            tj3Var.a.setPivotY(0.0f);
            if (this.T0 == 15) {
                yob.h(aob.a7, getResourceProvider(), tj3Var.a);
            }
            tj3Var.y = new sh3(tj3Var.a, tj3Var);
            tj3Var.a.setVerticalScrollBarEnabled(true);
            tj3Var.a.setInstantClick(true);
            uh3 uh3Var = new uh3(this, tj3Var);
            tj3Var.c = uh3Var;
            uh3Var.i1(1);
            tj3Var.a.setLayoutManager(tj3Var.c);
            tj3Var.a.setVerticalScrollbarPosition(ob6.a0 ? 1 : 2);
            tj3Var.addView(tj3Var.a, tre.c(-1.0f, -1));
            tj3Var.a.setOnItemClickListener(new q72((Object) this, (Object) tj3Var, (byte) 25));
            tj3Var.a.setOnItemLongClickListener(new qx6((Object) this, (Object) tj3Var, (byte) 22));
            tj3Var.f = new sj3(this, tj3Var);
            tj3Var.E = new i69(tj3Var.a, r11);
            lu5 lu5Var = new lu5(tj3Var.f);
            tj3Var.e = lu5Var;
            lu5Var.h(tj3Var.a);
            tj3Var.a.setOnScrollListener(new wh3(this, tj3Var, nj3Var));
            tj3Var.w = xea.m1 ? (byte) 2 : r11;
            if (tj3Var.n == null && this.Y2 == 0 && this.a3 == 0) {
                tj3Var.n = new xh3(ob6.L0(2131754715), ob6.L0(2131754717), tj3Var);
                boolean y3 = y3();
                xh3 xh3Var = tj3Var.n;
                if (y3) {
                    xh3Var.g();
                } else {
                    xh3Var.b();
                }
                tj3Var.n.X = tj3Var.w != 0 ? true : r11;
            }
            nj3 nj3Var2 = nj3Var;
            int i10 = i9;
            int i11 = i8;
            yh3 yh3Var = new yh3(this, this, context, tj3Var.s, this.Y2, this.n2, arrayList, this.currentAccount, this.H, tj3Var);
            context2 = context;
            tj3Var.d = yh3Var;
            yh3Var.L = tj3Var.a;
            yh3Var.R = this.v2;
            if (tj3Var.s == 3) {
                yh3Var.n = getMessagesController().k5() && (oj3Var = this.E2) != null && oj3Var.E();
            }
            if (hl.O1()) {
                long j = this.r2.a;
                if (j != 0) {
                    tj3Var.d.s = j;
                }
            }
            yh3 yh3Var2 = tj3Var.d;
            yh3Var2.M = tj3Var.n;
            tj3Var.a.setAdapter(yh3Var2);
            tj3Var.a.setEmptyView((this.Y2 == 0 && this.a3 == 0) ? tj3Var.x : null);
            hw6 hw6Var = new hw6(tj3Var.a, tj3Var.c);
            tj3Var.r = hw6Var;
            hw6Var.c = true;
            hw6Var.d = true;
            hw6Var.n = new xg3(this, b8);
            if (i10 != 0) {
                this.f0[i10].setVisibility(8);
            }
            i9 = i10 + 1;
            nj3Var = nj3Var2;
            i8 = i11;
            i6 = 17;
            r11 = 0;
        }
        nj3 nj3Var3 = nj3Var;
        byte b9 = 3;
        wj3 wj3Var = new wj3(context2);
        this.M1 = wj3Var;
        int i12 = aob.d6;
        wj3Var.setColor(aob.u0(i12));
        nj3Var3.addView(this.M1, tre.e(-1, 100, 48));
        this.C0 = nj3Var3.getChildCount();
        ew9 ew9Var = new ew9((Activity) getContext());
        this.a0 = ew9Var;
        nj3Var3.addView(ew9Var, tre.d(-1, 50.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
        ew9 ew9Var2 = this.a0;
        ol0 n = dtd.n(this.resourceProvider);
        ?? r5 = this.w4;
        jl0 b10 = r5.b(ew9Var2, n);
        ik8.r(b10, hl.L(18.0f), 6.666f);
        this.a0.setPadding(0, hl.L(7.0f), 0, hl.L(7.0f));
        this.a0.setBlurredBackground(b10);
        rh4 rh4Var = new rh4(getParentActivity(), null);
        this.c0 = rh4Var;
        rh4Var.setPadding(0, hl.L(3.0f), 0, hl.L(3.0f));
        rh4 rh4Var2 = this.c0;
        rh4Var2.i3 = false;
        rh4Var2.setOnItemClickListener(new yg3(this, b2));
        this.a0.addView(this.c0, tre.e(-1, -1, 48));
        zp4 zp4Var = new zp4(this.resourceProvider, context2, true);
        this.v0 = zp4Var;
        zp4Var.setContentDescription(ob6.L0(2131744212));
        this.v0.setImageResource(R.drawable.outline_fab_story_24);
        this.v0.setOnClickListener(new wg3(this, (byte) 20));
        nj3Var3.addView(this.v0, zp4.c());
        zp4 zp4Var2 = new zp4(context2, this.resourceProvider);
        this.u0 = zp4Var2;
        nj3Var3.addView(zp4Var2, zp4.b());
        this.u0.setOnClickListener(new wg3(this, (byte) 28));
        if (!F3() && this.T0 == 0 && uc7.s1(this.currentAccount).X3.getBoolean("storyhint", true)) {
            kg5 kg5Var = new kg5(context2, 2);
            kg5Var.q(8.0f);
            kg5Var.d = 8000L;
            kg5Var.j(true);
            kg5Var.h = hl.L(165.0f);
            kg5Var.p(true);
            f = 8.0f;
            kg5Var.t(hl.G2(ob6.L0(2131744369), rbb.k(context2), "%s"));
            kg5Var.n(1.0f, -40.0f);
            kg5Var.i(getThemedColor(aob.wj));
            kg5Var.r0 = new ch3(this, (byte) 13);
            this.q0 = kg5Var;
            nj3Var3.addView(kg5Var, tre.d(-1, 160.0f, 87, 0.0f, 0.0f, 80.0f, 0.0f));
        } else {
            f = 8.0f;
        }
        C5();
        this.b0 = null;
        if (this.n2 || this.T0 != 0) {
            b = 4;
            f2 = 72.0f;
            if (this.T0 == 3 || e3()) {
                z92 z92Var = new z92(context2);
                this.A1 = z92Var;
                z92Var.setClipChildren(false);
                ?? r0 = this.A1;
                v2d v2dVar = this.w;
                r0.setWindowInsetsProvider(v2dVar);
                z92 z92Var2 = this.A1;
                z92Var2.setInputIslandBubbleDrawable(r5.b(z92Var2, dtd.n(this.resourceProvider)));
                z92 z92Var3 = this.A1;
                z92Var3.setUnderKeyboardBackgroundDrawable(this.u4.b(z92Var3, dtd.n(this.resourceProvider)));
                rl0 rl0Var = new rl0(this.x4.b(this.A1, null));
                if (!xea.f() || i86.e(262144)) {
                    rl0Var.b(hl.L(72.0f), true);
                }
                this.A1.setBackgroundWithFadeDrawable(rl0Var);
                FrameLayout inputIslandBubbleContainer = this.A1.getInputIslandBubbleContainer();
                this.B1 = inputIslandBubbleContainer;
                inputIslandBubbleContainer.setClipChildren(false);
                this.C1 = this.A1.getInAppKeyboardBubbleContainer();
                bi3 bi3Var = this.D1;
                if (bi3Var != null) {
                    bi3Var.g1();
                }
                bi3 bi3Var2 = new bi3(this, getParentActivity(), nj3Var3);
                this.D1 = bi3Var2;
                bi3Var2.setInAppInsetsController(v2dVar);
                this.D1.i6 = false;
                nj3Var3.setClipChildren(false);
                nj3Var3.setClipToPadding(false);
                bi3 bi3Var3 = this.D1;
                bi3Var3.h6 = false;
                bi3Var3.X2 = !hl.E && ((zu1Var = bi3Var3.E3) == null || !zu1Var.isInBubbleMode());
                this.D1.G1(false, false, false);
                this.D1.R1(true, false);
                this.D1.o2.setPadding(0, hl.L(1.0f), hl.L(20.0f), 0);
                f3 = 0.0f;
                this.D1.getSendButton().setAlpha(0.0f);
                this.D1.setViewParentForEmoji(this.C1);
                this.B1.addView(this.D1, tre.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
                nj3Var3.addView(this.A1.getFadeView(), tre.c(-1.0f, -1));
                nj3Var3.addView(this.A1, tre.c(-1.0f, -1));
                if (z3() || this.G2 != null || this.H2 != null) {
                    D2(this.b4);
                    this.b4 = null;
                }
                this.D1.setDelegate(new ci3(this));
                di3 di3Var = new di3(this, context2, this.resourceProvider);
                this.E1 = di3Var;
                int L = hl.L(52.0f);
                int L2 = hl.L(38.0f);
                di3Var.L = L;
                di3Var.M = L2;
                di3 di3Var2 = this.E1;
                float L3 = hl.L(7.0f);
                float L4 = hl.L(f);
                di3Var2.P = L3;
                di3Var2.Q = L4;
                di3 di3Var3 = this.E1;
                di3Var3.t0 = true;
                nj3Var3.addView(di3Var3, tre.e(jn7.u1, 50, 85));
                this.E1.setScrimViewBackgroundColor(getThemedColor(i12));
                this.E1.setOnClickListener(new wg3(this, b));
                this.E1.setOnLongClickListener(new bh3(this, (byte) 0));
                this.E1.setVisibility(8);
                this.E1.setScaleX(0.2f);
                this.E1.setScaleY(0.2f);
                this.E1.setAlpha(0.0f);
                uh9.p(this.G1, hl.L(12.0f));
                ij3Var = this.A0;
                if (ij3Var != null) {
                    jl0 b11 = r5.b(ij3Var, dtd.r(this.resourceProvider));
                    ik8.r(b11, hl.L(18.0f), 6.666f);
                    this.A0.setPadding(0, hl.L(7.0f), 0, hl.L(7.0f));
                    this.A0.setBlurredBackground(b11);
                    this.A0.l(new ch3(this, (byte) 2), new ch3(this, b));
                    nj3Var3.addView(this.A0, tre.d(-1, -2.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
                }
                hj3Var = this.Y;
                if (hj3Var != null) {
                    hj3Var.setupBlurredBackground(r5.b(hj3Var, dtd.n(this.resourceProvider)));
                }
                ii3 ii3Var = new ii3(this, context2, this, this.currentAccount, F3() ? 1 : 0);
                this.F0 = ii3Var;
                ii3Var.setActionBar(this.actionBar);
                this.F0.setMenuItemsOffset(!F3() ? hl.L(68.0f) : hl.N(16.66f));
                ii3 ii3Var2 = this.F0;
                ii3Var2.m0 = false;
                ii3Var2.setVisibility(8);
                this.N = false;
                this.M = false;
                this.L = false;
                if (this.n2 && this.T0 == 3) {
                    uc7.s1(this.currentAccount).I1();
                }
                nj3Var3.addView(this.actionBar, tre.c(-2.0f, -1));
                if (!this.n2) {
                    zm zmVar = new zm(context2);
                    this.G3 = zmVar;
                    nj3Var3.addView(zmVar, tre.e(20, 20, 51));
                }
                hj3Var2 = this.Y;
                if (hj3Var2 != null) {
                    nj3Var3.addView(hj3Var2, tre.d(-1, 48.0f, 48, 7.0f, -2.0f, 7.0f, 0.0f));
                }
                this.y0 = nj3Var3.getChildCount();
                UndoView[] undoViewArr = this.z0;
                undoViewArr[0] = null;
                undoViewArr[1] = null;
                if (this.X) {
                    this.actionBar.getTitlesContainer().setTranslationX(hl.L(4.0f));
                    yob.d(this.actionBar, aob.Xl, getResourceProvider());
                }
                if (this.Y2 == 0 || this.a3 != 0) {
                    this.f0[0].a.setGlowColor(getThemedColor(i12));
                    yob.b(this.actionBar, aob.O8, getResourceProvider(), false);
                    yob.a(this.actionBar, aob.N8, getResourceProvider(), false);
                    this.actionBar.L(getThemedColor(aob.Q8), false);
                    this.actionBar.L(getThemedColor(aob.R8), true);
                }
                if (!this.n2 && this.T0 == 0) {
                    tb tbVar = new tb((byte) 12, context2, this);
                    this.L0 = tbVar;
                    tbVar.setForeground(new ColorDrawable(vm2.o(getThemedColor(i12), 100)));
                    this.L0.setFocusable(false);
                    this.L0.setImportantForAccessibility(2);
                    this.L0.setOnClickListener(new wg3(this, (byte) 6));
                    this.L0.setVisibility(8);
                    nj3Var3.addView(this.L0, tre.c(-1.0f, -1));
                }
                this.h1.setColor(getThemedColor(i12));
                this.s3 = false;
                if (this.p2 == null) {
                    k5(true, false, false, false);
                    this.Y.r.setText(this.p2);
                    this.Y.r.setSelection(this.p2.length());
                } else if (this.q2 != null) {
                    k5(true, false, false, true);
                    this.Z.b(true);
                    this.Y.r.setText(this.q2);
                    this.Y.r.setSelection(this.q2.length());
                    this.q2 = null;
                    hj3 hj3Var4 = this.Y;
                    if (hj3Var4 != null) {
                        hj3Var4.setTranslationY(u3() + (-hl.L(36.0f)));
                    }
                } else {
                    k5(false, false, false, false);
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    FilesMigrationService.a(this);
                }
                this.actionBar.setDrawBlurBackground(nj3Var3);
                this.H3 = new li3(this, context2, nj3Var3, context2);
                s5(true, false);
                this.H3.setOpenProgress(f3);
                nj3Var3.addView(this.F0, tre.c(81.0f, -1));
                nj3Var3.addView(this.H3, tre.c(-1.0f, -1));
                this.G0 = new vj3(context2);
                xj3Var = this.L1;
                if (xj3Var != null) {
                    nj3Var3.addView(xj3Var, tre.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
                }
                if (this.a3 != 0 && this.T0 != 3 && xc2.c(this.b3)) {
                    wm2 wm2Var = new wm2(R.drawable.filled_add_album);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("+ ");
                    spannableStringBuilder2.append((CharSequence) ob6.L0(2131751954));
                    spannableStringBuilder2.setSpan(wm2Var, 0, 1, 33);
                    c51 c51Var = new c51(context2, this.resourceProvider);
                    this.w0 = c51Var;
                    c51Var.f();
                    this.w0.setText(spannableStringBuilder2);
                    this.w0.setOnClickListener(new je3(this, new id[1], b9));
                    jz1 jz1Var = new jz1(getContext());
                    this.x0 = jz1Var;
                    jz1Var.setupColorKey(aob.a7);
                    this.x0.setFadeZoneBottom(hl.L(f2) + hl.n);
                    this.x0.setFadeHeightBottom(hl.L(24.0f));
                    nj3Var3.addView(this.x0, tre.g());
                    nj3Var3.addView(this.w0, tre.f(48.0f, -1, 80, hl.L(12.0f), 0, hl.L(12.0f), hl.L(12.0f) + hl.n));
                }
                E5(false);
                v5(false);
                b3();
                Y2();
                a3();
                Z2();
                X2();
                R2();
                this.Y.setBlurredBackgroundVisibility(this.b.e);
                vy4 vy4Var = this.glassEngine;
                vy4Var.a = new xg3(this, (byte) 6);
                vy4Var.d = new gz4(hl.L(48.0f));
                View view = this.fragmentView;
                xg3 xg3Var = new xg3(this, (byte) 7);
                WeakHashMap weakHashMap = ihc.a;
                ahc.i(view, xg3Var);
                return this.fragmentView;
            }
        } else {
            xj3 xj3Var2 = new xj3(context2);
            this.L1 = xj3Var2;
            byte b12 = 17;
            xj3Var2.setOnAnimatedHeightChangedListener(new ch3(this, b12));
            jl0 a5 = r5.a(this.L1);
            a5.p(dtd.n(this.resourceProvider));
            a5.q(hl.L(7.0f));
            f2 = 72.0f;
            this.L1.setPadding(hl.L(11.0f), hl.L(21.0f), hl.L(11.0f), hl.L(21.0f));
            this.L1.setBlurredBackground(a5);
            this.L1.setDefaultRadiusDp(this.a3 != 0 ? 18 : 24);
            FrameLayout frameLayout = new FrameLayout(context2);
            this.I1 = frameLayout;
            this.L1.addView(frameLayout);
            this.L1.i(5, this.I1);
            this.L1.h(this.I1);
            this.L1.j(this.I1, true, false);
            FrameLayout frameLayout2 = new FrameLayout(context2);
            this.K1 = frameLayout2;
            this.L1.addView(frameLayout2);
            b = 4;
            this.L1.i(4, this.K1);
            this.L1.h(this.K1);
            this.L1.j(this.K1, true, false);
            zh3 zh3Var = new zh3(this, context2, this, (byte) 0);
            this.H1 = zh3Var;
            this.I1.addView(zh3Var);
            zh3 zh3Var2 = new zh3(this, context2, this, (byte) 1);
            this.J1 = zh3Var2;
            this.K1.addView(zh3Var2);
            this.L1.setCallFragmentContextView(this.J1);
            uk3 uk3Var = new uk3(context2);
            this.O1 = uk3Var;
            uk3Var.setBackground(aob.L0(false));
            q5();
            z61.c0(new sg3(this, (byte) 0));
            z61.l0(new n82(this, b12));
            this.L1.addView(this.O1);
            if (this.a3 != 0) {
                ko2 ko2Var = new ko2(this.resourceProvider, context2, true);
                this.S1 = ko2Var;
                ko2Var.a(-14899731, -15497247, R.drawable.filled_requests_24, ob6.L0(2131751860), null, false);
                this.S1.setUnreadMode(true);
                this.S1.setBackground(aob.L0(false));
                this.S1.setOnClickListener(new wg3(this, b9));
                this.L1.addView(this.S1);
                L2(false);
            }
        }
        f3 = 0.0f;
        ij3Var = this.A0;
        if (ij3Var != null) {
        }
        hj3Var = this.Y;
        if (hj3Var != null) {
        }
        ii3 ii3Var3 = new ii3(this, context2, this, this.currentAccount, F3() ? 1 : 0);
        this.F0 = ii3Var3;
        ii3Var3.setActionBar(this.actionBar);
        this.F0.setMenuItemsOffset(!F3() ? hl.L(68.0f) : hl.N(16.66f));
        ii3 ii3Var22 = this.F0;
        ii3Var22.m0 = false;
        ii3Var22.setVisibility(8);
        this.N = false;
        this.M = false;
        this.L = false;
        if (this.n2) {
            uc7.s1(this.currentAccount).I1();
        }
        nj3Var3.addView(this.actionBar, tre.c(-2.0f, -1));
        if (!this.n2) {
        }
        hj3Var2 = this.Y;
        if (hj3Var2 != null) {
        }
        this.y0 = nj3Var3.getChildCount();
        UndoView[] undoViewArr2 = this.z0;
        undoViewArr2[0] = null;
        undoViewArr2[1] = null;
        if (this.X) {
        }
        if (this.Y2 == 0) {
        }
        this.f0[0].a.setGlowColor(getThemedColor(i12));
        yob.b(this.actionBar, aob.O8, getResourceProvider(), false);
        yob.a(this.actionBar, aob.N8, getResourceProvider(), false);
        this.actionBar.L(getThemedColor(aob.Q8), false);
        this.actionBar.L(getThemedColor(aob.R8), true);
        if (!this.n2) {
            tb tbVar2 = new tb((byte) 12, context2, this);
            this.L0 = tbVar2;
            tbVar2.setForeground(new ColorDrawable(vm2.o(getThemedColor(i12), 100)));
            this.L0.setFocusable(false);
            this.L0.setImportantForAccessibility(2);
            this.L0.setOnClickListener(new wg3(this, (byte) 6));
            this.L0.setVisibility(8);
            nj3Var3.addView(this.L0, tre.c(-1.0f, -1));
        }
        this.h1.setColor(getThemedColor(i12));
        this.s3 = false;
        if (this.p2 == null) {
        }
        if (Build.VERSION.SDK_INT >= 30) {
        }
        this.actionBar.setDrawBlurBackground(nj3Var3);
        this.H3 = new li3(this, context2, nj3Var3, context2);
        s5(true, false);
        this.H3.setOpenProgress(f3);
        nj3Var3.addView(this.F0, tre.c(81.0f, -1));
        nj3Var3.addView(this.H3, tre.c(-1.0f, -1));
        this.G0 = new vj3(context2);
        xj3Var = this.L1;
        if (xj3Var != null) {
        }
        if (this.a3 != 0) {
            wm2 wm2Var2 = new wm2(R.drawable.filled_add_album);
            SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder("+ ");
            spannableStringBuilder22.append((CharSequence) ob6.L0(2131751954));
            spannableStringBuilder22.setSpan(wm2Var2, 0, 1, 33);
            c51 c51Var2 = new c51(context2, this.resourceProvider);
            this.w0 = c51Var2;
            c51Var2.f();
            this.w0.setText(spannableStringBuilder22);
            this.w0.setOnClickListener(new je3(this, new id[1], b9));
            jz1 jz1Var2 = new jz1(getContext());
            this.x0 = jz1Var2;
            jz1Var2.setupColorKey(aob.a7);
            this.x0.setFadeZoneBottom(hl.L(f2) + hl.n);
            this.x0.setFadeHeightBottom(hl.L(24.0f));
            nj3Var3.addView(this.x0, tre.g());
            nj3Var3.addView(this.w0, tre.f(48.0f, -1, 80, hl.L(12.0f), 0, hl.L(12.0f), hl.L(12.0f) + hl.n));
        }
        E5(false);
        v5(false);
        b3();
        Y2();
        a3();
        Z2();
        X2();
        R2();
        this.Y.setBlurredBackgroundVisibility(this.b.e);
        vy4 vy4Var2 = this.glassEngine;
        vy4Var2.a = new xg3(this, (byte) 6);
        vy4Var2.d = new gz4(hl.L(48.0f));
        View view2 = this.fragmentView;
        xg3 xg3Var2 = new xg3(this, (byte) 7);
        WeakHashMap weakHashMap2 = ihc.a;
        ahc.i(view2, xg3Var2);
        return this.fragmentView;
    }

    public final void d3() {
        if (this.L1 != null) {
            float R1 = hl.R1(0.98f, 1.0f, 1.0f);
            this.L1.setAlpha(1.0f);
            this.L1.setScaleX(R1);
            this.L1.setScaleY(R1);
            this.L1.setVisibility(0);
        }
    }

    public final void d4(TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
            exc.a(getParentActivity(), new gt(this, tL_attachMenuBot, launchActivity, (byte) 13), null);
        } else {
            LaunchActivity.G0(launchActivity, this.currentAccount, tL_attachMenuBot, null, true);
        }
    }

    public final void d5(boolean z) {
        byte b = 1;
        this.c.a(z, true);
        if (this.n0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.V3;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.V3 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.V3 = animatorSet2;
        animatorSet2.setDuration(180L);
        s7 s7Var = this.n0;
        if (z) {
            s7Var.setVisibility(0);
        } else {
            s7Var.setSelected(false);
            Drawable background = this.n0.getBackground();
            if (background != null) {
                background.setState(StateSet.NOTHING);
                background.jumpToCurrentState();
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.n0, (Property<s7, Float>) View.ALPHA, z ? 1.0f : 0.0f));
        this.V3.playTogether(arrayList);
        this.V3.addListener(new ri3(this, z, b));
        this.V3.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:433:0x058c, code lost:
    
        if (xc2.S(r1.K0, r12) == false) goto L366;
     */
    /* JADX WARN: Removed duplicated region for block: B:376:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:381:? A[RETURN, SYNTHETIC] */
    @Override // fn7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3;
        ac7 ac7Var;
        int i4;
        char c;
        boolean booleanValue;
        boolean z;
        gx9 gx9Var;
        gx9 gx9Var2;
        int i5;
        boolean z2;
        boolean z3 = false;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        if (i == jn7.r) {
            if (this.f0 == null || this.U1) {
                return;
            }
            int i9 = 0;
            while (true) {
                tj3[] tj3VarArr = this.f0;
                if (i9 >= tj3VarArr.length) {
                    break;
                }
                tj3 tj3Var = tj3VarArr[i9];
                boolean I4 = I4(tj3Var);
                if (this.B3 && I4) {
                    hl.d3(new cv2(this, tj3Var, objArr, (byte) 5), 160L);
                } else {
                    int length = objArr.length;
                    O4(tj3Var);
                }
                i9++;
            }
            ij3 ij3Var = this.A0;
            if (ij3Var != null && ij3Var.getVisibility() == 0) {
                this.A0.d();
            }
            F5(-1, true);
            this.B3 = false;
            return;
        }
        if (i == jn7.t5) {
            G5(0, true);
            tj3[] tj3VarArr2 = this.f0;
            if (tj3VarArr2 != null) {
                for (tj3 tj3Var2 : tj3VarArr2) {
                    if (tj3Var2.getVisibility() == 0 && I4(tj3Var2)) {
                        ch3 ch3Var = this.T3;
                        hl.r(ch3Var);
                        hl.d3(ch3Var, 100L);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i == jn7.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.a3 != chatFull.id) {
                return;
            }
            this.c3 = chatFull;
            L2(false);
            if (this.f0 == null || this.U1) {
                return;
            }
            while (true) {
                tj3[] tj3VarArr3 = this.f0;
                if (i6 >= tj3VarArr3.length) {
                    return;
                }
                O4(tj3VarArr3[i6]);
                i6++;
            }
        } else {
            ArrayList arrayList = null;
            if (i == jn7.d2) {
                ij3 ij3Var2 = this.A0;
                if (ij3Var2 == null || ij3Var2.getVisibility() != 0) {
                    return;
                }
                ij3 ij3Var3 = this.A0;
                int defaultTabId = ij3Var3.getDefaultTabId();
                gu guVar = ij3Var3.G;
                ArrayList arrayList2 = ij3Var3.h;
                int i10 = ij3Var3.n0.get(defaultTabId, -1);
                if (i10 < 0 || i10 >= arrayList2.size()) {
                    return;
                }
                bg4 bg4Var = (bg4) arrayList2.get(i10);
                if (bg4Var.d == ij3Var3.K.q(bg4Var.a) || ij3Var3.K.q(bg4Var.a) < 0) {
                    return;
                }
                guVar.i1();
                if (ij3Var3.o0.get(i10) != bg4Var.a(true) || ij3Var3.j0) {
                    ij3Var3.j0 = true;
                    ij3Var3.requestLayout();
                    guVar.setItemAnimator(ij3Var3.u0);
                    t20 t20Var = ij3Var3.J;
                    if (t20Var != null) {
                        t20Var.f();
                    }
                    ij3Var3.N = 0;
                    bg4 e = ij3Var3.e();
                    if (e != null) {
                        e.b(ob6.M0(2131750772, null));
                    }
                    int size = arrayList2.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        ij3Var3.N = uh9.w(24.0f, ((bg4) arrayList2.get(i11)).a(true), ij3Var3.N);
                    }
                    return;
                }
                return;
            }
            if (i == jn7.c5) {
                G5(0, true);
                return;
            }
            if (i == jn7.b5) {
                G5(0, true);
                return;
            }
            if (i == jn7.l4) {
                if (this.f0 != null) {
                    int i12 = 0;
                    while (true) {
                        tj3[] tj3VarArr4 = this.f0;
                        if (i12 >= tj3VarArr4.length) {
                            break;
                        }
                        qj3 qj3Var = tj3VarArr4[i12].a;
                        if (qj3Var != null) {
                            for (int i13 = 0; i13 < qj3Var.getChildCount(); i13++) {
                                View childAt = qj3Var.getChildAt(i13);
                                if (childAt != null) {
                                    childAt.invalidate();
                                }
                            }
                        }
                        i12++;
                    }
                }
                ij3 ij3Var4 = this.A0;
                if (ij3Var4 != null) {
                    ij3Var4.getTabsContainer().i1();
                    return;
                }
                return;
            }
            if (i == jn7.L4) {
                a aVar = this.actionBar;
                if (aVar != null) {
                    aVar.o(true);
                    return;
                }
                return;
            }
            if (i == jn7.D4) {
                w5(false, false);
                return;
            }
            if (i == 2) {
                Integer num = (Integer) objArr[0];
                G5(num.intValue(), true);
                ij3 ij3Var5 = this.A0;
                if (ij3Var5 != null && ij3Var5.getVisibility() == 0) {
                    int intValue = num.intValue();
                    int i14 = uc7.r5;
                    if ((intValue & 256) != 0) {
                        this.A0.d();
                    }
                }
                if (this.a3 != 0) {
                    int intValue2 = num.intValue();
                    int i15 = uc7.r5;
                    if ((intValue2 & TLObject.FLAG_13) != 0 || (num.intValue() & 2) != 0 || (num.intValue() & 8) != 0 || (num.intValue() & 16) != 0) {
                        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.a3));
                        this.b3 = M0;
                        this.actionBar.setTitle(wf3.l(M0));
                        this.d3.f(this.b3, this.e3);
                    }
                }
                if (this.f0 != null) {
                    for (int i16 = 0; i16 < this.f0.length; i16++) {
                        int intValue3 = num.intValue();
                        int i17 = uc7.r5;
                        if ((intValue3 & 4) != 0) {
                            this.f0[i16].d.P(true);
                        }
                    }
                }
                B5(yac.h(i2).f(), true);
                return;
            }
            int i18 = jn7.I2;
            boolean[] zArr = F4;
            if (i == i18) {
                zArr[this.currentAccount] = false;
                return;
            }
            if (i == jn7.Y) {
                G5(0, true);
                return;
            }
            if (i == jn7.N) {
                if (this.f0 == null || this.U1) {
                    return;
                }
                zp4 zp4Var = this.u0;
                if (zp4Var != null) {
                    z2 = zp4Var.getProgressVisible();
                    this.u0.f(false, true);
                } else {
                    z2 = false;
                }
                for (tj3 tj3Var3 : this.f0) {
                    tj3Var3.d.e = false;
                }
                if (z2) {
                    T4(0.0f);
                    ValueAnimator valueAnimator = this.e0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(this.d0, 1.0f).setDuration(250L);
                    this.e0 = duration;
                    duration.setInterpolator(k43.f);
                    this.e0.addUpdateListener(new ug3(this, (byte) 0));
                    this.e0.start();
                }
                int i19 = 0;
                boolean z4 = false;
                while (true) {
                    tj3[] tj3VarArr5 = this.f0;
                    if (i19 >= tj3VarArr5.length) {
                        break;
                    }
                    if (!tj3VarArr5[i19].a() || getMessagesController().D0() > 10) {
                        z4 = true;
                    } else {
                        this.f0[i19].d.f();
                    }
                    i19++;
                    z4 = z4;
                }
                if (z4) {
                    G5(0, true);
                    return;
                }
                return;
            }
            if (i != jn7.h0) {
                if (i == jn7.f0) {
                    G5(0, true);
                    return;
                }
                if (i == jn7.I || i == jn7.J || i == jn7.L) {
                    int i20 = uc7.r5;
                    G5(TLObject.FLAG_12, true);
                    return;
                }
                if (i == jn7.n0) {
                    U2();
                    return;
                }
                byte b = 15;
                if (i == jn7.P0) {
                    bj3 bj3Var = this.D0;
                    if (bj3Var == null || (gx9Var2 = bj3Var.e0) == null || (i5 = gx9Var2.i0) == 15) {
                        return;
                    }
                    int i21 = gx9Var2.t0;
                    jf7.Y(i21).a.c(new bt(i21, i5, (Object) new ll3(gx9Var2), (byte) 6));
                    return;
                }
                if (i == jn7.s0) {
                    int i22 = uc7.r5;
                    G5(32768, true);
                    return;
                }
                if (i == jn7.S0) {
                    bj3 bj3Var2 = this.D0;
                    if (bj3Var2 == null || (gx9Var = bj3Var2.e0) == null) {
                        return;
                    }
                    gx9Var.f();
                    return;
                }
                if (i == jn7.T1) {
                    int connectionState = ConnectionsManager.getInstance(k5.a(i2).a).getConnectionState();
                    if (this.f2 != connectionState) {
                        this.f2 = connectionState;
                        w5(true, false);
                        return;
                    }
                    return;
                }
                if (i == jn7.e5) {
                    w5(true, false);
                    bj3 bj3Var3 = this.D0;
                    if (bj3Var3 != null) {
                        int currentPosition = bj3Var3.getCurrentPosition();
                        bn0 bn0Var = bj3Var3.W;
                        A5(bn0Var != null && bn0Var.h(currentPosition) == 2);
                        return;
                    }
                    return;
                }
                if (i == jn7.K2) {
                    if (this.fragmentView != null) {
                        long longValue = ((Long) objArr[0]).longValue();
                        TLRPC.User user = (TLRPC.User) objArr[1];
                        TLRPC.Chat chat = (TLRPC.Chat) objArr[2];
                        if (user == null || !user.bot) {
                            booleanValue = ((Boolean) objArr[3]).booleanValue();
                            z = false;
                        } else {
                            z = ((Boolean) objArr[3]).booleanValue();
                            booleanValue = false;
                        }
                        Runnable nh3Var = new nh3(this, chat, longValue, booleanValue, user, z);
                        j3();
                        if (this.z0[0] == null) {
                            nh3Var.run();
                            return;
                        }
                        if (xc2.c0(chat)) {
                            nh3Var.run();
                            return;
                        }
                        UndoView w3 = w3();
                        if (w3 != null) {
                            w3.j(booleanValue ? 1 : 95, longValue, nh3Var);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i == jn7.d0) {
                    int intValue4 = ((Integer) objArr[0]).intValue();
                    int i23 = this.Y2;
                    if (i23 != intValue4 || i23 == 0) {
                        return;
                    }
                    if (isLastFragment()) {
                        finishFragment();
                        return;
                    } else {
                        removeSelfFromStack();
                        return;
                    }
                }
                if (i == jn7.O2) {
                    s5(true, true);
                    F5(-1, true);
                    return;
                }
                if (i == jn7.P2) {
                    z3 = true;
                } else if (i != jn7.Q2) {
                    if (i == jn7.R2) {
                        e5();
                        return;
                    }
                    if (i == jn7.s1) {
                        g5();
                        q5();
                        uc7 messagesController = getMessagesController();
                        if (!messagesController.j5 && messagesController.A4 + 10 >= messagesController.getConnectionsManager().getCurrentTime()) {
                            boolean contains = messagesController.u3.contains("SETUP_LOGIN_EMAIL");
                            if (messagesController.u3.contains("SETUP_LOGIN_EMAIL_NOSKIP")) {
                                c = 2;
                            } else if (contains) {
                                c = 1;
                            }
                            if (c == 0) {
                                qh6 qh6Var = new qh6();
                                ch3 ch3Var2 = new ch3(this, (byte) 14);
                                ch3 ch3Var3 = new ch3(this, b);
                                boolean z5 = c == 2;
                                qh6Var.G = (byte) 3;
                                qh6Var.a = 12;
                                qh6Var.e0 = ch3Var2;
                                qh6Var.f0 = ch3Var3;
                                qh6Var.h0 = z5;
                                qh6Var.i0 = true;
                                presentFragment(qh6Var);
                                getMessagesController().j5 = true;
                                return;
                            }
                            return;
                        }
                        c = 0;
                        if (c == 0) {
                        }
                    } else {
                        if (i == jn7.M) {
                            zp4 zp4Var2 = this.u0;
                            if (zp4Var2 != null) {
                                zp4Var2.f(true, true);
                            }
                            tj3[] tj3VarArr6 = this.f0;
                            if (tj3VarArr6 != null) {
                                for (tj3 tj3Var4 : tj3VarArr6) {
                                    yh3 yh3Var = tj3Var4.d;
                                    yh3Var.R = false;
                                    yh3Var.e = true;
                                    yh3Var.f();
                                }
                                return;
                            }
                            return;
                        }
                        if (i == jn7.v) {
                            if (!this.s3 || this.D0 == null) {
                                return;
                            }
                            ArrayList arrayList3 = (ArrayList) objArr[0];
                            long longValue2 = ((Long) objArr[1]).longValue();
                            bj3 bj3Var4 = this.D0;
                            HashMap hashMap = bj3Var4.C0;
                            SparseArray sparseArray = bj3Var4.h;
                            int size2 = sparseArray.size();
                            for (int i24 = 0; i24 < size2; i24++) {
                                View view = (View) sparseArray.valueAt(i24);
                                if (view instanceof yg4) {
                                    ((yg4) view).d(arrayList3, longValue2);
                                }
                            }
                            for (int i25 = 0; i25 < bj3Var4.getChildCount(); i25++) {
                                if (bj3Var4.getChildAt(i25) instanceof yg4) {
                                    ((yg4) bj3Var4.getChildAt(i25)).d(arrayList3, longValue2);
                                }
                            }
                            bj3Var4.P0.d(arrayList3, longValue2);
                            if (hashMap.isEmpty()) {
                                return;
                            }
                            ArrayList arrayList4 = new ArrayList(hashMap.keySet());
                            for (int i26 = 0; i26 < arrayList4.size(); i26++) {
                                qg4 qg4Var = (qg4) arrayList4.get(i26);
                                r47 r47Var = (r47) hashMap.get(qg4Var);
                                if (r47Var != null) {
                                    long B0 = r47.B0(r47Var.k);
                                    if (B0 < 0) {
                                        i4 = (int) (-B0);
                                    }
                                    i4 = 0;
                                    if (i4 == longValue2) {
                                        for (int i27 = 0; i27 < arrayList3.size(); i27++) {
                                            if (r47Var.e1() == ((Integer) arrayList3.get(i27)).intValue()) {
                                                arrayList = new ArrayList();
                                                arrayList.add(qg4Var);
                                            }
                                        }
                                    }
                                }
                            }
                            if (arrayList != null) {
                                int size3 = arrayList.size();
                                for (int i28 = 0; i28 < size3; i28++) {
                                    hashMap.remove(arrayList.get(i28));
                                }
                                bj3Var4.A0.a(hashMap.size(), true);
                                s7 s7Var = bj3Var4.F0;
                                if (s7Var != null) {
                                    s7Var.setVisibility(hashMap.size() != 1 ? 8 : 0);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (i == jn7.O4) {
                            if (this.f0 != null) {
                                while (true) {
                                    tj3[] tj3VarArr7 = this.f0;
                                    if (i7 >= tj3VarArr7.length) {
                                        break;
                                    }
                                    dk3 dk3Var = tj3VarArr7[i7].d.Q;
                                    if (dk3Var != null) {
                                        dk3Var.a.clear();
                                        dk3Var.b.clear();
                                        dk3Var.c.clear();
                                        dk3Var.d.clear();
                                        hl.r(dk3Var.e);
                                    }
                                    i7++;
                                }
                            }
                            int i29 = by4.l1;
                            return;
                        }
                        if (i == jn7.W5) {
                            long longValue3 = ((Long) objArr[0]).longValue();
                            boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
                            if (this.a3 != longValue3 || booleanValue2) {
                                return;
                            }
                            wk5 wk5Var = this.parentLayout;
                            if (wk5Var == null || wk5Var.getLastFragment() != this) {
                                removeSelfFromStack();
                                return;
                            } else {
                                finishFragment();
                                return;
                            }
                        }
                        if (i == jn7.V5) {
                            if (this.a3 == ((Long) objArr[0]).longValue()) {
                                L2(true);
                                return;
                            }
                            return;
                        }
                        if (i == jn7.V4) {
                            boolean booleanValue3 = ((Boolean) objArr[0]).booleanValue();
                            if (this.fragmentView != null) {
                                d93 d93Var = this.X3;
                                if (!booleanValue3) {
                                    if (d93Var == null || d93Var.getTag() == null) {
                                        return;
                                    }
                                    d93 d93Var2 = this.X3;
                                    d93Var2.animate().setListener(null).cancel();
                                    d93Var2.animate().setListener(new v5(this, d93Var2, (byte) 18)).alpha(0.0f).setStartDelay(0L).setDuration(150L).start();
                                    this.X3.setTag(null);
                                    return;
                                }
                                if (d93Var == null) {
                                    Context context = this.fragmentView.getContext();
                                    d93 d93Var3 = new d93(context);
                                    LinearLayout j = uh9.j(context, 1);
                                    e29 e29Var = new e29(context);
                                    e29Var.f(R.raw.db_migration_placeholder, jn7.f2, jn7.f2, null);
                                    e29Var.getAnimatedDrawable().F(1);
                                    e29Var.d();
                                    j.addView(e29Var, tre.r(jn7.f2, jn7.f2, 1));
                                    TextView textView = new TextView(context);
                                    bs2.r(24.0f, 1, 2131747505, textView, null);
                                    int i30 = aob.G6;
                                    yob.X(textView, i30, null);
                                    textView.setGravity(1);
                                    TextView m = ik8.m(j, textView, tre.q(-1, -2, 0.0f, 0, 50, 32, 50, 0), context);
                                    m.setLineSpacing(hl.L(2.0f), 1.0f);
                                    bs2.r(14.0f, 1, 2131747504, m, null);
                                    yob.X(m, i30, null);
                                    m.setGravity(1);
                                    TextView m2 = ik8.m(j, m, tre.q(-1, -2, 0.0f, 0, 36, 20, 36, 0), context);
                                    bs2.r(14.0f, 1, 2131747503, m2, null);
                                    yob.X(m2, i30, null);
                                    m2.setGravity(1);
                                    j.addView(m2, tre.q(-1, -2, 0.0f, 0, 36, 24, 36, 0));
                                    d93Var3.addView(j, tre.e(-1, -2, 16));
                                    yob.h(aob.d6, null, d93Var3);
                                    d93Var3.setOnTouchListener(new c93());
                                    this.X3 = d93Var3;
                                    d93Var3.setAlpha(0.0f);
                                    ((nj3) this.fragmentView).addView(this.X3);
                                    this.X3.animate().alpha(1.0f).setDuration(300L).setStartDelay(1000L).start();
                                }
                                this.X3.setTag(1);
                                return;
                            }
                            return;
                        }
                        if (i == jn7.d5) {
                            N2();
                            return;
                        }
                        if (i == jn7.p5) {
                            B5((TLRPC.User) objArr[0], true);
                            return;
                        }
                        if (i == jn7.i5) {
                            B5(yac.h(i2).f(), true);
                            C5();
                            return;
                        }
                        if (i == jn7.w5) {
                            zArr[this.currentAccount] = false;
                            x4(getAccountInstance());
                            getMessagesController().j3(this.Y2);
                            return;
                        }
                        if (i == jn7.C5) {
                            int intValue5 = ((Integer) objArr[0]).intValue();
                            while (true) {
                                tj3[] tj3VarArr8 = this.f0;
                                if (i8 >= tj3VarArr8.length) {
                                    return;
                                }
                                tj3 tj3Var5 = tj3VarArr8[i8];
                                if (tj3Var5 != null && (((i3 = tj3Var5.s) == 7 || i3 == 8) && (ac7Var = getMessagesController().N[tj3Var5.s - 7]) != null && intValue5 == ac7Var.a)) {
                                    tj3Var5.b(true);
                                    return;
                                }
                                i8++;
                            }
                        } else {
                            if (i != jn7.P1) {
                                if (i == jn7.y5) {
                                    E5(this.W);
                                    G5(0, true);
                                    return;
                                }
                                if (i == jn7.b3) {
                                    C5();
                                    return;
                                }
                                if (i == jn7.f3) {
                                    q5();
                                    return;
                                }
                                if (i == jn7.j5) {
                                    q5();
                                    return;
                                }
                                if (i == jn7.A3 || i == jn7.C3) {
                                    q5();
                                    return;
                                } else if (i == jn7.S3) {
                                    q5();
                                    return;
                                } else {
                                    if (i == jn7.T3) {
                                        q5();
                                        return;
                                    }
                                    return;
                                }
                            }
                            long longValue4 = ((Long) objArr[0]).longValue();
                            int i31 = 0;
                            while (true) {
                                tj3[] tj3VarArr9 = this.f0;
                                if (i31 >= tj3VarArr9.length) {
                                    return;
                                }
                                tj3 tj3Var6 = tj3VarArr9[i31];
                                if (tj3Var6.a != null) {
                                    int i32 = 0;
                                    while (true) {
                                        if (i32 < tj3Var6.a.getChildCount()) {
                                            View childAt2 = tj3Var6.a.getChildAt(i32);
                                            if (childAt2 instanceof of3) {
                                                of3 of3Var = (of3) childAt2;
                                                if (longValue4 == of3Var.getDialogId()) {
                                                    of3Var.C();
                                                    break;
                                                }
                                            }
                                            i32++;
                                        }
                                    }
                                }
                                i31++;
                            }
                        }
                    }
                }
                N4(z3);
                F5(-1, true);
                return;
            }
            if (this.f0 == null) {
                return;
            }
            int i33 = 0;
            while (true) {
                tj3[] tj3VarArr10 = this.f0;
                if (i33 >= tj3VarArr10.length) {
                    int i34 = uc7.r5;
                    G5(512, true);
                    return;
                }
                if (tj3VarArr10[i33].a() && hl.O1()) {
                    boolean booleanValue4 = ((Boolean) objArr[2]).booleanValue();
                    long longValue5 = ((Long) objArr[0]).longValue();
                    long longValue6 = ((Long) objArr[1]).longValue();
                    if7 if7Var = this.r2;
                    if (booleanValue4) {
                        long j2 = if7Var.a;
                        if (longValue5 == j2 && longValue6 == if7Var.b) {
                            if7Var.a = 0L;
                            if7Var.b = 0L;
                            longValue5 = 0;
                        } else {
                            longValue5 = j2;
                        }
                    } else {
                        if7Var.a = longValue5;
                        if7Var.b = longValue6;
                    }
                    this.f0[i33].d.s = longValue5;
                }
                i33++;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return !(dialog instanceof xw0) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public boolean e3() {
        return this.T0 == 10;
    }

    public final /* synthetic */ void e4(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        xw0.l(this.currentAccount, tL_attachMenuBot.bot_id, null);
    }

    public final void e5() {
        if (this.B0 || !getMessagesController().L0 || !getMessagesController().n3 || this.A0 == null || !getMessagesController().T0().isEmpty() || this.isPaused || !getUserConfig().Q || this.inPreviewMode) {
            return;
        }
        SharedPreferences e1 = uc7.e1();
        if (e1.getBoolean("filterhint", false)) {
            return;
        }
        e1.edit().putBoolean("filterhint", true).apply();
        hl.d3(new rg3(this, (byte) 2), 1000L);
    }

    public final void f3() {
        if (!hl.O1()) {
            this.X1 = true;
            return;
        }
        a aVar = this.actionBar;
        if (aVar != null) {
            aVar.o(true);
        }
        TLObject tLObject = this.Z1;
        if (tLObject != null) {
            bj3 bj3Var = this.D0;
            if (bj3Var != null) {
                bj3Var.e0.Q(this.Y1, tLObject);
            }
            this.Z1 = null;
        }
    }

    public final /* synthetic */ void f4(float f, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.w3 = floatValue;
        this.f0[0].setTranslationY((-f) * floatValue);
        for (int i = 0; i < this.actionBar.getChildCount(); i++) {
            if (this.actionBar.getChildAt(i).getVisibility() == 0 && this.actionBar.getChildAt(i) != this.actionBar.getActionMode() && this.actionBar.getChildAt(i) != this.actionBar.getBackButton()) {
                this.actionBar.getChildAt(i).setAlpha(1.0f - this.w3);
            }
        }
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        a3();
        S2();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f5() {
        int i;
        int i2;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2;
        LaunchActivity launchActivity;
        byte b;
        float f;
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        vg3 vg3Var;
        wd3 wd3Var;
        b8 b8Var;
        vnb vnbVar;
        int intValue;
        Integer num;
        int i3;
        fu5 I = fu5.I(this, this.l0);
        int i4 = aob.A8;
        I.T(getThemedColor(i4), getThemedColor(i4));
        byte b2 = 8;
        I.s = (short) 8;
        Activity parentActivity = getParentActivity();
        LaunchActivity launchActivity2 = parentActivity instanceof LaunchActivity ? (LaunchActivity) parentActivity : null;
        float f2 = 64.0f;
        byte b3 = 1;
        byte b4 = 0;
        if (this.a3 != 0) {
            if (xc2.N(this.b3)) {
                I.b(R.drawable.msg_customize, ob6.M0(2131751878, null), new rg3(this, b2), false);
                I.j();
            }
            I.h(new rg3(this, (byte) 11), ob6.M0(2131751877, null), this.b3.collapsed_in_dialogs);
            I.h(new rg3(this, (byte) 12), ob6.M0(2131751876, null), !this.b3.collapsed_in_dialogs);
            I.a0();
            I.Y(-hl.L(64.0f));
            return;
        }
        if (F3()) {
            I.b(R.drawable.msg_customize, ob6.M0(2131754136, null), new rg3(this, (byte) 13), false);
            I.b(R.drawable.msg_help, ob6.M0(2131749030, null), new rg3(this, (byte) 14), false);
            I.a0();
            I.Y(-hl.L(64.0f));
            return;
        }
        vnb vnbVar2 = this.resourceProvider;
        if (vnbVar2 != null ? vnbVar2.a() : aob.I.o()) {
            i = R.drawable.menu_day_mode_24;
            i2 = 2131743953;
        } else {
            i = R.drawable.menu_night_mode_24;
            i2 = 2131743952;
        }
        I.b(i, ob6.M0(i2, null), new rg3(this, (byte) 15), false);
        I.j();
        byte b5 = 16;
        I.b(R.drawable.msg_contacts, ob6.M0(2131751745, null), new rg3(this, b5), false);
        I.b(R.drawable.msg_calls, ob6.M0(2131752577, null), new rg3(this, (byte) 17), false);
        I.j();
        I.b(R.drawable.outline_groups_24, ob6.M0(2131748027, null), new rg3(this, (byte) 18), false);
        I.b(R.drawable.outline_saved_24, ob6.M0(2131745629, null), new rg3(this, (byte) 19), false);
        org.telegram.messenger.a aVar = org.telegram.messenger.a.a;
        if (getMessagesController().k4.v0.f) {
            I.b(R.drawable.ic_gram, ob6.M0(2131742845, null), new rg3(this, (byte) 9), false);
        } else {
            TLRPC.TL_attachMenuBots tL_attachMenuBots = ls6.d0(yac.t0).b;
            if (launchActivity2 != null && tL_attachMenuBots != null && (arrayList = tL_attachMenuBots.bots) != null && !arrayList.isEmpty()) {
                ArrayList<TLRPC.TL_attachMenuBot> arrayList3 = tL_attachMenuBots.bots;
                int size = arrayList3.size();
                int i5 = 0;
                while (i5 < size) {
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList3.get(i5);
                    i5++;
                    TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                    if (tL_attachMenuBot2.show_in_side_menu) {
                        vg3 vg3Var2 = new vg3(this, tL_attachMenuBot2, launchActivity2, b4);
                        wd3 wd3Var2 = new wd3(this, tL_attachMenuBot2, b3);
                        vnb vnbVar3 = I.d;
                        b = b5;
                        if (I.e == null) {
                            arrayList2 = arrayList3;
                            launchActivity = launchActivity2;
                        } else {
                            int i6 = aob.F8;
                            f = f2;
                            int i7 = aob.E8;
                            b8 b8Var2 = new b8(0, I.d, I.e, false, false);
                            b8Var2.setPadding(hl.L(18.0f), b4, hl.L(18.0f), b4);
                            boolean z = tL_attachMenuBot2.side_menu_disclaimer_needed;
                            String str = tL_attachMenuBot2.short_name;
                            CharSequence charSequence = str;
                            if (z) {
                                charSequence = skb.b(str);
                            }
                            Pattern pattern = ls6.U1;
                            ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList4 = tL_attachMenuBot2.icons;
                            int size2 = arrayList4.size();
                            arrayList2 = arrayList3;
                            int i8 = 0;
                            while (true) {
                                if (i8 >= size2) {
                                    launchActivity = launchActivity2;
                                    tL_attachMenuBotIcon = null;
                                    break;
                                }
                                TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = arrayList4.get(i8);
                                int i9 = i8 + 1;
                                TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon3 = tL_attachMenuBotIcon2;
                                launchActivity = launchActivity2;
                                if (tL_attachMenuBotIcon3.name.equals("android_side_menu_static")) {
                                    tL_attachMenuBotIcon = tL_attachMenuBotIcon3;
                                    break;
                                } else {
                                    i8 = i9;
                                    launchActivity2 = launchActivity;
                                }
                            }
                            if (tL_attachMenuBotIcon != null) {
                                ggb f3 = lp3.f(tL_attachMenuBotIcon.icon, aob.c7, 1.0f, null);
                                if (f3 != null) {
                                    Integer num2 = I.q0;
                                    new PorterDuffColorFilter(num2 != null ? num2.intValue() : aob.v0(i6, vnbVar3), PorterDuff.Mode.SRC_IN);
                                }
                                jn5 b6 = jn5.b(tL_attachMenuBotIcon.icon);
                                vg3Var = vg3Var2;
                                b8Var = b8Var2;
                                vnbVar = vnbVar3;
                                wd3Var = wd3Var2;
                                b8Var.k(charSequence, b6, "24_24", f3, tL_attachMenuBot2);
                                de0 de0Var = b8Var.h;
                                if (de0Var != null) {
                                    de0Var.setLayoutParams(tre.e(24, 24, (ob6.a0 ? 5 : 3) | 16));
                                }
                            } else {
                                vg3Var = vg3Var2;
                                wd3Var = wd3Var2;
                                b8Var = b8Var2;
                                vnbVar = vnbVar3;
                                b8Var.j(charSequence, R.drawable.msg_bot, null);
                            }
                            Integer num3 = I.p0;
                            if (num3 != null) {
                                intValue = num3.intValue();
                            } else if (I.q0 == null) {
                                b8Var.c(i7, i6);
                                Integer num4 = I.q0;
                                b8Var.setIconColorImage(num4 == null ? num4.intValue() : aob.v0(i6, vnbVar));
                                num = I.r0;
                                if (num == null) {
                                    b8Var.setSelectorColor(num.intValue());
                                } else {
                                    b8Var.h(0.12f, i7);
                                }
                                b8Var.setOnClickListener(new je3(I, vg3Var, (byte) 28));
                                b8Var.setOnLongClickListener(new v0(I, wd3Var, (byte) 2));
                                i3 = I.Y;
                                if (i3 <= 0) {
                                    b8Var.setMinimumWidth(hl.L(i3));
                                    I.q(b8Var, tre.o(I.Y, -2));
                                } else {
                                    I.q(b8Var, tre.o(-1, -2));
                                }
                                b5 = b;
                                f2 = f;
                                arrayList3 = arrayList2;
                                launchActivity2 = launchActivity;
                                b3 = 1;
                                b4 = 0;
                            } else {
                                intValue = aob.v0(i7, vnbVar);
                            }
                            Integer num5 = I.q0;
                            b8Var.d(intValue, num5 != null ? num5.intValue() : aob.v0(i6, vnbVar));
                            Integer num42 = I.q0;
                            b8Var.setIconColorImage(num42 == null ? num42.intValue() : aob.v0(i6, vnbVar));
                            num = I.r0;
                            if (num == null) {
                            }
                            b8Var.setOnClickListener(new je3(I, vg3Var, (byte) 28));
                            b8Var.setOnLongClickListener(new v0(I, wd3Var, (byte) 2));
                            i3 = I.Y;
                            if (i3 <= 0) {
                            }
                            b5 = b;
                            f2 = f;
                            arrayList3 = arrayList2;
                            launchActivity2 = launchActivity;
                            b3 = 1;
                            b4 = 0;
                        }
                    } else {
                        arrayList2 = arrayList3;
                        launchActivity = launchActivity2;
                        b = b5;
                    }
                    f = f2;
                    b5 = b;
                    f2 = f;
                    arrayList3 = arrayList2;
                    launchActivity2 = launchActivity;
                    b3 = 1;
                    b4 = 0;
                }
            }
        }
        float f4 = f2;
        if (getMessagesController().w()) {
            I.b(R.drawable.msg_settings_old, ob6.M0(2131745223, null), new rg3(this, (byte) 10), false);
        }
        b8 b8Var3 = this.p0;
        if (b8Var3 != null) {
            yob.X(b8Var3.b, aob.Ri, getResourceProvider());
            this.p0.setOnClickListener(new je3(this, I, (byte) 2));
            SharedPreferences sharedPreferences = org.telegram.messenger.a.b.getSharedPreferences("mainconfig", 0);
            String string = sharedPreferences.getString("proxy_ip", "");
            if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().l3 && !xea.v1.isEmpty())) {
                I.j();
                I.c(this.p0);
            }
        }
        I.a0();
        I.Y(-hl.L(f4));
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void finishFragment() {
        super.finishFragment();
        fu5 fu5Var = this.M0;
        if (fu5Var != null) {
            fu5Var.u();
        }
    }

    public final void g3() {
        a aVar = this.actionBar;
        if (aVar == null || !aVar.o0) {
            return;
        }
        aVar.o(true);
        this.s3 = false;
        s5(true, true);
    }

    public final /* synthetic */ void g4() {
        presentFragment(new PrivacySettingsActivity());
        hl.f3(this.parentLayout, "newChatsRow");
    }

    public final void g5() {
        if (this.Y3 == null) {
            for (String str : getMessagesController().u3) {
                if ("AUTOARCHIVE_POPULAR".equals(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = ob6.M0(2131749073, null);
                    id idVar = alertDialog$Builder.a;
                    idVar.S = M0;
                    idVar.U = hl.S2(ob6.M0(2131749074, null));
                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                    alertDialog$Builder.j(ob6.M0(2131749304, null), new xg3(this, (byte) 5));
                    showDialog(idVar, new tg3(this, (byte) 1));
                    this.Y3 = str;
                    return;
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final rk5 getBackButtonState() {
        return (F3() || this.H3.f) ? rk5.a : rk5.b;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final Animator getCustomSlideTransition(boolean z, boolean z2, float f) {
        if (z2) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d4, 1.0f);
            this.g4 = ofFloat;
            return ofFloat;
        }
        int i = (getLayoutContainer() == null || getLayoutContainer().getMeasuredWidth() <= 0) ? jn7.f2 : (int) Utilities.i((200.0f / getLayoutContainer().getMeasuredWidth()) * f, 200.0f, 80.0f);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.d4, 1.0f);
        this.g4 = ofFloat2;
        ofFloat2.addUpdateListener(new ug3(this, (byte) 1));
        this.g4.setInterpolator(k43.g);
        this.g4.setDuration(i);
        this.g4.start();
        return this.g4;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0246 A[SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList getThemeDescriptions() {
        byte b;
        byte b2;
        int i;
        View view;
        View view2;
        ArrayList arrayList = new ArrayList();
        s7 s7Var = this.n0;
        if (s7Var != null) {
            arrayList.add(new apb(s7Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.t8));
        }
        int i2 = this.Y2;
        bj3 bj3Var = this.D0;
        if (i2 == 0) {
            if (bj3Var != null) {
                arrayList.add(new apb(bj3Var.b0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
            }
            arrayList.add(new apb(this.actionBar, 128, (Class[]) null, (Paint) null, new Drawable[]{aob.s1}, (zob) null, !this.X ? aob.A8 : aob.Xl));
            arrayList.add(new apb(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.C8));
            arrayList.add(new apb(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.D8));
        } else {
            if (bj3Var != null) {
                arrayList.add(new apb(bj3Var.b0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
            }
            arrayList.add(new apb(this.actionBar, 128, (Class[]) null, (Paint) null, new Drawable[]{aob.s1}, (zob) null, !this.X ? aob.P8 : aob.Xl));
            arrayList.add(new apb(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Q8));
            arrayList.add(new apb(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.R8));
        }
        arrayList.add(new apb(this.actionBar, TLObject.FLAG_21, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.x8));
        NumberTextView numberTextView = this.j1;
        int i3 = aob.y8;
        arrayList.add(new apb(numberTextView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i3));
        if (this.A0 != null) {
            a aVar = this.actionBar;
            if (aVar == null || !aVar.z()) {
                arrayList.add(new apb(this.A0, 0, new Class[]{fg4.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (zob) null, aob.K8));
                arrayList.add(new apb(this.A0.getTabsContainer(), 262148, new Class[]{dg4.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.I8));
                arrayList.add(new apb(this.A0.getTabsContainer(), 262148, new Class[]{dg4.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.J8));
                arrayList.add(new apb(this.A0.getTabsContainer(), TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.L8));
            } else {
                arrayList.add(new apb(this.A0, 0, new Class[]{fg4.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (zob) null, aob.xi));
                arrayList.add(new apb(this.A0.getTabsContainer(), 262148, new Class[]{dg4.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.wi));
                arrayList.add(new apb(this.A0.getTabsContainer(), 262148, new Class[]{dg4.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.vi));
            }
        }
        arrayList.addAll(zye.a(new u00(this, (byte) 6), aob.w8, i3));
        int i4 = 0;
        while (true) {
            b = 2;
            b2 = 3;
            if (i4 >= 3) {
                break;
            }
            if (i4 == 2) {
                bj3 bj3Var2 = this.D0;
                if (bj3Var2 != null) {
                    view = bj3Var2.b0;
                    view2 = view;
                    if (view2 == null) {
                        arrayList.add(new apb(view2, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.i6));
                        arrayList.add(new apb(view2, 0, new Class[]{ua6.class}, new String[]{"progressBar"}, (Drawable[]) null, (zob) null, aob.h6));
                        int i5 = p55.h;
                        arrayList.add(new apb(view2, 4, new Class[]{skb.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, aob.o6));
                    }
                    i4++;
                } else {
                    i4++;
                }
            } else {
                tj3[] tj3VarArr = this.f0;
                if (tj3VarArr == null) {
                    i4++;
                } else {
                    view = i4 < tj3VarArr.length ? tj3VarArr[i4].a : null;
                    view2 = view;
                    if (view2 == null) {
                    }
                    i4++;
                }
            }
        }
        if (this.f0 != null) {
            int i6 = 0;
            while (true) {
                tj3[] tj3VarArr2 = this.f0;
                if (i6 >= tj3VarArr2.length) {
                    break;
                }
                if (this.Y2 == 0) {
                    qj3 qj3Var = tj3VarArr2[i6].a;
                    int i7 = aob.d6;
                    arrayList.add(new apb(qj3Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i7));
                    i = i7;
                } else {
                    qj3 qj3Var2 = tj3VarArr2[i6].a;
                    int i8 = aob.d6;
                    arrayList.add(new apb(qj3Var2, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i8));
                    i = i8;
                }
                boolean z = xea.a;
                int i9 = aob.q6;
                arrayList.add(new apb(this.f0[i6].a, 0, new Class[]{skb.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, i9));
                arrayList.add(new apb(this.f0[i6].a, 0, new Class[]{skb.class}, new String[]{"imageView"}, (Drawable[]) null, (zob) null, i9));
                arrayList.add(new apb(this.f0[i6].x, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.h6));
                this.f0[i6].d.getClass();
                arrayList.add(new apb((View) null, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
                i6++;
            }
        }
        int i10 = 0;
        while (true) {
            UndoView[] undoViewArr = this.z0;
            if (i10 >= undoViewArr.length) {
                break;
            }
            arrayList.add(new apb(undoViewArr[i10], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.wj));
            i10++;
        }
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.h5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.i5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.j5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.k5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.l5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.m5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.n5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.o5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.q7));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.p5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.q5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.r5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.s5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.J5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.p7));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.t5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.u5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.v5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.w5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.x5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.y5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.z5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.D5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.E5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.H5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.I5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.A5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.B5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.C5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.F5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.G5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.K5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.M5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.N5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.O5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.P5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Q5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.R5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.S5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.U5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.V5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.zj));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Aj));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Ej));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Fj));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Gj));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Hj));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Ij));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Jj));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Kj));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Lj));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Mj));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Nj));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Oj));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Kh));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Lh));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Mh));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Nh));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Oh));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Ph));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Qh));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Rh));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Sh));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Th));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Uh));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Vh));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Wh));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Zh));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.ai));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.bi));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Xh));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Yh));
        rh4 rh4Var = this.c0;
        if (rh4Var != null) {
            arrayList.addAll(rh4Var.getThemeDescriptions());
            this.c0.updateColors();
        }
        oq3 oq3Var = this.i0;
        if (oq3Var != null) {
            oq3Var.updateColors();
            this.i0.invalidate();
        }
        bj3 bj3Var3 = this.D0;
        if (bj3Var3 != null) {
            ax9 ax9Var = bj3Var3.c0;
            SparseArray sparseArray = bj3Var3.h;
            gw9 gw9Var = bj3Var3.b0;
            for (int i11 = 0; i11 < gw9Var.getChildCount(); i11++) {
                View childAt = gw9Var.getChildAt(i11);
                if ((childAt instanceof bv8) || (childAt instanceof of3) || (childAt instanceof xe5)) {
                    arrayList.add(new apb(childAt, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
                }
            }
            for (int i12 = 0; i12 < bj3Var3.getChildCount(); i12++) {
                if (bj3Var3.getChildAt(i12) instanceof yg4) {
                    arrayList.addAll(((yg4) bj3Var3.getChildAt(i12)).getThemeDescriptions());
                }
            }
            int size = sparseArray.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view3 = (View) sparseArray.valueAt(i13);
                if (view3 instanceof yg4) {
                    arrayList.addAll(((yg4) view3).getThemeDescriptions());
                }
            }
            yg4 yg4Var = bj3Var3.P0;
            if (yg4Var != null) {
                arrayList.addAll(yg4Var.getThemeDescriptions());
            }
            arrayList.add(new apb(ax9Var.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.G6));
            arrayList.add(new apb(ax9Var.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.y6));
            arrayList.addAll(zye.a(new u00(bj3Var3, (byte) 17), aob.y8));
        }
        uk3 uk3Var = this.O1;
        byte b3 = 18;
        if (uk3Var != null) {
            arrayList.addAll(zye.a(new u00(new zg3(uk3Var, b), b3), aob.d6, aob.G6, aob.y6));
        }
        w8c w8cVar = this.P1;
        if (w8cVar != null) {
            arrayList.addAll(zye.a(new u00(new zg3(w8cVar, b2), b3), aob.d6, aob.G6, aob.y6, aob.I6, aob.q7));
        }
        m9 m9Var = this.N1;
        if (m9Var != null) {
            arrayList.addAll(zye.a(new u00(new zg3(m9Var, (byte) 4), b3), aob.d6, aob.G6, aob.y6, aob.I6, aob.q7));
        }
        return arrayList;
    }

    public final void h3(String str) {
        if (this.actionBar.e(str)) {
            return;
        }
        s6 q = this.actionBar.q(str);
        boolean z = this.X;
        byte b = 5;
        byte b2 = 1;
        ArrayList arrayList = this.k1;
        if (z) {
            ImageView imageView = new ImageView(getParentActivity());
            this.i1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.i1.setImageDrawable(new gd0(true));
            yob.s(this.i1, aob.y8, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.i1;
            int i = aob.z8;
            yob.R(imageView2, aob.f0(getThemedColor(i), 1, -1), null, yob.M(i), getResourceProvider());
            this.i1.setOnClickListener(new wg3(this, b));
            q.addView(this.i1, tre.r(54, 54, 16));
            arrayList.add(this.i1);
        }
        NumberTextView numberTextView = new NumberTextView(q.getContext());
        this.j1 = numberTextView;
        numberTextView.setTextSize(18);
        this.j1.setTypeface(hl.o());
        this.j1.setTextColor(getThemedColor(aob.y8));
        q.addView(this.j1, tre.m(1.0f, 0, -1, this.X ? 18 : 72, 0, 0));
        this.j1.setOnTouchListener(new b02((byte) 5));
        this.m1 = q.g(100, R.drawable.msg_pin, hl.L(48.0f));
        this.n1 = q.g(jn7.o1, R.drawable.msg_mute, hl.L(48.0f));
        this.o1 = q.g(jn7.r1, R.drawable.msg_archive, hl.L(48.0f));
        this.l1 = q.h(jn7.m1, R.drawable.msg_delete, hl.L(48.0f), ob6.M0(2131751563, null));
        s7 h = q.h(0, R.drawable.ic_ab_other, hl.L(48.0f), ob6.M0(2131754834, null));
        q.addView(new View(getParentActivity()), tre.o(5, -1));
        this.s1 = h.e(jn7.p1, R.drawable.msg_archive, ob6.M0(2131754165, null));
        this.p1 = h.e(jn7.s1, R.drawable.msg_pin, ob6.M0(2131751418, null));
        this.q1 = h.e(jn7.t1, R.drawable.msg_addfolder, ob6.M0(2131750777, null));
        this.r1 = h.e(jn7.u1, R.drawable.msg_removefolder, ob6.M0(2131750675, null));
        this.u1 = h.e(101, R.drawable.msg_markread, ob6.M0(2131748435, null));
        this.t1 = h.e(jn7.n1, R.drawable.msg_clear, ob6.M0(2131752054, null));
        this.v1 = h.e(jn7.q1, R.drawable.msg_block, ob6.M0(2131753685, null));
        this.n1.setOnLongClickListener(new bh3(this, b2));
        arrayList.add(this.m1);
        arrayList.add(this.o1);
        arrayList.add(this.n1);
        arrayList.add(this.l1);
        arrayList.add(h);
        p5(false);
    }

    public final void h4() {
        i5.c(this.currentAccount, getResourceProvider(), getParentActivity());
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b5 A[EDGE_INSN: B:63:0x01b5->B:64:0x01b5 BREAK  A[LOOP:3: B:55:0x01a4->B:61:0x01b2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h5(long j, View view) {
        ArrayList o3;
        int i;
        TLRPC.EncryptedChat a1;
        ValueAnimator valueAnimator;
        int i2;
        tj3[] tj3VarArr;
        float max;
        ij3 ij3Var;
        gd0 gd0Var;
        A2(j, view);
        boolean z = this.actionBar.z();
        ArrayList arrayList = this.K2;
        boolean z2 = true;
        char c = 1;
        if (!z) {
            if (this.s3) {
                h3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof h27)) {
                    this.actionBar.setBackButtonDrawable(new gd0(false));
                }
            } else {
                h3(null);
            }
            hl.t1(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(aob.d6));
            this.actionBar.R(null, null);
            int i3 = this.f0[0].s;
            if (!(i3 == 7 || i3 == 8) || (this.actionBar.z() && !this.actionBar.A(null))) {
                o3 = getMessagesController().W0(this.Y2);
            } else if (K3(this.f0[0])) {
                ac7 s3 = s3(this.f0[0]);
                ArrayList arrayList2 = getMessagesController().y;
                int size = arrayList2.size();
                i = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i4);
                    if (!(dialog instanceof TLRPC.TL_dialogFolder) && s3.j.get(dialog.id, TLObject.FLAG_31) != Integer.MIN_VALUE) {
                        long j2 = dialog.id;
                        if (wf3.B(j2) && (a1 = getMessagesController().a1(Integer.valueOf((int) (4294967295L & j2)))) != null) {
                            j2 = a1.user_id;
                        }
                        if (s3.b(getAccountInstance(), j2, dialog, false)) {
                            i++;
                        }
                    }
                }
                if (i > 1) {
                    if (this.f0 != null) {
                        int i5 = 0;
                        while (true) {
                            tj3[] tj3VarArr2 = this.f0;
                            if (i5 >= tj3VarArr2.length) {
                                break;
                            }
                            tj3VarArr2[i5].d.I = true;
                            i5++;
                        }
                    }
                    int i6 = uc7.r5;
                    G5(131072, true);
                }
                if (!this.s3) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList3 = new ArrayList();
                    int i7 = 0;
                    while (true) {
                        ArrayList arrayList4 = this.k1;
                        if (i7 >= arrayList4.size()) {
                            break;
                        }
                        View view2 = (View) arrayList4.get(i7);
                        view2.setPivotY(a.getCurrentActionBarHeight() / 2);
                        hl.y(view2);
                        arrayList3.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                        i7++;
                    }
                    animatorSet.playTogether(arrayList3);
                    animatorSet.setDuration(200L);
                    animatorSet.start();
                }
                valueAnimator = this.x3;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.x3 = ValueAnimator.ofFloat(this.w3, 1.0f);
                i2 = 0;
                while (true) {
                    tj3VarArr = this.f0;
                    if (i2 < tj3VarArr.length) {
                        break;
                    }
                    tj3 tj3Var = tj3VarArr[i2];
                    if (tj3Var != null) {
                        tj3Var.a.K0(true);
                    }
                    i2++;
                }
                max = Math.max(0.0f, hl.L((!this.L ? 81 : 0) + 48) + this.O);
                if (max != 0.0f) {
                    this.Q = (int) max;
                    this.fragmentView.requestLayout();
                }
                this.x3.addUpdateListener(new gh3(this, max, (byte) 0));
                this.x3.addListener(new ui3(this, max, c == true ? 1 : 0));
                this.x3.setInterpolator(k43.f);
                this.x3.setDuration(200L);
                this.x3.start();
                ij3Var = this.A0;
                if (ij3Var != null) {
                    ij3Var.c(aob.xi, aob.wi, aob.vi, aob.yi, aob.w8);
                }
                gd0Var = this.g1;
                if (gd0Var != null) {
                    gd0Var.c(true, 1.0f);
                }
                z2 = false;
            } else {
                o3 = o3(this.currentAccount, this.f0[0].s, this.Y2, this.U1);
            }
            int size2 = o3.size();
            i = 0;
            for (int i8 = 0; i8 < size2; i8++) {
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) o3.get(i8);
                if (!(dialog2 instanceof TLRPC.TL_dialogFolder)) {
                    if (!H3(dialog2)) {
                        if (!getMessagesController().G2(dialog2.id, false)) {
                            break;
                        }
                    } else {
                        i++;
                    }
                }
            }
            if (i > 1) {
            }
            if (!this.s3) {
            }
            valueAnimator = this.x3;
            if (valueAnimator != null) {
            }
            this.x3 = ValueAnimator.ofFloat(this.w3, 1.0f);
            i2 = 0;
            while (true) {
                tj3VarArr = this.f0;
                if (i2 < tj3VarArr.length) {
                }
                i2++;
            }
            max = Math.max(0.0f, hl.L((!this.L ? 81 : 0) + 48) + this.O);
            if (max != 0.0f) {
            }
            this.x3.addUpdateListener(new gh3(this, max, (byte) 0));
            this.x3.addListener(new ui3(this, max, c == true ? 1 : 0));
            this.x3.setInterpolator(k43.f);
            this.x3.setDuration(200L);
            this.x3.start();
            ij3Var = this.A0;
            if (ij3Var != null) {
            }
            gd0Var = this.g1;
            if (gd0Var != null) {
            }
            z2 = false;
        } else if (arrayList.isEmpty()) {
            A3(true);
            return;
        }
        p5(false);
        this.j1.a(arrayList.size(), z2);
    }

    public final void i3() {
        bj3 bj3Var = this.D0;
        if ((bj3Var != null && bj3Var.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        byte b = 1;
        byte b2 = 2;
        byte b3 = 0;
        bj3 bj3Var2 = new bj3(this, getParentActivity(), this, this.p2 != null ? 2 : !this.n2 ? 1 : 0, this.T0, this.Y2, this.a3, new aj3(this, b3));
        this.D0 = bj3Var2;
        this.glassEngine.c(bj3Var2);
        ((nj3) this.fragmentView).addView(this.D0, this.C0);
        bj3 bj3Var3 = this.D0;
        bj3Var3.e0.V = new dj3(this);
        bj3Var3.l0.setOnItemClickListener(new xg3(this, b3));
        this.D0.q0.setOnItemClickListener(new xg3(this, b));
        this.D0.x0.setOnItemClickListener(new yg3(this, b3));
        this.D0.q0.setOnItemLongClickListener(new xg3(this, b2));
        this.D0.b0.setOnItemClickListener(new xg3(this, (byte) 3));
        this.D0.b0.setOnItemLongClickListener(new vh3(this));
        this.D0.setFilteredSearchViewDelegate(new xg3(this, (byte) 4));
        this.D0.setAlpha(0.0f);
        this.D0.setScaleX(1.05f);
        this.D0.setScaleY(1.05f);
        this.D0.setVisibility(8);
        this.D0.setBlurredBackgroundDrawableFactory(this.v4);
    }

    public final void i4() {
        PasskeysActivity.e0(this.currentAccount, this.resourceProvider, getParentActivity(), true);
    }

    public final void i5(long j, View view) {
        int i = -this.N3;
        this.N3 = i;
        hl.A3(i, view, null);
        yw0.E.a();
        String r = j >= 0 ? lbc.r(uc7.s1(this.currentAccount).X1(Long.valueOf(j))) : "";
        (getMessagesController().M3() ? d31.b0(this).Q(R.raw.star_premium_2, 36, hl.S2(ob6.a0(null, null, 2131743415, r))) : d31.b0(this).K(R.raw.star_premium_2, hl.S2(ob6.a0(null, null, 2131743415, r)), ob6.M0(2131743414, null), new ch3(this, (byte) 3))).j();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isLightStatusBar() {
        li3 li3Var;
        return (this.l2 || (li3Var = this.H3) == null || li3Var.getFragment() == null) ? vm2.h(getThemedColor(aob.d6)) > 0.699999988079071d : this.H3.getFragment().isLightStatusBar();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // ej6
    public final rz4 j() {
        return this.r4;
    }

    public final void j3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.z0;
        if (undoViewArr[0] != null || (parentActivity = getParentActivity()) == null) {
            return;
        }
        for (int i = 0; i < 2; i++) {
            undoViewArr[i] = new vi3(this, parentActivity);
            FrameLayout.LayoutParams d = tre.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
            d.bottomMargin = this.m4 + this.o4 + d.bottomMargin;
            nj3 nj3Var = (nj3) this.fragmentView;
            UndoView undoView = undoViewArr[i];
            int i2 = this.y0 + 1;
            this.y0 = i2;
            nj3Var.addView(undoView, i2, d);
        }
    }

    public final /* synthetic */ void j4() {
        uc7.s1(this.currentAccount).v4(0L, "SETUP_PASSKEY");
        q5();
    }

    public final void j5(boolean z) {
        if (this.f0 == null || this.O3 == z) {
            return;
        }
        this.O3 = z;
        int i = 0;
        while (true) {
            tj3[] tj3VarArr = this.f0;
            if (i >= tj3VarArr.length) {
                return;
            }
            if (z) {
                tj3VarArr[i].a.setScrollbarFadingEnabled(false);
            }
            this.f0[i].a.setVerticalScrollBarEnabled(z);
            if (z) {
                this.f0[i].a.setScrollbarFadingEnabled(true);
            }
            i++;
        }
    }

    public final void k3(final long j, final long j2, boolean z, final tzb tzbVar) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String M0;
        String b0;
        String M02;
        TLRPC.TL_forumTopic f;
        if (K2(j)) {
            int i = this.T0;
            if (i == 11 || i == 12 || i == 13) {
                if (wf3.D(j)) {
                    TLRPC.User X1 = getMessagesController().X1(Long.valueOf(j));
                    if (!X1.mutual_contact) {
                        UndoView w3 = w3();
                        if (w3 != null) {
                            w3.j(45, j, null);
                            return;
                        }
                        return;
                    }
                    user = X1;
                    chat = null;
                } else {
                    TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(-j));
                    if (!xc2.N(M03) || !xc2.w(1, M03)) {
                        UndoView w32 = w3();
                        if (w32 != null) {
                            w32.j(46, j, null);
                            return;
                        }
                        return;
                    }
                    chat = M03;
                    user = null;
                }
                id idVar = new id(3, null, getParentActivity());
                TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
                tL_messages_checkHistoryImportPeer.peer = getMessagesController().j1(j);
                getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new qh3(this, idVar, user, chat, j, tL_messages_checkHistoryImportPeer));
                try {
                    idVar.q(300L);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            if (!z || ((this.h2 == null || this.i2 == null) && this.j2 == null)) {
                if (i != 15) {
                    if (this.E2 == null) {
                        finishFragment();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(if7.a(j, j2));
                    if (this.E2.q(this, arrayList, null, false, this.L2, this.M2, this.N2, tzbVar) && this.k2) {
                        this.E2 = null;
                        return;
                    }
                    return;
                }
                Runnable ue2Var = new ue2((Object) this, j, (Object) new o30((Object) this, j, j2, (Object) tzbVar, (byte) 2), (byte) 21);
                if (j < 0) {
                    m5(getMessagesController().M0(Long.valueOf(-j)), ue2Var, null);
                    return;
                }
                TLRPC.User X12 = getMessagesController().X1(Long.valueOf(j));
                TLRPC.User X13 = getMessagesController().X1(Long.valueOf(this.I));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String a0 = ob6.a0(null, null, 2131754067, lbc.k(X12, true), lbc.k(X13, true));
                id idVar2 = alertDialog$Builder.a;
                idVar2.S = a0;
                idVar2.U = TextUtils.concat(hl.S2(ob6.a0(null, null, 2131754068, lbc.k(X12, true), lbc.k(X13, true))));
                alertDialog$Builder.j(ob6.a0("Send", null, 2131745368, new Object[0]), new ht2(ue2Var, (byte) 23));
                alertDialog$Builder.g(ob6.a0("Cancel", null, 2131752570, new Object[0]), new vr9((byte) 16));
                showDialog(idVar2);
                return;
            }
            if (getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                if (wf3.B(j)) {
                    TLRPC.User X14 = getMessagesController().X1(Long.valueOf(getMessagesController().a1(Integer.valueOf((int) (4294967295L & j))).user_id));
                    if (X14 == null) {
                        return;
                    }
                    M0 = ob6.M0(2131745324, null);
                    b0 = ob6.b0(this.h2, lbc.r(X14));
                    M02 = ob6.M0(2131745368, null);
                } else if (!wf3.D(j)) {
                    TLRPC.Chat M04 = getMessagesController().M0(Long.valueOf(-j));
                    if (M04 == null) {
                        return;
                    }
                    String str = M04.title;
                    if (j2 != 0 && (f = getMessagesController().g4.f(M04.id, j2)) != null) {
                        str = ((Object) str) + " " + f.title;
                    }
                    if (this.j2 != null) {
                        M0 = ob6.M0(2131754359, null);
                        b0 = ob6.b0(this.j2, str);
                        M02 = ob6.M0(2131754479, null);
                    } else {
                        M0 = ob6.M0(2131745324, null);
                        b0 = ob6.b0(this.i2, str);
                        M02 = ob6.M0(2131745368, null);
                    }
                } else if (j == getUserConfig().e()) {
                    M0 = ob6.M0(2131745324, null);
                    b0 = ob6.b0(this.i2, ob6.M0(2131745629, null));
                    M02 = ob6.M0(2131745368, null);
                } else {
                    TLRPC.User X15 = getMessagesController().X1(Long.valueOf(j));
                    if (X15 == null || this.h2 == null) {
                        return;
                    }
                    M0 = ob6.M0(2131745324, null);
                    b0 = ob6.b0(this.h2, lbc.r(X15));
                    M02 = ob6.M0(2131745368, null);
                }
                id idVar3 = alertDialog$Builder2.a;
                idVar3.S = M0;
                idVar3.U = hl.S2(b0);
                alertDialog$Builder2.j(M02, new fd() { // from class: rh3
                    @Override // fd
                    public final void w(id idVar4, int i2) {
                        uj3.this.k3(j, j2, false, tzbVar);
                    }
                });
                alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                if (showDialog(idVar3) == null) {
                    idVar3.show();
                }
            }
        }
    }

    public final /* synthetic */ void k4() {
        uc7.s1(this.currentAccount).v4(0L, "PREMIUM_GRACE");
        q5();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k5(boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        bj3 bj3Var;
        boolean z6;
        uic uicVar;
        TLRPC.Chat chat;
        li3 li3Var;
        bj3 bj3Var2;
        bj3 bj3Var3;
        float f;
        ii3 ii3Var;
        bj3 bj3Var4;
        boolean z7 = z3;
        this.b.a(z, z7);
        byte b = 0;
        if (z) {
            i3();
        } else {
            A5(false);
        }
        int i = this.T0;
        if (i != 0 && i != 3) {
            z7 = false;
        }
        AnimatorSet animatorSet = this.y1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.y1 = null;
        }
        this.s3 = z;
        this.glassEngine.g();
        if (z) {
            if (!this.v3 && !z4) {
                ArrayList arrayList = (ArrayList) getMessagesController().w.get(0);
                int size = arrayList != null ? arrayList.size() : 0;
                if (this.n2 || (size <= 10 && !this.L)) {
                    z5 = true;
                    bj3Var = this.D0;
                    if (bj3Var != null) {
                        bj3Var.R0 = z5;
                    }
                    z6 = z5 || this.L;
                    this.u3 = z6;
                    if (z6) {
                        this.v3 = true;
                    }
                    uicVar = this.b0;
                    if (uicVar != null && bj3Var != null && !z5 && this.a3 == 0) {
                        uic l = bj3Var.l(-2, false);
                        this.b0 = l;
                        this.a0.addView(l, 0, tre.e(-1, -1, jn7.D1));
                    } else if (this.a0 != null && z5 && this.a3 == 0) {
                        hl.B2(uicVar);
                        this.b0 = null;
                    }
                    if (this.D0 != null) {
                        c3(false);
                        this.D0.setKeyboardHeight(((nj3) this.fragmentView).getKeyboardHeight());
                        bj3 bj3Var5 = this.D0;
                        bj3Var5.D0.clear();
                        bj3Var5.M();
                    }
                    chat = this.b3;
                    if (chat == null) {
                        ph4 ph4Var = new ph4(R.drawable.search_users_filled, 4, wf3.t(chat));
                        ph4Var.f = this.b3;
                        B2(ph4Var);
                    } else if (this.Y2 != 0 && ((li3Var = this.H3) == null || !li3Var.c())) {
                        B2(new ph4(R.drawable.chats_archive, 2131754143, null, 7));
                    }
                }
            }
            z5 = false;
            bj3Var = this.D0;
            if (bj3Var != null) {
            }
            if (z5) {
            }
            this.u3 = z6;
            if (z6) {
            }
            uicVar = this.b0;
            if (uicVar != null) {
            }
            if (this.a0 != null) {
                hl.B2(uicVar);
                this.b0 = null;
            }
            if (this.D0 != null) {
            }
            chat = this.b3;
            if (chat == null) {
            }
        } else {
            s5(false, z7);
        }
        if (z7 && (bj3Var4 = this.D0) != null && bj3Var4.e0.M()) {
            hl.g3(getParentActivity(), this.classGuid);
        } else {
            hl.V2(getParentActivity(), this.classGuid);
        }
        if (!z && (ii3Var = this.F0) != null && this.H0) {
            ii3Var.setVisibility(0);
        }
        Object[] objArr = xea.o() == 0 || !i86.e(32768);
        if (z7) {
            if (z) {
                bj3 bj3Var6 = this.D0;
                if (bj3Var6 != null) {
                    bj3Var6.setVisibility(0);
                    bj3 bj3Var7 = this.D0;
                    bj3Var7.setPosition(0);
                    if (bj3Var7.e0.b() > 0) {
                        bj3Var7.f0.g1(0, 0);
                    }
                    x46 x46Var = bj3Var7.k0;
                    if (x46Var != null) {
                        x46Var.g1(0, 0);
                    }
                    x46 x46Var2 = bj3Var7.p0;
                    if (x46Var2 != null) {
                        x46Var2.g1(0, 0);
                    }
                    x46 x46Var3 = bj3Var7.w0;
                    if (x46Var3 != null) {
                        x46Var3.g1(0, 0);
                    }
                    bj3Var7.h.clear();
                }
                t5(true, null, null, false, false);
                uic uicVar2 = this.b0;
                if (uicVar2 != null) {
                    uicVar2.b(false, false);
                }
            } else {
                this.f0[0].a.setVisibility(0);
                this.f0[0].setVisibility(0);
            }
            U4(true, true);
            this.f0[0].a.setVerticalScrollBarEnabled(false);
            bj3 bj3Var8 = this.D0;
            if (bj3Var8 != null) {
                yob.h(aob.d6, getResourceProvider(), bj3Var8);
            }
            this.y1 = new AnimatorSet();
            ArrayList arrayList2 = new ArrayList();
            tj3 tj3Var = this.f0[0];
            Property property = View.ALPHA;
            arrayList2.add(ObjectAnimator.ofFloat(tj3Var, (Property<tj3, Float>) property, z ? 0.0f : 1.0f));
            tj3[] tj3VarArr = this.f0;
            if (objArr == true) {
                tj3VarArr[0].setScaleX(1.0f);
                this.f0[0].setScaleY(1.0f);
            } else {
                arrayList2.add(ObjectAnimator.ofFloat(tj3VarArr[0], (Property<tj3, Float>) View.SCALE_X, z ? 0.95f : 1.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.f0[0], (Property<tj3, Float>) View.SCALE_Y, z ? 0.95f : 1.0f));
            }
            li3 li3Var2 = this.H3;
            if (li3Var2 != null) {
                li3Var2.setVisibility(0);
                arrayList2.add(ObjectAnimator.ofFloat(this.H3, (Property<li3, Float>) property, z ? 0.0f : 1.0f));
            }
            bj3 bj3Var9 = this.D0;
            if (bj3Var9 != null) {
                arrayList2.add(ObjectAnimator.ofFloat(bj3Var9, (Property<bj3, Float>) property, z ? 1.0f : 0.0f));
                if (this.L) {
                    float L = hl.L(81.0f) + this.O + hl.L(48.0f);
                    bj3 bj3Var10 = this.D0;
                    if (z) {
                        f = L;
                        L = 0.0f;
                    } else {
                        f = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(bj3Var10, this.J3, f, L));
                }
                bj3 bj3Var11 = this.D0;
                if (objArr == true) {
                    bj3Var11.setScaleX(1.0f);
                    this.D0.setScaleY(1.0f);
                } else {
                    arrayList2.add(ObjectAnimator.ofFloat(bj3Var11, (Property<bj3, Float>) View.SCALE_X, z ? 1.0f : 1.05f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.D0, (Property<bj3, Float>) View.SCALE_Y, z ? 1.0f : 1.05f));
                }
            }
            if (this.h0 != null) {
                w5(false, false);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.z1, z ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new ug3(this, (byte) 2));
            arrayList2.add(ofFloat);
            this.y1.playTogether(arrayList2);
            this.y1.setDuration(z ? 200L : 180L);
            this.y1.setInterpolator(k43.g);
            if (!z) {
                this.y1.setStartDelay(20L);
            }
            this.y1.addListener(new ri3(this, z, b));
            this.r3.d();
            this.y1.start();
        } else {
            U4(false, true);
            tj3[] tj3VarArr2 = this.f0;
            if (z) {
                tj3VarArr2[0].a.e1();
            } else {
                qj3 qj3Var = tj3VarArr2[0].a;
                if (qj3Var.h1) {
                    qj3Var.h1 = false;
                    qj3Var.M0(false);
                }
            }
            this.f0[0].setAlpha(z ? 0.0f : 1.0f);
            tj3[] tj3VarArr3 = this.f0;
            if (objArr == true) {
                tj3VarArr3[0].setScaleX(1.0f);
                this.f0[0].setScaleY(1.0f);
            } else {
                tj3VarArr3[0].setScaleX(z ? 0.95f : 1.0f);
                this.f0[0].setScaleY(z ? 0.95f : 1.0f);
            }
            bj3 bj3Var12 = this.D0;
            if (bj3Var12 != null) {
                bj3Var12.setAlpha(z ? 1.0f : 0.0f);
                bj3 bj3Var13 = this.D0;
                if (objArr == true) {
                    bj3Var13.setScaleX(1.0f);
                    this.D0.setScaleY(1.0f);
                } else {
                    bj3Var13.setScaleX(z ? 1.0f : 1.1f);
                    this.D0.setScaleY(z ? 1.0f : 1.1f);
                }
                this.D0.setVisibility(z ? 0 : 8);
            }
            hj3 hj3Var = this.Y;
            if (hj3Var != null) {
                hj3Var.setTranslationY(u3() + (z ? -hl.L(36.0f) : 0));
            }
            if (this.F0 != null) {
                if (!this.H0 || isInPreviewMode() || z) {
                    this.F0.setVisibility(8);
                } else {
                    this.F0.setVisibility(0);
                }
            }
            X4(z ? 1.0f : 0.0f);
            this.fragmentView.invalidate();
        }
        int i2 = this.y;
        if (i2 >= 0 && (bj3Var3 = this.D0) != null) {
            bj3Var3.setPosition(bj3Var3.O(i2));
        }
        if (!z) {
            this.y = -1;
        } else if (z2 && (bj3Var2 = this.D0) != null) {
            bj3Var2.setPosition((bj3Var2.t0 ? 1 : 0) + 5);
            A5(true);
        }
        b3();
        q5();
    }

    public final void l3(Canvas canvas, int i) {
        wk5 wk5Var;
        if (this.parentLayout == null || this.actionBar == null) {
            return;
        }
        float max = Math.max(this.e.e, t3());
        float f = 1.0f;
        float f2 = 1.0f - this.z1;
        float f3 = max * f2 * f2;
        if (f3 != 0.0f) {
            if (-1 >= i) {
                f = 0.0f;
                i = -1;
            }
            if (f <= 0.0f || f3 <= 0.0f || i <= 0 || (wk5Var = this.parentLayout) == null) {
                return;
            }
            ((ActionBarLayout) wk5Var).n(canvas, (int) (f * 255.0f * f3), i);
        }
    }

    public final /* synthetic */ void l4(TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        uc7.s1(this.currentAccount).v4(0L, tL_pendingSuggestion.suggestion);
        q5();
    }

    public final void l5() {
        int i;
        int i2;
        if (this.N0 != null || xea.w) {
            return;
        }
        if (!this.L || this.F0.g()) {
            d1a[] d1aVarArr = new d1a[1];
            TLRPC.User f = yac.h(yac.t0).f();
            ema titleTextView = this.actionBar.getTitleTextView();
            if (titleTextView == null || titleTextView.getRightDrawable() == null) {
                i = 0;
                i2 = 0;
            } else {
                this.F3.f();
                Drawable drawable = this.F3.f[0];
                Rect rect = hl.Q;
                rect.set(titleTextView.getRightDrawable().getBounds());
                rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
                int L = (-(this.actionBar.getHeight() - rect.centerY())) - hl.L(16.0f);
                i = hl.L(4.0f) + (rect.centerX() - hl.L(16.0f));
                zm zmVar = this.G3;
                if (zmVar != null) {
                    zmVar.b(rect.centerX(), rect.centerY());
                }
                i2 = L;
            }
            mi3 mi3Var = new mi3(this, this, getParentActivity(), Integer.valueOf(i), getResourceProvider(), d1aVarArr);
            if (f != null && wf3.g(f.emoji_status) > 0) {
                mi3Var.setExpireDateHint(wf3.g(f.emoji_status));
            }
            Long l = this.D3;
            if (l != null) {
                mi3Var.setSelected(l);
            } else {
                Drawable drawable2 = this.F3.f[0];
                mi3Var.setSelected(drawable2 instanceof wl ? Long.valueOf(((wl) drawable2).h()) : null);
            }
            mi3Var.setSaveState(1);
            mi3Var.y(this.F3, titleTextView);
            ni3 ni3Var = new ni3(this, mi3Var);
            this.N0 = ni3Var;
            d1aVarArr[0] = ni3Var;
            ni3Var.showAsDropDown(this.actionBar, hl.L(16.0f), i2, 48);
            d1aVarArr[0].a();
        }
    }

    public final void m3(long j, boolean z) {
        if (this.f0 == null) {
            return;
        }
        int i = 0;
        while (true) {
            tj3[] tj3VarArr = this.f0;
            if (i >= tj3VarArr.length) {
                return;
            }
            int childCount = tj3VarArr[i].a.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 < childCount) {
                    View childAt = this.f0[i].a.getChildAt(i2);
                    if (childAt instanceof of3) {
                        of3 of3Var = (of3) childAt;
                        if (of3Var.getDialogId() == j) {
                            of3Var.d0(z, true);
                            break;
                        }
                    }
                    i2++;
                }
            }
            i++;
        }
    }

    public final /* synthetic */ void m4() {
        uc7.s1(this.currentAccount).v4(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        q5();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0069, code lost:
    
        if (r13.H.bot_admin_rights != null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v0, types: [org.telegram.ui.ActionBar.e, uj3] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5(TLRPC.Chat chat, Runnable runnable, Runnable runnable2) {
        CharSequence charSequence;
        String a0;
        TLRPC.User X1 = getMessagesController().X1(Long.valueOf(this.I));
        boolean V = xc2.V(chat);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String a02 = ob6.a0(null, null, 2131754067, chat.title, lbc.k(X1, true));
        id idVar = alertDialog$Builder.a;
        idVar.S = a02;
        SpannableStringBuilder S2 = hl.S2(ob6.a0(null, null, 2131754068, chat.title, lbc.k(X1, true)));
        Boolean bool = this.H.bot_participant;
        ?? r10 = "";
        if (bool == null || !bool.booleanValue() || getMessagesController().z2(chat, X1)) {
            charSequence = r10;
        }
        if (this.H.bot_admin_rights == null) {
            a0 = ob6.a0(null, null, 2131754070, lbc.k(X1, true), chat.title);
        } else {
            String k = lbc.k(X1, true);
            String str = chat.title;
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.H.bot_admin_rights;
            int i = xb9.c;
            ArrayList arrayList = new ArrayList();
            if (tL_chatAdminRights.change_info) {
                qu6.q(1, V ? ob6.M0(2131751289, null) : ob6.M0(2131751288, null), arrayList);
            }
            if (tL_chatAdminRights.post_messages && V) {
                qu6.q(1, ob6.M0(2131751277, null), arrayList);
            }
            if (tL_chatAdminRights.edit_messages && V) {
                qu6.q(1, ob6.M0(2131751284, null), arrayList);
            }
            if (tL_chatAdminRights.delete_messages) {
                qu6.q(1, ob6.M0(V ? 2131751286 : 2131751281, null), arrayList);
            }
            if (tL_chatAdminRights.ban_users && !V) {
                qu6.q(1, ob6.M0(2131751293, null), arrayList);
            }
            if (tL_chatAdminRights.invite_users) {
                qu6.q(1, ob6.M0(2131751295, null), arrayList);
            }
            if (tL_chatAdminRights.pin_messages && !V) {
                qu6.q(1, ob6.M0(2131751278, null), arrayList);
            }
            if (tL_chatAdminRights.add_admins) {
                qu6.q(1, ob6.M0(2131751296, null), arrayList);
            }
            if (tL_chatAdminRights.anonymous && !V) {
                qu6.q(1, ob6.M0(2131751268, null), arrayList);
            }
            if (tL_chatAdminRights.manage_call) {
                qu6.q(1, ob6.M0(2131744558, null), arrayList);
            }
            if (tL_chatAdminRights.manage_topics && !V) {
                qu6.q(1, ob6.M0(2131748446, null), arrayList);
            }
            if (arrayList.size() == 1) {
                r10 = ((yb9) arrayList.get(0)).b.toString().toLowerCase();
            } else if (!arrayList.isEmpty()) {
                r10 = new SpannableStringBuilder();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (i2 > 0) {
                        r10.append(", ");
                    }
                    r10.append(((yb9) arrayList.get(i2)).b.toString().toLowerCase());
                }
            }
            a0 = ob6.a0(null, null, 2131754069, new Object[]{k, str, r10});
        }
        charSequence = TextUtils.concat("\n\n", hl.S2(a0));
        idVar.U = TextUtils.concat(S2, charSequence);
        alertDialog$Builder.j(ob6.a0("Send", null, 2131745368, new Object[0]), new td(runnable, (byte) 7));
        alertDialog$Builder.g(ob6.a0("Cancel", null, 2131752570, new Object[0]), new td(runnable2, (byte) 8));
        showDialog(idVar);
    }

    public final void n4(nj0 nj0Var) {
        ArrayList arrayList = nj0Var.c;
        if (arrayList.size() != 1) {
            bx4.g1(false, nj0Var);
            return;
        }
        yx4 yx4Var = new yx4(getParentActivity(), this.currentAccount, ((TLRPC.User) arrayList.get(0)).id, null, null);
        yx4Var.b1(true);
        showDialog(yx4Var);
    }

    public final void n5(boolean z) {
        tj3[] tj3VarArr;
        int i = 0;
        int i2 = 0;
        while (true) {
            tj3VarArr = this.f0;
            if (i2 >= tj3VarArr.length) {
                break;
            }
            tj3VarArr[i2].a.E0();
            i2++;
        }
        char c = (!z || tj3VarArr.length <= 1) ? (char) 0 : (char) 1;
        int i3 = tj3VarArr[c].h;
        if (i3 < 0 || i3 >= getMessagesController().T0().size()) {
            return;
        }
        ac7 ac7Var = (ac7) getMessagesController().T0().get(this.f0[c].h);
        boolean d = ac7Var.d();
        tj3[] tj3VarArr2 = this.f0;
        if (d) {
            tj3 tj3Var = tj3VarArr2[c];
            tj3Var.s = this.T0;
            qj3 qj3Var = tj3Var.a;
            int i4 = qj3.C3;
            qj3Var.E1();
        } else {
            if (tj3VarArr2[c ^ 1].s == 7) {
                tj3VarArr2[c].s = 8;
            } else {
                tj3VarArr2[c].s = 7;
            }
            tj3VarArr2[c].a.setScrollEnabled(true);
            uc7 messagesController = getMessagesController();
            char c2 = this.f0[c].s == 8 ? (char) 1 : (char) 0;
            ac7[] ac7VarArr = messagesController.N;
            ac7 ac7Var2 = ac7VarArr[c2];
            if (ac7Var2 != ac7Var) {
                ac7VarArr[c2] = ac7Var;
                int i5 = c2 ^ 1;
                if (ac7VarArr[i5] == ac7Var) {
                    ac7VarArr[i5] = null;
                }
                if (ac7VarArr[c2] != null) {
                    messagesController.h5(null);
                } else if (ac7Var2 != null) {
                    ac7Var2.k.clear();
                    ac7Var2.l.clear();
                }
            }
        }
        tj3[] tj3VarArr3 = this.f0;
        if (tj3VarArr3.length > 1) {
            tj3VarArr3[1].F = ac7Var.p;
        }
        tj3 tj3Var2 = tj3VarArr3[c];
        yh3 yh3Var = tj3Var2.d;
        yh3Var.h = tj3Var2.s;
        yh3Var.f();
        tj3 tj3Var3 = this.f0[c];
        uh3 uh3Var = tj3Var3.c;
        if (tj3Var3.s == 0 && y3() && this.f0[c].w == 2) {
            i = 1;
        }
        uh3Var.g1(i, (int) this.O);
        M2(this.f0[c]);
    }

    /* JADX WARN: Removed duplicated region for block: B:288:0x0256 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0216 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList o3(int i, int i2, int i3, boolean z) {
        boolean z2;
        long j;
        ArrayList arrayList;
        if (z && (arrayList = this.T1) != null) {
            return arrayList;
        }
        uc7 s1 = uc7.s1(k5.a(i).a);
        zh6 zh6Var = s1.R;
        ArrayList arrayList2 = s1.K;
        ArrayList arrayList3 = s1.J;
        ArrayList arrayList4 = s1.I;
        ArrayList arrayList5 = s1.H;
        ArrayList arrayList6 = s1.M;
        ArrayList arrayList7 = s1.G;
        if (i2 == 0) {
            return (i3 == 0 && E3()) ? s1.p4 : s1.W0(i3);
        }
        if (i2 == 10 || i2 == 13) {
            return s1.F;
        }
        if (i2 == 2) {
            ArrayList arrayList8 = new ArrayList(arrayList4.size() + arrayList5.size() + arrayList7.size() + 2);
            if (arrayList5.size() > 0 && this.A2) {
                arrayList8.add(new pj3(0));
                arrayList8.addAll(arrayList5);
            }
            if (arrayList4.size() > 0 && this.x2) {
                arrayList8.add(new pj3(1));
                arrayList8.addAll(arrayList4);
            }
            if (arrayList7.size() > 0) {
                int size = arrayList7.size();
                for (int i4 = 0; i4 < size; i4++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList7.get(i4);
                    if ((this.A2 && xc2.U(i, -dialog.id)) || (this.x2 && (xc2.m0(i, -dialog.id) || !xc2.S(i, -dialog.id)))) {
                        if (r9) {
                            arrayList8.add(new pj3(2));
                            r9 = false;
                        }
                        arrayList8.add(dialog);
                    }
                }
            }
            return arrayList8;
        }
        if (i2 == 3) {
            return s1.E;
        }
        if (i2 == 4 || i2 == 12) {
            return arrayList2;
        }
        if (i2 == 5) {
            return arrayList3;
        }
        if (i2 == 6 || i2 == 11) {
            return arrayList6;
        }
        if (i2 == 7 || i2 == 8) {
            ac7 ac7Var = s1.N[i2 != 7 ? 1 : 0];
            return ac7Var == null ? s1.W0(i3) : this.T0 == 3 ? ac7Var.l : ac7Var.k;
        }
        if (i2 == 9) {
            return s1.L;
        }
        if (i2 != 1 && i2 != 16 && i2 != 14) {
            if (i2 != 15) {
                return new ArrayList();
            }
            ArrayList arrayList9 = new ArrayList();
            TLRPC.User X1 = s1.X1(Long.valueOf(this.I));
            TLRPC.RequestPeerType requestPeerType = this.H;
            if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                ConcurrentHashMap concurrentHashMap = s1.d;
                int size2 = arrayList2.size();
                while (r8 < size2) {
                    Object obj = arrayList2.get(r8);
                    r8++;
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) obj;
                    if (A4(getMessagesController().X1(Long.valueOf(dialog2.id)))) {
                        arrayList9.add(dialog2);
                    }
                }
                for (TLRPC.User user : concurrentHashMap.values()) {
                    if (user != null && !zh6Var.d(user.id) && A4(user)) {
                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_dialog.peer = tL_peerUser;
                        long j2 = user.id;
                        tL_peerUser.user_id = j2;
                        tL_dialog.id = j2;
                        arrayList9.add(tL_dialog);
                    }
                }
            } else {
                boolean z3 = requestPeerType instanceof TLRPC.TL_requestPeerTypeChat;
                if (z3 || (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast)) {
                    ConcurrentHashMap concurrentHashMap2 = s1.b;
                    if (z3) {
                        arrayList3 = arrayList6;
                    }
                    int size3 = arrayList3.size();
                    while (r8 < size3) {
                        Object obj2 = arrayList3.get(r8);
                        r8++;
                        TLRPC.Dialog dialog3 = (TLRPC.Dialog) obj2;
                        if (z4(getMessagesController().M0(Long.valueOf(-dialog3.id)), X1)) {
                            arrayList9.add(dialog3);
                        }
                    }
                    for (TLRPC.Chat chat : concurrentHashMap2.values()) {
                        if (chat != null && !zh6Var.d(-chat.id) && z4(chat, X1)) {
                            TLRPC.TL_dialog tL_dialog2 = new TLRPC.TL_dialog();
                            if (xc2.T(chat)) {
                                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                tL_dialog2.peer = tL_peerChannel;
                                j = chat.id;
                                tL_peerChannel.channel_id = j;
                            } else {
                                TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                                tL_dialog2.peer = tL_peerChat;
                                j = chat.id;
                                tL_peerChat.chat_id = j;
                            }
                            tL_dialog2.id = -j;
                            arrayList9.add(tL_dialog2);
                        }
                    }
                }
            }
            return arrayList9;
        }
        ArrayList arrayList10 = this.Z3;
        if (arrayList10 != null) {
            return arrayList10;
        }
        this.Z3 = new ArrayList();
        r9 = i2 == 16;
        if (this.B2 || this.C2 || r9) {
            int size4 = arrayList2.size();
            int i5 = 0;
            while (i5 < size4) {
                Object obj3 = arrayList2.get(i5);
                i5++;
                TLRPC.Dialog dialog4 = (TLRPC.Dialog) obj3;
                TLRPC.User X12 = s1.X1(Long.valueOf(dialog4.id));
                if (X12 != null && !lbc.z(X12)) {
                    if (!r9) {
                        if (X12.bot) {
                            if (this.C2) {
                                if (lbc.D(X12)) {
                                }
                            }
                        } else if (this.B2) {
                            if (lbc.D(X12)) {
                            }
                        }
                        this.Z3.add(dialog4);
                    } else if (!lbc.C(X12.id) && !uc7.K2(X12)) {
                        this.Z3.add(dialog4);
                    }
                }
            }
        }
        if (this.x2 || (((z2 = this.z2) && this.y2) || r9)) {
            int size5 = arrayList6.size();
            int i6 = 0;
            while (i6 < size5) {
                Object obj4 = arrayList6.get(i6);
                i6++;
                TLRPC.Dialog dialog5 = (TLRPC.Dialog) obj4;
                TLRPC.Chat M0 = s1.M0(Long.valueOf(-dialog5.id));
                if (M0 != null && !xc2.V(M0)) {
                    if (r9) {
                        if (xc2.n0(M0)) {
                            this.Z3.add(dialog5);
                        }
                    } else if (s1.x(dialog5)) {
                        this.Z3.add(dialog5);
                    }
                }
            }
        } else if (z2 || this.y2 || r9) {
            int size6 = arrayList6.size();
            int i7 = 0;
            while (i7 < size6) {
                Object obj5 = arrayList6.get(i7);
                i7++;
                TLRPC.Dialog dialog6 = (TLRPC.Dialog) obj5;
                TLRPC.Chat M02 = s1.M0(Long.valueOf(-dialog6.id));
                if (M02 != null && !xc2.V(M02)) {
                    if (r9) {
                        if (xc2.n0(M02)) {
                            this.Z3.add(dialog6);
                        }
                    } else if (s1.x(dialog6)) {
                        if (this.z2) {
                            if (!xc2.n0(M02)) {
                                this.Z3.add(dialog6);
                            }
                        }
                        if (this.y2 && xc2.n0(M02)) {
                            this.Z3.add(dialog6);
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
                TLRPC.Chat M03 = s1.M0(Long.valueOf(-dialog7.id));
                if (r9) {
                    if (M03 instanceof TLRPC.TL_channel) {
                        this.Z3.add(dialog7);
                    }
                } else if (s1.x(dialog7)) {
                    this.Z3.add(dialog7);
                }
            }
        }
        uc7 messagesController = getMessagesController();
        ArrayList arrayList11 = this.Z3;
        if (arrayList11 == null) {
            messagesController.getClass();
        } else {
            Collections.sort(arrayList11, messagesController.s4);
        }
        return this.Z3;
    }

    public final void o4() {
        pj0 a = pj0.a(this.currentAccount);
        int i = a.a;
        Set<String> set = a.d;
        nj0 nj0Var = a.c;
        if (nj0Var != null && !set.contains(nj0Var.a)) {
            set.add(a.c.a);
            SharedPreferences.Editor edit = uc7.s1(i).X3.edit();
            edit.putStringSet("bday_hidden", set);
            edit.apply();
            jn7.f(i).k(jn7.j5, new Object[0]);
        }
        uc7.s1(this.currentAccount).v4(0L, "BIRTHDAY_CONTACTS_TODAY");
        q5();
        v21 G = d31.b0(this).G(R.raw.gift, 4, ob6.M0(2131753323, null));
        G.j = 5000;
        G.j();
    }

    public final void o5() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        ew9 ew9Var = this.a0;
        float measuredHeight = (ew9Var == null || ew9Var.getVisibility() == 8) ? 0.0f : this.a0.getMeasuredHeight();
        float L = this.L ? hl.L(81.0f) : 0.0f;
        boolean z = this.L;
        float f8 = this.O;
        float f9 = this.z1;
        if (z) {
            f = (measuredHeight * f9) + qd4.A(1.0f, f9, L, f8);
            f2 = this.z3;
        } else {
            f = (measuredHeight * f9) + f8;
            f2 = this.z3;
        }
        float f10 = f + f2 + this.U;
        hj3 hj3Var = this.Y;
        float L2 = hl.L(4.0f) * ((hj3Var == null || hj3Var.getVisibility() != 0) ? 0.0f : this.Y.getAlpha());
        ij3 ij3Var = this.A0;
        if (ij3Var != null) {
            ij3Var.setTranslationY(f10 - L2);
            f4 = this.A0.getAlpha();
            f5 = (this.A0.getUnreadOnlyBannerHeight() + hl.L(43.0f)) * f4;
            f3 = f10 + f5;
        } else {
            f3 = f10;
            f4 = 0.0f;
            f5 = 0.0f;
        }
        xj3 xj3Var = this.L1;
        if (xj3Var != null) {
            xj3Var.setTranslationY(hl.R1(f3 - L2, (-hl.L(3.0f)) - (this.b0 == null ? hl.L(44.0f) : 0), this.b.e));
            f6 = this.L1.getMetadata().c.a;
            f7 = this.L1.c(0.0f);
        } else {
            f6 = 0.0f;
            f7 = 0.0f;
        }
        wj3 wj3Var = this.M1;
        if (wj3Var != null) {
            wj3Var.setTranslationY(f10 - L2);
            float U1 = hl.U1(Math.min(f6, f4), hl.L(7.0f), hl.L(50.0f));
            wj3 wj3Var2 = this.M1;
            float min = Math.min(hl.L(40.0f), (f7 + f5) - U1);
            Matrix matrix = wj3Var2.b;
            if (wj3Var2.e != U1 || wj3Var2.f != min) {
                wj3Var2.e = U1;
                wj3Var2.f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, U1);
                LinearGradient linearGradient = wj3Var2.c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                wj3Var2.invalidate();
            }
            this.M1.setAlpha(Math.max(f4, f6));
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onBackPressed(boolean z) {
        if (hasShownSheet()) {
            if (z) {
                closeSheet();
                return false;
            }
        } else if (!this.H3.c() || !this.H3.getFragment().onBackPressed(z)) {
            fu5 fu5Var = this.M0;
            if (fu5Var == null) {
                ij3 ij3Var = this.A0;
                if (ij3Var == null || !ij3Var.n) {
                    a aVar = this.actionBar;
                    if (aVar == null || !aVar.z()) {
                        if (!this.b.f) {
                            ij3 ij3Var2 = this.A0;
                            if (ij3Var2 != null && ij3Var2.getVisibility() == 0 && !this.j3) {
                                ij3 ij3Var3 = this.A0;
                                if (!ij3Var3.Q && !this.o3) {
                                    ArrayList arrayList = ij3Var3.h;
                                    if (!arrayList.isEmpty() && ij3Var3.M != ((bg4) arrayList.get(0)).a) {
                                        if (z) {
                                            ij3 ij3Var4 = this.A0;
                                            ArrayList arrayList2 = ij3Var4.h;
                                            if (!arrayList2.isEmpty()) {
                                                ij3Var4.i((bg4) arrayList2.get(0), 0);
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                            bi3 bi3Var = this.D1;
                            if (bi3Var == null || !bi3Var.U0()) {
                                ii3 ii3Var = this.F0;
                                if (ii3Var.P != 0 || ii3Var.T.K0() == 0) {
                                    return super.onBackPressed(z);
                                }
                                ii3Var.h.A0(0);
                                return false;
                            }
                            if (z) {
                                this.D1.N0(true);
                            }
                        } else if (z) {
                            this.Y.r.getText().clear();
                            this.Z.b(false);
                            this.Y.r.clearFocus();
                            return false;
                        }
                    } else if (z) {
                        bj3 bj3Var = this.D0;
                        if (bj3Var != null && bj3Var.getVisibility() == 0) {
                            this.D0.S(false);
                        }
                        A3(true);
                        return false;
                    }
                } else if (z) {
                    ij3Var.setIsEditing(false);
                    d5(false);
                    return false;
                }
            } else if (z) {
                fu5Var.u();
                this.M0 = null;
                return false;
            }
        } else if (z) {
            this.H3.a();
            bj3 bj3Var2 = this.D0;
            if (bj3Var2 != null) {
                bj3Var2.T();
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onBecomeFullyHidden() {
        tb tbVar;
        ij3 ij3Var;
        if (this.X1) {
            a aVar = this.actionBar;
            if (aVar != null) {
                aVar.o(true);
            }
            TLObject tLObject = this.Z1;
            if (tLObject != null) {
                bj3 bj3Var = this.D0;
                if (bj3Var != null) {
                    bj3Var.e0.Q(this.Y1, tLObject);
                }
                this.Z1 = null;
            }
            this.X1 = false;
        }
        if (!this.L && (ij3Var = this.A0) != null && ij3Var.getVisibility() == 0 && this.r.f) {
            int i = (int) (-this.O);
            int currentActionBarHeight = a.getCurrentActionBarHeight();
            if (i != 0 && i != currentActionBarHeight && i >= currentActionBarHeight / 2) {
                this.f0[0].a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.z0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        if (!isInPreviewMode() && (tbVar = this.L0) != null && tbVar.getVisibility() == 0) {
            this.L0.setVisibility(8);
            this.L0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        X2();
        this.s0 = true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onBecomeFullyVisible() {
        kg5 kg5Var;
        super.onBecomeFullyVisible();
        if (F3()) {
            SharedPreferences e1 = uc7.e1();
            boolean z = e1.getBoolean("archivehint", true);
            boolean isEmpty = o3(this.currentAccount, this.T0, this.Y2, false).isEmpty();
            if (z && isEmpty) {
                uc7.e1().edit().putBoolean("archivehint", false).commit();
                z = false;
            }
            if (z) {
                e1.edit().putBoolean("archivehint", false).commit();
                b5();
            }
        }
        if (this.s0 && !this.t0 && (kg5Var = this.q0) != null && this.R3) {
            this.t0 = true;
            this.s0 = false;
            kg5Var.v();
        }
        hl.d3(new ch3(this, (byte) 11), 200L);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        fu5 fu5Var = this.M0;
        if (fu5Var != null) {
            fu5Var.u();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onDialogDismiss(Dialog dialog) {
        id idVar;
        super.onDialogDismiss(dialog);
        if (this.Y2 == 0 && this.a3 == 0 && (idVar = this.V1) != null && dialog == idVar && getParentActivity() != null) {
            C2(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
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
            long j = this.arguments.getLong("community_id", 0L);
            this.a3 = j;
            if (j != 0) {
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
            this.W1 = uc7.f1().getBoolean("askAboutContacts", true);
            xea.t();
        }
        jn7 notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        this.L3 = new u8a(notificationCenter, this);
        if (this.p2 == null) {
            this.f2 = getConnectionsManager().getConnectionState();
            this.L3.e(jn7.l4);
            if (!this.n2) {
                this.L3.e(jn7.L4);
                this.L3.e(jn7.D4);
                this.L3.b(jn7.R2);
                this.L3.b(jn7.d2);
            }
            u8a u8aVar = this.L3;
            u8aVar.b(jn7.r);
            u8aVar.b(jn7.O2);
            u8aVar.b(jn7.P2);
            u8aVar.b(jn7.Q2);
            u8aVar.b(2);
            u8aVar.b(jn7.Y);
            u8aVar.b(jn7.N);
            u8aVar.b(jn7.I2);
            u8aVar.b(jn7.h0);
            u8aVar.b(jn7.f0);
            u8aVar.b(jn7.I);
            u8aVar.b(jn7.J);
            u8aVar.b(jn7.L);
            u8aVar.b(jn7.P0);
            u8aVar.b(jn7.s0);
            u8aVar.b(jn7.t5);
            u8aVar.b(jn7.S0);
            u8aVar.b(jn7.T1);
            u8aVar.b(jn7.e5);
            u8aVar.b(jn7.K2);
            u8aVar.b(jn7.d0);
            u8aVar.b(jn7.s1);
            u8aVar.b(jn7.b5);
            u8aVar.b(jn7.c5);
            u8aVar.b(jn7.M);
            u8aVar.b(jn7.p5);
            u8aVar.b(jn7.i5);
            this.L3.e(jn7.n0);
        }
        u8a u8aVar2 = this.L3;
        u8aVar2.b(jn7.v);
        u8aVar2.b(jn7.V4);
        u8aVar2.b(jn7.d5);
        u8aVar2.b(jn7.T);
        u8aVar2.b(jn7.O4);
        u8aVar2.b(jn7.w5);
        u8aVar2.b(jn7.y5);
        u8aVar2.b(jn7.b3);
        u8aVar2.b(jn7.f3);
        u8aVar2.b(jn7.j5);
        u8aVar2.b(jn7.A3);
        u8aVar2.b(jn7.C3);
        u8aVar2.b(jn7.V5);
        u8aVar2.b(jn7.W5);
        u8aVar2.b(jn7.S3);
        u8aVar2.b(jn7.T3);
        if (this.T0 == 0) {
            this.L3.b(jn7.C5);
            this.L3.b(jn7.P1);
        }
        x4(getAccountInstance());
        c6b O1 = getMessagesController().O1();
        if (!O1.A) {
            O1.V();
            if (!O1.s) {
                ConnectionsManager.getInstance(O1.a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new g5b(O1, (byte) 4));
            }
        }
        getMessagesController().j3(this.Y2);
        if (this.X3 != null && !getMessagesStorage().R) {
            d93 d93Var = this.X3;
            if (d93Var.getParent() != null) {
                ((ViewGroup) d93Var.getParent()).removeView(d93Var);
            }
            this.X3 = null;
        }
        if (F3()) {
            c6b O12 = getMessagesController().O1();
            if (O12.z) {
                O12.S(true);
            }
        } else {
            getMessagesController().O1().V();
        }
        getContactsController().B();
        if (getMessagesController().P3) {
            nt9 F1 = getMessagesController().F1();
            if (!F1.e) {
                F1.g(true);
            }
        }
        if (this.a3 != 0) {
            getMessagesController().e3(0, this.a3, true);
        }
        pj0 a = pj0.a(this.currentAccount);
        if (!a.e) {
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = a.b;
            boolean z = j2 == 0;
            if (!z) {
                long j3 = currentTimeMillis - j2;
                boolean z2 = f11.a;
                z = j3 > 43200000;
            }
            if (!z) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(a.b);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(currentTimeMillis);
                z = (calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1)) ? false : true;
            }
            if (z) {
                a.e = true;
                ConnectionsManager.getInstance(a.a).sendRequest(new TL_account.getBirthdays(), new ye(a, (byte) 3));
            }
        }
        this.o4 = this.X ? hl.L(72.0f) : 0;
        this.p4 = this.X ? hl.L(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public void onFragmentDestroy() {
        hl.r(this.T3);
        hl.r(this.Q3);
        this.P3.A();
        super.onFragmentDestroy();
        u8a u8aVar = this.L3;
        if (u8aVar != null) {
            u8aVar.a();
            this.L3 = null;
        }
        bi3 bi3Var = this.D1;
        if (bi3Var != null) {
            bi3Var.g1();
        }
        sea seaVar = this.I2;
        if (seaVar != null) {
            seaVar.j();
        }
        wd3 wd3Var = this.J2;
        if (wd3Var != null) {
            hl.r(wd3Var);
            this.J2 = null;
        }
        UndoView undoView = this.z0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.r3.e();
        this.E2 = null;
        int i = by4.l1;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onPanTranslationUpdate(float f) {
        if (this.f0 != null) {
            this.K0 = f;
            bi3 bi3Var = this.D1;
            int i = 0;
            if (bi3Var == null || !bi3Var.U0()) {
                while (true) {
                    tj3[] tj3VarArr = this.f0;
                    if (i >= tj3VarArr.length) {
                        break;
                    }
                    tj3VarArr[i].setTranslationY(f);
                    i++;
                }
                if (!this.n2) {
                    this.actionBar.setTranslationY(f);
                    v21 v21Var = this.q3;
                    if (v21Var != null) {
                        v21Var.l();
                    }
                }
                bj3 bj3Var = this.D0;
                if (bj3Var != null) {
                    bj3Var.setTranslationY(this.K0 + this.J0);
                    return;
                }
                return;
            }
            this.fragmentView.setTranslationY(f);
            while (true) {
                tj3[] tj3VarArr2 = this.f0;
                if (i >= tj3VarArr2.length) {
                    break;
                }
                tj3VarArr2[i].setTranslationY(0.0f);
                i++;
            }
            if (!this.n2) {
                this.actionBar.setTranslationY(0.0f);
                v21 v21Var2 = this.q3;
                if (v21Var2 != null) {
                    v21Var2.l();
                }
            }
            bj3 bj3Var2 = this.D0;
            if (bj3Var2 != null) {
                bj3Var2.setTranslationY(this.J0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onPause() {
        super.onPause();
        hl.r(this.Q3);
        this.P3.A();
        v21 v21Var = this.T;
        if (v21Var != null) {
            v21Var.b();
            this.T = null;
        }
        li3 li3Var = this.H3;
        if (li3Var != null) {
            li3Var.r = true;
            si3 si3Var = li3Var.a;
            if (si3Var != null) {
                si3Var.onPause();
            }
        }
        fu5 fu5Var = this.M0;
        if (fu5Var != null) {
            fu5Var.u();
        }
        bi3 bi3Var = this.D1;
        if (bi3Var != null) {
            bi3Var.i1();
        }
        int i = 0;
        UndoView undoView = this.z0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        setBulletinDelegate(null);
        if (this.f0 == null) {
            return;
        }
        while (true) {
            tj3[] tj3VarArr = this.f0;
            if (i >= tj3VarArr.length) {
                return;
            }
            tj3VarArr[i].d.getClass();
            i++;
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        ab0 ab0Var;
        if (i != 1) {
            if (i == 4) {
                for (int i2 : iArr) {
                    if (i2 != 0) {
                        return;
                    }
                }
                if (Build.VERSION.SDK_INT < 30 || (ab0Var = FilesMigrationService.e) == null) {
                    return;
                }
                ab0Var.E0();
                return;
            }
            return;
        }
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (iArr.length > i3) {
                String str = strArr[i3];
                str.getClass();
                switch (str) {
                    case "android.permission.POST_NOTIFICATIONS":
                        if (iArr[i3] == 0) {
                            ip7.n(this.currentAccount).Y();
                            break;
                        } else {
                            so7.E0();
                            break;
                        }
                    case "android.permission.WRITE_EXTERNAL_STORAGE":
                        if (iArr[i3] == 0) {
                            in5.z().e(null);
                            break;
                        } else {
                            break;
                        }
                    case "android.permission.READ_CONTACTS":
                        if (iArr[i3] == 0) {
                            hl.c3(new ch3(this, (byte) 10));
                            getContactsController().l();
                            break;
                        } else {
                            SharedPreferences.Editor edit = uc7.f1().edit();
                            this.W1 = false;
                            edit.putBoolean("askAboutContacts", false).commit();
                            break;
                        }
                }
            }
        }
        if (this.B0) {
            this.B0 = false;
            e5();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        uj3 uj3Var;
        tj3 tj3Var;
        yh3 yh3Var;
        gx9 gx9Var;
        tb tbVar;
        super.onResume();
        w4();
        ii3 ii3Var = this.F0;
        if (ii3Var != null) {
            ArrayList arrayList = ii3Var.y;
            c6b c6bVar = ii3Var.s;
            c6bVar.k(c6bVar.g);
            c6bVar.k(c6bVar.h);
            for (int i = 0; i < arrayList.size(); i++) {
                TL_stories.PeerStories x = c6bVar.x(((mg3) arrayList.get(i)).c);
                if (x != null) {
                    c6bVar.Z(x);
                }
            }
        }
        li3 li3Var = this.H3;
        if (li3Var != null) {
            li3Var.r = false;
            si3 si3Var = li3Var.a;
            if (si3Var != null) {
                si3Var.onResume();
            }
        }
        byte b = 8;
        if (!((ActionBarLayout) this.parentLayout).w() && (tbVar = this.L0) != null && tbVar.getVisibility() == 0) {
            this.L0.setVisibility(8);
            this.L0.setBackground(null);
        }
        if (this.f0 != null) {
            int i2 = 0;
            while (true) {
                tj3[] tj3VarArr = this.f0;
                if (i2 >= tj3VarArr.length) {
                    break;
                }
                tj3VarArr[i2].d.f();
                i2++;
            }
        }
        if (this.S3) {
            this.S3 = false;
            getMessagesController().h5(null);
            if (this.f0 != null) {
                int i3 = 0;
                while (true) {
                    tj3[] tj3VarArr2 = this.f0;
                    if (i3 >= tj3VarArr2.length) {
                        break;
                    }
                    tj3VarArr2[i3].d.f();
                    i3++;
                }
            }
        }
        F5(-1, false);
        bi3 bi3Var = this.D1;
        if (bi3Var != null) {
            bi3Var.j1();
        }
        long j = 0;
        if (!this.n2 && this.Y2 == 0 && this.a3 == 0) {
            getMediaDataController().D(4);
        }
        bj3 bj3Var = this.D0;
        if (bj3Var != null && (gx9Var = bj3Var.e0) != null) {
            gx9Var.f();
        }
        boolean z = this.v2 || getUserConfig().a0 == null;
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        byte b2 = 9;
        if (z && this.Y2 == 0 && this.a3 == 0 && this.e2 && !this.n2) {
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.e2 = false;
                boolean z2 = parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0;
                int i4 = Build.VERSION.SDK_INT;
                boolean z3 = (i4 <= 28 || f11.b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0;
                boolean z4 = i4 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0;
                uj3Var = this;
                vu2 vu2Var = new vu2(uj3Var, z4, z2, z3, parentActivity);
                if (uj3Var.v2 && (z2 || z4)) {
                    j = 4000;
                }
                hl.d3(vu2Var, j);
            } else {
                uj3Var = this;
            }
        } else {
            uj3Var = this;
            if (!uj3Var.n2 && uj3Var.Y2 == 0 && uj3Var.a3 == 0 && f3f.b() && !f3f.a()) {
                if (uj3Var.getParentActivity() == null) {
                    return;
                }
                if (!uc7.f1().getBoolean("askedAboutMiuiLockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uj3Var.getParentActivity());
                    int i5 = aob.L5;
                    alertDialog$Builder.l(R.raw.permission_request_apk, 72, uj3Var.getThemedColor(i5), null);
                    alertDialog$Builder.m(i5, uj3Var.getResourceProvider());
                    String M0 = ob6.M0(2131747025, null);
                    id idVar = alertDialog$Builder.a;
                    idVar.U = M0;
                    alertDialog$Builder.j(ob6.M0(2131747027, null), new xg3(uj3Var, b));
                    alertDialog$Builder.g(ob6.M0(2131751737, null), new da3((byte) 15));
                    uj3Var.showDialog(idVar);
                }
            } else if (uj3Var.Y2 == 0 && uj3Var.a3 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
                if (uj3Var.getParentActivity() == null) {
                    return;
                }
                if (!uc7.f1().getBoolean("askedAboutFSILockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(uj3Var.getParentActivity());
                    int i6 = aob.L5;
                    alertDialog$Builder2.l(R.raw.permission_request_apk, 72, uj3Var.getThemedColor(i6), null);
                    alertDialog$Builder2.m(i6, uj3Var.getResourceProvider());
                    String M02 = ob6.M0(2131747041, null);
                    id idVar2 = alertDialog$Builder2.a;
                    idVar2.U = M02;
                    alertDialog$Builder2.j(ob6.M0(2131747027, null), new xg3(uj3Var, b2));
                    alertDialog$Builder2.g(ob6.M0(2131751737, null), new da3((byte) 16));
                    uj3Var.showDialog(idVar2);
                }
            }
        }
        uj3Var.e5();
        if (uj3Var.f0 != null) {
            int i7 = 0;
            while (true) {
                tj3[] tj3VarArr3 = uj3Var.f0;
                if (i7 >= tj3VarArr3.length) {
                    break;
                }
                tj3 tj3Var2 = tj3VarArr3[i7];
                if (tj3Var2.s == 0 && tj3Var2.w == 2 && tj3Var2.c.K0() == 0 && uj3Var.y3()) {
                    uj3Var.f0[i7].c.g1(1, (int) uj3Var.O);
                }
                tj3[] tj3VarArr4 = uj3Var.f0;
                if (i7 == 0) {
                    tj3VarArr4[i7].d.getClass();
                } else {
                    tj3VarArr4[i7].d.getClass();
                }
                i7++;
            }
        }
        uj3Var.g5();
        uj3Var.setBulletinDelegate(new t10(uj3Var, b2));
        if (uj3Var.s3) {
            hl.V2(uj3Var.getParentActivity(), uj3Var.classGuid);
        }
        uj3Var.G5(0, false);
        uj3Var.w5(false, true);
        uj3Var.E5(false);
        uj3Var.N2();
        uj3Var.X2();
        if (uj3Var.A0 == null || (tj3Var = uj3Var.f0[0]) == null || (yh3Var = tj3Var.d) == null) {
            return;
        }
        int i8 = yh3Var.h;
        if (i8 == 7 || i8 == 8) {
            ac7 ac7Var = uj3Var.getMessagesController().N[i8 != 7 ? (char) 1 : (char) 0];
            if (ac7Var != null) {
                uj3Var.A0.k(ac7Var.o);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onSlideProgress(boolean z, float f) {
        if (xea.o() <= 0) {
            boolean z2 = f11.a;
        } else if (this.f4 && this.g4 == null) {
            Z4(f);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.h1.setColor(getThemedColor(aob.d6));
            H2();
            r5();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        tb tbVar;
        uj3 uj3Var;
        li3 li3Var = this.H3;
        if (li3Var == null || !li3Var.c()) {
            if (z && (tbVar = this.L0) != null && tbVar.getVisibility() == 0) {
                this.L0.setVisibility(8);
                this.L0.setBackground(null);
            }
            if (z && this.v2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).w0.c(false);
                }
            }
        } else {
            this.H3.getFragment().onTransitionAnimationEnd(z, z2);
        }
        if (!z && (uj3Var = this.Z2) != null) {
            uj3Var.removeSelfFromStack();
        }
        X2();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onTransitionAnimationProgress(boolean z, float f) {
        li3 li3Var = this.H3;
        if (li3Var == null || !li3Var.c()) {
            tb tbVar = this.L0;
            if (tbVar != null && tbVar.getVisibility() == 0) {
                tb tbVar2 = this.L0;
                if (z) {
                    tbVar2.setAlpha(1.0f - f);
                } else {
                    tbVar2.setAlpha(f);
                }
            }
        } else {
            this.H3.getFragment().onTransitionAnimationProgress(z, f);
        }
        X2();
    }

    public final float p3(boolean z) {
        return (z ? 1.0f - this.b.e : 1.0f) * (1.0f - t3()) * this.r.e;
    }

    public final void p4(TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            v21 I = d31.b0(this).I(R.raw.gift, ob6.M0(2131746585, null), ob6.M0(2131746584, null));
            I.j = 5000;
            I.j();
            return;
        }
        if (userFull != null) {
            int i = userFull.flags2;
            if (tL_birthday == null) {
                userFull.flags2 = i & (-33);
            } else {
                userFull.flags2 = i | 32;
            }
            userFull.birthday = tL_birthday;
            getMessagesStorage().g2(userFull, false);
        }
        if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            bs2.v(null, 2131743534, d31.b0(this), R.raw.error, 36);
            return;
        }
        if (getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.resourceProvider, getParentActivity());
            String M0 = ob6.M0(2131746581, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.M0(2131746582, null);
            alertDialog$Builder.j(ob6.M0(2131747558, null), null);
            showDialog(idVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:206:0x03ca, code lost:
    
        if (r1.isEmpty() != false) goto L205;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0408  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.graphics.drawable.Drawable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p5(boolean z) {
        boolean z2;
        s7 s7Var;
        ?? r5;
        b8 b8Var;
        s7 s7Var2;
        ij3 ij3Var;
        bg4 e;
        ij3 ij3Var2;
        bg4 e2;
        TLRPC.User X1;
        this.X2 = false;
        this.V2 = 0;
        this.S2 = 0;
        this.R2 = 0;
        this.Q2 = 0;
        this.P2 = 0;
        this.W2 = 0;
        this.T2 = 0;
        this.U2 = 0;
        if (z) {
            return;
        }
        ArrayList arrayList = this.K2;
        int size = arrayList.size();
        long e3 = getUserConfig().e();
        SharedPreferences notificationsSettings = getNotificationsSettings();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i < size) {
            ArrayList arrayList2 = arrayList;
            TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(((Long) arrayList.get(i)).longValue());
            long j = e3;
            if (dialog != null) {
                long j2 = dialog.id;
                boolean H3 = H3(dialog);
                boolean z3 = dialog.unread_count != 0 || dialog.unread_mark;
                if (getMessagesController().v2(j2)) {
                    this.W2++;
                }
                if (getMessagesController().p2(j2, 0L, null)) {
                    this.S2++;
                } else {
                    this.R2++;
                }
                if (z3) {
                    this.P2++;
                }
                if (this.Y2 == 1 || dialog.folder_id == 1) {
                    this.V2++;
                } else if (j2 != j && dialog.community_id == 0 && j2 != 777000 && !getMessagesController().G2(j2, false)) {
                    i5++;
                }
                if (dialog.community_id != 0) {
                    i3++;
                }
                if (!wf3.D(j2) || j2 == j || j2 == 489000 || uc7.K2(getMessagesController().X1(Long.valueOf(j2)))) {
                    i7++;
                } else if (qu6.v("dialog_bar_report", j2, notificationsSettings, true)) {
                    this.U2++;
                }
                if (wf3.x(dialog)) {
                    TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j2));
                    if (getMessagesController().G2(dialog.id, true)) {
                        this.T2++;
                        int i8 = getMessagesController().t2;
                        int i9 = uc7.r5;
                        if (i8 == 1) {
                            i2++;
                            this.X2 = true;
                        }
                    } else {
                        if (H3) {
                            i6++;
                        } else {
                            this.Q2++;
                        }
                        if (M0 == null || !M0.megagroup) {
                            this.T2++;
                        } else if (xc2.t0(M0)) {
                            this.T2++;
                        }
                        i2++;
                    }
                } else {
                    boolean y = wf3.y(dialog.id);
                    if (y) {
                        getMessagesController().M0(Long.valueOf(-dialog.id));
                    }
                    if (wf3.B(dialog.id)) {
                        TLRPC.EncryptedChat a1 = getMessagesController().a1(Integer.valueOf((int) (dialog.id & 4294967295L)));
                        X1 = a1 != null ? getMessagesController().X1(Long.valueOf(a1.user_id)) : new TLRPC.TL_userEmpty();
                    } else {
                        X1 = (y || !wf3.D(dialog.id)) ? null : getMessagesController().X1(Long.valueOf(dialog.id));
                    }
                    if (X1 != null && X1.bot) {
                        int i10 = uc7.r5;
                    }
                    if (H3) {
                        i6++;
                    } else {
                        this.Q2++;
                    }
                }
                i4++;
                i2++;
            }
            i++;
            arrayList = arrayList2;
            e3 = j;
        }
        ArrayList arrayList3 = arrayList;
        s7 s7Var3 = this.l1;
        if (s7Var3 != null) {
            if (i2 != size || i3 > 0) {
                s7Var3.setVisibility(8);
            } else {
                s7Var3.setVisibility(0);
            }
        }
        b8 b8Var2 = this.t1;
        if (b8Var2 != null) {
            int i11 = this.T2;
            if ((i11 == 0 || i11 == size) && ((i4 == 0 || i4 == size) && i3 <= 0)) {
                b8Var2.setVisibility(0);
                int i12 = this.T2;
                b8 b8Var3 = this.t1;
                if (i12 != 0) {
                    b8Var3.setText(ob6.M0(2131752053, null));
                } else {
                    b8Var3.setText(ob6.M0(2131752054, null));
                }
            } else {
                b8Var2.setVisibility(8);
            }
        }
        b8 b8Var4 = this.s1;
        if (b8Var4 != null && this.o1 != null) {
            if (this.V2 != 0 && i3 == 0 && this.a3 == 0) {
                String M02 = ob6.M0(2131743570, null);
                this.s1.j(M02, R.drawable.msg_unarchive, null);
                this.o1.setIcon(R.drawable.msg_unarchive);
                this.o1.setContentDescription(M02);
                ij3 ij3Var3 = this.A0;
                if (ij3Var3 == null || ij3Var3.getVisibility() != 0) {
                    this.s1.setVisibility(0);
                    this.o1.setVisibility(8);
                } else {
                    this.o1.setVisibility(0);
                    this.s1.setVisibility(8);
                }
            } else if (i5 != 0 && i3 == 0 && this.a3 == 0) {
                String M03 = ob6.M0(2131754165, null);
                this.s1.j(M03, R.drawable.msg_archive, null);
                this.o1.setIcon(R.drawable.msg_archive);
                this.o1.setContentDescription(M03);
                ij3 ij3Var4 = this.A0;
                if (ij3Var4 == null || ij3Var4.getVisibility() != 0) {
                    this.s1.setVisibility(0);
                    this.o1.setVisibility(8);
                } else {
                    this.o1.setVisibility(0);
                    this.s1.setVisibility(8);
                }
            } else {
                b8Var4.setVisibility(8);
                this.o1.setVisibility(8);
            }
        }
        s7 s7Var4 = this.m1;
        if (s7Var4 != null && this.p1 != null) {
            if (this.Q2 + i6 == size && this.a3 == 0) {
                ij3 ij3Var5 = this.A0;
                if (ij3Var5 == null || ij3Var5.getVisibility() != 0) {
                    this.m1.setVisibility(0);
                    this.p1.setVisibility(8);
                } else {
                    this.p1.setVisibility(0);
                    this.m1.setVisibility(8);
                }
            } else {
                s7Var4.setVisibility(8);
                this.p1.setVisibility(8);
            }
        }
        b8 b8Var5 = this.v1;
        if (b8Var5 != null) {
            if (i7 != 0) {
                b8Var5.setVisibility(8);
            } else {
                b8Var5.setVisibility(0);
            }
        }
        if (this.r1 != null) {
            ij3 ij3Var6 = this.A0;
            boolean z4 = ij3Var6 == null || ij3Var6.getVisibility() != 0 || ((e2 = (ij3Var2 = this.A0).e()) != null && e2.a == ij3Var2.M);
            if (!z4) {
                try {
                    z4 = size >= o3(this.currentAccount, this.f0[0].d.h, this.Y2, this.U1).size();
                } catch (Exception unused) {
                }
            }
            b8 b8Var6 = this.r1;
            if (!z4) {
                z2 = false;
                b8Var6.setVisibility(0);
                if (this.q1 != null) {
                    if (this.Y2 != 1) {
                        if (this.A0 != null && p3(z2) > 0.5f && (e = (ij3Var = this.A0).e()) != null && e.a == ij3Var.M) {
                            int i13 = ah4.w1;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = getMessagesController().G0;
                            int size2 = arrayList5.size();
                            int i14 = 0;
                            while (i14 < size2) {
                                ac7 ac7Var = (ac7) arrayList5.get(i14);
                                ArrayList arrayList6 = arrayList3;
                                if (!ah4.E0(this, ac7Var, arrayList6, true, true).isEmpty() && !ac7Var.d()) {
                                    arrayList4.add(ac7Var);
                                }
                                i14++;
                                arrayList3 = arrayList6;
                            }
                        }
                        this.q1.setVisibility(8);
                    }
                    this.q1.setVisibility(0);
                }
                s7Var = this.n1;
                if (s7Var != null) {
                    r5 = 0;
                } else if (this.S2 != 0) {
                    s7Var.setIcon(R.drawable.msg_unmute);
                    r5 = 0;
                    this.n1.setContentDescription(ob6.M0(2131752130, null));
                } else {
                    r5 = 0;
                    s7Var.setIcon(R.drawable.msg_mute);
                    this.n1.setContentDescription(ob6.M0(2131752140, null));
                }
                b8Var = this.u1;
                if (b8Var != 0) {
                    if (this.P2 != 0) {
                        b8Var.j(ob6.M0(2131748435, r5), R.drawable.msg_markread, r5);
                        this.u1.setVisibility(0);
                    } else if (this.W2 == 0 && i3 == 0) {
                        b8Var.j(ob6.M0(2131748434, r5), R.drawable.msg_markunread, r5);
                        this.u1.setVisibility(0);
                    } else {
                        b8Var.setVisibility(8);
                    }
                }
                s7Var2 = this.m1;
                if (s7Var2 != null || this.p1 == null) {
                }
                if (this.Q2 != 0) {
                    s7Var2.setIcon(R.drawable.msg_pin);
                    this.m1.setContentDescription(ob6.M0(2131746964, null));
                    this.p1.setText(ob6.M0(2131751418, null));
                    return;
                } else {
                    s7Var2.setIcon(R.drawable.msg_unpin);
                    this.m1.setContentDescription(ob6.M0(2131743500, null));
                    this.p1.setText(ob6.M0(2131751417, null));
                    return;
                }
            }
            b8Var6.setVisibility(8);
        }
        z2 = false;
        if (this.q1 != null) {
        }
        s7Var = this.n1;
        if (s7Var != null) {
        }
        b8Var = this.u1;
        if (b8Var != 0) {
        }
        s7Var2 = this.m1;
        if (s7Var2 != null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void prepareFragmentToSlide(boolean z, boolean z2) {
        if (!z && z2) {
            this.f4 = true;
            V4(true);
        } else {
            this.g4 = null;
            this.f4 = false;
            V4(false);
            Z4(1.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean presentFragment(e eVar) {
        boolean presentFragment = super.presentFragment(eVar);
        if (presentFragment && this.f0 != null) {
            int i = 0;
            while (true) {
                tj3[] tj3VarArr = this.f0;
                if (i >= tj3VarArr.length) {
                    break;
                }
                tj3VarArr[i].d.getClass();
                i++;
            }
        }
        kg5 kg5Var = this.q0;
        if (kg5Var != null) {
            kg5Var.f(true);
        }
        kg5 kg5Var2 = this.r0;
        if (kg5Var2 != null) {
            kg5Var2.f(true);
        }
        v21.e();
        return presentFragment;
    }

    public final int q3() {
        if (!this.L) {
            return hl.L(48.0f);
        }
        return hl.L(48.0f) + hl.L(81.0f);
    }

    public final /* synthetic */ void q4(TL_account.TL_birthday tL_birthday) {
        TL_account.TL_birthday tL_birthday2;
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull Y1 = getMessagesController().Y1(getUserConfig().e());
        if (Y1 != null) {
            tL_birthday2 = Y1.birthday;
            Y1.flags2 |= 32;
            Y1.birthday = tL_birthday;
        } else {
            tL_birthday2 = null;
        }
        getMessagesController().j2();
        getConnectionsManager().sendRequest(updatebirthday, new fn0((Object) this, (Object) Y1, (Object) tL_birthday2, (byte) 21), 1024);
        uc7.s1(this.currentAccount).v4(0L, "BIRTHDAY_SETUP");
        q5();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0a0d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0a27  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0922  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x092c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q5() {
        boolean z;
        li3 li3Var;
        fm0 fm0Var;
        boolean z2;
        boolean z3;
        m9 m9Var;
        li3 li3Var2;
        kv4 kv4Var;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        int i;
        boolean z4;
        w8c w8cVar;
        boolean z5;
        li3 li3Var3;
        long j;
        nj0 b;
        StringBuilder sb;
        final long j2;
        final long j3;
        if (this.L1 == null || this.O1 == null || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        uk3 uk3Var = this.O1;
        final byte b2 = 0;
        String str = null;
        if (uk3Var != null) {
            try {
                ((b29) ((rb0) uk3Var.h.getImageReceiver().n0).K).M(null);
            } catch (Exception unused) {
            }
            uk3 uk3Var2 = this.O1;
            uk3Var2.setCompact(false);
            uk3Var2.a(yac.t0, null);
            de0 de0Var = uk3Var2.h;
            de0Var.setVisibility(8);
            de0Var.b();
        }
        byte b3 = 19;
        byte b4 = 2;
        long j4 = 0;
        final byte b5 = 1;
        if (!isInPreviewMode()) {
            byte b6 = 12;
            if (getMessagesController().x2()) {
                this.O1.setOnClickListener(new wg3(this, b6));
                this.O1.c(ob6.M0(2131754696, null), ob6.M0(2131754697, null), false, true);
            } else if (this.Y2 == 0 && this.a3 == 0 && getMessagesController().u3.contains("SETUP_PASSKEY")) {
                this.O1.setOnClickListener(new wg3(this, b3));
                this.O1.b(pv3.p(ob6.M0(2131747357, null), this.O1.c, new ch3(this, b6)), ob6.M0(2131747358, null));
                this.O1.setOnCloseListener(new wg3(this, (byte) 25));
            } else if (this.Y2 == 0 && this.a3 == 0 && getMessagesController().u3.contains("PREMIUM_GRACE")) {
                this.O1.setOnClickListener(new wg3(this, (byte) 26));
                this.O1.b(pv3.p(ob6.M0(2131749296, null), this.O1.c, new ch3(this, b6)), ob6.M0(2131749300, null));
                this.O1.setOnCloseListener(new wg3(this, (byte) 27));
            } else if (this.Y2 == 0 && this.a3 == 0 && getMessagesController().w3 != null) {
                final TLRPC.TL_pendingSuggestion tL_pendingSuggestion = getMessagesController().w3;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_pendingSuggestion.title.text);
                r47.b(spannableStringBuilder, tL_pendingSuggestion.title.entities, false, false, true, true, 0);
                Spannable A5 = r47.A5(pv3.m(spannableStringBuilder, this.O1.c.getPaint().getFontMetricsInt(), false, null, 0), tL_pendingSuggestion.title.entities, this.O1.c.getPaint().getFontMetricsInt(), false);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_pendingSuggestion.description.text);
                r47.b(spannableStringBuilder2, tL_pendingSuggestion.description.entities, false, false, true, true, 0);
                this.O1.b(A5, r47.A5(pv3.m(spannableStringBuilder2, this.O1.d.getPaint().getFontMetricsInt(), false, null, 0), tL_pendingSuggestion.description.entities, this.O1.d.getPaint().getFontMetricsInt(), false));
                this.O1.setOnClickListener(new View.OnClickListener(this) { // from class: oh3
                    public final /* synthetic */ uj3 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b7 = b2;
                        TLRPC.TL_pendingSuggestion tL_pendingSuggestion2 = tL_pendingSuggestion;
                        uj3 uj3Var = this.b;
                        switch (b7) {
                            case 0:
                                m01.u(uj3Var.getParentActivity(), tL_pendingSuggestion2.url);
                                break;
                            default:
                                uj3Var.l4(tL_pendingSuggestion2);
                                break;
                        }
                    }
                });
                this.O1.setOnCloseListener(new View.OnClickListener(this) { // from class: oh3
                    public final /* synthetic */ uj3 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b7 = b5;
                        TLRPC.TL_pendingSuggestion tL_pendingSuggestion2 = tL_pendingSuggestion;
                        uj3 uj3Var = this.b;
                        switch (b7) {
                            case 0:
                                m01.u(uj3Var.getParentActivity(), tL_pendingSuggestion2.url);
                                break;
                            default:
                                uj3Var.l4(tL_pendingSuggestion2);
                                break;
                        }
                    }
                });
            } else {
                if (this.Y2 == 0 && this.a3 == 0 && uc7.s1(this.currentAccount).u3.contains("STARS_SUBSCRIPTION_LOW_BALANCE")) {
                    jxa v = jxa.v(this.currentAccount, false);
                    ArrayList arrayList = v.z;
                    if (!arrayList.isEmpty()) {
                        long j5 = -v.f.amount;
                        int i2 = 0;
                        while (i2 < arrayList.size()) {
                            TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList.get(i2);
                            long j6 = j4;
                            long n = wf3.n(starsSubscription.peer);
                            if (n >= j6) {
                                if (getMessagesController().X1(Long.valueOf(n)) == null) {
                                    i2++;
                                    j4 = j6;
                                }
                                j5 += starsSubscription.pricing.amount;
                                i2++;
                                j4 = j6;
                            } else {
                                if (getMessagesController().M0(Long.valueOf(-n)) == null) {
                                    i2++;
                                    j4 = j6;
                                }
                                j5 += starsSubscription.pricing.amount;
                                i2++;
                                j4 = j6;
                            }
                        }
                        j = j4;
                        if (j5 > j) {
                            jxa v2 = jxa.v(this.currentAccount, false);
                            ArrayList arrayList2 = v2.z;
                            StringBuilder sb2 = new StringBuilder();
                            if (arrayList2.isEmpty()) {
                                sb = sb2;
                                j2 = j;
                                j3 = j2;
                            } else {
                                int i3 = 0;
                                long j7 = j;
                                j3 = j7;
                                while (i3 < arrayList2.size()) {
                                    TL_stars.StarsSubscription starsSubscription2 = (TL_stars.StarsSubscription) arrayList2.get(i3);
                                    int i4 = i3;
                                    long n2 = wf3.n(starsSubscription2.peer);
                                    if (j3 == j) {
                                        j3 = n2;
                                    }
                                    if (n2 >= j) {
                                        TLRPC.User X1 = getMessagesController().X1(Long.valueOf(n2));
                                        if (X1 == null) {
                                            i3 = i4 + 1;
                                        } else {
                                            if (sb2.length() > 0) {
                                                sb2.append(", ");
                                            }
                                            sb2.append(lbc.r(X1));
                                            j7 += starsSubscription2.pricing.amount;
                                            i3 = i4 + 1;
                                        }
                                    } else {
                                        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-n2));
                                        if (M0 == null) {
                                            i3 = i4 + 1;
                                        } else {
                                            if (sb2.length() > 0) {
                                                sb2.append(", ");
                                            }
                                            sb2.append(M0.title);
                                            j7 += starsSubscription2.pricing.amount;
                                            i3 = i4 + 1;
                                        }
                                    }
                                }
                                sb = sb2;
                                j2 = j7;
                            }
                            final String sb3 = sb.toString();
                            this.O1.setOnClickListener(new View.OnClickListener() { // from class: ph3
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    uj3 uj3Var = uj3.this;
                                    new dza(uj3Var.getParentActivity(), uj3Var.getResourceProvider(), j2, 2, sb3, new rg3(uj3Var, (byte) 21), j3).show();
                                }
                            });
                            uk3 uk3Var3 = this.O1;
                            long j8 = j2 - v2.f.amount;
                            if (j8 > j) {
                                j2 = j8;
                            }
                            uk3Var3.b(nza.b1(false, ob6.K("StarsSubscriptionExpiredHintTitle2", (int) j2, ',', sb3), 0.72f, null), ob6.M0(2131744646, null));
                            this.O1.setOnCloseListener(new wg3(this, (byte) 13));
                        }
                        if (this.Y2 != 0 && this.a3 == j && !getMessagesController().N3() && (b = pj0.a(this.currentAccount).b()) != null && !b.c.isEmpty() && !getMessagesController().v3.contains("BIRTHDAY_CONTACTS_TODAY")) {
                            nj0 b7 = pj0.a(this.currentAccount).b();
                            ArrayList arrayList3 = b7.c;
                            this.O1.setOnClickListener(new je3(this, b7, (byte) 6));
                            this.O1.a(this.currentAccount, arrayList3);
                            this.O1.b(pv3.p(hl.N2(arrayList3.size() == 1 ? ob6.a0(null, null, 2131753699, lbc.l((TLRPC.User) arrayList3.get(0))) : ob6.G(arrayList3.size(), "BirthdayTodayMultipleTitle", new Object[0]), aob.I6, 2, null, null), this.O1.c, new ch3(this, b6)), ob6.a0(null, null, arrayList3.size() == 1 ? 2131753700 : 2131753703, new Object[0]));
                            this.O1.setOnCloseListener(new wg3(this, (byte) 14));
                            jxa.v(this.currentAccount, false).U();
                        } else if (this.Y2 != 0 && this.a3 == j && uc7.s1(this.currentAccount).u3.contains("BIRTHDAY_SETUP") && getMessagesController().Y1(getUserConfig().e()) != null && getMessagesController().Y1(getUserConfig().e()).birthday == null) {
                            lv2.r(this.currentAccount).D(false);
                            this.O1.setOnClickListener(new wg3(this, (byte) 15));
                            this.O1.b(pv3.p(ob6.M0(2131753705, null), this.O1.c, new ch3(this, b6)), ob6.a0(null, null, 2131753706, new Object[0]));
                            this.O1.setOnCloseListener(new wg3(this, (byte) 16));
                        } else if (!((uc7.s1(this.currentAccount).M3() && this.Y2 == 0 && this.a3 == j) ? uc7.s1(this.currentAccount).u3.contains("PREMIUM_CHRISTMAS") : false)) {
                            this.O1.setOnClickListener(new y00((byte) 3));
                            this.O1.b(pv3.m(hl.N2(ob6.M0(2131749462, null), aob.I6, 2, null, null), null, false, null, 0), ob6.a0(null, null, 2131753324, new Object[0]));
                            this.O1.setOnCloseListener(new wg3(this, (byte) 17));
                        } else if (!uc7.s1(this.currentAccount).M3() && this.Y2 == 0 && this.a3 == j && uc7.s1(this.currentAccount).u3.contains("PREMIUM_RESTORE") && !getUserConfig().p() && ls6.d0(this.currentAccount).i0(false) != null) {
                            this.O1.setOnClickListener(new wg3(this, (byte) 18));
                            this.O1.b(hl.N2(ob6.a0(null, null, 2131745791, ls6.d0(this.currentAccount).i0(false)), aob.I6, 2, null, null), ob6.M0(2131745792, null));
                        } else if (uc7.s1(this.currentAccount).M3() || this.Y2 != 0 || this.a3 != j || ((!(uc7.s1(this.currentAccount).u3.contains("PREMIUM_UPGRADE") && getUserConfig().p()) && (!uc7.s1(this.currentAccount).u3.contains("PREMIUM_ANNUAL") || getUserConfig().p())) || (!yac.h(this.currentAccount).p() ? ls6.d0(this.currentAccount).i0(false) == null : f11.b() || ls6.d0(this.currentAccount).i0(true) == null))) {
                            if (this.Q1 != null && this.R1 != null) {
                                if (r0.longValue() / this.R1.longValue() < 0.3f) {
                                    uc7.e1().edit().remove("cache_hint_showafter").remove("cache_hint_period").apply();
                                } else if (System.currentTimeMillis() > uc7.e1().getLong("cache_hint_showafter", j)) {
                                    this.O1.setOnClickListener(new wg3(this, (byte) 22));
                                    this.O1.b(hl.N2(ob6.a0(null, null, 2131752013, hl.i0(this.Q1.longValue(), false, false)), aob.I6, 2, null, null), ob6.M0(2131752014, null));
                                }
                            }
                            if (this.Y2 == 0 && this.a3 == 0 && getUserConfig().f() != null && ((getUserConfig().f().photo == null || (getUserConfig().f().photo instanceof TLRPC.TL_userProfilePhotoEmpty)) && uc7.s1(this.currentAccount).u3.contains("USERPIC_SETUP"))) {
                                this.O1.setOnClickListener(new wg3(this, (byte) 23));
                                this.O1.h.setVisibility(0);
                                rb0 rb0Var = new rb0((vnb) null);
                                rb0Var.setBounds(0, 0, hl.L(36.0f), hl.L(36.0f));
                                long e = getUserConfig().e();
                                rb0Var.A = true;
                                rb0Var.b = true;
                                rb0Var.c = false;
                                int i5 = aob.p8[rb0.d(e)];
                                vnb vnbVar = rb0Var.z;
                                rb0Var.d = aob.v0(i5, vnbVar);
                                rb0Var.e = aob.v0(aob.q8[rb0.d(e)], vnbVar);
                                rb0Var.n = (byte) 0;
                                rb0Var.m = false;
                                rb0.a("", "", "", rb0Var.q);
                                rb0Var.K = getParentActivity().getResources().getDrawable(R.drawable.filled_profile_photo_20);
                                this.O1.h.setImageDrawable(rb0Var);
                                this.O1.b(pv3.p(ob6.M0(2131749055, null), this.O1.c, new ch3(this, b6)), ob6.M0(2131749054, null));
                                this.O1.setOnCloseListener(new wg3(this, (byte) 24));
                            } else if (this.Y2 == 0 && this.a3 == 0 && org.telegram.messenger.a.a != null) {
                                for (String str2 : uc7.s1(this.currentAccount).u3) {
                                    org.telegram.messenger.a.a.getClass();
                                }
                            }
                        } else {
                            this.C3 = uc7.s1(this.currentAccount).u3.contains("PREMIUM_UPGRADE");
                            this.O1.setOnClickListener(new wg3(this, (byte) 21));
                            this.O1.b(hl.N2(ob6.a0(null, null, this.C3 ? 2131745662 : 2131743461, ls6.d0(this.currentAccount).i0(false)), aob.I6, 2, null, null), ob6.M0(this.C3 ? 2131743464 : 2131745663, null));
                        }
                    } else if (!v.A) {
                        v.A = true;
                        TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
                        tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
                        tL_getStarsSubscriptions.missing_balance = true;
                        tL_getStarsSubscriptions.offset = "";
                        ConnectionsManager.getInstance(v.a).sendRequest(tL_getStarsSubscriptions, new lwa(v, b4));
                    }
                }
                j = 0;
                if (this.Y2 != 0) {
                }
                if (this.Y2 != 0) {
                }
                if (!((uc7.s1(this.currentAccount).M3() && this.Y2 == 0 && this.a3 == j) ? uc7.s1(this.currentAccount).u3.contains("PREMIUM_CHRISTMAS") : false)) {
                }
            }
            z = true;
            li3Var = this.H3;
            fm0Var = this.b;
            if ((li3Var != null && li3Var.c()) || fm0Var.f) {
                z = false;
            }
            this.L1.j(this.O1, z, true);
            L2(true);
            if (this.fragmentView != null && this.L1 != null) {
                z4 = isInPreviewMode() && this.Y2 == 0 && this.a3 == 0 && this.T0 == 0 && !getMessagesController().R1().b.isEmpty() && ((li3Var3 = this.H3) == null || !li3Var3.c()) && !fm0Var.f;
                if (z4) {
                    if (this.P1 == null) {
                        w8c w8cVar2 = new w8c(getParentActivity());
                        this.P1 = w8cVar2;
                        this.L1.addView(w8cVar2);
                    }
                    w8c w8cVar3 = this.P1;
                    int i6 = this.currentAccount;
                    TextView textView = w8cVar3.c;
                    TextView textView2 = w8cVar3.b;
                    ArrayList arrayList4 = uc7.s1(i6).R1().b;
                    v8c v8cVar = w8cVar3.d;
                    v8cVar.setText(ob6.M0(2131743565, null));
                    v8cVar.a(false, false);
                    v8c v8cVar2 = w8cVar3.e;
                    v8cVar2.setText(ob6.M0(2131743555, null));
                    v8cVar2.a(false, false);
                    if (arrayList4 != null) {
                        if (arrayList4.size() == 1) {
                            t8c t8cVar = (t8c) arrayList4.get(0);
                            boolean z6 = t8cVar.a;
                            String str3 = t8cVar.f;
                            textView2.setText(ob6.M0(z6 ? 2131743545 : 2131743546, null));
                            String valueOf = String.valueOf(t8cVar.e);
                            if (!TextUtils.isEmpty(str3) && !valueOf.isEmpty()) {
                                valueOf = valueOf.concat(", ");
                            }
                            String i7 = c00.i(valueOf, str3);
                            if (t8cVar.a) {
                                textView.setText(ob6.a0(null, null, 2131743547, "@" + wf3.s(t8cVar.c), i7));
                                z5 = true;
                            } else {
                                textView.setText(ob6.a0(null, null, 2131743548, i7));
                                z5 = false;
                            }
                            v8cVar.setOnClickListener(new vl1(this, z5, i6, arrayList4));
                            v8cVar2.setOnClickListener(new ae((Object) w8cVar3, i6, (Object) arrayList4, (byte) 19));
                        } else if (arrayList4.size() > 1) {
                            textView2.setText(ob6.M0(2131743546, null));
                            String str4 = ((t8c) arrayList4.get(0)).f;
                            int i8 = 1;
                            while (true) {
                                if (i8 >= arrayList4.size()) {
                                    str = str4;
                                    break;
                                } else if (!TextUtils.equals(str4, ((t8c) arrayList4.get(i8)).f)) {
                                    break;
                                } else {
                                    i8++;
                                }
                            }
                            if (str == null) {
                                textView.setText(ob6.G(arrayList4.size(), "UnconfirmedAuthMultiple", new Object[0]));
                            } else {
                                textView.setText(ob6.G(arrayList4.size(), "UnconfirmedAuthMultipleFrom", str));
                            }
                        }
                    }
                    z5 = false;
                    v8cVar.setOnClickListener(new vl1(this, z5, i6, arrayList4));
                    v8cVar2.setOnClickListener(new ae((Object) w8cVar3, i6, (Object) arrayList4, (byte) 19));
                }
                w8cVar = this.P1;
                if (w8cVar != null) {
                    this.L1.j(w8cVar, z4, true);
                }
            }
            if (this.fragmentView == null || this.L1 == null) {
                return;
            }
            if (!isInPreviewMode() && this.Y2 == 0 && this.a3 == 0 && this.T0 == 0) {
                ov4 giftAuctionsController = getGiftAuctionsController();
                if (!giftAuctionsController.d) {
                    SharedPreferences sharedPreferences = giftAuctionsController.getMessagesController().X3;
                    if (System.currentTimeMillis() - (sharedPreferences != null ? sharedPreferences.getLong("lastGiftAuctionTimeUpdate", 0L) : 0L) < 86400000) {
                        giftAuctionsController.d = true;
                        TL_payments.TL_getStarGiftActiveAuctions tL_getStarGiftActiveAuctions = new TL_payments.TL_getStarGiftActiveAuctions();
                        ArrayList arrayList5 = new ArrayList();
                        LongSparseArray longSparseArray = giftAuctionsController.b;
                        int size = longSparseArray.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            lv4 lv4Var = (lv4) longSparseArray.valueAt(i9);
                            kv4 kv4Var2 = lv4Var.b;
                            if (kv4Var2 != null && !kv4Var2.f() && (tL_starGiftAuctionState = (kv4Var = lv4Var.b).f) != null && (i = kv4Var.e.bid_date) > 0) {
                                arrayList5.add(Long.valueOf((i << 32) | tL_starGiftAuctionState.version));
                            }
                        }
                        Collections.sort(arrayList5);
                        int size2 = arrayList5.size();
                        long j9 = 0;
                        int i10 = 0;
                        while (i10 < size2) {
                            Object obj = arrayList5.get(i10);
                            i10++;
                            Long l = (Long) obj;
                            j9 = ls6.r(ls6.r(j9, l.longValue() & 4294967295L), l.longValue() >> 32);
                        }
                        tL_getStarGiftActiveAuctions.hash = j9;
                        z2 = false;
                        giftAuctionsController.getConnectionsManager().sendRequestTyped(tL_getStarGiftActiveAuctions, new ic(0 == true ? 1 : 0), new yt4((Object) giftAuctionsController, (byte) 1));
                        if (!giftAuctionsController.c.isEmpty() && (((li3Var2 = this.H3) == null || !li3Var2.c()) && !fm0Var.f)) {
                            z3 = true;
                            if (z3 && this.N1 == null) {
                                m9 m9Var2 = new m9(getParentActivity(), this.currentAccount);
                                this.N1 = m9Var2;
                                this.L1.addView(m9Var2);
                            }
                            m9Var = this.N1;
                            if (m9Var != null) {
                                this.L1.j(m9Var, z3, true);
                                return;
                            }
                            return;
                        }
                    }
                }
                z2 = false;
                if (!giftAuctionsController.c.isEmpty()) {
                    z3 = true;
                    if (z3) {
                        m9 m9Var22 = new m9(getParentActivity(), this.currentAccount);
                        this.N1 = m9Var22;
                        this.L1.addView(m9Var22);
                    }
                    m9Var = this.N1;
                    if (m9Var != null) {
                    }
                }
            } else {
                z2 = false;
            }
            z3 = z2;
            if (z3) {
            }
            m9Var = this.N1;
            if (m9Var != null) {
            }
        }
        z = false;
        li3Var = this.H3;
        fm0Var = this.b;
        if (li3Var != null) {
            z = false;
            this.L1.j(this.O1, z, true);
            L2(true);
            if (this.fragmentView != null) {
                if (isInPreviewMode()) {
                }
                if (z4) {
                }
                w8cVar = this.P1;
                if (w8cVar != null) {
                }
            }
            if (this.fragmentView == null) {
                return;
            } else {
                return;
            }
        }
        z = false;
        this.L1.j(this.O1, z, true);
        L2(true);
        if (this.fragmentView != null) {
        }
        if (this.fragmentView == null) {
        }
    }

    public final int r3() {
        if (this.L) {
            return hl.L(81.0f);
        }
        return 0;
    }

    public final void r4() {
        uc7.s1(this.currentAccount).v4(0L, "BIRTHDAY_SETUP");
        q5();
        v21 K = d31.b0(this).K(R.raw.chats_infotip, ob6.M0(2131753707, null), ob6.M0(2131745223, null), new rg3(this, (byte) 4));
        K.j = 5000;
        K.j();
    }

    public final void r5() {
        gw9 gw9Var;
        qj3 qj3Var;
        try {
            bi3 bi3Var = this.D1;
            if (bi3Var != null && bi3Var.getEditField() != null) {
                this.D1.getEditField().setCursorColor(getThemedColor(aob.Ne));
            }
            NumberTextView numberTextView = this.j1;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(aob.y8));
            }
            ij3 ij3Var = this.A0;
            int i = 0;
            if (ij3Var != null && (ij3Var.getSelectorDrawable() instanceof GradientDrawable)) {
                a aVar = this.actionBar;
                ((GradientDrawable) this.A0.getSelectorDrawable()).setColor(getThemedColor(aVar != null && aVar.z() ? aob.xi : aob.K8));
                this.A0.invalidate();
            }
            a aVar2 = this.actionBar;
            if (aVar2 != null) {
                if (this.Y2 != 0 || this.a3 != 0) {
                    aVar2.L(getThemedColor(aob.Q8), false);
                    this.actionBar.L(getThemedColor(aob.R8), true);
                }
                if (this.actionBar.z()) {
                    this.actionBar.setActionModeOverrideColor(getThemedColor(aob.d6));
                }
                x5();
            }
            if (this.f0 != null) {
                while (true) {
                    tj3[] tj3VarArr = this.f0;
                    if (i >= tj3VarArr.length) {
                        break;
                    }
                    tj3 tj3Var = tj3VarArr[i];
                    if (tj3Var != null && (qj3Var = tj3Var.a) != null) {
                        qj3Var.setGlowColor(getThemedColor(aob.d6));
                    }
                    i++;
                }
            }
            bj3 bj3Var = this.D0;
            if (bj3Var != null && (gw9Var = bj3Var.b0) != null) {
                gw9Var.setGlowColor(getThemedColor(aob.d6));
            }
            di3 di3Var = this.E1;
            if (di3Var != null) {
                di3Var.setScrimViewBackgroundColor(getThemedColor(aob.d6));
            }
            kg5 kg5Var = this.q0;
            if (kg5Var != null) {
                kg5Var.i(getThemedColor(aob.wj));
            }
            kg5 kg5Var2 = this.r0;
            if (kg5Var2 != null) {
                kg5Var2.i(getThemedColor(aob.wj));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final ac7 s3(tj3 tj3Var) {
        if (tj3Var == null) {
            return null;
        }
        int i = tj3Var.s;
        if (i == 7 || i == 8) {
            return getMessagesController().N[tj3Var.s == 8 ? (char) 1 : (char) 0];
        }
        return null;
    }

    public final void s4() {
        uc7.s1(this.currentAccount).v4(0L, "PREMIUM_CHRISTMAS");
        q5();
        v21 G = d31.b0(this).G(R.raw.gift, 4, ob6.M0(2131753323, null));
        G.j = 5000;
        G.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0308  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s5(boolean z, boolean z2) {
        ?? r5;
        int K0;
        ac7 ac7Var;
        boolean z3;
        Object[] objArr;
        boolean z4;
        boolean z5;
        if (this.A0 == null || this.inPreviewMode || this.s3) {
            return;
        }
        li3 li3Var = this.H3;
        if (li3Var == null || !li3Var.c()) {
            fu5 fu5Var = this.M0;
            String str = null;
            if (fu5Var != null) {
                fu5Var.u();
                this.M0 = null;
            }
            ArrayList T0 = getMessagesController().T0();
            int size = T0.size();
            fm0 fm0Var = this.r;
            boolean z6 = false;
            if (size <= 1) {
                r5 = 0;
                if (this.A0.getVisibility() != 8) {
                    this.A0.setIsEditing(false);
                    d5(false);
                    this.p3 = false;
                    if (this.o3) {
                        this.o3 = false;
                        this.f0[0].setTranslationX(0.0f);
                        this.f0[1].setTranslationX(r2[0].getMeasuredWidth());
                    }
                    if (this.f0[0].h != this.A0.getDefaultTabId()) {
                        this.f0[0].h = this.A0.getDefaultTabId();
                        yh3 yh3Var = this.f0[0].d;
                        yh3Var.h = 0;
                        yh3Var.f();
                        tj3 tj3Var = this.f0[0];
                        tj3Var.s = this.T0;
                        tj3Var.d.f();
                    }
                    this.f0[1].setVisibility(8);
                    tj3 tj3Var2 = this.f0[1];
                    tj3Var2.h = 0;
                    yh3 yh3Var2 = tj3Var2.d;
                    yh3Var2.h = 0;
                    yh3Var2.f();
                    tj3 tj3Var3 = this.f0[1];
                    tj3Var3.s = this.T0;
                    tj3Var3.d.f();
                    this.x = false;
                    if (this.fragmentView != null) {
                        boolean z7 = (this.isPaused || this.X3 != null) ? false : z2;
                        if (!this.s3) {
                            fm0Var.a(false, z7);
                        }
                    }
                    int i = 0;
                    while (true) {
                        tj3[] tj3VarArr = this.f0;
                        if (i >= tj3VarArr.length) {
                            break;
                        }
                        tj3 tj3Var4 = tj3VarArr[i];
                        if (tj3Var4.s == 0 && tj3Var4.w == 2 && y3() && ((K0 = this.f0[i].c.K0()) == 0 || K0 == 1)) {
                            this.f0[i].c.g1(1, (int) this.O);
                        }
                        this.f0[i].a.setScrollingTouchSlop(0);
                        this.f0[i].a.requestLayout();
                        this.f0[i].requestLayout();
                        i++;
                    }
                    this.A0.M = -1;
                    r5 = 0;
                }
            } else if (z || this.A0.getVisibility() != 0) {
                boolean z8 = this.A0.getVisibility() != 0 ? false : z2;
                this.x = true;
                boolean isEmpty = this.A0.h.isEmpty();
                if (this.fragmentView != null) {
                    boolean z9 = (this.isPaused || this.X3 != null) ? false : z2;
                    if (!this.s3) {
                        fm0Var.a(this.x, z9);
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
                ij3 ij3Var = this.A0;
                ij3Var.h.clear();
                ij3Var.l0.clear();
                ij3Var.n0.clear();
                ij3Var.o0.clear();
                ij3Var.p0.clear();
                ij3Var.q0.clear();
                ij3Var.N = 0;
                int size2 = T0.size();
                int i2 = 0;
                while (i2 < size2) {
                    if (((ac7) T0.get(i2)).d()) {
                        this.A0.b(i2, 0, ob6.M0(2131750772, str), null, false, true, ((ac7) T0.get(i2)).p);
                        z5 = z6;
                    } else {
                        ac7 ac7Var2 = (ac7) T0.get(i2);
                        z5 = z6;
                        this.A0.b(i2, ac7Var2.o, ac7Var2.b, ac7Var2.c, ac7Var2.n, false, ((ac7) T0.get(i2)).p);
                    }
                    i2++;
                    z6 = z5;
                    str = null;
                }
                boolean z10 = z6;
                if (currentTabStableId >= 0) {
                    if (objArr != false && !this.A0.k(currentTabStableId)) {
                        while (true) {
                            if (currentTabId < 0) {
                                currentTabId = z10 ? 1 : 0;
                                break;
                            }
                            ij3 ij3Var2 = this.A0;
                            if (ij3Var2.k(ij3Var2.m0.get(currentTabId, -1))) {
                                break;
                            } else {
                                currentTabId--;
                            }
                        }
                    }
                    if (this.A0.m0.get(this.f0[z10 ? 1 : 0].h, -1) != currentTabStableId) {
                        this.f0[z10 ? 1 : 0].h = currentTabId;
                        isEmpty = true;
                    }
                }
                int i3 = z10 ? 1 : 0;
                while (true) {
                    tj3[] tj3VarArr2 = this.f0;
                    if (i3 >= tj3VarArr2.length) {
                        break;
                    }
                    if (tj3VarArr2[i3].h >= T0.size()) {
                        this.f0[i3].h = T0.size() - 1;
                    }
                    this.f0[i3].a.setScrollingTouchSlop(1);
                    i3++;
                }
                ij3 ij3Var3 = this.A0;
                ij3Var3.G.setItemAnimator(z8 ? ij3Var3.u0 : null);
                ij3Var3.J.f();
                if (isEmpty) {
                    n5(z10);
                }
                ij3 ij3Var4 = this.A0;
                int currentTabId2 = ij3Var4.getCurrentTabId();
                ArrayList arrayList = ij3Var4.h;
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        z4 = false;
                        break;
                    } else {
                        if (((bg4) arrayList.get(i4)).a == currentTabId2) {
                            z4 = ((bg4) arrayList.get(i4)).f;
                            break;
                        }
                        i4++;
                    }
                }
                if (z4) {
                    ij3 ij3Var5 = this.A0;
                    ArrayList arrayList2 = ij3Var5.h;
                    if (!arrayList2.isEmpty()) {
                        r5 = 0;
                        ij3Var5.i((bg4) arrayList2.get(0), 0);
                    }
                }
                r5 = 0;
            } else {
                r5 = 0;
            }
            p5(r5);
            int i5 = this.f0[r5].s;
            if ((i5 == 7 || i5 == 8) && (ac7Var = getMessagesController().N[i5 - 7]) != null) {
                for (int i6 = 0; i6 < T0.size(); i6++) {
                    ac7 ac7Var3 = (ac7) T0.get(i6);
                    if (ac7Var3 == null || ac7Var3.a != ac7Var.a) {
                    }
                }
                z3 = false;
                n5(false);
                F5(-1, this.A0.getVisibility() != 0 ? z3 : true);
            }
            z3 = false;
            F5(-1, this.A0.getVisibility() != 0 ? z3 : true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void setInPreviewMode(boolean z) {
        super.setInPreviewMode(z);
        ii3 ii3Var = this.F0;
        if (ii3Var != null) {
            if (!this.H0 || z) {
                ii3Var.setVisibility(8);
            } else {
                ii3Var.setVisibility(0);
            }
        }
        v5(true);
        q5();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r2 != r3) goto L12;
     */
    @Override // org.telegram.ui.ActionBar.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTitleOverlayText(String str, int i, Runnable runnable) {
        ni3 ni3Var;
        ul ulVar;
        super.setTitleOverlayText(str, i, runnable);
        if (this.actionBar != null && (ni3Var = this.N0) != null && (ni3Var.getContentView() instanceof n1a)) {
            ema titleTextView = this.actionBar.getTitleTextView();
            n1a n1aVar = (n1a) this.N0.getContentView();
            if (titleTextView != null) {
                Drawable rightDrawable = titleTextView.getRightDrawable();
                ulVar = this.F3;
            }
            ulVar = null;
            n1aVar.y(ulVar, titleTextView);
        }
        ii3 ii3Var = this.F0;
        if (ii3Var != null) {
            in inVar = ii3Var.U;
            ii3Var.V.a(i == 2131751770 ? hl.E2(ob6.M0(2131743766, null), true, hl.L(2.6666667f), hl.L(2.0f)) : null, true);
            if (str != null) {
                ii3Var.h0 = true;
                if (ii3Var.i0 != i) {
                    ii3Var.i0 = i;
                    inVar.c(ob6.M0(i, str), !ob6.a0, true);
                }
            } else {
                ii3Var.h0 = false;
                ii3Var.i0 = 0;
                inVar.c(ii3Var.g0, !ob6.a0, true);
            }
            ii3Var.a.a(ii3Var.h0, true);
            ii3Var.M0.F(inVar);
        }
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        if (i == 1) {
            Y2();
            a3();
            d3();
            Q2();
            b3();
            hj3 hj3Var = this.Y;
            fm0 fm0Var = this.b;
            hj3Var.setBlurredBackgroundVisibility(fm0Var.e);
            float a = qke.a(fm0Var.e);
            de0 de0Var = this.d3;
            if (de0Var != null) {
                de0Var.setScaleX(a);
                this.d3.setScaleY(a);
                this.d3.setAlpha(a);
                this.d3.setVisibility(a > 0.0f ? 0 : 8);
            }
            if (this.w0 != null) {
                float R1 = hl.R1(0.9f, 1.0f, a);
                this.w0.setScaleX(R1);
                this.w0.setScaleY(R1);
                this.w0.setAlpha(a);
                this.w0.setVisibility(a > 0.0f ? 0 : 8);
                this.x0.setAlpha(a);
                this.x0.setVisibility(a > 0.0f ? 0 : 8);
                return;
            }
            return;
        }
        if (i == 2) {
            Y2();
            a3();
            return;
        }
        if (i == 3) {
            W2();
            return;
        }
        if (i == 4) {
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
                return;
            }
            return;
        }
        if (i == 5) {
            V2();
            return;
        }
        if (i == 6) {
            Y2();
            a3();
        } else {
            if (i == 7) {
                R2();
                return;
            }
            if (i == 8) {
                Q2();
                b3();
            } else if (i == 9) {
                b3();
            }
        }
    }

    public final float t3() {
        li3 li3Var = this.H3;
        if (li3Var == null || !li3Var.c()) {
            return 0.0f;
        }
        return this.H3.e;
    }

    public final /* synthetic */ void t4() {
        uc7.s1(this.currentAccount).v4(0L, "PREMIUM_RESTORE");
        q5();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t5(boolean z, ArrayList arrayList, ArrayList arrayList2, boolean z2, boolean z3) {
        bj3 bj3Var;
        boolean z4;
        uic uicVar;
        if (!this.s3 || this.n2 || (bj3Var = this.D0) == null) {
            return;
        }
        ArrayList<ph4> currentSearchFilters = bj3Var.getCurrentSearchFilters();
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        for (int i = 0; i < currentSearchFilters.size(); i++) {
            if (currentSearchFilters.get(i).a()) {
                z6 = true;
            } else if (currentSearchFilters.get(i).d == 4) {
                z7 = true;
            } else if (currentSearchFilters.get(i).d == 6) {
                z8 = true;
            } else if (currentSearchFilters.get(i).d == 7) {
                z5 = true;
            }
        }
        if (z5) {
            z2 = false;
        }
        boolean z9 = !(arrayList == null || arrayList.isEmpty()) || !(arrayList2 == null || arrayList2.isEmpty()) || z2;
        if ((z6 || z9 || !z) && z9) {
            if (arrayList == null || arrayList.isEmpty() || z7) {
                arrayList = null;
            }
            if (arrayList2 == null || arrayList2.isEmpty() || z8) {
                arrayList2 = null;
            }
            if (arrayList != null || arrayList2 != null || z2) {
                this.c0.E1(arrayList, arrayList2, z2);
                z4 = true;
                if (!z4) {
                    this.c0.E1(null, null, false);
                }
                if (!z3) {
                    this.c0.getAdapter().f();
                }
                uicVar = this.b0;
                if (uicVar != null) {
                    uicVar.b(z4, true);
                }
                this.c0.setEnabled(z4);
                this.s.a(z4, true);
            }
        }
        z4 = false;
        if (!z4) {
        }
        if (!z3) {
        }
        uicVar = this.b0;
        if (uicVar != null) {
        }
        this.c0.setEnabled(z4);
        this.s.a(z4, true);
    }

    public final float u3() {
        return -hl.U1(this.b.e, hl.L(4.0f), hl.L(48.0f));
    }

    public final /* synthetic */ void u4() {
        uc7.s1(this.currentAccount).v4(0L, this.C3 ? "PREMIUM_UPGRADE" : "PREMIUM_ANNUAL");
        q5();
    }

    public final void u5() {
        float f = (((-this.m4) - this.p4) - this.w1) - this.x1;
        zp4 zp4Var = this.u0;
        if (zp4Var != null) {
            zp4Var.setTranslationY(f);
        }
        zp4 zp4Var2 = this.v0;
        if (zp4Var2 != null) {
            zp4Var2.setTranslationY(f - hl.L(52.0f));
            kg5 kg5Var = this.q0;
            if (kg5Var != null) {
                kg5Var.setTranslationY(f - hl.L(52.0f));
            }
        }
    }

    @Override // ej6
    public final void v() {
        R4(true, true);
    }

    @Override // s84
    public final void v0(float f, int i) {
        s7 s7Var;
        if (i != 3 || (s7Var = this.m0) == null) {
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) s7Var.getIconView().getDrawable();
        if (!this.d.f) {
            animatedVectorDrawable.reset();
            return;
        }
        animatedVectorDrawable.start();
        if (xea.o() != 0) {
            TLRPC.TL_help_premiumPromo tL_help_premiumPromo = ls6.d0(this.currentAccount).E;
            String o0 = PremiumPreviewFragment.o0(2);
            if (tL_help_premiumPromo != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= tL_help_premiumPromo.video_sections.size()) {
                        i2 = -1;
                        break;
                    } else if (tL_help_premiumPromo.video_sections.get(i2).equals(o0)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 != -1) {
                    xb4.G(this.currentAccount).X(tL_help_premiumPromo.videos.get(i2), tL_help_premiumPromo, 3, 0);
                }
            }
        }
    }

    public final c6b v3() {
        return getMessagesController().O1();
    }

    public final /* synthetic */ void v4() {
        uc7.s1(this.currentAccount).v4(0L, "USERPIC_SETUP");
        q5();
    }

    public final void v5(boolean z) {
        boolean z2 = this.n2;
        boolean z3 = (!z2 || this.T0 == 10) && this.Y2 == 0 && this.a3 == 0 && !this.inPreviewMode && (!this.l2 || z2) && !this.a4;
        zp4 zp4Var = this.u0;
        if (zp4Var != null) {
            zp4Var.e(z3, z);
        }
        zp4 zp4Var2 = this.v0;
        if (zp4Var2 != null) {
            zp4Var2.e(z3, z);
        }
    }

    public final UndoView w3() {
        j3();
        UndoView[] undoViewArr = this.z0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.d(2, true);
            nj3 nj3Var = (nj3) this.fragmentView;
            nj3Var.removeView(undoViewArr[0]);
            nj3Var.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w4() {
        boolean e;
        int i;
        int size;
        int i2;
        int i3;
        float f;
        int i4;
        tj3 tj3Var;
        if (this.T0 != 0) {
            return;
        }
        ch3 ch3Var = this.Q3;
        hl.r(ch3Var);
        hl.d3(ch3Var, 500L);
        tj3[] tj3VarArr = this.f0;
        ActionBarLayout actionBarLayout = null;
        int i5 = 0;
        qj3 qj3Var = (tj3VarArr == null || (tj3Var = tj3VarArr[0]) == null) ? null : tj3Var.a;
        if (hl.O1() && (getParentActivity() instanceof LaunchActivity)) {
            actionBarLayout = ((LaunchActivity) getParentActivity()).r0;
        }
        u8a u8aVar = this.P3;
        if (qj3Var != null && !this.s3 && qj3Var.getScrollState() == 0) {
            ma4 ma4Var = ea4.a;
            if (getParentLayout() != null) {
                for (e eVar : getParentLayout().getFragmentStack()) {
                    if ((eVar instanceof fj6) && ((fj6) eVar).b0() == this) {
                        e = ea4.e(eVar) && !ea4.b(this);
                        if (e && (actionBarLayout == null || actionBarLayout.getLastFragment() == null)) {
                            ArrayList arrayList = new ArrayList();
                            float paddingTop = qj3Var.getPaddingTop() + this.O;
                            float height = qj3Var.getHeight() - qj3Var.getPaddingBottom();
                            i = 0;
                            while (i < qj3Var.getChildCount()) {
                                View childAt = qj3Var.getChildAt(i);
                                if ((childAt instanceof of3) && childAt.getY() >= paddingTop && childAt.getY() + childAt.getHeight() <= height) {
                                    long dialogId = ((of3) childAt).getDialogId();
                                    TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(dialogId);
                                    if (dialog != null && dialog.unread_count > 0) {
                                        f = height;
                                        if (xc2.V(getMessagesController().M0(Long.valueOf(-dialogId)))) {
                                            int i6 = dialog.top_message;
                                            ArrayList arrayList2 = (ArrayList) getMessagesController().S.f(dialogId);
                                            if (arrayList2 != null) {
                                                int size2 = arrayList2.size();
                                                int i7 = i5;
                                                while (i7 < size2) {
                                                    Object obj = arrayList2.get(i7);
                                                    i7++;
                                                    r47 r47Var = (r47) obj;
                                                    if (r47Var.e1() > 0) {
                                                        i4 = i5;
                                                        i6 = Math.min(i6, r47Var.e1());
                                                    } else {
                                                        i4 = i5;
                                                    }
                                                    i5 = i4;
                                                }
                                            }
                                            i3 = i5;
                                            long y = (long) childAt.getY();
                                            long[] jArr = new long[3];
                                            jArr[i3] = dialogId;
                                            jArr[1] = i6;
                                            jArr[2] = y;
                                            arrayList.add(jArr);
                                        } else {
                                            i3 = i5;
                                        }
                                        i++;
                                        height = f;
                                        i5 = i3;
                                    }
                                }
                                i3 = i5;
                                f = height;
                                i++;
                                height = f;
                                i5 = i3;
                            }
                            int i8 = i5;
                            Object obj2 = u8aVar.a;
                            long uptimeMillis = SystemClock.uptimeMillis();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            size = arrayList.size();
                            i2 = i8;
                            while (i2 < size) {
                                Object obj3 = arrayList.get(i2);
                                i2++;
                                long[] jArr2 = (long[]) obj3;
                                long[] jArr3 = (long[]) ((LinkedHashMap) u8aVar.d).remove(jArr2[i8] + ":" + jArr2[1]);
                                if (jArr3 != null && jArr3[2] != jArr2[2]) {
                                    u8aVar.n(jArr3, uptimeMillis);
                                }
                                String str = jArr2[i8] + ":" + jArr2[1];
                                if (jArr3 == null || jArr3[2] != jArr2[2]) {
                                    jArr3 = new long[4];
                                    jArr3[i8] = jArr2[i8];
                                    jArr3[1] = jArr2[1];
                                    jArr3[2] = jArr2[2];
                                    jArr3[3] = uptimeMillis;
                                }
                                linkedHashMap.put(str, jArr3);
                            }
                            u8aVar.A();
                            u8aVar.d = linkedHashMap;
                            return;
                        }
                    }
                }
            }
            e = ea4.e(this);
            if (e) {
                ArrayList arrayList3 = new ArrayList();
                float paddingTop2 = qj3Var.getPaddingTop() + this.O;
                float height2 = qj3Var.getHeight() - qj3Var.getPaddingBottom();
                i = 0;
                while (i < qj3Var.getChildCount()) {
                }
                int i82 = i5;
                Object obj22 = u8aVar.a;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                size = arrayList3.size();
                i2 = i82;
                while (i2 < size) {
                }
                u8aVar.A();
                u8aVar.d = linkedHashMap2;
                return;
            }
        }
        u8aVar.A();
    }

    public final void w5(boolean z, boolean z2) {
        boolean z3;
        if (this.o0 != null) {
            s7 s7Var = this.n0;
            if (s7Var == null || s7Var.getVisibility() != 0) {
                int i = 0;
                while (true) {
                    if (i >= getDownloadController().H.size()) {
                        z3 = false;
                        break;
                    } else {
                        if (getFileLoader().S(((r47) getDownloadController().H.get(i)).S0())) {
                            z3 = true;
                            break;
                        }
                        i++;
                    }
                }
                if (getDownloadController().J.size() > 0 || z3 || (this.h0.getVisibility() == 0 && this.h0.getAlpha() == 1.0f && !z2)) {
                    this.j0 = true;
                } else {
                    this.j0 = false;
                }
                T2();
                boolean z4 = org.telegram.messenger.a.b.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i2 = this.f2;
                boolean z5 = i2 == 3 || i2 == 5;
                this.p0.setSubtext(ob6.M0(z4 ? z5 ? 2131748362 : 2131748361 : 2131748360, null));
                this.o0.b(z4, z5, z);
            }
        }
    }

    public final ac7 x3() {
        tj3[] tj3VarArr = this.f0;
        if (tj3VarArr != null && tj3VarArr[0] != null) {
            ArrayList T0 = getMessagesController().T0();
            int i = this.U3;
            if (i < 0) {
                i = this.f0[0].h;
            }
            if (i >= 0 && i < T0.size()) {
                return (ac7) T0.get(i);
            }
        }
        return null;
    }

    public final void x5() {
        if (!this.u3 || this.actionBar == null) {
            return;
        }
        int themedColor = getThemedColor((this.Y2 == 0 && this.a3 == 0) ? aob.v8 : aob.O8);
        a aVar = this.actionBar;
        int i = aob.y8;
        aVar.H(vm2.f(this.z1, themedColor, getThemedColor(i)), false);
        this.actionBar.H(vm2.f(this.z1, getThemedColor(i), getThemedColor(i)), true);
        this.actionBar.G(vm2.f(this.z1, getThemedColor((this.Y2 == 0 && this.a3 == 0) ? aob.t8 : aob.N8), getThemedColor(aob.z8)), false);
    }

    public final boolean y3() {
        if (this.n2 || this.T0 != 0 || this.a3 != 0 || this.Y2 != 0) {
            return false;
        }
        uc7 messagesController = getMessagesController();
        messagesController.getClass();
        return xea.m1 && messagesController.R.f(2305843009213693953L) != null;
    }

    public final void y4(long j) {
        long j2 = j;
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(j2);
        int i = 0;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            ArrayList arrayList = (ArrayList) getMessagesController().x.f(dialog.community_id);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                y4(((TLRPC.Dialog) obj).id);
            }
            return;
        }
        int i2 = -1;
        if ((!this.actionBar.z() || this.actionBar.A(null)) && H4(this.f0[0], dialog)) {
            U4(true, true);
            I2();
            if (this.T1 != null) {
                int i3 = 0;
                while (true) {
                    if (i3 >= this.T1.size()) {
                        break;
                    }
                    if (((TLRPC.Dialog) this.T1.get(i3)).id == j2) {
                        i2 = i3;
                        break;
                    }
                    i3++;
                }
                if (i2 < 0) {
                    U4(false, false);
                }
            }
        }
        int i4 = i2;
        if (getMessagesController().v2(j2) || getMessagesController().C2(j2)) {
            uc7 messagesController = getMessagesController();
            jf7 messagesStorage = messagesController.getMessagesStorage();
            y97 y97Var = new y97(messagesController, j2);
            to3 to3Var = messagesStorage.a;
            ue2 ue2Var = new ue2((Object) messagesStorage, j2, (Object) y97Var, (byte) 5);
            j2 = j2;
            to3Var.c(ue2Var);
        }
        getMessagesController().w3(j2, 0L);
        uc7 messagesController2 = getMessagesController();
        int i5 = dialog.top_message;
        messagesController2.r3(j2, i5, i5, dialog.last_message_date, false, 0L, 0, true, 0);
        if (i4 >= 0) {
            this.T1.remove(i4);
            this.f0[0].y.D();
            this.f0[0].b(true);
        }
    }

    public final void y5() {
        sea seaVar;
        bi3 bi3Var = this.D1;
        ArrayList arrayList = this.K2;
        if (bi3Var == null) {
            if (this.T0 == 10) {
                B3(arrayList.isEmpty());
                return;
            }
            return;
        }
        this.n.a(!arrayList.isEmpty(), true);
        z5();
        if (arrayList.isEmpty()) {
            String M0 = ob6.M0((this.T0 == 3 && this.h2 == null) ? 2131750535 : 2131745397, null);
            boolean z = this.W3;
            boolean isEmpty = arrayList.isEmpty();
            a aVar = this.actionBar;
            if (z == isEmpty) {
                aVar.setTitle(M0);
            } else {
                aVar.N(M0, true, 350L, k43.h);
            }
            if (this.D1.getTag() != null) {
                this.D1.O0(false, false, false);
                this.D1.U();
                this.D1.setTag(null);
                this.fragmentView.requestLayout();
            }
        } else {
            if (this.D1.getTag() == null) {
                if (!z3() && this.G2 == null) {
                    this.D1.setFieldText("");
                }
                this.D1.setTag(1);
                if (!this.c4 && (seaVar = this.I2) != null) {
                    this.c4 = true;
                    String M02 = ob6.M0(2131745157, null);
                    seaVar.j();
                    seaVar.G = M02;
                    ((ema) seaVar.a[0].f).l(M02, false);
                    ux9 ux9Var = new ux9(seaVar, (byte) 20);
                    seaVar.H = ux9Var;
                    hl.d3(ux9Var, 1000L);
                }
            }
            this.E1.g(Math.max(1, arrayList.size()), true);
            int i = this.U0 + (!TextUtils.isEmpty(this.D1.getFieldText()) ? 1 : 0);
            int size = arrayList.size();
            int i2 = 0;
            long j = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                long longValue = ((Long) obj).longValue();
                long M1 = getMessagesController().M1(longValue);
                if (M1 <= 0 && longValue > 0) {
                    M1 = wf3.j(getMessagesController().P2(longValue));
                }
                j += M1;
            }
            this.E1.i(i, j, true);
            this.D1.K2();
            boolean z2 = this.W3;
            boolean isEmpty2 = arrayList.isEmpty();
            a aVar2 = this.actionBar;
            if (z2 == isEmpty2) {
                aVar2.setTitle(ob6.G(arrayList.size(), "Recipient", new Object[0]));
            } else {
                aVar2.N(ob6.G(arrayList.size(), "Recipient", new Object[0]), false, 350L, k43.h);
            }
        }
        this.W3 = arrayList.isEmpty();
    }

    public final boolean z3() {
        ArrayList arrayList = this.F2;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r1.booleanValue() == (xc2.K(r6, false) != null)) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean z4(TLRPC.Chat chat, TLRPC.User user) {
        Boolean bool;
        Boolean bool2;
        if (chat != null) {
            boolean V = xc2.V(chat);
            TLRPC.RequestPeerType requestPeerType = this.H;
            if (V == (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) && (((bool = requestPeerType.creator) == null || !bool.booleanValue() || chat.creator) && ((bool2 = this.H.bot_participant) == null || !bool2.booleanValue() || getMessagesController().z2(chat, user) || xc2.b(chat)))) {
                Boolean bool3 = this.H.has_username;
                if (bool3 != null) {
                }
                Boolean bool4 = this.H.forum;
                if ((bool4 == null || bool4.booleanValue() == xc2.c0(chat)) && ((this.H.user_admin_rights == null || getMessagesController().C3(chat, getUserConfig().f(), this.H.user_admin_rights)) && (this.H.bot_admin_rights == null || getMessagesController().C3(chat, user, this.H.bot_admin_rights) || xc2.w(4, chat)))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void z5() {
        sea seaVar = this.I2;
        if (seaVar != null) {
            int i = this.currentAccount;
            seaVar.h(i);
            seaVar.d = yac.h(k5.a(i).a).e();
            ArrayList arrayList = seaVar.f;
            arrayList.clear();
            ArrayList arrayList2 = this.K2;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            yv3 yv3Var = seaVar.a[0];
            if (seaVar.b == 1) {
                ((ema) yv3Var.e).l(seaVar.c(yv3Var), false);
            }
        }
    }

    @Override // ej6
    public final void F() {
    }
}
