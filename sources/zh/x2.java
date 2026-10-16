package zh;

import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.sk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.y40;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class x2 {
    public final TL_stars.TL_starGiftUnique a;
    public final Context b;
    public final int c;
    public final long d;
    public final String e;
    public final boolean f;
    public final org.telegram.ui.ActionBar.c6 g;
    public final org.telegram.ui.ActionBar.a2 h;
    public final y40 i;
    public final TextView j;
    public a k;
    public TextView l;
    public FrameLayout m;
    public pf.c n;
    public final HashMap o;
    public final HashSet p;
    public ag.b q;
    public di.d4 r;

    public x2(Context context, org.telegram.ui.ActionBar.c6 c6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, v2 v2Var, int i10, long j10, String str, boolean z10, Utilities.Callback2 callback2) {
        HashMap hashMap = new HashMap();
        this.o = hashMap;
        this.p = new HashSet();
        this.b = context;
        this.a = tL_starGiftUnique;
        this.d = j10;
        this.c = i10;
        ag.b bVar = v2Var.a;
        this.q = bVar;
        hashMap.put(bVar, v2Var);
        this.g = c6Var;
        this.e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f = !z11;
        TLObject user = j10 >= 0 ? MessagesController.getInstance(i10).getUser(Long.valueOf(j10)) : MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        LinearLayout e = sk.e(context, 1);
        w2 w2Var = new w2(this, context);
        w2Var.addView(e, w7.z5.d(-2.0f, -1));
        if (z11) {
            this.i = null;
            TextView textView = new TextView(context);
            sk.o(org.telegram.ui.ActionBar.g6.y6, c6Var, textView, 1, 14.0f);
            sk.m(R.string.Gift2BuyPriceOnlyTON, textView, 17);
            e.addView(textView, w7.z5.t(-2, -2, 17, 24, 4, 24, 4));
        } else {
            y40 y40Var = new y40(context, c6Var);
            this.i = y40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInStars));
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInTON));
            y40Var.b(arrayList, new v(this, 2));
            e.addView(y40Var, w7.z5.t(-2, -2, 1, 18, 0, 18, 12));
        }
        e.addView(new u2(context, tL_starGiftUnique, user), w7.z5.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.j = textView2;
        sk.o(org.telegram.ui.ActionBar.g6.j5, c6Var, textView2, 1, 16.0f);
        e.addView(textView2, w7.z5.t(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            o01 o01Var = new o01(context, c6Var);
            r3.r1(o01Var, n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            r3.r1(o01Var, n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            r3.r1(o01Var, n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                o01Var.c(LocaleController.getString(R.string.GiftValue2), t8.b.h("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), null, null);
            }
            e.addView(o01Var, w7.z5.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.n(w2Var);
        alertDialog$Builder.k("_", new org.telegram.ui.Components.e2(this, i10, context, c6Var, callback2, 6));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        this.h = alertDialog$Builder.a;
    }

    public final void a(boolean z10) {
        di.d4 d4Var;
        ag.b bVar = this.q;
        v2 v2Var = (v2) this.o.get(bVar);
        TextView textView = this.j;
        textView.animate().alpha(v2Var != null ? 1.0f : 0.25f).start();
        textView.setEnabled(v2Var != null);
        this.l.setEnabled(v2Var != null);
        a aVar = this.k;
        if (aVar.e != bVar) {
            aVar.e = bVar;
            aVar.a();
        }
        ag.b bVar2 = ag.b.b;
        y40 y40Var = this.i;
        if (y40Var != null) {
            y40Var.a(bVar == bVar2 ? 1 : 0, z10);
        }
        if (bVar == bVar2 && (d4Var = this.r) != null && d4Var.V) {
            d4Var.e(true);
        }
        a aVar2 = this.k;
        ag.b bVar3 = ag.b.a;
        if (aVar2 != null) {
            if (bVar == bVar3) {
                aVar2.setOnClickListener(new ji.o4(this, 25));
            } else {
                aVar2.setOnClickListener(new ah.f(21));
            }
        }
        pf.c cVar = this.n;
        if (cVar != null) {
            cVar.a(false);
            this.n = null;
        }
        int i10 = this.c;
        long j10 = this.d;
        if (v2Var == null) {
            pf.c g10 = this.h.g(-1, false, false);
            this.n = g10;
            g10.d();
            if (this.p.add(bVar)) {
                n5.x(i10, bVar).H(this.a, j10, null, true, new org.telegram.ui.Wallet.z6(15, this, bVar));
                return;
            }
            return;
        }
        ag.b bVar4 = v2Var.a;
        ag.a aVar3 = v2Var.c;
        boolean z11 = j10 == UserConfig.getInstance(i10).getClientUserId();
        String str = this.e;
        if (bVar4 == bVar3) {
            this.l.setText(p7.R0(LocaleController.formatPluralStringComma("Gift2BuyDoPrice2", (int) aVar3.a())));
            textView.setText(AndroidUtilities.replaceTags(z11 ? LocaleController.formatPluralStringComma("Gift2BuyPriceSelfText", (int) aVar3.a(), str) : LocaleController.formatPluralStringComma("Gift2BuyPriceText", (int) aVar3.a(), str, DialogObject.getShortName(j10))));
        }
        if (bVar4 == bVar2) {
            this.l.setText(p7.T0(LocaleController.formatString(R.string.Gift2BuyDoPrice2TON, aVar3.d()), true));
            textView.setText(AndroidUtilities.replaceTags(z11 ? LocaleController.formatString(R.string.Gift2BuyPriceSelfTextTON, aVar3.d(), str) : LocaleController.formatString(R.string.Gift2BuyPriceTextTON, aVar3.d(), str, DialogObject.getShortName(j10))));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.a2 a2Var = this.h;
        a2Var.X0 = true;
        a2Var.show();
        this.l = (TextView) a2Var.d(-1);
        this.k = a2Var.Z0;
        FrameLayout frameLayout = a2Var.Y0;
        this.m = frameLayout;
        if (frameLayout != null && this.f) {
            di.d4 d4Var = new di.d4(this.b, 3);
            d4Var.p(true);
            d4Var.K = Layout.Alignment.ALIGN_NORMAL;
            d4Var.d = 5000L;
            d4Var.s(LocaleController.getString(R.string.Gift2BuyPricePayHintTON));
            d4Var.u();
            this.r = d4Var;
            d4Var.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
            this.m.addView(this.r, w7.z5.a(100.0f, 0.0f, 26.0f, 0.0f, 0.0f, -2, 48));
        }
        a(false);
    }
}
