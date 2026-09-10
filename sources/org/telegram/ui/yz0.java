package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class yz0 extends l71 {
    public final /* synthetic */ c71[] d2;
    public final /* synthetic */ ProfileActivity e2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz0(ProfileActivity profileActivity, ProfileActivity profileActivity2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11, c71[] c71VarArr) {
        super(profileActivity2, activity, true, num, i10, true, f6Var, i11);
        this.e2 = profileActivity;
        this.d2 = c71VarArr;
    }

    @Override // org.telegram.ui.l71
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i10 = ((org.telegram.ui.ActionBar.p2) this.e2).currentAccount;
        return xh.v5.y(i10, false).n(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // org.telegram.ui.l71
    public final long getDialogId() {
        return this.e2.a();
    }

    @Override // org.telegram.ui.l71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.EmojiStatus emojiStatus;
        int i10;
        int i11;
        int i12;
        ProfileActivity profileActivity = this.e2;
        org.telegram.ui.Components.n5[] n5VarArr = profileActivity.G;
        c71[] c71VarArr = this.d2;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.p2) profileActivity).currentAccount;
            TL_stars.SavedStarGift n10 = xh.v5.y(i10, false).n(tL_starGiftUnique.id);
            if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i11 = ((org.telegram.ui.ActionBar.p2) profileActivity).currentAccount;
                i12 = ((org.telegram.ui.ActionBar.p2) profileActivity).currentAccount;
                xh.x3 x3Var = new xh.x3(context, i11, UserConfig.getInstance(i12).getClientUserId(), profileActivity.z0, null);
                x3Var.j2(n10, null);
                x3Var.m2();
                x3Var.show();
                c71 c71Var = c71VarArr[0];
                if (c71Var != null) {
                    profileActivity.B5 = null;
                    c71Var.dismiss();
                    return;
                }
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = tL_starGiftUnique.id;
            emojiStatus = tL_inputEmojiStatusCollectible;
            if (num != null) {
                tL_inputEmojiStatusCollectible.flags |= 1;
                tL_inputEmojiStatusCollectible.until = num.intValue();
                emojiStatus = tL_inputEmojiStatusCollectible;
            }
        } else if (l4 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = l4.longValue();
            emojiStatus = tL_emojiStatus;
            if (num != null) {
                tL_emojiStatus.flags |= 1;
                tL_emojiStatus.until = num.intValue();
                emojiStatus = tL_emojiStatus;
            }
        }
        profileActivity.F = tL_starGiftUnique != null ? Long.valueOf(tL_starGiftUnique.id) : null;
        MessagesController messagesController = profileActivity.getMessagesController();
        TLRPC.Chat chat = profileActivity.E2;
        messagesController.updateEmojiStatus(chat == null ? 0L : -chat.id, emojiStatus, tL_starGiftUnique);
        for (int i13 = 0; i13 < 2; i13++) {
            org.telegram.ui.Components.n5 n5Var = n5VarArr[i13];
            if (n5Var != null) {
                if (l4 == null && profileActivity.E2 == null) {
                    n5Var.g(profileActivity.Y3(i13), true);
                } else if (l4 != null) {
                    n5Var.j(l4.longValue(), true);
                } else {
                    n5Var.g(null, true);
                }
                n5VarArr[i13].m(tL_starGiftUnique != null, true);
            }
        }
        if (l4 != null) {
            org.telegram.ui.Cells.o oVar = profileActivity.d0;
            yg.p0 p0Var = new yg.p0();
            long longValue = l4.longValue();
            p0Var.g = longValue;
            p0Var.h = longValue;
            oVar.a(p0Var);
        }
        profileActivity.X4();
        profileActivity.Z4();
        c71 c71Var2 = c71VarArr[0];
        if (c71Var2 != null) {
            profileActivity.B5 = null;
            c71Var2.dismiss();
        }
    }
}
