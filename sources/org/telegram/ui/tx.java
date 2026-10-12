package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class tx extends r71 {
    public final /* synthetic */ i71[] d2;
    public final /* synthetic */ yy e2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx(yy yyVar, yy yyVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.c6 c6Var, i71[] i71VarArr) {
        super(yyVar2, activity, true, num, 0, c6Var);
        this.e2 = yyVar;
        this.d2 = i71VarArr;
    }

    @Override // org.telegram.ui.r71
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i10 = ((org.telegram.ui.ActionBar.m2) this.e2).currentAccount;
        return zh.n5.y(i10, false).n(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.r71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.TL_emojiStatus tL_emojiStatus;
        TLRPC.EmojiStatus emojiStatus;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.c6 c6Var;
        i71[] i71VarArr = this.d2;
        yy yyVar = this.e2;
        if (l4 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i10 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                TL_stars.SavedStarGift n10 = zh.n5.y(i10, false).n(tL_starGiftUnique.id);
                if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                    MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i11 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                    i12 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                    long clientUserId = UserConfig.getInstance(i12).getClientUserId();
                    c6Var = ((org.telegram.ui.ActionBar.m2) yyVar).resourceProvider;
                    zh.r3 r3Var = new zh.r3(context, i11, clientUserId, c6Var, null);
                    r3Var.l2(n10, null);
                    r3Var.o2();
                    r3Var.show();
                    i71 i71Var = i71VarArr[0];
                    if (i71Var != null) {
                        yyVar.M0 = null;
                        i71Var.dismiss();
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
        yyVar.getMessagesController().updateEmojiStatus(emojiStatus, tL_starGiftUnique);
        if (l4 != null) {
            org.telegram.ui.Cells.o oVar = yyVar.E3;
            ah.i1 i1Var = new ah.i1();
            long longValue = l4.longValue();
            i1Var.g = longValue;
            i1Var.h = longValue;
            oVar.a(i1Var);
        }
        i71 i71Var2 = i71VarArr[0];
        if (i71Var2 != null) {
            yyVar.M0 = null;
            i71Var2.dismiss();
        }
    }
}
