package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w5 implements v50 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z5 b;
    public final /* synthetic */ org.telegram.messenger.s2 c;

    public /* synthetic */ w5(z5 z5Var, org.telegram.messenger.s2 s2Var, int i3) {
        this.a = i3;
        this.b = z5Var;
        this.c = s2Var;
    }

    @Override // org.telegram.ui.v50
    public final void a(int i3) {
        switch (this.a) {
            case 0:
                z5 z5Var = this.b;
                org.telegram.messenger.s2 s2Var = this.c;
                if (i3 == 4) {
                    z5Var.d.remove(s2Var);
                    z5Var.Z();
                } else {
                    s2Var.b = i3;
                    org.telegram.messenger.g0.b4(z5Var.b);
                }
                z5Var.getMessagesController().r7.h(z5Var.e, z5Var.d);
                break;
            default:
                this.c.b = i3;
                z5 z5Var2 = this.b;
                z5Var2.getMessagesController().r7.h(z5Var2.e, z5Var2.d);
                org.telegram.messenger.g0.b4(z5Var2.b);
                break;
        }
    }
}
