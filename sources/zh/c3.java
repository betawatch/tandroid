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
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.l40;
import org.telegram.ui.Components.oz0;
import org.telegram.ui.oj0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class c3 {
    public final TL_stars.TL_starGiftUnique a;
    public final Context b;
    public final int c;
    public final long d;
    public final String e;
    public final boolean f;
    public final org.telegram.ui.ActionBar.f6 g;
    public final org.telegram.ui.ActionBar.b2 h;
    public final l40 i;
    public final TextView j;
    public a k;
    public TextView l;
    public FrameLayout m;
    public of.e n;
    public final HashMap o;
    public final HashSet p;
    public zf.b q;
    public di.f4 r;

    public c3(Context context, org.telegram.ui.ActionBar.f6 f6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, a3 a3Var, int i10, long j3, String str, boolean z10, Utilities.Callback2 callback2) {
        HashMap hashMap = new HashMap();
        this.o = hashMap;
        this.p = new HashSet();
        this.b = context;
        this.a = tL_starGiftUnique;
        this.d = j3;
        this.c = i10;
        zf.b bVar = a3Var.a;
        this.q = bVar;
        hashMap.put(bVar, a3Var);
        this.g = f6Var;
        this.e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f = !z11;
        TLObject user = j3 >= 0 ? MessagesController.getInstance(i10).getUser(Long.valueOf(j3)) : MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
        LinearLayout f7 = wl.f(context, 1);
        b3 b3Var = new b3(this, context);
        b3Var.addView(f7, w7.x5.c(-2.0f, -1));
        if (z11) {
            this.i = null;
            TextView textView = new TextView(context);
            wl.n(org.telegram.ui.ActionBar.j6.y6, f6Var, textView, 1, 14.0f);
            wl.k(R.string.Gift2BuyPriceOnlyTON, textView, 17);
            f7.addView(textView, w7.x5.t(-2, -2, 17, 24, 4, 24, 4));
        } else {
            l40 l40Var = new l40(context, f6Var);
            this.i = l40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInStars));
            arrayList.add(LocaleController.getString(R.string.Gift2BuyInTON));
            l40Var.b(arrayList, new v(this, 2));
            f7.addView(l40Var, w7.x5.t(-2, -2, 1, 18, 0, 18, 12));
        }
        f7.addView(new z2(context, tL_starGiftUnique, user), w7.x5.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.j = textView2;
        wl.n(org.telegram.ui.ActionBar.j6.j5, f6Var, textView2, 1, 16.0f);
        f7.addView(textView2, w7.x5.t(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            oz0 oz0Var = new oz0(context, f6Var);
            w3.q1(oz0Var, s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            w3.q1(oz0Var, s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            w3.q1(oz0Var, s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                oz0Var.c(LocaleController.getString(R.string.GiftValue2), org.telegram.ui.Cells.p6.i("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), null, null);
            }
            f7.addView(oz0Var, w7.x5.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        alertDialog$Builder.n(b3Var);
        alertDialog$Builder.k("_", new org.telegram.ui.Components.e2(this, i10, context, f6Var, callback2, 6));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        this.h = alertDialog$Builder.a;
    }

    public final void a(boolean z10) {
        di.f4 f4Var;
        zf.b bVar = this.q;
        a3 a3Var = (a3) this.o.get(bVar);
        TextView textView = this.j;
        textView.animate().alpha(a3Var != null ? 1.0f : 0.25f).start();
        textView.setEnabled(a3Var != null);
        this.l.setEnabled(a3Var != null);
        a aVar = this.k;
        if (aVar.e != bVar) {
            aVar.e = bVar;
            aVar.a();
        }
        zf.b bVar2 = zf.b.b;
        l40 l40Var = this.i;
        if (l40Var != null) {
            l40Var.a(bVar == bVar2 ? 1 : 0, z10);
        }
        if (bVar == bVar2 && (f4Var = this.r) != null && f4Var.V) {
            f4Var.e(true);
        }
        a aVar2 = this.k;
        zf.b bVar3 = zf.b.a;
        if (aVar2 != null) {
            if (bVar == bVar3) {
                aVar2.setOnClickListener(new ji.m4(this, 25));
            } else {
                aVar2.setOnClickListener(new ah.f(21));
            }
        }
        of.e eVar = this.n;
        if (eVar != null) {
            eVar.a(false);
            this.n = null;
        }
        int i10 = this.c;
        long j3 = this.d;
        if (a3Var == null) {
            of.e g10 = this.h.g(-1, false, false);
            this.n = g10;
            g10.d();
            if (this.p.add(bVar)) {
                s5.x(i10, bVar).H(this.a, j3, null, true, new oj0(20, this, bVar));
                return;
            }
            return;
        }
        zf.b bVar4 = a3Var.a;
        zf.a aVar3 = a3Var.c;
        boolean z11 = j3 == UserConfig.getInstance(i10).getClientUserId();
        String str = this.e;
        if (bVar4 == bVar3) {
            this.l.setText(v7.Q0(LocaleController.formatPluralStringComma("Gift2BuyDoPrice2", (int) aVar3.a())));
            textView.setText(AndroidUtilities.replaceTags(z11 ? LocaleController.formatPluralStringComma("Gift2BuyPriceSelfText", (int) aVar3.a(), str) : LocaleController.formatPluralStringComma("Gift2BuyPriceText", (int) aVar3.a(), str, DialogObject.getShortName(j3))));
        }
        if (bVar4 == bVar2) {
            this.l.setText(v7.S0(LocaleController.formatString(R.string.Gift2BuyDoPrice2TON, aVar3.d()), true));
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
            di.f4 f4Var = new di.f4(this.b, 3);
            f4Var.p(true);
            f4Var.K = Layout.Alignment.ALIGN_NORMAL;
            f4Var.d = 5000L;
            f4Var.s(LocaleController.getString(R.string.Gift2BuyPricePayHintTON));
            f4Var.u();
            this.r = f4Var;
            f4Var.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
            this.m.addView(this.r, w7.x5.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}
