package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class g2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ h2 b;

    public /* synthetic */ g2(h2 h2Var, int i10) {
        this.a = i10;
        this.b = h2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        j2 j2Var = (j2) obj;
        switch (this.a) {
            case 0:
                h2 h2Var = this.b;
                h2Var.l = null;
                h2Var.i = true;
                TLRPC.TL_webPage tL_webPage = h2Var.j;
                if (tL_webPage != null) {
                    j2.o(tL_webPage);
                }
                h2Var.j = j2Var.c;
                h2Var.c();
                break;
            default:
                h2 h2Var2 = this.b;
                h2Var2.l = null;
                h2Var2.i = true;
                TLRPC.TL_webPage tL_webPage2 = h2Var2.j;
                if (tL_webPage2 != null) {
                    j2.o(tL_webPage2);
                }
                h2Var2.j = j2Var.c;
                h2Var2.c();
                break;
        }
    }
}
