package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class tv extends q11 {
    public final /* synthetic */ h11[] e2;
    public final /* synthetic */ ww f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv(ww wwVar, ww wwVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.f6 f6Var, h11[] h11VarArr) {
        super(wwVar2, activity, true, num, 0, f6Var);
        this.f2 = wwVar;
        this.e2 = h11VarArr;
    }

    @Override // org.telegram.ui.q11
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i7;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i7 = ((org.telegram.ui.ActionBar.f2) this.f2).currentAccount;
        return bi.ea.y(i7, false).n(tL_starGiftUnique.id) == null || org.telegram.messenger.qp.e1().getInt("statusgiftpage", 0) >= 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.q11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.TL_emojiStatus tL_emojiStatus;
        TLRPC.EmojiStatus emojiStatus;
        int i7;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var;
        h11[] h11VarArr = this.e2;
        ww wwVar = this.f2;
        if (l10 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i7 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
                TL_stars.SavedStarGift n10 = bi.ea.y(i7, false).n(tL_starGiftUnique.id);
                if (n10 != null && org.telegram.messenger.qp.e1().getInt("statusgiftpage", 0) < 2) {
                    org.telegram.messenger.qp.e1().edit().putInt("statusgiftpage", org.telegram.messenger.qp.e1().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i10 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
                    i11 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
                    long e10 = org.telegram.messenger.p10.i(i11).e();
                    f6Var = ((org.telegram.ui.ActionBar.f2) wwVar).resourceProvider;
                    bi.k7 k7Var = new bi.k7(context, i10, e10, f6Var, null);
                    k7Var.j2(n10, null);
                    k7Var.n2();
                    k7Var.show();
                    h11 h11Var = h11VarArr[0];
                    if (h11Var != null) {
                        wwVar.M0 = null;
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
        wwVar.getMessagesController().h5(emojiStatus, tL_starGiftUnique);
        if (l10 != null) {
            org.telegram.ui.Cells.o oVar = wwVar.E3;
            ch.o0 o0Var = new ch.o0();
            long longValue = l10.longValue();
            o0Var.g = longValue;
            o0Var.h = longValue;
            oVar.a(o0Var);
        }
        h11 h11Var2 = h11VarArr[0];
        if (h11Var2 != null) {
            wwVar.M0 = null;
            h11Var2.dismiss();
        }
    }
}
