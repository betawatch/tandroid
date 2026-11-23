package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class xv extends q11 {
    public final /* synthetic */ h11[] f2;
    public final /* synthetic */ bx g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv(bx bxVar, bx bxVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.i6 i6Var, h11[] h11VarArr) {
        super(bxVar2, activity, true, num, 0, i6Var);
        this.g2 = bxVar;
        this.f2 = h11VarArr;
    }

    @Override // org.telegram.ui.q11
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i7;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i7 = ((org.telegram.ui.ActionBar.g2) this.g2).currentAccount;
        return di.y8.y(i7, false).n(tL_starGiftUnique.id) == null || org.telegram.messenger.mp.g1().getInt("statusgiftpage", 0) >= 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.q11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.TL_emojiStatus tL_emojiStatus;
        TLRPC.EmojiStatus emojiStatus;
        int i7;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.i6 i6Var;
        h11[] h11VarArr = this.f2;
        bx bxVar = this.g2;
        if (l10 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i7 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                TL_stars.SavedStarGift n10 = di.y8.y(i7, false).n(tL_starGiftUnique.id);
                if (n10 != null && org.telegram.messenger.mp.g1().getInt("statusgiftpage", 0) < 2) {
                    org.telegram.messenger.mp.g1().edit().putInt("statusgiftpage", org.telegram.messenger.mp.g1().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i10 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                    i11 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                    long e10 = org.telegram.messenger.i10.i(i11).e();
                    i6Var = ((org.telegram.ui.ActionBar.g2) bxVar).resourceProvider;
                    di.f6 f6Var = new di.f6(context, i10, e10, i6Var, null);
                    f6Var.w2(n10, null);
                    f6Var.A2();
                    f6Var.show();
                    h11 h11Var = h11VarArr[0];
                    if (h11Var != null) {
                        bxVar.N0 = null;
                        h11Var.dismiss();
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
        bxVar.getMessagesController().t5(emojiStatus, tL_starGiftUnique);
        if (l10 != null) {
            org.telegram.ui.Cells.o oVar = bxVar.G3;
            ch.p0 p0Var = new ch.p0();
            long longValue = l10.longValue();
            p0Var.g = longValue;
            p0Var.h = longValue;
            oVar.a(p0Var);
        }
        h11 h11Var2 = h11VarArr[0];
        if (h11Var2 != null) {
            bxVar.N0 = null;
            h11Var2.dismiss();
        }
    }
}
