package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tb implements org.telegram.messenger.p10 {
    public final /* synthetic */ pc a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ tb(pc pcVar, int i3, View view) {
        this.a = pcVar;
        this.b = i3;
        this.c = view;
    }

    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2, Object obj3) {
        Long l10 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        pc pcVar = this.a;
        int i3 = pcVar.V;
        int i10 = this.b;
        if (i10 == i3) {
            pcVar.n = l10.longValue();
            pcVar.h1(true);
        } else if (i10 == pcVar.d0) {
            pcVar.x = l10.longValue();
            pcVar.i1();
        } else if (i10 == pcVar.g0) {
            if (l10.longValue() == 0) {
                pcVar.E = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible q02 = org.telegram.messenger.hp.q0(tL_starGiftUnique);
                if (num != null) {
                    q02.flags |= 1;
                    q02.until = num.intValue();
                }
                pcVar.E = q02;
                pcVar.s = -1;
                pcVar.x = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l10.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                pcVar.E = tL_emojiStatus;
            }
            pcVar.i1();
        }
        pcVar.e1(true);
        ((dc) this.c).c(l10.longValue(), tL_starGiftUnique != null, true);
        pcVar.g1(true);
    }
}
