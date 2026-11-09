package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class vv extends s11 {
    public final /* synthetic */ j11[] e2;
    public final /* synthetic */ yw f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv(yw ywVar, yw ywVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.g6 g6Var, j11[] j11VarArr) {
        super(ywVar2, activity, true, num, 0, g6Var);
        this.f2 = ywVar;
        this.e2 = j11VarArr;
    }

    @Override // org.telegram.ui.s11
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i7;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i7 = ((org.telegram.ui.ActionBar.f2) this.f2).currentAccount;
        return bi.ea.y(i7, false).n(tL_starGiftUnique.id) == null || org.telegram.messenger.qp.e1().getInt("statusgiftpage", 0) >= 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.s11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.TL_emojiStatus tL_emojiStatus;
        TLRPC.EmojiStatus emojiStatus;
        int i7;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.g6 g6Var;
        j11[] j11VarArr = this.e2;
        yw ywVar = this.f2;
        if (l10 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i7 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
                TL_stars.SavedStarGift n10 = bi.ea.y(i7, false).n(tL_starGiftUnique.id);
                if (n10 != null && org.telegram.messenger.qp.e1().getInt("statusgiftpage", 0) < 2) {
                    org.telegram.messenger.qp.e1().edit().putInt("statusgiftpage", org.telegram.messenger.qp.e1().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i10 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
                    i11 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
                    long e10 = org.telegram.messenger.p10.i(i11).e();
                    g6Var = ((org.telegram.ui.ActionBar.f2) ywVar).resourceProvider;
                    bi.k7 k7Var = new bi.k7(context, i10, e10, g6Var, null);
                    k7Var.i2(n10, null);
                    k7Var.n2();
                    k7Var.show();
                    j11 j11Var = j11VarArr[0];
                    if (j11Var != null) {
                        ywVar.M0 = null;
                        j11Var.dismiss();
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
        ywVar.getMessagesController().h5(emojiStatus, tL_starGiftUnique);
        if (l10 != null) {
            org.telegram.ui.Cells.o oVar = ywVar.F3;
            ch.o0 o0Var = new ch.o0();
            long longValue = l10.longValue();
            o0Var.g = longValue;
            o0Var.h = longValue;
            oVar.a(o0Var);
        }
        j11 j11Var2 = j11VarArr[0];
        if (j11Var2 != null) {
            ywVar.M0 = null;
            j11Var2.dismiss();
        }
    }
}
