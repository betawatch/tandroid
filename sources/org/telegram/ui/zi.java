package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class zi implements org.telegram.messenger.vs {
    public final /* synthetic */ int a;
    public final /* synthetic */ ag.g3 b;
    public final /* synthetic */ un c;
    public final /* synthetic */ un d;

    public zi(un unVar, int i10, ag.g3 g3Var, un unVar2) {
        this.d = unVar;
        this.a = i10;
        this.b = g3Var;
        this.c = unVar2;
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = org.telegram.messenger.at.D;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.a) {
            this.b.run();
            org.telegram.messenger.i0.h3(new i2.a0(this.c, i10, i11, objArr, 10), 50L);
            i12 = ((org.telegram.ui.ActionBar.k2) this.d).currentAccount;
            org.telegram.messenger.at.f(i12).n(this, i13);
        }
    }
}
