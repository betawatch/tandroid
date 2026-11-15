package vh;

import ai.d1;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import c8.na;
import di.k4;
import gi.j;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.j0;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.ou;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f20;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.z00;
import org.telegram.ui.Wallet.i9;
import r0.a0;
import ug.p1;
import v4.k;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class h extends ja implements te.b {
    public static final /* synthetic */ int n2 = 0;
    public final te.c T1;
    public final te.a U1;
    public final HashMap V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public String Y1;
    public p41 Z1;
    public final hi.d a2;
    public final j b2;
    public final k4 c2;
    public final z00 d2;
    public final x3 e2;
    public final HashMap f2;
    public ou g2;
    public int h2;
    public final int i2;
    public final FrameLayout j2;
    public HashSet k2;
    public final Rect l2;
    public f20 m2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, e6 e6Var) {
        super(context, e6Var, true);
        int i7 = 1;
        er erVar = er.h;
        this.T1 = new te.c(3, this, erVar, 350L);
        this.U1 = new te.a(4, this, erVar, 320L, false);
        this.V1 = new HashMap();
        this.W1 = new ArrayList();
        this.X1 = new ArrayList();
        this.f2 = new HashMap();
        this.l2 = new Rect();
        this.x = true;
        int i10 = 0;
        this.n = false;
        this.G1 = false;
        this.w1 = false;
        this.i2 = ((j0) np.s1(this.a).y7.H.b).c;
        g0.S(getWindow());
        uj0 uj0Var = this.o1;
        int i11 = this.u0;
        uj0Var.setPadding(i11, 0, i11, g0.L(68.0f) + g0.n);
        this.o1.setClipToPadding(false);
        this.o1.j(new d(this, i10));
        this.o1.setOnItemClickListener(new e(context, e6Var, this));
        hi.d dVar = new hi.d(context, e6Var, true);
        this.a2 = dVar;
        dVar.f();
        dVar.setCountFilled(true);
        dVar.setText(hd.M0(2131745946, null));
        dVar.setOnClickListener(new a(this, i10));
        j jVar = new j(this, context);
        this.b2 = jVar;
        q6.U(jVar, j6.Ji, e6Var);
        jVar.setText(hd.M0(2131745946, null));
        jVar.setTypeface(g0.o());
        jVar.setTextSize(1, 14.0f);
        jVar.setGravity(17);
        jVar.setPadding(g0.L(16.0f), 0, g0.L(16.0f), 0);
        jVar.setVisibility(8);
        na.a(jVar);
        this.p1.s().addView(jVar, c8.ja.t(-2, 48, 16, 12, 0, 12, 0));
        jVar.setOnClickListener(new a(this, i7));
        v00 v00Var = new v00(context, e6Var);
        String M0 = hd.M0(2131747127, null);
        ah.i iVar = v00Var.r;
        iVar.setHint(M0);
        iVar.addTextChangedListener(new i9(this, 5));
        z00 z00Var = new z00(context, this.a);
        this.d2 = z00Var;
        z00Var.setDelegate(new b(this));
        k4 k4Var = new k4(context, e6Var, this);
        this.c2 = k4Var;
        int i12 = this.u0;
        k4Var.setPadding(i12, 0, i12, 0);
        k4Var.addView(v00Var, c8.ja.d(-1, 40.0f, 48, 10.0f, 0.0f, 10.0f, 0.0f));
        k4Var.addView(z00Var, c8.ja.d(-1, 144.0f, 48, -3.0f, 40.0f, -3.0f, 0.0f));
        x3 x3Var = new x3(18, context, e6Var);
        this.e2 = x3Var;
        x3Var.setTranslationY(g0.L(48.0f));
        x3Var.b(hd.M0(2131745810, null), hd.M0(2131751457, null), new a(this, 2));
        k4Var.addView(x3Var, c8.ja.e(-1, 32, 48));
        this.b.addView(k4Var, c8.ja.e(-1, ns.t3, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(g0.L(10.0f) + this.u0, g0.L(10.0f), g0.L(10.0f) + this.u0, g0.L(10.0f) + g0.n);
        frameLayout.addView(dVar, c8.ja.c(48.0f, -1));
        this.b.addView(frameLayout, c8.ja.e(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.j2 = frameLayout2;
        frameLayout2.setTranslationY((-g0.n) - g0.L(68.0f));
        this.b.addView(frameLayout2, c8.ja.e(-1, ns.g2, 80));
        k kVar = new k();
        kVar.n(350L);
        kVar.o(erVar);
        kVar.C = false;
        kVar.m = false;
        this.o1.setItemAnimator(kVar);
        this.o1.i(new f(this, e6Var));
        p1 p1Var = new p1(this, i7);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(m10.t0);
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        tL_help_getCountriesList.lang_code = hd.E0().B != null ? hd.E0().B.c() : Locale.getDefault().getCountry();
        connectionsManager.sendRequest(tL_help_getCountriesList, new d1(p1Var, 25));
        a0.i(this.c, new b(this));
    }

    public static void d1(h hVar, Pair pair) {
        HashMap hashMap = hVar.f2;
        HashMap hashMap2 = hVar.V1;
        hashMap2.putAll((Map) pair.first);
        ArrayList arrayList = hVar.W1;
        arrayList.addAll((Collection) pair.second);
        Map.-EL.forEach(hashMap2, new c(hVar, 0));
        HashSet hashSet = hVar.k2;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size) {
                        r7 = null;
                        break;
                    }
                    Object obj = arrayList.get(i7);
                    i7++;
                    for (TLRPC.TL_help_country tL_help_country : (List) hashMap2.get((String) obj)) {
                        if (TextUtils.equals(str, tL_help_country.iso2)) {
                            break;
                        }
                    }
                }
                if (tL_help_country != null) {
                    f20 f20Var = new f20(hVar.getContext(), tL_help_country);
                    f20Var.setOnClickListener(new a(hVar, 3));
                    hVar.d2.a(f20Var);
                    hashMap.put(tL_help_country.iso2, f20Var);
                }
            }
        }
        hVar.Z1.O(true);
        hVar.a2.c(hashMap.size(), true);
    }

    @Override // te.b
    public final void G(int i7, float f10, float f11, te.c cVar) {
        if (i7 != 3) {
            if (i7 == 4) {
                t00.d(this.b2, f10);
            }
        } else {
            e1();
            this.e2.setTranslationY(g0.L(48.0f) + f10);
            this.c2.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.ja
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(uj0Var, getContext(), this.a, 0, true, new org.telegram.ui.web.b(this, 2), this.J0);
        this.Z1 = p41Var;
        p41Var.r = false;
        return p41Var;
    }

    @Override // org.telegram.ui.Components.ja
    public final CharSequence O0() {
        return hd.M0(2131753288, null);
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void e0() {
        e1();
        f1();
    }

    public final void e1() {
        int L = g0.L(56.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + g0.m + ((int) this.T1.f);
        int measuredHeight = (this.b.getMeasuredHeight() - g0.n) - g0.L(34.0f);
        Rect rect = this.l2;
        boolean z10 = (rect.top == L && rect.bottom == measuredHeight) ? false : true;
        rect.set(0, L, this.b.getMeasuredWidth(), measuredHeight);
        uj0 uj0Var = this.o1;
        uj0Var.setClipBounds(rect);
        if (z10) {
            uj0Var.invalidate();
        }
    }

    public final void f1() {
        uj0 uj0Var;
        float f10 = g0.q.y;
        int i7 = 0;
        while (true) {
            uj0Var = this.o1;
            if (i7 >= uj0Var.getChildCount()) {
                break;
            }
            View childAt = uj0Var.getChildAt(i7);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f10) {
                f10 = childAt.getY();
            }
            i7++;
        }
        float max = Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + g0.m, f10 + g0.L(8.0f));
        k4 k4Var = this.c2;
        if (k4Var.getTranslationY() != max) {
            k4Var.setTranslationY(max);
            uj0Var.invalidate();
        }
    }

    public final void g1(View view) {
        f20 f20Var = (f20) view;
        if (!f20Var.E) {
            f20 f20Var2 = this.m2;
            if (f20Var2 != null) {
                f20Var2.a();
            }
            this.m2 = f20Var;
            f20Var.b();
            return;
        }
        this.m2 = null;
        this.d2.c(f20Var);
        String countryIso2 = f20Var.getCountryIso2();
        HashMap hashMap = this.f2;
        hashMap.remove(countryIso2);
        this.a2.c(hashMap.size(), true);
        this.Z1.O(true);
    }

    @Override // te.b
    public final /* synthetic */ void E(float f10, int i7) {
    }
}
