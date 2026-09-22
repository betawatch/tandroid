package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d71 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ z61(d71 d71Var, Integer num, int i10) {
        this.a = i10;
        this.b = d71Var;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        d71 d71Var = this.b;
        switch (i10) {
            case 0:
                d71.a(d71Var, this.c);
                break;
            default:
                d71Var.getClass();
                Integer num = this.c;
                if (num != null) {
                    try {
                        d71Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    w51 w51Var = (w51) d71Var;
                    x51 x51Var = w51Var.S;
                    h71 h71Var = x51Var.e;
                    List list = h71.Z1;
                    h71Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = w51Var.Q;
                    long j3 = ((q61) view).e.documentId;
                    tL_emojiStatus.document_id = j3;
                    x51Var.e.p(view, Long.valueOf(j3), ((q61) w51Var.Q).e.document, w51Var.R, num);
                    if (w51Var.R == null) {
                        MediaDataController.getInstance(x51Var.e.V).pushRecentEmojiStatus(tL_emojiStatus);
                        break;
                    }
                }
                break;
        }
    }
}
