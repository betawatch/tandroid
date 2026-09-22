package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ g2 b;

    public /* synthetic */ f2(g2 g2Var, int i10) {
        this.a = i10;
        this.b = g2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        i2 i2Var = (i2) obj;
        switch (this.a) {
            case 0:
                g2 g2Var = this.b;
                g2Var.l = null;
                g2Var.i = true;
                TLRPC.TL_webPage tL_webPage = g2Var.j;
                if (tL_webPage != null) {
                    i2.o(tL_webPage);
                }
                g2Var.j = i2Var.c;
                g2Var.c();
                break;
            default:
                g2 g2Var2 = this.b;
                g2Var2.l = null;
                g2Var2.i = true;
                TLRPC.TL_webPage tL_webPage2 = g2Var2.j;
                if (tL_webPage2 != null) {
                    i2.o(tL_webPage2);
                }
                g2Var2.j = i2Var.c;
                g2Var2.c();
                break;
        }
    }
}
