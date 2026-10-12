package ug;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
import zh.f5;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(zc zcVar, boolean z10, TLRPC.Chat chat, c6 c6Var) {
        this.c = zcVar;
        this.b = z10;
        this.d = chat;
        this.e = c6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string;
        int i10 = this.a;
        boolean z10 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i10) {
            case 0:
                zc zcVar = (zc) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                c6 c6Var = (c6) obj;
                int i11 = R.raw.star_premium_2;
                String string2 = z10 ? LocaleController.getString("BoostingGiveawayCreated", R.string.BoostingGiveawayCreated) : LocaleController.getString("BoostingAwardsCreated", R.string.BoostingAwardsCreated);
                if (z10) {
                    string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckStatistic : R.string.BoostingCheckStatisticGroup);
                } else {
                    string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckGiftsStatistic : R.string.BoostingCheckGiftsStatisticGroup);
                }
                sc M = zcVar.M(string2, AndroidUtilities.replaceSingleTag(string, g6.Gi, 0, new d(chat), c6Var), i11);
                M.j = 5000;
                M.j();
                break;
            default:
                f5 f5Var = (f5) obj3;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = f5Var.l;
                int i12 = f5Var.a;
                if (((int[]) obj2)[0] == f5Var.m) {
                    f5Var.i = false;
                    f5Var.m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i12).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i12).putChats(tL_payments_savedStarGifts.chats, false);
                        if (z10) {
                            arrayList.clear();
                        }
                        arrayList.addAll(tL_payments_savedStarGifts.gifts);
                        f5Var.k = tL_payments_savedStarGifts.next_offset;
                        f5Var.n = tL_payments_savedStarGifts.count;
                        f5Var.h = (tL_payments_savedStarGifts.flags & 2) != 0 ? Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled) : null;
                        f5Var.j = arrayList.size() > f5Var.n || f5Var.k == null;
                    } else {
                        f5Var.j = true;
                    }
                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(f5Var.b), f5Var);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ c(f5 f5Var, int[] iArr, TLObject tLObject, boolean z10) {
        this.c = f5Var;
        this.d = iArr;
        this.e = tLObject;
        this.b = z10;
    }
}
