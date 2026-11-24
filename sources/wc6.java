// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class wc6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dd6 b;
    public final /* synthetic */ cd6 c;

    public /* synthetic */ wc6(dd6 dd6Var, cd6 cd6Var, byte b) {
        this.a = b;
        this.b = dd6Var;
        this.c = cd6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        cd6 cd6Var = this.c;
        dd6 dd6Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = dd6Var.J;
                arrayList.remove(cd6Var);
                dd6Var.K.l(cd6Var.a);
                if (arrayList.isEmpty()) {
                    dd6.s();
                }
                nm7.e().k(nm7.H4, new Object[0]);
                break;
            case 1:
                ArrayList arrayList2 = dd6Var.J;
                arrayList2.remove(cd6Var);
                dd6Var.K.l(cd6Var.a);
                if (arrayList2.isEmpty()) {
                    dd6.s();
                }
                nm7.e().k(nm7.H4, new Object[0]);
                break;
            default:
                ArrayList arrayList3 = dd6Var.J;
                arrayList3.remove(cd6Var);
                dd6Var.K.l(cd6Var.a);
                if (arrayList3.isEmpty()) {
                    dd6.s();
                }
                nm7.e().k(nm7.H4, new Object[0]);
                break;
        }
    }
}
