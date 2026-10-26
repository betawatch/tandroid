package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y51 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ u51(y51 y51Var, Integer num, int i10) {
        this.a = i10;
        this.b = y51Var;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        y51 y51Var = this.b;
        switch (i10) {
            case 0:
                y51.a(y51Var, this.c);
                break;
            default:
                y51Var.getClass();
                Integer num = this.c;
                if (num != null) {
                    try {
                        y51Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    r41 r41Var = (r41) y51Var;
                    s41 s41Var = r41Var.S;
                    c61 c61Var = s41Var.e;
                    List list = c61.a2;
                    c61Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = r41Var.Q;
                    long j10 = ((l51) view).e.documentId;
                    tL_emojiStatus.document_id = j10;
                    s41Var.e.p(view, Long.valueOf(j10), ((l51) r41Var.Q).e.document, r41Var.R, num);
                    if (r41Var.R == null) {
                        MediaDataController.getInstance(s41Var.e.V).pushRecentEmojiStatus(tL_emojiStatus);
                        break;
                    }
                }
                break;
        }
    }
}
