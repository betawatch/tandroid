package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ih0 b;

    public /* synthetic */ qg0(ih0 ih0Var, int i10) {
        this.a = i10;
        this.b = ih0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                ih0 ih0Var = this.b;
                ih0Var.getClass();
                nh.h.f(false);
                nh.h hVar = ih0Var.h0;
                if (hVar != null) {
                    hVar.b(ih0Var.E);
                }
                org.telegram.messenger.i0.g3(new qg0(ih0Var, 0));
                break;
            case 2:
                nh.h.f(false);
                ih0 ih0Var2 = this.b;
                nh.h hVar2 = ih0Var2.h0;
                if (hVar2 != null) {
                    hVar2.b(ih0Var2.E);
                }
                org.telegram.messenger.i0.g3(new qg0(ih0Var2, 3));
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
