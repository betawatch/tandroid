// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
