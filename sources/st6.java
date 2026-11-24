// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class st6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pj4 b;
    public final /* synthetic */ zs6 c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ut6 e;

    public /* synthetic */ st6(ut6 ut6Var, pj4 pj4Var, zs6 zs6Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.e = ut6Var;
        this.b = pj4Var;
        this.c = zs6Var;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.d;
        zs6 zs6Var = this.c;
        ut6 ut6Var = this.e;
        pj4 pj4Var = this.b;
        switch (b) {
            case 0:
                pj4Var.V(ut6Var, zs6Var, arrayList);
                break;
            default:
                pj4Var.V(ut6Var, zs6Var, arrayList);
                break;
        }
    }
}
