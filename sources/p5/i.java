package p5;

import ag.j2;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.o4;
import com.google.android.gms.internal.cast.w6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
            q5.h hVar = cVar.j;
            if (hVar != null) {
                hVar.u();
            }
            o oVar = (o) qVar;
            Parcel M0 = oVar.M0();
            int i10 = com.google.android.gms.internal.cast.u.a;
            M0.writeInt(0);
            oVar.Q0(M0, 1);
        } catch (RemoteException e10) {
            c.m.a(e10, "Unable to call %s on %s.", "onConnected", q.class.getSimpleName());
        }
        o4 o4Var = cVar.l;
        if (o4Var != null) {
            a5.j.y(o4Var.a, new w6(new j2(3, 4)));
        }
    }
}
