package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z51 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ v51(z51 z51Var, Integer num, int i10) {
        this.a = i10;
        this.b = z51Var;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        z51 z51Var = this.b;
        switch (i10) {
            case 0:
                z51.a(z51Var, this.c);
                break;
            default:
                z51Var.getClass();
                Integer num = this.c;
                if (num != null) {
                    try {
                        z51Var.L.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    s41 s41Var = (s41) z51Var;
                    t41 t41Var = s41Var.O;
                    d61 d61Var = t41Var.e;
                    List list = d61.V1;
                    d61Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = s41Var.M;
                    long j10 = ((m51) view).e.documentId;
                    tL_emojiStatus.document_id = j10;
                    t41Var.e.p(view, Long.valueOf(j10), ((m51) s41Var.M).e.document, s41Var.N, num);
                    if (s41Var.N == null) {
                        MediaDataController.getInstance(t41Var.e.R).pushRecentEmojiStatus(tL_emojiStatus);
                        break;
                    }
                }
                break;
        }
    }
}
