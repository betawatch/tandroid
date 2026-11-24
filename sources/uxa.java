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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class uxa extends d implements gk7 {
    public boolean A0;
    public boolean B0;
    public hxa C0;
    public y1b D0;
    public gxa E;
    public int E0;
    public gxa F;
    public final xia F0;
    public gxa G;
    public wtc G0;
    public qxa H;
    public PorterDuffColorFilter H0;
    public gxa I;
    public int I0;
    public gxa J;
    public gxa K;
    public gxa L;
    public gxa M;
    public gxa N;
    public final ArrayList O;
    public final ArrayList P;
    public final ArrayList Q;
    public final ArrayList R;
    public o72 S;
    public twa T;
    public t26 U;
    public final iq V;
    public ry8 W;
    public ywa X;
    public uwa Y;
    public txa Z;
    public TLRPC.ChatFull a;
    public mf0 a0;
    public final long b;
    public LinearLayout b0;
    public boolean c;
    public final boolean c0;
    public gxa d;
    public final boolean d0;
    public gxa e;
    public final boolean e0;
    public pxa f;
    public long f0;
    public long g0;
    public gxa h;
    public final hd[] h0;
    public rwa i0;
    public kg1 j0;
    public zi1 k0;
    public View l0;
    public FrameLayout m0;
    public gxa n;
    public fm0 n0;
    public final boolean o0;
    public ch6 p0;
    public FrameLayout q0;
    public gxa r;
    public ox4[] r0;
    public gxa s;
    public int s0;
    public final SparseIntArray t0;
    public final SparseIntArray u0;
    public final ArrayList v0;
    public gxa w;
    public final ArrayList w0;
    public gxa x;
    public final ArrayList x0;
    public gxa y;
    public final ArrayList y0;
    public final ArrayList z0;

    public uxa(Bundle bundle) {
        super(bundle);
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.V = new iq(50);
        this.h0 = new hd[1];
        this.s0 = -1;
        this.t0 = new SparseIntArray();
        this.u0 = new SparseIntArray();
        this.v0 = new ArrayList();
        this.w0 = new ArrayList();
        this.x0 = new ArrayList();
        this.y0 = new ArrayList();
        this.z0 = new ArrayList();
        this.B0 = true;
        this.F0 = new xia((Object) this, (byte) 2);
        long j = bundle.getLong("chat_id");
        this.b = j;
        this.c0 = bundle.getBoolean("is_megagroup", false);
        this.d0 = bundle.getBoolean("start_from_boosts", false);
        this.e0 = bundle.getBoolean("start_from_monetization", false);
        this.o0 = bundle.getBoolean("only_boosts", false);
        this.a = getMessagesController().L0(j);
    }

    public static d d0(TLRPC.Chat chat, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z);
        TLRPC.ChatFull L0 = na7.q1(y6c.t0).L0(chat.id);
        return (L0 == null || !(L0.can_view_stats || L0.can_view_stars_revenue)) ? new lo0(-chat.id) : new uxa(bundle);
    }

    public static fk1 e0(JSONObject jSONObject, int i, boolean z) {
        if (i == 0) {
            return new fk1(jSONObject);
        }
        if (i == 1) {
            return new bp3(jSONObject);
        }
        if (i == 2) {
            hma hmaVar = new hma(jSONObject);
            int length = ((ek1) hmaVar.d.get(0)).a.length;
            int size = hmaVar.d.size();
            hmaVar.l = new long[length];
            int i2 = 0;
            while (true) {
                long[] jArr = hmaVar.l;
                if (i2 >= length) {
                    hmaVar.m = new sk4(jArr);
                    return hmaVar;
                }
                jArr[i2] = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    long[] jArr2 = hmaVar.l;
                    jArr2[i2] = jArr2[i2] + ((ek1) hmaVar.d.get(i3)).a[i2];
                }
                i2++;
            }
        } else {
            if (i != 4) {
                return null;
            }
            lma lmaVar = new lma(jSONObject);
            if (z) {
                long[] jArr3 = new long[lmaVar.d.size()];
                int[] iArr = new int[lmaVar.d.size()];
                long j = 0;
                for (int i4 = 0; i4 < lmaVar.d.size(); i4++) {
                    int length2 = lmaVar.a.length;
                    for (int i5 = 0; i5 < length2; i5++) {
                        long j2 = ((ek1) lmaVar.d.get(i4)).a[i5];
                        jArr3[i4] = jArr3[i4] + j2;
                        if (j2 == 0) {
                            iArr[i4] = iArr[i4] + 1;
                        }
                    }
                    j += jArr3[i4];
                }
                ArrayList arrayList = new ArrayList();
                for (int i6 = 0; i6 < lmaVar.d.size(); i6++) {
                    if (jArr3[i6] / j < 0.01d && iArr[i6] > lmaVar.a.length / 2.0f) {
                        arrayList.add((ek1) lmaVar.d.get(i6));
                    }
                }
                int size2 = arrayList.size();
                int i7 = 0;
                while (i7 < size2) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    lmaVar.d.remove((ek1) obj);
                }
            }
            int length3 = ((ek1) lmaVar.d.get(0)).a.length;
            int size3 = lmaVar.d.size();
            lmaVar.l = new long[length3];
            int i8 = 0;
            while (true) {
                long[] jArr4 = lmaVar.l;
                if (i8 >= length3) {
                    new sk4(jArr4);
                    return lmaVar;
                }
                jArr4[i8] = 0;
                for (int i9 = 0; i9 < size3; i9++) {
                    long[] jArr5 = lmaVar.l;
                    jArr5[i8] = jArr5[i8] + ((ek1) lmaVar.d.get(i9)).a[i8];
                }
                i8++;
            }
        }
    }

    public static gxa f0(TL_stats.StatsGraph statsGraph, String str, int i, boolean z) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        gxa gxaVar = new gxa(str, i);
        gxaVar.m = z;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                fk1 e0 = e0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i, z);
                gxaVar.d = e0;
                if (e0 != null) {
                    e0.h = statsGraph.rate;
                }
                gxaVar.g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (e0 == null || (jArr2 = e0.a) == null || jArr2.length < 2) {
                    gxaVar.l = true;
                }
                if (i == 4 && e0 != null && (jArr = e0.a) != null && jArr.length > 0) {
                    long j = jArr[jArr.length - 1];
                    gxaVar.e = new lma(e0, j);
                    gxaVar.c = j;
                    return gxaVar;
                }
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            gxaVar.f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return gxaVar;
    }

    public static void m0(gxa gxaVar, ArrayList arrayList, alb albVar) {
        fk1 fk1Var;
        if (gxaVar == null || (fk1Var = gxaVar.d) == null) {
            return;
        }
        ArrayList arrayList2 = fk1Var.d;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ek1 ek1Var = (ek1) obj;
            int i2 = ek1Var.g;
            if (i2 >= 0) {
                if (!bkb.d1(i2)) {
                    bkb.y1(ek1Var.g, bkb.I == bkb.J ? ek1Var.i : ek1Var.h, false);
                    bkb.gm[ek1Var.g] = ek1Var.h;
                }
                arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, albVar, ek1Var.g));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.o7));
        hashSet.add(Integer.valueOf(bkb.u6));
        hashSet.add(Integer.valueOf(bkb.t6));
        hashSet.add(Integer.valueOf(bkb.l6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.hk));
        hashSet.add(Integer.valueOf(bkb.w6));
        hashSet.add(Integer.valueOf(bkb.a7));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.g5));
        hashSet.add(Integer.valueOf(bkb.Tj));
        hashSet.add(Integer.valueOf(bkb.Sj));
        hashSet.add(Integer.valueOf(bkb.Rj));
        hashSet.add(Integer.valueOf(bkb.Qj));
        hashSet.add(Integer.valueOf(bkb.Pj));
        hashSet.add(Integer.valueOf(bkb.Oj));
        hashSet.add(Integer.valueOf(bkb.i5));
        hashSet.add(Integer.valueOf(bkb.z6));
    }

    public final void b0() {
        txa txaVar = this.Z;
        if (txaVar != null) {
            txaVar.b = true;
        }
        int childCount = this.T.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.T.getChildAt(i);
            if (childAt instanceof fxa) {
                ((fxa) childAt).b.u0.d(false, true);
            }
        }
    }

    public final void c0() {
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        if (this.l0 != null) {
            int L = gl.L(44.0f) + a.getCurrentActionBarHeight() + this.mSystemInsets.b;
            ViewGroup.LayoutParams layoutParams = this.l0.getLayoutParams();
            if (layoutParams.height != L) {
                layoutParams.height = L;
                this.l0.setLayoutParams(layoutParams);
            }
            s0();
        }
        int L2 = this.c ? gl.L(72.0f) : 0;
        gl.v3(this.S.e, 0, ((a.getCurrentActionBarHeight() - gl.L(42.0f)) / 2) + this.mSystemInsets.b, gl.L(6.0f), 0);
        this.q0.setPadding(0, 0, 0, this.mSystemInsets.d);
        twa twaVar = this.T;
        if (twaVar != null) {
            io5 io5Var = this.mSystemInsets;
            dg0.e(twaVar, io5Var.b, io5Var.d, currentActionBarHeight, L2);
        }
        kg1 kg1Var = this.j0;
        if (kg1Var != null) {
            o39 o39Var = kg1Var.G;
            io5 io5Var2 = this.mSystemInsets;
            dg0.e(o39Var, io5Var2.b, io5Var2.d, currentActionBarHeight, L2);
        }
        zi1 zi1Var = this.k0;
        if (zi1Var != null) {
            io5 io5Var3 = this.mSystemInsets;
            int i = io5Var3.b;
            int i2 = io5Var3.d;
            zi1Var.U0 = i;
            zi1Var.V0 = i2;
            zi1Var.W0 = L2;
            int x = b00.x(48.0f, i, -gl.L(8.0f));
            int x2 = b00.x(48.0f, i2, -gl.L(8.0f));
            q5c q5cVar = zi1Var.X0;
            gl.v3(q5cVar, 0, x, 0, x2);
            q5cVar.setPadding(q5cVar.getPaddingLeft(), (a.getCurrentActionBarHeight() + i) - x, q5cVar.getPaddingRight(), (i2 + L2) - x2);
            zi1Var.A(-x, -x2);
            zi1Var.C();
            zi1Var.requestLayout();
            zi1Var.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        FrameLayout frameLayout;
        int i;
        uxa uxaVar = this;
        byte b = 1;
        uxaVar.setHasOwnBackground(true);
        uxaVar.a0 = new mf0((wjb) null);
        na7 q1 = na7.q1(uxaVar.currentAccount);
        long j = uxaVar.b;
        TLRPC.Chat K0 = q1.K0(Long.valueOf(j));
        TLRPC.ChatFull L0 = na7.q1(uxaVar.currentAccount).L0(j);
        boolean z = L0 != null && L0.can_view_stats;
        boolean R = hc2.R(K0);
        boolean z2 = L0 != null && (L0.can_view_revenue || L0.can_view_stars_revenue);
        ArrayList arrayList = new ArrayList(3);
        if (z) {
            arrayList.add(ox4.c(context, uxaVar.resourceProvider, nx4.J, 2131744655));
        }
        arrayList.add(ox4.c(context, uxaVar.resourceProvider, nx4.P, 2131753160));
        if (z2) {
            arrayList.add(ox4.c(context, uxaVar.resourceProvider, nx4.Q, 2131748215));
        }
        uxaVar.r0 = (ox4[]) arrayList.toArray(new ox4[0]);
        ch6 ch6Var = new ch6(context, uxaVar.resourceProvider);
        uxaVar.p0 = ch6Var;
        ch6Var.setPadding(gl.L(12.0f), gl.L(12.0f), gl.L(12.0f), gl.L(12.0f));
        uxaVar.p0.setMaxWidth(gl.L(344.0f));
        uxaVar.p0.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        uxaVar.q0 = frameLayout2;
        frameLayout2.setOnClickListener(new x00(b));
        uxaVar.q0.addView(uxaVar.p0, nme.e(-1, 72, 81));
        uxaVar.q0.setClipToPadding(false);
        int i2 = 0;
        while (true) {
            ox4[] ox4VarArr = uxaVar.r0;
            if (i2 >= ox4VarArr.length) {
                break;
            }
            ox4 ox4Var = ox4VarArr[i2];
            ox4Var.setOnClickListener(new v0(uxaVar, i2, (byte) 25));
            uxaVar.p0.addView(uxaVar.r0[i2]);
            uxaVar.p0.j(ox4Var, true, false);
            i2++;
        }
        uxaVar.i0 = new rwa(uxaVar, uxaVar.getParentActivity());
        FrameLayout frameLayout3 = new FrameLayout(context);
        if (R) {
            kg1 kg1Var = new kg1(uxaVar, -j, uxaVar.getResourceProvider());
            uxaVar.j0 = kg1Var;
            kg1Var.G.setCaptureSectionsDecoratorAllowed(true);
            uxaVar.glassEngine.b(uxaVar.j0.G);
        }
        if (z2) {
            frameLayout = frameLayout3;
            i = -1;
            zi1 zi1Var = new zi1(uxaVar.getParentActivity(), uxaVar, uxaVar.currentAccount, -j, uxaVar.getResourceProvider(), uxaVar.glassEngine, hc2.V(K0) && L0.can_view_revenue, L0.can_view_stars_revenue);
            uxaVar = uxaVar;
            uxaVar.k0 = zi1Var;
            zi1Var.X0.setCaptureSectionsDecoratorAllowed(true);
        } else {
            frameLayout = frameLayout3;
            i = -1;
        }
        boolean z3 = z;
        FrameLayout frameLayout4 = frameLayout;
        uxaVar.i0.setAdapter(new swa(uxaVar, z3, R, z2, frameLayout4));
        boolean z4 = uxaVar.o0;
        boolean z5 = R && !z4;
        uxaVar.c = z5;
        if (z5) {
            if (uxaVar.d0) {
                uxaVar.i0.setPosition(z3 ? 1 : 0);
            } else if (uxaVar.e0) {
                uxaVar.i0.setPosition(((z4 || !R) ? 0 : 1) + (z3 ? 1 : 0));
            }
        }
        uxaVar.o0(uxaVar.i0.getCurrentPosition(), false);
        FrameLayout frameLayout5 = new FrameLayout(uxaVar.getParentActivity());
        frameLayout5.addView(uxaVar.i0, nme.g());
        View view = new View(context);
        uxaVar.l0 = view;
        frameLayout5.addView(view, nme.e(i, 0, 48));
        FrameLayout frameLayout6 = new FrameLayout(context);
        uxaVar.m0 = frameLayout6;
        frameLayout6.setVisibility(4);
        frameLayout5.addView(uxaVar.m0, nme.g());
        frameLayout5.addView(uxaVar.simpleActionBar);
        if (uxaVar.c) {
            uxaVar.setBulletinDelegate(new oy((byte) 12));
            uxaVar.q0.setBackground(uxaVar.getBaseSimpleGlass().b(uxaVar.q0));
            frameLayout5.addView(uxaVar.q0, nme.e(i, -2, 80));
        }
        uxaVar.fragmentView = frameLayout5;
        twa twaVar = new twa(uxaVar, context);
        uxaVar.T = twaVar;
        twaVar.setCaptureSectionsDecoratorAllowed(true);
        uxaVar.T.setSections(true);
        uxaVar.T.setClipToPadding(false);
        uxaVar.glassEngine.b(uxaVar.T);
        uxaVar.T.r1();
        LinearLayout linearLayout = new LinearLayout(context);
        uxaVar.b0 = linearLayout;
        linearLayout.setOrientation(1);
        ry8 ry8Var = new ry8(context);
        uxaVar.W = ry8Var;
        ry8Var.setAutoRepeat(true);
        uxaVar.W.f(R.raw.statistic_preload, 120, 120, null);
        uxaVar.W.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gl.o());
        int i3 = bkb.Ej;
        zkb.X(textView, i3, null);
        textView.setTag(Integer.valueOf(i3));
        textView.setText(k96.M0(2131748585, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i4 = bkb.Fj;
        zkb.X(textView2, i4, null);
        textView2.setTag(Integer.valueOf(i4));
        textView2.setText(k96.M0(2131748584, null));
        textView2.setGravity(1);
        uxaVar.b0.addView(uxaVar.W, nme.t(120, 120, 1, 0, 0, 0, 20));
        uxaVar.b0.addView(textView, nme.t(-2, -2, 1, 0, 0, 0, 10));
        uxaVar.b0.addView(textView2, nme.r(-2, -2, 1));
        frameLayout4.addView(uxaVar.b0, nme.d(kk7.O3, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        ywa ywaVar = uxaVar.X;
        if (ywaVar == null) {
            ywaVar = new ywa(uxaVar);
            uxaVar.X = ywaVar;
        }
        uxaVar.T.setAdapter(ywaVar);
        t26 t26Var = new t26();
        uxaVar.U = t26Var;
        uxaVar.T.setLayoutManager(t26Var);
        uxaVar.Y = new uwa();
        uxaVar.T.setItemAnimator(null);
        byte b2 = 28;
        uxaVar.T.j(new n58(uxaVar, b2));
        byte b3 = 15;
        uxaVar.T.setOnItemClickListener(new f09(uxaVar, b3));
        uxaVar.T.setOnItemLongClickListener(new qwa(uxaVar));
        frameLayout4.addView(uxaVar.T);
        uxaVar.S = new o72(context, null, false, null);
        TLRPC.Chat K02 = uxaVar.getMessagesController().K0(Long.valueOf(j));
        uxaVar.S.setChatAvatar(K02);
        uxaVar.simpleActionBar.setBackButtonDrawable(new ed0(false));
        uxaVar.simpleActionBar.setTitle(K02 == null ? "" : K02.title);
        uxaVar.simpleActionBar.setActionBarMenuOnItemClick(new kk8(uxaVar, b3));
        uxaVar.S.i(bkb.w0(null, i3, false), bkb.w0(null, i4, false));
        boolean z6 = uxaVar.B0;
        xia xiaVar = uxaVar.F0;
        if (z6) {
            uxaVar.b0.setAlpha(0.0f);
            gl.d3(xiaVar, 500L);
            uxaVar.b0.setVisibility(0);
            uxaVar.T.setVisibility(8);
        } else {
            gl.r(xiaVar);
            uxaVar.b0.setVisibility(8);
            uxaVar.T.setVisibility(0);
        }
        il0 c = uxaVar.getBaseSimpleGlass().c.c(uxaVar.p0, nod.g(uxaVar.resourceProvider), false);
        ug8.r(c, gl.L(28.0f), 7.666f);
        uxaVar.p0.setBackground(c);
        uxaVar.glassEngine.c(uxaVar.i0);
        dg0 baseSimpleGlass = uxaVar.getBaseSimpleGlass();
        rwa rwaVar = uxaVar.i0;
        pha phaVar = uxaVar.simpleActionBar;
        wjb wjbVar = uxaVar.resourceProvider;
        baseSimpleGlass.m = frameLayout5;
        baseSimpleGlass.n = rwaVar;
        baseSimpleGlass.a.c(rwaVar);
        baseSimpleGlass.g(frameLayout5, phaVar, wjbVar);
        uxaVar.n0 = new fm0(0, new qwa(uxaVar), s33.h, 380L, false);
        zi1 zi1Var2 = uxaVar.k0;
        if (zi1Var2 != null) {
            dg0 baseSimpleGlass2 = uxaVar.getBaseSimpleGlass();
            View view2 = zi1Var2.a1.d;
            il0 c2 = baseSimpleGlass2.c.c(view2, null, false);
            c2.p(nod.l(zi1Var2.n0));
            c2.q(gl.L(9.66f));
            c2.r(gl.L(18.0f));
            view2.setBackground(c2);
            View transactionTabs = uxaVar.k0.getTransactionTabs();
            ViewGroup.LayoutParams layoutParams = transactionTabs.getLayoutParams();
            gl.B2(transactionTabs);
            uxaVar.m0.addView(transactionTabs, layoutParams);
            uxaVar.k0.setTabsPinnedChangedListener(new z6a(uxaVar, b2));
            uxaVar.n0.a(uxaVar.k0.f0, false);
        }
        frameLayout5.getViewTreeObserver().addOnPreDrawListener(new qr1(uxaVar, (byte) 6));
        uxaVar.getBaseSimpleGlass().o = new pg3(uxaVar, frameLayout5, new jd(frameLayout5, (byte) 2), b);
        uxaVar.getBaseSimpleGlass().n = null;
        uxaVar.simpleActionBar.setBackground(null);
        uxaVar.l0.setBackground(uxaVar.getBaseSimpleGlass().a(uxaVar.l0));
        gl.B2(uxaVar.S.e);
        frameLayout5.addView(uxaVar.S.e, nme.e(42, 42, 53));
        uxaVar.c0();
        uxaVar.fragmentView.setBackgroundColor(uxaVar.getThemedColor(bkb.Z6));
        uxaVar.C0 = new hxa(uxaVar.X, uxaVar.U);
        return uxaVar.fragmentView;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ArrayList arrayList;
        int i3 = 0;
        if (i == kk7.z5) {
            if (((y1b) objArr[0]) == this.D0) {
                l0();
                q0();
                if (this.X != null) {
                    this.T.setItemAnimator(null);
                    this.C0.e();
                    return;
                }
                return;
            }
            return;
        }
        if (i == kk7.W2) {
            if (getParentLayout() != null) {
                TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                List fragmentStack = getParentLayout().getFragmentStack();
                d dVar = fragmentStack.size() >= 2 ? (d) oo1.m(2, fragmentStack) : null;
                if (dVar instanceof p82) {
                    ((ActionBarLayout) getParentLayout()).c0(dVar, false);
                }
                List fragmentStack2 = getParentLayout().getFragmentStack();
                d dVar2 = fragmentStack2.size() >= 2 ? (d) oo1.m(2, fragmentStack2) : null;
                if (!booleanValue) {
                    finishFragment();
                    if (dVar2 instanceof ProfileActivity) {
                        ym0.f(dVar2, chat, false);
                        return;
                    }
                    return;
                }
                d dVar3 = fragmentStack2.size() >= 3 ? (d) oo1.m(3, fragmentStack2) : null;
                if (dVar2 instanceof ProfileActivity) {
                    ((ActionBarLayout) getParentLayout()).c0(dVar2, false);
                }
                finishFragment();
                if (dVar3 instanceof mu1) {
                    ym0.f(dVar3, chat, true);
                    return;
                }
                return;
            }
            return;
        }
        if (i != kk7.C) {
            if (i == kk7.S) {
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
                if (chatFull.id == this.b && this.a == null) {
                    this.a = chatFull;
                    k0();
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
                k27 k27Var = (k27) arrayList2.get(i4);
                int i5 = this.t0.get(k27Var.e1(), -1);
                if (i5 >= 0 && ((rxa) arrayList.get(i5)).b() == k27Var.e1()) {
                    if (k27Var.Z) {
                        arrayList3.add((rxa) arrayList.get(i5));
                    } else {
                        ((rxa) arrayList.get(i5)).b = k27Var;
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
                rxa rxaVar = (rxa) arrayList.get(i3);
                if (rxaVar.b == null) {
                    this.s0 = rxaVar.b();
                    break;
                } else {
                    arrayList4.add(rxaVar);
                    i3++;
                }
            }
            if (arrayList4.size() < 20) {
                j0();
            }
            q0();
            if (this.X != null) {
                this.T.setItemAnimator(null);
                this.C0.e();
            }
        }
    }

    public final void g0(gxa[] gxaVarArr) {
        ywa ywaVar = this.X;
        if (ywaVar != null) {
            ywaVar.E();
            this.T.setItemAnimator(null);
            this.X.f();
        }
        this.B0 = false;
        LinearLayout linearLayout = this.b0;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        gl.r(this.F0);
        this.b0.animate().alpha(0.0f).setDuration(230L).setListener(new ng9((Object) this, (byte) 21));
        this.T.setVisibility(0);
        this.T.setAlpha(0.0f);
        this.T.animate().alpha(1.0f).setDuration(230L).start();
        for (gxa gxaVar : gxaVarArr) {
            if (gxaVar != null && gxaVar.d == null && gxaVar.f != null) {
                gxaVar.a(this.currentAccount, this.classGuid, this.a.stats_dc, new fo1(this, gxaVar, (byte) 1));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        t00 t00Var = new t00(this, (byte) 19);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        arrayList.add(new blb(this.T, 0, new Class[]{hk1.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, bkb.i5));
        if (this.c0) {
            while (i < 6) {
                m0(i == 0 ? this.d : i == 1 ? this.I : i == 2 ? this.J : i == 3 ? this.K : i == 4 ? this.L : this.M, arrayList, t00Var);
                i++;
            }
        } else {
            while (i < 12) {
                m0(i == 0 ? this.d : i == 1 ? this.h : i == 2 ? this.n : i == 3 ? this.r : i == 4 ? this.s : i == 5 ? this.w : i == 6 ? this.y : i == 7 ? this.e : i == 8 ? this.x : i == 9 ? this.E : i == 10 ? this.F : this.G, arrayList, t00Var);
                i++;
            }
        }
        return arrayList;
    }

    public final void h0(TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        byte b = 1;
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i = 0; i < arrayList2.size(); i++) {
                arrayList.add(new k27(this.currentAccount, arrayList2.get(i), false, true));
            }
            getMessagesStorage().g1(arrayList2, false, true, true, 0, false, 0, 0L);
        }
        gl.c3(new nwa(this, arrayList, b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v94 */
    public final void i0(TLObject tLObject) {
        final uxa uxaVar;
        ?? r10;
        String str;
        String str2;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str3;
        int i = 10;
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            final gxa[] gxaVarArr = {f0(tL_broadcastStats.iv_interactions_graph, k96.M0(2131749081, "IVInteractionsChartTitle"), 1, false), f0(tL_broadcastStats.followers_graph, k96.M0(2131750593, "FollowersChartTitle"), 0, false), f0(tL_broadcastStats.top_hours_graph, k96.M0(2131743793, "TopHoursChartTitle"), 0, false), f0(tL_broadcastStats.interactions_graph, k96.M0(2131743288, "ViewsAndSharesChartTitle"), 1, false), f0(tL_broadcastStats.growth_graph, k96.M0(2131749183, "GrowthChartTitle"), 0, false), f0(tL_broadcastStats.views_by_source_graph, k96.M0(2131743287, "ViewsBySourceChartTitle"), 2, false), f0(tL_broadcastStats.new_followers_by_source_graph, k96.M0(2131748082, "NewFollowersBySourceChartTitle"), 2, false), f0(tL_broadcastStats.languages_graph, k96.M0(2131748849, "LanguagesChartTitle"), 4, true), f0(tL_broadcastStats.mute_graph, k96.M0(2131747727, "NotificationsChartTitle"), 0, false), f0(tL_broadcastStats.reactions_by_emotion_graph, k96.M0(2131746192, "ReactionsByEmotionChartTitle"), 2, false), f0(tL_broadcastStats.story_interactions_graph, k96.M0(2131744419, "StoryInteractionsChartTitle"), 1, false), f0(tL_broadcastStats.story_reactions_by_emotion_graph, k96.M0(2131744264, "StoryReactionsByEmotionChartTitle"), 2, false)};
            gxa gxaVar = gxaVarArr[2];
            if (gxaVar != null) {
                gxaVar.n = true;
            }
            pxa pxaVar = new pxa();
            c5a a = pxa.a(tL_broadcastStats.reactions_per_post);
            str2 = "+";
            pxaVar.o = k96.M0(2131746185, "ReactionsPerPost");
            pxaVar.p = (String) a.b;
            pxaVar.q = (String) a.e;
            pxaVar.r = ((Boolean) a.c).booleanValue();
            pxaVar.s = ((Boolean) a.d).booleanValue();
            c5a a2 = pxa.a(tL_broadcastStats.reactions_per_story);
            pxaVar.t = k96.M0(2131746184, "ReactionsPerStory");
            pxaVar.u = (String) a2.b;
            pxaVar.v = (String) a2.e;
            pxaVar.w = ((Boolean) a2.c).booleanValue();
            pxaVar.x = ((Boolean) a2.d).booleanValue();
            c5a a3 = pxa.a(tL_broadcastStats.views_per_story);
            pxaVar.y = k96.M0(2131743285, "ViewsPerStory");
            pxaVar.z = (String) a3.b;
            pxaVar.A = (String) a3.e;
            pxaVar.B = ((Boolean) a3.c).booleanValue();
            pxaVar.C = ((Boolean) a3.d).booleanValue();
            c5a a4 = pxa.a(tL_broadcastStats.shares_per_story);
            pxaVar.D = k96.M0(2131745205, "SharesPerStory");
            pxaVar.E = (String) a4.b;
            pxaVar.F = (String) a4.e;
            pxaVar.G = ((Boolean) a4.c).booleanValue();
            pxaVar.H = ((Boolean) a4.d).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            String str4 = "TopHoursChartTitle";
            double d = tL_statsAbsValueAndPrev.current;
            double d2 = tL_statsAbsValueAndPrev.previous;
            int i2 = (int) (d - d2);
            float abs = d2 == 0.0d ? 0.0f : Math.abs((i2 / ((float) d2)) * 100.0f);
            pxaVar.a = k96.M0(2131750593, "FollowersChartTitle");
            pxaVar.b = gl.o0((int) tL_broadcastStats.followers.current, 0);
            if (i2 == 0 || abs == 0.0f) {
                pxaVar.c = "";
            } else {
                int i3 = (int) abs;
                if (abs == i3) {
                    Locale locale = Locale.ENGLISH;
                    pxaVar.c = ((i2 > 0 ? str2 : "") + gl.o0(i2, 0)) + " (" + i3 + "%)";
                } else {
                    pxaVar.c = String.format(Locale.ENGLISH, "%s (%.1f%s)", (i2 > 0 ? str2 : "") + gl.o0(i2, 0), Float.valueOf(abs), "%");
                }
            }
            pxaVar.d = i2 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_broadcastStats.shares_per_post;
            double d3 = tL_statsAbsValueAndPrev2.current;
            double d4 = tL_statsAbsValueAndPrev2.previous;
            int i4 = (int) (d3 - d4);
            float abs2 = d4 == 0.0d ? 0.0f : Math.abs((i4 / ((float) d4)) * 100.0f);
            pxaVar.i = k96.M0(2131745206, "SharesPerPost");
            pxaVar.j = gl.o0((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i4 == 0 || abs2 == 0.0f) {
                pxaVar.k = "";
            } else {
                int i5 = (int) abs2;
                if (abs2 == i5) {
                    Locale locale2 = Locale.ENGLISH;
                    pxaVar.k = ((i4 > 0 ? str2 : "") + gl.o0(i4, 0)) + " (" + i5 + "%)";
                } else {
                    pxaVar.k = String.format(Locale.ENGLISH, "%s (%.1f%s)", (i4 > 0 ? str2 : "") + gl.o0(i4, 0), Float.valueOf(abs2), "%");
                }
            }
            pxaVar.l = i4 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d5 = tL_statsAbsValueAndPrev3.current;
            double d6 = tL_statsAbsValueAndPrev3.previous;
            int i6 = (int) (d5 - d6);
            float abs3 = d6 == 0.0d ? 0.0f : Math.abs((i6 / ((float) d6)) * 100.0f);
            pxaVar.e = k96.M0(2131743286, "ViewsPerPost");
            pxaVar.f = gl.o0((int) tL_broadcastStats.views_per_post.current, 0);
            if (i6 == 0 || abs3 == 0.0f) {
                pxaVar.g = "";
            } else {
                int i7 = (int) abs3;
                if (abs3 == i7) {
                    Locale locale3 = Locale.ENGLISH;
                    pxaVar.g = ((i6 > 0 ? str2 : "") + gl.o0(i6, 0)) + " (" + i7 + "%)";
                } else {
                    pxaVar.g = String.format(Locale.ENGLISH, "%s (%.1f%s)", (i6 > 0 ? str2 : "") + gl.o0(i6, 0), Float.valueOf(abs3), "%");
                }
            }
            pxaVar.h = i6 >= 0;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            pxaVar.m = k96.M0(2131751131, "EnabledNotifications");
            int i8 = (int) f;
            if (f == i8) {
                Locale locale4 = Locale.ENGLISH;
                pxaVar.n = oo1.n(i8, "%");
            } else {
                pxaVar.n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f), "%");
            }
            uxaVar = this;
            uxaVar.f = pxaVar;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            uxaVar.f0 = tL_statsDateRangeDays.max_date * 1000;
            uxaVar.g0 = tL_statsDateRangeDays.min_date * 1000;
            ArrayList arrayList3 = uxaVar.v0;
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
                rxa rxaVar = new rxa();
                rxaVar.a = postInteractionCounters2;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList3.add(rxaVar);
                    str3 = str4;
                    uxaVar.t0.put(rxaVar.b(), i9);
                    i9++;
                } else {
                    str3 = str4;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList4.add(Integer.valueOf(rxaVar.b()));
                    uxaVar.x0.add(rxaVar);
                    uxaVar.u0.put(rxaVar.b(), i10);
                    i10++;
                }
                size = i13;
                arrayList5 = arrayList6;
                i11 = i12;
                str4 = str3;
            }
            str = str4;
            gl.c3(new nwa(uxaVar, arrayList4, (byte) 0));
            if (arrayList3.size() > 0) {
                int b = ((rxa) arrayList3.get(0)).b();
                int size2 = arrayList3.size();
                ad7 messagesStorage = uxaVar.getMessagesStorage();
                long j = -uxaVar.b;
                int i14 = uxaVar.classGuid;
                messagesStorage.getClass();
                messagesStorage.a.c(new ta7(messagesStorage, qob.d(null, "MessagesStorage.getMessages: storageQueue.postRunnable"), null, j, 0L, size2, b, 0, 0, i14, 0, 0, 0L, 0, true, false));
            }
            r10 = 0;
            final Object[] objArr = 0 == true ? 1 : 0;
            gl.c3(new Runnable(uxaVar) { // from class: owa
                public final /* synthetic */ uxa b;

                {
                    this.b = uxaVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = objArr;
                    gxa[] gxaVarArr2 = gxaVarArr;
                    uxa uxaVar2 = this.b;
                    uxaVar2.getClass();
                    switch (b2) {
                        case 0:
                            uxaVar2.r = gxaVarArr2[0];
                            uxaVar2.h = gxaVarArr2[1];
                            uxaVar2.e = gxaVarArr2[2];
                            uxaVar2.n = gxaVarArr2[3];
                            uxaVar2.d = gxaVarArr2[4];
                            uxaVar2.s = gxaVarArr2[5];
                            uxaVar2.w = gxaVarArr2[6];
                            uxaVar2.x = gxaVarArr2[7];
                            uxaVar2.y = gxaVarArr2[8];
                            uxaVar2.E = gxaVarArr2[9];
                            uxaVar2.F = gxaVarArr2[10];
                            uxaVar2.G = gxaVarArr2[11];
                            uxaVar2.g0(gxaVarArr2);
                            break;
                        default:
                            uxaVar2.d = gxaVarArr2[0];
                            uxaVar2.I = gxaVarArr2[1];
                            uxaVar2.J = gxaVarArr2[2];
                            uxaVar2.K = gxaVarArr2[3];
                            uxaVar2.L = gxaVarArr2[4];
                            uxaVar2.M = gxaVarArr2[5];
                            uxaVar2.e = gxaVarArr2[6];
                            uxaVar2.N = gxaVarArr2[7];
                            uxaVar2.g0(gxaVarArr2);
                            break;
                    }
                }
            });
        } else {
            uxaVar = this;
            r10 = 0;
            str = "TopHoursChartTitle";
            str2 = "+";
        }
        if (tLObject instanceof TL_stats.TL_megagroupStats) {
            TL_stats.TL_megagroupStats tL_megagroupStats = (TL_stats.TL_megagroupStats) tLObject;
            gxa f0 = f0(tL_megagroupStats.growth_graph, k96.M0(2131749183, "GrowthChartTitle"), r10, r10);
            gxa f02 = f0(tL_megagroupStats.members_graph, k96.M0(2131749235, "GroupMembersChartTitle"), r10, r10);
            gxa f03 = f0(tL_megagroupStats.new_members_by_source_graph, k96.M0(2131748079, "NewMembersBySourceChartTitle"), 2, r10);
            gxa f04 = f0(tL_megagroupStats.languages_graph, k96.M0(2131748426, "MembersLanguageChartTitle"), 4, true);
            gxa f05 = f0(tL_megagroupStats.messages_graph, k96.M0(2131748270, "MessagesChartTitle"), 2, r10);
            gxa f06 = f0(tL_megagroupStats.actions_graph, k96.M0(2131754486, "ActionsChartTitle"), 1, r10);
            gxa f07 = f0(tL_megagroupStats.top_hours_graph, k96.M0(2131743793, str), r10, r10);
            gxa f08 = f0(tL_megagroupStats.weekdays_graph, k96.M0(2131743794, "TopDaysOfWeekChartTitle"), 4, r10);
            final gxa[] gxaVarArr2 = new gxa[8];
            gxaVarArr2[r10] = f0;
            gxaVarArr2[1] = f02;
            gxaVarArr2[2] = f03;
            gxaVarArr2[3] = f04;
            gxaVarArr2[4] = f05;
            gxaVarArr2[5] = f06;
            gxaVarArr2[6] = f07;
            gxaVarArr2[7] = f08;
            gxa gxaVar2 = gxaVarArr2[6];
            if (gxaVar2 != null) {
                gxaVar2.n = true;
            }
            gxa gxaVar3 = gxaVarArr2[7];
            if (gxaVar3 != null) {
                gxaVar3.o = true;
            }
            qxa qxaVar = new qxa();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev4 = tL_megagroupStats.members;
            double d7 = tL_statsAbsValueAndPrev4.current;
            double d8 = tL_statsAbsValueAndPrev4.previous;
            int i15 = (int) (d7 - d8);
            float abs4 = d8 == 0.0d ? 0.0f : Math.abs((i15 / ((float) d8)) * 100.0f);
            qxaVar.a = k96.M0(2131748425, "MembersOverviewTitle");
            qxaVar.b = gl.o0((int) tL_megagroupStats.members.current, 0);
            if (i15 == 0 || abs4 == 0.0f) {
                qxaVar.c = "";
            } else {
                int i16 = (int) abs4;
                if (abs4 == i16) {
                    Locale locale5 = Locale.ENGLISH;
                    qxaVar.c = ((i15 > 0 ? str2 : "") + gl.o0(i15, 0)) + " (" + i16 + "%)";
                } else {
                    qxaVar.c = String.format(Locale.ENGLISH, "%s (%.1f%s)", (i15 > 0 ? str2 : "") + gl.o0(i15, 0), Float.valueOf(abs4), "%");
                }
            }
            qxaVar.d = i15 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev5 = tL_megagroupStats.viewers;
            double d9 = tL_statsAbsValueAndPrev5.current;
            double d10 = tL_statsAbsValueAndPrev5.previous;
            int i17 = (int) (d9 - d10);
            float abs5 = d10 == 0.0d ? 0.0f : Math.abs((i17 / ((float) d10)) * 100.0f);
            qxaVar.i = k96.M0(2131743290, "ViewingMembers");
            qxaVar.j = gl.o0((int) tL_megagroupStats.viewers.current, 0);
            if (i17 == 0 || abs5 == 0.0f) {
                qxaVar.k = "";
            } else {
                Locale locale6 = Locale.ENGLISH;
                qxaVar.k = (i17 > 0 ? str2 : "") + gl.o0(i17, 0);
            }
            qxaVar.l = i17 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d11 = tL_statsAbsValueAndPrev6.current;
            double d12 = tL_statsAbsValueAndPrev6.previous;
            int i18 = (int) (d11 - d12);
            float abs6 = d12 == 0.0d ? 0.0f : Math.abs((i18 / ((float) d12)) * 100.0f);
            qxaVar.m = k96.M0(2131746876, "PostingMembers");
            qxaVar.n = gl.o0((int) tL_megagroupStats.posters.current, 0);
            if (i18 == 0 || abs6 == 0.0f) {
                qxaVar.o = "";
            } else {
                Locale locale7 = Locale.ENGLISH;
                qxaVar.o = (i18 > 0 ? str2 : "") + gl.o0(i18, 0);
            }
            qxaVar.p = i18 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d13 = tL_statsAbsValueAndPrev7.current;
            double d14 = tL_statsAbsValueAndPrev7.previous;
            int i19 = (int) (d13 - d14);
            float abs7 = d14 == 0.0d ? 0.0f : Math.abs((i19 / ((float) d14)) * 100.0f);
            qxaVar.e = k96.M0(2131748261, "MessagesOverview");
            qxaVar.f = gl.o0((int) tL_megagroupStats.messages.current, 0);
            if (i19 == 0 || abs7 == 0.0f) {
                qxaVar.g = "";
            } else {
                Locale locale8 = Locale.ENGLISH;
                qxaVar.g = (i19 > 0 ? str2 : "") + gl.o0(i19, 0);
            }
            qxaVar.h = i19 >= 0;
            uxaVar.H = qxaVar;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            uxaVar.f0 = tL_statsDateRangeDays2.max_date * 1000;
            uxaVar.g0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList7 = tL_megagroupStats.top_posters;
            if (arrayList7 != null && !arrayList7.isEmpty()) {
                int i20 = 0;
                while (true) {
                    int size3 = tL_megagroupStats.top_posters.size();
                    arrayList = uxaVar.O;
                    arrayList2 = uxaVar.P;
                    if (i20 >= size3) {
                        break;
                    }
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i20);
                    ArrayList<TLRPC.User> arrayList8 = tL_megagroupStats.users;
                    nxa nxaVar = new nxa();
                    nxaVar.a = nxa.a(arrayList8, tL_statsGroupTopPoster.user_id);
                    StringBuilder sb = new StringBuilder();
                    int i21 = tL_statsGroupTopPoster.messages;
                    if (i21 > 0) {
                        sb.append(k96.G(i21, "messages", new Object[0]));
                    }
                    if (tL_statsGroupTopPoster.avg_chars > 0) {
                        if (sb.length() > 0) {
                            sb.append(", ");
                        }
                        sb.append(k96.a0("CharactersPerMessage", null, 2131752242, k96.G(tL_statsGroupTopPoster.avg_chars, "Characters", new Object[0])));
                    }
                    nxaVar.b = sb.toString();
                    int i22 = i;
                    if (arrayList2.size() < i22) {
                        arrayList2.add(nxaVar);
                    }
                    arrayList.add(nxaVar);
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
                    nxa nxaVar2 = new nxa();
                    nxaVar2.a = nxa.a(arrayList10, tL_statsGroupTopAdmin.user_id);
                    StringBuilder sb2 = new StringBuilder();
                    int i24 = tL_statsGroupTopAdmin.deleted;
                    if (i24 > 0) {
                        sb2.append(k96.G(i24, "Deletions", new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.banned > 0) {
                        if (sb2.length() > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(k96.G(tL_statsGroupTopAdmin.banned, "Bans", new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.kicked > 0) {
                        if (sb2.length() > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(k96.G(tL_statsGroupTopAdmin.kicked, "Restrictions", new Object[0]));
                    }
                    nxaVar2.b = sb2.toString();
                    uxaVar.R.add(nxaVar2);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList11 = tL_megagroupStats.top_inviters;
            if (arrayList11 != null && !arrayList11.isEmpty()) {
                for (int i25 = 0; i25 < tL_megagroupStats.top_inviters.size(); i25++) {
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i25);
                    ArrayList<TLRPC.User> arrayList12 = tL_megagroupStats.users;
                    nxa nxaVar3 = new nxa();
                    nxaVar3.a = nxa.a(arrayList12, tL_statsGroupTopInviter.user_id);
                    int i26 = tL_statsGroupTopInviter.invitations;
                    if (i26 > 0) {
                        nxaVar3.b = k96.G(i26, "Invitations", new Object[0]);
                    } else {
                        nxaVar3.b = "";
                    }
                    uxaVar.Q.add(nxaVar3);
                }
            }
            final byte b2 = 1;
            gl.c3(new Runnable(uxaVar) { // from class: owa
                public final /* synthetic */ uxa b;

                {
                    this.b = uxaVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b22 = b2;
                    gxa[] gxaVarArr22 = gxaVarArr2;
                    uxa uxaVar2 = this.b;
                    uxaVar2.getClass();
                    switch (b22) {
                        case 0:
                            uxaVar2.r = gxaVarArr22[0];
                            uxaVar2.h = gxaVarArr22[1];
                            uxaVar2.e = gxaVarArr22[2];
                            uxaVar2.n = gxaVarArr22[3];
                            uxaVar2.d = gxaVarArr22[4];
                            uxaVar2.s = gxaVarArr22[5];
                            uxaVar2.w = gxaVarArr22[6];
                            uxaVar2.x = gxaVarArr22[7];
                            uxaVar2.y = gxaVarArr22[8];
                            uxaVar2.E = gxaVarArr22[9];
                            uxaVar2.F = gxaVarArr22[10];
                            uxaVar2.G = gxaVarArr22[11];
                            uxaVar2.g0(gxaVarArr22);
                            break;
                        default:
                            uxaVar2.d = gxaVarArr22[0];
                            uxaVar2.I = gxaVarArr22[1];
                            uxaVar2.J = gxaVarArr22[2];
                            uxaVar2.K = gxaVarArr22[3];
                            uxaVar2.L = gxaVarArr22[4];
                            uxaVar2.M = gxaVarArr22[5];
                            uxaVar2.e = gxaVarArr22[6];
                            uxaVar2.N = gxaVarArr22[7];
                            uxaVar2.g0(gxaVarArr22);
                            break;
                    }
                }
            });
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        return bm2.h(bkb.w0(null, bkb.c6, false)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        rwa rwaVar;
        if (motionEvent != null && this.k0 != null && (rwaVar = this.i0) != null) {
            View currentView = rwaVar.getCurrentView();
            zi1 zi1Var = this.k0;
            if (currentView == zi1Var && zi1Var.H((motionEvent.getX() - this.i0.getX()) - this.k0.getX(), (motionEvent.getY() - this.i0.getY()) - this.k0.getY())) {
                return false;
            }
        }
        rwa rwaVar2 = this.i0;
        if (rwaVar2 == null || (rwaVar2.b == 0 && rwaVar2.c == 1.0f)) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public final void j0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.id = new ArrayList<>();
        ArrayList arrayList = this.v0;
        int size = arrayList.size();
        byte b = 0;
        int i = 0;
        for (int i2 = this.t0.get(this.s0); i2 < size; i2++) {
            if (((rxa) arrayList.get(i2)).b == null) {
                tL_channels_getMessages.id.add(Integer.valueOf(((rxa) arrayList.get(i2)).b()));
                i++;
                if (i > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = na7.q1(this.currentAccount).f1(this.b);
        this.A0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new mwa(this, b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.o0) {
            return;
        }
        boolean z = this.c0;
        long j = this.b;
        if (z) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = na7.q1(this.currentAccount).f1(j);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = na7.q1(this.currentAccount).f1(j);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new mwa(this, (byte) 1), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
    }

    public final void l0() {
        ArrayList arrayList = this.y0;
        arrayList.clear();
        ArrayList arrayList2 = this.x0;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            rxa rxaVar = (rxa) obj;
            k27 f = this.D0.f(rxaVar.b());
            if (f != null) {
                rxaVar.b = f;
                arrayList.add(rxaVar);
            }
        }
        this.u0.clear();
        arrayList2.clear();
    }

    public final void n0(View view) {
        if (view instanceof fxa) {
            return;
        }
        if (!(view instanceof b9a) || this.T.c1()) {
            if (view instanceof hk1) {
                ((hk1) view).a();
                return;
            }
            return;
        }
        Drawable background = view.getBackground();
        if (background instanceof fm2) {
            fm2 fm2Var = (fm2) background;
            if ((fm2Var.a instanceof ColorDrawable) && fm2Var.b != null) {
                int w0 = bkb.w0(null, bkb.a7, false);
                if (this.H0 == null || this.I0 != w0) {
                    this.I0 = w0;
                    this.H0 = new PorterDuffColorFilter(w0, PorterDuff.Mode.MULTIPLY);
                }
                ((ColorDrawable) fm2Var.a).setColor(bkb.w0(null, bkb.Z6, false));
                fm2Var.b.setColorFilter(this.H0);
                view.invalidate();
                return;
            }
        }
        fm2 fm2Var2 = new fm2(new ColorDrawable(bkb.w0(null, bkb.Z6, false)), bkb.W0(org.telegram.messenger.a.b, R.drawable.greydivider, bkb.a7), 0, 0);
        fm2Var2.x = true;
        view.setBackground(fm2Var2);
    }

    public final void o0(int i, boolean z) {
        int i2 = 0;
        while (true) {
            ox4[] ox4VarArr = this.r0;
            if (i2 >= ox4VarArr.length) {
                return;
            }
            ox4VarArr[i2].f(i2 == i, z);
            i2++;
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        wtc wtcVar = this.G0;
        if (wtcVar != null) {
            wtcVar.a();
            this.G0 = null;
        }
        kk7 notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        wtc wtcVar2 = new wtc(notificationCenter, this);
        wtcVar2.b(kk7.C);
        wtcVar2.b(kk7.S);
        wtcVar2.b(kk7.W2);
        wtcVar2.b(kk7.z5);
        this.G0 = wtcVar2;
        g2b M1 = getMessagesController().M1();
        long j = this.b;
        y1b z = M1.z(2, -1, -j, true);
        this.D0 = z;
        if (z != null) {
            this.E0 = z.o();
        }
        if (this.a != null) {
            k0();
        } else {
            na7.q1(this.currentAccount).Y2(this.classGuid, j, true);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        wtc wtcVar = this.G0;
        if (wtcVar != null) {
            wtcVar.a();
            this.G0 = null;
        }
        hd[] hdVarArr = this.h0;
        hd hdVar = hdVarArr[0];
        if (hdVar != null) {
            hdVar.dismiss();
            hdVarArr[0] = null;
        }
        y1b y1bVar = this.D0;
        if (y1bVar != null) {
            y1bVar.z(this.E0);
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onInsets(int i, int i2, int i3, int i4) {
        c0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            o72 o72Var = this.S;
            if (o72Var != null) {
                o72Var.i(bkb.w0(null, bkb.Ej, false), bkb.w0(null, bkb.Fj, false));
            }
            r0();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void p0(boolean z, float f) {
        for (int i = 0; i < this.r0.length; i++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i - f));
            ox4 ox4Var = this.r0[i];
            ox4Var.K = max;
            ox4Var.J = z;
            ox4Var.invalidate();
        }
        this.p0.invalidate();
    }

    public final void q0() {
        ArrayList arrayList = this.z0;
        arrayList.clear();
        arrayList.addAll(this.w0);
        arrayList.addAll(this.y0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$-CC.comparingLong(new td((byte) 4))));
    }

    public final void r0() {
        twa twaVar;
        twa twaVar2;
        twa twaVar3;
        twa twaVar4;
        twa twaVar5 = this.T;
        if (twaVar5 != null) {
            int childCount = twaVar5.getChildCount();
            int i = 0;
            int i2 = 0;
            while (true) {
                twaVar = this.T;
                if (i2 >= childCount) {
                    break;
                }
                n0(twaVar.getChildAt(i2));
                i2++;
            }
            int hiddenChildCount = twaVar.getHiddenChildCount();
            int i3 = 0;
            while (true) {
                twaVar2 = this.T;
                if (i3 >= hiddenChildCount) {
                    break;
                }
                n0(twaVar2.W(i3));
                i3++;
            }
            int cachedChildCount = twaVar2.getCachedChildCount();
            int i4 = 0;
            while (true) {
                twaVar3 = this.T;
                if (i4 >= cachedChildCount) {
                    break;
                }
                n0(twaVar3.P(i4));
                i4++;
            }
            int attachedScrapChildCount = twaVar3.getAttachedScrapChildCount();
            while (true) {
                twaVar4 = this.T;
                if (i >= attachedScrapChildCount) {
                    break;
                }
                n0(twaVar4.O(i));
                i++;
            }
            twaVar4.getRecycledViewPool().a();
        }
        mf0 mf0Var = this.a0;
        if (mf0Var != null) {
            mf0Var.b = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s0() {
        boolean z;
        float f;
        if (this.l0 == null || this.m0 == null) {
            return;
        }
        zi1 zi1Var = this.k0;
        if (zi1Var != null && zi1Var.getParent() == this.i0) {
            zi1 zi1Var2 = this.k0;
            if (zi1Var2.getVisibility() == 0 && zi1Var2.Y0.getVisibility() != 0) {
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
                fm0 fm0Var = this.n0;
                this.l0.setTranslationY((-(1.0f - ((fm0Var != null ? fm0Var.e : 0.0f) * f))) * gl.L(44.0f));
            }
        }
        z = false;
        if (z) {
        }
        this.m0.setVisibility((z || f <= 0.0f) ? 4 : 0);
        fm0 fm0Var2 = this.n0;
        this.l0.setTranslationY((-(1.0f - ((fm0Var2 != null ? fm0Var2.e : 0.0f) * f))) * gl.L(44.0f));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
