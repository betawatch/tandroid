// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class zc6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dd6 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ zc6(dd6 dd6Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = dd6Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.c;
        dd6 dd6Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList2 = dd6Var.b;
                arrayList2.addAll(arrayList);
                for (int i = 0; i < arrayList2.size(); i++) {
                    cd6 cd6Var = (cd6) arrayList2.get(i);
                    dd6Var.a.k(cd6Var, cd6Var.a);
                }
                gm.c3(new zc6(dd6Var, arrayList, (byte) 1));
                break;
            default:
                dd6Var.J.addAll(arrayList);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    cd6 cd6Var2 = (cd6) arrayList.get(i2);
                    dd6Var.K.k(cd6Var2, cd6Var2.a);
                }
                dd6.q();
                nm7.e().k(nm7.H4, new Object[0]);
                break;
        }
    }
}
