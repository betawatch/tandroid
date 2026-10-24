package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class t51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x51 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ t51(x51 x51Var, Integer num, int i10) {
        this.a = i10;
        this.b = x51Var;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        x51 x51Var = this.b;
        switch (i10) {
            case 0:
                x51.a(x51Var, this.c);
                break;
            default:
                x51Var.getClass();
                Integer num = this.c;
                if (num != null) {
                    try {
                        x51Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    q41 q41Var = (q41) x51Var;
                    r41 r41Var = q41Var.S;
                    b61 b61Var = r41Var.e;
                    List list = b61.a2;
                    b61Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = q41Var.Q;
                    long j10 = ((k51) view).e.documentId;
                    tL_emojiStatus.document_id = j10;
                    r41Var.e.p(view, Long.valueOf(j10), ((k51) q41Var.Q).e.document, q41Var.R, num);
                    if (q41Var.R == null) {
                        MediaDataController.getInstance(r41Var.e.V).pushRecentEmojiStatus(tL_emojiStatus);
                        break;
                    }
                }
                break;
        }
    }
}
