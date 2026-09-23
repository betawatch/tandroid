package tg;

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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import yh.l5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(xc xcVar, boolean z10, TLRPC.Chat chat, d6 d6Var) {
        this.c = xcVar;
        this.b = z10;
        this.d = chat;
        this.e = d6Var;
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
                xc xcVar = (xc) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                d6 d6Var = (d6) obj;
                int i11 = R.raw.star_premium_2;
                String string2 = z10 ? LocaleController.getString("BoostingGiveawayCreated", R.string.BoostingGiveawayCreated) : LocaleController.getString("BoostingAwardsCreated", R.string.BoostingAwardsCreated);
                if (z10) {
                    string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckStatistic : R.string.BoostingCheckStatisticGroup);
                } else {
                    string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckGiftsStatistic : R.string.BoostingCheckGiftsStatisticGroup);
                }
                qc M = xcVar.M(string2, AndroidUtilities.replaceSingleTag(string, h6.Gi, 0, new e(chat), d6Var), i11);
                M.j = 5000;
                M.j();
                break;
            default:
                l5 l5Var = (l5) obj3;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = l5Var.l;
                int i12 = l5Var.a;
                if (((int[]) obj2)[0] == l5Var.m) {
                    l5Var.i = false;
                    l5Var.m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i12).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i12).putChats(tL_payments_savedStarGifts.chats, false);
                        if (z10) {
                            arrayList.clear();
                        }
                        arrayList.addAll(tL_payments_savedStarGifts.gifts);
                        l5Var.k = tL_payments_savedStarGifts.next_offset;
                        l5Var.n = tL_payments_savedStarGifts.count;
                        l5Var.h = (tL_payments_savedStarGifts.flags & 2) != 0 ? Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled) : null;
                        l5Var.j = arrayList.size() > l5Var.n || l5Var.k == null;
                    } else {
                        l5Var.j = true;
                    }
                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(l5Var.b), l5Var);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ c(l5 l5Var, int[] iArr, TLObject tLObject, boolean z10) {
        this.c = l5Var;
        this.d = iArr;
        this.e = tLObject;
        this.b = z10;
    }
}
