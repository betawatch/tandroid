package r5;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.n4;
import com.google.android.gms.internal.cast.u6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
            int i10 = com.google.android.gms.internal.cast.s.a;
            M0.writeInt(0);
            oVar.Q0(M0, 1);
        } catch (RemoteException e6) {
            c.m.a(e6, "Unable to call %s on %s.", "onConnected", q.class.getSimpleName());
        }
        n4 n4Var = cVar.l;
        if (n4Var != null) {
            c5.j.D(n4Var.a, new u6(new b4.e0(3, 2)));
        }
    }
}
