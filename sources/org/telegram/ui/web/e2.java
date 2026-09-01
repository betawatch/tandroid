package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2 b;

    public /* synthetic */ e2(f2 f2Var, int i10) {
        this.a = i10;
        this.b = f2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        h2 h2Var = (h2) obj;
        switch (this.a) {
            case 0:
                f2 f2Var = this.b;
                f2Var.l = null;
                f2Var.i = true;
                TLRPC.TL_webPage tL_webPage = f2Var.j;
                if (tL_webPage != null) {
                    h2.o(tL_webPage);
                }
                f2Var.j = h2Var.c;
                f2Var.c();
                break;
            default:
                f2 f2Var2 = this.b;
                f2Var2.l = null;
                f2Var2.i = true;
                TLRPC.TL_webPage tL_webPage2 = f2Var2.j;
                if (tL_webPage2 != null) {
                    h2.o(tL_webPage2);
                }
                f2Var2.j = h2Var.c;
                f2Var2.c();
                break;
        }
    }
}
