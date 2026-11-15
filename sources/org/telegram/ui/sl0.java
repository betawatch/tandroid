package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class sl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cm0 b;

    public /* synthetic */ sl0(cm0 cm0Var, int i7) {
        this.a = i7;
        this.b = cm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        cm0 cm0Var = this.b;
        switch (i7) {
            case 0:
                if (cm0Var.H) {
                    cm0Var.b.invalidate();
                    break;
                }
                break;
            case 1:
                cm0Var.h();
                break;
            case 2:
                int i10 = cm0.r0;
                cm0Var.h();
                break;
            default:
                int i11 = cm0.r0;
                cm0Var.h();
                break;
        }
    }
}
