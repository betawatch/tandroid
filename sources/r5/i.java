package r5;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.o4;
import com.google.android.gms.internal.cast.v6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class i {
    public final /* synthetic */ c a;

    public i(c cVar) {
        this.a = cVar;
    }

    public final void a() {
        c cVar = this.a;
        q qVar = cVar.e;
        if (qVar == null) {
            return;
        }
        try {
            s5.h hVar = cVar.j;
            if (hVar != null) {
                hVar.u();
            }
            o oVar = (o) qVar;
            Parcel M0 = oVar.M0();
            int i10 = com.google.android.gms.internal.cast.t.a;
            M0.writeInt(0);
            oVar.Q0(M0, 1);
        } catch (RemoteException e) {
            c.m.a(e, "Unable to call %s on %s.", "onConnected", q.class.getSimpleName());
        }
        o4 o4Var = cVar.l;
        if (o4Var != null) {
            c5.j.D(o4Var.a, new v6(new b4.e0(3, 3)));
        }
    }
}
