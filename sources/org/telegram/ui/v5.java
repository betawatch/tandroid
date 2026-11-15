package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class v5 implements a60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y5 b;
    public final /* synthetic */ org.telegram.messenger.s2 c;

    public /* synthetic */ v5(y5 y5Var, org.telegram.messenger.s2 s2Var, int i7) {
        this.a = i7;
        this.b = y5Var;
        this.c = s2Var;
    }

    @Override // org.telegram.ui.a60
    public final void a(int i7) {
        switch (this.a) {
            case 0:
                y5 y5Var = this.b;
                org.telegram.messenger.s2 s2Var = this.c;
                if (i7 == 4) {
                    y5Var.d.remove(s2Var);
                    y5Var.Z();
                } else {
                    s2Var.b = i7;
                    org.telegram.messenger.g0.a4(y5Var.b);
                }
                y5Var.getMessagesController().s7.h(y5Var.e, y5Var.d);
                break;
            default:
                this.c.b = i7;
                y5 y5Var2 = this.b;
                y5Var2.getMessagesController().s7.h(y5Var2.e, y5Var2.d);
                org.telegram.messenger.g0.a4(y5Var2.b);
                break;
        }
    }
}
