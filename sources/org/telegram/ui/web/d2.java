package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ e2 b;

    public /* synthetic */ d2(e2 e2Var, int i10) {
        this.a = i10;
        this.b = e2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        g2 g2Var = (g2) obj;
        switch (this.a) {
            case 0:
                e2 e2Var = this.b;
                e2Var.l = null;
                e2Var.i = true;
                TLRPC.TL_webPage tL_webPage = e2Var.j;
                if (tL_webPage != null) {
                    g2.o(tL_webPage);
                }
                e2Var.j = g2Var.c;
                e2Var.c();
                break;
            default:
                e2 e2Var2 = this.b;
                e2Var2.l = null;
                e2Var2.i = true;
                TLRPC.TL_webPage tL_webPage2 = e2Var2.j;
                if (tL_webPage2 != null) {
                    g2.o(tL_webPage2);
                }
                e2Var2.j = g2Var.c;
                e2Var2.c();
                break;
        }
    }
}
