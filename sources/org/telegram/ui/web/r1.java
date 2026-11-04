package org.telegram.ui.web;

import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r1 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s1 b;

    public /* synthetic */ r1(s1 s1Var, int i3) {
        this.a = i3;
        this.b = s1Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        u1 u1Var = (u1) obj;
        switch (this.a) {
            case 0:
                s1 s1Var = this.b;
                s1Var.l = null;
                s1Var.i = true;
                TLRPC.TL_webPage tL_webPage = s1Var.j;
                if (tL_webPage != null) {
                    u1.o(tL_webPage);
                }
                s1Var.j = u1Var.c;
                s1Var.c();
                break;
            default:
                s1 s1Var2 = this.b;
                s1Var2.l = null;
                s1Var2.i = true;
                TLRPC.TL_webPage tL_webPage2 = s1Var2.j;
                if (tL_webPage2 != null) {
                    u1.o(tL_webPage2);
                }
                s1Var2.j = u1Var.c;
                s1Var2.c();
                break;
        }
    }
}
