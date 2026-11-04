package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c11 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ y01(c11 c11Var, Integer num, int i3) {
        this.a = i3;
        this.b = c11Var;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        c11 c11Var = this.b;
        switch (i3) {
            case 0:
                c11.a(c11Var, this.c);
                break;
            default:
                Integer num = this.c;
                if (num != null) {
                    try {
                        c11Var.Q.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    wz0 wz0Var = (wz0) c11Var;
                    g11 g11Var = wz0Var.T.e;
                    List list = g11.b2;
                    g11Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = wz0Var.R;
                    long j10 = ((q01) view).e.documentId;
                    tL_emojiStatus.document_id = j10;
                    g11Var.p(view, Long.valueOf(j10), ((q01) wz0Var.R).e.document, wz0Var.S, num);
                    if (wz0Var.S == null) {
                        org.telegram.messenger.li.b0(g11Var.W).C1(tL_emojiStatus);
                        break;
                    }
                }
                break;
        }
    }
}
