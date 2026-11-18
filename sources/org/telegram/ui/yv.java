package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class yv extends r11 {
    public final /* synthetic */ i11[] f2;
    public final /* synthetic */ cx g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv(cx cxVar, cx cxVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.i6 i6Var, i11[] i11VarArr) {
        super(cxVar2, activity, true, num, 0, i6Var);
        this.g2 = cxVar;
        this.f2 = i11VarArr;
    }

    @Override // org.telegram.ui.r11
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i7;
        if (tL_starGiftUnique == null) {
            return true;
        }
        i7 = ((org.telegram.ui.ActionBar.h2) this.g2).currentAccount;
        return di.x8.y(i7, false).n(tL_starGiftUnique.id) == null || org.telegram.messenger.mp.g1().getInt("statusgiftpage", 0) >= 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.r11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.TL_emojiStatus tL_emojiStatus;
        TLRPC.EmojiStatus emojiStatus;
        int i7;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.i6 i6Var;
        i11[] i11VarArr = this.f2;
        cx cxVar = this.g2;
        if (l10 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i7 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
                TL_stars.SavedStarGift n10 = di.x8.y(i7, false).n(tL_starGiftUnique.id);
                if (n10 != null && org.telegram.messenger.mp.g1().getInt("statusgiftpage", 0) < 2) {
                    org.telegram.messenger.mp.g1().edit().putInt("statusgiftpage", org.telegram.messenger.mp.g1().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i10 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
                    i11 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
                    long e10 = org.telegram.messenger.j10.i(i11).e();
                    i6Var = ((org.telegram.ui.ActionBar.h2) cxVar).resourceProvider;
                    di.f6 f6Var = new di.f6(context, i10, e10, i6Var, null);
                    f6Var.w2(n10, null);
                    f6Var.A2();
                    f6Var.show();
                    i11 i11Var = i11VarArr[0];
                    if (i11Var != null) {
                        cxVar.N0 = null;
                        i11Var.dismiss();
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
        cxVar.getMessagesController().t5(emojiStatus, tL_starGiftUnique);
        if (l10 != null) {
            org.telegram.ui.Cells.o oVar = cxVar.G3;
            ch.p0 p0Var = new ch.p0();
            long longValue = l10.longValue();
            p0Var.g = longValue;
            p0Var.h = longValue;
            oVar.a(p0Var);
        }
        i11 i11Var2 = i11VarArr[0];
        if (i11Var2 != null) {
            cxVar.N0 = null;
            i11Var2.dismiss();
        }
    }
}
