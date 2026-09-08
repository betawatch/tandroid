package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
