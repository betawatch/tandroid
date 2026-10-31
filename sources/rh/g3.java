package rh;

import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.j20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.t30;
import org.telegram.ui.Components.wy0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g3 {
    public final TL_stars.TL_starGiftUnique a;
    public final Context b;
    public final int c;
    public final long d;
    public final String e;
    public final boolean f;
    public final org.telegram.ui.ActionBar.p6 g;
    public final org.telegram.ui.ActionBar.x1 h;
    public final t30 i;
    public final TextView j;
    public a k;
    public TextView l;
    public FrameLayout m;
    public gf.e n;
    public final HashMap o;
    public final HashSet p;
    public sf.b q;
    public vh.p2 r;

    public g3(Context context, org.telegram.ui.ActionBar.p6 p6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, d3 d3Var, int i10, long j10, String str, boolean z10, j20 j20Var) {
        HashMap hashMap = new HashMap();
        this.o = hashMap;
        this.p = new HashSet();
        this.b = context;
        this.a = tL_starGiftUnique;
        this.d = j10;
        this.c = i10;
        sf.b bVar = d3Var.a;
        this.q = bVar;
        hashMap.put(bVar, d3Var);
        this.g = p6Var;
        this.e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f = !z11;
        TLObject Z1 = j10 >= 0 ? vp.r1(i10).Z1(Long.valueOf(j10)) : vp.r1(i10).L0(Long.valueOf(-j10));
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        f3 f3Var = new f3(this, context);
        f3Var.addView(f7, w7.b6.c(-2.0f, -1));
        if (z11) {
            this.i = null;
            TextView textView = new TextView(context);
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.y6, p6Var);
            sc.e.u(textView, 1, 14.0f, null, 2131750286);
            textView.setGravity(17);
            f7.addView(textView, w7.b6.t(-2, -2, 17, 24, 4, 24, 4));
        } else {
            t30 t30Var = new t30(context, p6Var);
            this.i = t30Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(cd.L0(2131750288, null));
            arrayList.add(cd.L0(2131750287, null));
            t30Var.b(arrayList, new x(this, 2));
            f7.addView(t30Var, w7.b6.t(-2, -2, 1, 18, 0, 18, 12));
        }
        f7.addView(new c3(context, tL_starGiftUnique, Z1), w7.b6.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.j = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.j5, p6Var);
        textView2.setTextSize(1, 16.0f);
        f7.addView(textView2, w7.b6.t(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            wy0 wy0Var = new wy0(context, p6Var);
            e4.k1(wy0Var, e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            e4.k1(wy0Var, e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            e4.k1(wy0Var, e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                org.telegram.messenger.u1 i11 = org.telegram.messenger.u1.i();
                long j11 = tL_starGiftUnique.value_amount;
                String str2 = tL_starGiftUnique.value_currency;
                int h = org.telegram.messenger.u1.i().h(tL_starGiftUnique.value_currency);
                i11.getClass();
                wy0Var.c(cd.L0(2131749600, null), sc.e.h("~", org.telegram.messenger.u1.g(str2, h, j11, true)), null, null);
            }
            f7.addView(wy0Var, w7.b6.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        alertDialog$Builder.o(f3Var);
        alertDialog$Builder.k("_", new jg.q2(this, i10, context, p6Var, j20Var, 6));
        alertDialog$Builder.h(cd.L0(2131752589, null), null);
        this.h = alertDialog$Builder.a;
    }

    public final void a(boolean z10) {
        char c10;
        String a02;
        vh.p2 p2Var;
        sf.b bVar = this.q;
        d3 d3Var = (d3) this.o.get(bVar);
        TextView textView = this.j;
        textView.animate().alpha(d3Var != null ? 1.0f : 0.25f).start();
        int i10 = 0;
        textView.setEnabled(d3Var != null);
        this.l.setEnabled(d3Var != null);
        a aVar = this.k;
        if (aVar.e != bVar) {
            aVar.e = bVar;
            aVar.a();
        }
        sf.b bVar2 = sf.b.b;
        t30 t30Var = this.i;
        if (t30Var != null) {
            t30Var.a(bVar == bVar2 ? 1 : 0, z10);
        }
        if (bVar == bVar2 && (p2Var = this.r) != null && p2Var.V) {
            p2Var.e(true);
        }
        a aVar2 = this.k;
        sf.b bVar3 = sf.b.a;
        if (aVar2 != null) {
            if (bVar == bVar3) {
                aVar2.setOnClickListener(new s(this, 6));
            } else {
                aVar2.setOnClickListener(new bh.c(17));
            }
        }
        gf.e eVar = this.n;
        if (eVar != null) {
            eVar.a(false);
            this.n = null;
        }
        int i11 = this.c;
        long j10 = this.d;
        if (d3Var == null) {
            gf.e h = this.h.h(-1, false, false);
            this.n = h;
            h.d();
            if (this.p.add(bVar)) {
                e6.x(i11, bVar).H(this.a, j10, null, true, new e3(i10, this, bVar));
                return;
            }
            return;
        }
        sf.b bVar4 = d3Var.a;
        sf.a aVar3 = d3Var.c;
        boolean z11 = j10 == d20.i(i11).e();
        String str = this.e;
        if (bVar4 == bVar3) {
            c10 = 0;
            this.l.setText(h8.S0(cd.H(',', "Gift2BuyDoPrice2", (int) aVar3.a())));
            textView.setText(org.telegram.messenger.i0.W2(z11 ? cd.K("Gift2BuyPriceSelfText", (int) aVar3.a(), ',', str) : cd.K("Gift2BuyPriceText", (int) aVar3.a(), ',', str, org.telegram.messenger.o5.t(j10))));
        } else {
            c10 = 0;
        }
        if (bVar4 == bVar2) {
            TextView textView2 = this.l;
            Object[] objArr = new Object[1];
            objArr[c10] = aVar3.d();
            textView2.setText(h8.U0(cd.a0(null, null, 2131750291, objArr), true));
            if (z11) {
                String d = aVar3.d();
                Object[] objArr2 = new Object[2];
                objArr2[c10] = d;
                objArr2[1] = str;
                a02 = cd.a0(null, null, 2131750283, objArr2);
            } else {
                String d10 = aVar3.d();
                String t10 = org.telegram.messenger.o5.t(j10);
                Object[] objArr3 = new Object[3];
                objArr3[c10] = d10;
                objArr3[1] = str;
                objArr3[2] = t10;
                a02 = cd.a0(null, null, 2131750279, objArr3);
            }
            textView.setText(org.telegram.messenger.i0.W2(a02));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.x1 x1Var = this.h;
        x1Var.Z0 = true;
        x1Var.show();
        this.l = (TextView) x1Var.d(-1);
        this.k = x1Var.b1;
        FrameLayout frameLayout = x1Var.a1;
        this.m = frameLayout;
        if (frameLayout != null && this.f) {
            vh.p2 p2Var = new vh.p2(this.b, 3);
            p2Var.p(true);
            p2Var.K = Layout.Alignment.ALIGN_NORMAL;
            p2Var.d = 5000L;
            p2Var.s(cd.L0(2131750285, null));
            p2Var.u();
            this.r = p2Var;
            p2Var.setPadding(org.telegram.messenger.i0.L(7.33f), 0, org.telegram.messenger.i0.L(7.33f), 0);
            this.m.addView(this.r, w7.b6.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}
