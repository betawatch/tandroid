package org.telegram.ui.web;

import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class s1 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t1 b;

    public /* synthetic */ s1(t1 t1Var, int i7) {
        this.a = i7;
        this.b = t1Var;
    }

    @Override // org.telegram.messenger.x10
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
