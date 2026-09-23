package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class rk extends org.telegram.ui.Components.pk0 {
    public final /* synthetic */ xn l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk(xn xnVar, rj rjVar, uj ujVar) {
        super(rjVar, ujVar);
        this.l = xnVar;
    }

    public final void e(int i10) {
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
