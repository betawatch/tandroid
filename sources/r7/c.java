package r7;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashMap;
import x5.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c {
    public final s7.f a;
    public h b;

    public c(s7.f fVar) {
        new HashMap();
        l.h(fVar);
        this.a = fVar;
    }

    public final void a(int i9) {
        try {
            s7.f fVar = this.a;
            Parcel M0 = fVar.M0();
            M0.writeInt(i9);
            fVar.Q0(M0, 16);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }
}
