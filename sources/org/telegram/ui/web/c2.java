package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ d2 b;

    public /* synthetic */ c2(d2 d2Var, int i10) {
        this.a = i10;
        this.b = d2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        f2 f2Var = (f2) obj;
        switch (this.a) {
            case 0:
                d2 d2Var = this.b;
                d2Var.l = null;
                d2Var.i = true;
                TLRPC.TL_webPage tL_webPage = d2Var.j;
                if (tL_webPage != null) {
                    f2.o(tL_webPage);
                }
                d2Var.j = f2Var.c;
                d2Var.c();
                break;
            default:
                d2 d2Var2 = this.b;
                d2Var2.l = null;
                d2Var2.i = true;
                TLRPC.TL_webPage tL_webPage2 = d2Var2.j;
                if (tL_webPage2 != null) {
                    f2.o(tL_webPage2);
                }
                d2Var2.j = f2Var.c;
                d2Var2.c();
                break;
        }
    }
}
