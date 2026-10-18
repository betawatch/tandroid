package yh;

import android.content.Context;
import android.util.LongSparseArray;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.s61;
import w7.z5;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class e extends bb implements GiftAuctionController.OnActiveAuctionsUpdateListeners {
    public final f61 X;
    public final LongSparseArray Y;
    public ArrayList Z;
    public boolean a0;
    public s61 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context, null, false, false, 2, null);
        int i10 = 0;
        this.Y = new LongSparseArray();
        this.Z = new ArrayList();
        setBackgroundColor(h6.x0(null, h6.a7, false));
        GiftAuctionController.getInstance(this.currentAccount).subscribeToActiveAuctionsUpdates(this);
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.X = f61.j(-1, linearLayout);
        this.d.setPadding(this.backgroundPaddingLeft, AndroidUtilities.dp(9.0f), this.backgroundPaddingLeft, AndroidUtilities.dp(9.0f));
        this.d.setOverScrollMode(2);
        this.b0.N(false);
        ArrayList<GiftAuctionController.Auction> activeAuctions = GiftAuctionController.getInstance(this.currentAccount).getActiveAuctions();
        int size = activeAuctions.size();
        while (i10 < size) {
            GiftAuctionController.Auction auction = activeAuctions.get(i10);
            i10++;
            GiftAuctionController.Auction auction2 = auction;
            d dVar = new d(context, auction2);
            dVar.a.setOnClickListener(new m41(this, context, auction2, 4));
            linearLayout.addView(dVar, z5.n(-1, -2));
            this.Y.put(auction2.giftId, dVar);
        }
        onActiveAuctionsUpdate(activeAuctions);
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence A() {
        ArrayList arrayList = this.Z;
        if (arrayList == null) {
            return null;
        }
        return LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveAuctionsTitle, Integer.valueOf(arrayList.size()));
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromActiveAuctionsUpdates(this);
        super.dismiss();
    }

    @Override // org.telegram.messenger.GiftAuctionController.OnActiveAuctionsUpdateListeners
    public final void onActiveAuctionsUpdate(List list) {
        this.Z = new ArrayList(list);
        this.e.setTitle(A());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GiftAuctionController.Auction auction = (GiftAuctionController.Auction) it.next();
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
            int i10 = tL_starGiftAuctionState != null ? tL_starGiftAuctionState.next_round_at : 0;
            d dVar = (d) this.Y.get(auction.giftId);
            if (dVar != null) {
                dVar.b(this.a0);
                long max = Math.max(0, i10 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
                dVar.a(max, this.a0);
                dVar.f.a(max);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.a0 = true;
    }

    @Override // org.telegram.ui.Components.bb
    public final hm0 x(im0 im0Var) {
        s61 s61Var = new s61(this.d, getContext(), this.currentAccount, 0, true, new hg.o(this, 23), this.resourcesProvider);
        this.b0 = s61Var;
        s61Var.r = false;
        return s61Var;
    }
}
