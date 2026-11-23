package vh;

import ah.i;
import ai.g1;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import c8.ma;
import c8.ra;
import di.n4;
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
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.j10;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Wallet.i9;
import r0.a0;
import ug.i1;
import ug.z;
import v4.k;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class g extends sa implements te.b {
    public static final /* synthetic */ int n2 = 0;
    public final te.c T1;
    public final te.a U1;
    public final HashMap V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public String Y1;
    public c51 Z1;
    public final hi.e a2;
    public final j b2;
    public final n4 c2;
    public final j10 d2;
    public final y3 e2;
    public final HashMap f2;
    public jn g2;
    public int h2;
    public final int i2;
    public final FrameLayout j2;
    public HashSet k2;
    public final Rect l2;
    public p20 m2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, h6 h6Var) {
        super(context, h6Var, true);
        int i7 = 1;
        nr nrVar = nr.h;
        this.T1 = new te.c(3, this, nrVar, 350L);
        this.U1 = new te.a(4, this, nrVar, 320L, false);
        this.V1 = new HashMap();
        this.W1 = new ArrayList();
        this.X1 = new ArrayList();
        this.f2 = new HashMap();
        this.l2 = new Rect();
        this.x = true;
        this.n = false;
        this.G1 = false;
        this.w1 = false;
        this.i2 = ((j0) np.u1(this.a).A7.M.b).c;
        g0.S(getWindow());
        ek0 ek0Var = this.o1;
        int i10 = this.u0;
        ek0Var.setPadding(i10, 0, i10, g0.L(68.0f) + g0.n);
        this.o1.setClipToPadding(false);
        this.o1.j(new i1(this, i7));
        this.o1.setOnItemClickListener(new d(context, h6Var, this));
        hi.e eVar = new hi.e(context, h6Var, true);
        this.a2 = eVar;
        eVar.f();
        eVar.setCountFilled(true);
        eVar.setText(hd.N0(2131745750, null));
        eVar.setOnClickListener(new a(this, 0));
        j jVar = new j(this, context);
        this.b2 = jVar;
        t6.U(jVar, m6.Ji, h6Var);
        jVar.setText(hd.N0(2131745750, null));
        jVar.setTypeface(g0.o());
        jVar.setTextSize(1, 14.0f);
        jVar.setGravity(17);
        jVar.setPadding(g0.L(16.0f), 0, g0.L(16.0f), 0);
        jVar.setVisibility(8);
        ra.a(jVar);
        this.p1.s().addView(jVar, ma.t(-2, 48, 16, 12, 0, 12, 0));
        jVar.setOnClickListener(new a(this, i7));
        e10 e10Var = new e10(context, h6Var);
        String N0 = hd.N0(2131746933, null);
        i iVar = e10Var.r;
        iVar.setHint(N0);
        iVar.addTextChangedListener(new i9(this, 6));
        j10 j10Var = new j10(context, this.a);
        this.d2 = j10Var;
        j10Var.setDelegate(new b(this));
        n4 n4Var = new n4(context, h6Var, this);
        this.c2 = n4Var;
        int i11 = this.u0;
        n4Var.setPadding(i11, 0, i11, 0);
        n4Var.addView(e10Var, ma.d(-1, 40.0f, 48, 10.0f, 0.0f, 10.0f, 0.0f));
        n4Var.addView(j10Var, ma.d(-1, 144.0f, 48, -3.0f, 40.0f, -3.0f, 0.0f));
        y3 y3Var = new y3(18, context, h6Var);
        this.e2 = y3Var;
        y3Var.setTranslationY(g0.L(48.0f));
        int i12 = 2;
        y3Var.b(hd.N0(2131745614, null), hd.N0(2131751445, null), new a(this, i12));
        n4Var.addView(y3Var, ma.e(-1, 32, 48));
        this.b.addView(n4Var, ma.e(-1, ls.t3, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(g0.L(10.0f) + this.u0, g0.L(10.0f), g0.L(10.0f) + this.u0, g0.L(10.0f) + g0.n);
        frameLayout.addView(eVar, ma.c(48.0f, -1));
        this.b.addView(frameLayout, ma.e(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.j2 = frameLayout2;
        frameLayout2.setTranslationY((-g0.n) - g0.L(68.0f));
        this.b.addView(frameLayout2, ma.e(-1, ls.g2, 80));
        k kVar = new k();
        kVar.n(350L);
        kVar.o(nrVar);
        kVar.C = false;
        kVar.m = false;
        this.o1.setItemAnimator(kVar);
        this.o1.i(new e(this, h6Var));
        z zVar = new z(this, i12);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(k10.t0);
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        tL_help_getCountriesList.lang_code = hd.E0().B != null ? hd.E0().B.c() : Locale.getDefault().getCountry();
        connectionsManager.sendRequest(tL_help_getCountriesList, new g1(zVar, 27));
        a0.i(this.c, new b(this));
    }

    public static void e1(g gVar, Pair pair) {
        HashMap hashMap = gVar.f2;
        HashMap hashMap2 = gVar.V1;
        hashMap2.putAll((Map) pair.first);
        ArrayList arrayList = gVar.W1;
        arrayList.addAll((Collection) pair.second);
        Map.-EL.forEach(hashMap2, new c(gVar, 0));
        HashSet hashSet = gVar.k2;
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
                    p20 p20Var = new p20(gVar.getContext(), tL_help_country);
                    p20Var.setOnClickListener(new a(gVar, 3));
                    gVar.d2.a(p20Var);
                    hashMap.put(tL_help_country.iso2, p20Var);
                }
            }
        }
        gVar.Z1.O(true);
        gVar.a2.c(hashMap.size(), true);
    }

    @Override // te.b
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 != 3) {
            if (i7 == 4) {
                c10.d(this.b2, f10);
            }
        } else {
            f1();
            this.e2.setTranslationY(g0.L(48.0f) + f10);
            this.c2.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.sa
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(ek0Var, getContext(), this.a, 0, true, new org.telegram.ui.web.b(this, 2), this.J0);
        this.Z1 = c51Var;
        c51Var.r = false;
        return c51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        return hd.N0(2131753285, null);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void e0() {
        f1();
        g1();
    }

    public final void f1() {
        int L = g0.L(56.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + g0.m + ((int) this.T1.f);
        int measuredHeight = (this.b.getMeasuredHeight() - g0.n) - g0.L(34.0f);
        Rect rect = this.l2;
        boolean z10 = (rect.top == L && rect.bottom == measuredHeight) ? false : true;
        rect.set(0, L, this.b.getMeasuredWidth(), measuredHeight);
        ek0 ek0Var = this.o1;
        ek0Var.setClipBounds(rect);
        if (z10) {
            ek0Var.invalidate();
        }
    }

    public final void g1() {
        ek0 ek0Var;
        float f10 = g0.q.y;
        int i7 = 0;
        while (true) {
            ek0Var = this.o1;
            if (i7 >= ek0Var.getChildCount()) {
                break;
            }
            View childAt = ek0Var.getChildAt(i7);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f10) {
                f10 = childAt.getY();
            }
            i7++;
        }
        float max = Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + g0.m, f10 + g0.L(8.0f));
        n4 n4Var = this.c2;
        if (n4Var.getTranslationY() != max) {
            n4Var.setTranslationY(max);
            ek0Var.invalidate();
        }
    }

    public final void h1(View view) {
        p20 p20Var = (p20) view;
        if (!p20Var.E) {
            p20 p20Var2 = this.m2;
            if (p20Var2 != null) {
                p20Var2.a();
            }
            this.m2 = p20Var;
            p20Var.b();
            return;
        }
        this.m2 = null;
        this.d2.c(p20Var);
        String countryIso2 = p20Var.getCountryIso2();
        HashMap hashMap = this.f2;
        hashMap.remove(countryIso2);
        this.a2.c(hashMap.size(), true);
        this.Z1.O(true);
    }

    @Override // te.b
    public final /* synthetic */ void D(float f10, int i7) {
    }
}
