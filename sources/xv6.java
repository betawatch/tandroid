// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class xv6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v34 b;
    public final /* synthetic */ ev6 c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ zv6 e;

    public /* synthetic */ xv6(zv6 zv6Var, v34 v34Var, ev6 ev6Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.e = zv6Var;
        this.b = v34Var;
        this.c = ev6Var;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.d;
        ev6 ev6Var = this.c;
        zv6 zv6Var = this.e;
        v34 v34Var = this.b;
        switch (b) {
            case 0:
                v34Var.P(zv6Var, ev6Var, arrayList);
                break;
            default:
                v34Var.P(zv6Var, ev6Var, arrayList);
                break;
        }
    }
}
