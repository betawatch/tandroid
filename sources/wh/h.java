package wh;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import b8.mf;
import b8.pf;
import ci.d0;
import ci.t4;
import fi.j;
import gi.j8;
import gi.v5;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.j0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y10;
import r0.a0;
import u4.k;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h extends ma implements qe.b {
    public static final /* synthetic */ int k2 = 0;
    public final qe.c Q1;
    public final qe.a R1;
    public final HashMap S1;
    public final ArrayList T1;
    public final ArrayList U1;
    public String V1;
    public f41 W1;
    public final gi.d X1;
    public final j Y1;
    public final t4 Z1;
    public final r00 a2;
    public final x3 b2;
    public final HashMap c2;
    public v5 d2;
    public int e2;
    public final int f2;
    public final FrameLayout g2;
    public HashSet h2;
    public final Rect i2;
    public y10 j2;

    public h(Context context, e6 e6Var) {
        super(context, e6Var, true);
        xq xqVar = xq.h;
        this.Q1 = new qe.c(3, this, xqVar, 350L);
        this.R1 = new qe.a(4, this, xqVar, 320L, false);
        this.S1 = new HashMap();
        this.T1 = new ArrayList();
        this.U1 = new ArrayList();
        this.c2 = new HashMap();
        this.i2 = new Rect();
        this.x = true;
        int i3 = 0;
        this.n = false;
        this.D1 = false;
        this.t1 = false;
        this.f2 = ((j0) hp.s1(this.a).x7.H.b).c;
        g0.S(getWindow());
        tj0 tj0Var = this.l1;
        int i10 = this.u0;
        tj0Var.setPadding(i10, 0, i10, g0.L(68.0f) + g0.n);
        this.l1.setClipToPadding(false);
        this.l1.j(new d(this, i3));
        this.l1.setOnItemClickListener(new e(context, e6Var, this));
        gi.d dVar = new gi.d(context, e6Var, true);
        this.X1 = dVar;
        dVar.f();
        dVar.setCountFilled(true);
        dVar.setText(bd.M0(2131745956, null));
        dVar.setOnClickListener(new a(this, i3));
        j jVar = new j(this, context);
        this.Y1 = jVar;
        r6.V(jVar, k6.Gi, e6Var);
        jVar.setText(bd.M0(2131745956, null));
        jVar.setTypeface(g0.o());
        jVar.setTextSize(1, 14.0f);
        jVar.setGravity(17);
        jVar.setPadding(g0.L(16.0f), 0, g0.L(16.0f), 0);
        jVar.setVisibility(8);
        pf.a(jVar);
        this.m1.q().addView(jVar, mf.t(-2, 48, 16, 12, 0, 12, 0));
        jVar.setOnClickListener(new a(this, 1));
        n00 n00Var = new n00(context, e6Var);
        String M0 = bd.M0(2131747135, null);
        bh.g gVar = n00Var.r;
        gVar.setHint(M0);
        gVar.addTextChangedListener(new org.telegram.ui.Wallet.ma(this, 3));
        r00 r00Var = new r00(context, this.a);
        this.a2 = r00Var;
        r00Var.setDelegate(new b(this));
        t4 t4Var = new t4(context, e6Var, this);
        this.Z1 = t4Var;
        int i11 = this.u0;
        t4Var.setPadding(i11, 0, i11, 0);
        t4Var.addView(n00Var, mf.d(-1, 40.0f, 48, 10.0f, 0.0f, 10.0f, 0.0f));
        t4Var.addView(r00Var, mf.d(-1, 144.0f, 48, -3.0f, 40.0f, -3.0f, 0.0f));
        x3 x3Var = new x3(18, context, e6Var);
        this.b2 = x3Var;
        x3Var.setTranslationY(g0.L(48.0f));
        x3Var.b(bd.M0(2131745820, null), bd.M0(2131751458, null), new a(this, 2));
        t4Var.addView(x3Var, mf.e(-1, 32, 48));
        this.b.addView(t4Var, mf.e(-1, hs.t3, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(g0.L(10.0f) + this.u0, g0.L(10.0f), g0.L(10.0f) + this.u0, g0.L(10.0f) + g0.n);
        frameLayout.addView(dVar, mf.c(48.0f, -1));
        this.b.addView(frameLayout, mf.e(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.g2 = frameLayout2;
        frameLayout2.setTranslationY((-g0.n) - g0.L(68.0f));
        this.b.addView(frameLayout2, mf.e(-1, hs.g2, 80));
        k kVar = new k();
        kVar.n(350L);
        kVar.o(xqVar);
        kVar.C = false;
        kVar.m = false;
        this.l1.setItemAnimator(kVar);
        this.l1.i(new f(this, e6Var));
        j8 j8Var = new j8(this, 29);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(h10.t0);
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        tL_help_getCountriesList.lang_code = bd.E0().B != null ? bd.E0().B.c() : Locale.getDefault().getCountry();
        connectionsManager.sendRequest(tL_help_getCountriesList, new d0(j8Var, 24));
        a0.i(this.c, new b(this));
    }

    public static void d1(h hVar, Pair pair) {
        HashMap hashMap = hVar.c2;
        HashMap hashMap2 = hVar.S1;
        hashMap2.putAll((Map) pair.first);
        ArrayList arrayList = hVar.T1;
        arrayList.addAll((Collection) pair.second);
        Map.-EL.forEach(hashMap2, new c(hVar, 0));
        HashSet hashSet = hVar.h2;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                int size = arrayList.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        r7 = null;
                        break;
                    }
                    Object obj = arrayList.get(i3);
                    i3++;
                    for (TLRPC.TL_help_country tL_help_country : (List) hashMap2.get((String) obj)) {
                        if (TextUtils.equals(str, tL_help_country.iso2)) {
                            break;
                        }
                    }
                }
                if (tL_help_country != null) {
                    y10 y10Var = new y10(hVar.getContext(), tL_help_country);
                    y10Var.setOnClickListener(new a(hVar, 3));
                    hVar.a2.a(y10Var);
                    hashMap.put(tL_help_country.iso2, y10Var);
                }
            }
        }
        hVar.W1.O(true);
        hVar.X1.c(hashMap.size(), true);
    }

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(tj0Var, getContext(), this.a, 0, true, new org.telegram.ui.web.b(this, 2), this.J0);
        this.W1 = f41Var;
        f41Var.r = false;
        return f41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return bd.M0(2131753288, null);
    }

    @Override // qe.b
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 != 3) {
            if (i3 == 4) {
                l00.d(this.Y1, f10);
            }
        } else {
            e1();
            this.b2.setTranslationY(g0.L(48.0f) + f10);
            this.Z1.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void e0() {
        e1();
        f1();
    }

    public final void e1() {
        int L = g0.L(56.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + g0.m + ((int) this.Q1.f);
        int measuredHeight = (this.b.getMeasuredHeight() - g0.n) - g0.L(34.0f);
        Rect rect = this.i2;
        boolean z10 = (rect.top == L && rect.bottom == measuredHeight) ? false : true;
        rect.set(0, L, this.b.getMeasuredWidth(), measuredHeight);
        tj0 tj0Var = this.l1;
        tj0Var.setClipBounds(rect);
        if (z10) {
            tj0Var.invalidate();
        }
    }

    public final void f1() {
        tj0 tj0Var;
        float f10 = g0.q.y;
        int i3 = 0;
        while (true) {
            tj0Var = this.l1;
            if (i3 >= tj0Var.getChildCount()) {
                break;
            }
            View childAt = tj0Var.getChildAt(i3);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f10) {
                f10 = childAt.getY();
            }
            i3++;
        }
        float max = Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + g0.m, f10 + g0.L(8.0f));
        t4 t4Var = this.Z1;
        if (t4Var.getTranslationY() != max) {
            t4Var.setTranslationY(max);
            tj0Var.invalidate();
        }
    }

    public final void g1(View view) {
        y10 y10Var = (y10) view;
        if (!y10Var.E) {
            y10 y10Var2 = this.j2;
            if (y10Var2 != null) {
                y10Var2.a();
            }
            this.j2 = y10Var;
            y10Var.b();
            return;
        }
        this.j2 = null;
        this.a2.c(y10Var);
        String countryIso2 = y10Var.getCountryIso2();
        HashMap hashMap = this.c2;
        hashMap.remove(countryIso2);
        this.X1.c(hashMap.size(), true);
        this.W1.O(true);
    }

    @Override // qe.b
    public final /* synthetic */ void F(float f10, int i3) {
    }
}
