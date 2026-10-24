package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class zw extends b61 {
    public final /* synthetic */ s51[] e2;
    public final /* synthetic */ ey f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw(ey eyVar, ey eyVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.g6 g6Var, s51[] s51VarArr) {
        super(eyVar2, activity, true, num, 0, g6Var);
        this.f2 = eyVar;
        this.e2 = s51VarArr;
    }

    @Override // org.telegram.ui.b61
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i10 = ((org.telegram.ui.ActionBar.o2) this.f2).currentAccount;
        return ai.ha.y(i10, false).n(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.b61
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.TL_emojiStatus tL_emojiStatus;
        TLRPC.EmojiStatus emojiStatus;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.g6 g6Var;
        s51[] s51VarArr = this.e2;
        ey eyVar = this.f2;
        if (l4 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i10 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
                TL_stars.SavedStarGift n10 = ai.ha.y(i10, false).n(tL_starGiftUnique.id);
                if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                    MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i11 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
                    i12 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
                    long clientUserId = UserConfig.getInstance(i12).getClientUserId();
                    g6Var = ((org.telegram.ui.ActionBar.o2) eyVar).resourceProvider;
                    ai.l7 l7Var = new ai.l7(context, i11, clientUserId, g6Var, null);
                    l7Var.L2(n10, null);
                    l7Var.P2();
                    l7Var.show();
                    s51 s51Var = s51VarArr[0];
                    if (s51Var != null) {
                        eyVar.M0 = null;
                        s51Var.dismiss();
                        return;
                    }
                    return;
                }
                TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                tL_inputEmojiStatusCollectible.collectible_id = tL_starGiftUnique.id;
                tL_emojiStatus = tL_inputEmojiStatusCollectible;
                if (num != null) {
                    tL_inputEmojiStatusCollectible.flags |= 1;
                    tL_inputEmojiStatusCollectible.until = num.intValue();
                    tL_emojiStatus = tL_inputEmojiStatusCollectible;
                }
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus2 = new TLRPC.TL_emojiStatus();
                tL_emojiStatus2.document_id = l4.longValue();
                tL_emojiStatus = tL_emojiStatus2;
                if (num != null) {
                    tL_emojiStatus2.flags |= 1;
                    tL_emojiStatus2.until = num.intValue();
                    tL_emojiStatus = tL_emojiStatus2;
                }
            }
            emojiStatus = tL_emojiStatus;
        }
        eyVar.getMessagesController().updateEmojiStatus(emojiStatus, tL_starGiftUnique);
        if (l4 != null) {
            org.telegram.ui.Cells.o oVar = eyVar.F3;
            ah.i1 i1Var = new ah.i1();
            long longValue = l4.longValue();
            i1Var.g = longValue;
            i1Var.h = longValue;
            oVar.a(i1Var);
        }
        s51 s51Var2 = s51VarArr[0];
        if (s51Var2 != null) {
            eyVar.M0 = null;
            s51Var2.dismiss();
        }
    }
}
