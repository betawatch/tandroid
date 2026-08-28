package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x51 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ t51(x51 x51Var, Integer num, int i9) {
        this.a = i9;
        this.b = x51Var;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        x51 x51Var = this.b;
        switch (i9) {
            case 0:
                x51.a(x51Var, this.c);
                break;
            default:
                x51Var.getClass();
                Integer num = this.c;
                if (num != null) {
                    try {
                        x51Var.L.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    q41 q41Var = (q41) x51Var;
                    r41 r41Var = q41Var.O;
                    b61 b61Var = r41Var.e;
                    List list = b61.V1;
                    b61Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = q41Var.M;
                    long j10 = ((k51) view).e.documentId;
                    tL_emojiStatus.document_id = j10;
                    r41Var.e.p(view, Long.valueOf(j10), ((k51) q41Var.M).e.document, q41Var.N, num);
                    if (q41Var.N == null) {
                        MediaDataController.getInstance(r41Var.e.R).pushRecentEmojiStatus(tL_emojiStatus);
                        break;
                    }
                }
                break;
        }
    }
}
