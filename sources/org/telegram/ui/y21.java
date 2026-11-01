package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c31 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ y21(c31 c31Var, Integer num, int i10) {
        this.a = i10;
        this.b = c31Var;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        c31 c31Var = this.b;
        switch (i10) {
            case 0:
                c31.a(c31Var, this.c);
                break;
            default:
                Integer num = this.c;
                if (num != null) {
                    try {
                        c31Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    w11 w11Var = (w11) c31Var;
                    g31 g31Var = w11Var.S.e;
                    List list = g31.a2;
                    g31Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = w11Var.Q;
                    long j10 = ((q21) view).e.documentId;
                    tL_emojiStatus.document_id = j10;
                    g31Var.p(view, Long.valueOf(j10), ((q21) w11Var.Q).e.document, w11Var.R, num);
                    if (w11Var.R == null) {
                        org.telegram.messenger.vi.b0(g31Var.V).C1(tL_emojiStatus);
                        break;
                    }
                }
                break;
        }
    }
}
