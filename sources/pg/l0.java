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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.xc;
import yh.l5;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                xc xcVar = (xc) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                f6 f6Var = (f6) obj;
                int i12 = R.raw.star_premium_2;
                String string2 = z10 ? LocaleController.getString("BoostingGiveawayCreated", R.string.BoostingGiveawayCreated) : LocaleController.getString("BoostingAwardsCreated", R.string.BoostingAwardsCreated);
                if (z10) {
                    string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckStatistic : R.string.BoostingCheckStatisticGroup);
                } else {
                    string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckGiftsStatistic : R.string.BoostingCheckGiftsStatisticGroup);
                }
                pc M = xcVar.M(string2, AndroidUtilities.replaceSingleTag(string, j6.Gi, 0, new tg.c(chat), f6Var), i12);
                M.j = 5000;
                M.j();
                break;
            default:
                l5 l5Var = (l5) obj3;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = l5Var.l;
                int i13 = l5Var.a;
                if (((int[]) obj2)[0] == l5Var.m) {
                    l5Var.i = false;
                    l5Var.m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i13).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i13).putChats(tL_payments_savedStarGifts.chats, false);
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
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(l5Var.b), l5Var);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ l0(xc xcVar, boolean z10, TLRPC.Chat chat, f6 f6Var) {
        this.a = 1;
        this.c = xcVar;
        this.b = z10;
        this.d = chat;
        this.e = f6Var;
    }
}
