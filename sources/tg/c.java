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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vc;
import yh.m5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(vc vcVar, boolean z10, TLRPC.Chat chat, e6 e6Var) {
        this.c = vcVar;
        this.b = z10;
        this.d = chat;
        this.e = e6Var;
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
                vc vcVar = (vc) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                e6 e6Var = (e6) obj;
                int i11 = R.raw.star_premium_2;
                String string2 = z10 ? LocaleController.getString("BoostingGiveawayCreated", R.string.BoostingGiveawayCreated) : LocaleController.getString("BoostingAwardsCreated", R.string.BoostingAwardsCreated);
                if (z10) {
                    string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckStatistic : R.string.BoostingCheckStatisticGroup);
                } else {
                    string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckGiftsStatistic : R.string.BoostingCheckGiftsStatisticGroup);
                }
                oc M = vcVar.M(string2, AndroidUtilities.replaceSingleTag(string, i6.Gi, 0, new e(chat), e6Var), i11);
                M.j = 5000;
                M.j();
                break;
            default:
                m5 m5Var = (m5) obj3;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = m5Var.l;
                int i12 = m5Var.a;
                if (((int[]) obj2)[0] == m5Var.m) {
                    m5Var.i = false;
                    m5Var.m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i12).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i12).putChats(tL_payments_savedStarGifts.chats, false);
                        if (z10) {
                            arrayList.clear();
                        }
                        arrayList.addAll(tL_payments_savedStarGifts.gifts);
                        m5Var.k = tL_payments_savedStarGifts.next_offset;
                        m5Var.n = tL_payments_savedStarGifts.count;
                        m5Var.h = (tL_payments_savedStarGifts.flags & 2) != 0 ? Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled) : null;
                        m5Var.j = arrayList.size() > m5Var.n || m5Var.k == null;
                    } else {
                        m5Var.j = true;
                    }
                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(m5Var.b), m5Var);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ c(m5 m5Var, int[] iArr, TLObject tLObject, boolean z10) {
        this.c = m5Var;
        this.d = iArr;
        this.e = tLObject;
        this.b = z10;
    }
}
