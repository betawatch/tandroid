package org.telegram.ui;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class uk extends org.telegram.ui.Components.bl0 {
    public final /* synthetic */ zn l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk(zn znVar, uj ujVar, xj xjVar) {
        super(ujVar, xjVar);
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
