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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.z5;
import org.telegram.ui.Components.zl0;
import yh.z7;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class a extends g61 {
    public static final /* synthetic */ int a = 0;

    static {
        g61.setup(new a());
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        b bVar = (b) view;
        GiftAuctionController.Auction auction = (GiftAuctionController.Auction) h61Var.H;
        TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift = (TL_stars.TL_StarGiftAuctionAcquiredGift) h61Var.G;
        View.OnClickListener onClickListener = h61Var.D;
        int i10 = b.c;
        bVar.removeAllViews();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(new z5(auction.giftDocumentId, i6.s2.getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.Gift2AuctionsAcquiredRound2, auction.gift.title, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.gift_num), Integer.valueOf(tL_StarGiftAuctionAcquiredGift.round)));
        spannableStringBuilder.setSpan(new e61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) z7.d1(false, org.telegram.messenger.q.h(tL_StarGiftAuctionAcquiredGift.bid_amount, ',', new StringBuilder("⭐️")), 0.75f, null));
        String formatString = LocaleController.formatString(R.string.Gift2AuctionsAcquiredTop, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.pos));
        l01 l01Var = new l01(bVar.getContext(), bVar.a);
        l01Var.a(spannableStringBuilder).setFilled(true);
        l01Var.k(LocaleController.getString(R.string.Gift2AuctionsAcquiredRecipient), bVar.b, DialogObject.getPeerDialogId(tL_StarGiftAuctionAcquiredGift.peer), new u2.i0(9, bVar, onClickListener));
        l01Var.f(tL_StarGiftAuctionAcquiredGift.date, LocaleController.getString(R.string.Gift2AuctionsAcquiredDate));
        l01Var.e(LocaleController.getString(R.string.Gift2AuctionsAcquiredAcceptedBid), spannableStringBuilder2, formatString, null, null);
        bVar.addView(l01Var, w7.z5.c(-2.0f, -1));
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        b bVar = new b(context, i10, d6Var);
        bVar.setLayoutParams(w7.z5.c(-2.0f, -1));
        return bVar;
    }

    @Override // org.telegram.ui.Components.g61
    public final boolean isClickable() {
        return false;
    }
}
