package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class sg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kh0 b;

    public /* synthetic */ sg0(kh0 kh0Var, int i10) {
        this.a = i10;
        this.b = kh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                kh0 kh0Var = this.b;
                kh0Var.getClass();
                nh.h.f(false);
                nh.h hVar = kh0Var.h0;
                if (hVar != null) {
                    hVar.b(kh0Var.E);
                }
                org.telegram.messenger.i0.g3(new sg0(kh0Var, 0));
                break;
            case 2:
                nh.h.f(false);
                kh0 kh0Var2 = this.b;
                nh.h hVar2 = kh0Var2.h0;
                if (hVar2 != null) {
                    hVar2.b(kh0Var2.E);
                }
                org.telegram.messenger.i0.g3(new sg0(kh0Var2, 3));
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
