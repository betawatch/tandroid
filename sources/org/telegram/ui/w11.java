package org.telegram.ui;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a21 b;
    public final /* synthetic */ int c;

    public /* synthetic */ w11(a21 a21Var, int i10, int i11) {
        this.a = i11;
        this.b = a21Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a21 a21Var = this.b;
                org.telegram.ui.Components.n91 n91Var = a21Var.n;
                z11 z11Var = a21Var.s;
                int i10 = this.c;
                n91Var.d(i10, z11Var.i(i10));
                break;
            default:
                a21 a21Var2 = this.b;
                org.telegram.ui.Components.n91 n91Var2 = a21Var2.n;
                z11 z11Var2 = a21Var2.s;
                int i11 = this.c;
                n91Var2.d(i11, z11Var2.i(i11));
                break;
        }
    }
}
