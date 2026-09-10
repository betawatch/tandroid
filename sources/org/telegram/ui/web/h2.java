package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class h2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ i2 b;

    public /* synthetic */ h2(i2 i2Var, int i10) {
        this.a = i10;
        this.b = i2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        k2 k2Var = (k2) obj;
        switch (this.a) {
            case 0:
                i2 i2Var = this.b;
                i2Var.l = null;
                i2Var.i = true;
                TLRPC.TL_webPage tL_webPage = i2Var.j;
                if (tL_webPage != null) {
                    k2.o(tL_webPage);
                }
                i2Var.j = k2Var.c;
                i2Var.c();
                break;
            default:
                i2 i2Var2 = this.b;
                i2Var2.l = null;
                i2Var2.i = true;
                TLRPC.TL_webPage tL_webPage2 = i2Var2.j;
                if (tL_webPage2 != null) {
                    k2.o(tL_webPage2);
                }
                i2Var2.j = k2Var.c;
                i2Var2.c();
                break;
        }
    }
}
