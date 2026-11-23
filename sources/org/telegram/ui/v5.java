package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class v5 implements c60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y5 b;
    public final /* synthetic */ org.telegram.messenger.t2 c;

    public /* synthetic */ v5(y5 y5Var, org.telegram.messenger.t2 t2Var, int i7) {
        this.a = i7;
        this.b = y5Var;
        this.c = t2Var;
    }

    @Override // org.telegram.ui.c60
    public final void a(int i7) {
        switch (this.a) {
            case 0:
                y5 y5Var = this.b;
                org.telegram.messenger.t2 t2Var = this.c;
                if (i7 == 4) {
                    y5Var.d.remove(t2Var);
                    y5Var.Z();
                } else {
                    t2Var.b = i7;
                    org.telegram.messenger.g0.Z3(y5Var.b);
                }
                y5Var.getMessagesController().u7.h(y5Var.e, y5Var.d);
                break;
            default:
                this.c.b = i7;
                y5 y5Var2 = this.b;
                y5Var2.getMessagesController().u7.h(y5Var2.e, y5Var2.d);
                org.telegram.messenger.g0.Z3(y5Var2.b);
                break;
        }
    }
}
