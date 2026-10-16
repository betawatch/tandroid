package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ vg(fo foVar, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = foVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fo foVar = this.b;
                foVar.getClass();
                foVar.presentFragment(fo.W9(this.c.id));
                break;
            default:
                this.b.ra(this.c);
                break;
        }
    }
}
