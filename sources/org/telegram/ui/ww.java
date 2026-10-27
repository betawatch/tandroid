package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ww extends f61 {
    public final /* synthetic */ w51[] e2;
    public final /* synthetic */ ey f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(ey eyVar, ey eyVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.u6 u6Var, w51[] w51VarArr) {
        super(eyVar2, activity, true, num, 0, u6Var);
        this.f2 = eyVar;
        this.e2 = w51VarArr;
    }

    @Override // org.telegram.ui.f61
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i10 = ((org.telegram.ui.ActionBar.r2) this.f2).currentAccount;
        return bi.ca.y(i10, false).n(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.f61
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.TL_emojiStatus tL_emojiStatus;
        TLRPC.EmojiStatus emojiStatus;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.u6 u6Var;
        w51[] w51VarArr = this.e2;
        ey eyVar = this.f2;
        if (l4 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i10 = ((org.telegram.ui.ActionBar.r2) eyVar).currentAccount;
                TL_stars.SavedStarGift n10 = bi.ca.y(i10, false).n(tL_starGiftUnique.id);
                if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                    MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i11 = ((org.telegram.ui.ActionBar.r2) eyVar).currentAccount;
                    i12 = ((org.telegram.ui.ActionBar.r2) eyVar).currentAccount;
                    long clientUserId = UserConfig.getInstance(i12).getClientUserId();
                    u6Var = ((org.telegram.ui.ActionBar.r2) eyVar).resourceProvider;
                    bi.h7 h7Var = new bi.h7(context, i11, clientUserId, u6Var, null);
                    h7Var.L2(n10, null);
                    h7Var.P2();
                    h7Var.show();
                    w51 w51Var = w51VarArr[0];
                    if (w51Var != null) {
                        eyVar.M0 = null;
                        w51Var.dismiss();
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
            bh.x0 x0Var = new bh.x0();
            long longValue = l4.longValue();
            x0Var.g = longValue;
            x0Var.h = longValue;
            oVar.a(x0Var);
        }
        w51 w51Var2 = w51VarArr[0];
        if (w51Var2 != null) {
            eyVar.M0 = null;
            w51Var2.dismiss();
        }
    }
}
