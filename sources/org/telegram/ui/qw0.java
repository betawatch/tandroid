package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class qw0 extends i31 {
    public final /* synthetic */ z21[] e2;
    public final /* synthetic */ ProfileActivity f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw0(ProfileActivity profileActivity, ProfileActivity profileActivity2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.p6 p6Var, int i11, z21[] z21VarArr) {
        super(profileActivity2, activity, true, num, i10, true, p6Var, i11);
        this.f2 = profileActivity;
        this.e2 = z21VarArr;
    }

    @Override // org.telegram.ui.i31
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i10 = ((org.telegram.ui.ActionBar.k2) this.f2).currentAccount;
        return rh.e6.y(i10, false).n(tL_starGiftUnique.id) == null || org.telegram.messenger.vp.d1().getInt("statusgiftpage", 0) >= 2;
    }

    @Override // org.telegram.ui.i31
    public final long getDialogId() {
        return this.f2.a();
    }

    @Override // org.telegram.ui.i31
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.EmojiStatus emojiStatus;
        int i10;
        int i11;
        int i12;
        z21[] z21VarArr = this.e2;
        ProfileActivity profileActivity = this.f2;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.k2) profileActivity).currentAccount;
            TL_stars.SavedStarGift n10 = rh.e6.y(i10, false).n(tL_starGiftUnique.id);
            if (n10 != null && org.telegram.messenger.vp.d1().getInt("statusgiftpage", 0) < 2) {
                org.telegram.messenger.vp.d1().edit().putInt("statusgiftpage", org.telegram.messenger.vp.d1().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i11 = ((org.telegram.ui.ActionBar.k2) profileActivity).currentAccount;
                i12 = ((org.telegram.ui.ActionBar.k2) profileActivity).currentAccount;
                rh.e4 e4Var = new rh.e4(context, i11, org.telegram.messenger.d20.i(i12).e(), profileActivity.z0, null);
                e4Var.j2(n10, null);
                e4Var.n2();
                e4Var.show();
                z21 z21Var = z21VarArr[0];
                if (z21Var != null) {
                    profileActivity.M5 = null;
                    z21Var.dismiss();
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
        profileActivity.E = tL_starGiftUnique != null ? Long.valueOf(tL_starGiftUnique.id) : null;
        org.telegram.messenger.vp messagesController = profileActivity.getMessagesController();
        TLRPC.Chat chat = profileActivity.D2;
        messagesController.d5(chat == null ? 0L : -chat.id, emojiStatus, tL_starGiftUnique);
        org.telegram.ui.Components.d5 d5Var = profileActivity.F;
        if (d5Var != null) {
            if (l4 == null && profileActivity.D2 == null) {
                d5Var.g(profileActivity.n4(), true);
            } else if (l4 != null) {
                d5Var.j(l4.longValue(), true);
            } else {
                d5Var.g(null, true);
            }
            profileActivity.F.m(tL_starGiftUnique != null, true);
        }
        if (l4 != null) {
            org.telegram.ui.Cells.n nVar = profileActivity.d0;
            sg.o0 o0Var = new sg.o0();
            long longValue = l4.longValue();
            o0Var.g = longValue;
            o0Var.h = longValue;
            nVar.a(o0Var);
        }
        profileActivity.r5();
        profileActivity.t5();
        z21 z21Var2 = z21VarArr[0];
        if (z21Var2 != null) {
            profileActivity.M5 = null;
            z21Var2.dismiss();
        }
    }
}
