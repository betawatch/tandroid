package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yb implements Utilities.Callback3 {
    public final /* synthetic */ vc a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ yb(vc vcVar, int i10, View view) {
        this.a = vcVar;
        this.b = i10;
        this.c = view;
    }

    @Override // org.telegram.messenger.Utilities.Callback3
    public final void run(Object obj, Object obj2, Object obj3) {
        Long l10 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        vc vcVar = this.a;
        int i10 = vcVar.Q;
        int i11 = this.b;
        if (i11 == i10) {
            vcVar.n = l10.longValue();
            vcVar.a1(true);
        } else if (i11 == vcVar.Y) {
            vcVar.w = l10.longValue();
            vcVar.b1();
        } else if (i11 == vcVar.b0) {
            if (l10.longValue() == 0) {
                vcVar.y = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible emojiStatusCollectibleFromGift = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                if (num != null) {
                    emojiStatusCollectibleFromGift.flags |= 1;
                    emojiStatusCollectibleFromGift.until = num.intValue();
                }
                vcVar.y = emojiStatusCollectibleFromGift;
                vcVar.s = -1;
                vcVar.w = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l10.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                vcVar.y = tL_emojiStatus;
            }
            vcVar.b1();
        }
        vcVar.X0(true);
        ((ic) this.c).c(l10.longValue(), tL_starGiftUnique != null, true);
        vcVar.Z0(true);
    }
}
