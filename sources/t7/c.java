package t7;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashMap;
import z5.l;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c {
    public final u7.f a;
    public h b;

    public c(u7.f fVar) {
        new HashMap();
        l.h(fVar);
        this.a = fVar;
    }

    public final void a(int i10) {
        try {
            u7.f fVar = this.a;
            Parcel M0 = fVar.M0();
            M0.writeInt(i10);
            fVar.Q0(M0, 16);
        } catch (RemoteException e10) {
            throw new a6.b(e10);
        }
    }
}
