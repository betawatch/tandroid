package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v51 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ r51(v51 v51Var, Integer num, int i10) {
        this.a = i10;
        this.b = v51Var;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        v51 v51Var = this.b;
        switch (i10) {
            case 0:
                v51.a(v51Var, this.c);
                break;
            default:
                v51Var.getClass();
                Integer num = this.c;
                if (num != null) {
                    try {
                        v51Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    o41 o41Var = (o41) v51Var;
                    p41 p41Var = o41Var.S;
                    z51 z51Var = p41Var.e;
                    List list = z51.Z1;
                    z51Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = o41Var.Q;
                    long j10 = ((i51) view).e.documentId;
                    tL_emojiStatus.document_id = j10;
                    p41Var.e.p(view, Long.valueOf(j10), ((i51) o41Var.Q).e.document, o41Var.R, num);
                    if (o41Var.R == null) {
                        MediaDataController.getInstance(p41Var.e.V).pushRecentEmojiStatus(tL_emojiStatus);
                        break;
                    }
                }
                break;
        }
    }
}
