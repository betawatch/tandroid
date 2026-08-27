package s7;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashMap;
import y5.l;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c {
    public final t7.f a;
    public h b;

    public c(t7.f fVar) {
        new HashMap();
        l.h(fVar);
        this.a = fVar;
    }

    public final void a(int i10) {
        try {
            t7.f fVar = this.a;
            Parcel M0 = fVar.M0();
            M0.writeInt(i10);
            fVar.Q0(M0, 16);
        } catch (RemoteException e9) {
            throw new a7.c(e9);
        }
    }
}
