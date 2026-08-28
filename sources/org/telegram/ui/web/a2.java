package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ b2 b;

    public /* synthetic */ a2(b2 b2Var, int i9) {
        this.a = i9;
        this.b = b2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        d2 d2Var = (d2) obj;
        switch (this.a) {
            case 0:
                b2 b2Var = this.b;
                b2Var.l = null;
                b2Var.i = true;
                TLRPC.TL_webPage tL_webPage = b2Var.j;
                if (tL_webPage != null) {
                    d2.o(tL_webPage);
                }
                b2Var.j = d2Var.c;
                b2Var.c();
                break;
            default:
                b2 b2Var2 = this.b;
                b2Var2.l = null;
                b2Var2.i = true;
                TLRPC.TL_webPage tL_webPage2 = b2Var2.j;
                if (tL_webPage2 != null) {
                    d2.o(tL_webPage2);
                }
                b2Var2.j = d2Var.c;
                b2Var2.c();
                break;
        }
    }
}
