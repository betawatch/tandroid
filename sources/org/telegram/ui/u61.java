package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class u61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y61 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ u61(y61 y61Var, Integer num, int i10) {
        this.a = i10;
        this.b = y61Var;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        y61 y61Var = this.b;
        switch (i10) {
            case 0:
                y61.a(y61Var, this.c);
                break;
            default:
                y61Var.getClass();
                Integer num = this.c;
                if (num != null) {
                    try {
                        y61Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    r51 r51Var = (r51) y61Var;
                    s51 s51Var = r51Var.S;
                    c71 c71Var = s51Var.e;
                    List list = c71.Z1;
                    c71Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = r51Var.Q;
                    long j3 = ((l61) view).e.documentId;
                    tL_emojiStatus.document_id = j3;
                    s51Var.e.p(view, Long.valueOf(j3), ((l61) r51Var.Q).e.document, r51Var.R, num);
                    if (r51Var.R == null) {
                        MediaDataController.getInstance(s51Var.e.V).pushRecentEmojiStatus(tL_emojiStatus);
                        break;
                    }
                }
                break;
        }
    }
}
