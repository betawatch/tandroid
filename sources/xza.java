// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xza extends d implements jm7 {
    public boolean A0;
    public boolean B0;
    public kza C0;
    public z3b D0;
    public jza E;
    public int E0;
    public jza F;
    public final zka F0;
    public jza G;
    public e7a G0;
    public tza H;
    public PorterDuffColorFilter H0;
    public jza I;
    public int I0;
    public jza J;
    public jza K;
    public jza L;
    public jza M;
    public jza N;
    public final ArrayList O;
    public final ArrayList P;
    public final ArrayList Q;
    public final ArrayList R;
    public z82 S;
    public wya T;
    public u46 U;
    public final ir V;
    public s09 W;
    public bza X;
    public xya Y;
    public wza Z;
    public TLRPC.ChatFull a;
    public mg0 a0;
    public final long b;
    public LinearLayout b0;
    public boolean c;
    public final boolean c0;
    public jza d;
    public final boolean d0;
    public jza e;
    public final boolean e0;
    public sza f;
    public long f0;
    public long g0;
    public jza h;
    public final he[] h0;
    public uya i0;
    public sh1 j0;
    public ik1 k0;
    public View l0;
    public FrameLayout m0;
    public jza n;
    public fn0 n0;
    public final boolean o0;
    public ej6 p0;
    public FrameLayout q0;
    public jza r;
    public qz4[] r0;
    public jza s;
    public int s0;
    public final SparseIntArray t0;
    public final SparseIntArray u0;
    public final ArrayList v0;
    public jza w;
    public final ArrayList w0;
    public jza x;
    public final ArrayList x0;
    public jza y;
    public final ArrayList y0;
    public final ArrayList z0;

    public xza(Bundle bundle) {
        super(bundle);
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.V = new ir(50);
        this.h0 = new he[1];
        this.s0 = -1;
        this.t0 = new SparseIntArray();
        this.u0 = new SparseIntArray();
        this.v0 = new ArrayList();
        this.w0 = new ArrayList();
        this.x0 = new ArrayList();
        this.y0 = new ArrayList();
        this.z0 = new ArrayList();
        this.B0 = true;
        this.F0 = new zka((Object) this, (byte) 2);
        long j = bundle.getLong("chat_id");
        this.b = j;
        this.c0 = bundle.getBoolean("is_megagroup", false);
        this.d0 = bundle.getBoolean("start_from_boosts", false);
        this.e0 = bundle.getBoolean("start_from_monetization", false);
        this.o0 = bundle.getBoolean("only_boosts", false);
        this.a = getMessagesController().M0(j);
    }

    public static d e0(TLRPC.Chat chat, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z);
        TLRPC.ChatFull M0 = oc7.r1(z8c.t0).M0(chat.id);
        return (M0 == null || !(M0.can_view_stats || M0.can_view_stars_revenue)) ? new lp0(-chat.id) : new xza(bundle);
    }

    public static nl1 f0(JSONObject jSONObject, int i, boolean z) {
        if (i == 0) {
            return new nl1(jSONObject);
        }
        if (i == 1) {
            return new lq3(jSONObject);
        }
        if (i == 2) {
            ioa ioaVar = new ioa(jSONObject);
            int length = ((ml1) ioaVar.d.get(0)).a.length;
            int size = ioaVar.d.size();
            ioaVar.l = new long[length];
            int i2 = 0;
            while (true) {
                long[] jArr = ioaVar.l;
                if (i2 >= length) {
                    ioaVar.m = new mj4(jArr);
                    return ioaVar;
                }
                jArr[i2] = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    long[] jArr2 = ioaVar.l;
                    jArr2[i2] = jArr2[i2] + ((ml1) ioaVar.d.get(i3)).a[i2];
                }
                i2++;
            }
        } else {
            if (i != 4) {
                return null;
            }
            moa moaVar = new moa(jSONObject);
            if (z) {
                long[] jArr3 = new long[moaVar.d.size()];
                int[] iArr = new int[moaVar.d.size()];
                long j = 0;
                for (int i4 = 0; i4 < moaVar.d.size(); i4++) {
                    int length2 = moaVar.a.length;
                    for (int i5 = 0; i5 < length2; i5++) {
                        long j2 = ((ml1) moaVar.d.get(i4)).a[i5];
                        jArr3[i4] = jArr3[i4] + j2;
                        if (j2 == 0) {
                            iArr[i4] = iArr[i4] + 1;
                        }
                    }
                    j += jArr3[i4];
                }
                ArrayList arrayList = new ArrayList();
                for (int i6 = 0; i6 < moaVar.d.size(); i6++) {
                    if (jArr3[i6] / j < 0.01d && iArr[i6] > moaVar.a.length / 2.0f) {
                        arrayList.add((ml1) moaVar.d.get(i6));
                    }
                }
                int size2 = arrayList.size();
                int i7 = 0;
                while (i7 < size2) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    moaVar.d.remove((ml1) obj);
                }
            }
            int length3 = ((ml1) moaVar.d.get(0)).a.length;
            int size3 = moaVar.d.size();
            moaVar.l = new long[length3];
            int i8 = 0;
            while (true) {
                long[] jArr4 = moaVar.l;
                if (i8 >= length3) {
                    new mj4(jArr4);
                    return moaVar;
                }
                jArr4[i8] = 0;
                for (int i9 = 0; i9 < size3; i9++) {
                    long[] jArr5 = moaVar.l;
                    jArr5[i8] = jArr5[i8] + ((ml1) moaVar.d.get(i9)).a[i8];
                }
                i8++;
            }
        }
    }

    public static jza g0(TL_stats.StatsGraph statsGraph, String str, int i, boolean z) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        jza jzaVar = new jza(str, i);
        jzaVar.m = z;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                nl1 f0 = f0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i, z);
                jzaVar.d = f0;
                if (f0 != null) {
                    f0.h = statsGraph.rate;
                }
                jzaVar.g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (f0 == null || (jArr2 = f0.a) == null || jArr2.length < 2) {
                    jzaVar.l = true;
                }
                if (i == 4 && f0 != null && (jArr = f0.a) != null && jArr.length > 0) {
                    long j = jArr[jArr.length - 1];
                    jzaVar.e = new moa(f0, j);
                    jzaVar.c = j;
                    return jzaVar;
                }
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            jzaVar.f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return jzaVar;
    }

    public static void n0(jza jzaVar, ArrayList arrayList, bnb bnbVar) {
        nl1 nl1Var;
        if (jzaVar == null || (nl1Var = jzaVar.d) == null) {
            return;
        }
        ArrayList arrayList2 = nl1Var.d;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ml1 ml1Var = (ml1) obj;
            int i2 = ml1Var.g;
            if (i2 >= 0) {
                if (!cmb.d1(i2)) {
                    cmb.y1(ml1Var.g, cmb.I == cmb.J ? ml1Var.i : ml1Var.h, false);
                    cmb.gm[ml1Var.g] = ml1Var.h;
                }
                arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, bnbVar, ml1Var.g));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.o7));
        hashSet.add(Integer.valueOf(cmb.u6));
        hashSet.add(Integer.valueOf(cmb.t6));
        hashSet.add(Integer.valueOf(cmb.l6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.hk));
        hashSet.add(Integer.valueOf(cmb.w6));
        hashSet.add(Integer.valueOf(cmb.a7));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.g5));
        hashSet.add(Integer.valueOf(cmb.Tj));
        hashSet.add(Integer.valueOf(cmb.Sj));
        hashSet.add(Integer.valueOf(cmb.Rj));
        hashSet.add(Integer.valueOf(cmb.Qj));
        hashSet.add(Integer.valueOf(cmb.Pj));
        hashSet.add(Integer.valueOf(cmb.Oj));
        hashSet.add(Integer.valueOf(cmb.i5));
        hashSet.add(Integer.valueOf(cmb.z6));
    }

    public final void c0() {
        wza wzaVar = this.Z;
        if (wzaVar != null) {
            wzaVar.b = true;
        }
        int childCount = this.T.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.T.getChildAt(i);
            if (childAt instanceof iza) {
                ((iza) childAt).b.u0.d(false, true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        FrameLayout frameLayout;
        int i;
        xza xzaVar = this;
        byte b = 1;
        xzaVar.setHasOwnBackground(true);
        xzaVar.a0 = new mg0((ylb) null);
        oc7 r1 = oc7.r1(xzaVar.currentAccount);
        long j = xzaVar.b;
        TLRPC.Chat L0 = r1.L0(Long.valueOf(j));
        TLRPC.ChatFull M0 = oc7.r1(xzaVar.currentAccount).M0(j);
        boolean z = M0 != null && M0.can_view_stats;
        boolean R = sd2.R(L0);
        boolean z2 = M0 != null && (M0.can_view_revenue || M0.can_view_stars_revenue);
        ArrayList arrayList = new ArrayList(3);
        if (z) {
            arrayList.add(qz4.c(context, xzaVar.resourceProvider, pz4.I, 2131744581));
        }
        arrayList.add(qz4.c(context, xzaVar.resourceProvider, pz4.O, 2131753128));
        if (z2) {
            arrayList.add(qz4.c(context, xzaVar.resourceProvider, pz4.P, 2131748164));
        }
        xzaVar.r0 = (qz4[]) arrayList.toArray(new qz4[0]);
        ej6 ej6Var = new ej6(context, xzaVar.resourceProvider);
        xzaVar.p0 = ej6Var;
        ej6Var.setPadding(gm.L(12.0f), gm.L(12.0f), gm.L(12.0f), gm.L(12.0f));
        xzaVar.p0.setMaxWidth(gm.L(344.0f));
        xzaVar.p0.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        xzaVar.q0 = frameLayout2;
        frameLayout2.setOnClickListener(new x10(b));
        xzaVar.q0.addView(xzaVar.p0, qoe.e(-1, 72, 81));
        xzaVar.q0.setClipToPadding(false);
        int i2 = 0;
        while (true) {
            qz4[] qz4VarArr = xzaVar.r0;
            if (i2 >= qz4VarArr.length) {
                break;
            }
            qz4 qz4Var = qz4VarArr[i2];
            qz4Var.setOnClickListener(new v0(xzaVar, i2, (byte) 25));
            xzaVar.p0.addView(xzaVar.r0[i2]);
            xzaVar.p0.j(qz4Var, true, false);
            i2++;
        }
        xzaVar.i0 = new uya(xzaVar, xzaVar.getParentActivity());
        FrameLayout frameLayout3 = new FrameLayout(context);
        if (R) {
            sh1 sh1Var = new sh1(xzaVar, -j, xzaVar.getResourceProvider());
            xzaVar.j0 = sh1Var;
            sh1Var.G.setCaptureSectionsDecoratorAllowed(true);
            xzaVar.glassEngine.b(xzaVar.j0.G);
        }
        if (z2) {
            frameLayout = frameLayout3;
            i = -1;
            ik1 ik1Var = new ik1(xzaVar.getParentActivity(), xzaVar, xzaVar.currentAccount, -j, xzaVar.getResourceProvider(), xzaVar.glassEngine, sd2.V(L0) && M0.can_view_revenue, M0.can_view_stars_revenue);
            xzaVar = xzaVar;
            xzaVar.k0 = ik1Var;
            ik1Var.X0.setCaptureSectionsDecoratorAllowed(true);
        } else {
            frameLayout = frameLayout3;
            i = -1;
        }
        boolean z3 = z;
        FrameLayout frameLayout4 = frameLayout;
        xzaVar.i0.setAdapter(new vya(xzaVar, z3, R, z2, frameLayout4));
        boolean z4 = xzaVar.o0;
        boolean z5 = R && !z4;
        xzaVar.c = z5;
        if (z5) {
            if (xzaVar.d0) {
                xzaVar.i0.setPosition(z3 ? 1 : 0);
            } else if (xzaVar.e0) {
                xzaVar.i0.setPosition(((z4 || !R) ? 0 : 1) + (z3 ? 1 : 0));
            }
        }
        xzaVar.p0(xzaVar.i0.getCurrentPosition(), false);
        FrameLayout frameLayout5 = new FrameLayout(xzaVar.getParentActivity());
        frameLayout5.addView(xzaVar.i0, qoe.g());
        View view = new View(context);
        xzaVar.l0 = view;
        frameLayout5.addView(view, qoe.e(i, 0, 48));
        FrameLayout frameLayout6 = new FrameLayout(context);
        xzaVar.m0 = frameLayout6;
        frameLayout6.setVisibility(4);
        frameLayout5.addView(xzaVar.m0, qoe.g());
        frameLayout5.addView(xzaVar.simpleActionBar);
        if (xzaVar.c) {
            xzaVar.setBulletinDelegate(new oz((byte) 12));
            xzaVar.q0.setBackground(xzaVar.getBaseSimpleGlass().b(xzaVar.q0));
            frameLayout5.addView(xzaVar.q0, qoe.e(i, -2, 80));
        }
        xzaVar.fragmentView = frameLayout5;
        wya wyaVar = new wya(xzaVar, context);
        xzaVar.T = wyaVar;
        wyaVar.setCaptureSectionsDecoratorAllowed(true);
        xzaVar.T.setSections(true);
        xzaVar.T.setClipToPadding(false);
        xzaVar.glassEngine.b(xzaVar.T);
        xzaVar.T.r1();
        LinearLayout linearLayout = new LinearLayout(context);
        xzaVar.b0 = linearLayout;
        linearLayout.setOrientation(1);
        s09 s09Var = new s09(context);
        xzaVar.W = s09Var;
        s09Var.setAutoRepeat(true);
        xzaVar.W.f(R.raw.statistic_preload, nm7.E1, nm7.E1, null);
        xzaVar.W.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gm.o());
        int i3 = cmb.Ej;
        anb.X(textView, i3, null);
        textView.setTag(Integer.valueOf(i3));
        textView.setText(jb6.M0(2131748534, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i4 = cmb.Fj;
        anb.X(textView2, i4, null);
        textView2.setTag(Integer.valueOf(i4));
        textView2.setText(jb6.M0(2131748533, null));
        textView2.setGravity(1);
        xzaVar.b0.addView(xzaVar.W, qoe.t(nm7.E1, nm7.E1, 1, 0, 0, 0, 20));
        xzaVar.b0.addView(textView, qoe.t(-2, -2, 1, 0, 0, 0, 10));
        xzaVar.b0.addView(textView2, qoe.r(-2, -2, 1));
        frameLayout4.addView(xzaVar.b0, qoe.d(nm7.O3, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        bza bzaVar = xzaVar.X;
        if (bzaVar == null) {
            bzaVar = new bza(xzaVar);
            xzaVar.X = bzaVar;
        }
        xzaVar.T.setAdapter(bzaVar);
        u46 u46Var = new u46();
        xzaVar.U = u46Var;
        xzaVar.T.setLayoutManager(u46Var);
        xzaVar.Y = new xya();
        xzaVar.T.setItemAnimator(null);
        xzaVar.T.j(new so7(xzaVar, (byte) 29));
        byte b2 = 16;
        xzaVar.T.setOnItemClickListener(new s19(xzaVar, b2));
        xzaVar.T.setOnItemLongClickListener(new tya(xzaVar));
        frameLayout4.addView(xzaVar.T);
        xzaVar.S = new z82(context, null, false, null);
        TLRPC.Chat L02 = xzaVar.getMessagesController().L0(Long.valueOf(j));
        xzaVar.S.setChatAvatar(L02);
        xzaVar.simpleActionBar.setBackButtonDrawable(new ee0(false));
        xzaVar.simpleActionBar.setTitle(L02 == null ? "" : L02.title);
        xzaVar.simpleActionBar.setActionBarMenuOnItemClick(new im8(xzaVar, b2));
        xzaVar.S.i(cmb.w0(null, i3, false), cmb.w0(null, i4, false));
        boolean z6 = xzaVar.B0;
        byte b3 = 8;
        zka zkaVar = xzaVar.F0;
        if (z6) {
            xzaVar.b0.setAlpha(0.0f);
            gm.d3(zkaVar, 500L);
            xzaVar.b0.setVisibility(0);
            xzaVar.T.setVisibility(8);
        } else {
            gm.r(zkaVar);
            xzaVar.b0.setVisibility(8);
            xzaVar.T.setVisibility(0);
        }
        im0 c = xzaVar.getBaseSimpleGlass().c.c(xzaVar.p0, qqd.g(xzaVar.resourceProvider), false);
        wi8.r(c, gm.L(28.0f), 7.666f);
        xzaVar.p0.setBackground(c);
        xzaVar.glassEngine.c(xzaVar.i0);
        eh0 baseSimpleGlass = xzaVar.getBaseSimpleGlass();
        uya uyaVar = xzaVar.i0;
        rja rjaVar = xzaVar.simpleActionBar;
        ylb ylbVar = xzaVar.resourceProvider;
        baseSimpleGlass.m = frameLayout5;
        baseSimpleGlass.n = uyaVar;
        baseSimpleGlass.a.c(uyaVar);
        baseSimpleGlass.h(frameLayout5, rjaVar, ylbVar);
        xzaVar.n0 = new fn0(0, new tya(xzaVar), d53.h, 380L, false);
        ik1 ik1Var2 = xzaVar.k0;
        if (ik1Var2 != null) {
            eh0 baseSimpleGlass2 = xzaVar.getBaseSimpleGlass();
            View view2 = ik1Var2.a1.d;
            im0 c2 = baseSimpleGlass2.c.c(view2, null, false);
            c2.p(qqd.l(ik1Var2.n0));
            c2.q(gm.L(9.66f));
            c2.r(gm.L(18.0f));
            view2.setBackground(c2);
            View transactionTabs = xzaVar.k0.getTransactionTabs();
            ViewGroup.LayoutParams layoutParams = transactionTabs.getLayoutParams();
            gm.B2(transactionTabs);
            xzaVar.m0.addView(transactionTabs, layoutParams);
            xzaVar.k0.setTabsPinnedChangedListener(new nsa((Object) xzaVar, (byte) 6));
            xzaVar.n0.a(xzaVar.k0.f0, false);
        }
        frameLayout5.getViewTreeObserver().addOnPreDrawListener(new cc(xzaVar, b3));
        xzaVar.getBaseSimpleGlass().o = new ai3(xzaVar, frameLayout5, new je(frameLayout5, (byte) 2), b);
        xzaVar.getBaseSimpleGlass().n = null;
        xzaVar.simpleActionBar.setBackground(null);
        xzaVar.l0.setBackground(xzaVar.getBaseSimpleGlass().a(xzaVar.l0));
        gm.B2(xzaVar.S.e);
        frameLayout5.addView(xzaVar.S.e, qoe.e(42, 42, 53));
        xzaVar.d0();
        xzaVar.fragmentView.setBackgroundColor(xzaVar.getThemedColor(cmb.Z6));
        xzaVar.C0 = new kza(xzaVar.X, xzaVar.U);
        return xzaVar.fragmentView;
    }

    public final void d0() {
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        if (this.l0 != null) {
            int L = gm.L(44.0f) + a.getCurrentActionBarHeight() + this.mSystemInsets.b;
            ViewGroup.LayoutParams layoutParams = this.l0.getLayoutParams();
            if (layoutParams.height != L) {
                layoutParams.height = L;
                this.l0.setLayoutParams(layoutParams);
            }
            t0();
        }
        int L2 = this.c ? gm.L(72.0f) : 0;
        gm.v3(this.S.e, 0, ((a.getCurrentActionBarHeight() - gm.L(42.0f)) / 2) + this.mSystemInsets.b, gm.L(6.0f), 0);
        this.q0.setPadding(0, 0, 0, this.mSystemInsets.d);
        wya wyaVar = this.T;
        if (wyaVar != null) {
            iq5 iq5Var = this.mSystemInsets;
            eh0.e(wyaVar, iq5Var.b, iq5Var.d, currentActionBarHeight, L2);
        }
        sh1 sh1Var = this.j0;
        if (sh1Var != null) {
            r59 r59Var = sh1Var.G;
            iq5 iq5Var2 = this.mSystemInsets;
            eh0.e(r59Var, iq5Var2.b, iq5Var2.d, currentActionBarHeight, L2);
        }
        ik1 ik1Var = this.k0;
        if (ik1Var != null) {
            iq5 iq5Var3 = this.mSystemInsets;
            int i = iq5Var3.b;
            int i2 = iq5Var3.d;
            ik1Var.U0 = i;
            ik1Var.V0 = i2;
            ik1Var.W0 = L2;
            int x = b10.x(48.0f, i, -gm.L(8.0f));
            int x2 = b10.x(48.0f, i2, -gm.L(8.0f));
            q7c q7cVar = ik1Var.X0;
            gm.v3(q7cVar, 0, x, 0, x2);
            q7cVar.setPadding(q7cVar.getPaddingLeft(), (a.getCurrentActionBarHeight() + i) - x, q7cVar.getPaddingRight(), (i2 + L2) - x2);
            ik1Var.A(-x, -x2);
            ik1Var.C();
            ik1Var.requestLayout();
            ik1Var.invalidate();
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ArrayList arrayList;
        int i3 = 0;
        if (i == nm7.B5) {
            if (((z3b) objArr[0]) == this.D0) {
                m0();
                r0();
                if (this.X != null) {
                    this.T.setItemAnimator(null);
                    this.C0.e();
                    return;
                }
                return;
            }
            return;
        }
        if (i == nm7.X2) {
            if (getParentLayout() != null) {
                TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                List fragmentStack = getParentLayout().getFragmentStack();
                d dVar = fragmentStack.size() >= 2 ? (d) aq1.m(2, fragmentStack) : null;
                if (dVar instanceof ba2) {
                    ((ActionBarLayout) getParentLayout()).c0(dVar, false);
                }
                List fragmentStack2 = getParentLayout().getFragmentStack();
                d dVar2 = fragmentStack2.size() >= 2 ? (d) aq1.m(2, fragmentStack2) : null;
                if (!booleanValue) {
                    finishFragment();
                    if (dVar2 instanceof ProfileActivity) {
                        yn0.f(dVar2, chat, false);
                        return;
                    }
                    return;
                }
                d dVar3 = fragmentStack2.size() >= 3 ? (d) aq1.m(3, fragmentStack2) : null;
                if (dVar2 instanceof ProfileActivity) {
                    ((ActionBarLayout) getParentLayout()).c0(dVar2, false);
                }
                finishFragment();
                if (dVar3 instanceof yv1) {
                    yn0.f(dVar3, chat, true);
                    return;
                }
                return;
            }
            return;
        }
        if (i != nm7.C) {
            if (i == nm7.T) {
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
                if (chatFull.id == this.b && this.a == null) {
                    this.a = chatFull;
                    l0();
                    return;
                }
                return;
            }
            return;
        }
        if (((Integer) objArr[10]).intValue() == this.classGuid) {
            ArrayList arrayList2 = (ArrayList) objArr[2];
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList2.size();
            int i4 = 0;
            while (true) {
                arrayList = this.v0;
                if (i4 >= size) {
                    break;
                }
                k47 k47Var = (k47) arrayList2.get(i4);
                int i5 = this.t0.get(k47Var.e1(), -1);
                if (i5 >= 0 && ((uza) arrayList.get(i5)).b() == k47Var.e1()) {
                    if (k47Var.Z) {
                        arrayList3.add((uza) arrayList.get(i5));
                    } else {
                        ((uza) arrayList.get(i5)).b = k47Var;
                    }
                }
                i4++;
            }
            arrayList.removeAll(arrayList3);
            ArrayList arrayList4 = this.w0;
            arrayList4.clear();
            int size2 = arrayList.size();
            while (true) {
                if (i3 >= size2) {
                    break;
                }
                uza uzaVar = (uza) arrayList.get(i3);
                if (uzaVar.b == null) {
                    this.s0 = uzaVar.b();
                    break;
                } else {
                    arrayList4.add(uzaVar);
                    i3++;
                }
            }
            if (arrayList4.size() < 20) {
                k0();
            }
            r0();
            if (this.X != null) {
                this.T.setItemAnimator(null);
                this.C0.e();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        t10 t10Var = new t10(this, (byte) 19);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        arrayList.add(new cnb(this.T, 0, new Class[]{pl1.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.i5));
        if (this.c0) {
            while (i < 6) {
                n0(i == 0 ? this.d : i == 1 ? this.I : i == 2 ? this.J : i == 3 ? this.K : i == 4 ? this.L : this.M, arrayList, t10Var);
                i++;
            }
        } else {
            while (i < 12) {
                n0(i == 0 ? this.d : i == 1 ? this.h : i == 2 ? this.n : i == 3 ? this.r : i == 4 ? this.s : i == 5 ? this.w : i == 6 ? this.y : i == 7 ? this.e : i == 8 ? this.x : i == 9 ? this.E : i == 10 ? this.F : this.G, arrayList, t10Var);
                i++;
            }
        }
        return arrayList;
    }

    public final void h0(jza[] jzaVarArr) {
        bza bzaVar = this.X;
        if (bzaVar != null) {
            bzaVar.E();
            this.T.setItemAnimator(null);
            this.X.f();
        }
        this.B0 = false;
        LinearLayout linearLayout = this.b0;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        gm.r(this.F0);
        this.b0.animate().alpha(0.0f).setDuration(230L).setListener(new c39((Object) this, (byte) 23));
        this.T.setVisibility(0);
        this.T.setAlpha(0.0f);
        this.T.animate().alpha(1.0f).setDuration(230L).start();
        for (jza jzaVar : jzaVarArr) {
            if (jzaVar != null && jzaVar.d == null && jzaVar.f != null) {
                jzaVar.a(this.currentAccount, this.classGuid, this.a.stats_dc, new sp1(this, jzaVar, (byte) 1));
            }
        }
    }

    public final void i0(TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        byte b = 1;
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i = 0; i < arrayList2.size(); i++) {
                arrayList.add(new k47(this.currentAccount, arrayList2.get(i), false, true));
            }
            getMessagesStorage().g1(arrayList2, false, true, true, 0, false, 0, 0L);
        }
        gm.c3(new qya(this, arrayList, b));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        return on2.h(cmb.w0(null, cmb.c6, false)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        uya uyaVar;
        if (motionEvent != null && this.k0 != null && (uyaVar = this.i0) != null) {
            View currentView = uyaVar.getCurrentView();
            ik1 ik1Var = this.k0;
            if (currentView == ik1Var && ik1Var.H((motionEvent.getX() - this.i0.getX()) - this.k0.getX(), (motionEvent.getY() - this.i0.getY()) - this.k0.getY())) {
                return false;
            }
        }
        uya uyaVar2 = this.i0;
        if (uyaVar2 == null || (uyaVar2.b == 0 && uyaVar2.c == 1.0f)) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v94 */
    public final void j0(TLObject tLObject) {
        final xza xzaVar;
        ?? r10;
        String str;
        String str2;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str3;
        int i = 10;
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            final jza[] jzaVarArr = {g0(tL_broadcastStats.iv_interactions_graph, jb6.M0(2131749030, "IVInteractionsChartTitle"), 1, false), g0(tL_broadcastStats.followers_graph, jb6.M0(2131750542, "FollowersChartTitle"), 0, false), g0(tL_broadcastStats.top_hours_graph, jb6.M0(2131743719, "TopHoursChartTitle"), 0, false), g0(tL_broadcastStats.interactions_graph, jb6.M0(2131743214, "ViewsAndSharesChartTitle"), 1, false), g0(tL_broadcastStats.growth_graph, jb6.M0(2131749132, "GrowthChartTitle"), 0, false), g0(tL_broadcastStats.views_by_source_graph, jb6.M0(2131743213, "ViewsBySourceChartTitle"), 2, false), g0(tL_broadcastStats.new_followers_by_source_graph, jb6.M0(2131748031, "NewFollowersBySourceChartTitle"), 2, false), g0(tL_broadcastStats.languages_graph, jb6.M0(2131748798, "LanguagesChartTitle"), 4, true), g0(tL_broadcastStats.mute_graph, jb6.M0(2131747653, "NotificationsChartTitle"), 0, false), g0(tL_broadcastStats.reactions_by_emotion_graph, jb6.M0(2131746118, "ReactionsByEmotionChartTitle"), 2, false), g0(tL_broadcastStats.story_interactions_graph, jb6.M0(2131744345, "StoryInteractionsChartTitle"), 1, false), g0(tL_broadcastStats.story_reactions_by_emotion_graph, jb6.M0(2131744190, "StoryReactionsByEmotionChartTitle"), 2, false)};
            jza jzaVar = jzaVarArr[2];
            if (jzaVar != null) {
                jzaVar.n = true;
            }
            sza szaVar = new sza();
            xvc a = sza.a(tL_broadcastStats.reactions_per_post);
            str2 = "+";
            szaVar.o = jb6.M0(2131746111, "ReactionsPerPost");
            szaVar.p = (String) a.b;
            szaVar.q = (String) a.c;
            szaVar.r = ((Boolean) a.d).booleanValue();
            szaVar.s = ((Boolean) a.e).booleanValue();
            xvc a2 = sza.a(tL_broadcastStats.reactions_per_story);
            szaVar.t = jb6.M0(2131746110, "ReactionsPerStory");
            szaVar.u = (String) a2.b;
            szaVar.v = (String) a2.c;
            szaVar.w = ((Boolean) a2.d).booleanValue();
            szaVar.x = ((Boolean) a2.e).booleanValue();
            xvc a3 = sza.a(tL_broadcastStats.views_per_story);
            szaVar.y = jb6.M0(2131743211, "ViewsPerStory");
            szaVar.z = (String) a3.b;
            szaVar.A = (String) a3.c;
            szaVar.B = ((Boolean) a3.d).booleanValue();
            szaVar.C = ((Boolean) a3.e).booleanValue();
            xvc a4 = sza.a(tL_broadcastStats.shares_per_story);
            szaVar.D = jb6.M0(2131745131, "SharesPerStory");
            szaVar.E = (String) a4.b;
            szaVar.F = (String) a4.c;
            szaVar.G = ((Boolean) a4.d).booleanValue();
            szaVar.H = ((Boolean) a4.e).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            String str4 = "TopHoursChartTitle";
            double d = tL_statsAbsValueAndPrev.current;
            double d2 = tL_statsAbsValueAndPrev.previous;
            int i2 = (int) (d - d2);
            float abs = d2 == 0.0d ? 0.0f : Math.abs((i2 / ((float) d2)) * 100.0f);
            szaVar.a = jb6.M0(2131750542, "FollowersChartTitle");
            szaVar.b = gm.o0((int) tL_broadcastStats.followers.current, 0);
            if (i2 == 0 || abs == 0.0f) {
                szaVar.c = "";
            } else {
                int i3 = (int) abs;
                if (abs == i3) {
                    Locale locale = Locale.ENGLISH;
                    szaVar.c = ((i2 > 0 ? str2 : "") + gm.o0(i2, 0)) + " (" + i3 + "%)";
                } else {
                    szaVar.c = String.format(Locale.ENGLISH, "%s (%.1f%s)", (i2 > 0 ? str2 : "") + gm.o0(i2, 0), Float.valueOf(abs), "%");
                }
            }
            szaVar.d = i2 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_broadcastStats.shares_per_post;
            double d3 = tL_statsAbsValueAndPrev2.current;
            double d4 = tL_statsAbsValueAndPrev2.previous;
            int i4 = (int) (d3 - d4);
            float abs2 = d4 == 0.0d ? 0.0f : Math.abs((i4 / ((float) d4)) * 100.0f);
            szaVar.i = jb6.M0(2131745132, "SharesPerPost");
            szaVar.j = gm.o0((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i4 == 0 || abs2 == 0.0f) {
                szaVar.k = "";
            } else {
                int i5 = (int) abs2;
                if (abs2 == i5) {
                    Locale locale2 = Locale.ENGLISH;
                    szaVar.k = ((i4 > 0 ? str2 : "") + gm.o0(i4, 0)) + " (" + i5 + "%)";
                } else {
                    szaVar.k = String.format(Locale.ENGLISH, "%s (%.1f%s)", (i4 > 0 ? str2 : "") + gm.o0(i4, 0), Float.valueOf(abs2), "%");
                }
            }
            szaVar.l = i4 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d5 = tL_statsAbsValueAndPrev3.current;
            double d6 = tL_statsAbsValueAndPrev3.previous;
            int i6 = (int) (d5 - d6);
            float abs3 = d6 == 0.0d ? 0.0f : Math.abs((i6 / ((float) d6)) * 100.0f);
            szaVar.e = jb6.M0(2131743212, "ViewsPerPost");
            szaVar.f = gm.o0((int) tL_broadcastStats.views_per_post.current, 0);
            if (i6 == 0 || abs3 == 0.0f) {
                szaVar.g = "";
            } else {
                int i7 = (int) abs3;
                if (abs3 == i7) {
                    Locale locale3 = Locale.ENGLISH;
                    szaVar.g = ((i6 > 0 ? str2 : "") + gm.o0(i6, 0)) + " (" + i7 + "%)";
                } else {
                    szaVar.g = String.format(Locale.ENGLISH, "%s (%.1f%s)", (i6 > 0 ? str2 : "") + gm.o0(i6, 0), Float.valueOf(abs3), "%");
                }
            }
            szaVar.h = i6 >= 0;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            szaVar.m = jb6.M0(2131751080, "EnabledNotifications");
            int i8 = (int) f;
            if (f == i8) {
                Locale locale4 = Locale.ENGLISH;
                szaVar.n = aq1.n(i8, "%");
            } else {
                szaVar.n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f), "%");
            }
            xzaVar = this;
            xzaVar.f = szaVar;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            xzaVar.f0 = tL_statsDateRangeDays.max_date * 1000;
            xzaVar.g0 = tL_statsDateRangeDays.min_date * 1000;
            ArrayList arrayList3 = xzaVar.v0;
            arrayList3.clear();
            ArrayList arrayList4 = new ArrayList();
            ArrayList<TL_stats.PostInteractionCounters> arrayList5 = tL_broadcastStats.recent_posts_interactions;
            int size = arrayList5.size();
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                TL_stats.PostInteractionCounters postInteractionCounters = arrayList5.get(i11);
                int i12 = i11 + 1;
                ArrayList<TL_stats.PostInteractionCounters> arrayList6 = arrayList5;
                TL_stats.PostInteractionCounters postInteractionCounters2 = postInteractionCounters;
                int i13 = size;
                uza uzaVar = new uza();
                uzaVar.a = postInteractionCounters2;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList3.add(uzaVar);
                    str3 = str4;
                    xzaVar.t0.put(uzaVar.b(), i9);
                    i9++;
                } else {
                    str3 = str4;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList4.add(Integer.valueOf(uzaVar.b()));
                    xzaVar.x0.add(uzaVar);
                    xzaVar.u0.put(uzaVar.b(), i10);
                    i10++;
                }
                size = i13;
                arrayList5 = arrayList6;
                i11 = i12;
                str4 = str3;
            }
            str = str4;
            gm.c3(new qya(xzaVar, arrayList4, (byte) 0));
            if (arrayList3.size() > 0) {
                int b = ((uza) arrayList3.get(0)).b();
                int size2 = arrayList3.size();
                cf7 messagesStorage = xzaVar.getMessagesStorage();
                long j = -xzaVar.b;
                int i14 = xzaVar.classGuid;
                messagesStorage.getClass();
                messagesStorage.a.c(new uc7(messagesStorage, rqb.d(null, "MessagesStorage.getMessages: storageQueue.postRunnable"), null, j, 0L, size2, b, 0, 0, i14, 0, 0, 0L, 0, true, false));
            }
            r10 = 0;
            final Object[] objArr = 0 == true ? 1 : 0;
            gm.c3(new Runnable(xzaVar) { // from class: rya
                public final /* synthetic */ xza b;

                {
                    this.b = xzaVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = objArr;
                    jza[] jzaVarArr2 = jzaVarArr;
                    xza xzaVar2 = this.b;
                    xzaVar2.getClass();
                    switch (b2) {
                        case 0:
                            xzaVar2.r = jzaVarArr2[0];
                            xzaVar2.h = jzaVarArr2[1];
                            xzaVar2.e = jzaVarArr2[2];
                            xzaVar2.n = jzaVarArr2[3];
                            xzaVar2.d = jzaVarArr2[4];
                            xzaVar2.s = jzaVarArr2[5];
                            xzaVar2.w = jzaVarArr2[6];
                            xzaVar2.x = jzaVarArr2[7];
                            xzaVar2.y = jzaVarArr2[8];
                            xzaVar2.E = jzaVarArr2[9];
                            xzaVar2.F = jzaVarArr2[10];
                            xzaVar2.G = jzaVarArr2[11];
                            xzaVar2.h0(jzaVarArr2);
                            break;
                        default:
                            xzaVar2.d = jzaVarArr2[0];
                            xzaVar2.I = jzaVarArr2[1];
                            xzaVar2.J = jzaVarArr2[2];
                            xzaVar2.K = jzaVarArr2[3];
                            xzaVar2.L = jzaVarArr2[4];
                            xzaVar2.M = jzaVarArr2[5];
                            xzaVar2.e = jzaVarArr2[6];
                            xzaVar2.N = jzaVarArr2[7];
                            xzaVar2.h0(jzaVarArr2);
                            break;
                    }
                }
            });
        } else {
            xzaVar = this;
            r10 = 0;
            str = "TopHoursChartTitle";
            str2 = "+";
        }
        if (tLObject instanceof TL_stats.TL_megagroupStats) {
            TL_stats.TL_megagroupStats tL_megagroupStats = (TL_stats.TL_megagroupStats) tLObject;
            jza g0 = g0(tL_megagroupStats.growth_graph, jb6.M0(2131749132, "GrowthChartTitle"), r10, r10);
            jza g02 = g0(tL_megagroupStats.members_graph, jb6.M0(2131749184, "GroupMembersChartTitle"), r10, r10);
            jza g03 = g0(tL_megagroupStats.new_members_by_source_graph, jb6.M0(2131748028, "NewMembersBySourceChartTitle"), 2, r10);
            jza g04 = g0(tL_megagroupStats.languages_graph, jb6.M0(2131748375, "MembersLanguageChartTitle"), 4, true);
            jza g05 = g0(tL_megagroupStats.messages_graph, jb6.M0(2131748219, "MessagesChartTitle"), 2, r10);
            jza g06 = g0(tL_megagroupStats.actions_graph, jb6.M0(2131754486, "ActionsChartTitle"), 1, r10);
            jza g07 = g0(tL_megagroupStats.top_hours_graph, jb6.M0(2131743719, str), r10, r10);
            jza g08 = g0(tL_megagroupStats.weekdays_graph, jb6.M0(2131743720, "TopDaysOfWeekChartTitle"), 4, r10);
            final jza[] jzaVarArr2 = new jza[8];
            jzaVarArr2[r10] = g0;
            jzaVarArr2[1] = g02;
            jzaVarArr2[2] = g03;
            jzaVarArr2[3] = g04;
            jzaVarArr2[4] = g05;
            jzaVarArr2[5] = g06;
            jzaVarArr2[6] = g07;
            jzaVarArr2[7] = g08;
            jza jzaVar2 = jzaVarArr2[6];
            if (jzaVar2 != null) {
                jzaVar2.n = true;
            }
            jza jzaVar3 = jzaVarArr2[7];
            if (jzaVar3 != null) {
                jzaVar3.o = true;
            }
            tza tzaVar = new tza();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev4 = tL_megagroupStats.members;
            double d7 = tL_statsAbsValueAndPrev4.current;
            double d8 = tL_statsAbsValueAndPrev4.previous;
            int i15 = (int) (d7 - d8);
            float abs4 = d8 == 0.0d ? 0.0f : Math.abs((i15 / ((float) d8)) * 100.0f);
            tzaVar.a = jb6.M0(2131748374, "MembersOverviewTitle");
            tzaVar.b = gm.o0((int) tL_megagroupStats.members.current, 0);
            if (i15 == 0 || abs4 == 0.0f) {
                tzaVar.c = "";
            } else {
                int i16 = (int) abs4;
                if (abs4 == i16) {
                    Locale locale5 = Locale.ENGLISH;
                    tzaVar.c = ((i15 > 0 ? str2 : "") + gm.o0(i15, 0)) + " (" + i16 + "%)";
                } else {
                    tzaVar.c = String.format(Locale.ENGLISH, "%s (%.1f%s)", (i15 > 0 ? str2 : "") + gm.o0(i15, 0), Float.valueOf(abs4), "%");
                }
            }
            tzaVar.d = i15 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev5 = tL_megagroupStats.viewers;
            double d9 = tL_statsAbsValueAndPrev5.current;
            double d10 = tL_statsAbsValueAndPrev5.previous;
            int i17 = (int) (d9 - d10);
            float abs5 = d10 == 0.0d ? 0.0f : Math.abs((i17 / ((float) d10)) * 100.0f);
            tzaVar.i = jb6.M0(2131743216, "ViewingMembers");
            tzaVar.j = gm.o0((int) tL_megagroupStats.viewers.current, 0);
            if (i17 == 0 || abs5 == 0.0f) {
                tzaVar.k = "";
            } else {
                Locale locale6 = Locale.ENGLISH;
                tzaVar.k = (i17 > 0 ? str2 : "") + gm.o0(i17, 0);
            }
            tzaVar.l = i17 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d11 = tL_statsAbsValueAndPrev6.current;
            double d12 = tL_statsAbsValueAndPrev6.previous;
            int i18 = (int) (d11 - d12);
            float abs6 = d12 == 0.0d ? 0.0f : Math.abs((i18 / ((float) d12)) * 100.0f);
            tzaVar.m = jb6.M0(2131746802, "PostingMembers");
            tzaVar.n = gm.o0((int) tL_megagroupStats.posters.current, 0);
            if (i18 == 0 || abs6 == 0.0f) {
                tzaVar.o = "";
            } else {
                Locale locale7 = Locale.ENGLISH;
                tzaVar.o = (i18 > 0 ? str2 : "") + gm.o0(i18, 0);
            }
            tzaVar.p = i18 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d13 = tL_statsAbsValueAndPrev7.current;
            double d14 = tL_statsAbsValueAndPrev7.previous;
            int i19 = (int) (d13 - d14);
            float abs7 = d14 == 0.0d ? 0.0f : Math.abs((i19 / ((float) d14)) * 100.0f);
            tzaVar.e = jb6.M0(2131748210, "MessagesOverview");
            tzaVar.f = gm.o0((int) tL_megagroupStats.messages.current, 0);
            if (i19 == 0 || abs7 == 0.0f) {
                tzaVar.g = "";
            } else {
                Locale locale8 = Locale.ENGLISH;
                tzaVar.g = (i19 > 0 ? str2 : "") + gm.o0(i19, 0);
            }
            tzaVar.h = i19 >= 0;
            xzaVar.H = tzaVar;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            xzaVar.f0 = tL_statsDateRangeDays2.max_date * 1000;
            xzaVar.g0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList7 = tL_megagroupStats.top_posters;
            if (arrayList7 != null && !arrayList7.isEmpty()) {
                int i20 = 0;
                while (true) {
                    int size3 = tL_megagroupStats.top_posters.size();
                    arrayList = xzaVar.O;
                    arrayList2 = xzaVar.P;
                    if (i20 >= size3) {
                        break;
                    }
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i20);
                    ArrayList<TLRPC.User> arrayList8 = tL_megagroupStats.users;
                    qza qzaVar = new qza();
                    qzaVar.a = qza.a(arrayList8, tL_statsGroupTopPoster.user_id);
                    StringBuilder sb = new StringBuilder();
                    int i21 = tL_statsGroupTopPoster.messages;
                    if (i21 > 0) {
                        sb.append(jb6.G(i21, "messages", new Object[0]));
                    }
                    if (tL_statsGroupTopPoster.avg_chars > 0) {
                        if (sb.length() > 0) {
                            sb.append(", ");
                        }
                        sb.append(jb6.a0("CharactersPerMessage", null, 2131752191, jb6.G(tL_statsGroupTopPoster.avg_chars, "Characters", new Object[0])));
                    }
                    qzaVar.b = sb.toString();
                    int i22 = i;
                    if (arrayList2.size() < i22) {
                        arrayList2.add(qzaVar);
                    }
                    arrayList.add(qzaVar);
                    i20++;
                    i = i22;
                }
                if (arrayList.size() - arrayList2.size() < 2) {
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopAdmin> arrayList9 = tL_megagroupStats.top_admins;
            if (arrayList9 != null && !arrayList9.isEmpty()) {
                for (int i23 = 0; i23 < tL_megagroupStats.top_admins.size(); i23++) {
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i23);
                    ArrayList<TLRPC.User> arrayList10 = tL_megagroupStats.users;
                    qza qzaVar2 = new qza();
                    qzaVar2.a = qza.a(arrayList10, tL_statsGroupTopAdmin.user_id);
                    StringBuilder sb2 = new StringBuilder();
                    int i24 = tL_statsGroupTopAdmin.deleted;
                    if (i24 > 0) {
                        sb2.append(jb6.G(i24, "Deletions", new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.banned > 0) {
                        if (sb2.length() > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(jb6.G(tL_statsGroupTopAdmin.banned, "Bans", new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.kicked > 0) {
                        if (sb2.length() > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(jb6.G(tL_statsGroupTopAdmin.kicked, "Restrictions", new Object[0]));
                    }
                    qzaVar2.b = sb2.toString();
                    xzaVar.R.add(qzaVar2);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList11 = tL_megagroupStats.top_inviters;
            if (arrayList11 != null && !arrayList11.isEmpty()) {
                for (int i25 = 0; i25 < tL_megagroupStats.top_inviters.size(); i25++) {
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i25);
                    ArrayList<TLRPC.User> arrayList12 = tL_megagroupStats.users;
                    qza qzaVar3 = new qza();
                    qzaVar3.a = qza.a(arrayList12, tL_statsGroupTopInviter.user_id);
                    int i26 = tL_statsGroupTopInviter.invitations;
                    if (i26 > 0) {
                        qzaVar3.b = jb6.G(i26, "Invitations", new Object[0]);
                    } else {
                        qzaVar3.b = "";
                    }
                    xzaVar.Q.add(qzaVar3);
                }
            }
            final byte b2 = 1;
            gm.c3(new Runnable(xzaVar) { // from class: rya
                public final /* synthetic */ xza b;

                {
                    this.b = xzaVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b22 = b2;
                    jza[] jzaVarArr22 = jzaVarArr2;
                    xza xzaVar2 = this.b;
                    xzaVar2.getClass();
                    switch (b22) {
                        case 0:
                            xzaVar2.r = jzaVarArr22[0];
                            xzaVar2.h = jzaVarArr22[1];
                            xzaVar2.e = jzaVarArr22[2];
                            xzaVar2.n = jzaVarArr22[3];
                            xzaVar2.d = jzaVarArr22[4];
                            xzaVar2.s = jzaVarArr22[5];
                            xzaVar2.w = jzaVarArr22[6];
                            xzaVar2.x = jzaVarArr22[7];
                            xzaVar2.y = jzaVarArr22[8];
                            xzaVar2.E = jzaVarArr22[9];
                            xzaVar2.F = jzaVarArr22[10];
                            xzaVar2.G = jzaVarArr22[11];
                            xzaVar2.h0(jzaVarArr22);
                            break;
                        default:
                            xzaVar2.d = jzaVarArr22[0];
                            xzaVar2.I = jzaVarArr22[1];
                            xzaVar2.J = jzaVarArr22[2];
                            xzaVar2.K = jzaVarArr22[3];
                            xzaVar2.L = jzaVarArr22[4];
                            xzaVar2.M = jzaVarArr22[5];
                            xzaVar2.e = jzaVarArr22[6];
                            xzaVar2.N = jzaVarArr22[7];
                            xzaVar2.h0(jzaVarArr22);
                            break;
                    }
                }
            });
        }
    }

    public final void k0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.id = new ArrayList<>();
        ArrayList arrayList = this.v0;
        int size = arrayList.size();
        byte b = 0;
        int i = 0;
        for (int i2 = this.t0.get(this.s0); i2 < size; i2++) {
            if (((uza) arrayList.get(i2)).b == null) {
                tL_channels_getMessages.id.add(Integer.valueOf(((uza) arrayList.get(i2)).b()));
                i++;
                if (i > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = oc7.r1(this.currentAccount).g1(this.b);
        this.A0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new pya(this, b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.o0) {
            return;
        }
        boolean z = this.c0;
        long j = this.b;
        if (z) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = oc7.r1(this.currentAccount).g1(j);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = oc7.r1(this.currentAccount).g1(j);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new pya(this, (byte) 1), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
    }

    public final void m0() {
        ArrayList arrayList = this.y0;
        arrayList.clear();
        ArrayList arrayList2 = this.x0;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            uza uzaVar = (uza) obj;
            k47 f = this.D0.f(uzaVar.b());
            if (f != null) {
                uzaVar.b = f;
                arrayList.add(uzaVar);
            }
        }
        this.u0.clear();
        arrayList2.clear();
    }

    public final void o0(View view) {
        if (view instanceof iza) {
            return;
        }
        if (!(view instanceof bba) || this.T.c1()) {
            if (view instanceof pl1) {
                ((pl1) view).a();
                return;
            }
            return;
        }
        Drawable background = view.getBackground();
        if (background instanceof sn2) {
            sn2 sn2Var = (sn2) background;
            if ((sn2Var.a instanceof ColorDrawable) && sn2Var.b != null) {
                int w0 = cmb.w0(null, cmb.a7, false);
                if (this.H0 == null || this.I0 != w0) {
                    this.I0 = w0;
                    this.H0 = new PorterDuffColorFilter(w0, PorterDuff.Mode.MULTIPLY);
                }
                ((ColorDrawable) sn2Var.a).setColor(cmb.w0(null, cmb.Z6, false));
                sn2Var.b.setColorFilter(this.H0);
                view.invalidate();
                return;
            }
        }
        sn2 sn2Var2 = new sn2(new ColorDrawable(cmb.w0(null, cmb.Z6, false)), cmb.W0(org.telegram.messenger.a.b, R.drawable.greydivider, cmb.a7), 0, 0);
        sn2Var2.x = true;
        view.setBackground(sn2Var2);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        e7a e7aVar = this.G0;
        if (e7aVar != null) {
            e7aVar.a();
            this.G0 = null;
        }
        nm7 notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        e7a e7aVar2 = new e7a(notificationCenter, this);
        e7aVar2.b(nm7.C);
        e7aVar2.b(nm7.T);
        e7aVar2.b(nm7.X2);
        e7aVar2.b(nm7.B5);
        this.G0 = e7aVar2;
        h4b N1 = getMessagesController().N1();
        long j = this.b;
        z3b z = N1.z(2, -1, -j, true);
        this.D0 = z;
        if (z != null) {
            this.E0 = z.o();
        }
        if (this.a != null) {
            l0();
        } else {
            oc7.r1(this.currentAccount).a3(this.classGuid, j, true);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        e7a e7aVar = this.G0;
        if (e7aVar != null) {
            e7aVar.a();
            this.G0 = null;
        }
        he[] heVarArr = this.h0;
        he heVar = heVarArr[0];
        if (heVar != null) {
            heVar.dismiss();
            heVarArr[0] = null;
        }
        z3b z3bVar = this.D0;
        if (z3bVar != null) {
            z3bVar.z(this.E0);
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onInsets(int i, int i2, int i3, int i4) {
        d0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            z82 z82Var = this.S;
            if (z82Var != null) {
                z82Var.i(cmb.w0(null, cmb.Ej, false), cmb.w0(null, cmb.Fj, false));
            }
            s0();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void p0(int i, boolean z) {
        int i2 = 0;
        while (true) {
            qz4[] qz4VarArr = this.r0;
            if (i2 >= qz4VarArr.length) {
                return;
            }
            qz4VarArr[i2].f(i2 == i, z);
            i2++;
        }
    }

    public final void q0(boolean z, float f) {
        for (int i = 0; i < this.r0.length; i++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i - f));
            qz4 qz4Var = this.r0[i];
            qz4Var.K = max;
            qz4Var.J = z;
            qz4Var.invalidate();
        }
        this.p0.invalidate();
    }

    public final void r0() {
        ArrayList arrayList = this.z0;
        arrayList.clear();
        arrayList.addAll(this.w0);
        arrayList.addAll(this.y0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$-CC.comparingLong(new te((byte) 4))));
    }

    public final void s0() {
        wya wyaVar;
        wya wyaVar2;
        wya wyaVar3;
        wya wyaVar4;
        wya wyaVar5 = this.T;
        if (wyaVar5 != null) {
            int childCount = wyaVar5.getChildCount();
            int i = 0;
            int i2 = 0;
            while (true) {
                wyaVar = this.T;
                if (i2 >= childCount) {
                    break;
                }
                o0(wyaVar.getChildAt(i2));
                i2++;
            }
            int hiddenChildCount = wyaVar.getHiddenChildCount();
            int i3 = 0;
            while (true) {
                wyaVar2 = this.T;
                if (i3 >= hiddenChildCount) {
                    break;
                }
                o0(wyaVar2.W(i3));
                i3++;
            }
            int cachedChildCount = wyaVar2.getCachedChildCount();
            int i4 = 0;
            while (true) {
                wyaVar3 = this.T;
                if (i4 >= cachedChildCount) {
                    break;
                }
                o0(wyaVar3.P(i4));
                i4++;
            }
            int attachedScrapChildCount = wyaVar3.getAttachedScrapChildCount();
            while (true) {
                wyaVar4 = this.T;
                if (i >= attachedScrapChildCount) {
                    break;
                }
                o0(wyaVar4.O(i));
                i++;
            }
            wyaVar4.getRecycledViewPool().a();
        }
        mg0 mg0Var = this.a0;
        if (mg0Var != null) {
            mg0Var.b = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t0() {
        boolean z;
        float f;
        if (this.l0 == null || this.m0 == null) {
            return;
        }
        ik1 ik1Var = this.k0;
        if (ik1Var != null && ik1Var.getParent() == this.i0) {
            ik1 ik1Var2 = this.k0;
            if (ik1Var2.getVisibility() == 0 && ik1Var2.Y0.getVisibility() != 0) {
                z = true;
                if (z) {
                    f = 0.0f;
                } else {
                    float x = this.k0.getX();
                    float width = this.k0.getWidth();
                    f = width > 0.0f ? Math.max(0.0f, Math.min(this.i0.getWidth(), x + width) - Math.max(0.0f, x)) / width : 0.0f;
                    this.m0.setTranslationX(this.i0.getX() + x);
                    this.m0.setTranslationY(this.k0.getY() + this.i0.getY());
                }
                this.m0.setVisibility((z || f <= 0.0f) ? 4 : 0);
                fn0 fn0Var = this.n0;
                this.l0.setTranslationY((-(1.0f - ((fn0Var != null ? fn0Var.e : 0.0f) * f))) * gm.L(44.0f));
            }
        }
        z = false;
        if (z) {
        }
        this.m0.setVisibility((z || f <= 0.0f) ? 4 : 0);
        fn0 fn0Var2 = this.n0;
        this.l0.setTranslationY((-(1.0f - ((fn0Var2 != null ? fn0Var2.e : 0.0f) * f))) * gm.L(44.0f));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
