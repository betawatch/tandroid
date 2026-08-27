package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ c2 b;

    public /* synthetic */ b2(c2 c2Var, int i10) {
        this.a = i10;
        this.b = c2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        e2 e2Var = (e2) obj;
        switch (this.a) {
            case 0:
                c2 c2Var = this.b;
                c2Var.l = null;
                c2Var.i = true;
                TLRPC.TL_webPage tL_webPage = c2Var.j;
                if (tL_webPage != null) {
                    e2.o(tL_webPage);
                }
                c2Var.j = e2Var.c;
                c2Var.c();
                break;
            default:
                c2 c2Var2 = this.b;
                c2Var2.l = null;
                c2Var2.i = true;
                TLRPC.TL_webPage tL_webPage2 = c2Var2.j;
                if (tL_webPage2 != null) {
                    e2.o(tL_webPage2);
                }
                c2Var2.j = e2Var.c;
                c2Var2.c();
                break;
        }
    }
}
