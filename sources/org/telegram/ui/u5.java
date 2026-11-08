package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u5 implements b60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x5 b;
    public final /* synthetic */ org.telegram.messenger.s2 c;

    public /* synthetic */ u5(x5 x5Var, org.telegram.messenger.s2 s2Var, int i7) {
        this.a = i7;
        this.b = x5Var;
        this.c = s2Var;
    }

    @Override // org.telegram.ui.b60
    public final void a(int i7) {
        switch (this.a) {
            case 0:
                x5 x5Var = this.b;
                org.telegram.messenger.s2 s2Var = this.c;
                if (i7 == 4) {
                    x5Var.d.remove(s2Var);
                    x5Var.Z();
                } else {
                    s2Var.b = i7;
                    org.telegram.messenger.g0.b4(x5Var.b);
                }
                x5Var.getMessagesController().r7.h(x5Var.e, x5Var.d);
                break;
            default:
                this.c.b = i7;
                x5 x5Var2 = this.b;
                x5Var2.getMessagesController().r7.h(x5Var2.e, x5Var2.d);
                org.telegram.messenger.g0.b4(x5Var2.b);
                break;
        }
    }
}
