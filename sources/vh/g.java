package vh;

import ah.i;
import ai.b1;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import c8.na;
import c8.sa;
import di.n4;
import gi.j;
import j$.util.Map;
import j6.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.j0;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Wallet.j9;
import r0.a0;
import ug.i1;
import ug.z;
import v4.l;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class g extends ra implements te.b {
    public static final /* synthetic */ int n2 = 0;
    public final te.c T1;
    public final te.a U1;
    public final HashMap V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public String Y1;
    public b51 Z1;
    public final hi.e a2;
    public final j b2;
    public final n4 c2;
    public final h10 d2;
    public final y3 e2;
    public final HashMap f2;
    public r g2;
    public int h2;
    public final int i2;
    public final FrameLayout j2;
    public HashSet k2;
    public final Rect l2;
    public n20 m2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, i6 i6Var) {
        super(context, i6Var, true);
        int i7 = 1;
        kr krVar = kr.h;
        this.T1 = new te.c(3, this, krVar, 350L);
        this.U1 = new te.a(4, this, krVar, 320L, false);
        this.V1 = new HashMap();
        this.W1 = new ArrayList();
        this.X1 = new ArrayList();
        this.f2 = new HashMap();
        this.l2 = new Rect();
        this.x = true;
        this.n = false;
        this.G1 = false;
        this.w1 = false;
        this.i2 = ((j0) mp.u1(this.a).A7.M.b).c;
        g0.S(getWindow());
        ek0 ek0Var = this.o1;
        int i10 = this.u0;
        ek0Var.setPadding(i10, 0, i10, g0.L(68.0f) + g0.n);
        this.o1.setClipToPadding(false);
        this.o1.j(new i1(this, i7));
        this.o1.setOnItemClickListener(new d(context, i6Var, this));
        hi.e eVar = new hi.e(context, i6Var, true);
        this.a2 = eVar;
        eVar.f();
        eVar.setCountFilled(true);
        eVar.setText(gd.N0(2131745750, null));
        eVar.setOnClickListener(new a(this, 0));
        j jVar = new j(this, context);
        this.b2 = jVar;
        u6.U(jVar, n6.Ji, i6Var);
        jVar.setText(gd.N0(2131745750, null));
        jVar.setTypeface(g0.o());
        jVar.setTextSize(1, 14.0f);
        jVar.setGravity(17);
        jVar.setPadding(g0.L(16.0f), 0, g0.L(16.0f), 0);
        jVar.setVisibility(8);
        sa.a(jVar);
        this.p1.s().addView(jVar, na.t(-2, 48, 16, 12, 0, 12, 0));
        jVar.setOnClickListener(new a(this, i7));
        c10 c10Var = new c10(context, i6Var);
        String N0 = gd.N0(2131746933, null);
        i iVar = c10Var.r;
        iVar.setHint(N0);
        iVar.addTextChangedListener(new j9(this, 7));
        h10 h10Var = new h10(context, this.a);
        this.d2 = h10Var;
        h10Var.setDelegate(new b(this));
        n4 n4Var = new n4(context, i6Var, this);
        this.c2 = n4Var;
        int i11 = this.u0;
        n4Var.setPadding(i11, 0, i11, 0);
        n4Var.addView(c10Var, na.d(-1, 40.0f, 48, 10.0f, 0.0f, 10.0f, 0.0f));
        n4Var.addView(h10Var, na.d(-1, 144.0f, 48, -3.0f, 40.0f, -3.0f, 0.0f));
        y3 y3Var = new y3(18, context, i6Var);
        this.e2 = y3Var;
        y3Var.setTranslationY(g0.L(48.0f));
        int i12 = 2;
        y3Var.b(gd.N0(2131745614, null), gd.N0(2131751445, null), new a(this, i12));
        n4Var.addView(y3Var, na.e(-1, 32, 48));
        this.b.addView(n4Var, na.e(-1, ks.t3, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(g0.L(10.0f) + this.u0, g0.L(10.0f), g0.L(10.0f) + this.u0, g0.L(10.0f) + g0.n);
        frameLayout.addView(eVar, na.c(48.0f, -1));
        this.b.addView(frameLayout, na.e(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.j2 = frameLayout2;
        frameLayout2.setTranslationY((-g0.n) - g0.L(68.0f));
        this.b.addView(frameLayout2, na.e(-1, ks.g2, 80));
        l lVar = new l();
        lVar.n(350L);
        lVar.o(krVar);
        lVar.C = false;
        lVar.m = false;
        this.o1.setItemAnimator(lVar);
        this.o1.i(new e(this, i6Var));
        z zVar = new z(this, i12);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10.t0);
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        tL_help_getCountriesList.lang_code = gd.E0().B != null ? gd.E0().B.c() : Locale.getDefault().getCountry();
        connectionsManager.sendRequest(tL_help_getCountriesList, new b1(zVar, 27));
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
                    n20 n20Var = new n20(gVar.getContext(), tL_help_country);
                    n20Var.setOnClickListener(new a(gVar, 3));
                    gVar.d2.a(n20Var);
                    hashMap.put(tL_help_country.iso2, n20Var);
                }
            }
        }
        gVar.Z1.O(true);
        gVar.a2.c(hashMap.size(), true);
    }

    @Override // te.b
    public final void K(int i7, float f10, float f11, te.c cVar) {
        if (i7 != 3) {
            if (i7 == 4) {
                a10.d(this.b2, f10);
            }
        } else {
            f1();
            this.e2.setTranslationY(g0.L(48.0f) + f10);
            this.c2.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.ra
    public final dk0 M0(ek0 ek0Var) {
        b51 b51Var = new b51(ek0Var, getContext(), this.a, 0, true, new org.telegram.ui.web.b(this, 2), this.J0);
        this.Z1 = b51Var;
        b51Var.r = false;
        return b51Var;
    }

    @Override // org.telegram.ui.Components.ra
    public final CharSequence P0() {
        return gd.N0(2131753285, null);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void e0() {
        f1();
        g1();
    }

    public final void f1() {
        int L = g0.L(56.0f) + k.getCurrentActionBarHeight() + g0.m + ((int) this.T1.f);
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
        float max = Math.max(k.getCurrentActionBarHeight() + g0.m, f10 + g0.L(8.0f));
        n4 n4Var = this.c2;
        if (n4Var.getTranslationY() != max) {
            n4Var.setTranslationY(max);
            ek0Var.invalidate();
        }
    }

    public final void h1(View view) {
        n20 n20Var = (n20) view;
        if (!n20Var.E) {
            n20 n20Var2 = this.m2;
            if (n20Var2 != null) {
                n20Var2.a();
            }
            this.m2 = n20Var;
            n20Var.b();
            return;
        }
        this.m2 = null;
        this.d2.c(n20Var);
        String countryIso2 = n20Var.getCountryIso2();
        HashMap hashMap = this.f2;
        hashMap.remove(countryIso2);
        this.a2.c(hashMap.size(), true);
        this.Z1.O(true);
    }

    @Override // te.b
    public final /* synthetic */ void G(float f10, int i7) {
    }
}
