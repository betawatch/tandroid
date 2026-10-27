package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b61 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ x51(b61 b61Var, Integer num, int i10) {
        this.a = i10;
        this.b = b61Var;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        b61 b61Var = this.b;
        switch (i10) {
            case 0:
                b61.a(b61Var, this.c);
                break;
            default:
                b61Var.getClass();
                Integer num = this.c;
                if (num != null) {
                    try {
                        b61Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    u41 u41Var = (u41) b61Var;
                    v41 v41Var = u41Var.S;
                    f61 f61Var = v41Var.e;
                    List list = f61.a2;
                    f61Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = u41Var.Q;
                    long j10 = ((o51) view).e.documentId;
                    tL_emojiStatus.document_id = j10;
                    v41Var.e.p(view, Long.valueOf(j10), ((o51) u41Var.Q).e.document, u41Var.R, num);
                    if (u41Var.R == null) {
                        MediaDataController.getInstance(v41Var.e.V).pushRecentEmojiStatus(tL_emojiStatus);
                        break;
                    }
                }
                break;
        }
    }
}
