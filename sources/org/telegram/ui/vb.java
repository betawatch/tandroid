package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vb implements org.telegram.messenger.x10 {
    public final /* synthetic */ rc a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ vb(rc rcVar, int i7, View view) {
        this.a = rcVar;
        this.b = i7;
        this.c = view;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj, Object obj2, Object obj3) {
        Long l10 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        rc rcVar = this.a;
        int i7 = rcVar.U;
        int i10 = this.b;
        if (i10 == i7) {
            rcVar.n = l10.longValue();
            rcVar.h1(true);
        } else if (i10 == rcVar.c0) {
            rcVar.x = l10.longValue();
            rcVar.i1();
        } else if (i10 == rcVar.f0) {
            if (l10.longValue() == 0) {
                rcVar.D = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible q02 = org.telegram.messenger.qp.q0(tL_starGiftUnique);
                if (num != null) {
                    q02.flags |= 1;
                    q02.until = num.intValue();
                }
                rcVar.D = q02;
                rcVar.s = -1;
                rcVar.x = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l10.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                rcVar.D = tL_emojiStatus;
            }
            rcVar.i1();
        }
        rcVar.e1(true);
        ((fc) this.c).c(l10.longValue(), tL_starGiftUnique != null, true);
        rcVar.g1(true);
    }
}
