package y6;

import a8.h0;
import android.os.RemoteException;
import i8.j;
import j8.g;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class d implements e {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ d(j jVar, int i10) {
        this.a = i10;
        this.b = jVar;
    }

    @Override // y6.e
    public final int a() {
        switch (this.a) {
            case 0:
                return 4;
            default:
                return 5;
        }
    }

    @Override // y6.e
    public final void b() {
        switch (this.a) {
            case 0:
                h0 h0Var = this.b.a;
                h0Var.getClass();
                try {
                    g gVar = (g) h0Var.c;
                    gVar.R0(gVar.N0(), 12);
                    return;
                } catch (RemoteException e) {
                    throw new androidx.car.app.j(e);
                }
            default:
                h0 h0Var2 = this.b.a;
                h0Var2.getClass();
                try {
                    g gVar2 = (g) h0Var2.c;
                    gVar2.R0(gVar2.N0(), 3);
                    return;
                } catch (RemoteException e10) {
                    throw new androidx.car.app.j(e10);
                }
        }
    }
}
