package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.x5;
import yh.x7;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class a extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new a());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        b bVar = (b) view;
        GiftAuctionController.Auction auction = (GiftAuctionController.Auction) i51Var.H;
        TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift = (TL_stars.TL_StarGiftAuctionAcquiredGift) i51Var.G;
        View.OnClickListener onClickListener = i51Var.D;
        int i10 = b.c;
        bVar.removeAllViews();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(new x5(auction.giftDocumentId, i6.s2.getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.Gift2AuctionsAcquiredRound2, auction.gift.title, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.gift_num), Integer.valueOf(tL_StarGiftAuctionAcquiredGift.round)));
        spannableStringBuilder.setSpan(new f51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) x7.X0(false, hg.c.k(tL_StarGiftAuctionAcquiredGift.bid_amount, ',', new StringBuilder("⭐️")), 0.75f, null));
        String formatString = LocaleController.formatString(R.string.Gift2AuctionsAcquiredTop, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.pos));
        pz0 pz0Var = new pz0(bVar.getContext(), bVar.a);
        pz0Var.a(spannableStringBuilder).setFilled(true);
        pz0Var.k(LocaleController.getString(R.string.Gift2AuctionsAcquiredRecipient), bVar.b, DialogObject.getPeerDialogId(tL_StarGiftAuctionAcquiredGift.peer), new uh.i(3, bVar, onClickListener));
        pz0Var.f(tL_StarGiftAuctionAcquiredGift.date, LocaleController.getString(R.string.Gift2AuctionsAcquiredDate));
        pz0Var.e(LocaleController.getString(R.string.Gift2AuctionsAcquiredAcceptedBid), spannableStringBuilder2, formatString, null, null);
        bVar.addView(pz0Var, w7.x5.c(-2.0f, -1));
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, e6 e6Var) {
        b bVar = new b(context, i10, e6Var);
        bVar.setLayoutParams(w7.x5.c(-2.0f, -1));
        return bVar;
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean isClickable() {
        return false;
    }
}
