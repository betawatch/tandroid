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
public final class ry0 extends b61 {
    public final /* synthetic */ s51[] Z1;
    public final /* synthetic */ ProfileActivity a2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry0(ProfileActivity profileActivity, ProfileActivity profileActivity2, Activity activity, Integer num, int i9, org.telegram.ui.ActionBar.b6 b6Var, int i10, s51[] s51VarArr) {
        super(profileActivity2, activity, true, num, i9, true, b6Var, i10);
        this.a2 = profileActivity;
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

    @Override // org.telegram.ui.b61
    public final long getDialogId() {
        return this.a2.a();
    }

    @Override // org.telegram.ui.b61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.EmojiStatus emojiStatus;
        int i9;
        int i10;
        int i11;
        ProfileActivity profileActivity = this.a2;
        org.telegram.ui.Components.i5[] i5VarArr = profileActivity.C;
        s51[] s51VarArr = this.Z1;
        if (tL_starGiftUnique != null) {
            i9 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
            TL_stars.SavedStarGift n10 = gh.v7.y(i9, false).n(tL_starGiftUnique.id);
            if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i10 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
                i11 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
                gh.k5 k5Var = new gh.k5(context, i10, UserConfig.getInstance(i11).getClientUserId(), profileActivity.v0, null);
                k5Var.j2(n10, null);
                k5Var.m2();
                k5Var.show();
                s51 s51Var = s51VarArr[0];
                if (s51Var != null) {
                    profileActivity.x5 = null;
                    s51Var.dismiss();
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
        for (int i12 = 0; i12 < 2; i12++) {
            org.telegram.ui.Components.i5 i5Var = i5VarArr[i12];
            if (i5Var != null) {
                if (l10 == null && profileActivity.A2 == null) {
                    i5Var.g(profileActivity.Y3(i12), true);
                } else if (l10 != null) {
                    i5Var.j(l10.longValue(), true);
                } else {
                    i5Var.g(null, true);
                }
                i5VarArr[i12].m(tL_starGiftUnique != null, true);
            }
        }
        if (l10 != null) {
            org.telegram.ui.Cells.o oVar = profileActivity.Z;
            hg.r0 r0Var = new hg.r0();
            long longValue = l10.longValue();
            r0Var.g = longValue;
            r0Var.h = longValue;
            oVar.a(r0Var);
        }
        profileActivity.X4();
        profileActivity.Z4();
        s51 s51Var2 = s51VarArr[0];
        if (s51Var2 != null) {
            profileActivity.x5 = null;
            s51Var2.dismiss();
        }
    }
}
