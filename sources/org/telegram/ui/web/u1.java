package org.telegram.ui.web;

import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class u1 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w1 b;

    public /* synthetic */ u1(w1 w1Var, int i10) {
        this.a = i10;
        this.b = w1Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        y1 y1Var = (y1) obj;
        switch (this.a) {
            case 0:
                w1 w1Var = this.b;
                w1Var.l = null;
                w1Var.i = true;
                TLRPC.TL_webPage tL_webPage = w1Var.j;
                if (tL_webPage != null) {
                    y1.o(tL_webPage);
                }
                w1Var.j = y1Var.c;
                w1Var.c();
                break;
            default:
                w1 w1Var2 = this.b;
                w1Var2.l = null;
                w1Var2.i = true;
                TLRPC.TL_webPage tL_webPage2 = w1Var2.j;
                if (tL_webPage2 != null) {
                    y1.o(tL_webPage2);
                }
                w1Var2.j = y1Var.c;
                w1Var2.c();
                break;
        }
    }
}
