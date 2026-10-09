package x6;

import ae.x;
import android.os.RemoteException;
import h8.j;
import i8.g;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                    gVar.R0(gVar.N0(), 12);
                    return;
                } catch (RemoteException e7) {
                    throw new x(e7);
                }
            default:
                aa.a aVar2 = this.b.a;
                aVar2.getClass();
                try {
                    g gVar2 = (g) aVar2.c;
                    gVar2.R0(gVar2.N0(), 3);
                    return;
                } catch (RemoteException e10) {
                    throw new x(e10);
                }
        }
    }
}
