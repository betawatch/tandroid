package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ub implements org.telegram.messenger.t10 {
    public final /* synthetic */ qc a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ ub(qc qcVar, int i7, View view) {
        this.a = qcVar;
        this.b = i7;
        this.c = view;
    }

    @Override // org.telegram.messenger.t10
    public final void a(Object obj, Object obj2, Object obj3) {
        Long l10 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        qc qcVar = this.a;
        int i7 = qcVar.V;
        int i10 = this.b;
        if (i10 == i7) {
            qcVar.n = l10.longValue();
            qcVar.h1(true);
        } else if (i10 == qcVar.d0) {
            qcVar.x = l10.longValue();
            qcVar.i1();
        } else if (i10 == qcVar.g0) {
            if (l10.longValue() == 0) {
                qcVar.E = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible r02 = org.telegram.messenger.np.r0(tL_starGiftUnique);
                if (num != null) {
                    r02.flags |= 1;
                    r02.until = num.intValue();
                }
                qcVar.E = r02;
                qcVar.s = -1;
                qcVar.x = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l10.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                qcVar.E = tL_emojiStatus;
            }
            qcVar.i1();
        }
        qcVar.e1(true);
        ((ec) this.c).c(l10.longValue(), tL_starGiftUnique != null, true);
        qcVar.g1(true);
    }
}
