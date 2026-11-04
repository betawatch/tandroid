package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xu0 extends g11 {
    public final /* synthetic */ x01[] f2;
    public final /* synthetic */ ProfileActivity g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu0(ProfileActivity profileActivity, ProfileActivity profileActivity2, Activity activity, Integer num, int i3, org.telegram.ui.ActionBar.e6 e6Var, int i10, x01[] x01VarArr) {
        super(profileActivity2, activity, true, num, i3, true, e6Var, i10);
        this.g2 = profileActivity;
        this.f2 = x01VarArr;
    }

    @Override // org.telegram.ui.g11
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i3;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i3 = ((org.telegram.ui.ActionBar.d2) this.g2).currentAccount;
        return ci.e9.y(i3, false).n(tL_starGiftUnique.id) == null || org.telegram.messenger.hp.e1().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // org.telegram.ui.g11
    public final long getDialogId() {
        return this.g2.a();
    }

    @Override // org.telegram.ui.g11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.EmojiStatus emojiStatus;
        int i3;
        int i10;
        int i11;
        x01[] x01VarArr = this.f2;
        ProfileActivity profileActivity = this.g2;
        if (tL_starGiftUnique != null) {
            i3 = ((org.telegram.ui.ActionBar.d2) profileActivity).currentAccount;
            TL_stars.SavedStarGift n4 = ci.e9.y(i3, false).n(tL_starGiftUnique.id);
            if (n4 != null && org.telegram.messenger.hp.e1().getInt("statusgiftpage", 0) < 2) {
                org.telegram.messenger.hp.e1().edit().putInt("statusgiftpage", org.telegram.messenger.hp.e1().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i10 = ((org.telegram.ui.ActionBar.d2) profileActivity).currentAccount;
                i11 = ((org.telegram.ui.ActionBar.d2) profileActivity).currentAccount;
                ci.l6 l6Var = new ci.l6(context, i10, org.telegram.messenger.h10.i(i11).e(), profileActivity.A0, null);
                l6Var.j2(n4, null);
                l6Var.n2();
                l6Var.show();
                x01 x01Var = x01VarArr[0];
                if (x01Var != null) {
                    profileActivity.O5 = null;
                    x01Var.dismiss();
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
        profileActivity.F = tL_starGiftUnique != null ? Long.valueOf(tL_starGiftUnique.id) : null;
        org.telegram.messenger.hp messagesController = profileActivity.getMessagesController();
        TLRPC.Chat chat = profileActivity.E2;
        messagesController.g5(chat == null ? 0L : -chat.id, emojiStatus, tL_starGiftUnique);
        org.telegram.ui.Components.e5 e5Var = profileActivity.G;
        if (e5Var != null) {
            if (l10 == null && profileActivity.E2 == null) {
                e5Var.g(profileActivity.o4(), true);
            } else if (l10 != null) {
                e5Var.j(l10.longValue(), true);
            } else {
                e5Var.g(null, true);
            }
            profileActivity.G.m(tL_starGiftUnique != null, true);
        }
        if (l10 != null) {
            org.telegram.ui.Cells.o oVar = profileActivity.e0;
            dh.n0 n0Var = new dh.n0();
            long longValue = l10.longValue();
            n0Var.g = longValue;
            n0Var.h = longValue;
            oVar.a(n0Var);
        }
        profileActivity.s5();
        profileActivity.u5();
        x01 x01Var2 = x01VarArr[0];
        if (x01Var2 != null) {
            profileActivity.O5 = null;
            x01Var2.dismiss();
        }
    }
}
