package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w51 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ s51(w51 w51Var, Integer num, int i10) {
        this.a = i10;
        this.b = w51Var;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        w51 w51Var = this.b;
        switch (i10) {
            case 0:
                w51.a(w51Var, this.c);
                break;
            default:
                w51Var.getClass();
                Integer num = this.c;
                if (num != null) {
                    try {
                        w51Var.L.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    p41 p41Var = (p41) w51Var;
                    q41 q41Var = p41Var.O;
                    a61 a61Var = q41Var.e;
                    List list = a61.V1;
                    a61Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = p41Var.M;
                    long j10 = ((j51) view).e.documentId;
                    tL_emojiStatus.document_id = j10;
                    q41Var.e.p(view, Long.valueOf(j10), ((j51) p41Var.M).e.document, p41Var.N, num);
                    if (p41Var.N == null) {
                        MediaDataController.getInstance(q41Var.e.R).pushRecentEmojiStatus(tL_emojiStatus);
                        break;
                    }
                }
                break;
        }
    }
}
