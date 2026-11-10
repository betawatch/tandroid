package org.telegram.ui.web;

import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t1 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u1 b;

    public /* synthetic */ t1(u1 u1Var, int i7) {
        this.a = i7;
        this.b = u1Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        w1 w1Var = (w1) obj;
        switch (this.a) {
            case 0:
                u1 u1Var = this.b;
                u1Var.l = null;
                u1Var.i = true;
                TLRPC.TL_webPage tL_webPage = u1Var.j;
                if (tL_webPage != null) {
                    w1.o(tL_webPage);
                }
                u1Var.j = w1Var.c;
                u1Var.c();
                break;
            default:
                u1 u1Var2 = this.b;
                u1Var2.l = null;
                u1Var2.i = true;
                TLRPC.TL_webPage tL_webPage2 = u1Var2.j;
                if (tL_webPage2 != null) {
                    w1.o(tL_webPage2);
                }
                u1Var2.j = w1Var.c;
                u1Var2.c();
                break;
        }
    }
}
