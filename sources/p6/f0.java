package p6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f0 extends y {
    public final IBinder g;
    public final /* synthetic */ d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(d dVar, int i3, IBinder iBinder, Bundle bundle) {
        super(dVar, i3, bundle);
        this.h = dVar;
        this.g = iBinder;
    }

    @Override // p6.y
    public final boolean a() {
        IBinder iBinder = this.g;
        try {
            m.g(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            d dVar = this.h;
            String n4 = dVar.n();
            n nVar = dVar.t;
            if (!n4.equals(interfaceDescriptor)) {
                String n10 = dVar.n();
                StringBuilder sb2 = new StringBuilder(n10.length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb2.append("service descriptor mismatch: ");
                sb2.append(n10);
                sb2.append(" vs. ");
                sb2.append(interfaceDescriptor);
                Log.w("GmsClient", sb2.toString());
                return false;
            }
            IInterface g7 = dVar.g(iBinder);
            if (g7 == null || !(dVar.x(2, 4, g7) || dVar.x(3, 4, g7))) {
                return false;
            }
            dVar.z = null;
            Bundle j10 = dVar.j();
            if (nVar == null) {
                return true;
            }
            ((com.google.android.gms.common.api.k) nVar.a).onConnected(j10);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // p6.y
    public final void b(m6.a aVar) {
        d dVar = this.h;
        n nVar = dVar.u;
        if (nVar != null) {
            ((com.google.android.gms.common.api.l) nVar.a).onConnectionFailed(aVar);
        }
        dVar.t(aVar);
    }
}
