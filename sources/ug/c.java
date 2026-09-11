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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yc;
import zh.j5;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(yc ycVar, boolean z10, TLRPC.Chat chat, f6 f6Var) {
        this.c = ycVar;
        this.b = z10;
        this.d = chat;
        this.e = f6Var;
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
                yc ycVar = (yc) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                f6 f6Var = (f6) obj;
                int i11 = R.raw.star_premium_2;
                String string2 = z10 ? LocaleController.getString("BoostingGiveawayCreated", R.string.BoostingGiveawayCreated) : LocaleController.getString("BoostingAwardsCreated", R.string.BoostingAwardsCreated);
                if (z10) {
                    string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckStatistic : R.string.BoostingCheckStatisticGroup);
                } else {
                    string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckGiftsStatistic : R.string.BoostingCheckGiftsStatisticGroup);
                }
                qc M = ycVar.M(string2, AndroidUtilities.replaceSingleTag(string, j6.Gi, 0, new d(chat), f6Var), i11);
                M.j = 5000;
                M.j();
                break;
            default:
                j5 j5Var = (j5) obj3;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = j5Var.l;
                int i12 = j5Var.a;
                if (((int[]) obj2)[0] == j5Var.m) {
                    j5Var.i = false;
                    j5Var.m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i12).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i12).putChats(tL_payments_savedStarGifts.chats, false);
                        if (z10) {
                            arrayList.clear();
                        }
                        arrayList.addAll(tL_payments_savedStarGifts.gifts);
                        j5Var.k = tL_payments_savedStarGifts.next_offset;
                        j5Var.n = tL_payments_savedStarGifts.count;
                        j5Var.h = (tL_payments_savedStarGifts.flags & 2) != 0 ? Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled) : null;
                        j5Var.j = arrayList.size() > j5Var.n || j5Var.k == null;
                    } else {
                        j5Var.j = true;
                    }
                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(j5Var.b), j5Var);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ c(j5 j5Var, int[] iArr, TLObject tLObject, boolean z10) {
        this.c = j5Var;
        this.d = iArr;
        this.e = tLObject;
        this.b = z10;
    }
}
