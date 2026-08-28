package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zw extends b61 {
    public final /* synthetic */ s51[] Z1;
    public final /* synthetic */ dy a2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw(dy dyVar, dy dyVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.b6 b6Var, s51[] s51VarArr) {
        super(dyVar2, activity, true, num, 0, b6Var);
        this.a2 = dyVar;
        this.Z1 = s51VarArr;
    }

    @Override // org.telegram.ui.b61
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i9;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i9 = ((org.telegram.ui.ActionBar.o2) this.a2).currentAccount;
        return gh.v7.y(i9, false).n(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.b61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.TL_emojiStatus tL_emojiStatus;
        TLRPC.EmojiStatus emojiStatus;
        int i9;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.b6 b6Var;
        s51[] s51VarArr = this.Z1;
        dy dyVar = this.a2;
        if (l10 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i9 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                TL_stars.SavedStarGift n10 = gh.v7.y(i9, false).n(tL_starGiftUnique.id);
                if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                    MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i10 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                    i11 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                    long clientUserId = UserConfig.getInstance(i11).getClientUserId();
                    b6Var = ((org.telegram.ui.ActionBar.o2) dyVar).resourceProvider;
                    gh.k5 k5Var = new gh.k5(context, i10, clientUserId, b6Var, null);
                    k5Var.j2(n10, null);
                    k5Var.m2();
                    k5Var.show();
                    s51 s51Var = s51VarArr[0];
                    if (s51Var != null) {
                        dyVar.I0 = null;
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
                tL_emojiStatus2.document_id = l10.longValue();
                tL_emojiStatus = tL_emojiStatus2;
                if (num != null) {
                    tL_emojiStatus2.flags |= 1;
                    tL_emojiStatus2.until = num.intValue();
                    tL_emojiStatus = tL_emojiStatus2;
                }
            }
            emojiStatus = tL_emojiStatus;
        }
        dyVar.getMessagesController().updateEmojiStatus(emojiStatus, tL_starGiftUnique);
        if (l10 != null) {
            org.telegram.ui.Cells.o oVar = dyVar.A3;
            hg.r0 r0Var = new hg.r0();
            long longValue = l10.longValue();
            r0Var.g = longValue;
            r0Var.h = longValue;
            oVar.a(r0Var);
        }
        s51 s51Var2 = s51VarArr[0];
        if (s51Var2 != null) {
            dyVar.I0 = null;
            s51Var2.dismiss();
        }
    }
}
