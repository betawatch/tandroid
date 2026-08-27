package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yk b;

    public /* synthetic */ xk(yk ykVar, int i10) {
        this.a = i10;
        this.b = ykVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ck ckVar = this.b.D.U;
                if (ckVar != null) {
                    ckVar.P0 = false;
                    org.telegram.ui.Components.qf qfVar = ckVar.Q0;
                    if (qfVar != null) {
                        qfVar.v(false);
                        break;
                    }
                }
                break;
            default:
                ck ckVar2 = this.b.D.U;
                if (ckVar2 != null) {
                    ckVar2.H0();
                    break;
                }
                break;
        }
    }
}
