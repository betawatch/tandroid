package x6;

import android.os.RemoteException;
import h8.j;
import i8.g;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                androidx.biometric.e eVar = this.b.a;
                eVar.getClass();
                try {
                    g gVar = (g) eVar.c;
                    gVar.R0(gVar.N0(), 12);
                    return;
                } catch (RemoteException e) {
                    throw new androidx.car.app.j(e);
                }
            default:
                androidx.biometric.e eVar2 = this.b.a;
                eVar2.getClass();
                try {
                    g gVar2 = (g) eVar2.c;
                    gVar2.R0(gVar2.N0(), 3);
                    return;
                } catch (RemoteException e7) {
                    throw new androidx.car.app.j(e7);
                }
        }
    }
}
