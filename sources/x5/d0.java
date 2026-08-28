package x5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d0 extends w {
    public final IBinder g;
    public final /* synthetic */ g h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(g gVar, int i9, IBinder iBinder, Bundle bundle) {
        super(gVar, i9, bundle);
        this.h = gVar;
        this.g = iBinder;
    }

    @Override // x5.w
    public final void a(u5.a aVar) {
        g gVar = this.h;
        m mVar = gVar.G;
        if (mVar != null) {
            ((com.google.android.gms.common.api.l) mVar.a).onConnectionFailed(aVar);
        }
        gVar.z(aVar);
    }

    @Override // x5.w
    public final boolean b() {
        IBinder iBinder = this.g;
        try {
            l.h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            g gVar = this.h;
            if (!gVar.v().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + gVar.v() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface q10 = gVar.q(iBinder);
            if (q10 == null || !(g.E(gVar, 2, 4, q10) || g.E(gVar, 3, 4, q10))) {
                return false;
            }
            gVar.K = null;
            Bundle s10 = gVar.s();
            m mVar = gVar.F;
            if (mVar == null) {
                return true;
            }
            ((com.google.android.gms.common.api.k) mVar.a).onConnected(s10);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
