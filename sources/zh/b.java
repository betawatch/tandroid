package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import bi.dd;
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.s9;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class b extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new b());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        c cVar = (c) view;
        s9 s9Var = (s9) x31Var.H;
        TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift = (TL_stars.TL_StarGiftAuctionAcquiredGift) x31Var.G;
        View.OnClickListener onClickListener = x31Var.D;
        int i7 = c.c;
        cVar.removeAllViews();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(new q5(s9Var.c, m6.s2.getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) id.a0(null, null, 2131750309, s9Var.d.title, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.gift_num), Integer.valueOf(tL_StarGiftAuctionAcquiredGift.round)));
        spannableStringBuilder.setSpan(new u31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) dd.a1(false, jg.g.m(tL_StarGiftAuctionAcquiredGift.bid_amount, ',', new StringBuilder("⭐️")), 0.75f, null));
        String a02 = id.a0(null, null, 2131750308, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.pos));
        tx0 tx0Var = new tx0(cVar.getContext(), cVar.a);
        tx0Var.a(spannableStringBuilder).setFilled(true);
        tx0Var.n(id.M0(2131750311, null), cVar.b, m5.o(tL_StarGiftAuctionAcquiredGift.peer), new yf.b(6, cVar, onClickListener));
        tx0Var.g(tL_StarGiftAuctionAcquiredGift.date, id.M0(2131750315, null));
        tx0Var.e(id.M0(2131750316, null), spannableStringBuilder2, a02, null, null);
        cVar.addView(tx0Var, ha.c(-2.0f, -1));
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, h6 h6Var) {
        c cVar = new c(i7, context, h6Var);
        cVar.setLayoutParams(ha.c(-2.0f, -1));
        return cVar;
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean f() {
        return false;
    }
}
