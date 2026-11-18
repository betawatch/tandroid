package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class u5 implements c60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x5 b;
    public final /* synthetic */ org.telegram.messenger.t2 c;

    public /* synthetic */ u5(x5 x5Var, org.telegram.messenger.t2 t2Var, int i7) {
        this.a = i7;
        this.b = x5Var;
        this.c = t2Var;
    }

    @Override // org.telegram.ui.c60
    public final void a(int i7) {
        switch (this.a) {
            case 0:
                x5 x5Var = this.b;
                org.telegram.messenger.t2 t2Var = this.c;
                if (i7 == 4) {
                    x5Var.d.remove(t2Var);
                    x5Var.Z();
                } else {
                    t2Var.b = i7;
                    org.telegram.messenger.g0.Z3(x5Var.b);
                }
                x5Var.getMessagesController().u7.h(x5Var.e, x5Var.d);
                break;
            default:
                this.c.b = i7;
                x5 x5Var2 = this.b;
                x5Var2.getMessagesController().u7.h(x5Var2.e, x5Var2.d);
                org.telegram.messenger.g0.Z3(x5Var2.b);
                break;
        }
    }
}
