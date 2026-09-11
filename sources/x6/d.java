package x6;

import android.os.RemoteException;
import h8.j;
import i8.g;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class d implements e {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ d(j jVar, int i10) {
        this.a = i10;
        this.b = jVar;
    }

    @Override // x6.e
    public final int a() {
        switch (this.a) {
            case 0:
                return 4;
            default:
                return 5;
        }
    }

    @Override // x6.e
    public final void b() {
        switch (this.a) {
            case 0:
                aa.a aVar = this.b.a;
                aVar.getClass();
                try {
                    g gVar = (g) aVar.c;
                    gVar.S0(gVar.O0(), 12);
                    return;
                } catch (RemoteException e7) {
                    throw new androidx.car.app.j(e7);
                }
            default:
                aa.a aVar2 = this.b.a;
                aVar2.getClass();
                try {
                    g gVar2 = (g) aVar2.c;
                    gVar2.S0(gVar2.O0(), 3);
                    return;
                } catch (RemoteException e10) {
                    throw new androidx.car.app.j(e10);
                }
        }
    }
}
