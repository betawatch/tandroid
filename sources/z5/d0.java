package z5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d0 extends w {
    public final IBinder g;
    public final /* synthetic */ g h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(g gVar, int i10, IBinder iBinder, Bundle bundle) {
        super(gVar, i10, bundle);
        this.h = gVar;
        this.g = iBinder;
    }

    @Override // z5.w
    public final void a(w5.a aVar) {
        g gVar = this.h;
        m mVar = gVar.G;
        if (mVar != null) {
            ((com.google.android.gms.common.api.l) mVar.a).onConnectionFailed(aVar);
        }
        gVar.z(aVar);
    }

    @Override // z5.w
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
            IInterface q6 = gVar.q(iBinder);
            if (q6 == null || !(g.E(gVar, 2, 4, q6) || g.E(gVar, 3, 4, q6))) {
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
