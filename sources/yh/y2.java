package yh;

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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.c50;
import org.telegram.ui.Components.r01;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class y2 {
    public final TL_stars.TL_starGiftUnique a;
    public final Context b;
    public final int c;
    public final long d;
    public final String e;
    public final boolean f;
    public final org.telegram.ui.ActionBar.e6 g;
    public final org.telegram.ui.ActionBar.b2 h;
    public final c50 i;
    public final TextView j;
    public a k;
    public TextView l;
    public FrameLayout m;
    public of.e n;
    public final HashMap o;
    public final HashSet p;
    public zf.b q;
    public ci.d4 r;

    public y2(Context context, org.telegram.ui.ActionBar.e6 e6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, w2 w2Var, int i10, long j3, String str, boolean z10, Utilities.Callback2 callback2) {
        HashMap hashMap = new HashMap();
        this.o = hashMap;
        this.p = new HashSet();
        this.b = context;
        this.a = tL_starGiftUnique;
        this.d = j3;
        this.c = i10;
        zf.b bVar = w2Var.a;
        this.q = bVar;
        hashMap.put(bVar, w2Var);
        this.g = e6Var;
        this.e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f = !z11;
        TLObject user = j3 >= 0 ? MessagesController.getInstance(i10).getUser(Long.valueOf(j3)) : MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
        LinearLayout e7 = bi.e(context, 1);
        x2 x2Var = new x2(this, context);
        x2Var.addView(e7, w7.x5.d(-2.0f, -1));
        if (z11) {
            this.i = null;
            TextView textView = new TextView(context);
            bi.o(org.telegram.ui.ActionBar.i6.y6, e6Var, textView, 1, 14.0f);
            bi.m(R.string.Gift2BuyPriceOnlyTON, textView, 17);
            e7.addView(textView, w7.x5.t(-2, -2, 17, 24, 4, 24, 4));
        } else {
            c50 c50Var = new c50(context, e6Var);
            this.i = c50Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInStars));
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInTON));
            c50Var.b(arrayList, new u(this, 2));
            e7.addView(c50Var, w7.x5.t(-2, -2, 1, 18, 0, 18, 12));
        }
        e7.addView(new v2(context, tL_starGiftUnique, user), w7.x5.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.j = textView2;
        bi.o(org.telegram.ui.ActionBar.i6.j5, e6Var, textView2, 1, 16.0f);
        e7.addView(textView2, w7.x5.t(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            r01 r01Var = new r01(context, e6Var);
            s3.r1(r01Var, m5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            s3.r1(r01Var, m5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            s3.r1(r01Var, m5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                r01Var.c(LocaleController.getString(R.string.GiftValue2), sc.v.i("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), null, null);
            }
            e7.addView(r01Var, w7.x5.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        alertDialog$Builder.n(x2Var);
        alertDialog$Builder.k("_", new org.telegram.ui.Components.e2(this, i10, context, e6Var, callback2, 6));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        this.h = alertDialog$Builder.a;
    }

    public final void a(boolean z10) {
        ci.d4 d4Var;
        zf.b bVar = this.q;
        w2 w2Var = (w2) this.o.get(bVar);
        TextView textView = this.j;
        textView.animate().alpha(w2Var != null ? 1.0f : 0.25f).start();
        textView.setEnabled(w2Var != null);
        this.l.setEnabled(w2Var != null);
        a aVar = this.k;
        if (aVar.e != bVar) {
            aVar.e = bVar;
            aVar.a();
        }
        zf.b bVar2 = zf.b.b;
        c50 c50Var = this.i;
        if (c50Var != null) {
            c50Var.a(bVar == bVar2 ? 1 : 0, z10);
        }
        if (bVar == bVar2 && (d4Var = this.r) != null && d4Var.V) {
            d4Var.e(true);
        }
        a aVar2 = this.k;
        zf.b bVar3 = zf.b.a;
        if (aVar2 != null) {
            if (bVar == bVar3) {
                aVar2.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 24));
            } else {
                aVar2.setOnClickListener(new ai.e2(20));
            }
        }
        of.e eVar = this.n;
        if (eVar != null) {
            eVar.a(false);
            this.n = null;
        }
        int i10 = this.c;
        long j3 = this.d;
        if (w2Var == null) {
            of.e g10 = this.h.g(-1, false, false);
            this.n = g10;
            g10.d();
            if (this.p.add(bVar)) {
                m5.x(i10, bVar).H(this.a, j3, null, true, new org.telegram.ui.Wallet.z6(15, this, bVar));
                return;
            }
            return;
        }
        zf.b bVar4 = w2Var.a;
        zf.a aVar3 = w2Var.c;
        boolean z11 = j3 == UserConfig.getInstance(i10).getClientUserId();
        String str = this.e;
        if (bVar4 == bVar3) {
            this.l.setText(p7.R0(LocaleController.formatPluralStringComma("Gift2BuyDoPrice2", (int) aVar3.a())));
            textView.setText(AndroidUtilities.replaceTags(z11 ? LocaleController.formatPluralStringComma("Gift2BuyPriceSelfText", (int) aVar3.a(), str) : LocaleController.formatPluralStringComma("Gift2BuyPriceText", (int) aVar3.a(), str, DialogObject.getShortName(j3))));
        }
        if (bVar4 == bVar2) {
            this.l.setText(p7.T0(LocaleController.formatString(R.string.Gift2BuyDoPrice2TON, aVar3.d()), true));
            textView.setText(AndroidUtilities.replaceTags(z11 ? LocaleController.formatString(R.string.Gift2BuyPriceSelfTextTON, aVar3.d(), str) : LocaleController.formatString(R.string.Gift2BuyPriceTextTON, aVar3.d(), str, DialogObject.getShortName(j3))));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.b2 b2Var = this.h;
        b2Var.X0 = true;
        b2Var.show();
        this.l = (TextView) b2Var.d(-1);
        this.k = b2Var.Z0;
        FrameLayout frameLayout = b2Var.Y0;
        this.m = frameLayout;
        if (frameLayout != null && this.f) {
            ci.d4 d4Var = new ci.d4(this.b, 3);
            d4Var.p(true);
            d4Var.K = Layout.Alignment.ALIGN_NORMAL;
            d4Var.d = 5000L;
            d4Var.s(LocaleController.getString(R.string.Gift2BuyPricePayHintTON));
            d4Var.u();
            this.r = d4Var;
            d4Var.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
            this.m.addView(this.r, w7.x5.a(100.0f, 0.0f, 26.0f, 0.0f, 0.0f, -2, 48));
        }
        a(false);
    }
}
