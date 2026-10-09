package pg;

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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.tc;
import yh.e5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string;
        int i10 = this.a;
        boolean z10 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        int i11 = 0;
        switch (i10) {
            case 0:
                s0 s0Var = (s0) obj3;
                s0Var.f.f(new q0(s0Var, (a5.a) obj2, i11));
                s0Var.f.f(new q0(s0Var, (a5.a) obj, i11));
                s0Var.E = z10;
                break;
            case 1:
                ad adVar = (ad) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                e6 e6Var = (e6) obj;
                int i12 = R.raw.star_premium_2;
                String string2 = z10 ? LocaleController.getString("BoostingGiveawayCreated", R.string.BoostingGiveawayCreated) : LocaleController.getString("BoostingAwardsCreated", R.string.BoostingAwardsCreated);
                if (z10) {
                    string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckStatistic : R.string.BoostingCheckStatisticGroup);
                } else {
                    string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckGiftsStatistic : R.string.BoostingCheckGiftsStatisticGroup);
                }
                tc M = adVar.M(string2, AndroidUtilities.replaceSingleTag(string, i6.Gi, 0, new tg.c(chat), e6Var), i12);
                M.j = 5000;
                M.j();
                break;
            default:
                e5 e5Var = (e5) obj3;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = e5Var.l;
                int i13 = e5Var.a;
                if (((int[]) obj2)[0] == e5Var.m) {
                    e5Var.i = false;
                    e5Var.m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i13).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i13).putChats(tL_payments_savedStarGifts.chats, false);
                        if (z10) {
                            arrayList.clear();
                        }
                        arrayList.addAll(tL_payments_savedStarGifts.gifts);
                        e5Var.k = tL_payments_savedStarGifts.next_offset;
                        e5Var.n = tL_payments_savedStarGifts.count;
                        e5Var.h = (tL_payments_savedStarGifts.flags & 2) != 0 ? Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled) : null;
                        e5Var.j = arrayList.size() > e5Var.n || e5Var.k == null;
                    } else {
                        e5Var.j = true;
                    }
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(e5Var.b), e5Var);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ l0(ad adVar, boolean z10, TLRPC.Chat chat, e6 e6Var) {
        this.a = 1;
        this.c = adVar;
        this.b = z10;
        this.d = chat;
        this.e = e6Var;
    }
}
