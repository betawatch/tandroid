package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y00 implements org.telegram.messenger.n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x30 b;

    public /* synthetic */ y00(x30 x30Var, int i3) {
        this.a = i3;
        this.b = x30Var;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        switch (this.a) {
            case 0:
                x30 x30Var = this.b;
                if (updates != null) {
                    org.telegram.messenger.hp.s1(x30Var.l1.a).O3(updates, false);
                }
                org.telegram.messenger.g0.h3(new p00(x30Var, 10));
                break;
            default:
                x30 x30Var2 = this.b;
                if (updates == null) {
                    x30Var2.getClass();
                    break;
                } else {
                    org.telegram.messenger.hp.s1(x30Var2.l1.a).O3(updates, false);
                    break;
                }
        }
    }
}
