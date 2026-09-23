package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class r61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v61 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ r61(v61 v61Var, Integer num, int i10) {
        this.a = i10;
        this.b = v61Var;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        v61 v61Var = this.b;
        switch (i10) {
            case 0:
                v61.a(v61Var, this.c);
                break;
            default:
                v61Var.getClass();
                Integer num = this.c;
                if (num != null) {
                    try {
                        v61Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    o51 o51Var = (o51) v61Var;
                    p51 p51Var = o51Var.S;
                    z61 z61Var = p51Var.e;
                    List list = z61.Z1;
                    z61Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = o51Var.Q;
                    long j3 = ((i61) view).e.documentId;
                    tL_emojiStatus.document_id = j3;
                    p51Var.e.p(view, Long.valueOf(j3), ((i61) o51Var.Q).e.document, o51Var.R, num);
                    if (o51Var.R == null) {
                        MediaDataController.getInstance(p51Var.e.V).pushRecentEmojiStatus(tL_emojiStatus);
                        break;
                    }
                }
                break;
        }
    }
}
