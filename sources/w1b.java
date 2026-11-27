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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class w1b extends e implements fn7 {
    public boolean A0;
    public boolean B0;
    public j1b C0;
    public v5b D0;
    public i1b E;
    public int E0;
    public i1b F;
    public final bva F0;
    public i1b G;
    public u8a G0;
    public s1b H;
    public PorterDuffColorFilter H0;
    public i1b I;
    public int I0;
    public i1b J;
    public i1b K;
    public i1b L;
    public i1b M;
    public i1b N;
    public final ArrayList O;
    public final ArrayList P;
    public final ArrayList Q;
    public final ArrayList R;
    public f82 S;
    public w0b T;
    public x46 U;
    public final jq V;
    public e29 W;
    public b1b X;
    public x0b Y;
    public v1b Z;
    public TLRPC.ChatFull a;
    public of0 a0;
    public final long b;
    public LinearLayout b0;
    public boolean c;
    public final boolean c0;
    public i1b d;
    public final boolean d0;
    public i1b e;
    public final boolean e0;
    public r1b f;
    public long f0;
    public long g0;
    public i1b h;
    public final id[] h0;
    public u0b i0;
    public tg1 j0;
    public ij1 k0;
    public View l0;
    public FrameLayout m0;
    public i1b n;
    public fm0 n0;
    public final boolean o0;
    public hj6 p0;
    public FrameLayout q0;
    public i1b r;
    public uz4[] r0;
    public i1b s;
    public int s0;
    public final SparseIntArray t0;
    public final SparseIntArray u0;
    public final ArrayList v0;
    public i1b w;
    public final ArrayList w0;
    public i1b x;
    public final ArrayList x0;
    public i1b y;
    public final ArrayList y0;
    public final ArrayList z0;

    public w1b(Bundle bundle) {
        super(bundle);
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.V = new jq(50);
        this.h0 = new id[1];
        this.s0 = -1;
        this.t0 = new SparseIntArray();
        this.u0 = new SparseIntArray();
        this.v0 = new ArrayList();
        this.w0 = new ArrayList();
        this.x0 = new ArrayList();
        this.y0 = new ArrayList();
        this.z0 = new ArrayList();
        this.B0 = true;
        this.F0 = new bva((Object) this, (byte) 1);
        long j = bundle.getLong("chat_id");
        this.b = j;
        this.c0 = bundle.getBoolean("is_megagroup", false);
        this.d0 = bundle.getBoolean("start_from_boosts", false);
        this.e0 = bundle.getBoolean("start_from_monetization", false);
        this.o0 = bundle.getBoolean("only_boosts", false);
        this.a = getMessagesController().N0(j);
    }

    public static e d0(TLRPC.Chat chat, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z);
        TLRPC.ChatFull N0 = uc7.s1(yac.t0).N0(chat.id);
        return (N0 == null || !(N0.can_view_stats || N0.can_view_stars_revenue)) ? new lo0(-chat.id) : new w1b(bundle);
    }

    public static ok1 e0(JSONObject jSONObject, int i, boolean z) {
        if (i == 0) {
            return new ok1(jSONObject);
        }
        if (i == 1) {
            return new sp3(jSONObject);
        }
        if (i == 2) {
            eqa eqaVar = new eqa(jSONObject);
            int length = ((nk1) eqaVar.d.get(0)).a.length;
            int size = eqaVar.d.size();
            eqaVar.l = new long[length];
            int i2 = 0;
            while (true) {
                long[] jArr = eqaVar.l;
                if (i2 >= length) {
                    eqaVar.m = new ym4(jArr);
                    return eqaVar;
                }
                jArr[i2] = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    long[] jArr2 = eqaVar.l;
                    jArr2[i2] = jArr2[i2] + ((nk1) eqaVar.d.get(i3)).a[i2];
                }
                i2++;
            }
        } else {
            if (i != 4) {
                return null;
            }
            iqa iqaVar = new iqa(jSONObject);
            if (z) {
                long[] jArr3 = new long[iqaVar.d.size()];
                int[] iArr = new int[iqaVar.d.size()];
                long j = 0;
                for (int i4 = 0; i4 < iqaVar.d.size(); i4++) {
                    int length2 = iqaVar.a.length;
                    for (int i5 = 0; i5 < length2; i5++) {
                        long j2 = ((nk1) iqaVar.d.get(i4)).a[i5];
                        jArr3[i4] = jArr3[i4] + j2;
                        if (j2 == 0) {
                            iArr[i4] = iArr[i4] + 1;
                        }
                    }
                    j += jArr3[i4];
                }
                ArrayList arrayList = new ArrayList();
                for (int i6 = 0; i6 < iqaVar.d.size(); i6++) {
                    if (jArr3[i6] / j < 0.01d && iArr[i6] > iqaVar.a.length / 2.0f) {
                        arrayList.add((nk1) iqaVar.d.get(i6));
                    }
                }
                int size2 = arrayList.size();
                int i7 = 0;
                while (i7 < size2) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    iqaVar.d.remove((nk1) obj);
                }
            }
            int length3 = ((nk1) iqaVar.d.get(0)).a.length;
            int size3 = iqaVar.d.size();
            iqaVar.l = new long[length3];
            int i8 = 0;
            while (true) {
                long[] jArr4 = iqaVar.l;
                if (i8 >= length3) {
                    new ym4(jArr4);
                    return iqaVar;
                }
                jArr4[i8] = 0;
                for (int i9 = 0; i9 < size3; i9++) {
                    long[] jArr5 = iqaVar.l;
                    jArr5[i8] = jArr5[i8] + ((nk1) iqaVar.d.get(i9)).a[i8];
                }
                i8++;
            }
        }
    }

    public static i1b f0(TL_stats.StatsGraph statsGraph, String str, int i, boolean z) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        i1b i1bVar = new i1b(str, i);
        i1bVar.m = z;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                ok1 e0 = e0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i, z);
                i1bVar.d = e0;
                if (e0 != null) {
                    e0.h = statsGraph.rate;
                }
                i1bVar.g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (e0 == null || (jArr2 = e0.a) == null || jArr2.length < 2) {
                    i1bVar.l = true;
                }
                if (i == 4 && e0 != null && (jArr = e0.a) != null && jArr.length > 0) {
                    long j = jArr[jArr.length - 1];
                    i1bVar.e = new iqa(e0, j);
                    i1bVar.c = j;
                    return i1bVar;
                }
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            i1bVar.f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return i1bVar;
    }

    public static void m0(i1b i1bVar, ArrayList arrayList, zob zobVar) {
        ok1 ok1Var;
        if (i1bVar == null || (ok1Var = i1bVar.d) == null) {
            return;
        }
        ArrayList arrayList2 = ok1Var.d;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            nk1 nk1Var = (nk1) obj;
            int i2 = nk1Var.g;
            if (i2 >= 0) {
                if (!aob.d1(i2)) {
                    aob.y1(nk1Var.g, aob.I == aob.J ? nk1Var.i : nk1Var.h, false);
                    aob.hm[nk1Var.g] = nk1Var.h;
                }
                arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, zobVar, nk1Var.g));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.p7));
        hashSet.add(Integer.valueOf(aob.v6));
        hashSet.add(Integer.valueOf(aob.u6));
        hashSet.add(Integer.valueOf(aob.m6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.ik));
        hashSet.add(Integer.valueOf(aob.x6));
        hashSet.add(Integer.valueOf(aob.b7));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.h5));
        hashSet.add(Integer.valueOf(aob.Uj));
        hashSet.add(Integer.valueOf(aob.Tj));
        hashSet.add(Integer.valueOf(aob.Sj));
        hashSet.add(Integer.valueOf(aob.Rj));
        hashSet.add(Integer.valueOf(aob.Qj));
        hashSet.add(Integer.valueOf(aob.Pj));
        hashSet.add(Integer.valueOf(aob.j5));
        hashSet.add(Integer.valueOf(aob.A6));
    }

    public final void b0() {
        v1b v1bVar = this.Z;
        if (v1bVar != null) {
            v1bVar.b = true;
        }
        int childCount = this.T.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.T.getChildAt(i);
            if (childAt instanceof h1b) {
                ((h1b) childAt).b.u0.d(false, true);
            }
        }
    }

    public final void c0() {
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        if (this.l0 != null) {
            int L = hl.L(44.0f) + a.getCurrentActionBarHeight() + this.mSystemInsets.b;
            ViewGroup.LayoutParams layoutParams = this.l0.getLayoutParams();
            if (layoutParams.height != L) {
                layoutParams.height = L;
                this.l0.setLayoutParams(layoutParams);
            }
            s0();
        }
        int L2 = this.c ? hl.L(72.0f) : 0;
        hl.v3(this.S.e, 0, ((a.getCurrentActionBarHeight() - hl.L(42.0f)) / 2) + this.mSystemInsets.b, hl.L(6.0f), 0);
        this.q0.setPadding(0, 0, 0, this.mSystemInsets.d);
        w0b w0bVar = this.T;
        if (w0bVar != null) {
            mq5 mq5Var = this.mSystemInsets;
            eg0.g(w0bVar, mq5Var.b, mq5Var.d, currentActionBarHeight, L2);
        }
        tg1 tg1Var = this.j0;
        if (tg1Var != null) {
            d79 d79Var = tg1Var.G;
            mq5 mq5Var2 = this.mSystemInsets;
            eg0.g(d79Var, mq5Var2.b, mq5Var2.d, currentActionBarHeight, L2);
        }
        ij1 ij1Var = this.k0;
        if (ij1Var != null) {
            mq5 mq5Var3 = this.mSystemInsets;
            int i = mq5Var3.b;
            int i2 = mq5Var3.d;
            ij1Var.U0 = i;
            ij1Var.V0 = i2;
            ij1Var.W0 = L2;
            int y = c00.y(48.0f, i, -hl.L(8.0f));
            int y2 = c00.y(48.0f, i2, -hl.L(8.0f));
            q9c q9cVar = ij1Var.X0;
            hl.v3(q9cVar, 0, y, 0, y2);
            q9cVar.setPadding(q9cVar.getPaddingLeft(), (a.getCurrentActionBarHeight() + i) - y, q9cVar.getPaddingRight(), (i2 + L2) - y2);
            ij1Var.A(-y, -y2);
            ij1Var.C();
            ij1Var.requestLayout();
            ij1Var.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        FrameLayout frameLayout;
        int i;
        w1b w1bVar = this;
        byte b = 1;
        w1bVar.setHasOwnBackground(true);
        w1bVar.a0 = new of0((vnb) null);
        uc7 s1 = uc7.s1(w1bVar.currentAccount);
        long j = w1bVar.b;
        TLRPC.Chat M0 = s1.M0(Long.valueOf(j));
        TLRPC.ChatFull N0 = uc7.s1(w1bVar.currentAccount).N0(j);
        boolean z = N0 != null && N0.can_view_stats;
        boolean R = xc2.R(M0);
        boolean z2 = N0 != null && (N0.can_view_revenue || N0.can_view_stars_revenue);
        ArrayList arrayList = new ArrayList(3);
        if (z) {
            arrayList.add(uz4.c(context, w1bVar.resourceProvider, tz4.K, 2131744549));
        }
        arrayList.add(uz4.c(context, w1bVar.resourceProvider, tz4.Q, 2131753156));
        if (z2) {
            arrayList.add(uz4.c(context, w1bVar.resourceProvider, tz4.R, 2131748161));
        }
        w1bVar.r0 = (uz4[]) arrayList.toArray(new uz4[0]);
        hj6 hj6Var = new hj6(context, w1bVar.resourceProvider);
        w1bVar.p0 = hj6Var;
        hj6Var.setPadding(hl.L(12.0f), hl.L(12.0f), hl.L(12.0f), hl.L(12.0f));
        w1bVar.p0.setMaxWidth(hl.L(344.0f));
        w1bVar.p0.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        w1bVar.q0 = frameLayout2;
        frameLayout2.setOnClickListener(new y00(b));
        w1bVar.q0.addView(w1bVar.p0, tre.e(-1, 72, 81));
        w1bVar.q0.setClipToPadding(false);
        int i2 = 0;
        while (true) {
            uz4[] uz4VarArr = w1bVar.r0;
            if (i2 >= uz4VarArr.length) {
                break;
            }
            uz4 uz4Var = uz4VarArr[i2];
            uz4Var.setOnClickListener(new w0(w1bVar, i2, (byte) 26));
            w1bVar.p0.addView(w1bVar.r0[i2]);
            w1bVar.p0.j(uz4Var, true, false);
            i2++;
        }
        w1bVar.i0 = new u0b(w1bVar, w1bVar.getParentActivity());
        FrameLayout frameLayout3 = new FrameLayout(context);
        if (R) {
            tg1 tg1Var = new tg1(w1bVar, -j, w1bVar.getResourceProvider());
            w1bVar.j0 = tg1Var;
            tg1Var.G.setCaptureSectionsDecoratorAllowed(true);
            w1bVar.glassEngine.b(w1bVar.j0.G);
        }
        if (z2) {
            frameLayout = frameLayout3;
            i = -1;
            ij1 ij1Var = new ij1(w1bVar.getParentActivity(), w1bVar, w1bVar.currentAccount, -j, w1bVar.getResourceProvider(), w1bVar.glassEngine, xc2.V(M0) && N0.can_view_revenue, N0.can_view_stars_revenue);
            w1bVar = w1bVar;
            w1bVar.k0 = ij1Var;
            ij1Var.X0.setCaptureSectionsDecoratorAllowed(true);
        } else {
            frameLayout = frameLayout3;
            i = -1;
        }
        boolean z3 = z;
        FrameLayout frameLayout4 = frameLayout;
        w1bVar.i0.setAdapter(new v0b(w1bVar, z3, R, z2, frameLayout4));
        boolean z4 = w1bVar.o0;
        boolean z5 = R && !z4;
        w1bVar.c = z5;
        if (z5) {
            if (w1bVar.d0) {
                w1bVar.i0.setPosition(z3 ? 1 : 0);
            } else if (w1bVar.e0) {
                w1bVar.i0.setPosition(((z4 || !R) ? 0 : 1) + (z3 ? 1 : 0));
            }
        }
        w1bVar.o0(w1bVar.i0.getCurrentPosition(), false);
        FrameLayout frameLayout5 = new FrameLayout(w1bVar.getParentActivity());
        frameLayout5.addView(w1bVar.i0, tre.g());
        View view = new View(context);
        w1bVar.l0 = view;
        frameLayout5.addView(view, tre.e(i, 0, 48));
        FrameLayout frameLayout6 = new FrameLayout(context);
        w1bVar.m0 = frameLayout6;
        frameLayout6.setVisibility(4);
        frameLayout5.addView(w1bVar.m0, tre.g());
        frameLayout5.addView(w1bVar.simpleActionBar);
        if (w1bVar.c) {
            w1bVar.setBulletinDelegate(new py((byte) 12));
            w1bVar.q0.setBackground(w1bVar.getBaseSimpleGlass().b(w1bVar.q0));
            frameLayout5.addView(w1bVar.q0, tre.e(i, -2, 80));
        }
        w1bVar.fragmentView = frameLayout5;
        w0b w0bVar = new w0b(w1bVar, context);
        w1bVar.T = w0bVar;
        w0bVar.setCaptureSectionsDecoratorAllowed(true);
        w1bVar.T.setSections(true);
        w1bVar.T.setClipToPadding(false);
        w1bVar.glassEngine.b(w1bVar.T);
        w1bVar.T.s1();
        LinearLayout linearLayout = new LinearLayout(context);
        w1bVar.b0 = linearLayout;
        linearLayout.setOrientation(1);
        e29 e29Var = new e29(context);
        w1bVar.W = e29Var;
        e29Var.setAutoRepeat(true);
        w1bVar.W.f(R.raw.statistic_preload, jn7.E1, jn7.E1, null);
        w1bVar.W.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(hl.o());
        int i3 = aob.Fj;
        yob.X(textView, i3, null);
        textView.setTag(Integer.valueOf(i3));
        textView.setText(ob6.M0(2131748531, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i4 = aob.Gj;
        yob.X(textView2, i4, null);
        textView2.setTag(Integer.valueOf(i4));
        textView2.setText(ob6.M0(2131748530, null));
        textView2.setGravity(1);
        w1bVar.b0.addView(w1bVar.W, tre.t(jn7.E1, jn7.E1, 1, 0, 0, 0, 20));
        w1bVar.b0.addView(textView, tre.t(-2, -2, 1, 0, 0, 0, 10));
        w1bVar.b0.addView(textView2, tre.r(-2, -2, 1));
        frameLayout4.addView(w1bVar.b0, tre.d(jn7.O3, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        b1b b1bVar = w1bVar.X;
        if (b1bVar == null) {
            b1bVar = new b1b(w1bVar);
            w1bVar.X = b1bVar;
        }
        w1bVar.T.setAdapter(b1bVar);
        x46 x46Var = new x46();
        w1bVar.U = x46Var;
        w1bVar.T.setLayoutManager(x46Var);
        w1bVar.Y = new x0b();
        w1bVar.T.setItemAnimator(null);
        w1bVar.T.j(new e98(w1bVar, (byte) 28));
        byte b2 = 15;
        w1bVar.T.setOnItemClickListener(new t39(w1bVar, b2));
        w1bVar.T.setOnItemLongClickListener(new t0b(w1bVar));
        frameLayout4.addView(w1bVar.T);
        w1bVar.S = new f82(context, null, false, null);
        TLRPC.Chat M02 = w1bVar.getMessagesController().M0(Long.valueOf(j));
        w1bVar.S.setChatAvatar(M02);
        w1bVar.simpleActionBar.setBackButtonDrawable(new gd0(false));
        w1bVar.simpleActionBar.setTitle(M02 == null ? "" : M02.title);
        w1bVar.simpleActionBar.setActionBarMenuOnItemClick(new rn8(w1bVar, (byte) 17));
        w1bVar.S.i(aob.w0(null, i3, false), aob.w0(null, i4, false));
        boolean z6 = w1bVar.B0;
        bva bvaVar = w1bVar.F0;
        if (z6) {
            w1bVar.b0.setAlpha(0.0f);
            hl.d3(bvaVar, 500L);
            w1bVar.b0.setVisibility(0);
            w1bVar.T.setVisibility(8);
        } else {
            hl.r(bvaVar);
            w1bVar.b0.setVisibility(8);
            w1bVar.T.setVisibility(0);
        }
        jl0 c = w1bVar.getBaseSimpleGlass().c.c(w1bVar.p0, dtd.g(w1bVar.resourceProvider), false);
        ik8.r(c, hl.L(28.0f), 7.666f);
        w1bVar.p0.setBackground(c);
        w1bVar.glassEngine.c(w1bVar.i0);
        eg0 baseSimpleGlass = w1bVar.getBaseSimpleGlass();
        u0b u0bVar = w1bVar.i0;
        jla jlaVar = w1bVar.simpleActionBar;
        vnb vnbVar = w1bVar.resourceProvider;
        baseSimpleGlass.m = frameLayout5;
        baseSimpleGlass.n = u0bVar;
        baseSimpleGlass.a.c(u0bVar);
        baseSimpleGlass.j(frameLayout5, jlaVar, vnbVar);
        w1bVar.n0 = new fm0(0, new t0b(w1bVar), k43.h, 380L, false);
        ij1 ij1Var2 = w1bVar.k0;
        if (ij1Var2 != null) {
            eg0 baseSimpleGlass2 = w1bVar.getBaseSimpleGlass();
            View view2 = ij1Var2.a1.d;
            jl0 c2 = baseSimpleGlass2.c.c(view2, null, false);
            c2.p(dtd.l(ij1Var2.n0));
            c2.q(hl.L(9.66f));
            c2.r(hl.L(18.0f));
            view2.setBackground(c2);
            View transactionTabs = w1bVar.k0.getTransactionTabs();
            ViewGroup.LayoutParams layoutParams = transactionTabs.getLayoutParams();
            hl.B2(transactionTabs);
            w1bVar.m0.addView(transactionTabs, layoutParams);
            w1bVar.k0.setTabsPinnedChangedListener(new uoa(w1bVar, b2));
            w1bVar.n0.a(w1bVar.k0.f0, false);
        }
        frameLayout5.getViewTreeObserver().addOnPreDrawListener(new es1(w1bVar, (byte) 6));
        w1bVar.getBaseSimpleGlass().o = new kh3(w1bVar, frameLayout5, new kd(frameLayout5, (byte) 2), b);
        w1bVar.getBaseSimpleGlass().n = null;
        w1bVar.simpleActionBar.setBackground(null);
        w1bVar.l0.setBackground(w1bVar.getBaseSimpleGlass().a(w1bVar.l0));
        hl.B2(w1bVar.S.e);
        frameLayout5.addView(w1bVar.S.e, tre.e(42, 42, 53));
        w1bVar.c0();
        w1bVar.fragmentView.setBackgroundColor(w1bVar.getThemedColor(aob.a7));
        w1bVar.C0 = new j1b(w1bVar.X, w1bVar.U);
        return w1bVar.fragmentView;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ArrayList arrayList;
        int i3 = 0;
        if (i == jn7.A5) {
            if (((v5b) objArr[0]) == this.D0) {
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
        if (i == jn7.X2) {
            if (getParentLayout() != null) {
                TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                List fragmentStack = getParentLayout().getFragmentStack();
                e eVar = fragmentStack.size() >= 2 ? (e) bp1.m(2, fragmentStack) : null;
                if (eVar instanceof g92) {
                    ((ActionBarLayout) getParentLayout()).c0(eVar, false);
                }
                List fragmentStack2 = getParentLayout().getFragmentStack();
                e eVar2 = fragmentStack2.size() >= 2 ? (e) bp1.m(2, fragmentStack2) : null;
                if (!booleanValue) {
                    finishFragment();
                    if (eVar2 instanceof ProfileActivity) {
                        ym0.f(eVar2, chat, false);
                        return;
                    }
                    return;
                }
                e eVar3 = fragmentStack2.size() >= 3 ? (e) bp1.m(3, fragmentStack2) : null;
                if (eVar2 instanceof ProfileActivity) {
                    ((ActionBarLayout) getParentLayout()).c0(eVar2, false);
                }
                finishFragment();
                if (eVar3 instanceof zu1) {
                    ym0.f(eVar3, chat, true);
                    return;
                }
                return;
            }
            return;
        }
        if (i != jn7.C) {
            if (i == jn7.T) {
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
                r47 r47Var = (r47) arrayList2.get(i4);
                int i5 = this.t0.get(r47Var.e1(), -1);
                if (i5 >= 0 && ((t1b) arrayList.get(i5)).b() == r47Var.e1()) {
                    if (r47Var.Z) {
                        arrayList3.add((t1b) arrayList.get(i5));
                    } else {
                        ((t1b) arrayList.get(i5)).b = r47Var;
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
                t1b t1bVar = (t1b) arrayList.get(i3);
                if (t1bVar.b == null) {
                    this.s0 = t1bVar.b();
                    break;
                } else {
                    arrayList4.add(t1bVar);
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

    public final void g0(i1b[] i1bVarArr) {
        b1b b1bVar = this.X;
        if (b1bVar != null) {
            b1bVar.E();
            this.T.setItemAnimator(null);
            this.X.f();
        }
        this.B0 = false;
        LinearLayout linearLayout = this.b0;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        hl.r(this.F0);
        this.b0.animate().alpha(0.0f).setDuration(230L).setListener(new po9((Object) this, (byte) 20));
        this.T.setVisibility(0);
        this.T.setAlpha(0.0f);
        this.T.animate().alpha(1.0f).setDuration(230L).start();
        for (i1b i1bVar : i1bVarArr) {
            if (i1bVar != null && i1bVar.d == null && i1bVar.f != null) {
                i1bVar.a(this.currentAccount, this.classGuid, this.a.stats_dc, new vo1(this, i1bVar, (byte) 1));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        u00 u00Var = new u00(this, (byte) 19);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        arrayList.add(new apb(this.T, 0, new Class[]{qk1.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, aob.j5));
        if (this.c0) {
            while (i < 6) {
                m0(i == 0 ? this.d : i == 1 ? this.I : i == 2 ? this.J : i == 3 ? this.K : i == 4 ? this.L : this.M, arrayList, u00Var);
                i++;
            }
        } else {
            while (i < 12) {
                m0(i == 0 ? this.d : i == 1 ? this.h : i == 2 ? this.n : i == 3 ? this.r : i == 4 ? this.s : i == 5 ? this.w : i == 6 ? this.y : i == 7 ? this.e : i == 8 ? this.x : i == 9 ? this.E : i == 10 ? this.F : this.G, arrayList, u00Var);
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
                arrayList.add(new r47(this.currentAccount, arrayList2.get(i), false, true));
            }
            getMessagesStorage().k1(arrayList2, false, true, true, 0, false, 0, 0L);
        }
        hl.c3(new q0b(this, arrayList, b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v94 */
    public final void i0(TLObject tLObject) {
        final w1b w1bVar;
        ?? r10;
        String str;
        String str2;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str3;
        int i = 10;
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            final i1b[] i1bVarArr = {f0(tL_broadcastStats.iv_interactions_graph, ob6.M0(2131749027, "IVInteractionsChartTitle"), 1, false), f0(tL_broadcastStats.followers_graph, ob6.M0(2131750570, "FollowersChartTitle"), 0, false), f0(tL_broadcastStats.top_hours_graph, ob6.M0(2131743687, "TopHoursChartTitle"), 0, false), f0(tL_broadcastStats.interactions_graph, ob6.M0(2131743182, "ViewsAndSharesChartTitle"), 1, false), f0(tL_broadcastStats.growth_graph, ob6.M0(2131749129, "GrowthChartTitle"), 0, false), f0(tL_broadcastStats.views_by_source_graph, ob6.M0(2131743181, "ViewsBySourceChartTitle"), 2, false), f0(tL_broadcastStats.new_followers_by_source_graph, ob6.M0(2131748028, "NewFollowersBySourceChartTitle"), 2, false), f0(tL_broadcastStats.languages_graph, ob6.M0(2131748795, "LanguagesChartTitle"), 4, true), f0(tL_broadcastStats.mute_graph, ob6.M0(2131747647, "NotificationsChartTitle"), 0, false), f0(tL_broadcastStats.reactions_by_emotion_graph, ob6.M0(2131746112, "ReactionsByEmotionChartTitle"), 2, false), f0(tL_broadcastStats.story_interactions_graph, ob6.M0(2131744313, "StoryInteractionsChartTitle"), 1, false), f0(tL_broadcastStats.story_reactions_by_emotion_graph, ob6.M0(2131744158, "StoryReactionsByEmotionChartTitle"), 2, false)};
            i1b i1bVar = i1bVarArr[2];
            if (i1bVar != null) {
                i1bVar.n = true;
            }
            r1b r1bVar = new r1b();
            lyc a = r1b.a(tL_broadcastStats.reactions_per_post);
            str2 = "+";
            r1bVar.o = ob6.M0(2131746105, "ReactionsPerPost");
            r1bVar.p = (String) a.b;
            r1bVar.q = (String) a.c;
            r1bVar.r = ((Boolean) a.d).booleanValue();
            r1bVar.s = ((Boolean) a.e).booleanValue();
            lyc a2 = r1b.a(tL_broadcastStats.reactions_per_story);
            r1bVar.t = ob6.M0(2131746104, "ReactionsPerStory");
            r1bVar.u = (String) a2.b;
            r1bVar.v = (String) a2.c;
            r1bVar.w = ((Boolean) a2.d).booleanValue();
            r1bVar.x = ((Boolean) a2.e).booleanValue();
            lyc a3 = r1b.a(tL_broadcastStats.views_per_story);
            r1bVar.y = ob6.M0(2131743179, "ViewsPerStory");
            r1bVar.z = (String) a3.b;
            r1bVar.A = (String) a3.c;
            r1bVar.B = ((Boolean) a3.d).booleanValue();
            r1bVar.C = ((Boolean) a3.e).booleanValue();
            lyc a4 = r1b.a(tL_broadcastStats.shares_per_story);
            r1bVar.D = ob6.M0(2131745125, "SharesPerStory");
            r1bVar.E = (String) a4.b;
            r1bVar.F = (String) a4.c;
            r1bVar.G = ((Boolean) a4.d).booleanValue();
            r1bVar.H = ((Boolean) a4.e).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            String str4 = "TopHoursChartTitle";
            double d = tL_statsAbsValueAndPrev.current;
            double d2 = tL_statsAbsValueAndPrev.previous;
            int i2 = (int) (d - d2);
            float abs = d2 == 0.0d ? 0.0f : Math.abs((i2 / ((float) d2)) * 100.0f);
            r1bVar.a = ob6.M0(2131750570, "FollowersChartTitle");
            r1bVar.b = hl.o0((int) tL_broadcastStats.followers.current, 0);
            if (i2 == 0 || abs == 0.0f) {
                r1bVar.c = "";
            } else {
                int i3 = (int) abs;
                if (abs == i3) {
                    Locale locale = Locale.ENGLISH;
                    r1bVar.c = ((i2 > 0 ? str2 : "") + hl.o0(i2, 0)) + " (" + i3 + "%)";
                } else {
                    r1bVar.c = String.format(Locale.ENGLISH, "%s (%.1f%s)", (i2 > 0 ? str2 : "") + hl.o0(i2, 0), Float.valueOf(abs), "%");
                }
            }
            r1bVar.d = i2 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_broadcastStats.shares_per_post;
            double d3 = tL_statsAbsValueAndPrev2.current;
            double d4 = tL_statsAbsValueAndPrev2.previous;
            int i4 = (int) (d3 - d4);
            float abs2 = d4 == 0.0d ? 0.0f : Math.abs((i4 / ((float) d4)) * 100.0f);
            r1bVar.i = ob6.M0(2131745126, "SharesPerPost");
            r1bVar.j = hl.o0((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i4 == 0 || abs2 == 0.0f) {
                r1bVar.k = "";
            } else {
                int i5 = (int) abs2;
                if (abs2 == i5) {
                    Locale locale2 = Locale.ENGLISH;
                    r1bVar.k = ((i4 > 0 ? str2 : "") + hl.o0(i4, 0)) + " (" + i5 + "%)";
                } else {
                    r1bVar.k = String.format(Locale.ENGLISH, "%s (%.1f%s)", (i4 > 0 ? str2 : "") + hl.o0(i4, 0), Float.valueOf(abs2), "%");
                }
            }
            r1bVar.l = i4 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d5 = tL_statsAbsValueAndPrev3.current;
            double d6 = tL_statsAbsValueAndPrev3.previous;
            int i6 = (int) (d5 - d6);
            float abs3 = d6 == 0.0d ? 0.0f : Math.abs((i6 / ((float) d6)) * 100.0f);
            r1bVar.e = ob6.M0(2131743180, "ViewsPerPost");
            r1bVar.f = hl.o0((int) tL_broadcastStats.views_per_post.current, 0);
            if (i6 == 0 || abs3 == 0.0f) {
                r1bVar.g = "";
            } else {
                int i7 = (int) abs3;
                if (abs3 == i7) {
                    Locale locale3 = Locale.ENGLISH;
                    r1bVar.g = ((i6 > 0 ? str2 : "") + hl.o0(i6, 0)) + " (" + i7 + "%)";
                } else {
                    r1bVar.g = String.format(Locale.ENGLISH, "%s (%.1f%s)", (i6 > 0 ? str2 : "") + hl.o0(i6, 0), Float.valueOf(abs3), "%");
                }
            }
            r1bVar.h = i6 >= 0;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            r1bVar.m = ob6.M0(2131751108, "EnabledNotifications");
            int i8 = (int) f;
            if (f == i8) {
                Locale locale4 = Locale.ENGLISH;
                r1bVar.n = bp1.n(i8, "%");
            } else {
                r1bVar.n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f), "%");
            }
            w1bVar = this;
            w1bVar.f = r1bVar;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            w1bVar.f0 = tL_statsDateRangeDays.max_date * 1000;
            w1bVar.g0 = tL_statsDateRangeDays.min_date * 1000;
            ArrayList arrayList3 = w1bVar.v0;
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
                t1b t1bVar = new t1b();
                t1bVar.a = postInteractionCounters2;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList3.add(t1bVar);
                    str3 = str4;
                    w1bVar.t0.put(t1bVar.b(), i9);
                    i9++;
                } else {
                    str3 = str4;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList4.add(Integer.valueOf(t1bVar.b()));
                    w1bVar.x0.add(t1bVar);
                    w1bVar.u0.put(t1bVar.b(), i10);
                    i10++;
                }
                size = i13;
                arrayList5 = arrayList6;
                i11 = i12;
                str4 = str3;
            }
            str = str4;
            hl.c3(new q0b(w1bVar, arrayList4, (byte) 0));
            if (arrayList3.size() > 0) {
                int b = ((t1b) arrayList3.get(0)).b();
                int size2 = arrayList3.size();
                kf7 messagesStorage = w1bVar.getMessagesStorage();
                long j = -w1bVar.b;
                int i14 = w1bVar.classGuid;
                messagesStorage.getClass();
                messagesStorage.a.c(new de7(messagesStorage, qsb.d(null, "MessagesStorage.getMessages: storageQueue.postRunnable"), null, j, 0L, size2, b, 0, 0, i14, 0, 0, 0L, 0, true, false));
            }
            r10 = 0;
            final Object[] objArr = 0 == true ? 1 : 0;
            hl.c3(new Runnable(w1bVar) { // from class: r0b
                public final /* synthetic */ w1b b;

                {
                    this.b = w1bVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = objArr;
                    i1b[] i1bVarArr2 = i1bVarArr;
                    w1b w1bVar2 = this.b;
                    w1bVar2.getClass();
                    switch (b2) {
                        case 0:
                            w1bVar2.r = i1bVarArr2[0];
                            w1bVar2.h = i1bVarArr2[1];
                            w1bVar2.e = i1bVarArr2[2];
                            w1bVar2.n = i1bVarArr2[3];
                            w1bVar2.d = i1bVarArr2[4];
                            w1bVar2.s = i1bVarArr2[5];
                            w1bVar2.w = i1bVarArr2[6];
                            w1bVar2.x = i1bVarArr2[7];
                            w1bVar2.y = i1bVarArr2[8];
                            w1bVar2.E = i1bVarArr2[9];
                            w1bVar2.F = i1bVarArr2[10];
                            w1bVar2.G = i1bVarArr2[11];
                            w1bVar2.g0(i1bVarArr2);
                            break;
                        default:
                            w1bVar2.d = i1bVarArr2[0];
                            w1bVar2.I = i1bVarArr2[1];
                            w1bVar2.J = i1bVarArr2[2];
                            w1bVar2.K = i1bVarArr2[3];
                            w1bVar2.L = i1bVarArr2[4];
                            w1bVar2.M = i1bVarArr2[5];
                            w1bVar2.e = i1bVarArr2[6];
                            w1bVar2.N = i1bVarArr2[7];
                            w1bVar2.g0(i1bVarArr2);
                            break;
                    }
                }
            });
        } else {
            w1bVar = this;
            r10 = 0;
            str = "TopHoursChartTitle";
            str2 = "+";
        }
        if (tLObject instanceof TL_stats.TL_megagroupStats) {
            TL_stats.TL_megagroupStats tL_megagroupStats = (TL_stats.TL_megagroupStats) tLObject;
            i1b f0 = f0(tL_megagroupStats.growth_graph, ob6.M0(2131749129, "GrowthChartTitle"), r10, r10);
            i1b f02 = f0(tL_megagroupStats.members_graph, ob6.M0(2131749181, "GroupMembersChartTitle"), r10, r10);
            i1b f03 = f0(tL_megagroupStats.new_members_by_source_graph, ob6.M0(2131748025, "NewMembersBySourceChartTitle"), 2, r10);
            i1b f04 = f0(tL_megagroupStats.languages_graph, ob6.M0(2131748372, "MembersLanguageChartTitle"), 4, true);
            i1b f05 = f0(tL_megagroupStats.messages_graph, ob6.M0(2131748216, "MessagesChartTitle"), 2, r10);
            i1b f06 = f0(tL_megagroupStats.actions_graph, ob6.M0(2131754482, "ActionsChartTitle"), 1, r10);
            i1b f07 = f0(tL_megagroupStats.top_hours_graph, ob6.M0(2131743687, str), r10, r10);
            i1b f08 = f0(tL_megagroupStats.weekdays_graph, ob6.M0(2131743688, "TopDaysOfWeekChartTitle"), 4, r10);
            final i1b[] i1bVarArr2 = new i1b[8];
            i1bVarArr2[r10] = f0;
            i1bVarArr2[1] = f02;
            i1bVarArr2[2] = f03;
            i1bVarArr2[3] = f04;
            i1bVarArr2[4] = f05;
            i1bVarArr2[5] = f06;
            i1bVarArr2[6] = f07;
            i1bVarArr2[7] = f08;
            i1b i1bVar2 = i1bVarArr2[6];
            if (i1bVar2 != null) {
                i1bVar2.n = true;
            }
            i1b i1bVar3 = i1bVarArr2[7];
            if (i1bVar3 != null) {
                i1bVar3.o = true;
            }
            s1b s1bVar = new s1b();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev4 = tL_megagroupStats.members;
            double d7 = tL_statsAbsValueAndPrev4.current;
            double d8 = tL_statsAbsValueAndPrev4.previous;
            int i15 = (int) (d7 - d8);
            float abs4 = d8 == 0.0d ? 0.0f : Math.abs((i15 / ((float) d8)) * 100.0f);
            s1bVar.a = ob6.M0(2131748371, "MembersOverviewTitle");
            s1bVar.b = hl.o0((int) tL_megagroupStats.members.current, 0);
            if (i15 == 0 || abs4 == 0.0f) {
                s1bVar.c = "";
            } else {
                int i16 = (int) abs4;
                if (abs4 == i16) {
                    Locale locale5 = Locale.ENGLISH;
                    s1bVar.c = ((i15 > 0 ? str2 : "") + hl.o0(i15, 0)) + " (" + i16 + "%)";
                } else {
                    s1bVar.c = String.format(Locale.ENGLISH, "%s (%.1f%s)", (i15 > 0 ? str2 : "") + hl.o0(i15, 0), Float.valueOf(abs4), "%");
                }
            }
            s1bVar.d = i15 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev5 = tL_megagroupStats.viewers;
            double d9 = tL_statsAbsValueAndPrev5.current;
            double d10 = tL_statsAbsValueAndPrev5.previous;
            int i17 = (int) (d9 - d10);
            float abs5 = d10 == 0.0d ? 0.0f : Math.abs((i17 / ((float) d10)) * 100.0f);
            s1bVar.i = ob6.M0(2131743184, "ViewingMembers");
            s1bVar.j = hl.o0((int) tL_megagroupStats.viewers.current, 0);
            if (i17 == 0 || abs5 == 0.0f) {
                s1bVar.k = "";
            } else {
                Locale locale6 = Locale.ENGLISH;
                s1bVar.k = (i17 > 0 ? str2 : "") + hl.o0(i17, 0);
            }
            s1bVar.l = i17 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d11 = tL_statsAbsValueAndPrev6.current;
            double d12 = tL_statsAbsValueAndPrev6.previous;
            int i18 = (int) (d11 - d12);
            float abs6 = d12 == 0.0d ? 0.0f : Math.abs((i18 / ((float) d12)) * 100.0f);
            s1bVar.m = ob6.M0(2131746796, "PostingMembers");
            s1bVar.n = hl.o0((int) tL_megagroupStats.posters.current, 0);
            if (i18 == 0 || abs6 == 0.0f) {
                s1bVar.o = "";
            } else {
                Locale locale7 = Locale.ENGLISH;
                s1bVar.o = (i18 > 0 ? str2 : "") + hl.o0(i18, 0);
            }
            s1bVar.p = i18 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d13 = tL_statsAbsValueAndPrev7.current;
            double d14 = tL_statsAbsValueAndPrev7.previous;
            int i19 = (int) (d13 - d14);
            float abs7 = d14 == 0.0d ? 0.0f : Math.abs((i19 / ((float) d14)) * 100.0f);
            s1bVar.e = ob6.M0(2131748207, "MessagesOverview");
            s1bVar.f = hl.o0((int) tL_megagroupStats.messages.current, 0);
            if (i19 == 0 || abs7 == 0.0f) {
                s1bVar.g = "";
            } else {
                Locale locale8 = Locale.ENGLISH;
                s1bVar.g = (i19 > 0 ? str2 : "") + hl.o0(i19, 0);
            }
            s1bVar.h = i19 >= 0;
            w1bVar.H = s1bVar;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            w1bVar.f0 = tL_statsDateRangeDays2.max_date * 1000;
            w1bVar.g0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList7 = tL_megagroupStats.top_posters;
            if (arrayList7 != null && !arrayList7.isEmpty()) {
                int i20 = 0;
                while (true) {
                    int size3 = tL_megagroupStats.top_posters.size();
                    arrayList = w1bVar.O;
                    arrayList2 = w1bVar.P;
                    if (i20 >= size3) {
                        break;
                    }
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i20);
                    ArrayList<TLRPC.User> arrayList8 = tL_megagroupStats.users;
                    p1b p1bVar = new p1b();
                    p1bVar.a = p1b.a(arrayList8, tL_statsGroupTopPoster.user_id);
                    StringBuilder sb = new StringBuilder();
                    int i21 = tL_statsGroupTopPoster.messages;
                    if (i21 > 0) {
                        sb.append(ob6.G(i21, "messages", new Object[0]));
                    }
                    if (tL_statsGroupTopPoster.avg_chars > 0) {
                        if (sb.length() > 0) {
                            sb.append(", ");
                        }
                        sb.append(ob6.a0("CharactersPerMessage", null, 2131752219, ob6.G(tL_statsGroupTopPoster.avg_chars, "Characters", new Object[0])));
                    }
                    p1bVar.b = sb.toString();
                    int i22 = i;
                    if (arrayList2.size() < i22) {
                        arrayList2.add(p1bVar);
                    }
                    arrayList.add(p1bVar);
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
                    p1b p1bVar2 = new p1b();
                    p1bVar2.a = p1b.a(arrayList10, tL_statsGroupTopAdmin.user_id);
                    StringBuilder sb2 = new StringBuilder();
                    int i24 = tL_statsGroupTopAdmin.deleted;
                    if (i24 > 0) {
                        sb2.append(ob6.G(i24, "Deletions", new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.banned > 0) {
                        if (sb2.length() > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(ob6.G(tL_statsGroupTopAdmin.banned, "Bans", new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.kicked > 0) {
                        if (sb2.length() > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(ob6.G(tL_statsGroupTopAdmin.kicked, "Restrictions", new Object[0]));
                    }
                    p1bVar2.b = sb2.toString();
                    w1bVar.R.add(p1bVar2);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList11 = tL_megagroupStats.top_inviters;
            if (arrayList11 != null && !arrayList11.isEmpty()) {
                for (int i25 = 0; i25 < tL_megagroupStats.top_inviters.size(); i25++) {
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i25);
                    ArrayList<TLRPC.User> arrayList12 = tL_megagroupStats.users;
                    p1b p1bVar3 = new p1b();
                    p1bVar3.a = p1b.a(arrayList12, tL_statsGroupTopInviter.user_id);
                    int i26 = tL_statsGroupTopInviter.invitations;
                    if (i26 > 0) {
                        p1bVar3.b = ob6.G(i26, "Invitations", new Object[0]);
                    } else {
                        p1bVar3.b = "";
                    }
                    w1bVar.Q.add(p1bVar3);
                }
            }
            final byte b2 = 1;
            hl.c3(new Runnable(w1bVar) { // from class: r0b
                public final /* synthetic */ w1b b;

                {
                    this.b = w1bVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b22 = b2;
                    i1b[] i1bVarArr22 = i1bVarArr2;
                    w1b w1bVar2 = this.b;
                    w1bVar2.getClass();
                    switch (b22) {
                        case 0:
                            w1bVar2.r = i1bVarArr22[0];
                            w1bVar2.h = i1bVarArr22[1];
                            w1bVar2.e = i1bVarArr22[2];
                            w1bVar2.n = i1bVarArr22[3];
                            w1bVar2.d = i1bVarArr22[4];
                            w1bVar2.s = i1bVarArr22[5];
                            w1bVar2.w = i1bVarArr22[6];
                            w1bVar2.x = i1bVarArr22[7];
                            w1bVar2.y = i1bVarArr22[8];
                            w1bVar2.E = i1bVarArr22[9];
                            w1bVar2.F = i1bVarArr22[10];
                            w1bVar2.G = i1bVarArr22[11];
                            w1bVar2.g0(i1bVarArr22);
                            break;
                        default:
                            w1bVar2.d = i1bVarArr22[0];
                            w1bVar2.I = i1bVarArr22[1];
                            w1bVar2.J = i1bVarArr22[2];
                            w1bVar2.K = i1bVarArr22[3];
                            w1bVar2.L = i1bVarArr22[4];
                            w1bVar2.M = i1bVarArr22[5];
                            w1bVar2.e = i1bVarArr22[6];
                            w1bVar2.N = i1bVarArr22[7];
                            w1bVar2.g0(i1bVarArr22);
                            break;
                    }
                }
            });
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isLightStatusBar() {
        return vm2.h(aob.w0(null, aob.d6, false)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        u0b u0bVar;
        if (motionEvent != null && this.k0 != null && (u0bVar = this.i0) != null) {
            View currentView = u0bVar.getCurrentView();
            ij1 ij1Var = this.k0;
            if (currentView == ij1Var && ij1Var.H((motionEvent.getX() - this.i0.getX()) - this.k0.getX(), (motionEvent.getY() - this.i0.getY()) - this.k0.getY())) {
                return false;
            }
        }
        u0b u0bVar2 = this.i0;
        if (u0bVar2 == null || (u0bVar2.b == 0 && u0bVar2.c == 1.0f)) {
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
            if (((t1b) arrayList.get(i2)).b == null) {
                tL_channels_getMessages.id.add(Integer.valueOf(((t1b) arrayList.get(i2)).b()));
                i++;
                if (i > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = uc7.s1(this.currentAccount).h1(this.b);
        this.A0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new p0b(this, b));
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
            tL_getMegagroupStats.channel = uc7.s1(this.currentAccount).h1(j);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = uc7.s1(this.currentAccount).h1(j);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new p0b(this, (byte) 1), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
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
            t1b t1bVar = (t1b) obj;
            r47 f = this.D0.f(t1bVar.b());
            if (f != null) {
                t1bVar.b = f;
                arrayList.add(t1bVar);
            }
        }
        this.u0.clear();
        arrayList2.clear();
    }

    public final void n0(View view) {
        if (view instanceof h1b) {
            return;
        }
        if (!(view instanceof sca) || this.T.d1()) {
            if (view instanceof qk1) {
                ((qk1) view).a();
                return;
            }
            return;
        }
        Drawable background = view.getBackground();
        if (background instanceof zm2) {
            zm2 zm2Var = (zm2) background;
            if ((zm2Var.a instanceof ColorDrawable) && zm2Var.b != null) {
                int w0 = aob.w0(null, aob.b7, false);
                if (this.H0 == null || this.I0 != w0) {
                    this.I0 = w0;
                    this.H0 = new PorterDuffColorFilter(w0, PorterDuff.Mode.MULTIPLY);
                }
                ((ColorDrawable) zm2Var.a).setColor(aob.w0(null, aob.a7, false));
                zm2Var.b.setColorFilter(this.H0);
                view.invalidate();
                return;
            }
        }
        zm2 zm2Var2 = new zm2(new ColorDrawable(aob.w0(null, aob.a7, false)), aob.W0(org.telegram.messenger.a.b, R.drawable.greydivider, aob.b7), 0, 0);
        zm2Var2.x = true;
        view.setBackground(zm2Var2);
    }

    public final void o0(int i, boolean z) {
        int i2 = 0;
        while (true) {
            uz4[] uz4VarArr = this.r0;
            if (i2 >= uz4VarArr.length) {
                return;
            }
            uz4VarArr[i2].f(i2 == i, z);
            i2++;
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        u8a u8aVar = this.G0;
        if (u8aVar != null) {
            u8aVar.a();
            this.G0 = null;
        }
        jn7 notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        u8a u8aVar2 = new u8a(notificationCenter, this);
        u8aVar2.b(jn7.C);
        u8aVar2.b(jn7.T);
        u8aVar2.b(jn7.X2);
        u8aVar2.b(jn7.A5);
        this.G0 = u8aVar2;
        c6b O1 = getMessagesController().O1();
        long j = this.b;
        v5b z = O1.z(2, -1, -j, true);
        this.D0 = z;
        if (z != null) {
            this.E0 = z.o();
        }
        if (this.a != null) {
            k0();
        } else {
            uc7.s1(this.currentAccount).e3(this.classGuid, j, true);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        u8a u8aVar = this.G0;
        if (u8aVar != null) {
            u8aVar.a();
            this.G0 = null;
        }
        id[] idVarArr = this.h0;
        id idVar = idVarArr[0];
        if (idVar != null) {
            idVar.dismiss();
            idVarArr[0] = null;
        }
        v5b v5bVar = this.D0;
        if (v5bVar != null) {
            v5bVar.z(this.E0);
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onInsets(int i, int i2, int i3, int i4) {
        c0();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            f82 f82Var = this.S;
            if (f82Var != null) {
                f82Var.i(aob.w0(null, aob.Fj, false), aob.w0(null, aob.Gj, false));
            }
            r0();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void p0(boolean z, float f) {
        for (int i = 0; i < this.r0.length; i++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i - f));
            uz4 uz4Var = this.r0[i];
            uz4Var.K = max;
            uz4Var.J = z;
            uz4Var.invalidate();
        }
        this.p0.invalidate();
    }

    public final void q0() {
        ArrayList arrayList = this.z0;
        arrayList.clear();
        arrayList.addAll(this.w0);
        arrayList.addAll(this.y0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$-CC.comparingLong(new fh((byte) 4))));
    }

    public final void r0() {
        w0b w0bVar;
        w0b w0bVar2;
        w0b w0bVar3;
        w0b w0bVar4;
        w0b w0bVar5 = this.T;
        if (w0bVar5 != null) {
            int childCount = w0bVar5.getChildCount();
            int i = 0;
            int i2 = 0;
            while (true) {
                w0bVar = this.T;
                if (i2 >= childCount) {
                    break;
                }
                n0(w0bVar.getChildAt(i2));
                i2++;
            }
            int hiddenChildCount = w0bVar.getHiddenChildCount();
            int i3 = 0;
            while (true) {
                w0bVar2 = this.T;
                if (i3 >= hiddenChildCount) {
                    break;
                }
                n0(w0bVar2.X(i3));
                i3++;
            }
            int cachedChildCount = w0bVar2.getCachedChildCount();
            int i4 = 0;
            while (true) {
                w0bVar3 = this.T;
                if (i4 >= cachedChildCount) {
                    break;
                }
                n0(w0bVar3.Q(i4));
                i4++;
            }
            int attachedScrapChildCount = w0bVar3.getAttachedScrapChildCount();
            while (true) {
                w0bVar4 = this.T;
                if (i >= attachedScrapChildCount) {
                    break;
                }
                n0(w0bVar4.P(i));
                i++;
            }
            w0bVar4.getRecycledViewPool().a();
        }
        of0 of0Var = this.a0;
        if (of0Var != null) {
            of0Var.b = true;
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
        ij1 ij1Var = this.k0;
        if (ij1Var != null && ij1Var.getParent() == this.i0) {
            ij1 ij1Var2 = this.k0;
            if (ij1Var2.getVisibility() == 0 && ij1Var2.Y0.getVisibility() != 0) {
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
                this.l0.setTranslationY((-(1.0f - ((fm0Var != null ? fm0Var.e : 0.0f) * f))) * hl.L(44.0f));
            }
        }
        z = false;
        if (z) {
        }
        this.m0.setVisibility((z || f <= 0.0f) ? 4 : 0);
        fm0 fm0Var2 = this.n0;
        this.l0.setTranslationY((-(1.0f - ((fm0Var2 != null ? fm0Var2.e : 0.0f) * f))) * hl.L(44.0f));
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }
}
