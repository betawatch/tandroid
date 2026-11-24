// default package

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class uyd extends n4d {
    public final IBinder g;
    public final /* synthetic */ gg0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uyd(gg0 gg0Var, int i, IBinder iBinder, Bundle bundle) {
        super(gg0Var, i, bundle);
        this.h = gg0Var;
        this.g = iBinder;
    }

    @Override // n4d
    public final boolean a() {
        IBinder iBinder = this.g;
        try {
            fre.h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            gg0 gg0Var = this.h;
            String l = gg0Var.l();
            ln8 ln8Var = gg0Var.t;
            if (!l.equals(interfaceDescriptor)) {
                String l2 = gg0Var.l();
                StringBuilder sb = new StringBuilder(l2.length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(l2);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.w("GmsClient", sb.toString());
                return false;
            }
            IInterface b = gg0Var.b(iBinder);
            if (b == null || !(gg0Var.y(2, 4, b) || gg0Var.y(3, 4, b))) {
                return false;
            }
            gg0Var.z = null;
            Bundle g = gg0Var.g();
            if (ln8Var == null) {
                return true;
            }
            ((ey4) ln8Var.b).onConnected(g);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // n4d
    public final void b(ds2 ds2Var) {
        gg0 gg0Var = this.h;
        v39 v39Var = gg0Var.u;
        if (v39Var != null) {
            ((fy4) v39Var.b).onConnectionFailed(ds2Var);
        }
        gg0Var.s(ds2Var);
    }
}
