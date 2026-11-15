package org.telegram.ui.web;

import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class s1 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t1 b;

    public /* synthetic */ s1(t1 t1Var, int i7) {
        this.a = i7;
        this.b = t1Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        v1 v1Var = (v1) obj;
        switch (this.a) {
            case 0:
                t1 t1Var = this.b;
                t1Var.l = null;
                t1Var.i = true;
                TLRPC.TL_webPage tL_webPage = t1Var.j;
                if (tL_webPage != null) {
                    v1.o(tL_webPage);
                }
                t1Var.j = v1Var.c;
                t1Var.c();
                break;
            default:
                t1 t1Var2 = this.b;
                t1Var2.l = null;
                t1Var2.i = true;
                TLRPC.TL_webPage tL_webPage2 = t1Var2.j;
                if (tL_webPage2 != null) {
                    v1.o(tL_webPage2);
                }
                t1Var2.j = v1Var.c;
                t1Var2.c();
                break;
        }
    }
}
