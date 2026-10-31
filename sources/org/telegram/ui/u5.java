package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class u5 implements a70 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x5 b;
    public final /* synthetic */ org.telegram.messenger.w2 c;

    public /* synthetic */ u5(x5 x5Var, org.telegram.messenger.w2 w2Var, int i10) {
        this.a = i10;
        this.b = x5Var;
        this.c = w2Var;
    }

    @Override // org.telegram.ui.a70
    public final void a(int i10) {
        switch (this.a) {
            case 0:
                x5 x5Var = this.b;
                org.telegram.messenger.w2 w2Var = this.c;
                if (i10 == 4) {
                    x5Var.d.remove(w2Var);
                    x5Var.Y();
                } else {
                    w2Var.b = i10;
                    org.telegram.messenger.i0.a4(x5Var.b);
                }
                x5Var.getMessagesController().s7.h(x5Var.e, x5Var.d);
                break;
            default:
                this.c.b = i10;
                x5 x5Var2 = this.b;
                x5Var2.getMessagesController().s7.h(x5Var2.e, x5Var2.d);
                org.telegram.messenger.i0.a4(x5Var2.b);
                break;
        }
    }
}
