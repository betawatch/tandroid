package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ry0 extends a61 {
    public final /* synthetic */ r51[] Z1;
    public final /* synthetic */ ProfileActivity a2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry0(ProfileActivity profileActivity, ProfileActivity profileActivity2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, r51[] r51VarArr) {
        super(profileActivity2, activity, true, num, i10, true, c6Var, i11);
        this.a2 = profileActivity;
        this.Z1 = r51VarArr;
    }

    @Override // org.telegram.ui.a61
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i10 = ((org.telegram.ui.ActionBar.n2) this.a2).currentAccount;
        return hh.u7.y(i10, false).n(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // org.telegram.ui.a61
    public final long getDialogId() {
        return this.a2.a();
    }

    @Override // org.telegram.ui.a61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.EmojiStatus emojiStatus;
        int i10;
        int i11;
        int i12;
        ProfileActivity profileActivity = this.a2;
        org.telegram.ui.Components.i5[] i5VarArr = profileActivity.C;
        r51[] r51VarArr = this.Z1;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount;
            TL_stars.SavedStarGift n10 = hh.u7.y(i10, false).n(tL_starGiftUnique.id);
            if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i11 = ((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount;
                i12 = ((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount;
                hh.i5 i5Var = new hh.i5(context, i11, UserConfig.getInstance(i12).getClientUserId(), profileActivity.v0, null);
                i5Var.j2(n10, null);
                i5Var.m2();
                i5Var.show();
                r51 r51Var = r51VarArr[0];
                if (r51Var != null) {
                    profileActivity.x5 = null;
                    r51Var.dismiss();
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
        } else if (l10 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = l10.longValue();
            emojiStatus = tL_emojiStatus;
            if (num != null) {
                tL_emojiStatus.flags |= 1;
                tL_emojiStatus.until = num.intValue();
                emojiStatus = tL_emojiStatus;
            }
        }
        profileActivity.B = tL_starGiftUnique != null ? Long.valueOf(tL_starGiftUnique.id) : null;
        MessagesController messagesController = profileActivity.getMessagesController();
        TLRPC.Chat chat = profileActivity.A2;
        messagesController.updateEmojiStatus(chat == null ? 0L : -chat.id, emojiStatus, tL_starGiftUnique);
        for (int i13 = 0; i13 < 2; i13++) {
            org.telegram.ui.Components.i5 i5Var2 = i5VarArr[i13];
            if (i5Var2 != null) {
                if (l10 == null && profileActivity.A2 == null) {
                    i5Var2.g(profileActivity.Y3(i13), true);
                } else if (l10 != null) {
                    i5Var2.j(l10.longValue(), true);
                } else {
                    i5Var2.g(null, true);
                }
                i5VarArr[i13].m(tL_starGiftUnique != null, true);
            }
        }
        if (l10 != null) {
            org.telegram.ui.Cells.o oVar = profileActivity.Z;
            ig.q0 q0Var = new ig.q0();
            long longValue = l10.longValue();
            q0Var.g = longValue;
            q0Var.h = longValue;
            oVar.a(q0Var);
        }
        profileActivity.X4();
        profileActivity.Z4();
        r51 r51Var2 = r51VarArr[0];
        if (r51Var2 != null) {
            profileActivity.x5 = null;
            r51Var2.dismiss();
        }
    }
}
