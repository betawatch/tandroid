package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class vv extends n11 {
    public final /* synthetic */ e11[] f2;
    public final /* synthetic */ yw g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv(yw ywVar, yw ywVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.e6 e6Var, e11[] e11VarArr) {
        super(ywVar2, activity, true, num, 0, e6Var);
        this.g2 = ywVar;
        this.f2 = e11VarArr;
    }

    @Override // org.telegram.ui.n11
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i7;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i7 = ((org.telegram.ui.ActionBar.e2) this.g2).currentAccount;
        return di.v8.y(i7, false).n(tL_starGiftUnique.id) == null || org.telegram.messenger.np.e1().getInt("statusgiftpage", 0) >= 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.n11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.TL_emojiStatus tL_emojiStatus;
        TLRPC.EmojiStatus emojiStatus;
        int i7;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var;
        e11[] e11VarArr = this.f2;
        yw ywVar = this.g2;
        if (l10 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i7 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                TL_stars.SavedStarGift n10 = di.v8.y(i7, false).n(tL_starGiftUnique.id);
                if (n10 != null && org.telegram.messenger.np.e1().getInt("statusgiftpage", 0) < 2) {
                    org.telegram.messenger.np.e1().edit().putInt("statusgiftpage", org.telegram.messenger.np.e1().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i10 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                    i11 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                    long e10 = org.telegram.messenger.m10.i(i11).e();
                    e6Var = ((org.telegram.ui.ActionBar.e2) ywVar).resourceProvider;
                    di.c6 c6Var = new di.c6(context, i10, e10, e6Var, null);
                    c6Var.k2(n10, null);
                    c6Var.o2();
                    c6Var.show();
                    e11 e11Var = e11VarArr[0];
                    if (e11Var != null) {
                        ywVar.N0 = null;
                        e11Var.dismiss();
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
        ywVar.getMessagesController().i5(emojiStatus, tL_starGiftUnique);
        if (l10 != null) {
            org.telegram.ui.Cells.o oVar = ywVar.G3;
            ch.p0 p0Var = new ch.p0();
            long longValue = l10.longValue();
            p0Var.g = longValue;
            p0Var.h = longValue;
            oVar.a(p0Var);
        }
        e11 e11Var2 = e11VarArr[0];
        if (e11Var2 != null) {
            ywVar.N0 = null;
            e11Var2.dismiss();
        }
    }
}
