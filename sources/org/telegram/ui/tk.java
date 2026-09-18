package org.telegram.ui;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class tk extends org.telegram.ui.Components.zk0 {
    public final /* synthetic */ zn l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk(zn znVar, tj tjVar, wj wjVar) {
        super(tjVar, wjVar);
        this.l = znVar;
    }

    public final void f(int i10) {
        if (this.l.Pa) {
            if (i10 == 0) {
                i10 = 1;
            } else if (i10 == 1) {
                i10 = 0;
            }
        }
        this.b = i10;
    }
}
