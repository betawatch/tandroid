package vh;

import ah.i;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bi.m5;
import c8.ha;
import c8.ka;
import ei.k;
import hi.u1;
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
import org.telegram.messenger.id;
import org.telegram.messenger.j0;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.l;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Wallet.oa;
import r0.a0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g extends ma implements te.b {
    public static final /* synthetic */ int m2 = 0;
    public final te.c S1;
    public final te.a T1;
    public final HashMap U1;
    public final ArrayList V1;
    public final ArrayList W1;
    public String X1;
    public m41 Y1;
    public final fi.d Z1;
    public final k a2;
    public final m5 b2;
    public final v00 c2;
    public final x3 d2;
    public final HashMap e2;
    public gf.g f2;
    public int g2;
    public final int h2;
    public final FrameLayout i2;
    public HashSet j2;
    public final Rect k2;
    public c20 l2;

    public g(Context context, h6 h6Var) {
        super(context, h6Var, true);
        wq wqVar = wq.h;
        this.S1 = new te.c(3, this, wqVar, 350L);
        this.T1 = new te.a(4, this, wqVar, 320L, false);
        this.U1 = new HashMap();
        this.V1 = new ArrayList();
        this.W1 = new ArrayList();
        this.e2 = new HashMap();
        this.k2 = new Rect();
        this.x = true;
        this.n = false;
        this.F1 = false;
        this.v1 = false;
        this.h2 = ((j0) qp.s1(this.a).x7.H.b).c;
        g0.S(getWindow());
        pj0 pj0Var = this.n1;
        int i7 = this.t0;
        pj0Var.setPadding(i7, 0, i7, g0.L(68.0f) + g0.n);
        this.n1.setClipToPadding(false);
        this.n1.j(new ti(this, 27));
        this.n1.setOnItemClickListener(new d(context, h6Var, this));
        fi.d dVar = new fi.d(context, h6Var, true);
        this.Z1 = dVar;
        dVar.f();
        dVar.setCountFilled(true);
        dVar.setText(id.M0(2131745946, null));
        dVar.setOnClickListener(new a(this, 0));
        k kVar = new k(this, context);
        this.a2 = kVar;
        t6.U(kVar, m6.Gi, h6Var);
        kVar.setText(id.M0(2131745946, null));
        kVar.setTypeface(g0.o());
        kVar.setTextSize(1, 14.0f);
        kVar.setGravity(17);
        kVar.setPadding(g0.L(16.0f), 0, g0.L(16.0f), 0);
        kVar.setVisibility(8);
        ka.a(kVar);
        this.o1.s().addView(kVar, ha.t(-2, 48, 16, 12, 0, 12, 0));
        kVar.setOnClickListener(new a(this, 1));
        r00 r00Var = new r00(context, h6Var);
        String M0 = id.M0(2131747127, null);
        i iVar = r00Var.r;
        iVar.setHint(M0);
        iVar.addTextChangedListener(new oa(this, 3));
        v00 v00Var = new v00(context, this.a);
        this.c2 = v00Var;
        v00Var.setDelegate(new b(this));
        m5 m5Var = new m5(context, h6Var, this);
        this.b2 = m5Var;
        int i10 = this.t0;
        m5Var.setPadding(i10, 0, i10, 0);
        m5Var.addView(r00Var, ha.d(-1, 40.0f, 48, 10.0f, 0.0f, 10.0f, 0.0f));
        m5Var.addView(v00Var, ha.d(-1, 144.0f, 48, -3.0f, 40.0f, -3.0f, 0.0f));
        x3 x3Var = new x3(18, context, h6Var);
        this.d2 = x3Var;
        x3Var.setTranslationY(g0.L(48.0f));
        x3Var.b(id.M0(2131745810, null), id.M0(2131751457, null), new a(this, 2));
        m5Var.addView(x3Var, ha.e(-1, 32, 48));
        this.b.addView(m5Var, ha.e(-1, qs.t3, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(g0.L(10.0f) + this.t0, g0.L(10.0f), g0.L(10.0f) + this.t0, g0.L(10.0f) + g0.n);
        frameLayout.addView(dVar, ha.c(48.0f, -1));
        this.b.addView(frameLayout, ha.e(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.i2 = frameLayout2;
        frameLayout2.setTranslationY((-g0.n) - g0.L(68.0f));
        this.b.addView(frameLayout2, ha.e(-1, qs.g2, 80));
        v4.k kVar2 = new v4.k();
        kVar2.n(350L);
        kVar2.o(wqVar);
        kVar2.C = false;
        kVar2.m = false;
        this.n1.setItemAnimator(kVar2);
        this.n1.i(new e(this, h6Var));
        ii.c cVar = new ii.c(this, 26);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(p10.s0);
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        tL_help_getCountriesList.lang_code = id.E0().B != null ? id.E0().B.c() : Locale.getDefault().getCountry();
        connectionsManager.sendRequest(tL_help_getCountriesList, new bi.j0(cVar, 24));
        a0.i(this.c, new b(this));
    }

    public static void d1(g gVar, Pair pair) {
        HashMap hashMap = gVar.e2;
        HashMap hashMap2 = gVar.U1;
        hashMap2.putAll((Map) pair.first);
        ArrayList arrayList = gVar.V1;
        arrayList.addAll((Collection) pair.second);
        Map.-EL.forEach(hashMap2, new c(gVar, 0));
        HashSet hashSet = gVar.j2;
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
                    c20 c20Var = new c20(gVar.getContext(), tL_help_country);
                    c20Var.setOnClickListener(new a(gVar, 3));
                    gVar.c2.a(c20Var);
                    hashMap.put(tL_help_country.iso2, c20Var);
                }
            }
        }
        gVar.Y1.O(true);
        gVar.Z1.c(hashMap.size(), true);
    }

    @Override // org.telegram.ui.Components.ma
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(pj0Var, getContext(), this.a, 0, true, new u1(this, 22), this.I0);
        this.Y1 = m41Var;
        m41Var.r = false;
        return m41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return id.M0(2131753288, null);
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 != 3) {
            if (i7 == 4) {
                p00.d(this.a2, f10);
            }
        } else {
            e1();
            this.d2.setTranslationY(g0.L(48.0f) + f10);
            this.b2.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void e0() {
        e1();
        f1();
    }

    public final void e1() {
        int L = g0.L(56.0f) + l.getCurrentActionBarHeight() + g0.m + ((int) this.S1.f);
        int measuredHeight = (this.b.getMeasuredHeight() - g0.n) - g0.L(34.0f);
        Rect rect = this.k2;
        boolean z9 = (rect.top == L && rect.bottom == measuredHeight) ? false : true;
        rect.set(0, L, this.b.getMeasuredWidth(), measuredHeight);
        pj0 pj0Var = this.n1;
        pj0Var.setClipBounds(rect);
        if (z9) {
            pj0Var.invalidate();
        }
    }

    public final void f1() {
        pj0 pj0Var;
        float f10 = g0.q.y;
        int i7 = 0;
        while (true) {
            pj0Var = this.n1;
            if (i7 >= pj0Var.getChildCount()) {
                break;
            }
            View childAt = pj0Var.getChildAt(i7);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f10) {
                f10 = childAt.getY();
            }
            i7++;
        }
        float max = Math.max(l.getCurrentActionBarHeight() + g0.m, f10 + g0.L(8.0f));
        m5 m5Var = this.b2;
        if (m5Var.getTranslationY() != max) {
            m5Var.setTranslationY(max);
            pj0Var.invalidate();
        }
    }

    public final void g1(View view) {
        c20 c20Var = (c20) view;
        if (!c20Var.D) {
            c20 c20Var2 = this.l2;
            if (c20Var2 != null) {
                c20Var2.a();
            }
            this.l2 = c20Var;
            c20Var.b();
            return;
        }
        this.l2 = null;
        this.c2.c(c20Var);
        String countryIso2 = c20Var.getCountryIso2();
        HashMap hashMap = this.e2;
        hashMap.remove(countryIso2);
        this.Z1.c(hashMap.size(), true);
        this.Y1.O(true);
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }
}
