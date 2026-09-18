package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c71 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ y61(c71 c71Var, Integer num, int i10) {
        this.a = i10;
        this.b = c71Var;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        c71 c71Var = this.b;
        switch (i10) {
            case 0:
                c71.a(c71Var, this.c);
                break;
            default:
                c71Var.getClass();
                Integer num = this.c;
                if (num != null) {
                    try {
                        c71Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    v51 v51Var = (v51) c71Var;
                    w51 w51Var = v51Var.S;
                    g71 g71Var = w51Var.e;
                    List list = g71.Z1;
                    g71Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = v51Var.Q;
                    long j3 = ((p61) view).e.documentId;
                    tL_emojiStatus.document_id = j3;
                    w51Var.e.p(view, Long.valueOf(j3), ((p61) v51Var.Q).e.document, v51Var.R, num);
                    if (v51Var.R == null) {
                        MediaDataController.getInstance(w51Var.e.V).pushRecentEmojiStatus(tL_emojiStatus);
                        break;
                    }
                }
                break;
        }
    }
}
